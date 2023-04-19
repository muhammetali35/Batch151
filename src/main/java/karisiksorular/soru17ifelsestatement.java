package karisiksorular;

import java.util.Scanner;

public class soru17ifelsestatement {
    public static void main(String[] args) {
      //Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a character, please...");
        char ch =input.next().charAt(0);

        System.out.println(ch);

        if(Character.isLetter(ch)){
            System.out.println("The character is a letter");

        }
        else {
            System.out.println("The character is not a letter");

        }


    }
}
