package p06_lecture.lecture.p09encapsulation;

public class C02GetterSetter {
}

// 필드는 특별한 이유가 없다면 private으로
// 필드값 변경,쓰는것(setter)/읽기(getter) 매소드를 public으로 작성.

class MyClass02 {
    private int age;
    private String name;
    private String email;
    private String address;
    private boolean married;
    private boolean enabled;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    //    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//    //boolean 의 getter 메소드는 is 로 시작
//    public void isMarried(boolean married) {
//        this.married = married;
//    }
//
//    public boolean isEnabled() {
//        return enabled;
//    }
}