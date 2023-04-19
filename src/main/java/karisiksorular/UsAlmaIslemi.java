package karisiksorular;

import java.util.Scanner;

public class UsAlmaIslemi {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcının girdiği değerler ile üs alan programı yazın.

Örnek Çıktı
Üs Alınacak Sayı : 2
Üs Olacak Sayı : 3
Cevap : 8
Bonus Geliştirme
Projede kullandığınız döngü tipinden farklı bir tip ile yapın.
(For ile yaptıysanız While ya da While ile yaptıysanız For döngüsü ile yapınız.)
         */
        Scanner input= new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        int a= input.nextInt();

        System.out.println("Üs olacak sayı: ");
        int b= input.nextInt();

        // For döngüsü ile
        int result=1;
        for(int i=1 ;i<= b; i++){
            result=result*a;
        }
        System.out.println("For Loop Sonuç : "+result);

        System.out.println("========================================");

        // While döngüsü ile
        Scanner input1= new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        int c= input.nextInt();

        System.out.println("Üs olacak sayı: ");
        int d= input.nextInt();

        int result1=1;
        int i=1;
        while (i<=d){
            result1=result1*c;
            i++;

        }
        System.out.println("While Loop Sonuç : "+result1);













     /* Math.pow() sınıfı ile
       int result= (int) Math.pow(a,b);
        System.out.println(result);
        */
    }
}
