package practices;

import java.util.Scanner;

public class ifElse01 {
    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.println("İkinci sayıyı girniz: ");
        int sayi2 = scan.nextInt();

        //1.Way if else
        if(sayi1>sayi2){
            System.out.println("ilk sayı ikinci sayıdan büyüktür.");
        }else if (sayi1<sayi2){
            System.out.println("ilk sayı ikinci sayıdan küçüktür.");
        }else{
            System.out.println("İki sayı birbirine eşittir.");
        }

        //2.Way ternary

       String result= sayi1>sayi2 ?   "İlk sayı büyüktür" : sayi1 == sayi2 ? "İkinci daha sayı büyüktür." : "İki sayı eşittir.";
        System.out.println(result);




    }
}
