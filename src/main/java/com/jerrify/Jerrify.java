package main.java.com.jerrify;

public interface Jerrify<T> {

    CallResult<T> invent(CallMeeseeks<T> meeseeks, T z);

}
