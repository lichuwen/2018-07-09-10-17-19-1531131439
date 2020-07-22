package practice09;

public class Student extends Person {
    Klass klass;
    Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String basicIntro = super.introduce() + ' ';
        String intro;

        if(klass.getLeader() != null && klass.getLeader().getId() == this.getId())
            intro = basicIntro + "I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        else
            intro = basicIntro + "I am a Student. I am at " + klass.getDisplayName() + ".";
        return intro;
    }
}
