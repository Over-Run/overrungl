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
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportAndroidHardwareBufferInfoANDROID {
///     VkStructureType sType;
///     const void * pNext;
///     struct AHardwareBuffer * buffer;
/// } VkImportAndroidHardwareBufferInfoANDROID;
/// ```
public sealed class VkImportAndroidHardwareBufferInfoANDROID extends Struct {
    /// The struct layout of `VkImportAndroidHardwareBufferInfoANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("buffer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    /// @param segment the memory segment
    public VkImportAndroidHardwareBufferInfoANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportAndroidHardwareBufferInfoANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportAndroidHardwareBufferInfoANDROID(segment); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportAndroidHardwareBufferInfoANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportAndroidHardwareBufferInfoANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportAndroidHardwareBufferInfoANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportAndroidHardwareBufferInfoANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportAndroidHardwareBufferInfoANDROID`
    public static VkImportAndroidHardwareBufferInfoANDROID alloc(SegmentAllocator allocator) { return new VkImportAndroidHardwareBufferInfoANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportAndroidHardwareBufferInfoANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportAndroidHardwareBufferInfoANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportAndroidHardwareBufferInfoANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportAndroidHardwareBufferInfoANDROID`
    public static VkImportAndroidHardwareBufferInfoANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("struct AHardwareBuffer *") MemorySegment buffer) { return alloc(allocator).sType(sType).pNext(pNext).buffer(buffer); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID copyFrom(VkImportAndroidHardwareBufferInfoANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID sType(@CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID pNext(@CType("const void *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("struct AHardwareBuffer *") MemorySegment get_buffer(MemorySegment segment, long index) { return (MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("struct AHardwareBuffer *") MemorySegment get_buffer(MemorySegment segment) { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(segment, 0L); }
    /// {@return `buffer`}
    public @CType("struct AHardwareBuffer *") MemorySegment buffer() { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("struct AHardwareBuffer *") MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("struct AHardwareBuffer *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportAndroidHardwareBufferInfoANDROID buffer(@CType("struct AHardwareBuffer *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(this.segment(), value); return this; }

    /// A buffer of [VkImportAndroidHardwareBufferInfoANDROID].
    public static final class Buffer extends VkImportAndroidHardwareBufferInfoANDROID {
        private final long elementCount;

        /// Creates `VkImportAndroidHardwareBufferInfoANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportAndroidHardwareBufferInfoANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportAndroidHardwareBufferInfoANDROID`
        public VkImportAndroidHardwareBufferInfoANDROID asSlice(long index) { return new VkImportAndroidHardwareBufferInfoANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportAndroidHardwareBufferInfoANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportAndroidHardwareBufferInfoANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportAndroidHardwareBufferInfoANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `buffer` at the given index}
        /// @param index the index
        public @CType("struct AHardwareBuffer *") MemorySegment bufferAt(long index) { return VkImportAndroidHardwareBufferInfoANDROID.get_buffer(this.segment(), index); }
        /// Sets `buffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferAt(long index, @CType("struct AHardwareBuffer *") MemorySegment value) { VkImportAndroidHardwareBufferInfoANDROID.set_buffer(this.segment(), index, value); return this; }

    }
}
