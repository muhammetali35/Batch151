package day03scanner;

public class Runner {
    public static void main(String[] args) {
        //Object nasil olusturulur?
        // Class Ismı+ Object Ismı+ Atama Operatoru+ "new"+ Constructor
                Car       myCar            =          new    Car();


        //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
        // Constructor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.

        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hakaret();
        myCar.dur();

        Student tomHanks= new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();

        System.out.println("tomHanks.grade = " + tomHanks.grade);

        byte grade= tomHanks.grade;
        System.out.println("grade = " + grade);




    }
}
