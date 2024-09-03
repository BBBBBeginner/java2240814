package ch16.sec05.ex2;

public class MerhodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);
    }
}
