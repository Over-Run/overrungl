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
package overrungl.vulkan.huawei.struct;

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
/// ### maxWorkGroupCount
/// [Byte offset][#OFFSET_maxWorkGroupCount] - [Memory layout][#ML_maxWorkGroupCount] - [Getter][#maxWorkGroupCount()] - [Setter][#maxWorkGroupCount(MemorySegment)]
/// ### maxWorkGroupSize
/// [Byte offset][#OFFSET_maxWorkGroupSize] - [Memory layout][#ML_maxWorkGroupSize] - [Getter][#maxWorkGroupSize()] - [Setter][#maxWorkGroupSize(MemorySegment)]
/// ### maxOutputClusterCount
/// [VarHandle][#VH_maxOutputClusterCount] - [Getter][#maxOutputClusterCount()] - [Setter][#maxOutputClusterCount(int)]
/// ### indirectBufferOffsetAlignment
/// [VarHandle][#VH_indirectBufferOffsetAlignment] - [Getter][#indirectBufferOffsetAlignment()] - [Setter][#indirectBufferOffsetAlignment(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t[3] maxWorkGroupCount;
///     uint32_t[3] maxWorkGroupSize;
///     uint32_t maxOutputClusterCount;
///     VkDeviceSize indirectBufferOffsetAlignment;
/// } VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI;
/// ```
public sealed class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends Struct {
    /// The struct layout of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxWorkGroupCount`.
    public static final long OFFSET_maxWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupCount"));
    /// The memory layout of `maxWorkGroupCount`.
    public static final MemoryLayout ML_maxWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxWorkGroupCount"));
    /// The byte offset of `maxWorkGroupSize`.
    public static final long OFFSET_maxWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxWorkGroupSize"));
    /// The memory layout of `maxWorkGroupSize`.
    public static final MemoryLayout ML_maxWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxWorkGroupSize"));
    /// The [VarHandle] of `maxOutputClusterCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOutputClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOutputClusterCount"));
    /// The [VarHandle] of `indirectBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indirectBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectBufferOffsetAlignment"));

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t[3]") MemorySegment maxWorkGroupCount, @CType("uint32_t[3]") MemorySegment maxWorkGroupSize, @CType("uint32_t") int maxOutputClusterCount, @CType("VkDeviceSize") long indirectBufferOffsetAlignment) { return alloc(allocator).sType(sType).pNext(pNext).maxWorkGroupCount(maxWorkGroupCount).maxWorkGroupSize(maxWorkGroupSize).maxOutputClusterCount(maxOutputClusterCount).indirectBufferOffsetAlignment(indirectBufferOffsetAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI copyFrom(VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(@CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `maxWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") MemorySegment get_maxWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWorkGroupCount, index), ML_maxWorkGroupCount); }
    /// {@return `maxWorkGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") MemorySegment get_maxWorkGroupCount(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(segment, 0L); }
    /// {@return `maxWorkGroupCount`}
    public @CType("uint32_t[3]") MemorySegment maxWorkGroupCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(this.segment()); }
    /// Sets `maxWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWorkGroupCount(MemorySegment segment, long index, @CType("uint32_t[3]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWorkGroupCount, index), ML_maxWorkGroupCount.byteSize()); }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWorkGroupCount(MemorySegment segment, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(segment, 0L, value); }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(@CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(this.segment(), value); return this; }

    /// {@return `maxWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") MemorySegment get_maxWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxWorkGroupSize, index), ML_maxWorkGroupSize); }
    /// {@return `maxWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") MemorySegment get_maxWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(segment, 0L); }
    /// {@return `maxWorkGroupSize`}
    public @CType("uint32_t[3]") MemorySegment maxWorkGroupSize() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(this.segment()); }
    /// Sets `maxWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxWorkGroupSize, index), ML_maxWorkGroupSize.byteSize()); }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(segment, 0L, value); }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(@CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxOutputClusterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOutputClusterCount(MemorySegment segment, long index) { return (int) VH_maxOutputClusterCount.get(segment, 0L, index); }
    /// {@return `maxOutputClusterCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOutputClusterCount(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(segment, 0L); }
    /// {@return `maxOutputClusterCount`}
    public @CType("uint32_t") int maxOutputClusterCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(this.segment()); }
    /// Sets `maxOutputClusterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOutputClusterCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOutputClusterCount.set(segment, 0L, index, value); }
    /// Sets `maxOutputClusterCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOutputClusterCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(segment, 0L, value); }
    /// Sets `maxOutputClusterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCount(@CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(this.segment(), value); return this; }

    /// {@return `indirectBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indirectBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_indirectBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `indirectBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indirectBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(segment, 0L); }
    /// {@return `indirectBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long indirectBufferOffsetAlignment() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(this.segment()); }
    /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indirectBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `indirectBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `indirectBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI].
    public static final class Buffer extends VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI asSlice(long index) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxWorkGroupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") MemorySegment maxWorkGroupCountAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(this.segment(), index); }
        /// Sets `maxWorkGroupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupCountAt(long index, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(this.segment(), index, value); return this; }

        /// {@return `maxWorkGroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") MemorySegment maxWorkGroupSizeAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(this.segment(), index); }
        /// Sets `maxWorkGroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxWorkGroupSizeAt(long index, @CType("uint32_t[3]") MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(this.segment(), index, value); return this; }

        /// {@return `maxOutputClusterCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxOutputClusterCountAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(this.segment(), index); }
        /// Sets `maxOutputClusterCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxOutputClusterCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(this.segment(), index, value); return this; }

        /// {@return `indirectBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long indirectBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(this.segment(), index); }
        /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(this.segment(), index, value); return this; }

    }
}
