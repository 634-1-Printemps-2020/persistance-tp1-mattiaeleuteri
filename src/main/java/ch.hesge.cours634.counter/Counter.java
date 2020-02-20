package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void inc() throws CounterException {
        this.value += 1;
    }

    public void add(int step) throws CounterException {
        this.value += step;
    }

    public int getValue() {
        return this.value;
    }

}
