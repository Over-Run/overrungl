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

package org.overrun.glib;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

/**
 * A {@link MemorySegment} wrapper with an arena.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer implements Addressable {
    /**
     * The pointer address.
     */
    protected final MemorySegment address;
    /**
     * The arena of this pointer.
     */
    protected final Arena arena;

    /**
     * Create the pointer instance.
     *
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public Pointer(MemorySegment address, Arena arena) {
        this.address = address;
        this.arena = arena;
    }

    @Override
    public MemorySegment address() {
        return address;
    }

    /**
     * {@return the arena of this pointer}
     */
    public Arena arena() {
        return arena;
    }

    /**
     * Gets the native segment of this pointer, or creates a new one with the given arena
     * if the segment of this pointer is zero-length.
     *
     * @param bytesSize the bytes size of the segment.
     * @param arena     the arena associated with the returned native segment.
     * @return the memory segment.
     * @see #segment(MemoryLayout, Arena)
     */
    public MemorySegment segment(long bytesSize, Arena arena) {
        if (address().byteSize() == 0) {
            return RuntimeHelper.sizedSegment(address(), bytesSize);
        }
        return address();
    }

    /**
     * Gets as memory segment.
     *
     * @param layout the memory layout
     * @param arena  the arena associated with the returned native segment.
     * @return the memory segment
     * @see #segment(long, Arena)
     */
    public MemorySegment segment(MemoryLayout layout, Arena arena) {
        return segment(layout.byteSize(), arena);
    }
}
