package karisiksorular;

import java.util.Scanner;

public class soru47ForLoop {
    public static void main(String[] args) {
        //İnterview Question==>>TEKRAR BAKTEKRAR BAKTEKRAR BAKTEKRAR BAK
        //Kullanıcıdan bir String isteyin ve String tersine çeviren bir method yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ,please... ");
        String s = input.nextLine();
        System.out.println("Tersine çevrilmiş hali: "+ reverseString(s));

    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}