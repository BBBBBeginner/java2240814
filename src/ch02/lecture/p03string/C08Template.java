package ch02.lecture.p03string;

public class C08Template {
    public static void main(String[] args) {
        String name = "흥민";
        int age = 33;

        // 이름은 흥민, 나이는 33
        String a = "이름은" + name + ", 나이는" + age;
        System.out.println(a);
        System.out.printf("이름은 %s, 나이는 %d%n", name, age);

        // string template
        String b = STR."이름은 \{name}, 나이는 \{age}";
        System.out.println(b);

        //

        String title = "내 웹페이지";

        String html1 = """
                <html>
                    <head>
                        <title>""" + title + """
                        <title>
                    <head>
                </html>
                """;
        String html2 = STR."""
                <html>
                    <head>
                        <title>\{title}<title>
                    <head>
                </html>
                """;
        System.out.println(html1);
        System.out.println(html2);
    }
}
