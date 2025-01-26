/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.test;

import org.junit.jupiter.api.Test;
import overrungl.struct.LayoutBuilder;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author squid233
 * @since 0.1.0
 */
public class LayoutBuilderTest {
    @Test
    void testBitfields() {
        StructLayout layout = LayoutBuilder.bitfields(
            ValueLayout.JAVA_INT, 4, // 0
            ValueLayout.JAVA_INT, 8,
            ValueLayout.JAVA_INT, 12,
            ValueLayout.JAVA_INT, 8,
            ValueLayout.JAVA_INT, 1, // 1
            ValueLayout.JAVA_LONG, 63, // 2
            ValueLayout.JAVA_LONG, 2, // 3
            ValueLayout.JAVA_INT, -1, // 4
            ValueLayout.JAVA_INT, 1 // 5
        );
        List<MemoryLayout> layouts = layout.memberLayouts();
        assertEquals(6, layouts.size());
        MemoryLayout layout1 = layouts.getFirst();
        MemoryLayout layout2 = layouts.get(1);
        MemoryLayout layout3 = layouts.get(2);
        MemoryLayout layout4 = layouts.get(3);
        MemoryLayout layout5 = layouts.get(4);
        MemoryLayout layout6 = layouts.get(5);
        assertEquals(MemoryLayout.paddingLayout(4), layout1);
        assertEquals(MemoryLayout.paddingLayout(4), layout2);
        assertEquals(MemoryLayout.paddingLayout(8), layout3);
        assertEquals(MemoryLayout.paddingLayout(8), layout4);
        assertEquals(ValueLayout.JAVA_INT, layout5);
        assertEquals(MemoryLayout.paddingLayout(4), layout6);
    }
}
