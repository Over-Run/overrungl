/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static java.lang.foreign.ValueLayout.*;

/**
 * C-to-Java helper.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Unmarshal {
    /**
     * The max string size.
     */
    public static final long STR_SIZE = Integer.MAX_VALUE - 8;
    /**
     * The address layout which dereferences a string with {@linkplain #STR_SIZE the max size}.
     */
    public static final AddressLayout STR_LAYOUT = ADDRESS.withTargetLayout(
        MemoryLayout.sequenceLayout(STR_SIZE, JAVA_BYTE)
    );

    private Unmarshal() {
    }

    /**
     * {@return {@code true} if the given segment is a null pointer; {@code false} otherwise}
     *
     * @param segment the native segment
     */
    public static boolean isNullPointer(@Nullable MemorySegment segment) {
        return segment == null || segment.equals(MemorySegment.NULL);
    }

    /**
     * Unmarshal the given segment as a string.
     *
     * @param segment the segment whose size might be unknown
     * @param charset the charset
     * @return the string
     */
    public static @Nullable String unmarshalAsString(MemorySegment segment, Charset charset) {
        return isNullPointer(segment) ? null : segment.reinterpret(STR_SIZE).getString(0L, charset);
    }

    /**
     * Unmarshal the given segment as a string.
     *
     * @param segment the segment whose size might be unknown
     * @return the string
     */
    public static @Nullable String unmarshalAsString(MemorySegment segment) {
        return unmarshalAsString(segment, StandardCharsets.UTF_8);
    }

    /// Reads a segment from the given segment of which type is `void**`.
    ///
    /// @param layout  the address layout of returned segment.
    /// @param segment the segment
    /// @return the segment stored in _`segment`_
    public static MemorySegment unmarshalPointer(AddressLayout layout, MemorySegment segment) {
        return isNullPointer(segment) ? MemorySegment.NULL : segment.get(layout, 0L);
    }

    /// Reads a segment from the given segment of which type is `void**`.
    ///
    /// @param segment the segment
    /// @return the segment stored in _`segment`_
    public static MemorySegment unmarshalPointer(MemorySegment segment) {
        return unmarshalPointer(ADDRESS, segment);
    }

    /**
     * Unmarshal the given segment as a string.
     *
     * @param segment the segment which is pointer to a string
     * @return the string
     */
    public static @Nullable String unmarshalStringPointer(MemorySegment segment) {
        return unmarshalStringPointer(segment, StandardCharsets.UTF_8);
    }

    /**
     * Unmarshal the given segment as a string.
     *
     * @param segment the segment which is pointer to a string
     * @param charset the charset
     * @return the string
     */
    public static @Nullable String unmarshalStringPointer(MemorySegment segment, Charset charset) {
        return unmarshalAsString(unmarshalPointer(STR_LAYOUT, segment), charset);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static char @Nullable [] unmarshal(OfChar elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static byte @Nullable [] unmarshal(OfByte elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static short @Nullable [] unmarshal(OfShort elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static int @Nullable [] unmarshal(OfInt elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static long @Nullable [] unmarshal(OfLong elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static float @Nullable [] unmarshal(OfFloat elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param elementLayout the source element layout
     * @param segment       the segment
     * @return the array
     */
    public static double @Nullable [] unmarshal(OfDouble elementLayout, MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(elementLayout);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static char @Nullable [] unmarshalAsCharArray(MemorySegment segment) {
        return unmarshal(JAVA_CHAR, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static byte @Nullable [] unmarshalAsByteArray(MemorySegment segment) {
        return unmarshal(JAVA_BYTE, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static short @Nullable [] unmarshalAsShortArray(MemorySegment segment) {
        return unmarshal(JAVA_SHORT, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static int @Nullable [] unmarshalAsIntArray(MemorySegment segment) {
        return unmarshal(JAVA_INT, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static long @Nullable [] unmarshalAsLongArray(MemorySegment segment) {
        return unmarshal(JAVA_LONG, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static float @Nullable [] unmarshalAsFloatArray(MemorySegment segment) {
        return unmarshal(JAVA_FLOAT, segment);
    }

    /**
     * Unmarshal the given segment as an array.
     *
     * @param segment the segment
     * @return the array
     */
    public static double @Nullable [] unmarshalAsDoubleArray(MemorySegment segment) {
        return unmarshal(JAVA_DOUBLE, segment);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, char @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_CHAR, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, byte @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_BYTE, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, short @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_SHORT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, int @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_INT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, long @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_LONG, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, float @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_FLOAT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, double @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_DOUBLE, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, String @Nullable [] dst) {
        copy(src, dst, StandardCharsets.UTF_8);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src     the source segment
     * @param dst     the destination
     * @param charset the charset
     */
    public static void copy(MemorySegment src, String @Nullable [] dst, Charset charset) {
        if (isNullPointer(src) || dst == null) return;
        for (int i = 0; i < dst.length; i++) {
            dst[i] = unmarshalAsString(src.getAtIndex(STR_LAYOUT, i), charset);
        }
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, MemorySegment @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        for (int i = 0; i < dst.length; i++) {
            dst[i] = src.getAtIndex(ADDRESS, i);
        }
    }
}
