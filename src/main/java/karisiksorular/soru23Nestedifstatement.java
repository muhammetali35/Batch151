package karisiksorular;

import java.util.Scanner;

public class soru23Nestedifstatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir şifre girmesini isteyin
        Eğer ilk harf buyuk ise "A" olup olmadığını kontrol edin. İlk harf A ise "Geçerli şifre"
        değilse "Geçersiz şifre" yazdırın.

        Eğer ilk harf küçük harf ise "Z" olup olmadığını kontrol edin.İlk harf z ise
        "Geçerli şifre" değilse "Geçersiz şifre"yazdırın

         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd= input.next();

        if(Character.isUpperCase(pwd.charAt(0))){
            if(pwd.charAt(0)=='A'){
                System.out.println("Geçerli şifre");
            }else {
                System.out.println("Geçersiz şifre");
            }
        }
        if(Character.isLowerCase(pwd.charAt(0))){
            if(pwd.charAt(0)=='z'){
                System.out.println("Geçerli şifre");
            }else {
                System.out.println("Geçersiz şifre");
            }
        }





    }
}
