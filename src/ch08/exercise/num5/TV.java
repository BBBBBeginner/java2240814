package ch08.exercise.num5;

public class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 킵니다.");
    }


    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}

