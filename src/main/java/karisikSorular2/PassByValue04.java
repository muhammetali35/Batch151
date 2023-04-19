package karisikSorular2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue04 {
    public static void main(String[] args) {

        int [] num={10,11,12};

        degistirArray(num);//Array methodda [0, 0, 0, 0, 0]

        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);

        degistir(list);//list methodunda : [40]
    }

    public static void degistir(List<Integer> list){
        list=new ArrayList<Integer>();
        list.add(40);
        System.out.println("list methodunda : "+list);
    }
    public static void degistirArray(int [] num){
        num=new int [5];
        System.out.println("Array methodda "+ Arrays.toString(num));
    }


}
