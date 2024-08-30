package ch08.lecture.p01interface;

public class C01Interface {
}

// 인터페이스의 역할 :  서브클래스 혹은 부모클래스 들을 묶어 하나로 정의하여 그룹화 시킴.
// 각각의 개별 자식계체인 Shark1 과 Nimo1,Whale1들을 해양생물(Aquatic1)로 묶어 정의
// @formatter:off
interface Aquatic1 {}
interface  Beast1 {}


class Animal1 {}
class Fish1 extends Animal1{}
class Shark1 extends Fish1 implements Aquatic1 {}
class Nimo1 extends Fish1 implements  Aquatic1 {}

class Mammal1 extends Animal1 {}
class Tiger1 extends Mammal1{}
class Maltese1 extends Mammal1 {}
class Whale1 extends Mammal1 implements Aquatic1{}
