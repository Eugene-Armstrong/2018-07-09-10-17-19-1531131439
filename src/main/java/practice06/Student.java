package practice06;

public class Student extends Person{
    public String name;
    public int age;
    public int klass;
    public Student(String name, int age, int klass){
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

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        Person p = new Person(name,age);
        return p.introduce()+" I am a Student. I am at Class "+klass+".";
    }
}
