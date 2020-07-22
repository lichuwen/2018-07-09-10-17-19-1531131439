package practice02;

public class Student extends Person{
    private int klass;
    Student(String name, int age,int klass){
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String intro = "I am a Student. I am at Class " + klass + ".";
        return intro;
    }
}
