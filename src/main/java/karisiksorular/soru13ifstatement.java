package karisiksorular;

import java.util.Scanner;

public class soru13ifstatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gün isimlerinden birinin ilk harfini isteyin ve
        o harfle başlayan gun isimlerini yazdırın.
        orn: ilkHarf= p output= "Pazar Pazartesi veya Perşembe"
        ilkHarf= S output="Salı"

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the initials of one of the names of the day");
        String firstWord= input.next().toUpperCase();

        if(firstWord.equals("P") ){
            System.out.println("Pazar, pazartesi, perşembe");
        }
        if(firstWord.equals("S")){
            System.out.println("Salı");

        }
        if(firstWord.equals("Ç")){
            System.out.println("Çarsamba");

        }
        if(firstWord.equals("C")){
            System.out.println("Cuma veya cumartesi");

        }






    }
}
