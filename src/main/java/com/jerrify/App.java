package main.java.com.jerrify;

public class App {

    public static void main(String[] args) {
        final Meeseeks<Integer> meeseeks = new Meeseeks<>((x, y) ->
                x * (y + 3)
        );
        final int z = 5_000;
        final Jerrify<Integer> jerrify = new Jerrify4();

        final Result<Integer> result = jerrify.invent(meeseeks, z);
        System.out.println(result.toString());
        System.out.printf("Total: %d\n", result.size());
        System.out.printf("Number of meeseeks calls: %d\n", meeseeks.getCalls());
    }

}
