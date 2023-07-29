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

package overrungl.stb;

import overrungl.Struct;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    stbtt_vertex_type {@link #x() x},{@link #y() y},{@link #cx() cx},{@link #cy() cy},{@link #cx1() cx1},{@link #cy1() cy1};
 *    unsigned char {@link #type() type},{@link #padding() padding};
 * } stbtt_vertex;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBTTVertex extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        JAVA_SHORT.withName("x"),
        JAVA_SHORT.withName("y"),
        JAVA_SHORT.withName("cx"),
        JAVA_SHORT.withName("cy"),
        JAVA_SHORT.withName("cx1"),
        JAVA_SHORT.withName("cy1"),
        JAVA_BYTE.withName("type"),
        JAVA_BYTE.withName("padding")
    );
    private static final VarHandle
        x = LAYOUT.varHandle(PathElement.groupElement("x")),
        y = LAYOUT.varHandle(PathElement.groupElement("y")),
        cx = LAYOUT.varHandle(PathElement.groupElement("cx")),
        cy = LAYOUT.varHandle(PathElement.groupElement("cy")),
        cx1 = LAYOUT.varHandle(PathElement.groupElement("cx1")),
        cy1 = LAYOUT.varHandle(PathElement.groupElement("cy1")),
        type = LAYOUT.varHandle(PathElement.groupElement("type")),
        padding = LAYOUT.varHandle(PathElement.groupElement("padding"));

    public STBTTVertex(MemorySegment address) {
        super(address, LAYOUT);
    }

    public short x() {
        return (short) x.get(segment());
    }

    public short y() {
        return (short) y.get(segment());
    }

    public short cx() {
        return (short) cx.get(segment());
    }

    public short cy() {
        return (short) cy.get(segment());
    }

    public short cx1() {
        return (short) cx1.get(segment());
    }

    public short cy1() {
        return (short) cy1.get(segment());
    }

    public byte type() {
        return (byte) type.get(segment());
    }

    public byte padding() {
        return (byte) padding.get(segment());
    }
}
