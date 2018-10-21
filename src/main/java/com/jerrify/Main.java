package main.java.com.jerrify;

public class Main {

    public static void main(String[] args) {
        // x + y
        final CallMeeseeks<Integer> m0 = new CallMeeseeks<>((x, y) -> x + y);
        // (x + 1) * 2^y + 11
        final CallMeeseeks<Integer> m1 = new CallMeeseeks<>((x, y) -> (x + 1) * (int) Math.pow(2d, (double) y) + 11);
        // 3^x + 3 * y
        final CallMeeseeks<Integer> m2 = new CallMeeseeks<>((x, y) -> (int) Math.pow(3d, (double) x) + 3 * y);
        // 2 * x + 2 * y + 22
        final CallMeeseeks<Integer> m3 = new CallMeeseeks<>((x, y) -> 2 * x + 2 * y + 22);

        // known jerrify functions
        final JerrifyInterface<Integer> j0 = new Jerrify0();
        final JerrifyInterface<Integer> j1 = new Jerrify1();
        final JerrifyInterface<Integer> j2 = new Jerrify2();
        final JerrifyInterface<Integer> j3 = new Jerrify3();

        // an experiment
        final JerrifyInterface<Integer> jerrify = j3;
        final CallMeeseeks<Integer> meeseeks = m3;
        final int z = 5_000;

        // the result is
        final CallResult<Integer> result = jerrify.invent(meeseeks, z);
        System.out.println(result.toString());
        System.out.printf("Total: %d\n", result.size());
        System.out.printf("Number of meeseeks getCalls: %d\n", meeseeks.getCalls());
    }

}
