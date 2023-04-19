package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
    Kullanıcıdan bir sayı alınız, o sayı pozitif ise ekrana "Pozitif" yazdırın
    değilse "Pezitif değil " yazdırın

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         System.out.print("Sayıyı giriniz: ");
        int num = input.nextInt();



        String result =num>0 ? "Pozitif" : "Pozitif değil";
        System.out.println(result);


    }
}
