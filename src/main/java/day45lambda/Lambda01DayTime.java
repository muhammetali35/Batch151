package day45lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01DayTime {
    public static void main(String[] args) {


    List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        allEvenPrint(nums);
        System.out.println();
        anyMatchOddPrint(nums);
        System.out.println();
        enKucukIlk3AtlaKalan50Artis(nums);
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        tekElemanlarınKareleriniYazdır(nums);
        System.out.println();
        tekSayiKupTekrarsiz(nums);
        System.out.println();
        benzersizCiftSayiKareTop(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinTopYazdır(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinToplamiYazdır2(nums);
        System.out.println();
        benzersizCiftSayilarinKareCarpimiYazdir(nums);
        System.out.println();
        maxDeger(nums);
        System.out.println();
        maxDegeriniVer(nums);
        System.out.println();
        maxDeger3(nums);
        System.out.println();
        minDeger(nums);
        minDeger2(nums);


}//main

//1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.

    public static void allEvenPrint( List<Integer> nums ){

        boolean allEven= nums.
                stream().
                allMatch(t->t%2 == 0);
        System.out.println("allEven = " + allEven);//false
    }
        /*
        allMatch metodu icerisinde tum sayilara bak ve cift mi diye t%2==0 seklinde kontrol ettik dedik.
Cift mi diye sordugumuza gore bunu bir boolean conteynarina assign etmeliyiz.
Sout icine boolean variableimizin ismini yazarak sonucu yazdirdik.
         */



//2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz


        public static void anyMatchOddPrint( List<Integer> nums ){

            boolean anyOdd= nums.stream().anyMatch(t->t %2 != 0);
            System.out.println("anyOdd = " + anyOdd);

        }
        /*
        2.Soru: Listteki herhangi biri tek mi diye soruldugundan anyMatch metodunu dusunduk.
         Birinin bu sarti saglamasi yeterli olacak. Yine Lambda'ya gore olusturdugumuz kodu
         bir booelan variable'ina assign ettik. Tek sayi mi sorumuzuanyMatch metodu icinde
         t%2!=0 seklinde yazarak sorduk ve sout icinde boolean variable ismini yerlestirdik.
          Daha sonra main metod icine giderek metodumuzun ismini parantezi icine listimizin
           ismini yazarak calistirdik.
         */



//3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.

        public static void enKucukIlk3AtlaKalan50Artis( List<Integer> nums ){
            nums.stream().sorted().forEach(t-> System.out.print(t+" "));
            System.out.println();
            nums.
                    stream().
                    sorted().
                    skip(3).
                    map(t->t*0.5).
                    forEach(t-> System.out.print(t+" "));


        }


//4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void ciftElemanlar (List<Integer> nums){
        nums.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }
        /*
        4.Soru: Cift elemanlari bulmak ve yazdirmak icin structural programmingde if statement icine
         sayi%2==0 yazarak cozuyorduk.
        Functional programmingde ise filter metodu ile eleme yapiyoruz.
         */




//5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void tekElemanlarınKareleriniYazdır( List<Integer> nums ){
        System.out.print("tekElemanlarınKareleriniYazdır: ");

        nums.
                stream().
                filter(t->t%2!=0).map(t->t*t).
                forEach(t-> System.out.print(t+" "));

    }

    /*
    5.Soru: tek sayi olan elemanlarin kareleri istenmis.
tek sayilari almak icin filter metodu daha sonra bu elemanlarin yapisini karelerini alarak degistircegiz
 ve bunun icin map metodunu kullaniriz. map metodu icinde sayilarin yerine yazdigimiz t ile t'yi carptik.
     */
//6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void tekSayiKupTekrarsiz (List<Integer> nums){
        nums.stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+ " "));
    }
    /*
    6.Soru: Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak
yazdirmamiz gerekli.
Bu soruda 5. sorudan farkli olarak tekrarsiz elemanlar istendigi icin ayrica distinct metodunu kullandik ve tek sayilarin
kupunu map metodu icinde almis olduk. Genellikle distinct metodu basta kullanilan metodlardandir. distinct metodu sonrasinda
elimizde benzersiz elemanlar kaldi ve filter metodu ile tek olan sayilari alinca elimizde 3 datamiz kaldi ve map ile onlarin
kuplerini aldik.'t' olarak yazdigimiz aslinda bir variabledir. Sout icine t yazdik ve onun tek harf olmasi, datalari icinde
toplayan bir konteyner olmasina engel teskil etmez.
     */


//7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static void benzersizCiftSayiKareTop (List<Integer> nums) {
        System.out.print("7.1 : ");
        int ciftSayiTop= nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);

        System.out.println("ciftSayiTop = " + ciftSayiTop);
    }


    public static void benzersizCiftElemanlarınKarelerinTopYazdır( List<Integer> nums ) {
        System.out.print("7.2 : ");
        int benzersizCiftElKareTop =
                nums.
                        stream().
                        distinct()
                        .filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(Math::addExact).orElseThrow();

        System.out.print(benzersizCiftElKareTop);
    }

    public static void benzersizCiftElemanlarınKarelerinToplamiYazdır2( List<Integer> nums ){
        System.out.print("7.3 : ");
        int benzersizCiftElKareToplami2 =
                nums.
                        stream().
                        distinct().
                        filter(t->t%2==0).
                        map(t->t*t).
                        reduce(0,Integer::sum);//get() mehodu yerine 0,Integer::sum kullanabiliriz.

        System.out.print(benzersizCiftElKareToplami2);

    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static void benzersizCiftSayilarinKareCarpimiYazdir (List<Integer> nums) {
        Integer benzersizCiftKareCarpimi = nums.stream().
                distinct().
                filter(t->t %2 == 0).
                map(t->t*t).
                reduce(Math::multiplyExact).
                get();

        System.out.println(benzersizCiftKareCarpimi);//45158400
    }
    /*
    8. Soru: Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturmaliyiz.
Bu sorudaki fark burada carpim islemine ihtiyac var. Metodumuzu olusturduk.
sirasiyla; stream() distinct() filter() map() reduce() get() metodlarini kullandik. map icerisinde carpim,
 reduce metodu icinde Math Class'indan multiplyExact ile carpma islemi yaptik.
get metodu sonrasi bir nokta koyarak forEach metodunu bulmak istedik, ancak bulamadik. Cunku get metodundan
 sonra baska bir metod yazamiyoruz. BU metodun yapisi baska bir metod yazdirmaya uygun degil.
  Bu tip metodlara terminal metod denir.

Bu soruda bizden sayilarin kupu istenseydi ayni kodla AritmeticException alirdik. Cunku sonuc integer araligindan
buyuk olurdu.
     */


//9)Liste ogelerinden max degerini veren bir method olusturunuz
public static void maxDeger( List<Integer> nums ){

    int maxDeger =  nums.
            stream().
            distinct().
            reduce(0, (t,u)-> t>u ? t : u );

    System.out.print(maxDeger);//131

}

    public static void maxDegeriniVer( List<Integer> nums ){

        nums.stream().sorted((Comparator.reverseOrder())).limit(1).forEach(t-> System.out.print(t));

    }

    public static void maxDeger3( List<Integer> nums ){

        int maxDeger3 =  nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u );

        System.out.print(maxDeger3);//131

    }
    /*
    9. Soru: Liste ogelerinden max degeri veren bir method olusturmaliyiz.
Bu sorudaki fark list elemanlarindan max deger isteniyor. Metodumuzu olusturduk.

distinct ve reduce metodlarini kullandik. reduce metodu icinde nums.get(0)
nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u ); get(0) ile ilk degerimiz
0.nci indexteki deger olacak. t baslangictaki deger olarak 0.nci indexteki degeri alir. u ise stream icindeki ilk
indexteki elemani alacak. Daha sonra t, ilk islemde karsilastirma yapilirken elimizde kalan sayiyi deger olarak alir. Ornek
elimizde 0'dan buyuk olan 12 vardi. 12 t'de kaliyor ikinci islem icin. u ise stream icindeki ikinci elemani alir ve 12 ile
karsilastirilir. Ornek ikinci eleman 9 idi. 9 12'den kucuk oldugu false verecegi icin t icinde elimizde yine 12 var.
Gordugumuz uzere her karsilastirmada en buyuk olan eleman elimizde kailr. Alinan deger buyuk oldugu surece true olacak ve
sirasiyla bu sekilde devam edecek.
     */


    //10)Liste ogelerinden minumum degerini veren method olusturunuz


        public static void minDeger(List<Integer>nums){
            int minDeger = nums.
                    stream().
                    distinct().
                    reduce(Integer.MAX_VALUE,Integer::min);
            System.out.println("minDeger : "+minDeger);
        }


    public static void minDeger2(List<Integer> nums){

        Integer minDeger2 =
                nums.
                        stream().
                        sorted().
                        distinct().
                        reduce((t,u)->t).
                        get();

        System.out.println("Min Değer2 : " +minDeger2);

    }

    /*
    10. Soru: Liste ogelerinden minumum degeri veren methodu olusturmaliyiz.

    Integer min=nums.stream().distinct().reduce(Integer.MAX_VALUE(t,u)->t<u ? t : u) ;
    reduce metodu icinde t ve u'yu kullaninca ve baslangic degerleri alinirken stream icindeki
    datalarin alinmasina gore sabit deger olan Integer.MIN_VALUE ya da Integer.MAX_VALUE'dan
    alinmasi halinde kodumuz daha hizli calisir.
    Bu sabit degeri almak daha kolaydir. Sorumuza gore MAX ya da MIN_VALUE'yu baslangic degeri yapariz.
    Reduce metodu icinde onceki soru cozumunden farkli olarak t<u mu diye sorduk. Oncekinde t>u mu demistik.
    Cunku burada en kucuk olani bulmaliyiz. Max value 2 milyar olup kucuk mu kiyaslamasinda u'nu aldigi
     degerler hep kucuk olacak, false verecek ve
    sonucta degeri en az olan elimizde kalacak.
     */




}


