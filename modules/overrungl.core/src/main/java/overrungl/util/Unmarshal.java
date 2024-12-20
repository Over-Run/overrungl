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

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_BYTE;

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
}
