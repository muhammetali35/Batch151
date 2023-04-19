package QuestionBankApexQuestions;

public class SwitchStatement10myClass {
    /*
    10) Create a method which gives you a random alphabetical character in myClass Class then
print the following by using the method.
Print "First Character" for 'A' and 'a'
Print "Second Character" for 'B' and 'b'
Print "Third Character" for 'C' and 'c'
Print "Forth Character" for 'D' and 'd'
Print "Other Characters" for all others
     */
    public static void main(String[] args) {

        String alphabet=SwitchStatement10myClass.getRandomAlphamet().toLowerCase();
        switch (alphabet){
            case "a":
                System.out.println("First character");
                break;
            case "b":
                System.out.println("Second character");
                break;
            case "c":
                System.out.println("Third character");
                break;
            case "d":
                System.out.println("Fourth character");
                break;
            default:
                System.out.println("Other Character");


        }
    }
    public static String getRandomAlphamet(){
        String alphamets ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex=alphamets.length()-1;
        int randomIndex=(int)Math.round(Math.random()*maxIndex);

        return alphamets.substring(randomIndex,randomIndex+1);


    }
}
