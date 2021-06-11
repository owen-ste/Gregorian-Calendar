import java.util.Calendar;
public class MyCalendar {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
        int year  = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;

        if (year <= 1752) {
            System.out.println("ERROR YEAR TO EARLY"); } // year won't go below 1752 Georgian calendar switch to Julian


        int FirstDayOfMonth = MyMethods.monthStart(month,year);
        int days = MyMethods.daysInMonth(month,year);

        System.out.println("=".repeat(20));
        String title = MyMethods.monthName(month, year);
        for (int i = 0; i < (20  - title.length()) /2; i++){
            System.out.print(" ");
        }

        System.out.println(MyMethods.monthName(month, year));
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i =1; i <= FirstDayOfMonth; i++){
            System.out.print("   ");
        }
        for (int day =1; day <= days; day++) {

            if (day < 10){
                System.out.print(" ");
            }
            System.out.print(day + " ");

            if ((day + FirstDayOfMonth) % 7 ==0) {
                System.out.println();

            }
        }
        System.out.println("\n" + "=".repeat(20));
    }
}
