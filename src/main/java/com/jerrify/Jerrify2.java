package main.java.com.jerrify;

public class Jerrify2 implements Jerrify<Integer> {

    /**
     * Second version of jerrify function
     *
     * O(z)best = z + 1
     * O(z)worst = 2z + 1
     */
    @Override
    public Result<Integer> invent(final Meeseeks<Integer> meeseeks, final Integer z) {
        final Result<Integer> result = new Result<>();
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
