package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements JoinStudentListener, JoinLeaderListenner {
    Klass klass;
    String intro;
    String basicIntro = super.introduce();

    private LinkedList<Klass> classes = new LinkedList<>();

    Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.getStudentListeners().add(this);
            klass.getLeaderListenners().add(this);
        });
    }

    Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
        if (classes.isEmpty())
            intro = basicIntro + " I am a Teacher. I teach No Class.";
        else {
            String classTeach = "";
            for (int i = 0; i < classes.size(); i++) {
                if (i != classes.size() - 1) {
                    classTeach += classes.get(i).getNumber() + ", ";
                } else {
                    classTeach += classes.get(i).getNumber();
                }
            }
            intro = basicIntro + " I am a Teacher. I teach Class " + classTeach + ".";
        }

        return intro;
    }

    public String introduceWith(Student student) {
        String stuName = student.getName();
        if (isTeaching(student))
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

    @Override
    public String studentJoinClass(Student student) {
        System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + student.klass.getNumber() + ".\n");
        return null;
    }

    @Override
    public void leaderJoinClass(Student student) {
        System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class " + student.klass.getNumber() + ".\n");
    }
}
