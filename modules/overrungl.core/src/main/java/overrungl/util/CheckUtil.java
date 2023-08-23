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

package overrungl.util;

import java.lang.foreign.MemorySegment;
import java.util.function.Supplier;

/**
 * The check utilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class CheckUtil {
    private CheckUtil() {
        //no instance
    }

    /**
     * Checks whether the given condition is {@code true}.
     *
     * @param condition the condition.
     * @throws IllegalStateException if <i>{@code condition}</i> is {@code false}.
     * @see #check(boolean, Supplier)
     * @see #check(boolean, String)
     */
    public static void check(boolean condition) throws IllegalStateException {
        check(condition, "condition == false");
    }

    /**
     * Checks whether the given condition is {@code true}. The message of the exception is wrapped in a supplier
     * to avoid side effect.
     *
     * @param condition       the condition.
     * @param messageSupplier the message supplier of the exception.
     * @throws IllegalStateException if <i>{@code condition}</i> is {@code false}.
     * @see #check(boolean)
     * @see #check(boolean, String)
     */
    public static void check(boolean condition, Supplier<String> messageSupplier) throws IllegalStateException {
        if (!condition) throw new IllegalStateException(messageSupplier.get());
    }

    /**
     * Checks whether the given condition is {@code true}.
     *
     * @param condition the condition.
     * @param message   the message of the exception.
     * @throws IllegalStateException if <i>{@code condition}</i> is {@code false}.
     * @see #check(boolean)
     * @see #check(boolean, Supplier)
     */
    public static void check(boolean condition, String message) throws IllegalStateException {
        if (!condition) throw new IllegalStateException(message);
    }

    /**
     * Checks whether the given segment is not {@code NULL}.
     *
     * @param segment the segment.
     * @throws IllegalStateException if <i>{@code segment}</i> is {@code NULL}.
     * @see #checkNotNullptr(MemorySegment, Supplier)
     * @see #checkNotNullptr(MemorySegment, String)
     */
    public static void checkNotNullptr(MemorySegment segment) throws IllegalStateException {
        checkNotNullptr(segment, "condition == false");
    }

    /**
     * Checks whether the given segment is not {@code NULL}. The message of the exception is wrapped in a supplier
     * to avoid side effect.
     *
     * @param segment         the segment.
     * @param messageSupplier the message supplier of the exception.
     * @throws IllegalStateException if <i>{@code segment}</i> is {@code NULL}.
     * @see #checkNotNullptr(MemorySegment)
     * @see #checkNotNullptr(MemorySegment, String)
     */
    public static void checkNotNullptr(MemorySegment segment, Supplier<String> messageSupplier) throws IllegalStateException {
        if (MemoryUtil.isNullptr(segment)) throw new IllegalStateException(messageSupplier.get());
    }

    /**
     * Checks whether the given segment is not {@code NULL}.
     *
     * @param segment the segment.
     * @param message the message of the exception.
     * @throws IllegalStateException if <i>{@code segment}</i> is {@code NULL}.
     * @see #checkNotNullptr(MemorySegment)
     * @see #checkNotNullptr(MemorySegment, Supplier)
     */
    public static void checkNotNullptr(MemorySegment segment, String message) throws IllegalStateException {
        if (MemoryUtil.isNullptr(segment)) throw new IllegalStateException(message);
    }
}
