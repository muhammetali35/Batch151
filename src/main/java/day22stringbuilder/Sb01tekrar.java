package day22stringbuilder;

public class Sb01tekrar {
    public static void main(String[] args) {
        String s="Java";
        s=s+" ! ";

        String u="Apex";
        String v="Apex";
        String y="C++";

        //StringBuilder nasıl oluşturulur?

        //1.Way
        StringBuilder t=new StringBuilder("Python");
        System.out.println(t);//Python

        t.append("!").append("...");
        System.out.println(t);//Python!...

        //2.Way
        StringBuilder r=new StringBuilder();//Boş olduğı için sadece c yi ekledi
        System.out.println(r);

        r.append('c');
        System.out.println(r);//c

        //"capacity" ve "length" arasındaki fark nedir?
        StringBuilder sb1=new StringBuilder("Money");

        int capacity=sb1.capacity();
        System.out.println(capacity);//21

        int length=sb1.length();
        System.out.println(length);//5

        sb1.append("!").append(".........");

        int c=sb1.capacity();
        System.out.println(c);//21

        int ln=sb1.length();
        System.out.println(ln);//15

        //Default capacity'i değiştirebiliriz

        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6














    }
}
