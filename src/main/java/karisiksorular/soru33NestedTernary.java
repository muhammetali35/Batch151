package karisiksorular;

import java.util.Scanner;

public class soru33NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayı 3 basamaklı ise "uc basamaklı sayı" yoksa
        uc basamaklı sayı değil" yazdırın

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a three-digit number, please...");
        int num= input.nextInt();



        String result=(num>99 && num<1000)? "3 basamaklı sayı" :"3 basamaklı sayı değil";
        System.out.println(result);






    }
}
