package ch15.lecture.p07Stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        // Stack(LIFO, Last In First Out)

        Stack<String> stack = new Stack<>();

        // element 추가
        stack.push("java");
        stack.push("css");
        stack.push("vue");
        stack.push("sql");
        stack.push("css");

        // pop : 원소 꺼내기
        String item1 = stack.pop();
        System.out.println("item1 = " + item1);
        String item2 = stack.pop();
        System.out.println("item2 = " + item2);


        // element 꺼내기
        // size : 원소 수
        int size = stack.size();
        System.out.println("size = " + size);

        // 확인하기
        //peek : 마지막 원소 확인
        String item3 = stack.peek();
        System.out.println("item3 =" + item3);
        System.out.println("stack.size()" + stack.size());


    }
}
