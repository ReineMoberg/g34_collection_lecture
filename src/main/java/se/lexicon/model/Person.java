package se.lexicon.model;

public class Person implements Comparable<Person>{

    private int id;
    private String name;
    private String email;
    private int age;

    public Person() {
    }

    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }


    // if we want to sort data in tree set we must implement this method
    @Override
    public int compareTo(Person obj) {
        if (obj == null){
            return -1;
        }
        // small to big
        // big to small
        if (obj.getId() < this.getId()){
            return -1;
        } else if (obj.getId() == this.getId()){
            return 0;
        } else{
            return 1;
        }

    }
}
