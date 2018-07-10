package practice07;

public class Student extends Person{
    public String name;
    public int age;
    public Klass klass;
    public Student(String name, int age, Klass klass){
        super(name,age);
        setKlass(klass);
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

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        Person p = new Person(name,age);
        return p.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
    }
}