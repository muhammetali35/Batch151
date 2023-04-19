package day42lambda;

import day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {


        System.out.println(getSumInTheGivenRange(7,10));
        System.out.println(getMultiplicationInTheGivenRange(2,5));
        System.out.println(getSumOfDigitsInTheRange(45,47));
    }
        // Swap için bir tane private method oluştur.
    private static List<Integer> swap(int starting, int ending ) {
        List<Integer> list=new ArrayList<>();
        if(starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        list.add(starting);
        list.add(ending);
        return list;

    }

    //Example 1: 7'den 10'a kadar tamsayıların toplamını hesaplayan methodu oluşturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
       List<Integer>list=swap(starting, ending);
     return    IntStream.rangeClosed(list.get(0),list.get(1)).sum();//34
    }

    //Example 2: 7'den 10'a kadar sayıların çarpımını hesaplayan methodu oluşturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        if(starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        return IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 3: 45'ten 47'ye kadar olan rakamların toplamını hesaplayan method'u oluşturunuz.
    //45 46 47 ==> 4+5+4+6+4+7=30

    public static int getSumOfDigitsInTheRange(int starting, int ending){

        return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigits).sum();

    }



}
