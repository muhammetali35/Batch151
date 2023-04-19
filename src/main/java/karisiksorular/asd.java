package karisiksorular;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {




        String b="35";
        int x=Integer.valueOf(b);
        double y=Double.valueOf(b);
        System.out.println(x);

        System.out.println(y);

        double k=Double.parseDouble(b);
        System.out.println("Parse "+k);

        String str="32";
        int m=Integer.parseInt(b);

        System.out.println("Parse : "+m);

        Scanner input= new Scanner(System.in);
        System.out.println("Sayı 1: ");
        int sayi1= input.nextInt();

        System.out.println("Sayı 2: ");
        int sayi2= input.nextInt();
        int a=Math.min(sayi1,sayi2);

        int ebob=1;
        int ekok;

        for(int i=1; i<=sayi1 && i<=sayi2; i++){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;


            }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("Ekok: "+ekok);
        System.out.println("Ebob: "+ebob);


















      /*
      While Loop
      int i=5;
       while (i<10){
           System.out.print(i);
           i++;
       }

       */

            // 'k' dan 'b' kadar olan harfllari yazdırın
/*

        char ch='k';
        do {
            System.out.print(ch+" ");
            ch--;
        }while (ch>= 'b');
*/






    }

}

