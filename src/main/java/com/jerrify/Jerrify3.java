package main.java.com.jerrify;

import java.util.function.Function;

public class Jerrify3 implements JerrifyInterface<Integer> {

    /**
     * Find the max possible parameter
     * when a function is equal to or less than a value.
     *
     */
    private static int bsearch(final Function<Integer, Integer> g, final int z) {
        int a = -1;
        int b = z + 1;
        int m;
        while (a + 1 != b) {
            m = (a + b) / 2;
            if (g.apply(m) <= z) a = m;
            else b = m;
        }
        return a;
    }

    /**
     * Third version of jerrify function
     *
     * O(z)best 2 log z + m min n
     * O(z)worst 2 log z + m + n
     */
    @Override
    public CallResult<Integer> invent(final CallMeeseeks<Integer> meeseeks, final Integer z) {
        final CallResult<Integer> result = new CallResult<>();
        final int n = bsearch(x -> meeseeks.call(x, 0), z);
        final int m = bsearch(y -> meeseeks.call(0, y), z);
        int u = 0;
        int v = m;
        int value;
        while (u <= n && v >= 0) {
            value = meeseeks.call(u, v);
            if (value < z)  u += 1;
            else if (value > z) v -= 1;
            else {
                result.add(u, v);
                u += 1;
                v -= 1;
            }
        }
        return result;
    }
}
