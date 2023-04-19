package day37exceptionsenums;

public class IllegalAgeException extends RuntimeException {
        /*
   Eğer Run Time Exception üretmek isterseniz RunTimeException Class'a extend etmelisiniz.
         */

    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }

}
