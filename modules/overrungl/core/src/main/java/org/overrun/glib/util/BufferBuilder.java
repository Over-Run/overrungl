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

package org.overrun.glib.util;

import org.overrun.glib.HasAddress;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.util.MemoryUtil.*;

/**
 * This is a vertex buffer builder with standard C memory allocator.
 * <p>
 * This simulates the old NIO buffers, but more efficient, since it used the native memory.
 *
 * @author squid233
 * @since 0.1.0
 */
public class BufferBuilder implements AutoCloseable, HasAddress {
    private MemoryAddress address;
    private long capacity;
    private long offset, count;
    private long stride;
    private boolean grew;

    /**
     * Creates an empty buffer builder instance.
     */
    public BufferBuilder() {
    }

    /**
     * Creates a buffer builder instance and allocate the buffer with the given capacity.
     */
    public BufferBuilder(long initialCapacity) {
        capacity = initialCapacity;
        grew = true;
        address = malloc(initialCapacity);
    }

    /**
     * The consumer, accepts a memory address function.
     *
     * @param <T> The value layout type.
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Consumer<T extends ValueLayout> {
        /**
         * Performs this operation on the given argument.
         *
         * @param address The memory address.
         * @param layout  The value layout.
         * @param offset  The offset in bytes.
         */
        void accept(MemoryAddress address, T layout, long offset);
    }

    public BufferBuilder begin() {
        offset = 0;
        count = 0;
        stride = 0;
        return this;
    }

    public BufferBuilder begin(long initialCapacity) {
        return this.ensureCapacity(initialCapacity).begin();
    }

    public BufferBuilder ensureCapacity(long minCapacity, long newCapacity) {
        if (minCapacity > capacity) {
            address = realloc(address, Math.max(minCapacity, newCapacity));
            capacity = minCapacity;
            grew = true;
        }
        return this;
    }

    public BufferBuilder ensureCapacity(long minCapacity) {
        return ensureCapacity(minCapacity, minCapacity);
    }

    private long grow(long size) {
        return size;
    }

    private long grow(ValueLayout layout) {
        long size = layout.byteSize();
        if (offset + size > capacity) {
            this.ensureCapacity(offset + size, capacity + (capacity >> 1) + 1);
        }
        return size;
    }

    private long grow(ValueLayout layout, long count) {
        long size = layout.byteSize() * count;
        if (offset + size > capacity) {
            this.ensureCapacity(offset + size, capacity + (capacity >> 1) + 1);
        }
        return layout.byteSize();
    }

    public <T extends ValueLayout>
    BufferBuilder put(T layout, Consumer<T> consumer) {
        long size = grow(layout);
        consumer.accept(address, layout, offset);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfByte layout, byte value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfShort layout, short value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfInt layout, int value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfLong layout, long value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfFloat layout, float value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder put(ValueLayout.OfDouble layout, double value) {
        long size = grow(layout);
        address.set(layout, offset, value);
        offset += size;
        count++;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfByte layout, byte... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfShort layout, short... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfInt layout, int... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfLong layout, long... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfFloat layout, float... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfDouble layout, double... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    /**
     * Computes the stride.
     *
     * @return the stride
     */
    public BufferBuilder emit() {
        if (stride <= 0) {
            stride = offset;
        }
        return this;
    }

    /**
     * End the operation.
     *
     * @return true, if the buffer has grown
     */
    public boolean end() {
        boolean g = grew;
        grew = false;
        return g;
    }

    public final long capacity() {
        return capacity;
    }

    public final long offset() {
        return offset;
    }

    /**
     * Returns the performed put count
     *
     * @return the performed put count
     */
    public final long count() {
        return count;
    }

    public final long stride() {
        return stride;
    }

    @Override
    public void close() {
        free(address);
        address = null;
        capacity = 0;
    }

    @Override
    public final Addressable rawAddress() {
        return address;
    }

    @Override
    public final MemoryAddress address() {
        return address;
    }
}
