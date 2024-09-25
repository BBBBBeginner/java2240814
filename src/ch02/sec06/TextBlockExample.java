package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "\n" +
                "\t\"id\":\"winter\"\n";

        String str2 = """
                    "id":"winter"
                """;

        System.out.println(str1);
        System.out.println("---------------------------------------");
        System.out.println(str2);
        System.out.println("---------------------------------------");

        String str = """
                나는 자바를 \
                학습합니다.
                자바의 고수가 되겠습니다.
                """;

        System.out.println(str);

    }
}
