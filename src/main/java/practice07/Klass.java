package practice07;

public class Klass {
    public int number;
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
        String result = number == 0?"No Class.":"Class "+number;
        return result;
    }
}
