package day25polymorphism;

public class Cat extends Animal{

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void move() {
        System.out.println("Cats move...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return super.multiply(a, b);
    }



    //Java da Class'lar ayni zamanda birer data tipidir
//Dondurdugumuz sey ile return type arasinda IS-A iliskisi varsa return type degistirilebilir
}
