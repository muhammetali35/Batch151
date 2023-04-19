package karisiksorular;

import java.util.Scanner;

public class soru34ifelsestatement {
    public static void main(String[] args) {
        //afour digit number ABCD is called Lucky  if A+B=C+D


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number, please...");
        int num = input.nextInt();



        if (!(num > 999 && num<10000)) {
            System.out.println(num + " is not a four-digit number");

        } else {
            int r1 = num % 10;
            num = num / 10;
            int r2 = num % 10;
            num = num / 10;
            int r3 = num % 10;
            num = num / 10;
            int r4 = num % 10;
            num = num / 10;

            if (r1 + r2 == r3 + r4) {
                System.out.println("The number is lucky");
            } else {
                System.out.println("The number is not lucky");
            }


        }
    }
}