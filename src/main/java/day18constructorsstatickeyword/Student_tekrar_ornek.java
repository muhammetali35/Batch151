package day18constructorsstatickeyword;

class Student_tekrar_ornek {

    int number;
    String name;
    static String college="ITS";

    Student_tekrar_ornek(int r,String n, String college){
        this.number = r;
        this.name = n;
        this.college = college;

    }

    public static void main(String[] args) {
        Student_tekrar_ornek s1=new Student_tekrar_ornek(111,"Karan","MIT");
        Student_tekrar_ornek s2=new Student_tekrar_ornek(222,"Aryan","Harvard");

        System.out.println(s1.number);
        System.out.println(s2.number);

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);


    }
}
