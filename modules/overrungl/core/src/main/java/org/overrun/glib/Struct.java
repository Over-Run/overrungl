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

package org.overrun.glib;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

/**
 * The C struct wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public abstract class Struct extends Pointer {
    /**
     * The managed native segment that is not zero-length.
     * <p>
     * This field is not modified with {@code final} since the layout might be null in construction.
     */
    protected MemorySegment managedSegment;

    /**
     * Create the struct instance.
     *
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public Struct(MemorySegment address, Arena arena) {
        super(address, arena);
        final MemoryLayout layout = layout();
        if (layout != null) {
            managedSegment = segment(layout, arena);
        }
    }

    @Override
    public MemorySegment segment(long bytesSize, Arena arena) {
        return managedSegment != null ? managedSegment : super.segment(bytesSize, arena);
    }

    /**
     * Gets the layout of this struct.
     *
     * @return the layout of this struct.
     */
    public abstract MemoryLayout layout();

    /**
     * Gets the struct size in bytes.
     *
     * @return the struct size in bytes.
     */
    public long sizeof() {
        return layout().byteSize();
    }
}
