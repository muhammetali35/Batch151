package karisiksorular;

import java.util.Scanner;

public class soru44ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 den küçük bir sayı isteyin. 1'den başlayarak girilen sayiya
        kadar 3'un veya 5'in katı olan sayıları yazdırın.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer less than 100 ,please... ");
        int num= input.nextInt();

        for(int i=1; i<=num; i++){
            if(i%3==0 || i%5==0){
                System.out.print(" "+i);

            }


        }

    }
}
