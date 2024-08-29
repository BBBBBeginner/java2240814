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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //boolean 의 getter 메소드는 is 로 시작
    public void isMarried(boolean married) {
        this.married = married;
    }

    public boolean isEnabled() {
        return enabled;
    }
}