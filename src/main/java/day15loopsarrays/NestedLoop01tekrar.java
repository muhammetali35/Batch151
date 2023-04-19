package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01tekrar {
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
     public static void main(String[] args) {
            //For loop
         for (int i=1; i<4; i++) {
             System.out.println("Week: " + i);

             for (int j=1; j<4; j++) {
                 System.out.println("Day: " + j);
             }
         }
         System.out.println( "====================================");
         //While loop
         int i = 1;
         while (i<4){
             System.out.println("week: " + i);
             int k =1;
             while (k<4){
                 System.out.println("day: " + k);
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

         System.out.println("Satır sayısı");
         int satir= input.nextInt();

         System.out.println("Sütun sayısı");
         int sutun= input.nextInt();


         for(int m = 1; m<=satir; m++) {

             for(int l =1; l<=sutun; l++) {

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

        // Scanner scan = new Scanner(System.in);
        // System.out.println("bir rakam giriniz ");
        // int num= scan.nextInt();

         for(int i2 = 1; i2<=5; i2++) {

             for(int j2 = 1; j2<=i2; j2++) {

                 System.out.print(j2+" ");
             }
             System.out.println();
         }









     }
}
