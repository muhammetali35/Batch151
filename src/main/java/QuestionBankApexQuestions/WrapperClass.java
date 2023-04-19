package QuestionBankApexQuestions;

public class WrapperClass {
    public static void main(String[] args) {
    //1) Type a code to find the sum of the minimum value of the byte and the maximum value of
    //short data types

        byte min= Byte.MAX_VALUE;
        short max= Short.MIN_VALUE;
        System.out.println("Total: "+ min+max);

     //2) Type a code to convert “103” String to byte and to convert “2351” String to short then print
     //the difference on the console.

        byte first=Byte.valueOf("113");

        short second=Short.valueOf("103");

        System.out.println(second-first);

        String second1="123";
        String second4="123";
        int second2=Integer.valueOf(second1);

        System.out.println("ValueOF() "+second1);



    }
}
