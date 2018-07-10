package practice09;

public class Student extends Person{
    public int id;
    public String name;
    public int age;
    public Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        setKlass(klass);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
        Person p = new Person(id,name,age);
        String result = p.introduce()+" I am a Student. I am ";
        if(klass.leader!=null){
            result += isSamePerson(klass.leader)?"Leader of ":"at ";
        }else{
            result += "at ";
        }
        result += klass.getDisplayName()+".";
        return result;
    }

    public boolean isSamePerson(Student student){
        return student.id == id;
    }
}

