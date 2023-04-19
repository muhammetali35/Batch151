package QuestionBankApexQuestions;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {
        /*
        6) Type code to create a converter which converts mile to km, second to hour, fahrenheit to
celsius. Find the formulas for conversions from Google.
 a) When user entered 10 and mileToKm String, your code should print "16 km"(The
 number will be dynamic) on the console
 b) When user entered 7200 and secondsToHours String, your code should print "2
 Hours"(The number will be dynamic) on the console
 c) When user entered 83 and fahrenheitToCelsius String, your code should print
 "28.3333 celsius"(The number will be dynamic) on the console
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Hangi çeviriyi yapmak istiyorsunuz? \n 1) Second to hour \n 2)Mil to km \n 3)Fahrenheit to celcius ");

        int con=input.nextInt();

        if(con==1){
            System.out.println("Second giriniz: ");
            double sec=input.nextDouble();
            System.out.println(sec/60+" hour");

        } else if (con==2) {
            System.out.println("Mil giriniz: ");
            double mil=input.nextDouble();
            System.out.println(mil/0.62137+" km");

        } else if (con==3) {
            System.out.println("Fahrenheit giriniz: ");
            double fah=input.nextDouble();
            System.out.println((fah-32)/1.8000+" celsius");

        }else{
            System.out.println("Invalid input please try again");
        }


    }
}
