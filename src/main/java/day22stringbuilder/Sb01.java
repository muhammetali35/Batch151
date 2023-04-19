package day22stringbuilder;

public class Sb01 {
    /*
    1)"StringBuilder" String üreten bir Class'dir
    2)"String" Class kullanarak String üretiriz Java niçin "StringBuilder" Class'i da oluşturur?
      "String" class "immutable"(değiştirilemez" String üretir, "StringBuilder" Class "mutable"(değiştirilebilir" String üretir.
    3) "immutable"olmak demek orijinal değerin korunması, değiştirilemez olması demektir.
        "mutable"olmak demek orijinal değerin değiştirilebilir olması demektir.
    4) "capacity" Java'nın size verdiği data depolama yer sayısıdır.
        Length ise size data depolama yerinin kullanılan kısmıdır.
    5) Java başlangıç olarak size capacity'i 16 olarak verir.
       Siz verilen capacity'i aşarsınız Java yeni capacity'i varolanın 2 katının 2 fazlası olacak şekilde değiştirir.



     */
    public static void main(String[] args) {
        String s="Java";
        s= s+"!";

        String u="Apex";
        String v="Apex";
        String y="C++";

        //StringBuilder nasıl oluşturulur?

        //1.Way
        StringBuilder t=new StringBuilder("Python");
        System.out.println(t);
        //StringBuilder'lar nasıl oluşturulur?
        t.append("!").append("...");//arkaya arkaya yazmaya method change(method zinciri) deniyor
        System.out.println(t);//Python!...

        //2.Way:
        StringBuilder r = new StringBuilder();
        System.out.println(r);

        r.append('c');
        System.out.println(r);//c

        //"capacity" ve "length" arasındaki fark nedir?
        StringBuilder sb1=new StringBuilder("Money");

        int capacity=sb1.capacity();
        System.out.println(capacity);//21

        int length=sb1.length();
        System.out.println(length);//5

        sb1.append("!").append(".................");

        int c= sb1.capacity();
        System.out.println(c);//21x2 + 2 ===>44

        int ln=sb1.length();
        System.out.println(ln);//23

        //Default capacity'i değiştirebiliriz
        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6





    }
}

