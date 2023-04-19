package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02tekrar {
    public static void main(String[] args) {
        //Example 1: Öğrenci email adreslerini natural order'da sıralanmış olarak depolayınız.

        //1.Yol
        TreeSet<String> emails= new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");

        System.out.println(emails);

        //2.yol Recommended

        HashSet<String> emailsHashSet = new HashSet<>();
        emailsHashSet.add("abc@gmail.com");
        emailsHashSet.add("abd@gmail.com");
        emailsHashSet.add("abe@gmail.com");
        emailsHashSet.add("abf@gmail.com");
        emailsHashSet.add("abg@gmail.com");
        emailsHashSet.add("abh@gmail.com");
        emailsHashSet.add("abi@gmail.com");
        emailsHashSet.add("abj@gmail.com");
        emailsHashSet.add("abk@gmail.com");
        emailsHashSet.add("abl@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHashSet);
        System.out.println(emailsHsTs);



    }
}
