package karisiksorular;

import java.util.Scanner;

public class soru8manipulationsornekler {
    public static void main(String[] args) {
        // Kullanıcıdan isim ve soyismini isteyin ve hangisinin daha uzun olduğunu yzdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your firstname , please...");
        String firstName= input.nextLine();
        System.out.println("Enter your lastname, please...");
        String lastName= input.nextLine();

        if(firstName.length()>lastName.length()){
            System.out.println("Your first name is longer than your last name");
        }else{
            System.out.println("Your last name is longer than your first name");
        }

    }
}
