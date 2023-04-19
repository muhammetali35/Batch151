package day15loopsarrays;

import java.util.Arrays;

public class Arrays01tekrar {
    public static void main(String[] args) {
        //Array nasıl oluşturulur ?
        String stdNames[]= new String[5];

        //Array nasıl yazdırılır ?
        System.out.println(Arrays.toString(stdNames));

        //Array'e nasıl eleman eklenir?
        stdNames[0]="Ali";
        stdNames[1]="Betül";
        stdNames[2]="Cemre";
        stdNames[3]="Deren";
        stdNames[4]="Eko";


        //Array'deki specific bir elemanı nasıl alabiliriz?
        System.out.println(stdNames[0]);

        //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        //or loop
        for(int i=0; i<stdNames.length; i++){
            System.out.println(stdNames[i]+"*");
        }

        //for each

        for(String w: stdNames){
            System.out.println(w+"*");
        }

    //Example2: Bir integer Array oluşturunuz, 5 eleman ekleyiniz, elemanların toplamını bulup console'a yazdırınız.

        int sayilar[]={1,2,3,4,5};

        int toplam=0;
        for(int w: sayilar){
            toplam=toplam+w;

        }  System.out.println(toplam);

 //Example 3: Bir char Array oluşturunuz, 3 eleman ekleyiniz, elemanların çarpımı bulup console'a yazdırnız.

      //  char initials[]= new char[3];
      //  initials[0]= 'J';
      //  initials[1]= 'P';
      //  initials[2]= 'A';

        int carpim=1;
        char ch[]={'J', 'A', 'P'};
        for(char w: ch){
            carpim=carpim*w;
        }
        System.out.println(carpim);






    }
}
