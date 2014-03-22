package ru.kpfu.npp.math;

/**
 * Created by Zahvat on 15.03.14.
 */
public interface Matrix {
    int getValue(int row, int column);
    int setValue(int row, int column, int value);
    String toString();
}
