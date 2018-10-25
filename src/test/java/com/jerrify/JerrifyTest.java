package test.java.com.jerrify;

import main.java.com.jerrify.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class JerrifyTest {

    private final static int z = 5_000;

    private Jerrify<Integer> jerrify0; // reference jerrify
    private Jerrify<Integer> jerrify; // under testing jerrify

    private BiFunction<Integer, Integer, Integer> fn;

    public JerrifyTest(final BiFunction<Integer, Integer, Integer> fn) {
        this.fn = fn;
    }

    @Before
    public void prepare() {
        this.jerrify0 = new Jerrify0();
        this.jerrify = new Jerrify4();
    }

    @Parameterized.Parameters
    public static List<BiFunction<Integer, Integer, Integer>> functions() {
        return Arrays.asList(
                (x, y) -> x + y,
                (x, y) -> x * (y + 3),
                (x, y) -> (int) Math.pow(2d, (double) x) + 2 * y + 2
        );
    }

    @Test
    public void shouldInvent() {
        final CallResult<Integer> result0 = jerrify0.invent(new CallMeeseeks<>(this.fn), z);
        final CallResult<Integer> result = jerrify.invent(new CallMeeseeks<>(this.fn), z);

        assertEquals(result0, result);
        System.out.printf("Number of options: %d\n", result.size());
    }

}