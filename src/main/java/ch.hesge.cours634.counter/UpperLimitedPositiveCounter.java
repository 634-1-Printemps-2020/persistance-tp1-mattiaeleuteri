package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int min = 0;
    private int max;
    private int value;

    public UpperLimitedPositiveCounter(int min, int max, int value) {
        super(value);
        this.min = min;
        this.max = max;
    }

    public void inc() throws CounterException {
        this.value += 1;
    }

    public void add(int step) throws CounterException {
        if (step < min){
            throw new CounterException("Negative value is not allowed");
        }
        else if (step > max){
            throw new CounterException("Value is over the maximum value allowed");
        }
        this.value += step;
    }

    public int getValue() {
        return super.getValue();
    }


}
