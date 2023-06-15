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

package org.overrun.glib.util.value;

/**
 * A tuple of 4 objects.
 *
 * @param <T> the first type.
 * @param <U> the second type.
 * @param <V> the third type.
 * @param <W> the fourth type.
 * @param x   the first value.
 * @param y   the second value.
 * @param z   the third value.
 * @param w   the fourth value.
 * @author squid233
 * @since 0.1.0
 */
public /* value */ record Tuple4<T, U, V, W>(T x, U y, V z, W w) {
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
     * {@return {@link #z}}
     */
    public V third() {
        return z;
    }

    /**
     * {@return {@link #w}}
     */
    public W fourth() {
        return w;
    }
}
