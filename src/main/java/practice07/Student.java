package practice07;

public class Student extends Person{
    public Klass klass;
    public Student(String name, int age, Klass klass){
        super(name,age);
        setKlass(klass);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
    }
}