package ch06.lecture.p03method.p03_ex_methodoverloading;

public class Calculator {
    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }
}