package day03scanner;

public class TekrarRunner {
    public static void main(String[] args) {

        TekrarPhone myPhone= new TekrarPhone();


        System.out.println("myPhone.color = " + myPhone.color);
        System.out.println("myPhone.mark = " + myPhone.mark);
        System.out.println("myPhone.color = " + myPhone.color);


        myPhone.howPrice();
        myPhone.howSpeed();


        System.out.println("===============================================");

        TekrarEmployee employee= new TekrarEmployee();

        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.age = " + employee.age);
        System.out.println("employee.homeTown = " + employee.homeTown);
        System.out.println("employee.height = " + employee.height);


        employee.task();
        employee.onOffTime();




    }
}
