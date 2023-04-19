package karisiksorular;

import java.util.Scanner;

public class soru31NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf isteyin kuçuk harf ise consola "Kuçuk harf", buyuk harf ise
        consola "Buyuk harf" yoksa "girdiğiniz karakter harf değil" yazdırın.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter, please...");
        char let= input.next().charAt(0);

        String result= (Character.isLowerCase(let))? "Küçük harf" : (Character.isUpperCase(let))?"Büyük harf": "girdiğiniz karakter harf değil" ;
        System.out.println(result);


    }
}
