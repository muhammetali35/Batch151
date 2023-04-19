package karisiksorular;

import java.util.Scanner;

public class armstrongSayiKontrolu {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile girilen N sayınının bir Armstrong sayısı olup olmadığını bulan programı yazın.

Armstrong Sayısı
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine
 eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
 Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit
 olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

Örnek Çıktı
Sayı Giriniz : 407
407 bir Armstrong Sayıdır.
Sayı Giriniz : 303
303 bir Armstrong Sayı Değildir.
         */
        //Sayı kaç basamaklı
        //Sayının herbir basamağına ulaş
        //Üs alma işlemini yap

        int number, originalNumber, remainder , result=0 ,n=0;

        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number= input.nextInt();

        originalNumber=number;

        //Basamak sayısı bulma
        while (originalNumber!= 0){
            originalNumber/=10;
            n++;

        }

        originalNumber=number;

        //Armstrong sayısı kontrolü

        while (originalNumber!= 0){
            remainder=originalNumber%10;
            result+= Math.pow(remainder,n);
            originalNumber/=10;


        }
        if(result== number)
            System.out.println(number+" bir Amstrong sayısıdır.");
        else
            System.out.println(number+" bir Amstrong sayısı değildir. ");


    }
}
