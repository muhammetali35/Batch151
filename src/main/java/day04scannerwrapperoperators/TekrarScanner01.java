package day04scannerwrapperoperators;

import java.util.Scanner;

public class TekrarScanner01 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        //rakamların toplamını yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı dayı giriniz.");
        int number= input.nextInt();

        int lastDigit =number%10;// son rakam
        number= number/10;

        int lastSecond= number%10;
        number=number/10;

        int lastThird= number%10;
        number=number/10;

        int lastFourth= number%10;
        number=number/10;

        int lastFifty= number%10;
        number=number/10;

        System.out.println("sondan beşinci(yani ilk) rakam : " + lastFifty+"sondan dördüncü(yani ikinci )rakam :"+lastFourth+"Son rakam = " + lastDigit+"sondan ikinci rakam "+lastSecond);




    }
}
