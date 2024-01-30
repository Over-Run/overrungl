/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.internal;

/**
 * Quick create exceptions
 *
 * @author squid233
 * @since 0.1.0
 */
@Deprecated(since = "0.1.0")
public final class Exceptions {
    /**
     * {@link IllegalStateException}
     */
    public static final StringTemplate.Processor<IllegalStateException, RuntimeException> ISE = stringTemplate ->
        new IllegalStateException(stringTemplate.interpolate());

    /**
     * {@link IllegalArgumentException}
     */
    public static final StringTemplate.Processor<IllegalArgumentException, RuntimeException> IAE = stringTemplate ->
        new IllegalArgumentException(stringTemplate.interpolate());

    private Exceptions() {
        //no instance
    }
}
