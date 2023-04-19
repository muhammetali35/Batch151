package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01tekrar {
    public static void main(String[] args) {
   // MultidimensionalArray nasıl oluşturulur?

        String names[][] = new String[3][2];

        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

    //Multidimensional Array'leri console'a yazdırmak için "toString()" methodu değil
    //"deepToString()" methodu kullanılır.

        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

    //Multidimensional Array içinden specific bir elemanı nasıl yazdırılır.

        System.out.println(names[1][1]);//M

    //Multidimensional Array içinden bir array  nasıl yazdırılır.

        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kısa yoldan Multidimensional Array nasıl oluşturlur?

        String students[][]={{"Ali"},{"Kemal","Can"},{"Lale","Mert","Kamil"}};

        //Example 1: Yukarıdaki students array'inde toplam kaç isim olduğunu bulunuz

        int toplamEleman=0;

        for(String [] w: students){
            toplamEleman += w.length;
        }
        System.out.println(toplamEleman);//6

        //Example 2:Yukarıdaki students array'inde içinde "m" olan isimleri console'a yazdırınız.

        for(String [] w: students){
            for(String k: w){

                if(k.contains("m")){
                    System.out.println(k);
                }
            }        }


        //Bir int multipdimensional array oluşturunuz.Tüm elemanların çarpımını hesaplayınız.

        int numbers[][]={{5,3},{4,2,6},{8}};

        int carpim=1;

        for(int [] w: numbers){
            for(int k:w){

                carpim=carpim*k;
            }
        }
        System.out.println("Elemanların çarpımı: "+carpim);


        //Example 4: İki boyutlu bir array'i tek boyutlu bir array'e caviriniz

        //1.Step : İki boyutlu array'de kaç eleman olduğunu bulan kodu yazmalıyız.

        int toplamElemanSayisi=0;

        for(int [] w : numbers){

            toplamElemanSayisi+=w.length;

        }
        //2.Step :Tek boyutlu array'i iki boyutlu array'in eleman sayısını kullanarak oluşturmalıyız.

        int newArr[]=new int[toplamElemanSayisi];

        //3.Step :İki boyutlu array'deki elemanları tek boyutlu array'e transfer etmeliyiz

        int idx=0;

        for(int [] w : numbers){
            for(int t : w){

                newArr[idx]=t;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 3, 4, 2, 6, 8]


        //Example 5: Bir integer multidimensional array'deki en küçük ve en büyük elemanın toplamını bulunuz.

        int ages[][]={{5,3},{4,2,6},{8}};

        int small=ages[0][0];
        int big=ages[0][0];

        for(int [] w: ages) {
            for (int k : w) {

                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
            System.out.println(big+small);


        /* tekrar
         int numbers[][]= { { 5,4 }, { 2,3,2 }};
        int toplamElemanSayisi=0;
        for(int [] w: numbers){
            toplamElemanSayisi+=w.length;
        }
        System.out.println(toplamElemanSayisi);//5

        int newArr[]= new int[toplamElemanSayisi];

        int idx = 0;
        for(int [] w: numbers){
            for(int k : w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));
         */














    }
}
