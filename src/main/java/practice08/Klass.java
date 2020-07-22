package practice08;

public class Klass {
    private int number;
    private Student leader;
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
    public Student assignLeader(Student student){
        leader = student;
        return leader;
    }
}
