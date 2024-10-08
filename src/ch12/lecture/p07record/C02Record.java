package ch12.lecture.p07record;

//record 읽기 전용 객체
public class C02Record {
    public static void main(String[] args) {
        Book2 b1 = new Book2("java", "shin", 3000);
        Book2 b2 = new Book2("git", "linus", 5000);
        Book2 b3 = new Book2("git", "linus", 5000);


        //getter 에 get
        System.out.println(b1.title());
        System.out.println(b2.title());
        System.out.println(b3.title());

        System.out.println(b1.toString());
        System.out.println(b2.hashCode());
        System.out.println(b3.hashCode());
        System.out.println(b2.equals(b3));

    }

}

record Book2(
        String title,
        String author,
        int price
) {

}

