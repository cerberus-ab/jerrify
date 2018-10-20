package com.jerrify;

import java.util.function.BiFunction;

public class CallMeeseeks<T> {

    private int calls;
    private final BiFunction<T, T, T> meeseeks;

    public CallMeeseeks(final BiFunction<T, T, T> meeseeks) {
        this.calls = 0;
        this.meeseeks = meeseeks;
    }

    public T call(final T x, final T y) {
        this.calls += 1;
        return meeseeks.apply(x, y);
    }

    public int getCalls() {
        return this.calls;
    }
}
