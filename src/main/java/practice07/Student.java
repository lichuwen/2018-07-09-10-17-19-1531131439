package practice07;

public class Student extends Person {
    Klass klass;
    Student(String name, int age,Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String basicInto = super.introduce() + ' ';
        String intro;
        intro = basicInto + "I am a Student. I am at " + klass.getDisplayName() + ".";
        return intro;
    }
}
