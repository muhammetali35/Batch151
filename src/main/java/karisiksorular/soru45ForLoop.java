package karisiksorular;

import java.util.Scanner;

public class soru45ForLoop {
    public static void main(String[] args) {
        /*
        Interview Question
        Kullanıcıdan 100'den küçük bir tamsayı isteyin. 1'den başlayarak girilen
        sayıya kadar tum sayıları yazdırın.Ancak;
        -Sayı 3'un katı ise sayı yerine "Java" yazdırın
        -Sayı 5'in katı ise sayı yerine "Güzeldir" yazdırın
        -Sayı hem 3'ün katı hemde 5'in katı ise sayı yerine "Java Güzeldir" yazdırın
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer less than 100 ,please... ");
        int num= input.nextInt();

        for(int i=1; i<=num; i++){
            if(i%3==0 && i%5==0 ){
                System.out.print("Java güzeldir");
            } else if (i%3==0) {
                System.out.print("Java");
            }else if(i%5==0){
                System.out.print("Güzeldir");
            }
            else {
                System.out.print(i);
            }

        }




    }
}
