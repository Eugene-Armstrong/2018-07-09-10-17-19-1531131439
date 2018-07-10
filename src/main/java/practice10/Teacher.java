package practice10;

import java.util.LinkedList;

public class Teacher extends Person{
    public int id;
    public String name;
    public int age;
    public Klass klass;
    public LinkedList<Klass> classes;

    public Teacher(int id,String name, int age, LinkedList<Klass> classes){
        super(id,name,age);
        setClasses(classes);
    }

    public Teacher(int id,String name, int age, Klass klass){
        super(id,name,age);
        setKlass(klass);
    }

    public Teacher(int id,String name, int age){
        super(id,name,age);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
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
        Person p = new Person(id,name,age);
        String result = p.introduce() +" I am a Teacher. I teach ";
        if(classes != null){
            if(classes.size() == 0){
                result += "No Class.";
            }else{
                String str = "Class ";
                for(Klass k :classes){
                    str += k.number + ", ";
                }
                result += str.substring(0,str.length()-2) + ".";
            }

        }else {
            result += klass == null?"No Class.":klass.getDisplayName()+".";
        }
        return result;
    }

    public String introduceWith(Student student){
        Person p = new Person(id,name,age);
        String result = p.introduce() +" I am a Teacher. I ";
        result += isTeaching(student)?"teach "+student.name+".":"don't teach "+student.name+".";
        return result;
    }

    public boolean isTeaching(Student student){
        boolean chk = false;
        for(Klass k : classes){
            chk = k.isIn(student);
            if(chk){break;}
        }
        return chk;
    }
}
