package day24inheritancepolymorphism;

public class Toyota extends Car {
    public void hybrid(){
        System.out.println("Toyota uses hybrid engine...");
    }

    public Toyota(){
       this("Prius");
        System.out.println("Toyota constructor 1");
    }
    public Toyota(String s){
        super(7);//super(); var önce bunu çalıştırıyor o yüzden önce parent'a(yani Car classına) gidiyor.
        System.out.println("Toyota constructor 2");
    }


}
