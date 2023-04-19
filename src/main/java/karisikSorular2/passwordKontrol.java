package karisikSorular2;

import java.util.Scanner;

public class passwordKontrol {
    /*
        . Bir dizenin geçerli bir parola olup olmadığını kontrol etmek için bir Java yöntemi yazın. Editöre gidin
    Şifre kuralları:
    Bir şifre en az on karakter içermelidir.
    Parola yalnızca harf ve rakamlardan oluşur.
    Bir şifre en az iki rakam içermelidir.

    Beklenen çıktı:

    1. Parola en az sekiz karakterden oluşmalıdır.
    2. Parola yalnızca harf ve rakamlardan oluşur.
    3. Bir şifre en az iki rakam içermelidir
    Bir şifre girin (Yukarıdaki Hüküm ve Koşulları kabul ediyorsunuz.): abcd1234
    Şifre geçerli: abcd1234
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Parola giriniz: ");
        String password = input.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Parola geçerli.");

        }else{
            System.out.println("Parola geçersiz");
        }
    }
    public static boolean isValidPassword(String password){

        if(password.length()<10){
            return false;
    }
        int digitCount=0;
        for(int i=0; i<password.length(); i++){
            char c = password.charAt(i);

        if (!Character.isLetterOrDigit(c)){//Parola yaknızca harf ve rakamlardan oluşabilir.
            return false;
        }
        if(Character.isDigit(c)){//Rakam sayısını artırıyoruz
            digitCount++;

        }

        }
        //En az 2 rakam içermesi gerektiğini kontrol ediyoruz.
        if(digitCount < 2){
            return false;
        }
        //Yukarıdaki koşullar sağlanıyorsa, parola geçerlidir.
        return true;
    }
}
