package karisiksorular;

import java.util.Scanner;

public class soru51ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan pozitif bir sayı isteyin ve girilen rakama göre carpim taplosunu oluşturun
        Ornek kullanıı 3 girerse
        123
        246
        369

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer ,please... ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }


    }
}
