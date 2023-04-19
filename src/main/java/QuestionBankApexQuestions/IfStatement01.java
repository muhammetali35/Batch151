package QuestionBankApexQuestions;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        1) Type code to print
 a) "Winter" for December, January, February
 b) "Spring" for March, April, May
 c) "Summer" for June, July, August
 d) "Fall" for September, October, November
 e) "Invalid month name" for all the others
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a month,please... ");
        String month= input.nextLine().toLowerCase();

    boolean winter=month.equalsIgnoreCase("December")|| month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("Fabruary");
    boolean spring=month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May");
    boolean summer=month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August");
    boolean fall=month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November");
        if(winter){
            System.out.println("Winter");
        } else if (spring) {
            System.out.println("Spring");
        } else if (summer) {
            System.out.println("Summer");
        } else if (fall) {
            System.out.println("Fall");
        }else {
            System.out.println("İnvalid month name");
        }


    }
}
