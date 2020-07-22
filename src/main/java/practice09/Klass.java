package practice09;

import java.util.*;

public class Klass {
    private int number;
    private Student leader;
    List<Student> students = new ArrayList<>();
    Klass(int number){
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }
    public String getDisplayName(){
        return "Class " + number;
    }
    public void assignLeader(Student student){
        if(students.contains(student)){
            leader = student;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }
    public List appendMember(Student student){
        students.add(student);
        if(students != null)
            return students;
        return null;
    }
}
