package practice04;

import practice04.Person;

public class Student extends Person {
    private int klass;
    Student(String name, int age,int klass){
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String basicInto = super.introduce() + ' ';
        String intro = basicInto + "I am a Student. I am at Class " + klass + ".";
        return intro;
    }
}
