package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    protected int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException {
        value++;
    }

    @Override
    public void add(int step) throws CounterException {
        value += step;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
