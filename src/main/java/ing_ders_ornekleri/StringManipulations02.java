package ing_ders_ornekleri;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Get the first 4 character from a String and convert them to lower cases
        // Albania==> Alba ==> alba
        String s="Albania";

        String k= s.substring(0,4).toLowerCase();

        System.out.println(k);

        //Example 2 : Check if two Strings are same or not?

        //1.Scenario: "==" and "equals()" gives you the same output
        String r= "Java";
        String u= "java";

        boolean sameEqualsSign= r==u;
        System.out.println(sameEqualsSign);//false Because values and addresses are different


        boolean same= r.equals(u);
        System.out.println(same);//false Because values  are different

        boolean sameIgnoreCases= r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCases);//true


        //Question: Why we do not use"==" to compare Strings?


        //2.Scenario: "==" and "equals()" gives you the same output

        String s1= "TechPro";
        String s2= "TechPro";

        boolean r1= s1==s2;

        boolean r2= s1.equals(s2);
        System.out.println(r2);//true

        //3.Scenario: "==" and "equals()" gives you the same output

        String t1="Python";
        String t2= new String("Python");

        boolean d1=t1==t2;
        boolean d2=t1.equals(t2);
        System.out.println(d2);//true







    }
}
