package karisiksorular;

import java.util.Scanner;

public class forEbob {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");
        int sayi1= input.nextInt();

        System.out.println("İkinci sayıyı giriniz.");
        int sayi2= input.nextInt();

        int ebob=1;

        for(int i=1; i<=sayi1 && i<= sayi2; i++){
            if(sayi1%i==0 && sayi2%i==0 ){
                ebob=i;

            }
        }
        System.out.println(sayi1+" ile "+ sayi2+" sayılarının EBOB'u: "+ebob);
    }
}
