package karisiksorular;

import java.util.Scanner;

public class soru24Nestedifstatement {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 4 basamaklı bir sayı girmesini isteyin.Girdiği sayi 5'e bölünüyorsa
        son rakamını kontrol edin.Son rakamı 0 ise ekrana "5'e bölünen çift sayı" yazdırın
        Son rakamı 0 değilse ise "5'e bölünen tek sayı" yazdırın.
        Girdiği password 5'e bölünmüyorsa ekrana "Tekra deneyin" yazdırın

         */
        Scanner input= new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi= input.nextInt();

        if(sayi%5==0){
           if(sayi%10==0){
               System.out.println("5'e bölünen çift sayı");
            }else {
               System.out.println("5'e bölünen tek sayı");
           }
        }
        if(sayi%5!=0){
            if(sayi%10==0){
                System.out.println("5'e bölünen tek sayı");
            }else {
                System.out.println("Tekrar deneyiniz");
            }
        }











    }}

