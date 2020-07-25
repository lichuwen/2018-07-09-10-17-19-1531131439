package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    Person(int id, String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        String intro = "My name is " + name + ". I am " + age +" years old.";
        return intro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person= (Person) obj;
            return this.id == person.id;
        }
        return false;
    }
}
