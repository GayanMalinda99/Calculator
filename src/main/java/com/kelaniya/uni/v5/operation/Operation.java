package com.kelaniya.uni.v5.operation;

//Abstract class (public abstract Operation()) Or Interface Class (public interface Operation())
public interface Operation {

    Double execute(Double[] numbers) throws InvalidCalOperationException;

}
