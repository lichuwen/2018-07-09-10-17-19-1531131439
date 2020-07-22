package practice03;

public class Worker extends Person{

    Worker(String name, int age){
        super(name,age);
    }
    public String introduce(){
        String intro = "I am a Worker. I have a job.";
        return intro;
    }
}
