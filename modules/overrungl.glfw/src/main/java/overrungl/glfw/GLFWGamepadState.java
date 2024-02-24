/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.glfw;

import overrun.marshal.struct.Struct;

import java.lang.foreign.*;

/**
 * This describes the input state of a gamepad.
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWgamepadstate {
 *     unsigned char {@link #buttons}[15];
 *     float {@link #axes}[6];
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWGamepadState extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(15, ValueLayout.JAVA_BYTE).withName("buttons"),
        MemoryLayout.paddingLayout(1L),
        MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_FLOAT).withName("axes")
    );
    /**
     * The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__buttons.html">gamepad button</a>,
     * {@link GLFW#PRESS} or {@link GLFW#RELEASE}.
     */
    public static final StructHandleSizedByteArray buttons = StructHandleSizedByteArray.of(LAYOUT, "buttons");
    /**
     * The states of each <a href="https://www.glfw.org/docs/latest/group__gamepad__axes.html">gamepad axis</a>,
     * in the range -1.0 to 1.0 inclusive.
     */
    public static final StructHandleSizedFloatArray axes = StructHandleSizedFloatArray.of(LAYOUT, "axes");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public GLFWGamepadState(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public GLFWGamepadState(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public GLFWGamepadState(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public GLFWGamepadState(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }

    /**
     * Gets the button state at the given index.
     *
     * @param index the index
     * @return the state, {@code PRESS} or {@code RELEASE}
     */
    public boolean button(int index) {
        return buttons.get(this, index) == GLFW.PRESS;
    }

    /**
     * Gets the axe state at the given index.
     *
     * @param index the index
     * @return the state, in the range -1.0 to 1.0 inclusive
     */
    public float axe(int index) {
        return axes.get(this, index);
    }
}
