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

package overrungl.opengl;

import overrungl.ArrayPointer;
import overrungl.Struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

/**
 * The OpenGL 4.2 draw elements indirect command.
 *
 * <h2>Layout</h2>
 * <pre><code>
 * struct DrawElementsIndirectCommand {
 *     unsigned int {@link #count() count};
 *     unsigned int {@link #primCount() primCount};
 *     unsigned int {@link #firstIndex() firstIndex};
 *     unsigned int {@link #baseVertex() baseVertex};
 *     unsigned int {@link #baseInstance() baseInstance};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class DrawElementsIndirectCommand extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("primCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("baseVertex"),
        ValueLayout.JAVA_INT.withName("baseInstance")
    );
    private static final VarHandle
        pCount = LAYOUT.varHandle(PathElement.groupElement("count")),
        pPrimCount = LAYOUT.varHandle(PathElement.groupElement("primCount")),
        pFirstIndex = LAYOUT.varHandle(PathElement.groupElement("firstIndex")),
        pBaseVertex = LAYOUT.varHandle(PathElement.groupElement("baseVertex")),
        pBaseInstance = LAYOUT.varHandle(PathElement.groupElement("baseInstance"));

    /**
     * Create the pointer instance.
     *
     * @param address   the address.
     * @param allocator the allocator of this address.
     */
    public DrawElementsIndirectCommand(MemorySegment address, SegmentAllocator allocator) {
        super(address, allocator, LAYOUT);
    }

    /**
     * Creates a struct instance with the given memory layout.
     *
     * @param address   the address.
     * @param allocator the allocator of this address.
     * @param layout    the memory layout of this struct.
     */
    protected DrawElementsIndirectCommand(MemorySegment address, SegmentAllocator allocator, MemoryLayout layout) {
        super(address, allocator, layout);
    }

    /**
     * Creates a command instance with the given allocator.
     *
     * @param allocator the allocator
     * @return the instance
     */
    public static DrawElementsIndirectCommand create(SegmentAllocator allocator) {
        return new DrawElementsIndirectCommand(allocator.allocate(LAYOUT), allocator);
    }

    /**
     * Creates a command instance with the given allocator and count.
     *
     * @param allocator the allocator
     * @param count     the count
     * @return the instance
     */
    public static Buffer create(SegmentAllocator allocator, long count) {
        return new Buffer(allocator.allocateArray(LAYOUT, count), allocator, count);
    }

    /**
     * Sets the count.
     *
     * @param count the count
     * @return this
     */
    public DrawElementsIndirectCommand count(int count) {
        pCount.set(segment(), count);
        return this;
    }

    /**
     * Sets the primitive count.
     *
     * @param primCount the primitive count
     * @return this
     */
    public DrawElementsIndirectCommand primCount(int primCount) {
        pPrimCount.set(segment(), primCount);
        return this;
    }

    /**
     * Sets the first index.
     *
     * @param firstIndex the first index
     * @return this
     */
    public DrawElementsIndirectCommand firstIndex(int firstIndex) {
        pFirstIndex.set(segment(), firstIndex);
        return this;
    }

    /**
     * Sets the base vertex.
     *
     * @param baseVertex the base vertex
     * @return this
     */
    public DrawElementsIndirectCommand baseVertex(int baseVertex) {
        pBaseVertex.set(segment(), baseVertex);
        return this;
    }

    /**
     * Sets the base instance.
     *
     * @param baseInstance the base instance
     * @return this
     */
    public DrawElementsIndirectCommand baseInstance(int baseInstance) {
        pBaseInstance.set(segment(), baseInstance);
        return this;
    }

    /**
     * {@return the count}
     */
    public int count() {
        return (int) pCount.get(segment());
    }

    /**
     * {@return the primitive count}
     */
    public int primCount() {
        return (int) pPrimCount.get(segment());
    }

    /**
     * {@return the first index}
     */
    public int firstIndex() {
        return (int) pFirstIndex.get(segment());
    }

    /**
     * {@return the base vertex}
     */
    public int baseVertex() {
        return (int) pBaseVertex.get(segment());
    }

    /**
     * {@return the base instance}
     */
    public int baseInstance() {
        return (int) pBaseInstance.get(segment());
    }

    /**
     * The OpenGL 4.2 draw elements indirect commands.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends DrawElementsIndirectCommand implements ArrayPointer {
        private final VarHandle pCount, pPrimCount, pFirstIndex, pBaseVertex, pBaseInstance;

        /**
         * Create the pointer instance.
         *
         * @param address      the address.
         * @param allocator    the allocator of this address.
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, SegmentAllocator allocator, long elementCount) {
            super(address, allocator, MemoryLayout.sequenceLayout(elementCount, LAYOUT));
            pCount = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("count"));
            pPrimCount = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("primCount"));
            pFirstIndex = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("firstIndex"));
            pBaseVertex = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseVertex"));
            pBaseInstance = layout().varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseInstance"));
        }

        /**
         * Sets the count at the given index.
         *
         * @param index the index
         * @param count the count
         * @return this
         */
        public Buffer count(long index, int count) {
            pCount.set(segment(), index, count);
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
            pPrimCount.set(segment(), index, primCount);
            return this;
        }

        /**
         * Sets the first index at the given index.
         *
         * @param index      the index
         * @param firstIndex the first index
         * @return this
         */
        public Buffer firstIndex(long index, int firstIndex) {
            pFirstIndex.set(segment(), index, firstIndex);
            return this;
        }

        /**
         * Sets the base vertex at the given index.
         *
         * @param index      the index
         * @param baseVertex the base vertex
         * @return this
         */
        public Buffer baseVertex(long index, int baseVertex) {
            pBaseVertex.set(segment(), index, baseVertex);
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
            pBaseInstance.set(segment(), index, baseInstance);
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
        public Buffer firstIndex(int firstIndex) {
            return firstIndex(0, firstIndex);
        }

        @Override
        public Buffer baseVertex(int baseVertex) {
            return baseVertex(0, baseVertex);
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
            return (int) pCount.get(segment(), index);
        }

        /**
         * Gets the primitive count at the given index.
         *
         * @param index the index
         * @return the primitive count
         */
        public int primCountAt(long index) {
            return (int) pPrimCount.get(segment(), index);
        }

        /**
         * Gets the first index at the given index.
         *
         * @param index the index
         * @return the first index
         */
        public int firstIndexAt(long index) {
            return (int) pFirstIndex.get(segment(), index);
        }

        /**
         * Gets the base vertex at the given index.
         *
         * @param index the index
         * @return the base vertex
         */
        public int baseVertexAt(long index) {
            return (int) pBaseVertex.get(segment(), index);
        }

        /**
         * Gets the base instance at the given index.
         *
         * @param index the index
         * @return the base instance
         */
        public int baseInstanceAt(long index) {
            return (int) pBaseInstance.get(segment(), index);
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
        public int firstIndex() {
            return firstIndexAt(0);
        }

        @Override
        public int baseVertex() {
            return baseVertexAt(0);
        }

        @Override
        public int baseInstance() {
            return baseInstanceAt(0);
        }
    }
}
