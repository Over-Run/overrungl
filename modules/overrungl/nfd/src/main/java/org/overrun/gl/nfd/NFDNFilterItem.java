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

package org.overrun.gl.nfd;

import org.overrun.gl.Struct;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * struct nfdnfilteritem_t {
 *     const nfdnchar_t* {@link #name() name};
 *     const nfdnchar_t* {@link #spec() spec};
 * }</code></pre>
 * <p>
 * {@code name} and {@code spec} are modifiable because the charset is unknown in compile-time.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NFDNFilterItem extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("name"),
        ValueLayout.ADDRESS.withName("spec")
    );
    private static final VarHandle
        pName = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name")),
        pSpec = LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("spec"));

    /**
     * Create a {@code nfdnfilteritem_t} instance.
     *
     * @param address   the address.
     * @param allocator the allocator of this address.
     */
    public NFDNFilterItem(MemorySegment address, SegmentAllocator allocator) {
        super(address, allocator, LAYOUT);
    }

    /**
     * Creates a {@code nfdnfilteritem_t} instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static NFDNFilterItem create(SegmentAllocator allocator) {
        return new NFDNFilterItem(allocator.allocate(LAYOUT), allocator);
    }
}
