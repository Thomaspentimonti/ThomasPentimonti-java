import java.util.*;

public class Student {
    String studentName;
    String studentGrade;
    ArrayList <Double> grades = new ArrayList<>();
    public Student(String grade, String name){
        studentGrade = grade;
        studentName = name;

    }
    public int addGrades(int myGrades){
        myGrades=grades.size();
        return myGrades;
    }
    public boolean passingOrFailing(){
        double sum = 0;
        for (int i = 0; i <= grades.size(); i++){
            sum += grades.get(i);
        }
        if(sum/grades.size() > 65){
            return true;
        } else {
            return false;
        }


    }
    public String name(String myname){
        myname=studentName;
        return myname;
    }
    public String Grade(String myGrade){
        myGrade=studentGrade;
        return myGrade;
    }
}
