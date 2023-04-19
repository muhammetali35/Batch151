package practices;

import java.util.Scanner;

public class ifElse03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */
        Scanner input= new Scanner(System.in);

        System.out.println("Bir numara giriniz. ");
        int num= input.nextInt();

        //1.Way if else
        if(num<0){
            System.out.println("Negative sayı");
        }else if(num<10){
            System.out.println("Positive rakam");
        }else{
            System.out.println("Positive sayı");
        }


        //2.Way ternary
        String result = num<0 ? "Negative sayı" : num<10 ? "Positive rakam" : "Positive sayı" ;
        System.out.println("result = " + result);

    }
}
