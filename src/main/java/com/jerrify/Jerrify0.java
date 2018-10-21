package main.java.com.jerrify;

public class Jerrify0 implements JerrifyInterface<Integer> {

    /**
     * Initial version of jerrify function
     *
     * O(z) = (z + 1)^2
     */
    @Override
    public CallResult<Integer> invent(final CallMeeseeks<Integer> meeseeks, final Integer z) {
        final CallResult<Integer> result = new CallResult<>();
        for (int x = 0; x <= z; x += 1) {
            for (int y = 0; y <= z; y += 1) {
                if (meeseeks.call(x, y) == z) {
                    result.add(x, y);
                }
            }
        }
        return result;
    }

}
