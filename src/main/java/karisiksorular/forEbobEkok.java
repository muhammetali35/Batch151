package karisiksorular;

import java.util.Scanner;

public class forEbobEkok {
    public static void main(String[] args) {

     //Ekok bir sayı grubundan sayıları ortak katların en küçüğü
     //Ebob ise bu sayıları bölen en büyük sayı
     //ekok= (s1*s2)/ ebob

        Scanner input= new Scanner(System.in);
        int ekok;
        int ebob= 1;

        System.out.println("İlk sayıyı giriniz.");
        int sayi1= input.nextInt();

        System.out.println("İkinci sayıyı giriniz.");
        int sayi2= input.nextInt();


        ebob = 1;

        int min= Math.min(sayi1, sayi2);

        for (int i=min; i>0 ; i--){
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
                break;

            }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println(sayi1+" ve "+ sayi2+" sayılarının EKOK'u: "+ekok);
        System.out.println(sayi1+" ve "+ sayi2+" sayılarının EBOB'u: "+ebob);



    }
}
