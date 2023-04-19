package day43lambda;

public class Coursetekrar {
     /*
    İçinde
    1 Private variables
    2 Paramertreli ve Parametresiz constructer lar
    3 getter' lar
    4 setter'lar
    5 toString () methodu
    barındıran class lara özgü "POJO" Class denir.
    POJO: Plain Old Java Object
     */

     private String courseName;
     private int numOfStudents;
     private String season;
     private double averageScore;


     @Override
     public String toString() {
          return "Coursetekrar{" +
                  "courseName='" + courseName + '\'' +
                  ", numOfStudents=" + numOfStudents +
                  ", season='" + season + '\'' +
                  ", averageScore=" + averageScore +
                  '}';
     }

     public Coursetekrar(String courseName, int numOfStudents, String season, double averageScore) {
          this.courseName = courseName;
          this.numOfStudents = numOfStudents;
          this.season = season;
          this.averageScore = averageScore;
     }

     public Coursetekrar() {
     }

     public String getCourseName() {
          return courseName;
     }

     public void setCourseName(String courseName) {
          this.courseName = courseName;
     }

     public int getNumOfStudents() {
          return numOfStudents;
     }

     public void setNumOfStudents(int numOfStudents) {
          this.numOfStudents = numOfStudents;
     }

     public String getSeason() {
          return season;
     }

     public void setSeason(String season) {
          this.season = season;
     }

     public double getAverageScore() {
          return averageScore;
     }

     public void setAverageScore(double averageScore) {
          this.averageScore = averageScore;
     }
}
