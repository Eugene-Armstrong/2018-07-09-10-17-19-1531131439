package practice09;

public class Person {
    public int id;
    public String name;
    public int age;

    public Person(int id,String name, int age){
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Person personObj = (Person)obj;
        if(personObj != null && personObj.id == id){
            return true;
        }else{
            return false;
        }
    }
}
