package practice06;

public class Teacher extends Person{
    public String name;
    public int age;
    public int klass;

    public Teacher(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name,age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
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
        result += klass == 0?"No Class.":"Class "+klass+".";
        return result;
    }
}
