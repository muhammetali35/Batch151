package practices;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan=new Scanner(System.in);

        int arr[]=new int [4];


        for(int i=0; i<4; i++) { //Kullanıcıdan 4 tane rakam alacağımız için 0 dan 4 e kadar for döngüsüne aldık
            System.out.println("Bir rakam giriniz");
            int rakam=scan.nextInt();

            arr[i]=rakam; //Kullanıcıdan aldıpımız her rakamı sırasıyla Array'e atadık.


        }

        System.out.println(Arrays.toString(arr));


        double toplam=0;

        for(int w : arr){
            toplam=toplam+w;
        }

        double ortalama=toplam/arr.length;
        System.out.println("Ortalama: "+ ortalama);

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int w : arr){
            if(w>ortalama){
                System.out.print(w+" ");
            }

        }


    }
}
