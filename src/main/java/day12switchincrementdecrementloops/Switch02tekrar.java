package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02tekrar {
    public static void main(String[] args) {
         /*
    Kullanıcıdan aldığınız character' in sesli harf olup olmadığını kontrol eden kodu yaznız.
     */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a character, please");
        char ch= input.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'ı':
            case 'A':
            case 'E':
            case 'O':
            case 'U':
            case 'I':
                System.out.println(ch+" is a vowel");
                break;
          default:
              System.out.println(ch+" is not a vowel");

        }

        //2.Way

        String letterStr = input.next().toUpperCase();
        switch (letterStr) {
            case "A":
            case "E":
            case "O":
            case "U":
            case "I":
                System.out.println(letterStr+" is a vowel");
                break;
            default:
                System.out.println(letterStr+" is not a vowel");
        }

        //3.Way
        String letter= input.next().substring(0,1);
        switch (letter) {
            case "A":
            case "E":
            case "O":
            case "U":
            case "I":
                System.out.println(letter+" is a vowel");
                break;
            default:
                System.out.println(letter+" is not a vowel");
        }
    }
}
