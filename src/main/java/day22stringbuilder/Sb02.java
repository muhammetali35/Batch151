package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//String'in ters çevirilmesi loop'lar ile de yapılır,bu kısa bir yoldur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//Verilen indexteki character'i siler
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//Başlangıç index'inden(dahil) bitiş index'ine(hariç) kadar olan character'leri siler.
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//replace(2,5,"X") 2 dahil 5 hariç ==> index 2,3 ve 4 deki characterler yerine X koyar
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"2023");//ilk 3 characteri geç sonra 2023 koy.
        System.out.println(sb1);//ysX2023vaJ

        StringBuilder sb2= new StringBuilder("Java");
        StringBuilder sb3= new StringBuilder ("Java");

        int r1=sb2.compareTo(sb3);
        System.out.println(r1);//Sonuç 0 ise alfabetik olarak aynı sıradalar demektir.
                               // Sonuç mesela -3 ise sb1, sb3 den alfabetik olarak 3 önde demektir.
                               // Sonuç mesela +3 ise sb1, sb3 den alfabetik olarak 3 sonra demektir.

        //StringBuilder nasıl String'e çevrilir?
        String str=sb1.toString().toUpperCase();
        System.out.println(str);//YSX2023VAJ

        //String nasıl StringBuilder'e çevrilir?
        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);//YSX2023VAJ




    }
}
