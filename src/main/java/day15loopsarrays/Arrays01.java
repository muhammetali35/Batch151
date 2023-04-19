package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    /*
    1) Array, Java'nın çoklu data depolamak için oluşturduğu bir yapıdır.
    2) Array'ler "primitive data type" leri veya "reference"lar ile çalışır.
    3) Array'ler "super fast"dir ve "memory'de çok az yer" kaplar.

     */
    public static void main(String[] args) {

        //Array nasıl oluşturulur ?
        String stdNames[] = new String[5];

        //Array nasıl yazdırılır ?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]//null'lar String'in default değeridir.

        //Array'e nasıl eleman eklenir?
        stdNames[0] ="Ajda";//[Ajda,null,null, null, null]
        stdNames[3]="Cüneyt";//[Ajda,null,null,Cüneyt, null]
        stdNames[2]="Kemal";//[Ajda,null,Kemal,Cüneyt,null]
        stdNames[1]="Ayhan";//[Ajda,Ayhan,Cüneyt,null]
        stdNames[4]="Kemal";//[Ajda,Ayhan,Kemal,Cüneyt,Filiz]
        System.out.println(Arrays.toString(stdNames));//[Ajda,Ayhan,Kemal,Cüneyt,Filiz]

        //Array'deki specific bir elemanı nasıl alabiliriz?
        System.out.println(stdNames[3]);//Cüneyt

       //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        //1.Way
        for(int i=0; i<stdNames.length; i++){//length Stringlerde parantezli (method) ,Array'lerde parantezsiz (method değil) kullanılır.
            System.out.println(stdNames[i]+"*");
        }

        //2.Way: for-each loop==> Enhanced(Zenginleştirilmiş) loop- Mumkunse hep for-each loop kullanın
               //[Ajda,Ayhan,Kemal,Cüneyt,Filiz]

        for(String w : stdNames){

            System.out.println(w+ "*");

        }
        //Example2: Bir integer Array oluşturunuz, 5 eleman ekleyiniz, elemanların toplamını bulup console'a yazdırınız.

        int ages[] = new int[5];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]

        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages));//[12, 23, 9, 38, 27]

        //Array'deki sayıları toplama
        int sum = 0;
        //[12, 23, 9, 38, 27]
        for(int w : ages){
            sum = sum + w;
        }
        System.out.println(sum);//109




        //Example 3: Bir char Array oluşturunuz, 3 eleman ekleyiniz, elemanların çarpımı bulup console'a yazdırnız.
        char initials [] = new char[3];
        initials [0] = 'J';//76
        initials [1] = 'P';//80
        initials [2] = 'A';//65

        int carpim=1;
                        //[J,P,A]
        for(char w : initials){
            carpim=carpim*w;
        }
        System.out.println(carpim);










    }
}
