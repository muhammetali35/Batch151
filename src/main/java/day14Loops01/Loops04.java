package day14Loops01;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        // Kullanıcı usernme ve password'u girsin
        //3 kereden fazla girerse "Your account was blocked"mesajı alsın
        // 3 Kereye kadar yazlış girerse ""Invalid username or password, try again" mesajı alsın
        // Doğru girerse "Welcome to your account"mesajı alsın

        Scanner input=new Scanner(System.in);

        int counter=0;

        String  validUserName="techpro123";
        String  validPassWord="Education12?";


        do{
            if(counter==4){
                System.out.println("Your account was blocked");
            }

            System.out.println("Enter your username ");
            String userName=input.next();

            System.out.println("Enter your password ");
            String passWord=input.next();

            counter++;

            if((userName.equals(validUserName)) && (passWord.equals(validPassWord)) ){
                System.out.println("Welcome to your account");
                break;
            }else {
                System.out.println("Invalid username or password");
                System.out.println((3-counter)+ " right left ");
            }

        }while(true);







    }
}
