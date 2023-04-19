package karisiksorular;

import java.util.Scanner;

public class harmonikSerininiBulma {
    public static void main(String[] args) {
        //Proje Konusu
        //#Java ile girilen sayının harmonik serisini bulan programı yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Harmonik serisi olacak sayıyı giriniz: ");
        int harmo= input.nextInt();
        double toplam=0;

        for (int i= 1; i<=harmo; i++){

            toplam=toplam+(1.0/i);

        }System.out.print(toplam);






    }
}
