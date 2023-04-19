package day14Loops01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Loops04tekrar {
    // Kullanıcı username ve password'u girsin
    //3 kereden fazla girerse "Your account was blocked"mesajı alsın
    // 3 Kereye kadar yanlış girerse ""Invalid username or password, try again" mesajı alsın
    // Doğru girerse "Welcome to your account"mesajı alsın
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int girisSayisi=0;

        String validUserName="Muhammet123";
        String validPassWord="Mhmmt11!!?";

        do{
            if(girisSayisi>3){
                System.out.println("Hesabınız bloke oldu");
                break;
            }

            System.out.println("Username giriniz");
            String userName= input.next();
            System.out.println("Password giriniz");
            String password= input.next();

            girisSayisi++;

            if(userName.equals(validUserName) && password.equals(validPassWord)){
                System.out.println("Hesabınıza hoş geldiniz ");
                break;

            }else{
                System.out.println("Lütfen tekrar deneyiniz ");
                System.out.println("Kalan hakkınız "+(3-girisSayisi));

            }

        }while(true);



    }
}
