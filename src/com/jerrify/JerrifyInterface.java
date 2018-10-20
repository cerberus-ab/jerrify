package com.jerrify;

public interface JerrifyInterface<T> {

    CallResult<T> ask(CallMeeseeks<T> meeseeks, T z);

}
