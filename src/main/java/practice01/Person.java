package practice01;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        String intro = "My name is " + name + ". I am " + age +" years old.";
        return intro;
    }
}
