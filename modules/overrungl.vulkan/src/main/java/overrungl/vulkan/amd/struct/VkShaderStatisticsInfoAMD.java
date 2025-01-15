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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### shaderStageMask
/// [VarHandle][#VH_shaderStageMask] - [Getter][#shaderStageMask()] - [Setter][#shaderStageMask(int)]
/// ### resourceUsage
/// [Byte offset][#OFFSET_resourceUsage] - [Memory layout][#ML_resourceUsage] - [Getter][#resourceUsage()] - [Setter][#resourceUsage(java.lang.foreign.MemorySegment)]
/// ### numPhysicalVgprs
/// [VarHandle][#VH_numPhysicalVgprs] - [Getter][#numPhysicalVgprs()] - [Setter][#numPhysicalVgprs(int)]
/// ### numPhysicalSgprs
/// [VarHandle][#VH_numPhysicalSgprs] - [Getter][#numPhysicalSgprs()] - [Setter][#numPhysicalSgprs(int)]
/// ### numAvailableVgprs
/// [VarHandle][#VH_numAvailableVgprs] - [Getter][#numAvailableVgprs()] - [Setter][#numAvailableVgprs(int)]
/// ### numAvailableSgprs
/// [VarHandle][#VH_numAvailableSgprs] - [Getter][#numAvailableSgprs()] - [Setter][#numAvailableSgprs(int)]
/// ### computeWorkGroupSize
/// [Byte offset][#OFFSET_computeWorkGroupSize] - [Memory layout][#ML_computeWorkGroupSize] - [Getter][#computeWorkGroupSize()] - [Setter][#computeWorkGroupSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderStatisticsInfoAMD {
///     VkShaderStageFlags shaderStageMask;
///     VkShaderResourceUsageAMD resourceUsage;
///     uint32_t numPhysicalVgprs;
///     uint32_t numPhysicalSgprs;
///     uint32_t numAvailableVgprs;
///     uint32_t numAvailableSgprs;
///     uint32_t[3] computeWorkGroupSize;
/// } VkShaderStatisticsInfoAMD;
/// ```
public sealed class VkShaderStatisticsInfoAMD extends Struct {
    /// The struct layout of `VkShaderStatisticsInfoAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shaderStageMask"),
        overrungl.vulkan.amd.struct.VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
        ValueLayout.JAVA_INT.withName("numPhysicalVgprs"),
        ValueLayout.JAVA_INT.withName("numPhysicalSgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableVgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableSgprs"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("computeWorkGroupSize")
    );
    /// The [VarHandle] of `shaderStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStageMask"));
    /// The byte offset of `resourceUsage`.
    public static final long OFFSET_resourceUsage = LAYOUT.byteOffset(PathElement.groupElement("resourceUsage"));
    /// The memory layout of `resourceUsage`.
    public static final MemoryLayout ML_resourceUsage = LAYOUT.select(PathElement.groupElement("resourceUsage"));
    /// The [VarHandle] of `numPhysicalVgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numPhysicalVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalVgprs"));
    /// The [VarHandle] of `numPhysicalSgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numPhysicalSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhysicalSgprs"));
    /// The [VarHandle] of `numAvailableVgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numAvailableVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableVgprs"));
    /// The [VarHandle] of `numAvailableSgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numAvailableSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numAvailableSgprs"));
    /// The byte offset of `computeWorkGroupSize`.
    public static final long OFFSET_computeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("computeWorkGroupSize"));
    /// The memory layout of `computeWorkGroupSize`.
    public static final MemoryLayout ML_computeWorkGroupSize = LAYOUT.select(PathElement.groupElement("computeWorkGroupSize"));

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    /// @param segment the memory segment
    public VkShaderStatisticsInfoAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderStatisticsInfoAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderStatisticsInfoAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderStatisticsInfoAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderStatisticsInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkShaderStatisticsInfoAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderStatisticsInfoAMD`
    public static VkShaderStatisticsInfoAMD alloc(SegmentAllocator allocator) { return new VkShaderStatisticsInfoAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderStatisticsInfoAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderStatisticsInfoAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderStatisticsInfoAMD` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderStatisticsInfoAMD`
    public static VkShaderStatisticsInfoAMD allocInit(SegmentAllocator allocator, @CType("VkShaderStageFlags") int shaderStageMask, @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment resourceUsage, @CType("uint32_t") int numPhysicalVgprs, @CType("uint32_t") int numPhysicalSgprs, @CType("uint32_t") int numAvailableVgprs, @CType("uint32_t") int numAvailableSgprs, @CType("uint32_t[3]") java.lang.foreign.MemorySegment computeWorkGroupSize) { return alloc(allocator).shaderStageMask(shaderStageMask).resourceUsage(resourceUsage).numPhysicalVgprs(numPhysicalVgprs).numPhysicalSgprs(numPhysicalSgprs).numAvailableVgprs(numAvailableVgprs).numAvailableSgprs(numAvailableSgprs).computeWorkGroupSize(computeWorkGroupSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderStatisticsInfoAMD copyFrom(VkShaderStatisticsInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `shaderStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_shaderStageMask(MemorySegment segment, long index) { return (int) VH_shaderStageMask.get(segment, 0L, index); }
    /// {@return `shaderStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_shaderStageMask(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_shaderStageMask(segment, 0L); }
    /// {@return `shaderStageMask`}
    public @CType("VkShaderStageFlags") int shaderStageMask() { return VkShaderStatisticsInfoAMD.get_shaderStageMask(this.segment()); }
    /// Sets `shaderStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStageMask(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_shaderStageMask.set(segment, 0L, index, value); }
    /// Sets `shaderStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStageMask(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkShaderStatisticsInfoAMD.set_shaderStageMask(segment, 0L, value); }
    /// Sets `shaderStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD shaderStageMask(@CType("VkShaderStageFlags") int value) { VkShaderStatisticsInfoAMD.set_shaderStageMask(this.segment(), value); return this; }

    /// {@return `resourceUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment get_resourceUsage(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_resourceUsage, index), ML_resourceUsage); }
    /// {@return `resourceUsage`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment get_resourceUsage(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_resourceUsage(segment, 0L); }
    /// {@return `resourceUsage`}
    public @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment resourceUsage() { return VkShaderStatisticsInfoAMD.get_resourceUsage(this.segment()); }
    /// Sets `resourceUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resourceUsage(MemorySegment segment, long index, @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_resourceUsage, index), ML_resourceUsage.byteSize()); }
    /// Sets `resourceUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resourceUsage(MemorySegment segment, @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_resourceUsage(segment, 0L, value); }
    /// Sets `resourceUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD resourceUsage(@CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_resourceUsage(this.segment(), value); return this; }

    /// {@return `numPhysicalVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numPhysicalVgprs(MemorySegment segment, long index) { return (int) VH_numPhysicalVgprs.get(segment, 0L, index); }
    /// {@return `numPhysicalVgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numPhysicalVgprs(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_numPhysicalVgprs(segment, 0L); }
    /// {@return `numPhysicalVgprs`}
    public @CType("uint32_t") int numPhysicalVgprs() { return VkShaderStatisticsInfoAMD.get_numPhysicalVgprs(this.segment()); }
    /// Sets `numPhysicalVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numPhysicalVgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numPhysicalVgprs.set(segment, 0L, index, value); }
    /// Sets `numPhysicalVgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numPhysicalVgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalVgprs(segment, 0L, value); }
    /// Sets `numPhysicalVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalVgprs(@CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalVgprs(this.segment(), value); return this; }

    /// {@return `numPhysicalSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numPhysicalSgprs(MemorySegment segment, long index) { return (int) VH_numPhysicalSgprs.get(segment, 0L, index); }
    /// {@return `numPhysicalSgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numPhysicalSgprs(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_numPhysicalSgprs(segment, 0L); }
    /// {@return `numPhysicalSgprs`}
    public @CType("uint32_t") int numPhysicalSgprs() { return VkShaderStatisticsInfoAMD.get_numPhysicalSgprs(this.segment()); }
    /// Sets `numPhysicalSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numPhysicalSgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numPhysicalSgprs.set(segment, 0L, index, value); }
    /// Sets `numPhysicalSgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numPhysicalSgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalSgprs(segment, 0L, value); }
    /// Sets `numPhysicalSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numPhysicalSgprs(@CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalSgprs(this.segment(), value); return this; }

    /// {@return `numAvailableVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numAvailableVgprs(MemorySegment segment, long index) { return (int) VH_numAvailableVgprs.get(segment, 0L, index); }
    /// {@return `numAvailableVgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numAvailableVgprs(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_numAvailableVgprs(segment, 0L); }
    /// {@return `numAvailableVgprs`}
    public @CType("uint32_t") int numAvailableVgprs() { return VkShaderStatisticsInfoAMD.get_numAvailableVgprs(this.segment()); }
    /// Sets `numAvailableVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numAvailableVgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numAvailableVgprs.set(segment, 0L, index, value); }
    /// Sets `numAvailableVgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numAvailableVgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableVgprs(segment, 0L, value); }
    /// Sets `numAvailableVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableVgprs(@CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableVgprs(this.segment(), value); return this; }

    /// {@return `numAvailableSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numAvailableSgprs(MemorySegment segment, long index) { return (int) VH_numAvailableSgprs.get(segment, 0L, index); }
    /// {@return `numAvailableSgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numAvailableSgprs(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_numAvailableSgprs(segment, 0L); }
    /// {@return `numAvailableSgprs`}
    public @CType("uint32_t") int numAvailableSgprs() { return VkShaderStatisticsInfoAMD.get_numAvailableSgprs(this.segment()); }
    /// Sets `numAvailableSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numAvailableSgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numAvailableSgprs.set(segment, 0L, index, value); }
    /// Sets `numAvailableSgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numAvailableSgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableSgprs(segment, 0L, value); }
    /// Sets `numAvailableSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD numAvailableSgprs(@CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableSgprs(this.segment(), value); return this; }

    /// {@return `computeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_computeWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_computeWorkGroupSize, index), ML_computeWorkGroupSize); }
    /// {@return `computeWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_computeWorkGroupSize(MemorySegment segment) { return VkShaderStatisticsInfoAMD.get_computeWorkGroupSize(segment, 0L); }
    /// {@return `computeWorkGroupSize`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment computeWorkGroupSize() { return VkShaderStatisticsInfoAMD.get_computeWorkGroupSize(this.segment()); }
    /// Sets `computeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_computeWorkGroupSize, index), ML_computeWorkGroupSize.byteSize()); }
    /// Sets `computeWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_computeWorkGroupSize(segment, 0L, value); }
    /// Sets `computeWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderStatisticsInfoAMD computeWorkGroupSize(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_computeWorkGroupSize(this.segment(), value); return this; }

    /// A buffer of [VkShaderStatisticsInfoAMD].
    public static final class Buffer extends VkShaderStatisticsInfoAMD {
        private final long elementCount;

        /// Creates `VkShaderStatisticsInfoAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShaderStatisticsInfoAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShaderStatisticsInfoAMD`
        public VkShaderStatisticsInfoAMD asSlice(long index) { return new VkShaderStatisticsInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShaderStatisticsInfoAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShaderStatisticsInfoAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `shaderStageMask` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int shaderStageMaskAt(long index) { return VkShaderStatisticsInfoAMD.get_shaderStageMask(this.segment(), index); }
        /// Sets `shaderStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStageMaskAt(long index, @CType("VkShaderStageFlags") int value) { VkShaderStatisticsInfoAMD.set_shaderStageMask(this.segment(), index, value); return this; }

        /// {@return `resourceUsage` at the given index}
        /// @param index the index
        public @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment resourceUsageAt(long index) { return VkShaderStatisticsInfoAMD.get_resourceUsage(this.segment(), index); }
        /// Sets `resourceUsage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer resourceUsageAt(long index, @CType("VkShaderResourceUsageAMD") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_resourceUsage(this.segment(), index, value); return this; }

        /// {@return `numPhysicalVgprs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numPhysicalVgprsAt(long index) { return VkShaderStatisticsInfoAMD.get_numPhysicalVgprs(this.segment(), index); }
        /// Sets `numPhysicalVgprs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numPhysicalVgprsAt(long index, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalVgprs(this.segment(), index, value); return this; }

        /// {@return `numPhysicalSgprs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numPhysicalSgprsAt(long index) { return VkShaderStatisticsInfoAMD.get_numPhysicalSgprs(this.segment(), index); }
        /// Sets `numPhysicalSgprs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numPhysicalSgprsAt(long index, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numPhysicalSgprs(this.segment(), index, value); return this; }

        /// {@return `numAvailableVgprs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numAvailableVgprsAt(long index) { return VkShaderStatisticsInfoAMD.get_numAvailableVgprs(this.segment(), index); }
        /// Sets `numAvailableVgprs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numAvailableVgprsAt(long index, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableVgprs(this.segment(), index, value); return this; }

        /// {@return `numAvailableSgprs` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numAvailableSgprsAt(long index) { return VkShaderStatisticsInfoAMD.get_numAvailableSgprs(this.segment(), index); }
        /// Sets `numAvailableSgprs` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numAvailableSgprsAt(long index, @CType("uint32_t") int value) { VkShaderStatisticsInfoAMD.set_numAvailableSgprs(this.segment(), index, value); return this; }

        /// {@return `computeWorkGroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") java.lang.foreign.MemorySegment computeWorkGroupSizeAt(long index) { return VkShaderStatisticsInfoAMD.get_computeWorkGroupSize(this.segment(), index); }
        /// Sets `computeWorkGroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer computeWorkGroupSizeAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkShaderStatisticsInfoAMD.set_computeWorkGroupSize(this.segment(), index, value); return this; }

    }
}
