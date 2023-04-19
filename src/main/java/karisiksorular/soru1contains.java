package karisiksorular;

import java.util.Scanner;

public class soru1contains {
    public static void main(String[] args) {
        //Kullanıcıdan email adresini girmeisini isteyin, mail "@gmail.com" içermiyorsa
        //"lutfen gmail adresinizi giriniz", @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        // @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin.

        //muhammet35@gmail.com
        //muhammet35@ıcloud.com
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen a-mail adresinizi giriniz...");
        String aMail= input.nextLine();

        if(aMail.contains("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen gmail adresinizi giriniz");
        }


    }
}
