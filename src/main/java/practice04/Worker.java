package practice04;

import practice04.Person;

public class Worker extends Person {

    Worker(String name, int age){
        super(name,age);
    }
    public String introduce(){
        String basicInto = super.introduce() + ' ';
        String intro = basicInto + "I am a Worker. I have a job.";
        return intro;
    }
}
