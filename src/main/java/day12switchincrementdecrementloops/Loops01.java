package day12switchincrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {
        /*
       Code yazarken i)Tekrarlı code yazmamaya dikkat ediniz
                    ii)Yazdığınız code 'un gerektiğinde tamir edilebilmesinin kolay olmasına
                    iii)Yazdığınız code'un gerektiğinde gelitirilebilmesinin kolay olmasına dikkat ediniz.
                    iv)Yazdığınız code'un farklı senaryolar için de çalışabilmesine dikkat ediniz.


         */

        // Ekrana 5 kere "Hi" yazdırınız.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // Yukarodaki gibi tekrar gerektiren işleri yapmak için "Loop" yapılarını kullanırız
        //4 tane loop yapisi vardır. i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //for-loop
        //Starting Value Loop Condition
        for (int i = 1; i <6 ; i++) {

            System.out.println("Hi");
        }

        // 4' ten 24'e kadar tum tamsayıları aynı satırda, aralarına boşluk bırakarak console' a yazdırınız.

        for (int i = 4; i <25 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        //33' den 11'e kadar tüm çift tamsayıları ayrı satırda aralarına boşluk bırakarak consol' a yazdırınız.
        for (int i = 33; i > 10 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }

            }
        System.out.println();
        //Yazdığınız kod baska sahada uzmanlık içermemeli.
        for(int i=32; i> 10; i=i-2){
            System.out.println(i+" ");

        }
        System.out.println("====================");
     // 20' den 74' e kadar tüm tek tamsayıları aynı satırda aralarına boşluk birakarak console'a yazdırınız.

     for(int i=20; i<75 ; i++){
         if(i%2!=0){

             System.out.print(i+" ");
         }

     }
        System.out.println("===================================");

     //"Massachusetts" kelimesinin tum sesli harfleri console'a yazdırınız
        String s= "Massachusetts";

        for(int i=0; i<s.length(); i++){

            char c= s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='U' ){
                System.out.print(c+ " ");
            }
        }


    }
}
