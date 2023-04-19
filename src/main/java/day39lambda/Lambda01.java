package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jin");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);//Tom Jin Clara
        System.out.println();
        printEl(myList);//Tom Jin Clara
        System.out.println();
        printElExceptStartWithT(myList);//Jin Clara
        System.out.println();
        printElLengthLessThanFour(myList);//Tom Jin
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);//CLARA
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);//clara angelina
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);//ANGELİNA CLARA JİN TOM
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);//tom jin clara angelina

    }
    //1.Yol
    //Example 1: Bir List'teki elemanları console'a yazdıran methodu oluşturunuz?
    public static void printElements(List<String> myList) {
        for (String w : myList) {   //===> Structed Programing
            System.out.print(w+ " ");
        }

    }

    //2.Yol
    // LAMBDA EXPRESSİON
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t+" ")); // ==> Functional Programming

    }

    //Example 2: Bir list'teki t ile başlayanlar hariç tüm elemanları console'a yazdıran methodu oluşturunuz

    public static void printElExceptStartWithT(List<String> myList){
        myList.stream().filter(t-> !t.startsWith("T")).forEach(t-> System.out.print(t+" "));
    }
    //Example 3: Bir List'te character sayısı 4 den az olan tum elemanları consoleâ yazdıran methodu oluşturunuz

    public static void printElLengthLessThanFour(List<String> myList) {
        myList.stream().filter(t-> t.length()<4).forEach(t-> System.out.print(t+" "));
    }

    //Example 4:Bir List'te character sayısı 4 den çok olan tum elemanları buyuk harflerle console'a yazdıran methodu oluşturunuz

    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t-> t.length()>4).map(t-> t.toUpperCase()).forEach(t-> System.out.print(t+" "));
    }

    //Example 5:Bir List'te character sayısı 4 den çok olan tum elemanları tekrarsız olarak küçük harflerle console'a yazdıran methodu oluşturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList) {
        myList.stream().
                distinct().
                filter(t-> t.length()>4).
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));
                                    //distinct()==> tekrarsız yapar
    }
    //Example 6:Bir List'te elemanları tekrarsız olarak buyuk harflerle alfabetik sırada console'a yazdıran methoodu oluşturunuz
    public static void printElUniqueToUpperCaseSorted(List<String> myList) {

        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t+" "));
    }
    //sorted(). methodu natural order olarak çalışır. String datalar için A-Z integer 1-9999

    //Example 7:Bir List'te elemanları tekrarsız olarak küçük harflerle uzunluklarına küçükten büyüğe sıralanarak console'a yazdıran methoodu oluşturunuz

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList) {

        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).////Comparator.comparing(t -> t.length()) karsilastirici karsilastirma sartini biz verdik
                forEach(t -> System.out.print(t+" "));
        //Note: Siralamayi bir sarta baglayacaksak sorted(Comparator.comparing()) kullanmaliyiz
    }

}
