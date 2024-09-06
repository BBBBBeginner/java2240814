package ch13.sec03;

// 제네릭 클래스 정의
public class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
