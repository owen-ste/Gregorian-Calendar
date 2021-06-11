import java.util.Calendar;
public class MyCalendar {
    public static boolean isANUMBER(String s){
        boolean result = true;
        for (int i = 0; i < s.length() && result == true; i++){
            result = Character.isDigit(s.charAt(i));
        }
        return result;
    }
    public static void main(String[] args){

        boolean goAhead = true;

        Calendar now = Calendar.getInstance();
        int year  = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;

        if (args.length == 1){
            if (isANUMBER(args[0]) && Integer.parseInt(args[0]) >= 1 && Integer.parseInt(args[0]) <= 12){
                month = Integer.parseInt(args[0]);
            }
            else{
                goAhead = false;
                System.out.println("Invalid Entry for Month or Year");
            }
        }

        else if (args.length == 2){
            if (isANUMBER(args[0]) && Integer.parseInt(args[0]) >= 1 && Integer.parseInt(args[0]) <= 12 && isANUMBER(args[1]) && Integer.parseInt(args[1]) >= 1753){
                month = Integer.parseInt(args[0]);
                year = Integer.parseInt(args[1]);
            }
            else{
                goAhead = false;
                System.out.println("Invalid Entry for Month or Year");
            }
        }

        else if (args.length > 2) {
            goAhead = false;
            System.out.println("Usage: java MyCalendar <month> <year>");
        }


        if (year <= 1752) {
            System.out.println("ERROR YEAR TO EARLY"); } // year won't go below 1752 Georgian calendar switch to Julian

        if (goAhead){
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
}
