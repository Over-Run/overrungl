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

package overrungl.nfd;

import org.jetbrains.annotations.NotNull;
import overrungl.Struct;
import overrungl.util.value.Tuple2;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.lang.foreign.ValueLayout.ADDRESS;

/**
 * A wrapper of NFD path set enumerator.
 *
 * @author squid233
 * @see NFD#pathSetGetEnum(MemorySegment, MemorySegment)
 * @since 0.1.0
 */
public final class NFDEnumerator extends Struct implements Iterable<String>, AutoCloseable {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ADDRESS.withName("ptr"));
    private static final Iterator<String> EMPTY_ITERATOR = new Iterator<>() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            throw new NoSuchElementException();
        }
    };
    private final Kind kind;

    private NFDEnumerator(Kind kind, MemorySegment address, SegmentAllocator allocator) {
        super(address, allocator, LAYOUT);
        this.kind = kind;
    }

    /**
     * The kind of the enumerator.
     *
     * @author squid233
     * @since 0.1.0
     */
    public enum Kind {
        /**
         * Native (UTF-16LE for Windows, UTF-8 for others)
         */
        N,
        /**
         * UTF-8
         */
        U8
    }

    /**
     * @author squid233
     * @since 0.1.0
     */
    private final class EnumIterator implements Iterator<String> {
        private String nextPath;

        private EnumIterator(String nextPath) {
            this.nextPath = nextPath;
        }

        @Override
        public boolean hasNext() {
            return nextPath != null;
        }

        @Override
        public String next() {
            final String curr = nextPath;
            if (curr == null) {
                throw new NoSuchElementException();
            }
            String[] s = new String[1];
            final NFDResult result = switch (kind) {
                case N -> NFD.pathSetEnumNextN(address(), s);
                case U8 -> NFD.pathSetEnumNextU8(address(), s);
            };
            if (result == NFDResult.ERROR) throw errorIterating();
            nextPath = s[0];
            return curr;
        }
    }

    private static Tuple2<NFDResult, NFDEnumerator> fromPathSet(Kind kind, SegmentAllocator allocator, MemorySegment pathSet) {
        final MemorySegment seg = allocator.allocate(ADDRESS);
        final NFDResult result = NFD.pathSetGetEnum(pathSet, seg);
        return new Tuple2<>(result,
            result == NFDResult.OKAY ?
                new NFDEnumerator(kind, seg, allocator) :
                null);
    }

    /**
     * Creates an enumerator from the given path set that is created with {@link NFD#openDialogMultipleN}.
     *
     * @param allocator the allocator of the enumerator.
     * @param pathSet   the path set.
     * @return the result and the enumerator.
     */
    public static Tuple2<NFDResult, NFDEnumerator> fromPathSetN(SegmentAllocator allocator, MemorySegment pathSet) {
        return fromPathSet(Kind.N, allocator, pathSet);
    }

    /**
     * Creates an enumerator from the given path set that is created with {@link NFD#openDialogMultipleU8}.
     *
     * @param allocator the allocator of the enumerator.
     * @param pathSet   the path set.
     * @return the result and the enumerator.
     */
    public static Tuple2<NFDResult, NFDEnumerator> fromPathSetU8(SegmentAllocator allocator, MemorySegment pathSet) {
        return fromPathSet(Kind.U8, allocator, pathSet);
    }

    private static IllegalStateException errorIterating() {
        return new IllegalStateException("Error iterating: " + NFD.getError());
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        // TODO: 2023/7/6 Value object
        String[] s = new String[1];
        final NFDResult result = switch (kind) {
            case N -> NFD.pathSetEnumNextN(address(), s);
            case U8 -> NFD.pathSetEnumNextU8(address(), s);
        };
        final String path = s[0];
        if (path == null || result != NFDResult.OKAY) {
            if (result == NFDResult.ERROR) {
                throw errorIterating();
            }
            return EMPTY_ITERATOR;
        }
        return new EnumIterator(path);
    }

    @Override
    public void close() {
        NFD.pathSetFreeEnum(address());
    }
}
