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

import java.lang.foreign.*;

import static org.overrun.glib.util.MemoryUtil.*;

/**
 * This is a vertex buffer builder with standard C memory allocator.
 * <p>
 * This simulates the old NIO buffers, but more efficient, since it used the native memory.
 * <p>
 * The byte put must be aligned.
 *
 * <h2>Example</h2>
 * Using with OpenGL:
 * <pre>{@code
 * var builder = new BufferBuilder();
 * builder.begin()
 *     .put(JAVA_FLOAT, 0.0f)
 *     .put(JAVA_FLOAT, 0.0f)
 *     .put(JAVA_FLOAT, 0.0f)
 *     .end();
 * GL.bufferData(GL_ARRAY_BUFFER, builder, GL_STATIC_DRAW);
 * }</pre>
 * with JOML:
 * <pre>{@code
 * Vectorn.put(texCoord, Vectorn.put(color, Vectorn.put(position, builder)));
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class BufferBuilder implements AutoCloseable, HasAddress {
    private MemoryAddress address = MemoryAddress.NULL;
    private long capacity;
    private long offset, count;
    private long stride;
    private boolean grew;

    /**
     * Creates an empty buffer builder instance.
     *
     * @see #BufferBuilder(long)
     * @see #BufferBuilder(MemoryLayout)
     */
    public BufferBuilder() {
    }

    /**
     * Creates a buffer builder instance and allocate the buffer with the given capacity.
     *
     * @param initialCapacity the initial capacity.
     * @see #BufferBuilder()
     * @see #BufferBuilder(MemoryLayout)
     */
    public BufferBuilder(long initialCapacity) {
        this();
        capacity = initialCapacity;
        grew = true;
        address = malloc(initialCapacity);
    }

    /**
     * Creates a buffer builder instance and allocate the buffer with the given layout.
     *
     * @param layout the memory layout.
     * @see #BufferBuilder()
     * @see #BufferBuilder(long)
     */
    public BufferBuilder(MemoryLayout layout) {
        this(layout.byteSize());
    }

    /**
     * The performer, accepts a memory segment function.
     *
     * @param <T> The value layout type.
     * @author squid233
     * @since 0.1.0
     */
    @FunctionalInterface
    public interface Performer<T extends ValueLayout> {
        /**
         * Performs this operation on the given argument.
         *
         * @param segment The memory segment.
         * @param layout  The value layout.
         * @param offset  The offset in bytes.
         */
        void accept(MemoryAddress segment, T layout, long offset);
    }

    /**
     * Reset the offset and count.
     *
     * @return this
     * @see #begin(long)
     * @see #begin(MemoryLayout)
     */
    public BufferBuilder begin() {
        offset = 0;
        count = 0;
        stride = 0;
        return this;
    }

    /**
     * Grow to the given capacity and reset the offset and count.
     *
     * @param initialCapacity the capacity
     * @return this
     * @see #begin()
     * @see #begin(MemoryLayout)
     */
    public BufferBuilder begin(long initialCapacity) {
        return this.ensureCapacity(initialCapacity).begin();
    }

    /**
     * Grow to the size of the given layout and reset the offset and count.
     *
     * @param layout the memory layout.
     * @return this
     * @see #begin()
     * @see #begin(long)
     */
    public BufferBuilder begin(MemoryLayout layout) {
        return begin(layout.byteSize());
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

    private void grow(long size) {
        if (offset + size > capacity) {
            this.ensureCapacity(offset + size, capacity + (capacity >> 1) + 1);
        }
    }

    private void grow(ValueLayout layout) {
        grow(layout.byteSize());
    }

    private long grow(ValueLayout layout, long count) {
        final long lsz = layout.byteSize();
        grow(lsz * count);
        return lsz;
    }

    public <T extends ValueLayout>
    BufferBuilder put(T layout, long offset, Performer<T> performer) {
        grow(layout);
        performer.accept(address, layout, offset);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing a byte value.
     * <p>
     * Writes one byte containing the given byte value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The byte value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfByte layout, long offset, byte value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing a short value.
     * <p>
     * Writes two byte containing the given short value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The short value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfShort layout, long offset, short value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing an int value.
     * <p>
     * Writes four byte containing the given int value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The int value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfInt layout, long offset, int value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing a long value.
     * <p>
     * Writes eight byte containing the given long value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The long value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfLong layout, long offset, long value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing a float value.
     * <p>
     * Writes four byte containing the given float value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The float value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfFloat layout, long offset, float value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    /**
     * Absolute <i>put</i> method for writing a double value.
     * <p>
     * Writes eight byte containing the given double value, into this buffer at the given index.
     *
     * @param layout the layout
     * @param offset The index at which the bytes will be written
     * @param value  The double value to be written
     * @return this
     */
    public BufferBuilder put(ValueLayout.OfDouble layout, long offset, double value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    public <T extends ValueLayout>
    BufferBuilder put(T layout, Performer<T> performer) {
        this.put(layout, offset, performer);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfByte layout, byte value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfShort layout, short value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfInt layout, int value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfLong layout, long value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfFloat layout, float value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder put(ValueLayout.OfDouble layout, double value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfByte layout, long offset, byte... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfShort layout, long offset, short... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfInt layout, long offset, int... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfLong layout, long offset, long... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfFloat layout, long offset, float... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfDouble layout, long offset, double... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfByte layout, byte... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfShort layout, short... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfInt layout, int... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfLong layout, long... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfFloat layout, float... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public BufferBuilder putAll(ValueLayout.OfDouble layout, double... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    private void internalPutAll(MemoryLayout layout, long srcOffset, Addressable address) {
        // TODO: Replace with switch pattern matching
        if (layout.isPadding()) {
            for (long i = 0; i < layout.byteSize(); i++) {
                this.put(ValueLayout.JAVA_BYTE, (byte) 0);
            }
        } else if (layout instanceof GroupLayout groupLayout) {
            if (groupLayout.isStruct()) {
                for (var layout1 : groupLayout.memberLayouts()) {
                    internalPutAll(layout1, srcOffset, address);
                    srcOffset += layout1.byteSize();
                }
            } else if (groupLayout.isUnion()) {
                for (var layout1 : groupLayout.memberLayouts()) {
                    internalPutAll(layout1, srcOffset, address);
                }
            }
        } else if (layout instanceof SequenceLayout sequenceLayout) {
            var elementLayout = sequenceLayout.elementLayout();
            long sz = elementLayout.byteSize();
            for (long i = 0; i < sequenceLayout.elementCount(); i++) {
                internalPutAll(elementLayout, srcOffset + sz * i, address);
            }
        } else {
            switch (address) {
                case MemoryAddress memoryAddress -> internalPutAll(layout, srcOffset, memoryAddress);
                case MemorySegment memorySegment -> internalPutAll(layout, srcOffset, memorySegment);
                default -> {
                }
            }
        }
    }

    public BufferBuilder putAll(MemoryLayout layout, Addressable address) {
        internalPutAll(layout, 0, address);
        return this;
    }

    @Deprecated(since = "20", forRemoval = true)
    private void internalPutAll(MemoryLayout layout, long srcOffset, MemoryAddress address) {
        switch (layout) {
            case ValueLayout.OfByte valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfShort valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfInt valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfLong valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfFloat valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfDouble valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            default -> {
            }
        }
    }

    private void internalPutAll(MemoryLayout layout, long srcOffset, MemorySegment address) {
        switch (layout) {
            case ValueLayout.OfByte valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfShort valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfInt valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfLong valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfFloat valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            case ValueLayout.OfDouble valueLayout -> this.put(valueLayout, address.get(valueLayout, srcOffset));
            default -> {
            }
        }
    }

    /**
     * Computes the stride.
     * <p>
     * This operation is not necessary.
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

    public final BufferBuilder offset(long offset) {
        this.offset = offset;
        return this;
    }

    public final long capacity() {
        return capacity;
    }

    /**
     * Returns the offset of the buffer
     *
     * @return the offset of the buffer
     */
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
        address = MemoryAddress.NULL;
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
