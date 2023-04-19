package karisiksorular;

import java.util.Scanner;

public class soru46ForLoop {
    public static void main(String[] args) {
        //İnterview Question
        // Kullanıcıdan bir String isteyin ve stringi tersten yazdırın.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a String ,please... ");
        String s= input.nextLine();

        String tersten="";
        for(int i=s.length()-1; i>=0 ; i-- ){
            tersten=tersten+s.charAt(i);

        }
        System.out.println("Metnin tersten yazılışı: "+tersten);
    }
}
