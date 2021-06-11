import java.util.Scanner;
public class MyMethods{
    private static final int DECIMAL = 10;


    public static int larger(int m, int n) {
        if (m > n) {
            return m;
        }
        else {
            return n;
        }
    }

    public static double areaOfCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double areaOfRectangle(double len, double width) {
        double area = len * width;
        return area;
    }

    public static double volumeOfPrism(double len, double width, double height) {
        double volume = areaOfRectangle(len, width) * height;
        return volume;
    }

    public static boolean yearIsLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int daysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        else if (yearIsLeap(year)) {
            return 29;
        }
        else {
            return 28;
        }
    }

    public static int monthStart(int month, int year){
        int firstDayOfYear = (1 + 5 * ((year - 1) % 4) +
                              4 * ((year - 1) % 100)   +
                              6 * ((year - 1) % 400)) % 7;
        int totalDays = 0;
        for (int m = 1; m < month; m++){
            totalDays += daysInMonth(m, year);
        }
        return (totalDays + firstDayOfYear) % 7;
    }

    public static String monthName(int month, int year){
        String title  = "";

        switch(month){
            case 1 : title = "January"; break;
            case 2 : title = "February"; break;
            case 3 : title = "March"; break;
            case 4 : title = "April"; break;
            case 5 : title = "May"; break;
            case 6 : title = "June"; break;
            case 7 : title = "July"; break;
            case 8 : title = "August"; break;
            case 9 : title = "September"; break;
            case 10: title = "October"; break;
            case 11: title = "November"; break;
            case 12: title = "December"; break;
            default: return "Unknown Month";
        }
        title = title + " " + year;
        return title;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
    }

}