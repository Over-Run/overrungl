/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.overrun.glib.Pointer;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

/**
 * The OpenGL 4.2 draw elements indirect command.
 *
 * @author squid233
 * @since 0.1.0
 */
public class DrawElementsIndirectCommand extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT =
            MemoryLayout.structLayout(
                    ValueLayout.JAVA_INT.withName("count"),
                    ValueLayout.JAVA_INT.withName("primCount"),
                    ValueLayout.JAVA_INT.withName("firstIndex"),
                    ValueLayout.JAVA_INT.withName("baseVertex"),
                    ValueLayout.JAVA_INT.withName("baseInstance")
            ).withName("DrawElementsIndirectCommand");
    private static final VarHandle
            pCount = LAYOUT.varHandle(PathElement.groupElement("count")),
            pPrimCount = LAYOUT.varHandle(PathElement.groupElement("primCount")),
            pFirstIndex = LAYOUT.varHandle(PathElement.groupElement("firstIndex")),
            pBaseVertex = LAYOUT.varHandle(PathElement.groupElement("baseVertex")),
            pBaseInstance = LAYOUT.varHandle(PathElement.groupElement("baseInstance"));

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param scope   the segment scope
     */
    public DrawElementsIndirectCommand(MemorySegment address, SegmentScope scope) {
        super(address, scope);
    }

    /**
     * Creates a command instance with the given segment scope.
     *
     * @param scope the segment scope
     * @return the instance
     */
    public static DrawElementsIndirectCommand create(SegmentScope scope) {
        return new DrawElementsIndirectCommand(MemorySegment.allocateNative(LAYOUT, scope), scope);
    }

    /**
     * Creates a command instance with the given segment scope and count.
     *
     * @param scope the segment scope
     * @param count the count
     * @return the instance
     */
    public static Buffer create(SegmentScope scope, long count) {
        return new Buffer(MemorySegment.allocateNative(MemoryLayout.sequenceLayout(count, LAYOUT), scope), scope, count);
    }

    /**
     * Sets the count.
     *
     * @param count the count
     * @return this
     */
    public DrawElementsIndirectCommand count(int count) {
        pCount.set(segment(LAYOUT, scope), count);
        return this;
    }

    /**
     * Sets the primitive count.
     *
     * @param primCount the primitive count
     * @return this
     */
    public DrawElementsIndirectCommand primCount(int primCount) {
        pPrimCount.set(segment(LAYOUT, scope), primCount);
        return this;
    }

    /**
     * Sets the first index.
     *
     * @param firstIndex the first index
     * @return this
     */
    public DrawElementsIndirectCommand firstIndex(int firstIndex) {
        pFirstIndex.set(segment(LAYOUT, scope), firstIndex);
        return this;
    }

    /**
     * Sets the base vertex.
     *
     * @param baseVertex the base vertex
     * @return this
     */
    public DrawElementsIndirectCommand baseVertex(int baseVertex) {
        pBaseVertex.set(segment(LAYOUT, scope), baseVertex);
        return this;
    }

    /**
     * Sets the base instance.
     *
     * @param baseInstance the base instance
     * @return this
     */
    public DrawElementsIndirectCommand baseInstance(int baseInstance) {
        pBaseInstance.set(segment(LAYOUT, scope), baseInstance);
        return this;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public int count() {
        return (int) pCount.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the primitive count.
     *
     * @return the primitive count
     */
    public int primCount() {
        return (int) pPrimCount.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the first index.
     *
     * @return the first index
     */
    public int firstIndex() {
        return (int) pFirstIndex.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the base vertex.
     *
     * @return the base vertex
     */
    public int baseVertex() {
        return (int) pBaseVertex.get(segment(LAYOUT, scope));
    }

    /**
     * Gets the base instance.
     *
     * @return the base instance
     */
    public int baseInstance() {
        return (int) pBaseInstance.get(segment(LAYOUT, scope));
    }

    /**
     * The OpenGL 4.2 draw elements indirect commands.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends DrawElementsIndirectCommand {
        private final long elementCount;
        private final VarHandle pCount, pPrimCount, pFirstIndex, pBaseVertex, pBaseInstance;

        /**
         * Create the pointer instance.
         *
         * @param address      the address
         * @param scope        the segment scope
         * @param elementCount the element count
         */
        public Buffer(MemorySegment address, SegmentScope scope, long elementCount) {
            super(address, scope);
            this.elementCount = elementCount;
            var layout = MemoryLayout.sequenceLayout(elementCount, LAYOUT);
            pCount = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("count"));
            pPrimCount = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("primCount"));
            pFirstIndex = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("firstIndex"));
            pBaseVertex = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseVertex"));
            pBaseInstance = layout.varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseInstance"));
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
            pCount.set(segment(LAYOUT, scope), index, count);
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
            pPrimCount.set(segment(LAYOUT, scope), index, primCount);
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
            pFirstIndex.set(segment(LAYOUT, scope), index, firstIndex);
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
            pBaseVertex.set(segment(LAYOUT, scope), index, baseVertex);
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
            pBaseInstance.set(segment(LAYOUT, scope), index, baseInstance);
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
            return (int) pCount.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the primitive count at the given index.
         *
         * @param index the index
         * @return the primitive count
         */
        public int primCountAt(long index) {
            return (int) pPrimCount.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the first index at the given index.
         *
         * @param index the index
         * @return the first index
         */
        public int firstIndexAt(long index) {
            return (int) pFirstIndex.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the base vertex at the given index.
         *
         * @param index the index
         * @return the base vertex
         */
        public int baseVertexAt(long index) {
            return (int) pBaseVertex.get(segment(LAYOUT, scope), index);
        }

        /**
         * Gets the base instance at the given index.
         *
         * @param index the index
         * @return the base instance
         */
        public int baseInstanceAt(long index) {
            return (int) pBaseInstance.get(segment(LAYOUT, scope), index);
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
