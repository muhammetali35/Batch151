package practices;

import java.util.Arrays;

public class C04_Array {
    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6

        int arr[]={1,2,3,4,-5,-6};

        int brr[]=new int [arr.length];

        int idx=0;
        for( int w : arr){//arr'deki her elemanı foreach ile aldık.
            brr[idx]=w*-1;//her elemanın negatif değerini sırasıyla brr'ye atadık.
            idx++;//index'i her defasında 1 artıralım.
        }
        System.out.println(Arrays.toString(brr));
    }
}
