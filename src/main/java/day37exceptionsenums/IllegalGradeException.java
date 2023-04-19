package day37exceptionsenums;

public class IllegalGradeException extends Exception {

    /*
    1)Custom(Kendi yaptığımız demek) Exception Class oluşturmak için Exception Class'a extend etmeliyiz.
    Exception Class'a extend ederek oluşturduğumuz Custom Exception "Compile Time Error" olur.

    2)Custom Exception Class oluştururken "constructor" oluşturmalısınız.
    Bu "constructor" paret'taki constructor'i çağırmalıdır.
    Bu "constructor" mesaj verecek veya vermeyecek şekilde oluşturabilir.

    3)Custom Exception Class oluşturduğunuzda ismin sonuna "Exception" kelimesi kullanmalısınız.
     IllegalGradeException'da oldugu gibi.

     */
    public IllegalGradeException(String message){
        super(message);

    }
    public IllegalGradeException(){
        super();

    }
}
