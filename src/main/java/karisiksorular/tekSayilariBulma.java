package karisiksorular;

import java.util.Scanner;

public class tekSayilariBulma {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini
kabul eden ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.
Örnek Çıktı
Sayı Giriniz : 2
Sayı Giriniz : 3
Sayı Giriniz : 7
Sayı Giriniz : -15
Toplam : 10

**Bonus Geliştirme
Java ile girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana
basan programı yazıyoruz.

         */
        Scanner input=new Scanner(System.in);
        int number ;
        int total = 0;

        do{
            System.out.println("Sayı giriniz: ");
            number=input.nextInt();
            if(number%2==1){
                total+=number;

            }
        }while (number>0);
        System.out.println("toplam: "+total);

        //*****Bonus
        do{
            System.out.println("Sayı giriniz: ");
            number=input.nextInt();
            if(number%2==0 && number%4==0){
                total+=number;

            }
        }while (number>0);
        System.out.println("toplam: "+total);









     /*   while (number>0);
            if(number%2==1){
            total+=number;
            }
            System.out.println("Lütfen sayı giriniz: ");
            number=input.nextInt();

        }
        System.out.println("toplam: "+total);

*/



       /* while (true){
            System.out.println("Sayı giriniz: ");
            number=input.nextInt();
            if(number<0){
                break;
            }
            if(number% 2==1){
                total+=number;

            }

        }
        */
        //System.out.println("toplam: "+total);


    }
}
