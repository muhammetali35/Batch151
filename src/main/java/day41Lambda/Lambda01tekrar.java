package day41Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01tekrar {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(14);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);


        System.out.println(tekSayilarinKareleriToplami(nums));//436
        System.out.println(tekSayilarinKareleriToplami2(nums));//436
        System.out.println(maxCiftSayiIleMinTekSayiTopla(nums));//21
        System.out.println(ciftSayilarin7denKucukMaxDegeriIleTekSayilarin8DenBuyukMinDegeriToplami(nums));//6+9=15


    }


    //Example 1: Verilen bir list'teki tek sayı olan elemanların kareleri toplamını hesaplayan  method oluşturun.

    public static int tekSayilarinKareleriToplami(List<Integer> nums) {

        return nums.stream().filter(t->t%2!=0).map(t-> t*t).reduce(0,(t,u)-> t+u);
    }

    public static int tekSayilarinKareleriToplami2(List<Integer> nums) {

        return nums.
                stream().
                filter(Utils::tekMi).
                map(Utils::getSquare).
                reduce(0,Math::addExact);
    }

    //Example 2:  Verilen bir list'teki çift sayi olan elemanlarin tekrarsız olarak
    //          kareleri çarpımını  hesaplayan method olusturunuz.

    public static int ciftSayilarinTekrarsizKareleriCarpimi(List<Integer> nums) {

        return nums.
                stream().
                filter(t->t%2==0).
                map(Utils::getSquare).
                distinct().reduce(1,(t,u)-> t*u);
        //reduce methodunu, etkisiz eleman kullanmadan kullanirsaniz.
        // get() kullanın ki optional Int i normal int e cevirmis olalım.
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
//           toplamini hesaplayan method'u olusturunuz


    public static int maxCiftSayiIleMinTekSayiTopla(List<Integer> nums){
        int maxCift=nums.stream().distinct().filter(t->t%2==0).reduce((t,u)-> t>u ? t :u ).get();
        int minTek=nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)-> t<u ? t :u ).get();

        return maxCift+minTek;

    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin 7'den küçük maximum degeri ile tek sayi olan elemanlarin
    // 8den büyük minimum degerinin toplamini hesaplayan method'u olusturunuz

    public static int ciftSayilarin7denKucukMaxDegeriIleTekSayilarin8DenBuyukMinDegeriToplami(List<Integer> nums){

        int max=nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t:u).get();
        int min=nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t:u).get();

        return min+max;
    }






}