package ch12.sec11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Car.class; // Car 클래스의 Class 객체를 가져옵니다.

        System.out.println("[생성자 정보]");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors(); // 생성자 정보를 가져옵니다.
        for (Constructor<?> constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class<?>[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields(); // 필드 정보를 가져옵니다.
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]"); // 수정: 대괄호를 잘못 사용했습니다.
        Method[] methods = clazz.getDeclaredMethods(); // 메소드 정보를 가져옵니다.
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class<?>[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    public static void printParameters(Class<?>[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if (i < (parameters.length - 1)) {
                System.out.print(", "); // 수정: 출력할 때 쉼표를 붙입니다.
            }
        }
    }
}