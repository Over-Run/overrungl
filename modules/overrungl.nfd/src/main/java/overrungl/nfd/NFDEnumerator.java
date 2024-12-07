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

import io.github.overrun.memstack.MemoryStack;
import org.jetbrains.annotations.NotNull;
import overrun.marshal.Unmarshal;
import overrungl.util.value.Tuple2;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.lang.foreign.ValueLayout.ADDRESS;

/**
 * A wrapper of NFD path set enumerator.
 * <p>
 * Users are responsible to close the instance after the iteration finished.
 *
 * @author squid233
 * @see NFD#pathSetGetEnum(MemorySegment, MemorySegment)
 * @since 0.1.0
 */
public final class NFDEnumerator implements Iterable<String>, AutoCloseable {
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
    private final MemorySegment segment;

    private NFDEnumerator(MemorySegment segment) {
        this.segment = segment;
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
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                MemorySegment outPath = stack.allocate(ADDRESS);
                int result = NFD.pathSetEnumNext(segment, outPath);
                if (result == NFD.ERROR) throw errorIterating();
                nextPath = Unmarshal.unmarshalStringPointer(outPath, NFDInternal.nfdCharset);
                if (nextPath != null) {
                    NFD.pathSetFreePath(outPath.get(ADDRESS, 0));
                }
            }
            return curr;
        }
    }

    /**
     * Creates an enumerator from the given path set that is created with {@link NFD#openDialogMultiple}.
     *
     * @param allocator the allocator of the enumerator.
     * @param pathSet   the path set.
     * @return the result and the enumerator.
     */
    public static Tuple2.OfObjInt<NFDEnumerator> fromPathSet(SegmentAllocator allocator, MemorySegment pathSet) {
        MemorySegment struct = allocator.allocate(MemoryLayout.structLayout(ADDRESS));
        int result = NFD.pathSetGetEnum(pathSet, struct);
        return new Tuple2.OfObjInt<>(result == NFD.OKAY ?
            new NFDEnumerator(struct) :
            null,
            result);
    }

    private static IllegalStateException errorIterating() {
        return new IllegalStateException("Error iterating: " + NFD.getError());
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        // TODO: 2023/7/6 Value object
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment outPath = stack.allocate(ADDRESS);
            int result = NFD.pathSetEnumNext(segment, outPath);
            switch (result) {
                case NFD.OKAY -> {
                    String path = Unmarshal.unmarshalStringPointer(outPath, NFDInternal.nfdCharset);
                    if (path != null) {
                        NFD.pathSetFreePath(outPath.get(ADDRESS, 0));
                    }
                    return new EnumIterator(path);
                }
                case NFD.CANCEL -> {
                    return EMPTY_ITERATOR;
                }
                default -> throw errorIterating();
            }
        }
    }

    @Override
    public void close() {
        NFD.pathSetFreeEnum(segment);
    }
}
