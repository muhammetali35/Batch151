package karisiksorular;

import java.util.Scanner;

public class basitHesapMakinasi {
    public static void main(String[] args) {
        /*
        #Proje Konusu
#Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri
yapabilen bir hesap makinesi yapınız.
Bonus Geliştirme
Yaptığınız hesap makinesini eğer Switch-Case ile yaptıysanız If blokları ile
, eğer If blokları ile yaptıysanız Switch-Case ile tekrar yapınız.
         */
        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen birinci sayıyı giriniz 1: ");
        int sayi1= input.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz 2: ");
        int sayi2= input.nextInt();

        System.out.println("İşlem seçiniz");
        System.out.println("Toplama: 1");
        System.out.println("Çıkarma: 2");
        System.out.println("Çarpma: 3");
        System.out.println("Bölme: 4");

        byte select= input.nextByte();

        if(select==1){
            System.out.println("Sonuç "+sayi1 +"+"+ sayi2+"="+(sayi1+sayi2));
        }else if(select==2){
            System.out.println("Sonuç "+sayi1 +"-"+ sayi2+"="+(sayi1-sayi2));
        }else if(select==3){
            System.out.println("Sonuç "+sayi1 +"*"+ sayi2+"="+(sayi1*sayi2));

        }else if (select==4){
            if(sayi2==0){
                System.out.println("Bölen sayı olamaz !");
            }else {
                System.out.println("Sonuç "+sayi1 + "/" + sayi2 + "=" + (sayi1 /(double) sayi2));
            } }else {
            System.out.println("You have entered invalid, please try again");
        }
/*
        Swicth ile

        double sonuc=0.0;

        switch (select){
            case 1:
                sonuc=sayi1+sayi2;
                break;
            case 2:
                sonuc=sayi1-sayi2;
                break;
            case 3:
                sonuc=sayi1*sayi2;
                break;
            case 4:
                if (sayi2==0){
                    System.out.println("İkinci sayı sıfır olamaz");
                }else {
                    sonuc = sayi1 / (double) sayi2;
                    break;
                } default:
                System.out.println("Hatalı girşi yaptınız");
        }

*/

    }
}
