/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.struct;

import org.jspecify.annotations.NonNull;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/// A builder of [StructLayout] which automatically computes the padding between elements.
///
/// @author squid233
/// @since 0.1.0
public final class LayoutBuilder {
    private LayoutBuilder() {
    }

    /// {@return a struct with padding computed}
    ///
    /// @param elements the memory layouts of the elements
    public static @NonNull StructLayout struct(@NonNull MemoryLayout @NonNull ... elements) {
        Objects.requireNonNull(elements);
        List<MemoryLayout> list = new ArrayList<>();
        long offset = 0L;
        long align = 0L;
        for (MemoryLayout layout : elements) {
            long alignment = layout.byteAlignment();
            long padding = offset % alignment;
            if (padding != 0L) {
                long size = alignment - padding;
                list.add(MemoryLayout.paddingLayout(size));
                offset += size;
            }
            list.add(layout);
            offset += layout.byteSize();
            align = Math.max(align, alignment);
        }
        long padding = offset % align;
        if (padding != 0L) {
            list.add(MemoryLayout.paddingLayout(align - padding));
        }
        return MemoryLayout.structLayout(list.toArray(new MemoryLayout[0]));
    }

    /// Computes a bitfield layout.
    ///
    /// @param elements the element arranged with order: `MemoryLayout`, `int`...
    /// @return the struct layout
    public static @NonNull StructLayout bitfields(@NonNull Object @NonNull ... elements) {
        if (elements.length % 2 != 0)
            throw new IllegalArgumentException("Not multiple of 2: " + elements.length);
        List<MemoryLayout> list = new ArrayList<>();
        MemoryLayout previousLayout = null;
        int accumBits = 0;
        int prevBits = 0;
        for (int i = 0; i < elements.length; i += 2) {
            MemoryLayout layout = (MemoryLayout) elements[i];
            int bits = (Integer) elements[i + 1];
            if (bits > layout.byteSize() * 8) {
                throw new IllegalArgumentException("bit width " + bits + " is greater than layout itself: " + layout);
            }
            if (bits <= 0) {
                list.add(layout);
                accumBits = 0;
            } else if (previousLayout == null || previousLayout.byteSize() != layout.byteSize() || prevBits <= 0) {
                list.add(MemoryLayout.paddingLayout(layout.byteSize()));
                accumBits = bits;
            } else {
                long layoutBitSize = layout.byteSize() * 8;
                if (accumBits + bits > layoutBitSize) {
                    list.add(MemoryLayout.paddingLayout(layout.byteSize()));
                    accumBits = (int) (accumBits + bits - layoutBitSize);
                } else {
                    accumBits += bits;
                }
            }
            previousLayout = layout;
            prevBits = bits;
        }
        return struct(list.toArray(new MemoryLayout[0]));
    }
}
