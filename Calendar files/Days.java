import java.util.Scanner;
public class Days{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int firstDayOfYear = 5;
        int firstDayOfMonth = -1;
        int totalDays = 0;

        int year = -1;
        int month = -1;

        System.out.print("Year: ");
        year = keyboard.nextInt();

        System.out.print("Month: ");
        month = keyboard.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
            month == 10 || month == 12) {
            System.out.println(31);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        }
        else {
            if (year % 400 == 0) {
                System.out.println(29);   ;
            }
            else if (year % 100 == 0) {
                System.out.println(28);
            }
            else if (year % 4 == 0) {
                System.out.println(29);
            }
            else {
                System.out.println(28);
            }
        }

        for (int m=1;m<month;m++){
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 ||
                m == 10 || m == 12){
                    totalDays += 31;
                }
            else if (m == 4 || m == 6 || m == 9 || m == 11){
                totalDays += 30;
            }
            else{
                if (year % 400 == 0) {
                    totalDays += 29;
                }
                else if (year % 100 == 0) {
                    totalDays += 28;
                }
                else if (year % 4 == 0) {
                    totalDays += 29;
                }
                else {
                    totalDays += 28;
                }
            }
        }
        System.out.println(totalDays);
    }
}