package practice10;

import java.util.Arrays;
import java.util.LinkedList;

public class Teacher extends Person {
    Klass klass;
    String intro;
    String basicIntro = super.introduce();

    private LinkedList<Klass> classes = new LinkedList<>();

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name,age);
        this.classes = classes;
    }
    Teacher(int id, String name, int age){
        super(id, name,age);
    }
    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        if(klass == null)
            intro = basicIntro + " I am a Teacher. I teach No Class.";
        else{
            int[] classTeach = new int[6];
            int i=0;
            for (Klass klass : classes) {
                classTeach[i++] = klass.getNumber();
            }

            String str = Arrays.toString(classTeach);
            intro = basicIntro + " I am a Teacher. I teach " + klass.getDisplayName() + String.join(", ", str) + ".";;
        }

        return intro;
    }
    public String introduceWith(Student student){
        String stuName = student.getName();
        if(this.klass == student.klass)
            intro = basicIntro + " I am a Teacher. I teach " + stuName + ".";
        else
            intro = basicIntro + " I am a Teacher. I don't teach " + stuName + ".";
        return intro;
    }
    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }
}