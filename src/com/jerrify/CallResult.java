package com.jerrify;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CallResult<T> {

    private final List<Pair<T, T>> pairs;

    public CallResult() {
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
}
