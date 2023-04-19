package karisikSorular2;

import java.util.Scanner;

public class kupunuYazdir {
    public static void main(String[] args) {
        //Verilen bir tamsayıya kadar olan sayının küpünü gösteren Java programını yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, please : ");
        int sayi = input.nextInt();

        int kup=1;
        for(int i=1 ; i<=sayi ; i++){
                  kup=i*i*i;
                  System.out.print(" "+kup);


        }
        System.out.println("====================");
        //Verilen bir tamsayının çarpım tablosunu görüntülemek için Java'da bir program yazın

        Scanner input2= new Scanner(System.in);

        System.out.println("Enter an integer, please : ");
        int sayi2 = input2.nextInt();

        for(int i=0 ; i<=sayi2 ; i++){

                int t=sayi2*i;
                System.out.println(sayi2 +" x"+ i+ " = "+t);


            }
        System.out.println();
        System.out.println("==================================");
        //Java'da tek doğal sayının n terimini ve toplamını gösteren bir program yazın.

       Scanner input3= new Scanner(System.in);
        System.out.println("Hey bro Enter an integer, please... ");
       int n= input3.nextInt();

        int toplam=0;
        for(int i=1 ; i<=n ; i++){
            if(i%2!=0){
                System.out.print(" "+ i);
                toplam+=i;

            }
        }
        System.out.println();
        System.out.println(toplam);
        System.out.println("=====================================");

        //Bir sayı ile dik açılı üçgen gibi deseni görüntülemek için Java'da bir program yazın.

        int i,j,m;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();

        for(i=1;i<=m;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");
          /*

        Scanner input4= new Scanner(System.in);
        System.out.println("Hey bro Enter an integer, please... ");
        int n4= input4.nextInt();
        int ik=0;
        for(int i=1 ;i<=n4 ; i++){
        for(int j=1; j<=i; j++){
            System.out.println(j);
            System.out.println("");*/
        }
        }










        }




