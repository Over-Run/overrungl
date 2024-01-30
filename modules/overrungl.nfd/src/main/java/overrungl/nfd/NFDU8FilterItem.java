/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.nfd;

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;
import overrun.marshal.struct.StructHandleView;
import overrungl.util.value.Pair;

import java.lang.foreign.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * struct nfdu8filteritem_t {
 *     const nfdu8char_t* {@link #name};
 *     const nfdu8char_t* {@link #spec};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class NFDU8FilterItem extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("name"),
        ValueLayout.ADDRESS.withName("spec")
    );
    private final StructHandle.Str _name = StructHandle.ofString(this, "name");
    private final StructHandle.Str _spec = StructHandle.ofString(this, "spec");
    /**
     * name
     */
    public final StructHandleView.Str name = _name;
    /**
     * spec
     */
    public final StructHandleView.Str spec = _spec;

    /**
     * Create a {@code NFDU8FilterItem} instance.
     *
     * @param address the address.
     */
    public NFDU8FilterItem(MemorySegment address) {
        super(address, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public NFDU8FilterItem(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Creates a {@code NFDU8FilterItem} instance with the given allocator.
     *
     * @param allocator the allocator
     * @param name      the name of the filter
     * @param spec      the specification of the filter
     * @return the instance
     */
    public static NFDU8FilterItem create(SegmentAllocator allocator, String name, String spec) {
        final NFDU8FilterItem item = new NFDU8FilterItem(allocator.allocate(LAYOUT));
        item._name.set(allocator, name);
        item._spec.set(allocator, spec);
        return item;
    }

    /**
     * Creates a {@code NFDU8FilterItem.Buffer} instance with the given allocator and items.
     *
     * @param allocator the allocator
     * @param items     the items
     * @return the instance
     */
    @SafeVarargs
    public static NFDU8FilterItem create(SegmentAllocator allocator, Pair<String>... items) {
        final NFDU8FilterItem buffer = new NFDU8FilterItem(allocator.allocate(LAYOUT, items.length), items.length);
        for (int i = 0, len = items.length; i < len; i++) {
            Pair<String> item = items[i];
            buffer._name.set(i, allocator, item.key());
            buffer._spec.set(i, allocator, item.value());
        }
        return buffer;
    }
}
