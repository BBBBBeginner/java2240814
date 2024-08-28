package p06_lecture.lecture.p05Static.p05_ex_Television;

public class Television {

    static String company = "myCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
