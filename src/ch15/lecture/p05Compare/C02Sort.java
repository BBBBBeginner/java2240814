package ch15.lecture.p05Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Sort {
    public static void main(String[] args) {
        List<Book2> books = new ArrayList<>();
        books.add(new Book2("java", 500));
        books.add(new Book2("git", 600));
        books.add(new Book2("react", 300));
        books.add(new Book2("spring", 700));
        books.add(new Book2("vue", 400));

        books.forEach(System.out::println);

        Collections.sort(books);
        System.out.println("-정렬후-");
        System.out.println(books);
    }
}


class Book2 implements Comparable<Book2> {//COmparable 인스트먼트
    private String title;
    private int price;

    // 생성자, getter, setter, toString

    public Book2(String title, int price) {
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book2{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Book2 o) { //객체를 비교하여 정렬 순서를 결정합니다.
        return this.price - o.price;


        // 음수 : 이 객체가 작으면
//        if (this.price < o.price) {
//            return -1000;
//        }
//
//
//        // 0 : 두 객체가 같으면
//        if (this.price == o.price) {
//            return 0;
//        }
//
//        // 양수 : 이 객체가 크면
//        if (this.price > o.price) {
//            return 22342;
//        }
//        return 0;
    }
}
