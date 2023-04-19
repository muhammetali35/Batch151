package day19arraylists;

import java.util.List;

public class asd {
    public static void main(String[] args) {
        //Example 2:Bir List'te tekrarlı eleman olup olmadığını gösteren kodu yazınız
        List<Double> heights = List.of(1.25,1.25,4.0,3.75);

        int counter = 0;
        for (Double w : heights) {
            counter = 0;
            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;

            }
        }
        System.out.println();
        if (counter == 0) {
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element is not unique in the list");
        }


    }
}
