package practice07;

public class Teacher extends Person {
    Klass klass;
    String intro;
    String basicInto = super.introduce();

    Teacher(String name, int age){
        super(name,age);
    }
    Teacher(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass != null)
            intro = basicInto + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        else
            intro = basicInto + " I am a Teacher. I teach No Class.";
        return intro;
    }
    public String introduceWith(Student student){
        String stuName = student.getName();
        if(this.klass == student.klass)
            intro = basicInto + " I am a Teacher. I teach " + stuName + ".";
        else
            intro = basicInto + " I am a Teacher. I don't teach " + stuName + ".";
        return intro;
    }
}
