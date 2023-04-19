package karisiksorular;

import java.util.Scanner;

public class soru29TernaryOperator {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın. Sayı pozitifse "Sayı pozitif" yazdırın, negatifse
        //sayının karesini yazdırın.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number, please...");
        int num= input.nextInt();

        String result= (num>0)? "The number is positive" : String.valueOf(num*num);
        System.out.println("Result: "+result);
    }
}
