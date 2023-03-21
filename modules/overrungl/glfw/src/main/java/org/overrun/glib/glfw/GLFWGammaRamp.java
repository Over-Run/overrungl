/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib.glfw;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.Struct;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * This describes the gamma ramp for a monitor.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct GLFWgammaramp {
 *     unsigned short* {@link #red() red};
 *     unsigned short* {@link #green() green};
 *     unsigned short* {@link #blue() blue};
 *     unsigned int {@link #size};
 * }</code></pre>
 *
 * @author squid233
 * @see GLFW#getGammaRamp
 * @see GLFW#setGammaRamp
 * @since 0.1.0
 */
public class GLFWGammaRamp extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withName("red"),
        ADDRESS.withName("green"),
        ADDRESS.withName("blue"),
        JAVA_INT.withName("size")
    );
    private static final VarHandle
        ppRed = LAYOUT.varHandle(PathElement.groupElement("red")),
        ppGreen = LAYOUT.varHandle(PathElement.groupElement("green")),
        ppBlue = LAYOUT.varHandle(PathElement.groupElement("blue")),
        pRed = LAYOUT.varHandle(PathElement.groupElement("red"), PathElement.sequenceElement()),
        pGreen = LAYOUT.varHandle(PathElement.groupElement("green"), PathElement.sequenceElement()),
        pBlue = LAYOUT.varHandle(PathElement.groupElement("blue"), PathElement.sequenceElement()),
        pSize = LAYOUT.varHandle(PathElement.groupElement("size"));

    /**
     * Create a {@code GLFWgammaramp const} instance.
     *
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public GLFWGammaRamp(MemorySegment address, Arena arena) {
        super(address, arena);
    }

    /**
     * Creates a {@code GLFWgammaramp} instance with the given arena.
     *
     * @param arena the arena
     * @return the instance
     */
    public static GLFWGammaRamp create(Arena arena) {
        return new GLFWGammaRamp(arena.allocate(LAYOUT), arena);
    }

    /**
     * Sets the red value array.
     *
     * @param reds the array
     * @return this
     */
    public GLFWGammaRamp red(short[] reds) {
        ppRed.set(managedSegment, arena.allocateArray(JAVA_SHORT, reds));
        return this;
    }

    /**
     * Sets the green value array.
     *
     * @param greens the array
     * @return this
     */
    public GLFWGammaRamp green(short[] greens) {
        ppGreen.set(managedSegment, arena.allocateArray(JAVA_SHORT, greens));
        return this;
    }

    /**
     * Sets the blue value array.
     *
     * @param blues the array
     * @return this
     */
    public GLFWGammaRamp blue(short[] blues) {
        ppBlue.set(managedSegment, arena.allocateArray(JAVA_SHORT, blues.length));
        return this;
    }

    /**
     * Sets the arrays size.
     *
     * @param size The number of elements in each array.
     * @return this
     */
    public GLFWGammaRamp size(int size) {
        pSize.set(managedSegment, size);
        return this;
    }

    /**
     * Gets a red value at the given index.
     *
     * @param index the index
     * @return the red value
     */
    public short red(int index) {
        return (short) pRed.get(managedSegment, (long) index);
    }

    /**
     * Gets a green value at the given index.
     *
     * @param index the index
     * @return the green value
     */
    public short green(int index) {
        return (short) pGreen.get(managedSegment, (long) index);
    }

    /**
     * Gets a blue value at the given index.
     *
     * @param index the index
     * @return the blue value
     */
    public short blue(int index) {
        return (short) pBlue.get(managedSegment, (long) index);
    }

    /**
     * Gets the red value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] reds(int size) {
        return RuntimeHelper.toArray(nred(), new short[size]);
    }

    /**
     * Gets the green value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] greens(int size) {
        return RuntimeHelper.toArray(ngreen(), new short[size]);
    }

    /**
     * Gets the blue value array.
     *
     * @param size the array size
     * @return the array
     */
    public short[] blues(int size) {
        return RuntimeHelper.toArray(nblue(), new short[size]);
    }

    /**
     * Gets the red value array.
     *
     * @return An array of value describing the response of the red channel.
     */
    public short[] red() {
        return reds(size());
    }

    /**
     * Gets the green value array.
     *
     * @return An array of value describing the response of the green channel.
     */
    public short[] green() {
        return greens(size());
    }

    /**
     * Gets the blue value array.
     *
     * @return An array of value describing the response of the blue channel.
     */
    public short[] blue() {
        return blues(size());
    }

    /**
     * Gets the arrays size.
     *
     * @return The number of elements in each array.
     */
    public int size() {
        return (int) pSize.get(managedSegment);
    }

    public MemorySegment nred() {
        return (MemorySegment) ppRed.get(managedSegment);
    }

    public MemorySegment ngreen() {
        return (MemorySegment) ppGreen.get(managedSegment);
    }

    public MemorySegment nblue() {
        return (MemorySegment) ppBlue.get(managedSegment);
    }

    @Override
    public StructLayout layout() {
        return LAYOUT;
    }
}
