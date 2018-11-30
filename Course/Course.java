import java.util.Arrays;
import java.util.ArrayList;

public class Course{
  private String courseName;
  ArrayList<String>students=new ArrayList<>();
  private int numberOfStudents;
  
  public Course(String courseName){
    this.courseName=courseName;
  }
  
  public void addStudent(String student){
    students.add(student);
    numberOfStudents++;
  }
  public ArrayList<String>getStudents(){
    return students;
  }
  public int getNumberOfStudents(){
    return numberOfStudents;
  }
  public String getCourseName(){
    return courseName;
  }
  public void dropStudent(String student){
    students.remove(student);
    numberOfStudents--;
    }
  public void Clear(){
    students.clear();
    }  
}