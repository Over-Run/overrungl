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
 * The C struct wrapper.
 *
 * @author squid233
 * @since 0.1.0
 */
public abstract class Struct extends Pointer {
    /**
     * The managed native segment that is not zero-length.
     * <p>
     * This field is not modified with {@code final} since the layout might be null in construction.
     */
    protected MemorySegment managedSegment;

    /**
     * Create the struct instance.
     *
     * @param address the address.
     * @param scope   the segment scope of this address.
     */
    public Struct(MemorySegment address, SegmentScope scope) {
        super(address, scope);
        final MemoryLayout layout = layout();
        if (layout != null) {
            managedSegment = segment(layout, scope);
        }
    }

    @Override
    public MemorySegment segment(long bytesSize, SegmentScope scope) {
        return managedSegment;
    }

    /**
     * Gets the layout of this struct.
     *
     * @return the layout of this struct.
     */
    public abstract MemoryLayout layout();

    /**
     * Gets the struct size in bytes.
     *
     * @return the struct size in bytes.
     */
    public long sizeof() {
        return layout().byteSize();
    }
}
