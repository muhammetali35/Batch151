package engday05stringmanipulations01;

import java.util.Scanner;

public class StringManOrnek {
    public static void main(String[] args) {

            /*
Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Pasworunuzu i) En az 8 karakterden olussun\n" +
                "        ii)Password space icermesin\n" +
                "        iii)En az 1 tane buyuk harf olsun\n" +
                "        iv) En az 1 tane kucuk harf olsun\n" +
                "        v) En az 1 tane sembol olsun\n" +
                "        vi) En az 1 tanede rakam olsun\n uygun giriniz : " );

        String pwd = input.nextLine();
        // i) En az 8 karakterden olussun
        // boolean first = pwd.length()>=8;
        boolean first = pwd.length()>7;

        // ii)Password space icermesin
        boolean second =!pwd.contains(" "); // ! isareti icermesin demek
        // contains(" ") ==> Boşluk içersin

        //iii)En az 1 tane buyuk harf olsun
        boolean bykhrfolsun = pwd.replaceAll("[^A-Z]","").length()>0;


        //iv) En az 1 tane kucuk harf olsun
        boolean kckhrfolsun = pwd.replaceAll("[^a-z]","").length()>0;

        // Methodları yanyana aynı satırda  yazmaya Method Chain (Method Zinciri) denir.


        //v) En az 1 tane sembol olsun
        boolean smbolmali = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;


        // vi) En az 1 tanede rakam olsun
        boolean rakamolmali = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(first && second && bykhrfolsun && kckhrfolsun && smbolmali && rakamolmali  );
    }

    }





