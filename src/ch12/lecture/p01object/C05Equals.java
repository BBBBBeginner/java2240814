package ch12.lecture.p01object;

import java.util.Objects;

public class C05Equals {
}

class MyClass5 {
    private String name;
    private int age;
    private String address;

    //intellij 도구 이용
    @Override
    public int hashCode() {
        return Objects.hash(name, age, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass5 o) {
            if (this.name.equals(o.name)) {
                return true;
            }
        }
        return false;
    }
}
