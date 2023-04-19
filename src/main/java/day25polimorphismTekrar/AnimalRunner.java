package day25polimorphismTekrar;

public class AnimalRunner {
    public static void main(String[] args) {


        Animal a1=new Animal();

        Dog d1=new Dog();
        d1.bark();
        System.out.println( d1.age);
        System.out.println( d1.myDog);
        d1.eat();
        d1.move();
    }



}
