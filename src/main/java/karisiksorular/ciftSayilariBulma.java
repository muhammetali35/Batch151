package karisiksorular;

import java.util.Scanner;

public class ciftSayilariBulma {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.

Bonus Geliştirme
Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number,please...");
        int num= input.nextInt();

        // çift sayılar
        for(int i=1; i<=num; i++){
                if(i%2==0){
                    System.out.print("Çift sayılar "+i+" ");
                }

        }
        System.out.println();
        // 4 ve 5 bölünenilen
        for(int i=1; i<=num; i++){
            if(i%4==0 && i%5==0){
                System.out.println("4 ve 5 e bölünebilenler "+i+" ");
            }
        }




    }
}
