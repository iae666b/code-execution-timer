package io.github.iae666b;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HowToUse {
    @Test
    public void test() {
        long time = ExecutionTimer.calculate(new Sum1000());
        Assertions.assertTrue(time >= 0);
    }
}
