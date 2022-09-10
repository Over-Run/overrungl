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

/**
 * The OpenGL 4.2 draw arrays indirect command.
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
        );
    /**
     * The struct path elements.
     */
    public static final PathElement
        COUNT = PathElement.groupElement("count"),
        PRIM_COUNT = PathElement.groupElement("primCount"),
        FIRST = PathElement.groupElement("first"),
        BASE_INSTANCE = PathElement.groupElement("baseInstance");

    /**
     * Create the pointer instance.
     *
     * @param address the address
     */
    public DrawArraysIndirectCommand(Addressable address) {
        super(address);
    }

    /**
     * Allocate a command instance.
     *
     * @param session the memory session
     * @return the instance
     */
    public static DrawArraysIndirectCommand alloc(MemorySession session) {
        return new DrawArraysIndirectCommand(session.allocate(LAYOUT));
    }

    /**
     * Sets the count.
     *
     * @param count the count
     * @return this
     */
    public DrawArraysIndirectCommand count(int count) {
        var handle = LAYOUT.varHandle(COUNT);
        handle.set(address(), count);
        return this;
    }

    /**
     * Sets the primitive count.
     *
     * @param primCount the primitive count
     * @return this
     */
    public DrawArraysIndirectCommand primCount(int primCount) {
        var handle = LAYOUT.varHandle(PRIM_COUNT);
        handle.set(address(), primCount);
        return this;
    }

    /**
     * Sets the first.
     *
     * @param first the first
     * @return this
     */
    public DrawArraysIndirectCommand first(int first) {
        var handle = LAYOUT.varHandle(FIRST);
        handle.set(address(), first);
        return this;
    }

    /**
     * Sets the base instance.
     *
     * @param baseInstance the base instance
     * @return this
     */
    public DrawArraysIndirectCommand baseInstance(int baseInstance) {
        var handle = LAYOUT.varHandle(BASE_INSTANCE);
        handle.set(address(), baseInstance);
        return this;
    }

    /**
     * Gets the count.
     *
     * @return the count
     */
    public int count() {
        var handle = LAYOUT.varHandle(COUNT);
        return (int) handle.get(address());
    }

    /**
     * Gets the primitive count.
     *
     * @return the primitive count
     */
    public int primCount() {
        var handle = LAYOUT.varHandle(PRIM_COUNT);
        return (int) handle.get(address());
    }

    /**
     * Gets the first.
     *
     * @return the first
     */
    public int first() {
        var handle = LAYOUT.varHandle(FIRST);
        return (int) handle.get(address());
    }

    /**
     * Gets the base instance.
     *
     * @return the base instance
     */
    public int baseInstance() {
        var handle = LAYOUT.varHandle(BASE_INSTANCE);
        return (int) handle.get(address());
    }
}
