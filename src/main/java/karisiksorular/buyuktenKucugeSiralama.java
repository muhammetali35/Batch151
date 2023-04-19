package karisiksorular;

import java.util.Scanner;

public class buyuktenKucugeSiralama {
    public static void main(String[] args) {
       //Proje Konusu
        //#Java ile kullanıcının girdiği 3 sayıyı büyükten küçüğe sıralayan programı yazınız.
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı 1= ");
        int sayi1= input.nextInt();
        System.out.print("Sayı 2= ");
        int sayi2= input.nextInt();
        System.out.print("Sayı 3= ");
        int sayi3= input.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            if(sayi2>sayi3){
                System.out.println(sayi1+">"+sayi2+">"+sayi3);
            }else {
                System.out.println(sayi1+">"+sayi3+">"+sayi2);
            }
        }else if(sayi2>sayi1 && sayi2>sayi3){
            if(sayi1>sayi3){
                System.out.println(sayi2+">"+sayi1+">"+sayi3);
            }else {
                System.out.println(sayi2+">"+sayi3+">"+sayi1);
            }
        }else if(sayi3>sayi1 && sayi3>sayi2){
            if(sayi1>sayi2){
                System.out.println(sayi3+">"+sayi1+">"+sayi2);
            }else {
                System.out.println(sayi3+">"+sayi2+">"+sayi1);
            }
        }





    }
}
