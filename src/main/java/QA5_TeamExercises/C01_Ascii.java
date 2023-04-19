package QA5_TeamExercises;

public class C01_Ascii {
    public static void main(String[] args) {

        char ch='+';
        System.out.println("ch : "+ch);//+

        int ch2='+';
        System.out.println("ch2 : "+ch2);// 43

        System.out.println(ch2+ch);//86
        System.out.println("int ve char toplarsan "+ ch2+ch); //43+

        String str="Java";
        char ch3='G';
        int number=5;

        System.out.println(str+ch3+number);//JavaG5
        System.out.println(str+(ch3+number));//Java76
        System.out.println(number+ch3+str);//76Java

        double dd=129.99;
        double dd2=200.00;


        int sayi=(int) dd;
        System.out.println(sayi);//129

        int sayi2=(int) dd2;
        System.out.println(sayi2);//200

        //Explicit Narrowing

        Double wDd= dd;
        System.out.println(wDd.intValue());//129
        System.out.println(wDd.byteValue());//-127
        System.out.println(wDd.toString()+12);//129.9912

        System.out.println(Double.min(dd,dd2));//129.99
        System.out.println(Double.max(dd,dd2));//200.0

        float fl=wDd.floatValue();
        Float wFl=fl;
        System.out.println(wFl);//129.99

        System.out.println(wFl.equals(129.99f));//true

        int sayi1=129;
        System.out.println(sayi1+1.0);//130.0
        Integer sayi3=sayi1;
        System.out.println(sayi3.doubleValue());//129.0




    }
}
