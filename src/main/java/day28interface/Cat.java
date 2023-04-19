package day28interface;

public class Cat implements Mammal {

    @Override
    public void drink() {
    }
    @Override
    public void eat() {

    }

    public static void main(String[] args) {
   //interface'lerde variable cagirirken "inteface" adini kullanarak cagirin.
   // Bu hem "ststic" variable olmanin geregidir, hem de okunurlulugu artirir
        System.out.println(Animal.age);//4
        System.out.println(Mammal.feedBaby);//Milk
        System.out.println(Mammal.age);//6

    }
}
