/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static overrungl.nfd.NFD.*;

/**
 * A wrapper of NFD path set enumerator.
 * <p>
 * Users are responsible to close the instance after the iteration finished.
 *
 * @author squid233
 * @see NFD#NFD_PathSet_GetEnum(MemorySegment, MemorySegment) NFD_PathSet_GetEnum
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
                int result = NFD_PathSet_EnumNext(segment, outPath);
                if (result == NFD_ERROR) throw errorIterating();
                nextPath = NFD_NativeString(outPath.get(ADDRESS, 0));
                if (nextPath != null) {
                    NFD_PathSet_FreePath(outPath.get(ADDRESS, 0));
                }
            }
            return curr;
        }
    }

    /**
     * A result of {@link #fromPathSet(SegmentAllocator, MemorySegment) fromPathSet}
     *
     * @param enumerator the enumerator if {@code result} is {@link NFD#NFD_OKAY NFD_OKAY}; otherwise {@code null}
     * @param result     the result of {@link NFD#NFD_PathSet_GetEnum(MemorySegment, MemorySegment) NFD_PathSet_GetEnum}
     */
    public record Result(
        NFDEnumerator enumerator,
        int result
    ) {
    }

    /**
     * Creates an enumerator from the given path set created with
     * {@link NFD#NFD_OpenDialogMultiple(MemorySegment, MemorySegment, int, MemorySegment) NFD_OpenDialogMultiple}.
     *
     * @param allocator the allocator of the enumerator.
     * @param pathSet   the path set.
     * @return the result and the enumerator.
     */
    public static Result fromPathSet(SegmentAllocator allocator, MemorySegment pathSet) {
        MemorySegment struct = NFDPathSetEnum.alloc(allocator).segment();
        int result = NFD_PathSet_GetEnum(pathSet, struct);
        return new Result(result == NFD_OKAY ?
            new NFDEnumerator(struct) :
            null,
            result);
    }

    private static IllegalStateException errorIterating() {
        return new IllegalStateException("Error iterating: " + NFD_GetError());
    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        // TODO: 2023/7/6 Value object
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment outPath = stack.allocate(ADDRESS);
            int result = NFD_PathSet_EnumNext(segment, outPath);
            return switch (result) {
                case NFD_OKAY -> {
                    String path = NFD_NativeString(outPath.get(ADDRESS, 0));
                    if (path != null) {
                        NFD_PathSet_FreePath(outPath.get(ADDRESS, 0));
                    }
                    yield new EnumIterator(path);
                }
                case NFD_CANCEL -> EMPTY_ITERATOR;
                default -> throw errorIterating();
            };
        }
    }

    @Override
    public void close() {
        NFD_PathSet_FreeEnum(segment);
    }
}
