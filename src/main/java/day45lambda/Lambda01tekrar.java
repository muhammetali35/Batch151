package day45lambda;

import day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;

public class Lambda01tekrar {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);



        elemanlariYazdir(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        elemalariYazdir2(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        ciftElemalari(nums);//12 14 10 4 12
        System.out.println();
        ciftElenlar2(nums);//12 14 10 4 12
        System.out.println();
        tekSayiElemanlrinKarelerini(nums);//81 17161 81 225
        System.out.println();
        tekSayiElemanlrinKarelerini2(nums);//81 17161 81 225
        System.out.println();
        tekSayilariKupleriniTekrarsiz(nums);//729 2248091 3375
        System.out.println();
        System.out.println(benzersizCiftSayilarinKareleriToplami(nums));//456
        System.out.println();
        System.out.println(benzersizCiftSayilarinKareleriCarpimi(nums));//45158400
        System.out.println();
        maxDeger(nums);//131
        System.out.println();
        maxEleman2(nums);//131
        System.out.println();
        minDeger(nums);//4
        System.out.println();
        minDeger2(nums);//4


    }


    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void  elemanlariYazdir(List<Integer> nums){
        System.out.println("Soru 1 Structured");
        for ( Integer i : nums ){

            System.out.print(i+" ");

        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void elemalariYazdir2(List<Integer> nums){
        System.out.println("1.Soru functional ");
        nums.stream().forEach(t-> System.out.print(t+" "));
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElemalari(List<Integer> nums){
        System.out.println("Soru 3 Structured ");
        for(Integer i : nums){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void ciftElenlar2(List<Integer> nums){
        System.out.println("4. soru Functional ");
        nums.stream().filter(Utils::ciftMi).forEach(t-> System.out.print(t+ " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayiElemanlrinKarelerini(List<Integer> nums){
        System.out.println("5.Soru Functional");
        nums.stream().filter(Utils::tekMi).map(Utils::getSquare).forEach(t-> System.out.print(t+ " "));
    }

    public static void tekSayiElemanlrinKarelerini2(List<Integer> nums){
        System.out.println("5.Soru Structured");
        for (Integer w: nums) {
            if(w%2!=0){
                int k=w*w;
                System.out.print(k+" ");
            }

        }
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayilariKupleriniTekrarsiz(List<Integer> nums){
        System.out.println("6.Soru Functional");
        nums.stream().filter(Utils::tekMi).map(t->t*t*t).distinct().forEach(t -> System.out.print(t+ " "));
    }
    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static int benzersizCiftSayilarinKareleriToplami(List<Integer> nums){
        System.out.println("7.Soru Functional ");
         return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Integer::sum).get();
    }
    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static int benzersizCiftSayilarinKareleriCarpimi(List<Integer> nums){
        System.out.println("8.Soru Functiononal");
        return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Math::multiplyExact).get();
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz

    public static void maxDeger(List<Integer> nums){
        //1.Yol
        System.out.println("9.Soru " );
        int max= nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t:u );
        System.out.println(max);
    }

    //2.Yol

    public static void maxEleman2(List<Integer> nums){
        int max2=nums.stream().distinct().reduce(nums.get(0),(t,u)-> t>u ? t:u);
        System.out.println(max2);
    }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void minDeger(List<Integer> nums){
        int min=nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t:u);
        System.out.println(min);
    }

    public static void minDeger2(List<Integer> nums) {
        int min2=nums.stream().distinct().reduce(nums.get(0),(t,u)-> t<u ? t:u);
        System.out.println(min2);
    }




}
