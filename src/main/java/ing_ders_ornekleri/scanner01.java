package ing_ders_ornekleri;

import java.util.Scanner;

public class scanner01 {
    public static void main(String[] args) {
        // Example 1: Get the initials of a name which contains first name and last name
        // Tom Hanks ==> TH

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name please...");
        String firstName= input.next();
        System.out.println("Enter the last name please... ");
        String lastName= input.next();

        char firstChar= firstName.charAt(0);
        char lastChar= lastName.charAt(0);


        System.out.println(firstChar+" "+lastChar);


    }
}
