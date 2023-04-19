package QuestionBankApexQuestions;

public class StringManipulations {
    public static void main(String[] args) {
   //1) Create a String variable for city names which have just a single word.
   // Print the city name with the initial is in uppercase and all the other characters
/*
Example: mIAMI should be printed as Miami
 miami should be printed as Miami
 MIAMI should be printed as Miami
 mIaMi should be printed as Miami etc
 */
        String cityName="  aDAna ";

      String newCityName=cityName.trim().toUpperCase();
      newCityName=newCityName.substring(0,1)+newCityName.substring(1).toLowerCase();

      System.out.println(newCityName);

      /*
      2) Create 3 String variables for people's names. Print the sum of the number of characters in
all the 3 names except space characters.
Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
       */

        String name1="Ali Kemal";
        String name2="Ahmet Can";
        String name3="Ercan Beyli";

        int n1=name1.replaceAll(" ","").length();
        int n2=name2.replaceAll(" ","").length();
        int n3=name3.replaceAll(" ","").length();

        System.out.println(n1+n2+n3);
/*
    3) Create a String variable, print the total number of alphabetical and numeric characters in
    the String on the console.
      Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.
 */

        String s= "Miami 33018!!!";

        int l=s.replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println("l = " + l);
        /*
        4) Create a String variable, print the number of non-digit characters in the String on the
console.
Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
         */

      String s1= "Miami 33018i!!!";
      int k=s.replaceAll("\\d", "").length();

      System.out.println(k);

      /*
      Soru 5: Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
 For ‘Miami ’ you should print i etc.
       */

      String s2="Ali Can  ";

      int newS2 = s2.trim().length()-1;
      System.out.println(newS2);
      String k1=s2.substring(newS2,newS2+1);

      System.out.println("The Non-space Last character==> "+k1);

      /*
     Soru  6) Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String.
       */
      String  isim="Aydın";

      char firstChar=isim.charAt(0);
      char lastChar=isim.charAt(isim.length() - 1);

      System.out.println(firstChar+lastChar);

      /*
  Soru 7) Create a String variable and print all characters except the first character on the console.
 Example:If the String is ‘Java’ you should print ‘ava’ on the console.
       */

      String str="Java";
      System.out.println("Str=> "+str.substring(1));

      /*
      8) Create a String variable and print all characters except the last character on the console in
uppercases.
Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
       */

      String str1="Java";

      System.out.println(str1.toUpperCase().substring(0, str.length() - 1));

      /*
      9) Create a String variable and print all characters except the first character and the last
character on the console in uppercases.
Example:If the String is ‘Java’ you should print ‘AV’ on the console
       */

      String str2="Java";
      System.out.println("ilk ve son harf hariç ==> "+str2.toUpperCase().substring(1,str2.length() -1));

/*
10) Type code to check if a String has just a single space character any position in the middle
Example: For ‘Ali   Can’ your code should print false on the console
 For ‘  AliCan ’ your code should print false on the console
 For ‘ Ali  Can ’ your code should print false on the console
 For ‘Ali Can’ your code should print true on the console
 */
      String str3=" Ali Can ";

      String newStr3= str3.trim();
      String allExeptSpace=newStr3.replaceAll("\\s","");
      Boolean isThereSpaceTheMiddle=newStr3.length()-allExeptSpace.length()==1;

      System.out.println("There is a space in the middle==> "+ isThereSpaceTheMiddle);

/*
11) Type code to check if a String does not have any space character at the beginning and at
the end?
Example: For ‘ Ali ’ your code should print false on the console
 For ‘Ali’ your code should print true on the console

 */
      String isim1="Ali";

      String trimmed= isim1.trim();

      Boolean result=isim1.equals(trimmed);
      System.out.println("result==> "+ result);
/*
   Soru 12) Type code to check if a String has an uppercase initial and dot at the end.
 Example: For ‘Ali’ your code should print false on the console
 For ‘ali.’ your code should print false on the console
 For ‘ Ali. ’ your code should print false on the console
 For ‘Ali.’ your code should print true on the console
 For ‘ALI.’ your code should print true on the console

 */
      String sb="Tom Hanks.";

      Boolean dot=sb.charAt(sb.length()-1)=='.';
      Boolean upperHarf=sb.charAt(0)>='A' && sb.charAt(0)<='Z';
      Boolean harfVeNokta=upperHarf && dot;

     // System.out.println("upperHArf==> " +upperHarf);
     // System.out.println("dot==> "+dot);
      System.out.println("Harf ve nokta==> "+harfVeNokta);

/*Soru 14:
Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
Example: For ‘A2b!’ your code should print false on the console
 For ‘A2b3cdef’ your code should print false on the console
 For ‘!1a23b4’ your code should print false on the console
 For ‘!1a23b4?es’ your code should print true on the console
 For ‘! a b 3 k’ your code should print false on the console
 */

      String pwd="12cddsfb?/12";

      Boolean ch=pwd.replaceAll("\\s","").length()>7;
      Boolean smbl=pwd.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;

      System.out.println("İs the password valid?==> "+(ch&&smbl));

/*
Type code to check if a String has a specific single character or not in three different ways.
 */

      String str14="Muhammet Ali123?..";

      //1.Way
      Boolean bl14= str14.contains("1");
      System.out.println("Does the character exist?: "+bl14);

      //2.Way

      Boolean bl15=str14.replaceAll("[^v]","").length()>0;//v harfi dışında bütün karakterler çıkarılır.
      System.out.println("Does the character exist: "+bl15);

      //3.Way

      Boolean bl16= str14.indexOf("m")!=-1;

     // System.out.println(str14.indexOf("v"));//-1
      System.out.println("bl16 = " + bl16);


        /*
        15) String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.
         */

      String shirtPrice = "$12.99";
      String bookPrice = "$35.99";

      String shirt=shirtPrice.replaceAll("[$.]","");
      String book=bookPrice.replaceAll("[$.]","");


      double sh=Double.valueOf(shirt);
      double bk=Double.valueOf(book);

      System.out.println("bk"+bk);

      System.out.println("Total is price "+(sh+bk)/100);

/*
16) Type code to get initials of the first name and the last name of a given name. Middle name
is out of scope.
Example: Tom Hanks ==> TH, Mary Star ==> MS
 */
      //1.Way
      String ad= "Tom Hanks";

      String initialOfLetter= ad.substring(0,1);
      int secondOfLastName= ad.indexOf(" ")+1;
      String initialOfLastName=ad.substring(secondOfLastName,secondOfLastName+1);
      System.out.println(initialOfLetter+initialOfLastName);

      //2.Way
      /*
      Burada [1] ise, split() metodu tarafından oluşturulan dizideki ikinci elemanı
      (diziler sıfırdan başlar) temsil eder. Bu nedenle, split()[1] ifadesi, split()
      metodunun sonucu olan dizinin ikinci elemanını döndürür.
       Örneğin, "merhaba,dünya".split(",")[1] ifadesi "dünya" sonucunu verir.
       */

      String firstOfLastName2=ad.substring(0,1);
      String secondOfLastName2=ad.split(" ")[1].substring(0,1);

      System.out.println(firstOfLastName2+secondOfLastName2);

    //Soru 17) Type a code to find the number of punctuation marks used in a String.

      String soru17="Muhammet ali13.?!'^+";

      int newSoru17=soru17.replaceAll("\\p{Punct}","").length();

      int totalChar= soru17.length();
     // System.out.println(totalChar);
     // System.out.println(newSoru17);
      System.out.println("Soru 17 : "+ (totalChar-newSoru17));












    }
}
