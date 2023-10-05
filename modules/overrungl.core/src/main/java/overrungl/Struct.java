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

package overrungl;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;

/**
 * The C struct wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Struct extends Pointer {
    /**
     * The memory layout of this struct.
     * <p>
     * The memory layout can be modified in subclasses to load lazily.
     */
    protected MemoryLayout layout;

    /**
     * Creates a struct instance with the given memory layout.
     *
     * @param address the address.
     * @param layout  the memory layout of this struct.
     */
    public Struct(MemorySegment address, MemoryLayout layout) {
        super(address);
        this.layout = layout;
        segment(layout);
    }

    /**
     * Creates a struct instance.
     *
     * @param address the address.
     */
    public Struct(MemorySegment address) {
        super(address);
    }

    /**
     * Gets as a native segment.
     *
     * @return the memory segment.
     * @see #segment(long)
     */
    public MemorySegment segment() {
        return segment(layout());
    }

    /**
     * {@return the layout of this struct}
     */
    public MemoryLayout layout() {
        return layout;
    }

    /**
     * {@return the elements size of this struct in bytes}
     */
    public long sizeofThis() {
        return layout() != null ? layout().byteSize() : 0;
    }
}
