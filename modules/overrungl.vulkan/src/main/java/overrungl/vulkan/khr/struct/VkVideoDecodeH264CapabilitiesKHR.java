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
package overrungl.vulkan.khr.struct;

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
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ### fieldOffsetGranularity
/// [Byte offset][#OFFSET_fieldOffsetGranularity] - [Memory layout][#ML_fieldOffsetGranularity] - [Getter][#fieldOffsetGranularity()] - [Setter][#fieldOffsetGranularity(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     StdVideoH264LevelIdc maxLevelIdc;
///     VkOffset2D fieldOffsetGranularity;
/// } VkVideoDecodeH264CapabilitiesKHR;
/// ```
public sealed class VkVideoDecodeH264CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoDecodeH264CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("fieldOffsetGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The byte offset of `fieldOffsetGranularity`.
    public static final long OFFSET_fieldOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fieldOffsetGranularity"));
    /// The memory layout of `fieldOffsetGranularity`.
    public static final MemoryLayout ML_fieldOffsetGranularity = LAYOUT.select(PathElement.groupElement("fieldOffsetGranularity"));

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static VkVideoDecodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH264CapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264CapabilitiesKHR`
    public static VkVideoDecodeH264CapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("StdVideoH264LevelIdc") int maxLevelIdc, @CType("VkOffset2D") java.lang.foreign.MemorySegment fieldOffsetGranularity) { return alloc(allocator).sType(sType).pNext(pNext).maxLevelIdc(maxLevelIdc).fieldOffsetGranularity(fieldOffsetGranularity); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR copyFrom(VkVideoDecodeH264CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeH264CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH264LevelIdc") int maxLevelIdc() { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH264LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR maxLevelIdc(@CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// {@return `fieldOffsetGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_fieldOffsetGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), ML_fieldOffsetGranularity); }
    /// {@return `fieldOffsetGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_fieldOffsetGranularity(MemorySegment segment) { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(segment, 0L); }
    /// {@return `fieldOffsetGranularity`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment fieldOffsetGranularity() { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(this.segment()); }
    /// Sets `fieldOffsetGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fieldOffsetGranularity(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fieldOffsetGranularity, index), ML_fieldOffsetGranularity.byteSize()); }
    /// Sets `fieldOffsetGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fieldOffsetGranularity(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(segment, 0L, value); }
    /// Sets `fieldOffsetGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264CapabilitiesKHR fieldOffsetGranularity(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeH264CapabilitiesKHR].
    public static final class Buffer extends VkVideoDecodeH264CapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH264CapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH264CapabilitiesKHR`
        public VkVideoDecodeH264CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH264CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH264CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH264CapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeH264CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxLevelIdc` at the given index}
        /// @param index the index
        public @CType("StdVideoH264LevelIdc") int maxLevelIdcAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment(), index); }
        /// Sets `maxLevelIdc` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelIdcAt(long index, @CType("StdVideoH264LevelIdc") int value) { VkVideoDecodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), index, value); return this; }

        /// {@return `fieldOffsetGranularity` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") java.lang.foreign.MemorySegment fieldOffsetGranularityAt(long index) { return VkVideoDecodeH264CapabilitiesKHR.get_fieldOffsetGranularity(this.segment(), index); }
        /// Sets `fieldOffsetGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fieldOffsetGranularityAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoDecodeH264CapabilitiesKHR.set_fieldOffsetGranularity(this.segment(), index, value); return this; }

    }
}
