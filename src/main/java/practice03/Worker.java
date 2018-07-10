package practice03;

public class Worker extends Person{
    public String name;
    public int age;
    public Worker(String name, int age){
        super(name,age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return "I am a Worker. I have a job.";
    }
}
