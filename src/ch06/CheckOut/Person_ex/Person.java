package ch06.CheckOut.Person_ex;

public class Person {
    private String name;  // private 필드
    private int age;      // private 필드

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {  // 나이는 음수일 수 없으므로 유효성 검사
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}