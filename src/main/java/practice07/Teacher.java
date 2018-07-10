package practice07;

public class Teacher extends Person{
    public String name;
    public int age;
    public Klass klass;

    public Teacher(String name, int age, Klass klass){
        super(name,age);
        setKlass(klass);
    }

    public Teacher(String name, int age){
        super(name,age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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
        Person p = new Person(name,age);
        String result = p.introduce() +" I am a Teacher. I teach ";
        result += klass == null?"No Class.":klass.getDisplayName()+".";
        return result;
    }

    public String introduceWith(Student student){
        Person p = new Person(name,age);
        String result = p.introduce() +" I am a Teacher. I ";
        result += klass == student.klass?"teach "+student.name+".":"don't teach "+student.name+".";
        return result;
    }
}