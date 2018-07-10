package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements NotifyLeaderListener{

    public Klass klass;
    public LinkedList<Klass> classes;

    public Teacher(int id,String name, int age, LinkedList<Klass> classes){
        super(id,name,age);
        setClasses(classes);
        for(Klass k :classes){
            k.addNotifyListener(this);
        }
    }

    public Teacher(int id,String name, int age, Klass klass){
        super(id,name,age);
        setKlass(klass);
        klass.addNotifyListener(this);
    }

    public Teacher(int id,String name, int age){
        super(id,name,age);
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

    @Override
    public void notifyAppendListener(Student student){
        System.out.print("I am "+name+". I know "+student.name+" has joined Class "+student.klass.number+".\n");
    }

    @Override
    public void notifyLeaderListener(Student student){
        System.out.print("I am "+name+". I know "+student.name+" become Leader of Class "+student.klass.number+".\n");
    }
}
