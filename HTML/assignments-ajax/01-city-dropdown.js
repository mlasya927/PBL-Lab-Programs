/*
  In the real assignment this data comes from a Java Servlet
  (static list defined in the servlet, called via AJAX/XMLHttpRequest).
  Here it's simulated with a JS object + setTimeout to mimic server latency.
  See ServletReference.java in this folder for the servlet-side code.
*/
const cityData = {
  "Andhra Pradesh": ["Vijayawada", "Visakhapatnam", "Guntur", "Tirupati"],
  "Telangana": ["Hyderabad", "Warangal", "Karimnagar", "Nizamabad"],
  "Karnataka": ["Bengaluru", "Mysuru", "Mangaluru", "Hubballi"],
  "Tamil Nadu": ["Chennai", "Coimbatore", "Madurai", "Salem"],
  "Maharashtra": ["Mumbai", "Pune", "Nagpur", "Nashik"]
};

// Simulated AJAX call to servlet: GET /CityServlet?state=XYZ
function ajaxGetCities(state, callback) {
  setTimeout(function () {
    callback(cityData[state] || []);
  }, 300); // simulate network delay
}

function loadCities() {
  const state = document.getElementById("stateSelect").value;
  const table = document.getElementById("cityTable");
  const tbody = document.getElementById("cityTableBody");
  tbody.innerHTML = "";

  if (state === "") {
    table.style.display = "none";
    return;
  }

  ajaxGetCities(state, function (cities) {
    cities.forEach(function (city) {
      const tr = document.createElement("tr");
      const td = document.createElement("td");
      td.textContent = city;
      tr.appendChild(td);
      tbody.appendChild(tr);
    });
    table.style.display = cities.length ? "table" : "none";
  });
}
