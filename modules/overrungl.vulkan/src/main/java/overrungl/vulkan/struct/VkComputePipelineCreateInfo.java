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
package overrungl.vulkan.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### stage
/// [Byte offset][#OFFSET_stage] - [Memory layout][#ML_stage] - [Getter][#stage()] - [Setter][#stage(MemorySegment)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(MemorySegment)]
/// ### basePipelineHandle
/// [VarHandle][#VH_basePipelineHandle] - [Getter][#basePipelineHandle()] - [Setter][#basePipelineHandle(MemorySegment)]
/// ### basePipelineIndex
/// [VarHandle][#VH_basePipelineIndex] - [Getter][#basePipelineIndex()] - [Setter][#basePipelineIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkComputePipelineCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCreateFlags flags;
///     VkPipelineShaderStageCreateInfo stage;
///     VkPipelineLayout layout;
///     VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// } VkComputePipelineCreateInfo;
/// ```
public sealed class VkComputePipelineCreateInfo extends Struct {
    /// The struct layout of `VkComputePipelineCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkPipelineShaderStageCreateInfo.LAYOUT.withName("stage"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.ADDRESS.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `stage`.
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    /// The memory layout of `stage`.
    public static final MemoryLayout ML_stage = LAYOUT.select(PathElement.groupElement("stage"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_basePipelineHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_basePipelineIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex"));

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkComputePipelineCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkComputePipelineCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkComputePipelineCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkComputePipelineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkComputePipelineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComputePipelineCreateInfo`
    public static VkComputePipelineCreateInfo alloc(SegmentAllocator allocator) { return new VkComputePipelineCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkComputePipelineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkComputePipelineCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkComputePipelineCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkComputePipelineCreateInfo`
    public static VkComputePipelineCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineCreateFlags") int flags, @CType("VkPipelineShaderStageCreateInfo") MemorySegment stage, @CType("VkPipelineLayout") MemorySegment layout, @CType("VkPipeline") MemorySegment basePipelineHandle, @CType("int32_t") int basePipelineIndex) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).stage(stage).layout(layout).basePipelineHandle(basePipelineHandle).basePipelineIndex(basePipelineIndex); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkComputePipelineCreateInfo copyFrom(VkComputePipelineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkComputePipelineCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkComputePipelineCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkComputePipelineCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo sType(@CType("VkStructureType") int value) { VkComputePipelineCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkComputePipelineCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkComputePipelineCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkComputePipelineCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo pNext(@CType("const void *") MemorySegment value) { VkComputePipelineCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCreateFlags") int get_flags(MemorySegment segment) { return VkComputePipelineCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCreateFlags") int flags() { return VkComputePipelineCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCreateFlags") int value) { VkComputePipelineCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo flags(@CType("VkPipelineCreateFlags") int value) { VkComputePipelineCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineShaderStageCreateInfo") MemorySegment get_stage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stage, index), ML_stage); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineShaderStageCreateInfo") MemorySegment get_stage(MemorySegment segment) { return VkComputePipelineCreateInfo.get_stage(segment, 0L); }
    /// {@return `stage`}
    public @CType("VkPipelineShaderStageCreateInfo") MemorySegment stage() { return VkComputePipelineCreateInfo.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkPipelineShaderStageCreateInfo") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stage, index), ML_stage.byteSize()); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkPipelineShaderStageCreateInfo") MemorySegment value) { VkComputePipelineCreateInfo.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo stage(@CType("VkPipelineShaderStageCreateInfo") MemorySegment value) { VkComputePipelineCreateInfo.set_stage(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment, long index) { return (MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") MemorySegment get_layout(MemorySegment segment) { return VkComputePipelineCreateInfo.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") MemorySegment layout() { return VkComputePipelineCreateInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") MemorySegment value) { VkComputePipelineCreateInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo layout(@CType("VkPipelineLayout") MemorySegment value) { VkComputePipelineCreateInfo.set_layout(this.segment(), value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") MemorySegment get_basePipelineHandle(MemorySegment segment, long index) { return (MemorySegment) VH_basePipelineHandle.get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") MemorySegment get_basePipelineHandle(MemorySegment segment) { return VkComputePipelineCreateInfo.get_basePipelineHandle(segment, 0L); }
    /// {@return `basePipelineHandle`}
    public @CType("VkPipeline") MemorySegment basePipelineHandle() { return VkComputePipelineCreateInfo.get_basePipelineHandle(this.segment()); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, long index, @CType("VkPipeline") MemorySegment value) { VH_basePipelineHandle.set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineHandle(MemorySegment segment, @CType("VkPipeline") MemorySegment value) { VkComputePipelineCreateInfo.set_basePipelineHandle(segment, 0L, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo basePipelineHandle(@CType("VkPipeline") MemorySegment value) { VkComputePipelineCreateInfo.set_basePipelineHandle(this.segment(), value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_basePipelineIndex(MemorySegment segment) { return VkComputePipelineCreateInfo.get_basePipelineIndex(segment, 0L); }
    /// {@return `basePipelineIndex`}
    public @CType("int32_t") int basePipelineIndex() { return VkComputePipelineCreateInfo.get_basePipelineIndex(this.segment()); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, long index, @CType("int32_t") int value) { VH_basePipelineIndex.set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_basePipelineIndex(MemorySegment segment, @CType("int32_t") int value) { VkComputePipelineCreateInfo.set_basePipelineIndex(segment, 0L, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkComputePipelineCreateInfo basePipelineIndex(@CType("int32_t") int value) { VkComputePipelineCreateInfo.set_basePipelineIndex(this.segment(), value); return this; }

    /// A buffer of [VkComputePipelineCreateInfo].
    public static final class Buffer extends VkComputePipelineCreateInfo {
        private final long elementCount;

        /// Creates `VkComputePipelineCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkComputePipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkComputePipelineCreateInfo`
        public VkComputePipelineCreateInfo asSlice(long index) { return new VkComputePipelineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkComputePipelineCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkComputePipelineCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkComputePipelineCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkComputePipelineCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkComputePipelineCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkComputePipelineCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCreateFlags") int flagsAt(long index) { return VkComputePipelineCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCreateFlags") int value) { VkComputePipelineCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `stage` at the given index}
        /// @param index the index
        public @CType("VkPipelineShaderStageCreateInfo") MemorySegment stageAt(long index) { return VkComputePipelineCreateInfo.get_stage(this.segment(), index); }
        /// Sets `stage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageAt(long index, @CType("VkPipelineShaderStageCreateInfo") MemorySegment value) { VkComputePipelineCreateInfo.set_stage(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") MemorySegment layoutAt(long index) { return VkComputePipelineCreateInfo.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkPipelineLayout") MemorySegment value) { VkComputePipelineCreateInfo.set_layout(this.segment(), index, value); return this; }

        /// {@return `basePipelineHandle` at the given index}
        /// @param index the index
        public @CType("VkPipeline") MemorySegment basePipelineHandleAt(long index) { return VkComputePipelineCreateInfo.get_basePipelineHandle(this.segment(), index); }
        /// Sets `basePipelineHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineHandleAt(long index, @CType("VkPipeline") MemorySegment value) { VkComputePipelineCreateInfo.set_basePipelineHandle(this.segment(), index, value); return this; }

        /// {@return `basePipelineIndex` at the given index}
        /// @param index the index
        public @CType("int32_t") int basePipelineIndexAt(long index) { return VkComputePipelineCreateInfo.get_basePipelineIndex(this.segment(), index); }
        /// Sets `basePipelineIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer basePipelineIndexAt(long index, @CType("int32_t") int value) { VkComputePipelineCreateInfo.set_basePipelineIndex(this.segment(), index, value); return this; }

    }
}
