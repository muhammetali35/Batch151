package QA5_TeamExercises;

import java.util.Scanner;

public class AsalCarpanBulma {
    public static void main(String[] args) {
        /*
        En büyük asal çarpan
        Soru : 3
        13195'in asal çarpanları 5, 7, 13 ve 29'dur.
        600851475143 sayısının en büyük asal çarpanı nedir?
     */


        long number = 600851475143L;
        long largestPrimeFaktor = 0;

        for (long i = 2; i <= number; i++) {

            if (number % i == 0) {// i sayıya tam olarak bölünürse
                boolean isPrime = true;
                for (long j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {  // i bir asal sayı değilse
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {// i bir asal sayıysa
                    largestPrimeFaktor = i;
                    number /= i;// number değerini i'ye bölerek kalan sayılar üzerinde işlem yapmaya devam ediyoruz
                }
            }
        }
        System.out.println(largestPrimeFaktor);

    }
}