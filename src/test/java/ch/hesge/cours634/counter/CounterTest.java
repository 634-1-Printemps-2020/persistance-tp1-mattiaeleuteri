package ch.hesge.cours634.counter;



import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

class CounterTest {

    @Test
    void inc() throws CounterException {
        // test inc
        Counter counter = new Counter();
        counter.inc();
        Assert.assertEquals(1, counter.getValue());
    }

    @Test
    void add() {
    }

    @Test
    void getValue() {
    }
}