package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        //rakamların toplamını yazdıran kodu yazınız.

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz...");
        int number= input.nextInt();

        // Bir sayının son rakamını alabilmek için o sayıyı 10'a bölüp kalanı almalıyız.
        // % ==> modulus operator solunda bulunda sayının sağında bulunan sayıya bölümğnden kalanı verir.
        // dolayısıyla %10 her zaman birler basamağında bulunan sayıyı verir.
        //bir tamsayıyı bir tamsayıya bölerseniz java sonucu kesinlikle bir tamsayı yapar
        //Java bu durumda yuvarlama yapmaz ondalıklı kısmı iptal eder yani siler.
        // Dolayısıyla bir tam sayıyı 10 bölersek birler basamağını silmiş oluruz.

        //son rakami al
        int lastDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan ucunucu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit =  number%10;
        //sayi kucult
        number = number/10;

        //sondan besinci rakami al
        int lastFifithDigit = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifithDigit);



    }
}
