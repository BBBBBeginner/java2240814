package chapter02_lecture.CH3_EX.p03예제;

public class _53p {
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
