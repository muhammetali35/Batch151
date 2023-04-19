package ing_ders_ornekleri;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Get the full name of the user and make all character in upper cases
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first and last name... ");
        String name= input.nextLine().toUpperCase();

            //toUpperCase() method converts all character to upper cases
        System.out.println("name = "+name );

            //Example 2: Get the full name of the user, make all character in upper cases, and remove
        // spaces from the beginning and from the end
        System.out.println("Enter your first and last name... ");
        String name2= input.nextLine().toUpperCase().trim();
        System.out.println("name2 = " + name2);

        //trim() method removes the "space" characters from the beginning and the end.
        //trim() method does not touch spaces in the middle
        System.out.println(name2);

        //Example 3: Get a String from a user. then count the number of characters in the String
        System.out.println("Enter a string...");
        String s= input.nextLine();

        int numOfChars= s.length();
        //length() method gives you the number of character in a String
        System.out.println(numOfChars);


    }
}
