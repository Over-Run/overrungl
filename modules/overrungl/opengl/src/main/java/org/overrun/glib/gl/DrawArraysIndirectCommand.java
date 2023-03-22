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

package org.overrun.glib.gl;

import org.overrun.glib.Struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

/**
 * The OpenGL 4.2 draw arrays indirect command.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct DrawArraysIndirectCommand {
 *     unsigned int {@link #count() count};
 *     unsigned int {@link #primCount() primCount};
 *     unsigned int {@link #first() first};
 *     unsigned int {@link #baseInstance() baseInstance};
 * }
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class DrawArraysIndirectCommand extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("primCount"),
        ValueLayout.JAVA_INT.withName("first"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    private static final VarHandle
        pCount = LAYOUT.varHandle(PathElement.groupElement("count")),
        pPrimCount = LAYOUT.varHandle(PathElement.groupElement("primCount")),
        pFirst = LAYOUT.varHandle(PathElement.groupElement("first")),
        pBaseInstance = LAYOUT.varHandle(PathElement.groupElement("baseInstance"));

    /**
     * Create the pointer instance.
     *
     * @param address the address.
     * @param arena   the arena of this address.
     */
    public DrawArraysIndirectCommand(MemorySegment address, Arena arena) {
        super(address, arena);
    }

    /**
     * Creates a command instance with the given arena.
     *
     * @param arena the arena
     * @return the instance
     */
    public static DrawArraysIndirectCommand create(Arena arena) {
        return new DrawArraysIndirectCommand(arena.allocate(LAYOUT), arena);
    }

    /**
     * Creates a command instance with the given arena and count.
     *
     * @param arena the arena
     * @param count the count
     * @return the instance
     */
    public static Buffer create(Arena arena, long count) {
        return new Buffer(arena.allocateArray(LAYOUT, count), arena, count);
    }

    /**
     * Sets the count.
     *
     * @param count the count
     * @return this
     */
    public DrawArraysIndirectCommand count(int count) {
        pCount.set(managedSegment, count);
        return this;
    }

    /**
     * Sets the primitive count.
     *
     * @param primCount the primitive count
     * @return this
     */
    public DrawArraysIndirectCommand primCount(int primCount) {
        pPrimCount.set(managedSegment, primCount);
        return this;
    }

    /**
     * Sets the first.
     *
     * @param first the first
     * @return this
     */
    public DrawArraysIndirectCommand first(int first) {
        pFirst.set(managedSegment, first);
        return this;
    }

    /**
     * Sets the base instance.
     *
     * @param baseInstance the base instance
     * @return this
     */
    public DrawArraysIndirectCommand baseInstance(int baseInstance) {
        pBaseInstance.set(managedSegment, baseInstance);
        return this;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public int count() {
        return (int) pCount.get(managedSegment);
    }

    /**
     * Gets the primitive count.
     *
     * @return the primitive count
     */
    public int primCount() {
        return (int) pPrimCount.get(managedSegment);
    }

    /**
     * Gets the first.
     *
     * @return the first
     */
    public int first() {
        return (int) pFirst.get(managedSegment);
    }

    /**
     * Gets the base instance.
     *
     * @return the base instance
     */
    public int baseInstance() {
        return (int) pBaseInstance.get(managedSegment);
    }

    @Override
    public MemoryLayout layout() {
        return LAYOUT;
    }

    /**
     * The OpenGL 4.2 draw arrays indirect commands.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends DrawArraysIndirectCommand {
        private final long elementCount;
        private final VarHandle pCount, pPrimCount, pFirst, pBaseInstance;
        private final SequenceLayout layout;

        /**
         * Create the pointer instance.
         *
         * @param address      the address.
         * @param arena        the arena of this address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, Arena arena, long elementCount) {
            super(address, arena);
            this.elementCount = elementCount;
            this.layout = MemoryLayout.sequenceLayout(elementCount, LAYOUT);
            pCount = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("count"));
            pPrimCount = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("primCount"));
            pFirst = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("first"));
            pBaseInstance = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseInstance"));
            managedSegment = segment(layout, arena);
        }

        /**
         * Gets the element count.
         *
         * @return the element count
         */
        public long elementCount() {
            return elementCount;
        }

        /**
         * Sets the count at the given index.
         *
         * @param index the index
         * @param count the count
         * @return this
         */
        public Buffer count(long index, int count) {
            pCount.set(managedSegment, index, count);
            return this;
        }

        /**
         * Sets the primitive count at the given index.
         *
         * @param index     the index
         * @param primCount the primitive count
         * @return this
         */
        public Buffer primCount(long index, int primCount) {
            pPrimCount.set(managedSegment, index, primCount);
            return this;
        }

        /**
         * Sets the first at the given index.
         *
         * @param index the index
         * @param first the first
         * @return this
         */
        public Buffer first(long index, int first) {
            pFirst.set(managedSegment, index, first);
            return this;
        }

        /**
         * Sets the base instance at the given index.
         *
         * @param index        the index
         * @param baseInstance the base instance
         * @return this
         */
        public Buffer baseInstance(long index, int baseInstance) {
            pBaseInstance.set(managedSegment, index, baseInstance);
            return this;
        }

        @Override
        public Buffer count(int count) {
            return count(0, count);
        }

        @Override
        public Buffer primCount(int primCount) {
            return primCount(0, primCount);
        }

        @Override
        public Buffer first(int first) {
            return first(0, first);
        }

        @Override
        public Buffer baseInstance(int baseInstance) {
            return baseInstance(0, baseInstance);
        }

        /**
         * Gets the count at the given index.
         *
         * @param index the index
         * @return the count
         */
        public int countAt(long index) {
            return (int) pCount.get(managedSegment, index);
        }

        /**
         * Gets the primitive count at the given index.
         *
         * @param index the index
         * @return the primitive count
         */
        public int primCountAt(long index) {
            return (int) pPrimCount.get(managedSegment, index);
        }

        /**
         * Gets the first at the given index.
         *
         * @param index the index
         * @return the first
         */
        public int firstAt(long index) {
            return (int) pFirst.get(managedSegment, index);
        }

        /**
         * Gets the base instance at the given index.
         *
         * @param index the index
         * @return the base instance
         */
        public int baseInstanceAt(long index) {
            return (int) pBaseInstance.get(managedSegment, index);
        }

        @Override
        public int count() {
            return countAt(0);
        }

        @Override
        public int primCount() {
            return primCountAt(0);
        }

        @Override
        public int first() {
            return firstAt(0);
        }

        @Override
        public int baseInstance() {
            return baseInstanceAt(0);
        }

        @Override
        public SequenceLayout layout() {
            return layout;
        }
    }
}
