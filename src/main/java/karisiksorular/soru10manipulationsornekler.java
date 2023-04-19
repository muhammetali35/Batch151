package karisiksorular;

import java.util.Scanner;

public class soru10manipulationsornekler {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir password girmesini isteyin.Aşağıdaki şartları sağlıyorsa "Şifre
         başarı ile tamamlandı" şartları sağlamıyorsa "İşlem başarısız, Lütfen yeni bir şifre girin"
         yazdırın
         -İlk Harf büyük olmalı
         -Son harf kucuk olmalı
         -Şifre bosluk içermemeli
         -Şifre uzunluğu en az 8 karakter olmalı
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password, please...");
        String pwd = input.nextLine();
        if (pwd.length() >= 8 && !pwd.contains(" ") &&
                Character.isUpperCase(pwd.charAt(0)) &&
                Character.isLowerCase((pwd.charAt(pwd.length() - 1)))) {
            System.out.println("Şifre başarı ile tamamlandı");
        }

        else {
                System.out.println("İşlem başarısız, Lütfen yeni bir şifre girin");
            }

        }
    }
