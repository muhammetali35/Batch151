package day25polimorphismTekrar;

public class Dog extends Animal{

    String myDog="Karabaş";
    public int age=2;
    public void bark(){
        System.out.println("Dogs bark...");
    }

    @Override
    public void move() {
        System.out.println("Dogs very fast...");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dogs don't eat so much...");
    }

}
