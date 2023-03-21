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

package org.overrun.glib.util;

import org.overrun.glib.Addressable;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.*;

/**
 * This is a growable buffer with a {@linkplain CustomArena custom arena}.
 * <p>
 * This simulates the old NIO buffers, but it's more efficient, since it used the native memory.
 *
 * <h2>Example</h2>
 * Using with OpenGL:
 * <pre>{@code
 * var buffer = new GrowableBuffer();
 * buffer.clear()
 *     .put(JAVA_FLOAT, 0.0f)
 *     .put(JAVA_FLOAT, 0.0f)
 *     .put(JAVA_FLOAT, 0.0f);
 * if (buffer.hasGrown()) {
 *     GL.bufferData(GL.ARRAY_BUFFER, buffer, GL.STATIC_DRAW);
 * }
 * }</pre>
 * or JOML:
 * <pre>{@code
 * Vectorn.put(texCoord, Vectorn.put(color, Vectorn.put(position, buffer)));
 * }</pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public class GrowableBuffer implements Addressable {
    private final CustomArena arena;
    private MemorySegment address = MemorySegment.NULL;
    private long capacity;
    private long offset, count;
    private boolean grew;
    private boolean cleared = false;

    /**
     * Creates an empty buffer builder instance with an implicit allocator.
     *
     * @see #GrowableBuffer(CustomArena)
     * @see #GrowableBuffer(CustomArena, long)
     * @see #GrowableBuffer(CustomArena, MemoryLayout)
     */
    public GrowableBuffer() {
        this(CustomArena.delegated(RuntimeHelper.autoArena()));
    }

    /**
     * Creates a buffer builder instance with the given custom arena.
     *
     * @param arena the custom arena.
     * @see #GrowableBuffer()
     * @see #GrowableBuffer(CustomArena, long)
     * @see #GrowableBuffer(CustomArena, MemoryLayout)
     */
    public GrowableBuffer(CustomArena arena) {
        this.arena = arena;
    }

    /**
     * Creates a buffer builder instance and allocate the buffer with the given capacity.
     *
     * @param arena the custom arena.
     * @param initialCapacity the initial capacity.
     * @see #GrowableBuffer()
     * @see #GrowableBuffer(CustomArena)
     * @see #GrowableBuffer(CustomArena, MemoryLayout)
     */
    public GrowableBuffer(CustomArena arena, long initialCapacity) {
        this(arena);
        this.capacity = initialCapacity;
        this.grew = true;
        this.address = arena.allocate(initialCapacity);
    }

    /**
     * Creates a buffer builder instance and allocate the buffer with the given layout.
     *
     * @param arena the custom arena.
     * @param layout the memory layout.
     * @see #GrowableBuffer()
     * @see #GrowableBuffer(CustomArena)
     * @see #GrowableBuffer(CustomArena, long)
     */
    public GrowableBuffer(CustomArena arena, MemoryLayout layout) {
        this(arena, layout.byteSize());
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
        void accept(MemorySegment segment, T layout, long offset);
    }

    /**
     * Resets the offset and count.
     *
     * @return this
     * @see #clear(long)
     * @see #clear(MemoryLayout)
     */
    public GrowableBuffer clear() {
        offset = 0;
        count = 0;
        if (cleared) {
            grew = false;
        }
        cleared = true;
        return this;
    }

    /**
     * Grows to the given capacity and reset the offset and count.
     *
     * @param initialCapacity the capacity
     * @return this
     * @see #clear()
     * @see #clear(MemoryLayout)
     */
    public GrowableBuffer clear(long initialCapacity) {
        return this.ensureCapacity(initialCapacity).clear();
    }

    /**
     * Grows to the size of the given layout and reset the offset and count.
     *
     * @param layout the memory layout.
     * @return this
     * @see #clear()
     * @see #clear(long)
     */
    public GrowableBuffer clear(MemoryLayout layout) {
        return clear(layout.byteSize());
    }

    public GrowableBuffer ensureCapacity(long minCapacity, long newCapacity) {
        if (minCapacity > capacity) {
            long c = Math.max(minCapacity, newCapacity);
            address = arena.reallocate(address, c);
            capacity = c;
            grew = true;
        }
        return this;
    }

    public GrowableBuffer ensureCapacity(long minCapacity) {
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
    GrowableBuffer put(T layout, long offset, Performer<T> performer) {
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
    public GrowableBuffer put(ValueLayout.OfByte layout, long offset, byte value) {
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
    public GrowableBuffer put(ValueLayout.OfShort layout, long offset, short value) {
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
    public GrowableBuffer put(ValueLayout.OfInt layout, long offset, int value) {
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
    public GrowableBuffer put(ValueLayout.OfLong layout, long offset, long value) {
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
    public GrowableBuffer put(ValueLayout.OfFloat layout, long offset, float value) {
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
    public GrowableBuffer put(ValueLayout.OfDouble layout, long offset, double value) {
        grow(layout);
        address.set(layout, offset, value);
        count++;
        return this;
    }

    public <T extends ValueLayout>
    GrowableBuffer put(T layout, Performer<T> performer) {
        this.put(layout, offset, performer);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfByte layout, byte value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfShort layout, short value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfInt layout, int value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfLong layout, long value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfFloat layout, float value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer put(ValueLayout.OfDouble layout, double value) {
        this.put(layout, offset, value);
        offset += layout.byteSize();
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfByte layout, long offset, byte... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfShort layout, long offset, short... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfInt layout, long offset, int... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfLong layout, long offset, long... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfFloat layout, long offset, float... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfDouble layout, long offset, double... values) {
        long size = grow(layout, values.length);
        for (var value : values) {
            address.set(layout, offset, value);
            offset += size;
            count++;
        }
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfByte layout, byte... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfShort layout, short... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfInt layout, int... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfLong layout, long... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfFloat layout, float... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(ValueLayout.OfDouble layout, double... values) {
        this.putAll(layout, offset, values);
        offset += layout.byteSize() * values.length;
        return this;
    }

    public GrowableBuffer putAll(MemoryLayout layout, MemorySegment address) {
        internalPutAll(layout, 0, address);
        return this;
    }

    private void internalPutAll(MemoryLayout layout, long srcOffset, MemorySegment address) {
        switch (layout) {
            // TODO: 2022/12/10 Replace with _
            case PaddingLayout ignored -> {
                for (long i = 0; i < layout.byteSize(); i++) {
                    this.put(ValueLayout.JAVA_BYTE, (byte) 0);
                }
            }
            case StructLayout structLayout -> {
                for (var layout1 : structLayout.memberLayouts()) {
                    internalPutAll(layout1, srcOffset, address);
                    srcOffset += layout1.byteSize();
                }
            }
            case UnionLayout unionLayout -> {
                for (var layout1 : unionLayout.memberLayouts()) {
                    internalPutAll(layout1, srcOffset, address);
                }
            }
            case SequenceLayout sequenceLayout -> {
                var elementLayout = sequenceLayout.elementLayout();
                long sz = elementLayout.byteSize();
                for (long i = 0; i < sequenceLayout.elementCount(); i++) {
                    internalPutAll(elementLayout, srcOffset + sz * i, address);
                }
            }
            case ValueLayout valueLayout -> internalPutValue(valueLayout, srcOffset, address);
        }
    }

    private void internalPutValue(ValueLayout layout, long srcOffset, MemorySegment address) {
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
     * Returns {@code true} if this buffer has grown.
     *
     * @return {@code true} if this buffer has grown.
     */
    public boolean hasGrown() {
        return grew;
    }

    /**
     * Sets the offset of this buffer.
     *
     * @param offset the new offset.
     * @return this.
     */
    public final GrowableBuffer offset(long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Returns the capacity of this buffer.
     *
     * @return the capacity of this buffer.
     */
    public final long capacity() {
        return capacity;
    }

    /**
     * Returns the offset of this buffer.
     *
     * @return the offset of this buffer.
     */
    public final long offset() {
        return offset;
    }

    /**
     * Returns the performed put count.
     *
     * @return the performed put count.
     */
    public final long count() {
        return count;
    }

    @Override
    public final MemorySegment address() {
        return address;
    }
}
