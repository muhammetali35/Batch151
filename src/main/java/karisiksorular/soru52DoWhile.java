package karisiksorular;

public class soru52DoWhile {
    public static void main(String[] args) {
       /*
       ==Do-While Loop==
        int i=0;
        do{
            System.out.print(i);
            i++;
        }
        while (i<5);

        */

         /*
    ==While Loop==
      int i=5;
       while (i<10){
           System.out.print(i);
           i++;
       }

          */
        // 9 dan başlayarak 190 a kadar olan 7 nin katı olan tum tamsayıları ekrana yazdırınız.
       int i=9;
        do {
            if (i % 7==0) {
                System.out.println(i);
            }
            i++;
        }
        while (i<=190);



       /* For Loop ile yaparsan bu şekilde

       for(int i=9; i<=190; i++){
            if(i % 7==0){
                System.out.println(i);

                */

    }
}
