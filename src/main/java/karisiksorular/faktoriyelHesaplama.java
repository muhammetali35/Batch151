package karisiksorular;

import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcını girdiği değerin faktöriyelini hesaplayan programı yazın.

Örnek Çıktı
Faktöriyel Sayısı : 3
Sonuç : 6
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Tamsayı bir değer giriniz.");
        int sayi= input.nextInt();

        //For loop ile
        int faktoriyel=1;
        for(int i=1; i<=sayi; i++){
            faktoriyel=faktoriyel*i;

        }
        System.out.println("Sonuç : "+faktoriyel);

        //While loop ile
        int faktoriyel1=1;
        int i=1;
        while (i<=sayi){
            faktoriyel1=faktoriyel1*i;
            i++;
        } System.out.println("While loop sonuç: "+faktoriyel1);




    }
}
