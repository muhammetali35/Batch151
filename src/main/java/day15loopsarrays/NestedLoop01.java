package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
       /*
        1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....


 */

        // Nested for loop

        for(int i=1; i<5; i++) {
            System.out.println("Week: " + i);

            for(int  k=1; k<8; k++) {
                System.out.println("   Day: " + k);
            }
        }

        // Nested while loop

        int i=1;

        while(i<4) {
            System.out.println("Week: " + i);

            int k=1;
            while(k<4) {
                System.out.println("   Day: " + k);
                k++;
            }

            i++;
        }
        /*
           2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */


        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows= input.nextInt();
        System.out.println("Enter the number of colums: ");
        int columns= input.nextInt();

        for(int r=1; r<=rows; r++) { //satır sayısı

            for(int c=1; c<=columns; c++) { //sütun sayısı
                System.out.print("* ");
            }
            System.out.println();
        }

        //3.Example
       /*
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
        */

        System.out.println("Please enter row number");
        int row= input.nextInt();
        for(int a=1; a<=row; a++) {
            for(int b=1; b<=a; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }




    }
}
