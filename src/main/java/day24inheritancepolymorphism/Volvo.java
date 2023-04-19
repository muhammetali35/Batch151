package day24inheritancepolymorphism;

public class Volvo extends Car {
    public void secure(){
        System.out.println("Volvo is the most secure car in the world");
    }
    @Override //@ işaretiyle başlayanlara "annotation" denir.
    // @Override annotation'i Override kurallarını kontrol eder.
    public void move() {
        //super() var görünmeyen
        System.out.println("Volvo moves...");
    }


}
