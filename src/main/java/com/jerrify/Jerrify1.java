package main.java.com.jerrify;

public class Jerrify1 implements Jerrify<Integer> {

    /**
     * First version of jerrify function
     *
     * O(z)worst = (z + 1)^2 / 2 + 1
     */
    @Override
    public Result<Integer> invent(final Meeseeks<Integer> meeseeks, final Integer z) {
        final Result<Integer> result = new Result<>();
        final int min = meeseeks.call(0, 0);
        for (int x = 0; x <= z - min; x += 1) {
            for (int y = 0; y <= z - x - min; y += 1) {
                if (meeseeks.call(x, y).equals(z)) {
                    result.add(x, y);
                }
            }
        }
        return result;
    }

}
