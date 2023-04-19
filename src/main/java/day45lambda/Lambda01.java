package day45lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
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
        elemanYazdir(nums);
        System.out.println();
        elemanYazdirr(nums);
        System.out.println();
        ciftElemanYazdir(nums);
        System.out.println();
        ciftElemanYazdirr(nums);
        System.out.println();
        tekSayiKare(nums);
        System.out.println();
        tekSayiKaree(nums);
        System.out.println();
        tekSayiKupTekrarsiz(nums);
        System.out.println();
        System.out.println(benzersizCiftKareToplami(nums));
        System.out.println(benzersizCiftKareCarpimi(nums));
        listeninMaxElemani(nums);
        listeninMaxElemani2(nums);
        listedenMaxYazdir3(nums);
        listeninMinElemani(nums);


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }


    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void elemanYazdirr(List<Integer> nums) {
        nums.forEach(t -> System.out.print(t + " "));
    }


    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElemanYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
    }


    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElemanYazdirr(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayiKare(List<Integer> nums) { //Structured

        for (Integer w : nums) {
            if (w % 2 != 0) {
                int k = w * w;
                System.out.print(k + " ");
            }
        }
    }

    public static void tekSayiKaree(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }
    /*
    5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
Bir sayinin karesini alacaksak, yapisini degistiriyoruz demektir.
metodu olusturduktan sonra sirasiyla nums.stream().filter(t->t%2 !=0).map(t->t*t).forEach(t->System.out.print(t+ " ")
Tek sayi olan elemanlar deniyor. Datalari stream'e alinca dikey bir yapilasma icinde alt alta siralanir.
filter metodunu calistirirken tek sayilari al, cift olanlari ele demis olduk. map metodu ile aldigi elemanlarin
karesi alinacagindan elemanlarin datasi degistirildi. forEach metodu ile karesi alinan elemanlar yazdirildi.
t harfinin yanina elemanlar arasinda bosluk olsun diye bosluk koyduk ve yazdirdik.

6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
Bu soruda 5. sorudan farkli olarak tekrarsiz elemanlar istendigi icin ayrica distinct metodunu kullandik ve tek sayilarin kupunu map
metodu icinde almis olduk. Genellikle distinct metodu basta kullanilan metodlardandir. t dedigimiz variabledir.
Sout icine yazdik ve onun tek harf olmasi, datalari icinde toplayan bir konteyner olmasina engel teskil etmez.
Her iki soruyu da functional programming ile cozduk.
     */

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayiKupTekrarsiz(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t * t).distinct().forEach(t -> System.out.print(t + " "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftKareToplami(List<Integer> nums) {
        return nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(Integer::sum).get();
        /*
        7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz.
Bu sorudaki fark ayrica sayilarin toplami istenmis. reduce metodu kullanmaliyiz. reduce ile coklu data tekli dataya
donecek. metodumuzu integer olarak olusturduk. Parametresi arraylist

stream ile elemanlar yukaridan asagiya siralandi. Benzersiz dendigi icin basta distinct metodu kullanilarak
elemanlar azaltildi. filter metodu ile cift sayilari aldik. map metodu ile sayilarin kareleri alindi.
Devaminda reduce metodu icinde Math Class'indan addExact ile toplama yapildi ve get metodu eklendi.
Cunku integer olarak sonucu almak istedik. get metodu optional data type'ini integer'a ceviriyor.
Get metodunu kullnamasaydik, hata alirdik. Bu defa forEach metodu ile yazdirma yapilmadi.
Metodumuz integer olup bize integer dondurulmesi icin baslangic kismina return keywordu ile basladik.
 Main metod icinde sout'u yazdirinca sonucu ekranda gorduk.
         */
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftKareCarpimi(List<Integer> nums) {
        return nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(Math::multiplyExact).get();
        /*
        8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz.
Bu soruda fark carpim islemine ihtiyac var. Metodumuzu olusturduk.
sirasiyla; stream() distinct() filter() map() reduce() get() metodlarini kullandik. map icerisinde carpim, reduce
metodu icinde Math Class'indan multiplyExact ile carpma islemi yaptik.
get metodu sonrasi bir nokta koyarak forEach metodunu bulmak istedik, ancak bulamadik. Cunku get metodundan sonra
baska bir metod yazamiyoruz. Bu tip metodlara terminal metod denir.

Bu soruda bizden sayilarin kupu istenseydi ayni kodla AritmeticException alirdik. Cunku sonuc integer araligindan
buyuk olurdu.
         */
    }


    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void listeninMaxElemani(List<Integer> nums) {
        //1.Yol
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }
    //2.Yol
    public static void listeninMaxElemani2(List<Integer> nums){
        int max2=nums.stream().distinct().reduce(nums.get(0),(t,u)-> t>u ? t : u);
        System.out.println("max2 "+max2);
    }

   /*
   9) Liste ogelerinden max degeri veren bir method olusturunuz.
Bu sorudaki fark elemanlardan max deger isteniyor. Metodumuzu olusturduk.
1. Yol:
Maximum degeri bulabilmek icin coklu datayi tekli dataya dusurmeliyiz. Cunku birden fazla ayni sayilar olabilir.
reduce metodu icinde Integer Classini yazarak bu Class'daki metodlari kullandik. Uygun olan MIN_VALUE olup devaminda
parantez icine iki sayi verdik. Bu sayilari t ve u harfleri temsil edecek sekilde yazdik. ve devaminda ternary
yapisi ile sayilardan t u'dan buyukse diye sorduk. Kodumuzu max isimli Integer bir conteynerine assign ettik.

int Max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->>u ? t: u);

stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. t her zaman ilk degerini baslangic degeri
dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar. Bu sabit bir deger. u ise stream icinde siralanan bastaki degeri alir. t daha sonra stream'deki
ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.
    */


    //10)Liste ogelerinden minumum degeri veren method olusturunuz
    public static void listeninMinElemani(List<Integer> nums) {
        //1.Yol
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min "+min);

    }
    // 3.Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println("max3 = " + max3);


    }
    /*
    10) Liste ogelerinden minumum degeri veren method olusturunuz.

Integer min=nums.stream().distinct().reduce(Integer.MAX_VALUE(t,u)->t<u ? t : u) ;
reduce metodu icinde t ve u'yu kullaninca ve baslangic degerleri alinirken stream icindeki datalarin alinmasina
 gore sabit deger olan Integer.MIN_VALUE ya da Integer.MAX_VALUE'dan alinmasi halinde kodumuz daha hizli calisir.
  MAX_VALUE burada 2 milyar olup bu sabit bir degerdir. Buarada t 2 milyar ile basladi ve u ile kiyaslama yapilinca
   kucuk olan sayi hep elimizde kalir.
Bu sabit degeri almak daha kolaydir. Sorumuza gore MAX ya da MIN_VALUE'yu baslangic degeri yapariz.
 Reduce metodu icinde onceki soru cozumunden farkli olarak t<u mu diye sorduk. Oncekinde t>u mu demistik.
  Cunku burada en kucuk olani bulmaliyiz.
     */

}


