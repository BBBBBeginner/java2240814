package ch15.lecture.p01List;

import java.util.ArrayList;
import java.util.List;

public class C03List {
    public static void main(String[] args) {
        //List : 순서가 있다.
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("css");
        list.add("html");

        System.out.println(list);


        //같은 객체 여러번 추가
        list.add("java");
        list.add("html");
        System.out.println(list);

        //null
        list.add(null);
        list.add(null);
        System.out.println(list);

        // remove
        list.remove("css");
        System.out.println(list);
        list.remove("html");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
