/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.util.value;

/**
 * A pair of the same type objects.
 *
 * @param <T> the type.
 * @param x   the first value.
 * @param y   the second value.
 * @author squid233
 * @since 0.1.0
 */
public /* value */ record Pair<T>(T x, T y) {
    /**
     * {@return {@link #x}}
     */
    public T first() {
        return x;
    }

    /**
     * {@return {@link #y}}
     */
    public T second() {
        return y;
    }

    /**
     * {@return {@link #x}}
     */
    public T left() {
        return x;
    }

    /**
     * {@return {@link #y}}
     */
    public T right() {
        return y;
    }

    /**
     * {@return {@link #x}}
     */
    public T key() {
        return x;
    }

    /**
     * {@return {@link #y}}
     */
    public T value() {
        return y;
    }

    /**
     * A pair of integers.
     *
     * @param x the first value.
     * @param y the second value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfInt(int x, int y) {
    }

    /**
     * A pair of longs.
     *
     * @param x the first value.
     * @param y the second value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfLong(long x, long y) {
    }

    /**
     * A pair of floats.
     *
     * @param x the first value.
     * @param y the second value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfFloat(float x, float y) {
    }

    /**
     * A pair of doubles.
     *
     * @param x the first value.
     * @param y the second value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfDouble(double x, double y) {
    }
}
