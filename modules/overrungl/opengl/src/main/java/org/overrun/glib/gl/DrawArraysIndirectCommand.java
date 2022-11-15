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
public class DrawArraysIndirectCommand extends Pointer {
    /**
     * The struct layout.
     */
    public static final GroupLayout LAYOUT =
        MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("count"),
            ValueLayout.JAVA_INT.withName("primCount"),
            ValueLayout.JAVA_INT.withName("first"),
            ValueLayout.JAVA_INT.withName("baseInstance")
        ).withName("DrawArraysIndirectCommand");
    private static final VarHandle
        pCount = LAYOUT.varHandle(PathElement.groupElement("count")),
        pPrimCount = LAYOUT.varHandle(PathElement.groupElement("primCount")),
        pFirst = LAYOUT.varHandle(PathElement.groupElement("first")),
        pBaseInstance = LAYOUT.varHandle(PathElement.groupElement("baseInstance"));

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param session the memory session
     */
    public DrawArraysIndirectCommand(Addressable address, MemorySession session) {
        super(address, session);
    }

    /**
     * Creates a command instance with the given memory session.
     *
     * @param session the memory session
     * @return the instance
     */
    public static DrawArraysIndirectCommand create(MemorySession session) {
        return new DrawArraysIndirectCommand(session.allocate(LAYOUT), session);
    }

    /**
     * Creates a command instance with the given memory session and count.
     *
     * @param session the memory session
     * @param count   the count
     * @return the instance
     */
    public static Buffer create(MemorySession session, long count) {
        return new Buffer(session.allocateArray(LAYOUT, count), session, count);
    }

    /**
     * Sets the count.
     *
     * @param count the count
     * @return this
     */
    public DrawArraysIndirectCommand count(int count) {
        pCount.set(segment(LAYOUT, session), count);
        return this;
    }

    /**
     * Sets the primitive count.
     *
     * @param primCount the primitive count
     * @return this
     */
    public DrawArraysIndirectCommand primCount(int primCount) {
        pPrimCount.set(segment(LAYOUT, session), primCount);
        return this;
    }

    /**
     * Sets the first.
     *
     * @param first the first
     * @return this
     */
    public DrawArraysIndirectCommand first(int first) {
        pFirst.set(segment(LAYOUT, session), first);
        return this;
    }

    /**
     * Sets the base instance.
     *
     * @param baseInstance the base instance
     * @return this
     */
    public DrawArraysIndirectCommand baseInstance(int baseInstance) {
        pBaseInstance.set(segment(LAYOUT, session), baseInstance);
        return this;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public int count() {
        return (int) pCount.get(segment(LAYOUT, session));
    }

    /**
     * Gets the primitive count.
     *
     * @return the primitive count
     */
    public int primCount() {
        return (int) pPrimCount.get(segment(LAYOUT, session));
    }

    /**
     * Gets the first.
     *
     * @return the first
     */
    public int first() {
        return (int) pFirst.get(segment(LAYOUT, session));
    }

    /**
     * Gets the base instance.
     *
     * @return the base instance
     */
    public int baseInstance() {
        return (int) pBaseInstance.get(segment(LAYOUT, session));
    }

    /**
     * The OpenGL 4.2 draw arrays indirect commands.
     *
     * @author squid233
     * @since 0.1.0
     */
    public static class Buffer extends DrawArraysIndirectCommand {
        private static final VarHandle
            pCount = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("count")),
            pPrimCount = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("primCount")),
            pFirst = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("first")),
            pBaseInstance = LAYOUT.varHandle(PathElement.sequenceElement(), PathElement.groupElement("baseInstance"));
        private final long elementCount;

        /**
         * Create the pointer instance.
         *
         * @param address      the address
         * @param session      the memory session
         * @param elementCount the element count
         */
        public Buffer(Addressable address, MemorySession session, long elementCount) {
            super(address, session);
            this.elementCount = elementCount;
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
            pCount.set(segment(LAYOUT, session), index, count);
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
            pPrimCount.set(segment(LAYOUT, session), index, primCount);
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
            pFirst.set(segment(LAYOUT, session), index, first);
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
            pBaseInstance.set(segment(LAYOUT, session), index, baseInstance);
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
            return (int) pCount.get(segment(LAYOUT, session), index);
        }

        /**
         * Gets the primitive count at the given index.
         *
         * @param index the index
         * @return the primitive count
         */
        public int primCountAt(long index) {
            return (int) pPrimCount.get(segment(LAYOUT, session), index);
        }

        /**
         * Gets the first at the given index.
         *
         * @param index the index
         * @return the first
         */
        public int firstAt(long index) {
            return (int) pFirst.get(segment(LAYOUT, session), index);
        }

        /**
         * Gets the base instance at the given index.
         *
         * @param index the index
         * @return the base instance
         */
        public int baseInstanceAt(long index) {
            return (int) pBaseInstance.get(segment(LAYOUT, session), index);
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
    }
}
