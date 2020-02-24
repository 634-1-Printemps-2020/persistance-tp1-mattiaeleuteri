package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int max;

    public UpperLimitedPositiveCounter(int initial, int max) {
        super(initial);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        CheckMax(value + 1 > max, "Counter can not exceed max value " + max);

        super.inc();
    }

    @Override
    public void add(int step) throws CounterException {
        if(value+step > max){
            throw new CounterException("Counter can not exceed max value " + max);
        } else CheckMax(value + step < 0, "Counter can not be negative ");

        super.add(step);
    }

    private void CheckMax(boolean b, String s) throws CounterException {
        if (b) {
            throw new CounterException(s);
        }
    }

    @Override
    public String toString() {
        return "UpperLimitedPositiveCounter{" +
                "max=" + max +
                ", value=" + value +
                '}';
    }
}
