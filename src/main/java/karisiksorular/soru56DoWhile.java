package karisiksorular;

import java.util.Scanner;

public class soru56DoWhile {
    public static void main(String[] args) {
/*
    Kullanıcıdan bir şifre girmesini isteyin. Girilen şifreyi aşağıdaki şartlara göre
    kontrol edin ve şifredeki hataları yazdırın.
    Kullanıcı geçersiz bir şifre girinceye kadar bu işlemi tekrar edin ve geçerli şifre
    girdiğinde "Şifreniz kabul edilmiştir." yazdırın.

    -Şifre küçük harf içermelidir
    -Şifre büyük harf içermelidir
    -Şifre özel karakter içermelidir
    -Şifre en az 8 karakter olmalıdır.

 */
        Scanner input= new Scanner(System.in);
        String pwd;
        boolean hasUpperCase, hasLowerCase,hasSpecialChar,hasMinLength;



        do {
            System.out.println("Lütfen şifrenizi giriniz: ");
            pwd=input.nextLine();

            hasUpperCase= false;
            hasLowerCase= false;
            hasSpecialChar=false;
            hasMinLength = pwd.length()>=8;

            for(int i=0; i<pwd.length(); i++){
                char c= pwd.charAt(i);

                if (Character.isLowerCase(c)){
                    hasLowerCase=true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase=true;

                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar=true;

                }
            }
            if(!hasLowerCase){
                System.out.println("şifreniz en az bir küçük harf içermelidir.");
            }
            if(!hasUpperCase){
                System.out.println("şifreniz en az bir büyük harf içermelidir.");
            }
            if(!hasSpecialChar){
                System.out.println("şifreniz en az bir özel karakter içermelidir.");
            }
            if(!hasMinLength){
                System.out.println("şifreniz en az 8 karakter içermelidir.");
            }




        }while (!hasLowerCase || !hasUpperCase || !hasSpecialChar || !hasMinLength);

            System.out.println("Şifreniz başarıyla oluşturuldu."+pwd);



            /* For Loop ile

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir şifre girin: ");
        String password = scanner.nextLine();

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");

        if (password.length() < 8) {
            System.out.println("Şifre en az 8 karakter uzunluğunda olmalıdır.");
        }
        if (!hasUppercase) {
            System.out.println("Şifre en az bir büyük harf içermelidir.");
        }
        if (!hasLowercase) {
            System.out.println("Şifre en az bir küçük harf içermelidir.");
        }
        if (!hasDigit) {
            System.out.println("Şifre en az bir rakam içermelidir.");
        }
        if (!hasSpecialChar) {
            System.out.println("Şifre en az bir özel karakter içermelidir.");
        }

        if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar && password.length() >= 8) {
            System.out.println("Şifre doğru.");
        }
    }
        }
*/




    }}

