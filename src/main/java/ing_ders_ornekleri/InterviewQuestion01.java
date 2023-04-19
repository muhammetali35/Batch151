package ing_ders_ornekleri;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        //Example 1: Type to swap the integers
        // a=12 and b= 5==> b=12

        int a= 12;
        int b=5;
        System.out.println(a+"-" +b);

        //1.Way: by using 3rd variable
        int temp=0;

        //1.Step
        temp=a;

        //2.Step
        a=b;

        //3.Step
        b=temp;

        System.out.println(a+"-" +b);

        //2.Way: Do not create 3rd variable

        int x= 12;
        int y= 5;

        System.out.println(x+"-"+y);//12-5
        x=x+y;

        y=x-y;

        x=x-y;

        System.out.println(x+"-"+y);//5-12


    }
}
