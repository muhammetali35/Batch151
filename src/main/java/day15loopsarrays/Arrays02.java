package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    /*
    1)Application'larda "data" ile bu data'ları işleyen kod'lar (logic) birbirinden ayrılır.
    Yani; logic data'ya bağımlı olmamalıdır.
    Data'ya bağımlı olarak yazılan kod'lara "hard code" denir.
    "hard code" hatalı kod demektir.

      Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz

     */
    public static void main(String[] args) {
        //Arrayleri kısa yoldan nasıl oluşturabiliriz?

        int grades[]={67,98,100,34,76};


        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

      //Example 1: grades array'indeki en küçük ve en buyuk grade'in toplamını ekrana yazdıran kodu yazınız.
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]

        System.out.println(grades[0]+grades[grades.length-1]);//ilk eleman ve son elemanın toplamı 134

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character
        // icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames){
            if(w.length()<5){
                System.out.println(w);
            }
        }

    //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra
    // T ile baslayan kisilerden onceki isimleri console'a yazdiriniz

        String names[]= {"Ali","Batı", "Veli","Kemal", "Tuğba","Zeynep","Zennur"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[Ali, Batı, Kemal, Tuğba, Veli, Zennur, Zeynep]

        for(String w : names){

            if(w.startsWith("T")){
                break;
            }else {
                System.out.print(w+" ");//Ali Batı Kemal
            }
        }

        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra
        // T ile baslayan kisilerden onceki isimleri ve T ile başlayanı console'a yazdiriniz

        String names2[]= {"Ali","Batı", "Veli","Kemal", "Tuğba","Zeynep","Zennur"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));//[Ali, Batı, Kemal, Tuğba, Veli, Zennur, Zeynep]

        for(String w : names2){
            System.out.print(w+" ");

            if(w.startsWith("T")){
                break;
            }
            }
        System.out.println();
        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra
        // T ile baslayan isimler hariç diğer isimleri yazdiriniz.
        String names3[]= {"Ali","Batı", "Veli","Kemal", "Tuğba","Zeynep","Zennur"};
        Arrays.sort(names3);//sort() method'u numeric data'lari kucukten buyuge(ascending) dizer
                            //Stringleri ise alfabetik(alphabetically) sirada dizer
                            // ascending + alphabetically==> Naturel Order

        for(String w : names3){

            if(w.startsWith("T")){
                continue;
            }else{
                System.out.print(w+" ");
            }
            }










        }





    }
