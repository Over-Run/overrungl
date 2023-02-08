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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;

/**
 * A {@link MemorySegment} wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer implements HasAddress {
    /**
     * The pointer address.
     */
    protected final MemorySegment address;
    /**
     * The pointer segment scope.
     */
    protected final SegmentScope scope;

    /**
     * Create the pointer instance.
     *
     * @param address the address
     * @param scope   the segment scope
     */
    public Pointer(MemorySegment address, SegmentScope scope) {
        this.address = address;
        this.scope = scope;
    }

    /**
     * Gets the address.
     *
     * @return the memory address
     */
    @Override
    public MemorySegment address() {
        return address;
    }

    /**
     * Gets the segment scope.
     *
     * @return the segment scope
     */
    public SegmentScope scope() {
        return scope;
    }

    /**
     * Gets as a memory segment.
     *
     * @param bytesSize the bytes size of the segment.
     * @param scope     the segment associated with the returned native segment.
     * @return the memory segment.
     */
    public MemorySegment segment(long bytesSize, SegmentScope scope) {
        if (address().byteSize() == 0) {
            return RuntimeHelper.sizedSegment(address(), bytesSize, scope);
        }
        return address();
    }

    /**
     * Gets as memory segment.
     *
     * @param layout the memory layout
     * @param scope  the segment scope to allocate
     * @return the memory segment
     */
    public MemorySegment segment(MemoryLayout layout, SegmentScope scope) {
        return segment(layout.byteSize(), scope);
    }
}
