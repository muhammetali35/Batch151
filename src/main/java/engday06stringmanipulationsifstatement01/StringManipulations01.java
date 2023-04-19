package engday06stringmanipulationsifstatement01;

public class StringManipulations01 {
    public static void main(String[] args) {
   //Example 1: Type code to find the endex of the first occurrence of 'a' in a given String
        //Alabama===> 2
        String s= "Alabama";

        //indexOf('a') will give you the index of first occurrence of 'a'
        int indxA=s.indexOf('a');
        System.out.println(indxA);//2

        //Example 2: Type code to find the index of the first occurrence of 'java' in a given String
        //"java is easy learn, java is common in the market, java is OOP"===> 2

        String t="java is easy learn, java is common in the market, java is OOP";

        int indx1=t.indexOf("java");
        System.out.println(indx1);
        //Note 1: İf you use "non-existing character or characters" in indexOf() method,
        //   it will give you"-1"
        int indx2= t.indexOf("Mary");// -1

        //Note 2: indexOf() method can be used with "char" and "String" data types
       //Example 3: Type code to find the index of the last occurence of 'm' in a given String
        //  miami ===>
        String s2= "miami";
        int lastIndx= s2.lastIndexOf('m');
        System.out.println(lastIndx);//3

        //Example 4: Type code to find the index of the last occurence of 'earn' in a given String
        //    Learn Java earn money ==> 11

        String v= "Learn Java earn money";

        int indxEarn= v.lastIndexOf("earn");
        System.out.println(indxEarn);//11

        System.out.println(v.lastIndexOf('X'));//-1

        //Note 1: İf you use "non-existing character or characters" in indexOf() method,
        //   it will give you"-1"
        //Note 2: indexOf() method can be used with "char" and "String" data types

        //Example 5: Type code to check if a given character is unique or not in a given String
        //    miami ==> 'a' --> Unique -'i' ---> unique

        String y="miami";
        char ch='m';

        boolean r1=y.lastIndexOf(ch)==y.lastIndexOf(ch);
        System.out.println("Is the character unique? "+r1);
        /*
        Note: When you tyoe code you should be careful about "coding standarts"
        i) Separate "data" and the "main code"
         */


    }
}
