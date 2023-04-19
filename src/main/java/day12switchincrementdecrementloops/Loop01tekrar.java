package day12switchincrementdecrementloops;

public class Loop01tekrar {
    public static void main(String[] args) {

           /*
   Code yazarken i)Tekrarlı code yazmamaya dikkat ediniz
    ii)Yazdığınız code 'un gerektiğinde tamir edilebilmesinin kolay olmasına
    iii)Yazdığınız code'un gerektiğinde gelitirilebilmesinin kolay olmasına dikkat ediniz.
    iv)Yazdığınız code'un farklı senaryolar için de çalışabilmesine dikkat ediniz.


         */
        // Ekrana 5 kere "Hi" yazdırınız.

        for(int i=0; i<6; i++){
            System.out.println("Hi");
        }

   // Yukarodaki gibi tekrar gerektiren işleri yapmak için "Loop" yapılarını kullanırız
   //4 tane loop yapisi vardır. i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

  // 4' ten 24'e kadar tum tamsayıları aynı satırda, aralarına boşluk bırakarak console' a yazdırınız.

        for(int i=4; i<25; i++){
            System.out.print(i+" ");
        }
        System.out.println();
 //33' den 11'e kadar tüm çift tamsayıları ayrı satırda aralarına boşluk bırakarak consol' a yazdırınız.

        for(int i=33; i>10; i--){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
 // 20' den 74' e kadar tüm tek tamsayıları aynı satırda aralarına boşluk birakarak console'a yazdırınız.

        for(int i=20; i<75; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

  //"Massachusetts" kelimesinin tum sesli harfleri console'a yazdırınız

        String str="Massachusetts";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='a' || c=='A' ||c=='e'||c=='o'||c=='i'||c=='u'|| c=='E'|| c=='O'|| c=='I'|| c=='U' ){
                System.out.print(c+" ");

            }

        }





    }
}
