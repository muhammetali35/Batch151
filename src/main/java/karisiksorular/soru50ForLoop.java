package karisiksorular;

import java.util.Scanner;

public class soru50ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan pozitif bir rakam girmesini isteyin ve girilen rakama göre
        aşağıdaki şekli çizdirin
        *
        * *
        * * *
        * * * *

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer less than 10 ,please... ");
        int num = input.nextInt();


        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }



    }
}
