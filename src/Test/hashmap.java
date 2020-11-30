package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashmap {

    private Map<Person, String> hashMap = new HashMap<>();

    private void createMap() {

        hashMap.put(new Person(1, "Ram", 35, "Male"), "Working At PayPal As Developer");
        hashMap.put(new Person(2, "Siva", 45, "Male"), "Working At PayPal As Manager");

        //System.out.println("%%%%%" + hashMap.get(P1));



    }

    public static void main(String[] args) {
        hashmap hm = new hashmap();
        Person P1 = new Person(1, "Ram", 35, "Male");
        Person P2 = new Person(1, "n", 39, "female");

        if(P1.equals(P2)){
            System.out.println("Equals");
        }else
            System.out.println("Not Equals");


        hm.createMap();


        long id = 1;
        String name = "Ram";
        int age = 35;
        String sex = "Male";

    }

}

class Person {
    long id;
    String name;
    int age;
    String sex;

    public Person(long id, String name, int age, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }

    //getters and setters
}

