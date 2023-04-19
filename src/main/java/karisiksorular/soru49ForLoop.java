package karisiksorular;

import java.util.Scanner;

public class soru49ForLoop {
    public static void main(String[] args) {
         //Interview Question
        //Kullanıcıdan 10'dan küçük bir tamsayı isteyin ve girilen sayının
        // faktöriyelini bulun.( 5!=5*4*3*2*1)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer less than 10 ,please... ");
        int num = input.nextInt();

        int carpim=1;

        for(int i=1; i<=num ; i++){
            carpim=carpim*i;


        } System.out.print(carpim);

    }
}
