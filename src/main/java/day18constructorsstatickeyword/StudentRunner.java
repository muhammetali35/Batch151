package day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

        //static olan "numOfRegisteredStd" variable'ını çağrmak iin sadece class ismini kullandık, object oluşturmadık.
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan "num" variable'ını çağırmak için object oluşturduk.
        Student s1=new Student();
        System.out.println(s1.num);

        //static olan "numOfRegisteredStd" variable'ına object üzerinden de ulaşabilirsiniz ama bu hatadır kullanımaz.
        System.out.println(s1.numOfRegisteredStd);



    }
}
