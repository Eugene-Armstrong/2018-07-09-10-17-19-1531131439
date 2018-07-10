package practice08;

public class Student extends Person{
    public Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id,name,age);
        setKlass(klass);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        String result = super.introduce()+" I am a Student. I am ";
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
