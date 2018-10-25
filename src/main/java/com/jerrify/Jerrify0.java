package main.java.com.jerrify;

public class Jerrify0 implements Jerrify<Integer> {

    /**
     * Initial version of jerrify function
     *
     * O(z) = (z + 1)^2
     */
    @Override
    public Result<Integer> invent(final Meeseeks<Integer> meeseeks, final Integer z) {
        final Result<Integer> result = new Result<>();
        for (int x = 0; x <= z; x += 1) {
            for (int y = 0; y <= z; y += 1) {
                if (meeseeks.call(x, y).equals(z)) {
                    result.add(x, y);
                }
            }
        }
        return result;
    }

}
