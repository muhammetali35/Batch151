package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course turkishDay=new Course("Türkish Daytime QA",123,"Spring",97);
        Course turkishNight=new Course("Türkish Nighttime QA",245,"Winter",98);
        Course englishDay=new Course("English Daytime Java Dev",121,"Spring",91);
        Course englishNight=new Course("English Nighttime Java Dev",137,"Winter",95);

        List<Course> courseList=new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList,90));//true
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));//true
        System.out.println(getCourseNameWhoseAvgMax(courseList));//Türkish Nighttime QA
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighestThird(courseList));
        System.out.println(getCourseWhoseRegisteredLessThanNumber(courseList, 150));


    }

    //Example 1: Tum average score'ların 90 dan büyük olup olmadığını kontrol eden method'u oluşturunuz
    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList,int avg){
        return courseList.stream().allMatch(t ->t.getAverageScore()>avg);
    }
    //Example 2: En az bir kurs isminin QA içerip içermediğini kontrol eden methodu oluşturunuz.
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList,String word){
        return courseList.stream().anyMatch(t -> t.getCourseName().contains(word));
    }
    //Example 3: En yüksek average srore'a sahip kurs ismini veren codu yazınız
   /* public static String getCourseNamesWhoseAvgMax(List<Course> courseList){
        Course course= courseList.stream().sorted(Comparator.comparing(Course :: getAverageScore).reversed()).findFirst().get();
        return course.getCourseName();
    }*/

    public static String getCourseNameWhoseAvgMax(List<Course> courseList) {

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();

        //Bir sefer kullanacaksak bu şekilde .Tekrar kullanma ihtimali varsa üsttesi şekilde yapmak mantıklı.

    }

    //Example 4 :Average score'u en dusuk olan ilk iki kurs disindaki tum kurslari return eden method'u olusturunuz
     public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).//boşver demek
                collect(Collectors.toList());
     }
     //Example 5: Average score'u ustten üçüncü olan kursu veren metthod'u oluşturunuz.
    public static Course getHighestThird(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);

    }

    //Example 5: Öğrenci sayısı 150'den az olan kursları return eden method'u oluşturunuz

    public static List<Course> getCourseWhoseRegisteredLessThanNumber(List<Course> courseList, int numOfStd){
        return courseList.stream().filter(t -> t.getNumOfStudents()<numOfStd ).collect(Collectors.toList());
    }



}
