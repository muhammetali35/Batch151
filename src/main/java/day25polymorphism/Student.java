package day25polymorphism;

public class Student {
    public String stdName="Tom Hanks";
    public int age=23;


    //Encapsulation: Data saklamaktır.(Data hiding)
    //Data'yi nasıl saklarsın ? Access Modifier'ini "private" yaparak.

    private String stdId="AC2023102T";
    private double gpa=3.87;
    private boolean succesful=false;


    //Encapsulation yapılan variable'in data type'ı "boolean" ise get methodu ismi "is" ile başlar
    public boolean isSuccesful() {
        return succesful;
    }

    public double getGpa() {
        return gpa;
    }


    //Encapsulation yaptığımız data'yı istersek diğer class'lardan okuyabiliriz.
    //Nasıl okuruz? "get method" oluşturarak Encapsulate data'nın değerini okuyabiliriz
    //i) get method'ları heo "public" olur. ii) get method'un "return type"'i okuduğu variable'in return type'i ile aynı olur.
    //iii) get method' bir boolean variable için oluşturulduysa ismi "is" ile başlar.
    public String getStdId() {
        return stdId;
    }


    //Encapsulation yaptığımız data'yı istersek diğer class'lardan nasıl değiştirenbiliriz?
    //Nasıl değiştirebiliriz? set method Encapsulate edilmiş  data'nin degerini degistirebiliriz
    //i)set method'lari hep "public" olur.ii)set method'un "return type"i hep "void" olur.
    //iii)set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //iv)set method kullanarak var olan object uzerinde degisiklikler yaparak o objeyi yeni bir objeymis gibi kullanabiliriz
    //Note: getmethod'ların diğer adı "getter" set method'ların diğer adı "setter" dır.



    public void setGpa(double gpa) {// IT alanında "set" değiştimek anlamında kullanılıyor
        this.gpa = gpa;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
