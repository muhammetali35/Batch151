package day41Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(14);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println("getTheSameOfSquareOfOdds(nums) = " + getTheSameOfSquareOfOdds1(nums));//436
        System.out.println("getTheSameOfSquareOfOdds2(nums) = " + getTheSameOfSquareOfOdds2(nums));//436
        System.out.println("getMultiplicationOfSquareOfEvens(nums) = " + getMultiplicationOfSquareOfEvens(nums));//28901376
        System.out.println("getTheSmaeOfEvenMaxAndOrMin(nums) = " + getTheSmaeOfEvenMaxAndOrMin(nums));//21
        System.out.println(getTheSumOfevenLessThanSevenMaxAndOddMinGreaterThanEight(nums));//15


    }

    //Example 1: Verilen bir list'teki tek sayı olan elemanların kareleri toplamını hesaplayan  method oluşturun.
    public static int getTheSameOfSquareOfOdds1(List<Integer> nums){
        return nums.
                stream().
                filter(t-> t%2!=0).
                map(t -> t*t).
                reduce(0,(t,u)-> t+u);
    }

    public static int getTheSameOfSquareOfOdds2(List<Integer> nums){
        return nums.
                stream().
                filter(Utils:: isOdd).
                map(Utils:: getSquare). //İhtiyacınız olan method Java class'larında yoksa Utils classını kendimiz oluşturduk ve methodunu kullandık
                reduce(0,Math::addExact);//Class ismi :: method ismi ==> Method Reference
    }

    public static int getTheSameOfSquareOfOdds3(List<Integer> nums){
        return nums.
                stream().
                filter(Utils:: isOdd).
                map(Utils:: getSquare).
                reduce(Math::addExact).
                get(); //get() method'u Optional<Integer> i Integer'a çevirir.
        //Class ismi :: method ismi ==> Method Reference
    }
    //Example 2:  Verilen bir list'teki çift sayi olan elemanlarin tekrarsız olarak
      //          kareleri çarpımını  hesaplayan method olusturunuz.

    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){

        return nums.
                stream().
                filter(t -> t%2==0).
                map(t -> t*t).
                distinct().
                reduce(1,(t,u)-> t*u);
        //reduce methodunu, etkisiz eleman kullanmadan kullanirsaniz.
        // get() kullanın ki optional Int i normal int e cevirmis olalım.
    }



    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
//           toplamini hesaplayan method'u olusturunuz

    public static int getTheSmaeOfEvenMaxAndOrMin(List<Integer> nums){

        int maxEven= nums.stream().distinct().filter(t-> t%2==0).reduce((t,u) -> t>u ? t:u).get();
        int minOdd= nums.stream().distinct().filter(t-> t%2!=0).reduce((t,u) -> t<u ? t:u).get();

        return maxEven+minOdd;
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin 7'den küçük maximum degeri ile tek sayi olan elemanlarin
    // 8den büyük minimum degerinin toplamini hesaplayan method'u olusturunuz

    public static int getTheSumOfevenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max= nums.stream().distinct().filter(t->t%2==0 && t<7 ).reduce((t,u)-> t>u ? t:u ).get();
        int min=nums.stream().filter(t->t%2!=0 && t>8).reduce((t,u)-> t<u ? t:u).get();

        return max+min;
    }


}
