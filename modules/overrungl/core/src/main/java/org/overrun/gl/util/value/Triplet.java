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

package org.overrun.gl.util.value;

/**
 * A triplet of the same type objects.
 *
 * @param <T> the type.
 * @param x   the first value.
 * @param y   the second value.
 * @param z   the third value.
 * @author squid233
 * @since 0.1.0
 */
public /* value */ record Triplet<T>(T x, T y, T z) {
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
     * {@return {@link #z}}
     */
    public T third() {
        return z;
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
    public T middle() {
        return y;
    }

    /**
     * {@return {@link #z}}
     */
    public T right() {
        return z;
    }

    /**
     * A triplet of integers.
     *
     * @param x the first value.
     * @param y the second value.
     * @param z the third value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfInt(int x, int y, int z) {
    }

    /**
     * A triplet of longs.
     *
     * @param x the first value.
     * @param y the second value.
     * @param z the third value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfLong(long x, long y, long z) {
    }

    /**
     * A triplet of floats.
     *
     * @param x the first value.
     * @param y the second value.
     * @param z the third value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfFloat(float x, float y, float z) {
    }

    /**
     * A triplet of doubles.
     *
     * @param x the first value.
     * @param y the second value.
     * @param z the third value.
     * @author squid233
     * @since 0.1.0
     */
    public record OfDouble(double x, double y, double z) {
    }
}
