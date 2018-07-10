package practice06;

public class Teacher extends Person{
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

    public String introduce(){
        String result = super.introduce() +" I am a Teacher. I teach ";
        result += klass == 0?"No Class.":"Class "+klass+".";
        return result;
    }
}
