package ch.hesge.cours634.counter;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

class UpperLimitedPositiveCounterTest {

    @Test
    @Ignore
    void inc() {
    }

    @Test (expected = CounterException.class)
    void add() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(0, 5);
        counter.add(10);
    }
}