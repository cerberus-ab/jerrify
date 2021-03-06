package main.java.com.jerrify;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result<T> {

    private final List<Pair<T, T>> pairs;

    public Result() {
        this.pairs = new ArrayList<>();
    }

    public void add(final T x, final T y) {
        this.pairs.add(new Pair<>(x, y));
    }

    public int size() {
        return pairs.size();
    }

    @Override
    public String toString() {
        return pairs.stream()
                .map(pair -> String.format("(%s, %s)", pair.getKey(), pair.getValue()))
                .collect(Collectors.joining("\n"));
    }

    @Override
    public boolean equals(final Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof Result<?>) {
            if (((Result<?>)other).pairs.equals(pairs)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return pairs.hashCode();
    }
}
