package ing_ders_ornekleri;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Check the password if it has given rules.
        //          i) It should start with "J"
        //          ii) It should have at least 8 character
        //          iii) Last 3 character should be "AVA"

        String pwd= "J12!?AVA";
        //          i) It should start with "J"
        boolean firstRule= pwd.startsWith("J");//true

        System.out.println("firstRule = " + firstRule);

        //          ii) It should have at least 8 character
        //Note: There are "comparison operators" in Java: "==", "<", ">", "<=", ">=","!="
        //When you use comparation operators, you will get "boolean" everytime
        boolean secondRule= pwd.length()>7;
        System.out.println("secondRule = " + secondRule);//true

        //          iii) Last 3 character should be "AVA"
        // Note: If you want to get characters from an index to the last character,
        // use "substring()" method just with the starting index

        boolean thirdRule= pwd.substring(5,8).equals("AVA");
        System.out.println("thirdRule = " + thirdRule);//true

        /*
         What did we learn today?
         1) charAt()==> char
         2)toUpperCase()==> String
         3)toLowerCase() ==> String
         4) trim() ==> String
         5) split() ==> We will learn it latter
         6) lenght()==> int
         7) substring( begining Index , Ending Index) ==> String
         8) substring (beginning Index) ==> String
         9) equals() ==> boolean
         10) equalsIgnoreCase() ==> boolean
         11) startsWith() ==> boolean

         Note: When you learn method in Java, you should learn
                i) What does the method do?
                ii) What are the different usages?
                iii) What does the method give you?


         */


    }
}
