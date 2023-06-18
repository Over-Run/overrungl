/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
 * A tuple of 2 objects.
 *
 * @param <T> the first type.
 * @param <U> the second type.
 * @param x   the first value.
 * @param y   the second value.
 * @author squid233
 * @since 0.1.0
 */
public /* value */ record Tuple2<T, U>(T x, U y) {
    /**
     * {@return {@link #x}}
     */
    public T first() {
        return x;
    }

    /**
     * {@return {@link #y}}
     */
    public U second() {
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
    public U right() {
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
    public U value() {
        return y;
    }

    /**
     * A value object with an object and an integer.
     *
     * @param x   the first value.
     * @param y   the second value.
     * @param <T> the type of first value object.
     * @author squid233
     * @since 0.1.0
     */
    public record OfObjInt<T>(T x, int y) {
    }
}
