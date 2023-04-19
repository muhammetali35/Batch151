package karisikSorular2;

import java.util.ArrayList;
import java.util.List;

public class PassByValue03 {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);

        degistir(list);
        System.out.println(list);
        degistir2(list);
        System.out.println(list);

    }

    public static void degistir(List<Integer> list){
        for(Integer w : list){
            w+=3;
            System.out.println(w+" ");
        }
        System.out.println();
        System.out.println(list);

    }

    public static void degistir2(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            list.set(i,list.get(i)+3);
            System.out.println(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);
    }


}
