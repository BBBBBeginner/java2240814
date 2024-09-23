package ch14.sec06;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    synchronized public void setMemory2(int memory) {
        this.memory = memory;
    }

    public void setMemory1(int memory) {
        synchronized (this) {
            this.memory = memory;
        }
    }
}