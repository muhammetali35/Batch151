package day24inheritancepolymorphism;

public class Honda extends Car {
    public void eco(){
        System.out.println("Honda engine are so economic");
    }

    public String model="Civic";
    public int price=2000;

    public  Honda(){
        System.out.println(this.model);//Civic
        System.out.println(super.model);//Car ==> Car classındaki model varible değeri "Car"
    }
}
