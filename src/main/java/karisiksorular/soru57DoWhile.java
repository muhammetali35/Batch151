package karisiksorular;

import java.util.Scanner;

public class soru57DoWhile {
    public static void main(String[] args) {
        /*
        Kullanıcıdan toplamak için sayı isteyin ve toplam 500'e ulaşıncaya kadar devam
        istemeyi ettirin. Toplam 500'e ulaştığında veya geçtiğinde toplamı ve kaç sayı
        girildiğini yazdırın
         */

        Scanner input= new Scanner(System.in);

        int count=0;
        int toplam=0;
        while (toplam<500){
            System.out.println("Lütfen bir sayı giriniz: ");
            int num= input.nextInt();
            toplam+=num;
            count++;
            }
        System.out.println(count+" adet sayı girdiniz");
        System.out.printf("Girilen sayıların toplamı: "+toplam);
        }}

