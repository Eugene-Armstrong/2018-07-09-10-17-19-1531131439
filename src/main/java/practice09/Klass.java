package practice09;

public class Klass {
    public int number;
    public Student leader;
    public Klass(int number){
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if(student.klass!=this){
            System.out.print("It is not one of us.\n");
        }else{
            this.leader = student;
        }
    }

    public Student getLeader(){
        return this.leader;
    }

    public void appendMember(Student student){
        student.klass = this;
    }
}
