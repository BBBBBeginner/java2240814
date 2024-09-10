package ch15.sec05.exam2;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("홍길동", 45));
        set.add(new Person("감자바", 25));
        set.add(new Person("박지원", 31));

        set.forEach(e -> System.out.println(e.name + ":" + e.age));
    }

}

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.name.compareTo(this.name);
//        return this.name.compareTo(o.name);
//        return o.age - this.age;
    }
}