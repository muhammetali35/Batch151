package QuestionBankApexQuestions;

public class TypeCasting {
    public static void main(String[] args) {
    //1) Create a short variable and convert it to an int variable

        short sh=12;
        int newSh=sh;

     //2) Create a long variable and convert it to an int variable

     long lg=32L;
     int newLg=(int)lg;

//3) Create a double variable and convert it to a float variable

        double db=12.20;
        float newDb= (float) db;

//4)Create a double variable and convert it to a short variable, then print the value of the short
//variable on the console. Be careful about the output, it will not be a decimal value

         double db1=12.90;
         short newDb1=(short)db1;
        System.out.println(newDb1);

  //5) Create a byte variable and convert it to a double variable, then print the value of the double
  //variable on the console. Be careful about the output, it will be a decimal number.

        byte bt=15;
        double newBt=bt;
        System.out.println(newBt);










    }
}
