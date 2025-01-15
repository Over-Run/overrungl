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
package overrungl.vulkan.qcom.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### windowExtent
/// [Byte offset][#OFFSET_windowExtent] - [Memory layout][#ML_windowExtent] - [Getter][#windowExtent()] - [Setter][#windowExtent(java.lang.foreign.MemorySegment)]
/// ### windowCompareMode
/// [VarHandle][#VH_windowCompareMode] - [Getter][#windowCompareMode()] - [Setter][#windowCompareMode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerBlockMatchWindowCreateInfoQCOM {
///     VkStructureType sType;
///     const void * pNext;
///     VkExtent2D windowExtent;
///     VkBlockMatchWindowCompareModeQCOM windowCompareMode;
/// } VkSamplerBlockMatchWindowCreateInfoQCOM;
/// ```
public sealed class VkSamplerBlockMatchWindowCreateInfoQCOM extends Struct {
    /// The struct layout of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `windowExtent`.
    public static final long OFFSET_windowExtent = LAYOUT.byteOffset(PathElement.groupElement("windowExtent"));
    /// The memory layout of `windowExtent`.
    public static final MemoryLayout ML_windowExtent = LAYOUT.select(PathElement.groupElement("windowExtent"));
    /// The [VarHandle] of `windowCompareMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_windowCompareMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("windowCompareMode"));

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerBlockMatchWindowCreateInfoQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerBlockMatchWindowCreateInfoQCOM`
    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkExtent2D") java.lang.foreign.MemorySegment windowExtent, @CType("VkBlockMatchWindowCompareModeQCOM") int windowCompareMode) { return alloc(allocator).sType(sType).pNext(pNext).windowExtent(windowExtent).windowCompareMode(windowCompareMode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM copyFrom(VkSamplerBlockMatchWindowCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(@CType("VkStructureType") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `windowExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_windowExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_windowExtent, index), ML_windowExtent); }
    /// {@return `windowExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_windowExtent(MemorySegment segment) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowExtent(segment, 0L); }
    /// {@return `windowExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment windowExtent() { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowExtent(this.segment()); }
    /// Sets `windowExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_windowExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_windowExtent, index), ML_windowExtent.byteSize()); }
    /// Sets `windowExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_windowExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowExtent(segment, 0L, value); }
    /// Sets `windowExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowExtent(this.segment(), value); return this; }

    /// {@return `windowCompareMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBlockMatchWindowCompareModeQCOM") int get_windowCompareMode(MemorySegment segment, long index) { return (int) VH_windowCompareMode.get(segment, 0L, index); }
    /// {@return `windowCompareMode`}
    /// @param segment the segment of the struct
    public static @CType("VkBlockMatchWindowCompareModeQCOM") int get_windowCompareMode(MemorySegment segment) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowCompareMode(segment, 0L); }
    /// {@return `windowCompareMode`}
    public @CType("VkBlockMatchWindowCompareModeQCOM") int windowCompareMode() { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowCompareMode(this.segment()); }
    /// Sets `windowCompareMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_windowCompareMode(MemorySegment segment, long index, @CType("VkBlockMatchWindowCompareModeQCOM") int value) { VH_windowCompareMode.set(segment, 0L, index, value); }
    /// Sets `windowCompareMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_windowCompareMode(MemorySegment segment, @CType("VkBlockMatchWindowCompareModeQCOM") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowCompareMode(segment, 0L, value); }
    /// Sets `windowCompareMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(@CType("VkBlockMatchWindowCompareModeQCOM") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowCompareMode(this.segment(), value); return this; }

    /// A buffer of [VkSamplerBlockMatchWindowCreateInfoQCOM].
    public static final class Buffer extends VkSamplerBlockMatchWindowCreateInfoQCOM {
        private final long elementCount;

        /// Creates `VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`
        public VkSamplerBlockMatchWindowCreateInfoQCOM asSlice(long index) { return new VkSamplerBlockMatchWindowCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerBlockMatchWindowCreateInfoQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `windowExtent` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment windowExtentAt(long index) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowExtent(this.segment(), index); }
        /// Sets `windowExtent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer windowExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowExtent(this.segment(), index, value); return this; }

        /// {@return `windowCompareMode` at the given index}
        /// @param index the index
        public @CType("VkBlockMatchWindowCompareModeQCOM") int windowCompareModeAt(long index) { return VkSamplerBlockMatchWindowCreateInfoQCOM.get_windowCompareMode(this.segment(), index); }
        /// Sets `windowCompareMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer windowCompareModeAt(long index, @CType("VkBlockMatchWindowCompareModeQCOM") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.set_windowCompareMode(this.segment(), index, value); return this; }

    }
}
