package karisiksorular;

import java.util.Scanner;

public class soru9manipulationsornekler {
    public static void main(String[] args) {
        //Kullanıcıdan bir kelime isteyin ve kelimeyi terten yazdırın.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word, please");
        String word= input.next();
       for(int i= word.length()-1; i>=0; i-- ){
           System.out.print(word.charAt(i));
       }

    }
}
