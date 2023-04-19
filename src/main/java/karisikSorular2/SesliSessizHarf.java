package karisikSorular2;

import java.util.Scanner;

public class SesliSessizHarf {
    public static void main(String[] args) {
        //Kullanıcıdan harf al sesli mi sessiz harfmi yazdır . Harf değilse uyarı ver

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter, please ");
       char s= input.next().toLowerCase().charAt(0);

if(Character.isLetter(s)){
        if(s=='a' || s=='e' ||s=='ı' ||s=='i' ||s=='o' ||s=='ö' ||s=='u' ||s=='ü' ){
            System.out.println("Sesli harf");
        } else if (!(s=='a' || s=='e' ||s=='ı' ||s=='i' ||s=='o' ||s=='ö' ||s=='u' ||s=='ü') ) {
            System.out.println("Sessiz harf");

        }
}else {
    System.out.println("Tekrar Deneyiniz");


    }
}}
