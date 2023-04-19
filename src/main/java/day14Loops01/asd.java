package day14Loops01;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz ");
        int num= scan.nextInt();


        for(int i2 = 1; i2<=num; i2++) {
            for(int j2 = 1; j2<=i2; j2++) {
                System.out.print(j2+" ");
            }
            System.out.println();
        }

        System.out.println("Please enter row number");
        int row= scan.nextInt();
        for(int a=1; a<=row; a++) {
            for(int b=1; b<=a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}