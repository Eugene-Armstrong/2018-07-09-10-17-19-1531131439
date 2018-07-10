package practice01;

public class Person {
    public String name;
    public int age;

    public Person(String name, Integer age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }
}
