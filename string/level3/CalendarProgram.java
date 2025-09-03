import java.util.Scanner;

public class CalendarProgram {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }

    // Method to calculate first day of month using Gregorian calendar
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;  // Day of week (0=Sun, 1=Mon,...)
        return d0;
    }

    // Method to print calendar
    public static void printCalendar(int month, int year) {
        // Print header
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int numberOfDays = getNumberOfDays(month, year);

        // Print spaces for the first line
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}
