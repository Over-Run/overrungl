/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPerformanceCounterKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkPerformanceCounterUnitKHR unit;
///     (int) VkPerformanceCounterScopeKHR scope;
///     (int) VkPerformanceCounterStorageKHR storage;
///     uint8_t uuid[16];
/// };
/// ```
public sealed class VkPerformanceCounterKHR extends GroupType {
    /// The struct layout of `VkPerformanceCounterKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        MemoryLayout.sequenceLayout(16L, ValueLayout.JAVA_BYTE).withName("uuid")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `unit`.
    public static final long OFFSET_unit = LAYOUT.byteOffset(PathElement.groupElement("unit"));
    /// The memory layout of `unit`.
    public static final MemoryLayout LAYOUT_unit = LAYOUT.select(PathElement.groupElement("unit"));
    /// The [VarHandle] of `unit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_unit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unit"));
    /// The byte offset of `scope`.
    public static final long OFFSET_scope = LAYOUT.byteOffset(PathElement.groupElement("scope"));
    /// The memory layout of `scope`.
    public static final MemoryLayout LAYOUT_scope = LAYOUT.select(PathElement.groupElement("scope"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    /// The byte offset of `storage`.
    public static final long OFFSET_storage = LAYOUT.byteOffset(PathElement.groupElement("storage"));
    /// The memory layout of `storage`.
    public static final MemoryLayout LAYOUT_storage = LAYOUT.select(PathElement.groupElement("storage"));
    /// The [VarHandle] of `storage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storage"));
    /// The byte offset of `uuid`.
    public static final long OFFSET_uuid = LAYOUT.byteOffset(PathElement.groupElement("uuid"));
    /// The memory layout of `uuid`.
    public static final MemoryLayout LAYOUT_uuid = LAYOUT.select(PathElement.groupElement("uuid"));
    /// The [VarHandle] of `uuid` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_uuid = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uuid"), PathElement.sequenceElement());

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceCounterKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterKHR`
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceCounterKHR copyFrom(VkPerformanceCounterKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `unit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unit(MemorySegment segment, long index) { return (int) VH_unit.get(segment, 0L, index); }
    /// {@return `unit`}
    public int unit() { return unit(this.segment(), 0L); }
    /// Sets `unit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unit(MemorySegment segment, long index, int value) { VH_unit.set(segment, 0L, index, value); }
    /// Sets `unit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR unit(int value) { unit(this.segment(), 0L, value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    public int scope() { return scope(this.segment(), 0L); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scope(MemorySegment segment, long index, int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR scope(int value) { scope(this.segment(), 0L, value); return this; }

    /// {@return `storage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storage(MemorySegment segment, long index) { return (int) VH_storage.get(segment, 0L, index); }
    /// {@return `storage`}
    public int storage() { return storage(this.segment(), 0L); }
    /// Sets `storage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storage(MemorySegment segment, long index, int value) { VH_storage.set(segment, 0L, index, value); }
    /// Sets `storage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR storage(int value) { storage(this.segment(), 0L, value); return this; }

    /// {@return `uuid` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment uuid(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_uuid, index), LAYOUT_uuid); }
    /// {@return `uuid` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte uuid(MemorySegment segment, long index, long index0) { return (byte) VH_uuid.get(segment, 0L, index, index0); }
    /// {@return `uuid`}
    public MemorySegment uuid() { return uuid(this.segment(), 0L); }
    /// {@return `uuid`}
    /// @param index0 the Index 0 of the array
    public byte uuid(long index0) { return uuid(this.segment(), 0L, index0); }
    /// Sets `uuid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uuid(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_uuid, index), LAYOUT_uuid.byteSize()); }
    /// Sets `uuid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void uuid(MemorySegment segment, long index, long index0, byte value) { VH_uuid.set(segment, 0L, index, index0, value); }
    /// Sets `uuid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR uuid(MemorySegment value) { uuid(this.segment(), 0L, value); return this; }
    /// Sets `uuid` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR uuid(long index0, byte value) { uuid(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkPerformanceCounterKHR].
    public static final class Buffer extends VkPerformanceCounterKHR {
        private final long elementCount;

        /// Creates `VkPerformanceCounterKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceCounterKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceCounterKHR`
        public VkPerformanceCounterKHR asSlice(long index) { return new VkPerformanceCounterKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceCounterKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceCounterKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `unit` at the given index}
        /// @param index the index of the struct buffer
        public int unitAt(long index) { return unit(this.segment(), index); }
        /// Sets `unit` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer unitAt(long index, int value) { unit(this.segment(), index, value); return this; }

        /// {@return `scope` at the given index}
        /// @param index the index of the struct buffer
        public int scopeAt(long index) { return scope(this.segment(), index); }
        /// Sets `scope` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scopeAt(long index, int value) { scope(this.segment(), index, value); return this; }

        /// {@return `storage` at the given index}
        /// @param index the index of the struct buffer
        public int storageAt(long index) { return storage(this.segment(), index); }
        /// Sets `storage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageAt(long index, int value) { storage(this.segment(), index, value); return this; }

        /// {@return `uuid` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment uuidAt(long index) { return uuid(this.segment(), index); }
        /// {@return `uuid` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte uuidAt(long index, long index0) { return uuid(this.segment(), index, index0); }
        /// Sets `uuid` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer uuidAt(long index, MemorySegment value) { uuid(this.segment(), index, value); return this; }
        /// Sets `uuid` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer uuidAt(long index, long index0, byte value) { uuid(this.segment(), index, index0, value); return this; }

    }
}
