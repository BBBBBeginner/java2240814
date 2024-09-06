package ch13.sec03;

public class GenericExample {

    // 제네릭 메소드와 그 사용 예제

    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        Integer v = box1.get();
        System.out.println("v = " + v);

        Box<String> box2 = boxing("홍길동");
        String s = box2.get();
        System.out.println("s = " + s);
    }
}
