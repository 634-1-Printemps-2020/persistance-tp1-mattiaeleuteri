package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {

        testCounter();
        testUpperLimitedPositiveCounter();
    }

    private static void testUpperLimitedPositiveCounter() {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 5);
        try {
            counter.add(10);
            System.out.println("bug");
        } catch (CounterException e) {
            System.out.println("ok");
        }

    }

    private static void testCounter() throws CounterException {
        Counter counter;

        // test  constructeur
        counter = new Counter();
        if (counter.getValue() != 0){
            throw new IllegalArgumentException("constructeur test failed");
        }

        counter = new Counter(9);
        if (counter.getValue() != 9){
            throw new IllegalArgumentException("constructeur test failed");
        }

        // test add
        counter = new Counter();
        counter.add(5);
        if (counter.getValue() != 5){
            throw new IllegalArgumentException("test add failed");
        }

        counter = new Counter();
        counter.add(-5);
        if (counter.getValue() != -5){
            throw new IllegalArgumentException("test add failed");
        }
    }
}