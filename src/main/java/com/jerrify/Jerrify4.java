package main.java.com.jerrify;

import java.util.Optional;
import java.util.function.Function;

public class Jerrify4 implements Jerrify<Integer> {

    /**
     * Try to find the single point
     * where a function is equal to a value.
     *
     */
    private static Optional<Integer> bsearch(final Function<Integer, Integer> g, final int z) {
        int a = -1;
        int b = z + 1;
        int m;
        int value;
        while (a + 1 != b) {
            m = (a + b) / 2;
            value = g.apply(m);
            if (value < z) a = m;
            else if (value > z) b = m;
            else return Optional.of(m);
        }
        return Optional.empty();
    }

    /**
     * Fourth version of jerrify function
     *
     * O(z) = z log z
     */
    @Override
    public CallResult<Integer> invent(final CallMeeseeks<Integer> meeseeks, final Integer z) {
        final CallResult<Integer> result = new CallResult<>();
        for (int x = 0; x <= z; x += 1) {
            final int x0 = x;
            bsearch(y -> meeseeks.call(x0, y), z).ifPresent(y -> result.add(x0, y));
        }
        return result;
    }
}
