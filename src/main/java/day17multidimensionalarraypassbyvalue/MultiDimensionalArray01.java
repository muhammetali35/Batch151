package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
  1) Bir array'in elemanları da array olursa bu tarz array'lere "Multidimensional Array" denir.

         */

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

        //Multidimensional Array içindeki bir array'i yazdırmak
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kısa yoldan Multidimensional Array nasıl oluşturlur?
        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Example 1: Yukarıdaki students array'inde toplam kaç isim olduğunu bulunuz

        int sum=0;

        for(String[] w: students){
            sum=sum+w.length;
        }
        System.out.println(sum);//8

        //Example 2:Yukarıdaki students array'inde içinde "m" olan isimleri console'a yazdırınız.

        for(String[] w: students){
            for(String k: w){

                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //Bir int multipdimensional array oluşturunuz.Tüm elemanların çarpımını hesaplayınız.

        int nums [][] ={{5,4},{2,3,2},{7}};
        int carpim=1;

        for(int [] m : nums){
            for(int  s : m){

                carpim=carpim*s;
            }
        }
        System.out.println(carpim);

        //Example 4: İki boyutlu bir array'i tek boyutlu bir array'e caviriniz

        int numbers[][]= { { 5,4 }, { 2,3,2 }};//==>{5,4,2,3,2}

        //1.Step : İki boyutlu array'de kaç eleman olduğunu bulan kodu yazmalıyız.

        int toplamElemanSayisi=0;
        for(int [] w: numbers){
            toplamElemanSayisi+=w.length;

        }

        //2.Step :Tek boyutlu array'i iki boyutlu array'in eleman sayısını kullanarak oluşturmalıyız.

        int newArr[]=new int [toplamElemanSayisi];


        //3.Step :İki boyutlu array'deki elemanları tek boyutlu array'e transfer etmeliyiz

       int idx=0;

       for(int [] w: numbers){
           for(int k: w){
           newArr[idx]=k;
           idx++;
       }
 }
        System.out.println(Arrays.toString(newArr));

       //Example 5: Bir integer multidimensional array'deki en küçük ve en büyük elemanın toplamını bulunuz.

        int ages [][] ={{15,4},{12,43,21},{7}};

        int small=ages[0][0];//Rastgele bi index giriyoruz
        int big=ages[1][0];//Rastgele bi index giriyoruz

        for(int [] w: ages){
            for(int k : w){
                small= Math.min(small,k);
                big= Math.max(big,k);

            }
        }
        System.out.println(small+big);







        }
}