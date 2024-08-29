package ch07.Example.P04Ex325;

public class InstanceofExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name =" + person.name);
        person.walk();

        //Person이 참조하는 객체가 Student 타입인지 확인
        if (person instanceof Student student) {
            System.out.println("studentno : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        //Student 객체를 매개값으로 제공하고 personinfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
