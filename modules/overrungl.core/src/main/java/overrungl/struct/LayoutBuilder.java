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

package overrungl.struct;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.util.ArrayList;
import java.util.List;

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
    public static StructLayout struct(MemoryLayout... elements) {
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
}
