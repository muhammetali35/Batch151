package karisikSorular2;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        sb.append("Mehmet");
        System.out.println(sb);//Mehmet

        sb.append("Hoca");
        System.out.println(sb);//MehmetHoca

        sb.append("Java");//MehmetHocaJava
        System.out.println(sb);

        sb.append("anlatır.");
        System.out.println(sb);//MehmetHocaJavaAnlatır

        sb.append("Muhammet yılmaz",0,2);
        System.out.println(sb);//MehmetHocaJavaanlatır.Mu


        System.out.println(sb.length());//24

        System.out.println(sb.capacity());//34

        System.out.println(sb.toString());//StringBuilder'ı String'e çevirir.







    }
}
