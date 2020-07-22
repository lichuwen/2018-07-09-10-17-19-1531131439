package practice06;

public class Teacher extends Person{
    private Integer klass;
    Teacher(String name, int age){
        super(name,age);
    }
    Teacher(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String basicInto = super.introduce();
        String intro;
        if(klass != null)
            intro = basicInto + " I am a Teacher. I teach Class " + klass + ".";
        else
            intro = basicInto + " I am a Teacher. I teach No Class.";
        return intro;
    }
}
