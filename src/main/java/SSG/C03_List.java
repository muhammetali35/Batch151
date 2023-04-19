package SSG;

import java.util.ArrayList;
import java.util.List;

public class C03_List {
    /*
    bir doğal sayı listesi oluşturun ve tüm elemanlarını toplayın
     */

    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int sum=0;
        for (Integer w: nums) {
            sum+=w;

        }
        System.out.println("Toplam: "+sum);


        {

  }

        List<Integer> nums1= new ArrayList<>();
        nums1.add(5);
        nums1.add(4);
        nums1.add(2);
        nums1.add(3);
        nums1.add(1);

        int top=0;
        for( Integer w: nums1) {
            if(w%2==0){
                top+=w;
            }

        }
        System.out.println("Toplam1: "+top);
    }
}
