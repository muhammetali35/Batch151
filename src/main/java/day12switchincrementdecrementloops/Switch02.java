package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch02 {
    /*
    Kullanıcıdan aldığınız character' in sesli harf olup olmadığını kontrol eden kodu yaznız.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a letter ");
        char letter= input.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter+ " is a vowel");
                break;
            default:
                    System.out.println("It is not a vowel");

        }

        //2.Way

        String letter2=input.next().substring(0,1).toUpperCase();
        switch (letter2) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter2+ " is a vowel");
                break;
            default:
                    System.out.println("It is not a vowel");
        }

        //3.Way

        String letter3=input.next().substring(0,1);
        switch (letter3) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3+ " is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
        }
    }
}
