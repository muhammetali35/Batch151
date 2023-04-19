package day03scanner;

import java.util.Scanner;

public class Kendiorneklerim2 {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz...");
        int sayi= input.nextInt();

        int sonRakam= sayi%10;
        sayi=sayi/10;
        System.out.println("firstNum = " + sonRakam);

        int secondNum= sayi%10;
        sayi=sayi/10;
        System.out.println("secondNum = " + secondNum);

        int thirthNum= sayi%10;
        sayi=sayi/10;
        System.out.println("thirthNum = " + thirthNum);

        int fourthNum= sayi%10;
        sayi=sayi/10;
        System.out.println("fourthNum = " + fourthNum);

        System.out.println("firstNum+secondNum+thirthNum+fourthNum = " + (int)(sonRakam + secondNum + thirthNum + fourthNum));

       /* Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir cümle  giriniz...");
        String cumle= input.nextLine();
        System.out.println("Lütfen bir harf giriniz.");
        String harf= input.next();
        System.out.println(harf);
        System.out.println(cumle.indexOf(harf));*/

    }
}
