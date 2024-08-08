package io.github.iae666b;

public class Sum1000 extends Algorithm {

    @Override
    public void execute() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
    }
}
