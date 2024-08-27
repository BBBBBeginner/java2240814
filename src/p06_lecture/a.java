package p06_lecture;

public class a {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");

    }
}

class Member {
    String name;
    String engName;

    Member(String name, String id) {
        this.name = name;
        this.engName = id;

    }
}