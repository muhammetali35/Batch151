package karisiksorular;

import java.util.Scanner;

public class soru39SwitchStatement {
    public static void main(String[] args) {
        //Not: Switch de long, double, float ve boolean kullanılmaz.
        //Kullanıcıdan gun ismini alıp haftaiçi veya haftasonu yazdıralım.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the name of the day ,please... ");
        String nameOfDay= input.next().toLowerCase();

        switch (nameOfDay){
            case "sunday", "saturday":
                System.out.println("Weekend");
                break;
            case "monday", "tuesday","wednesday","thuesday","friday":
                System.out.println("Weekday");
                break;
            default:
                System.out.println("You have entered invalid");
        }


    }
}
