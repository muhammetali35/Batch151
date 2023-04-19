package QuestionBankApexQuestions;

public class Variables {
    public static void main(String[] args) {


//1) Create double variables for the prices of any 3 items. Print the sum of the prices on the
//console with a label

    double price1=12.99;
    double price2=10.50;
    double price3=9.99;
        System.out.println("total price: "+ (price1+price2+price3));
 //2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
 // multiplication of the values on the console with a label.

        float pr1=12.99f;
        long pr2=1050;
        int pr3=9;

        System.out.println((float)pr1*pr2*pr3);
//3) Type a code to find simple interest.
//Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principal=5000;
        double rate=2;
        int numberOfYear=3;
        double i= principal*rate*numberOfYear/100;
        System.out.println("Sipmle interest:"+i);

 //  4) Create a String and two Long variables. Print the sum and the multiplication of the long
 //  variables with the String on the console.

        String s4="This result is ";
        long l1=18L;
        long l2=12L;

        System.out.println("Example 4 "+s4+(l1+l2));
        System.out.println("Example 4 "+s4+(l1*l2));

 //  5) Create two boolean variables whose values are different and print their values in the same
 //  line with a space between two consecutive values

        boolean bl1=true;
        boolean bl2=false;

        System.out.println(bl1+" "+bl2);

//6) Create 3 float variables for the price of a book, notebook, and laptop.
//Print the total price of 2 books, 4 notebooks and 3 laptops on the console

        float book=12.10F;
        float notebook=10.20F;
        float laptop=5.50F;

        System.out.println("Example 6: "+(float)(2*book+4*notebook+3*laptop));

  //7) Type a code to swap two integers.

        int a=12;
        int b=20;


        //1.Way
        int temp=a;
        a=b;

        b=temp;

        System.out.println("a: "+b+" b: "+a);

        //2.Way

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+b+" b: "+a);










    }
}