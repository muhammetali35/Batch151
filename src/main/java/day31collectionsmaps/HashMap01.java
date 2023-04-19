package day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    MY NOTE:
    Map'lerde sozluklerde ki gibi kelime ve manası şeklinde bir kullanım vardır.
    "key" kısmi tekrarsız,"value" tekrarlı olabilir.
  **Map'ler "key" ve "value" structure'ini kullanir.
    Map'lerdeki elemanlara "entry" denir.
    Elemanlarin tamamina ise "EntrySet" denilir.
    "Entry"ler tekrarsız olduğu için "EntrySet" denilir.
    "Key" "value"lar ayrı ayrı data type'larında olabilirler.
    "Map"ler Collection değildir, farklı bir yapıdır.

    HashMap'ler "entry"leri rastgele sıralar, bu yüzden en hızlı map'dir.
     */
    public static void main(String[] args) {

        //Map nasıl oluşturulur?
        HashMap<String ,Integer> countryPopulation=new HashMap<>();

        //Map'e entry nasıl eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Albanıa",30000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Albanıa=30000000, Germany=83000000}

        //get() methodu "key" ile çalışır ve "value" kısmını verir.
        int usaPopulation=countryPopulation.get("USA");
        System.out.println(usaPopulation);//400000000

        //Bütün "key"leri nasıl alabiliriz?
        Set<String> keys=countryPopulation.keySet();
        System.out.println(keys);//[Turkiye, Netherland, USA, Albanıa, Germany]

        //Bütün "value"ları nasıl alabiliriz?
        Collection<Integer> values= countryPopulation.values();
        System.out.println(values);//[83000000, 18000000, 400000000, 30000000, 83000000]

        //Example 1: countryPopulation map'indeki ülkelerin nufuslarının ortalaması nedir?
        Collection<Integer> value= countryPopulation.values();
        int sum=0;
        for(Integer w : value){
            sum+=w;
        }
        System.out.println(sum/value.size());//122800000

        //entrySet() "entry"leri kalıp halinde alıp bize "Set"in içine koyarak verir.
        //Loop'lar map'ler ile kullanılamaz. Sadece entry'ler arasında gezmek istediğimizde loop kullanabiliriz.
        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Albanıa=30000000, Germany=83000000]

        //Example 2= countryPopulation Map'indeki ulkelerin isimlerinin character sayısı ile nufuslarının toplamını bulunuz
        int toplam=0;

        for(Map.Entry<String,Integer> w : entries){

            toplam=toplam + w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);

    }
}
