package karisiksorular;

import java.util.Scanner;

public class KdvSorusu {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir tutar giriniz...");
        double tutar= input.nextDouble();

        if(tutar>0 && tutar<500 ){
            double kdvsi= tutar*0.18;
            System.out.println("Kdv si: "+kdvsi);
            System.out.println("Kdv dahil toplam tutar: "+(kdvsi+tutar));
        } else if (tutar>=500) {
            double kdvSekiz= tutar*0.08;
            System.out.println("Kdv si %8 den hesaplanır"+kdvSekiz );
            System.out.println("Kdv dahil toplam tutar:"+(kdvSekiz+tutar));

        }


    }
}
