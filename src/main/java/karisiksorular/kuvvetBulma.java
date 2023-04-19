package karisiksorular;

import java.util.Scanner;

public class kuvvetBulma {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı
n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.
Örnek Çıktı
N Değerini Giriniz : 2
Sınır Değerini Giriniz : 20
1
2
4
8
16

         */
        Scanner input= new Scanner(System.in);

        System.out.println("N değerini giriniz n: ");
        int n=input.nextInt();

        System.out.println("K değerini giriniz: ");
        int k= input.nextInt();
        int carpim=1;

        for(int i=1; i<=k; i*=n ){
            System.out.println(i);

        }






    }
}
