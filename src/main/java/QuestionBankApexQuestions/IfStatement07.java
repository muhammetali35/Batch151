package QuestionBankApexQuestions;

public class IfStatement07 {
    public static void main(String[] args) {
        /*
        Soru 7) Type code to check the grammatical rules for full name
 a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
 b) Your code should print "First name or last name missed" for single words like
 "Ali" or "Can" or "ali"
 c) Your code should print "Format error" for all the format like "ALI CAN"
 d) Your code should print "Name was not entered" for one or more space
 characters like " " or " "
 e) Your code should print "Invalid Name" if the name has any character different
 from letters and space.
 Note: If the abbreviation has more than 1 error all related error messages should be
 printed. For example; for "ali3" your code should print "Error in initials", "First name
 or last name missed", and "Invalid Name"
         */

        String name="Ali .Can ";
         String newNameUpper=name.toLowerCase();
         Integer indexOfSpace=name.trim().indexOf(' ');//space in indexini verir.

        String ilkHarf= name.substring(0,1);
        //String soyisimIlkharf=name.split(" ")[1].substring(0,1).toUpperCase();
        //System.out.println(soyisimIlkharf);
        String initialOfLastName=name.substring(indexOfSpace+1,indexOfSpace+2);
        Boolean isFirsNAmeInitialUpperCase=(newNameUpper.charAt(0)>='A') && (newNameUpper.charAt(0)<='Z');
        Boolean isLastNameInitialUpperCase=(initialOfLastName.charAt(0)>='A') && (initialOfLastName.charAt(0)<='Z');

        if(indexOfSpace==-1){
            System.out.println("ilk isim veya son isim eksik girdiniz");
        }
        if(!isFirsNAmeInitialUpperCase || !isLastNameInitialUpperCase){
            System.out.println("İlk harflerde büyük küçük harf hatası var");
        }
        if(name.equals(newNameUpper)){
            System.out.println("Format hatası var");
        }
        if(name.replaceAll("\\s","").length()==0){
            System.out.println("İsim girilmedi ");
        }

        if(name.replaceAll("\\s","").replaceAll("[A-Za-z]","").length() > 0){
            System.out.println("Geçersiz isim girildi");
        }



    }
}
