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
package overrungl.vulkan.ext.struct;

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
/// ### shaderStages
/// [VarHandle][#VH_shaderStages] - [Getter][#shaderStages()] - [Setter][#shaderStages(int)]
/// ### indirectExecutionSet
/// [VarHandle][#VH_indirectExecutionSet] - [Getter][#indirectExecutionSet()] - [Setter][#indirectExecutionSet(MemorySegment)]
/// ### indirectCommandsLayout
/// [VarHandle][#VH_indirectCommandsLayout] - [Getter][#indirectCommandsLayout()] - [Setter][#indirectCommandsLayout(MemorySegment)]
/// ### indirectAddress
/// [VarHandle][#VH_indirectAddress] - [Getter][#indirectAddress()] - [Setter][#indirectAddress(long)]
/// ### indirectAddressSize
/// [VarHandle][#VH_indirectAddressSize] - [Getter][#indirectAddressSize()] - [Setter][#indirectAddressSize(long)]
/// ### preprocessAddress
/// [VarHandle][#VH_preprocessAddress] - [Getter][#preprocessAddress()] - [Setter][#preprocessAddress(long)]
/// ### preprocessSize
/// [VarHandle][#VH_preprocessSize] - [Getter][#preprocessSize()] - [Setter][#preprocessSize(long)]
/// ### maxSequenceCount
/// [VarHandle][#VH_maxSequenceCount] - [Getter][#maxSequenceCount()] - [Setter][#maxSequenceCount(int)]
/// ### sequenceCountAddress
/// [VarHandle][#VH_sequenceCountAddress] - [Getter][#sequenceCountAddress()] - [Setter][#sequenceCountAddress(long)]
/// ### maxDrawCount
/// [VarHandle][#VH_maxDrawCount] - [Getter][#maxDrawCount()] - [Setter][#maxDrawCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeneratedCommandsInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderStageFlags shaderStages;
///     VkIndirectExecutionSetEXT indirectExecutionSet;
///     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     VkDeviceAddress indirectAddress;
///     VkDeviceSize indirectAddressSize;
///     VkDeviceAddress preprocessAddress;
///     VkDeviceSize preprocessSize;
///     uint32_t maxSequenceCount;
///     VkDeviceAddress sequenceCountAddress;
///     uint32_t maxDrawCount;
/// } VkGeneratedCommandsInfoEXT;
/// ```
public sealed class VkGeneratedCommandsInfoEXT extends Struct {
    /// The struct layout of `VkGeneratedCommandsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.ADDRESS.withName("indirectExecutionSet"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_LONG.withName("indirectAddress"),
        ValueLayout.JAVA_LONG.withName("indirectAddressSize"),
        ValueLayout.JAVA_LONG.withName("preprocessAddress"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_LONG.withName("sequenceCountAddress"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    /// The [VarHandle] of `indirectExecutionSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `indirectAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indirectAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddress"));
    /// The [VarHandle] of `indirectAddressSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indirectAddressSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddressSize"));
    /// The [VarHandle] of `preprocessAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_preprocessAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessAddress"));
    /// The [VarHandle] of `preprocessSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    /// The [VarHandle] of `maxSequenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    /// The [VarHandle] of `sequenceCountAddress` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sequenceCountAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequenceCountAddress"));
    /// The [VarHandle] of `maxDrawCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkGeneratedCommandsInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeneratedCommandsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeneratedCommandsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoEXT`
    public static VkGeneratedCommandsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeneratedCommandsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsInfoEXT`
    public static VkGeneratedCommandsInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkShaderStageFlags") int shaderStages, @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSet, @CType("VkIndirectCommandsLayoutEXT") MemorySegment indirectCommandsLayout, @CType("VkDeviceAddress") long indirectAddress, @CType("VkDeviceSize") long indirectAddressSize, @CType("VkDeviceAddress") long preprocessAddress, @CType("VkDeviceSize") long preprocessSize, @CType("uint32_t") int maxSequenceCount, @CType("VkDeviceAddress") long sequenceCountAddress, @CType("uint32_t") int maxDrawCount) { return alloc(allocator).sType(sType).pNext(pNext).shaderStages(shaderStages).indirectExecutionSet(indirectExecutionSet).indirectCommandsLayout(indirectCommandsLayout).indirectAddress(indirectAddress).indirectAddressSize(indirectAddressSize).preprocessAddress(preprocessAddress).preprocessSize(preprocessSize).maxSequenceCount(maxSequenceCount).sequenceCountAddress(sequenceCountAddress).maxDrawCount(maxDrawCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsInfoEXT copyFrom(VkGeneratedCommandsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeneratedCommandsInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeneratedCommandsInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT sType(@CType("VkStructureType") int value) { VkGeneratedCommandsInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkGeneratedCommandsInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT pNext(@CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get(segment, 0L, index); }
    /// {@return `shaderStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_shaderStages(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_shaderStages(segment, 0L); }
    /// {@return `shaderStages`}
    public @CType("VkShaderStageFlags") int shaderStages() { return VkGeneratedCommandsInfoEXT.get_shaderStages(this.segment()); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_shaderStages.set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkGeneratedCommandsInfoEXT.set_shaderStages(segment, 0L, value); }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT shaderStages(@CType("VkShaderStageFlags") int value) { VkGeneratedCommandsInfoEXT.set_shaderStages(this.segment(), value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectExecutionSetEXT") MemorySegment get_indirectExecutionSet(MemorySegment segment, long index) { return (MemorySegment) VH_indirectExecutionSet.get(segment, 0L, index); }
    /// {@return `indirectExecutionSet`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectExecutionSetEXT") MemorySegment get_indirectExecutionSet(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_indirectExecutionSet(segment, 0L); }
    /// {@return `indirectExecutionSet`}
    public @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSet() { return VkGeneratedCommandsInfoEXT.get_indirectExecutionSet(this.segment()); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectExecutionSet(MemorySegment segment, long index, @CType("VkIndirectExecutionSetEXT") MemorySegment value) { VH_indirectExecutionSet.set(segment, 0L, index, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectExecutionSet(MemorySegment segment, @CType("VkIndirectExecutionSetEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectExecutionSet(segment, 0L, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(@CType("VkIndirectExecutionSetEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectExecutionSet(this.segment(), value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutEXT") MemorySegment get_indirectCommandsLayout(MemorySegment segment, long index) { return (MemorySegment) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutEXT") MemorySegment get_indirectCommandsLayout(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_indirectCommandsLayout(segment, 0L); }
    /// {@return `indirectCommandsLayout`}
    public @CType("VkIndirectCommandsLayoutEXT") MemorySegment indirectCommandsLayout() { return VkGeneratedCommandsInfoEXT.get_indirectCommandsLayout(this.segment()); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutEXT") MemorySegment value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, @CType("VkIndirectCommandsLayoutEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectCommandsLayout(segment, 0L, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(@CType("VkIndirectCommandsLayoutEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectCommandsLayout(this.segment(), value); return this; }

    /// {@return `indirectAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_indirectAddress(MemorySegment segment, long index) { return (long) VH_indirectAddress.get(segment, 0L, index); }
    /// {@return `indirectAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_indirectAddress(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_indirectAddress(segment, 0L); }
    /// {@return `indirectAddress`}
    public @CType("VkDeviceAddress") long indirectAddress() { return VkGeneratedCommandsInfoEXT.get_indirectAddress(this.segment()); }
    /// Sets `indirectAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_indirectAddress.set(segment, 0L, index, value); }
    /// Sets `indirectAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddress(segment, 0L, value); }
    /// Sets `indirectAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddress(@CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddress(this.segment(), value); return this; }

    /// {@return `indirectAddressSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indirectAddressSize(MemorySegment segment, long index) { return (long) VH_indirectAddressSize.get(segment, 0L, index); }
    /// {@return `indirectAddressSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indirectAddressSize(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_indirectAddressSize(segment, 0L); }
    /// {@return `indirectAddressSize`}
    public @CType("VkDeviceSize") long indirectAddressSize() { return VkGeneratedCommandsInfoEXT.get_indirectAddressSize(this.segment()); }
    /// Sets `indirectAddressSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectAddressSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indirectAddressSize.set(segment, 0L, index, value); }
    /// Sets `indirectAddressSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectAddressSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddressSize(segment, 0L, value); }
    /// Sets `indirectAddressSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT indirectAddressSize(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddressSize(this.segment(), value); return this; }

    /// {@return `preprocessAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_preprocessAddress(MemorySegment segment, long index) { return (long) VH_preprocessAddress.get(segment, 0L, index); }
    /// {@return `preprocessAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_preprocessAddress(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_preprocessAddress(segment, 0L); }
    /// {@return `preprocessAddress`}
    public @CType("VkDeviceAddress") long preprocessAddress() { return VkGeneratedCommandsInfoEXT.get_preprocessAddress(this.segment()); }
    /// Sets `preprocessAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preprocessAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_preprocessAddress.set(segment, 0L, index, value); }
    /// Sets `preprocessAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preprocessAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_preprocessAddress(segment, 0L, value); }
    /// Sets `preprocessAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessAddress(@CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_preprocessAddress(this.segment(), value); return this; }

    /// {@return `preprocessSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_preprocessSize(MemorySegment segment, long index) { return (long) VH_preprocessSize.get(segment, 0L, index); }
    /// {@return `preprocessSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_preprocessSize(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_preprocessSize(segment, 0L); }
    /// {@return `preprocessSize`}
    public @CType("VkDeviceSize") long preprocessSize() { return VkGeneratedCommandsInfoEXT.get_preprocessSize(this.segment()); }
    /// Sets `preprocessSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preprocessSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_preprocessSize.set(segment, 0L, index, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preprocessSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_preprocessSize(segment, 0L, value); }
    /// Sets `preprocessSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT preprocessSize(@CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_preprocessSize(this.segment(), value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSequenceCount(MemorySegment segment, long index) { return (int) VH_maxSequenceCount.get(segment, 0L, index); }
    /// {@return `maxSequenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSequenceCount(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_maxSequenceCount(segment, 0L); }
    /// {@return `maxSequenceCount`}
    public @CType("uint32_t") int maxSequenceCount() { return VkGeneratedCommandsInfoEXT.get_maxSequenceCount(this.segment()); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSequenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSequenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxSequenceCount(segment, 0L, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxSequenceCount(@CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxSequenceCount(this.segment(), value); return this; }

    /// {@return `sequenceCountAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_sequenceCountAddress(MemorySegment segment, long index) { return (long) VH_sequenceCountAddress.get(segment, 0L, index); }
    /// {@return `sequenceCountAddress`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceAddress") long get_sequenceCountAddress(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_sequenceCountAddress(segment, 0L); }
    /// {@return `sequenceCountAddress`}
    public @CType("VkDeviceAddress") long sequenceCountAddress() { return VkGeneratedCommandsInfoEXT.get_sequenceCountAddress(this.segment()); }
    /// Sets `sequenceCountAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sequenceCountAddress(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_sequenceCountAddress.set(segment, 0L, index, value); }
    /// Sets `sequenceCountAddress` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sequenceCountAddress(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_sequenceCountAddress(segment, 0L, value); }
    /// Sets `sequenceCountAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(@CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_sequenceCountAddress(this.segment(), value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDrawCount(MemorySegment segment, long index) { return (int) VH_maxDrawCount.get(segment, 0L, index); }
    /// {@return `maxDrawCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDrawCount(MemorySegment segment) { return VkGeneratedCommandsInfoEXT.get_maxDrawCount(segment, 0L); }
    /// {@return `maxDrawCount`}
    public @CType("uint32_t") int maxDrawCount() { return VkGeneratedCommandsInfoEXT.get_maxDrawCount(this.segment()); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDrawCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDrawCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDrawCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxDrawCount(segment, 0L, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsInfoEXT maxDrawCount(@CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxDrawCount(this.segment(), value); return this; }

    /// A buffer of [VkGeneratedCommandsInfoEXT].
    public static final class Buffer extends VkGeneratedCommandsInfoEXT {
        private final long elementCount;

        /// Creates `VkGeneratedCommandsInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeneratedCommandsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeneratedCommandsInfoEXT`
        public VkGeneratedCommandsInfoEXT asSlice(long index) { return new VkGeneratedCommandsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeneratedCommandsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeneratedCommandsInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeneratedCommandsInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeneratedCommandsInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkGeneratedCommandsInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderStages` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int shaderStagesAt(long index) { return VkGeneratedCommandsInfoEXT.get_shaderStages(this.segment(), index); }
        /// Sets `shaderStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkGeneratedCommandsInfoEXT.set_shaderStages(this.segment(), index, value); return this; }

        /// {@return `indirectExecutionSet` at the given index}
        /// @param index the index
        public @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSetAt(long index) { return VkGeneratedCommandsInfoEXT.get_indirectExecutionSet(this.segment(), index); }
        /// Sets `indirectExecutionSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectExecutionSetAt(long index, @CType("VkIndirectExecutionSetEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectExecutionSet(this.segment(), index, value); return this; }

        /// {@return `indirectCommandsLayout` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsLayoutEXT") MemorySegment indirectCommandsLayoutAt(long index) { return VkGeneratedCommandsInfoEXT.get_indirectCommandsLayout(this.segment(), index); }
        /// Sets `indirectCommandsLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectCommandsLayoutAt(long index, @CType("VkIndirectCommandsLayoutEXT") MemorySegment value) { VkGeneratedCommandsInfoEXT.set_indirectCommandsLayout(this.segment(), index, value); return this; }

        /// {@return `indirectAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long indirectAddressAt(long index) { return VkGeneratedCommandsInfoEXT.get_indirectAddress(this.segment(), index); }
        /// Sets `indirectAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectAddressAt(long index, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddress(this.segment(), index, value); return this; }

        /// {@return `indirectAddressSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long indirectAddressSizeAt(long index) { return VkGeneratedCommandsInfoEXT.get_indirectAddressSize(this.segment(), index); }
        /// Sets `indirectAddressSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectAddressSizeAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_indirectAddressSize(this.segment(), index, value); return this; }

        /// {@return `preprocessAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long preprocessAddressAt(long index) { return VkGeneratedCommandsInfoEXT.get_preprocessAddress(this.segment(), index); }
        /// Sets `preprocessAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preprocessAddressAt(long index, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_preprocessAddress(this.segment(), index, value); return this; }

        /// {@return `preprocessSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long preprocessSizeAt(long index) { return VkGeneratedCommandsInfoEXT.get_preprocessSize(this.segment(), index); }
        /// Sets `preprocessSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preprocessSizeAt(long index, @CType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.set_preprocessSize(this.segment(), index, value); return this; }

        /// {@return `maxSequenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSequenceCountAt(long index) { return VkGeneratedCommandsInfoEXT.get_maxSequenceCount(this.segment(), index); }
        /// Sets `maxSequenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSequenceCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxSequenceCount(this.segment(), index, value); return this; }

        /// {@return `sequenceCountAddress` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long sequenceCountAddressAt(long index) { return VkGeneratedCommandsInfoEXT.get_sequenceCountAddress(this.segment(), index); }
        /// Sets `sequenceCountAddress` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sequenceCountAddressAt(long index, @CType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.set_sequenceCountAddress(this.segment(), index, value); return this; }

        /// {@return `maxDrawCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDrawCountAt(long index) { return VkGeneratedCommandsInfoEXT.get_maxDrawCount(this.segment(), index); }
        /// Sets `maxDrawCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDrawCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.set_maxDrawCount(this.segment(), index, value); return this; }

    }
}
