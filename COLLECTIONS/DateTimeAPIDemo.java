import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPIDemo {
    public static void main(String[] args) {

        // ---------- Assignment 1 ----------
        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);
        System.out.println("Assignment 1 -> Today: " + today);
        System.out.println("Assignment 1 -> After 10 days: " + afterTenDays);

        // ---------- Assignment 2: second Sunday of next month ----------
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate firstSunday = nextMonth.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);
        System.out.println("\nAssignment 2 -> Second Sunday of next month: " + secondSunday);

        // ---------- Assignment 3: experience in Wipro ----------
        // NOTE: change joiningDate to your actual joining date
        LocalDate joiningDate = LocalDate.of(2025, 1, 15);
        Period experience = Period.between(joiningDate, today);
        System.out.println("\nAssignment 3 -> Experience: " + experience.getYears() + " years, "
                + experience.getMonths() + " months, " + experience.getDays() + " days");

        // ---------- Assignment 4: leap year check ----------
        int year = today.getYear();
        boolean isLeap = today.isLeapYear();
        System.out.println("\nAssignment 4 -> Is " + year + " a leap year? " + isLeap);

        // ---------- Assignment 5 ----------
        LocalTime now = LocalTime.now();
        LocalTime after25min = now.plusMinutes(25);
        System.out.println("\nAssignment 5 -> Current time: " + now);
        System.out.println("Assignment 5 -> After 25 minutes: " + after25min);

        // ---------- Assignment 6 ----------
        LocalTime before5h30m = now.minusHours(5).minusMinutes(30);
        System.out.println("\nAssignment 6 -> Current time: " + now);
        System.out.println("Assignment 6 -> Before 5 hours 30 minutes: " + before5h30m);
    }
}
