package day31collectionsmaps;

import java.util.*;

public class HashMap01tekrar {
    public static void main(String[] args) {

        HashMap<String,Integer> population= new HashMap<>();

        population.put("USA",450000000);
        population.put("Türkiye",83000000);
        population.put("Franch",80000000);
        population.put("Germany",85000000);
        population.put("China",1000000000);

        System.out.println(population.get("USA"));//450000000

        Set<String> keys= population.keySet();
        System.out.println(keys);//[USA, China, Franch, Türkiye, Germany]

        Collection<Integer> values=population.values();
        System.out.println(values);//[450000000, 1000000000, 80000000, 83000000, 85000000]

        //Example 1: countryPopulation map'indeki ülkelerin nufuslarının ortalaması nedir?

        Collection<Integer> value=population.values();

        int sum=0;
        for(Integer w: value){
            sum+=w;
        }
        System.out.println(sum);//1698000000

        Set<Map.Entry<String,Integer>> entries=population.entrySet();
        System.out.println(entries);//[USA=450000000, China=1000000000, Franch=80000000, Türkiye=83000000, Germany=85000000]

        //Example 2= countryPopulation Map'indeki ulkelerin isimlerinin character sayısı ile nufuslarının toplamını bulunuz

        int toplam=0;
        for (Map.Entry<String,Integer> w : entries){

            toplam=toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);//1698000028




    }
}
