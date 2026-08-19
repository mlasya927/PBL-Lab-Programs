/*
  Simulated backend "database" (XYZ_PROFILE table) with a pre-seeded
  email so you can test the "Not Available!" case.
  Fields per spec: EMAIL, PASSWORD, NAME, DATEOFBIRTH, GENDER, CITY, PINCODE, MOBILE
  Check is case-insensitive as required.
*/
const mockProfileDB = [
  { email: "test@xyz.com", password: "Test@123", name: "Test User",
    dateOfBirth: "1995-01-01", gender: "Male", city: "Hyderabad",
    pincode: "500001", mobile: "9999999999" }
];

const emailPattern = /^[^@\s]+@[^@\s]+\.[^@\s]+$/;

// Simulated AJAX call: performs the check irrespective of uppercase/lowercase
function ajaxCheckEmailAvailability(email, callback) {
  setTimeout(function () {
    const found = mockProfileDB.some(function (p) {
      return p.email.toLowerCase() === email.toLowerCase();
    });
    callback(found);
  }, 300);
}

function checkAvailability() {
  const email = document.getElementById("email").value.trim();
  const statusDiv = document.getElementById("emailStatus");
  statusDiv.className = "msg";
  statusDiv.textContent = "";

  if (email === "") return;

  if (!emailPattern.test(email)) {
    statusDiv.textContent = "Invalid Email Id";
    statusDiv.classList.add("invalid");
    return;
  }

  // perform the check when the textbox loses focus
  ajaxCheckEmailAvailability(email, function (exists) {
    if (exists) {
      statusDiv.textContent = "Not Available!";
      statusDiv.classList.add("not-available");
    } else {
      statusDiv.textContent = "Available!";
      statusDiv.classList.add("available");
    }
  });
}
