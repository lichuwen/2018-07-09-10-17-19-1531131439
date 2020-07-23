package practice08;

public class Teacher extends Person {
    Klass klass;
    String intro;
    String basicIntro = super.introduce();

    Teacher(int id, String name, int age){
        super(id, name,age);
    }
    Teacher(int id, String name, int age, Klass klass){
        super(id, name,age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass != null)
            intro = basicIntro + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        else
            intro = basicIntro + " I am a Teacher. I teach No Class.";
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
}
