package ch13.lecture.p03polymorpism;

public class C04Wildcard {
    public static void main(String[] args) {
        var b1 = new Box4<String>();
        var b2 = new Box4<Long>();
        var b3 = new Box4<Object>();

//        printItem(b1);
//        printItem(b2);
        printItem(b3);
    }

    static void printItem(Box4<Object> p) {
        Object item = p.getItem();
        System.out.println("item = " + item);
    }
}

// wildcard : parameter, return 에 사용됨

class Box4<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}