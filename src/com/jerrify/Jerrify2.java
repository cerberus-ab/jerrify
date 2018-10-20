package com.jerrify;

public class Jerrify2 implements JerrifyInterface<Integer> {

    /**
     * Second version of jerrify function
     *
     * O(z)best z + 1
     * O(z)worst 2z + 1
     */
    @Override
    public CallResult<Integer> ask(final CallMeeseeks<Integer> meeseeks, final Integer z) {
        final CallResult<Integer> result = new CallResult<>();
        int u = 0;
        int v = z;
        int value;
        while (u <= z && v >= 0) {
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
