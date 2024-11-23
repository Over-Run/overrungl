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

package overrungl.nfd;

import overrun.marshal.Marshal;

import java.lang.foreign.SegmentAllocator;
import java.util.Map;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class NFDHelper {
    private NFDHelper() {
    }

    public static NFDU8FilterItem u8filterItem(SegmentAllocator allocator, String name, String spec) {
        return NFDU8FilterItem.OF.of(allocator).name(Marshal.marshal(allocator, name)).spec(Marshal.marshal(allocator, spec));
    }

    @SafeVarargs
    public static NFDU8FilterItem u8filterItem(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
        var of = NFDU8FilterItem.OF.of(allocator, entries.length);
        for (int i = 0; i < entries.length; i++) {
            var e = entries[i];
            of.slice(i).name(Marshal.marshal(allocator, e.getKey())).spec(Marshal.marshal(allocator, e.getValue()));
        }
        return of;
    }


    static NFDNFilterItem nfilterItem(SegmentAllocator allocator, String name, String spec) {
        return NFDNFilterItem.OF.of(allocator).name(Marshal.marshal(allocator, name, NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, spec, NFDInternal.nfdCharset));
    }

    @SafeVarargs
    static NFDNFilterItem nfilterItem(SegmentAllocator allocator, Map.Entry<String, String>... entries) {
        var of = NFDNFilterItem.OF.of(allocator, entries.length);
        for (int i = 0; i < entries.length; i++) {
            var e = entries[i];
            of.slice(i).name(Marshal.marshal(allocator, e.getKey(), NFDInternal.nfdCharset)).spec(Marshal.marshal(allocator, e.getValue(), NFDInternal.nfdCharset));
        }
        return of;
    }
}
