package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01tekrar {
    public static void main(String[] args) {
        Course turkishDay=new Course("Türkish Daytime QA",123,"Spring",97);
        Course turkishNight=new Course("Türkish Nighttime QA",245,"Winter",98);
        Course englishDay=new Course("English Daytime Java Dev",121,"Spring",91);
        Course englishNight=new Course("English Nighttime Java Dev",137,"Winter",95);

        List<Course> courseList=new ArrayList<>();
        courseList.add(englishDay);
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishNight);


        System.out.println(tumAverageScorelar90danBuyukMu(courseList,90));//true
        System.out.println(enAzBirKursunIsmiQaMi(courseList, "QA"));//true
        System.out.println(enYuksekAverageDegereSahipKursIsmi(courseList));//Türkish Nighttime QA
        System.out.println(enYuksekAverageDegereSahipKursIsmi2(courseList));//Türkish Nighttime QA
        System.out.println(avegareScoreEnDusukOlanIlk2HaricDigerKurlariYazdir(courseList));//Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println(ogrenciSayisi150denAzOlanKurslar(courseList, 150));//
    }

    //Example 1: Tum average score'ların 90 dan büyük olup olmadığını kontrol eden method'u oluşturunuz

    public static boolean tumAverageScorelar90danBuyukMu(List<Course> courseList,int avg){

        return courseList.stream().allMatch(t->t.getAverageScore()>avg);
    }

    //Example 2: En az bir kurs isminin QA içerip içermediğini kontrol eden methodu oluşturunuz.

    public static boolean enAzBirKursunIsmiQaMi(List<Course> courseList, String word){

        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //Example 3: En yüksek average srore'a sahip kurs ismini veren codu yazınız

    public static String enYuksekAverageDegereSahipKursIsmi(List<Course> courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();

    }

    public static String enYuksekAverageDegereSahipKursIsmi2(List<Course> courseList){

        Course course=courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        return course.getCourseName();
    }

    //Example 4 :Average score'u en dusuk olan ilk iki kurs disindaki tum kurslari return eden method'u olusturunuz

    public static Course avegareScoreEnDusukOlanIlk2HaricDigerKurlariYazdir(List<Course> courseList){

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);

    }

    //Example 5: Öğrenci sayısı 150'den az olan kursları return eden method'u oluşturunuz

    public static List<Course> ogrenciSayisi150denAzOlanKurslar(List<Course> courseList, int numStd){
        return courseList.stream().filter(t->t.getNumOfStudents()<numStd).collect(Collectors.toList());
    }









}
