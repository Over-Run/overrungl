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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkGeneratedCommandsInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags shaderStages;
///     (uint64_t) VkIndirectExecutionSetEXT indirectExecutionSet;
///     (uint64_t) VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     (uint64_t) VkDeviceAddress indirectAddress;
///     (uint64_t) VkDeviceSize indirectAddressSize;
///     (uint64_t) VkDeviceAddress preprocessAddress;
///     (uint64_t) VkDeviceSize preprocessSize;
///     uint32_t maxSequenceCount;
///     (uint64_t) VkDeviceAddress sequenceCountAddress;
///     uint32_t maxDrawCount;
/// };
/// ```
public final class VkGeneratedCommandsInfoEXT extends GroupType {
    /// The struct layout of `VkGeneratedCommandsInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_LONG.withName("indirectExecutionSet"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_LONG.withName("indirectAddress"),
        ValueLayout.JAVA_LONG.withName("indirectAddressSize"),
        ValueLayout.JAVA_LONG.withName("preprocessAddress"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_LONG.withName("sequenceCountAddress"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
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
    /// The byte offset of `shaderStages`.
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    /// The memory layout of `shaderStages`.
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    /// The byte offset of `indirectExecutionSet`.
    public static final long OFFSET_indirectExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
    /// The memory layout of `indirectExecutionSet`.
    public static final MemoryLayout LAYOUT_indirectExecutionSet = LAYOUT.select(PathElement.groupElement("indirectExecutionSet"));
    /// The [VarHandle] of `indirectExecutionSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    /// The byte offset of `indirectCommandsLayout`.
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    /// The memory layout of `indirectCommandsLayout`.
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The byte offset of `indirectAddress`.
    public static final long OFFSET_indirectAddress = LAYOUT.byteOffset(PathElement.groupElement("indirectAddress"));
    /// The memory layout of `indirectAddress`.
    public static final MemoryLayout LAYOUT_indirectAddress = LAYOUT.select(PathElement.groupElement("indirectAddress"));
    /// The [VarHandle] of `indirectAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddress"));
    /// The byte offset of `indirectAddressSize`.
    public static final long OFFSET_indirectAddressSize = LAYOUT.byteOffset(PathElement.groupElement("indirectAddressSize"));
    /// The memory layout of `indirectAddressSize`.
    public static final MemoryLayout LAYOUT_indirectAddressSize = LAYOUT.select(PathElement.groupElement("indirectAddressSize"));
    /// The [VarHandle] of `indirectAddressSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectAddressSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddressSize"));
    /// The byte offset of `preprocessAddress`.
    public static final long OFFSET_preprocessAddress = LAYOUT.byteOffset(PathElement.groupElement("preprocessAddress"));
    /// The memory layout of `preprocessAddress`.
    public static final MemoryLayout LAYOUT_preprocessAddress = LAYOUT.select(PathElement.groupElement("preprocessAddress"));
    /// The [VarHandle] of `preprocessAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessAddress"));
    /// The byte offset of `preprocessSize`.
    public static final long OFFSET_preprocessSize = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
    /// The memory layout of `preprocessSize`.
    public static final MemoryLayout LAYOUT_preprocessSize = LAYOUT.select(PathElement.groupElement("preprocessSize"));
    /// The [VarHandle] of `preprocessSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    /// The byte offset of `maxSequenceCount`.
    public static final long OFFSET_maxSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
    /// The memory layout of `maxSequenceCount`.
    public static final MemoryLayout LAYOUT_maxSequenceCount = LAYOUT.select(PathElement.groupElement("maxSequenceCount"));
    /// The [VarHandle] of `maxSequenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    /// The byte offset of `sequenceCountAddress`.
    public static final long OFFSET_sequenceCountAddress = LAYOUT.byteOffset(PathElement.groupElement("sequenceCountAddress"));
    /// The memory layout of `sequenceCountAddress`.
    public static final MemoryLayout LAYOUT_sequenceCountAddress = LAYOUT.select(PathElement.groupElement("sequenceCountAddress"));
    /// The [VarHandle] of `sequenceCountAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sequenceCountAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequenceCountAddress"));
    /// The byte offset of `maxDrawCount`.
    public static final long OFFSET_maxDrawCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
    /// The memory layout of `maxDrawCount`.
    public static final MemoryLayout LAYOUT_maxDrawCount = LAYOUT.select(PathElement.groupElement("maxDrawCount"));
    /// The [VarHandle] of `maxDrawCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeneratedCommandsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeneratedCommandsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoEXT`
    public static VkGeneratedCommandsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeneratedCommandsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsInfoEXT`
    public static VkGeneratedCommandsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsInfoEXT copyFrom(VkGeneratedCommandsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeneratedCommandsInfoEXT reinterpret(long count) { return new VkGeneratedCommandsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeneratedCommandsInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeneratedCommandsInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get(segment, 0L, index); }
    /// {@return `shaderStages`}
    public int shaderStages() { return shaderStages(this.segment(), 0L); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStages(MemorySegment segment, long index, int value) { VH_shaderStages.set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT shaderStages(int value) { shaderStages(this.segment(), 0L, value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectExecutionSet(MemorySegment segment, long index) { return (long) VH_indirectExecutionSet.get(segment, 0L, index); }
    /// {@return `indirectExecutionSet`}
    public long indirectExecutionSet() { return indirectExecutionSet(this.segment(), 0L); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectExecutionSet(MemorySegment segment, long index, long value) { VH_indirectExecutionSet.set(segment, 0L, index, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(long value) { indirectExecutionSet(this.segment(), 0L, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectCommandsLayout(MemorySegment segment, long index) { return (long) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    public long indirectCommandsLayout() { return indirectCommandsLayout(this.segment(), 0L); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectCommandsLayout(MemorySegment segment, long index, long value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(long value) { indirectCommandsLayout(this.segment(), 0L, value); return this; }

    /// {@return `indirectAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectAddress(MemorySegment segment, long index) { return (long) VH_indirectAddress.get(segment, 0L, index); }
    /// {@return `indirectAddress`}
    public long indirectAddress() { return indirectAddress(this.segment(), 0L); }
    /// Sets `indirectAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectAddress(MemorySegment segment, long index, long value) { VH_indirectAddress.set(segment, 0L, index, value); }
    /// Sets `indirectAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddress(long value) { indirectAddress(this.segment(), 0L, value); return this; }

    /// {@return `indirectAddressSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectAddressSize(MemorySegment segment, long index) { return (long) VH_indirectAddressSize.get(segment, 0L, index); }
    /// {@return `indirectAddressSize`}
    public long indirectAddressSize() { return indirectAddressSize(this.segment(), 0L); }
    /// Sets `indirectAddressSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectAddressSize(MemorySegment segment, long index, long value) { VH_indirectAddressSize.set(segment, 0L, index, value); }
    /// Sets `indirectAddressSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddressSize(long value) { indirectAddressSize(this.segment(), 0L, value); return this; }

    /// {@return `preprocessAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preprocessAddress(MemorySegment segment, long index) { return (long) VH_preprocessAddress.get(segment, 0L, index); }
    /// {@return `preprocessAddress`}
    public long preprocessAddress() { return preprocessAddress(this.segment(), 0L); }
    /// Sets `preprocessAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preprocessAddress(MemorySegment segment, long index, long value) { VH_preprocessAddress.set(segment, 0L, index, value); }
    /// Sets `preprocessAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessAddress(long value) { preprocessAddress(this.segment(), 0L, value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long preprocessSize(MemorySegment segment, long index) { return (long) VH_preprocessSize.get(segment, 0L, index); }
    /// {@return `preprocessSize`}
    public long preprocessSize() { return preprocessSize(this.segment(), 0L); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preprocessSize(MemorySegment segment, long index, long value) { VH_preprocessSize.set(segment, 0L, index, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessSize(long value) { preprocessSize(this.segment(), 0L, value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSequenceCount(MemorySegment segment, long index) { return (int) VH_maxSequenceCount.get(segment, 0L, index); }
    /// {@return `maxSequenceCount`}
    public int maxSequenceCount() { return maxSequenceCount(this.segment(), 0L); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSequenceCount(MemorySegment segment, long index, int value) { VH_maxSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxSequenceCount(int value) { maxSequenceCount(this.segment(), 0L, value); return this; }

    /// {@return `sequenceCountAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sequenceCountAddress(MemorySegment segment, long index) { return (long) VH_sequenceCountAddress.get(segment, 0L, index); }
    /// {@return `sequenceCountAddress`}
    public long sequenceCountAddress() { return sequenceCountAddress(this.segment(), 0L); }
    /// Sets `sequenceCountAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sequenceCountAddress(MemorySegment segment, long index, long value) { VH_sequenceCountAddress.set(segment, 0L, index, value); }
    /// Sets `sequenceCountAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(long value) { sequenceCountAddress(this.segment(), 0L, value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDrawCount(MemorySegment segment, long index) { return (int) VH_maxDrawCount.get(segment, 0L, index); }
    /// {@return `maxDrawCount`}
    public int maxDrawCount() { return maxDrawCount(this.segment(), 0L); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDrawCount(MemorySegment segment, long index, int value) { VH_maxDrawCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxDrawCount(int value) { maxDrawCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeneratedCommandsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeneratedCommandsInfoEXT`
    public VkGeneratedCommandsInfoEXT asSlice(long index) { return new VkGeneratedCommandsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeneratedCommandsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeneratedCommandsInfoEXT`
    public VkGeneratedCommandsInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeneratedCommandsInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeneratedCommandsInfoEXT at(long index, Consumer<VkGeneratedCommandsInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStagesAt(long index) { return shaderStages(this.segment(), index); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT shaderStagesAt(long index, int value) { shaderStages(this.segment(), index, value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param index the index of the struct buffer
    public long indirectExecutionSetAt(long index) { return indirectExecutionSet(this.segment(), index); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectExecutionSetAt(long index, long value) { indirectExecutionSet(this.segment(), index, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param index the index of the struct buffer
    public long indirectCommandsLayoutAt(long index) { return indirectCommandsLayout(this.segment(), index); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectCommandsLayoutAt(long index, long value) { indirectCommandsLayout(this.segment(), index, value); return this; }

    /// {@return `indirectAddress` at the given index}
    /// @param index the index of the struct buffer
    public long indirectAddressAt(long index) { return indirectAddress(this.segment(), index); }
    /// Sets `indirectAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddressAt(long index, long value) { indirectAddress(this.segment(), index, value); return this; }

    /// {@return `indirectAddressSize` at the given index}
    /// @param index the index of the struct buffer
    public long indirectAddressSizeAt(long index) { return indirectAddressSize(this.segment(), index); }
    /// Sets `indirectAddressSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddressSizeAt(long index, long value) { indirectAddressSize(this.segment(), index, value); return this; }

    /// {@return `preprocessAddress` at the given index}
    /// @param index the index of the struct buffer
    public long preprocessAddressAt(long index) { return preprocessAddress(this.segment(), index); }
    /// Sets `preprocessAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessAddressAt(long index, long value) { preprocessAddress(this.segment(), index, value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param index the index of the struct buffer
    public long preprocessSizeAt(long index) { return preprocessSize(this.segment(), index); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessSizeAt(long index, long value) { preprocessSize(this.segment(), index, value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSequenceCountAt(long index) { return maxSequenceCount(this.segment(), index); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxSequenceCountAt(long index, int value) { maxSequenceCount(this.segment(), index, value); return this; }

    /// {@return `sequenceCountAddress` at the given index}
    /// @param index the index of the struct buffer
    public long sequenceCountAddressAt(long index) { return sequenceCountAddress(this.segment(), index); }
    /// Sets `sequenceCountAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT sequenceCountAddressAt(long index, long value) { sequenceCountAddress(this.segment(), index, value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxDrawCountAt(long index) { return maxDrawCount(this.segment(), index); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxDrawCountAt(long index, int value) { maxDrawCount(this.segment(), index, value); return this; }

}
