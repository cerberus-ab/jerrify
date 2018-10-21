package main.java.com.jerrify;

import java.util.function.BiFunction;

public class CallMeeseeks<T> {

    private int calls;
    private final BiFunction<T, T, T> function;

    public CallMeeseeks(final BiFunction<T, T, T> function) {
        this.calls = 0;
        this.function = function;
    }

    public T call(final T x, final T y) {
        this.calls += 1;
        return function.apply(x, y);
    }

    public int getCalls() {
        return this.calls;
    }
}
