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
package overrungl.vulkan.nv.struct;

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
/// ### coverageModulationMode
/// [VarHandle][#VH_coverageModulationMode] - [Getter][#coverageModulationMode()] - [Setter][#coverageModulationMode(int)]
/// ### coverageModulationTableEnable
/// [VarHandle][#VH_coverageModulationTableEnable] - [Getter][#coverageModulationTableEnable()] - [Setter][#coverageModulationTableEnable(int)]
/// ### coverageModulationTableCount
/// [VarHandle][#VH_coverageModulationTableCount] - [Getter][#coverageModulationTableCount()] - [Setter][#coverageModulationTableCount(int)]
/// ### pCoverageModulationTable
/// [VarHandle][#VH_pCoverageModulationTable] - [Getter][#pCoverageModulationTable()] - [Setter][#pCoverageModulationTable(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCoverageModulationStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineCoverageModulationStateCreateFlagsNV flags;
///     VkCoverageModulationModeNV coverageModulationMode;
///     VkBool32 coverageModulationTableEnable;
///     uint32_t coverageModulationTableCount;
///     const float * pCoverageModulationTable;
/// } VkPipelineCoverageModulationStateCreateInfoNV;
/// ```
public sealed class VkPipelineCoverageModulationStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineCoverageModulationStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withName("pCoverageModulationTable")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `coverageModulationMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageModulationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationMode"));
    /// The [VarHandle] of `coverageModulationTableEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageModulationTableEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableEnable"));
    /// The [VarHandle] of `coverageModulationTableCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_coverageModulationTableCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableCount"));
    /// The [VarHandle] of `pCoverageModulationTable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCoverageModulationTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCoverageModulationTable"));

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageModulationStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageModulationStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageModulationStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int flags, @CType("VkCoverageModulationModeNV") int coverageModulationMode, @CType("VkBool32") int coverageModulationTableEnable, @CType("uint32_t") int coverageModulationTableCount, @CType("const float *") MemorySegment pCoverageModulationTable) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).coverageModulationMode(coverageModulationMode).coverageModulationTableEnable(coverageModulationTableEnable).coverageModulationTableCount(coverageModulationTableCount).pCoverageModulationTable(pCoverageModulationTable); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV copyFrom(VkPipelineCoverageModulationStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineCoverageModulationStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineCoverageModulationStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(@CType("const void *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int get_flags(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int flags() { return VkPipelineCoverageModulationStateCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV flags(@CType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `coverageModulationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCoverageModulationModeNV") int get_coverageModulationMode(MemorySegment segment, long index) { return (int) VH_coverageModulationMode.get(segment, 0L, index); }
    /// {@return `coverageModulationMode`}
    /// @param segment the segment of the struct
    public static @CType("VkCoverageModulationModeNV") int get_coverageModulationMode(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationMode(segment, 0L); }
    /// {@return `coverageModulationMode`}
    public @CType("VkCoverageModulationModeNV") int coverageModulationMode() { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationMode(this.segment()); }
    /// Sets `coverageModulationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageModulationMode(MemorySegment segment, long index, @CType("VkCoverageModulationModeNV") int value) { VH_coverageModulationMode.set(segment, 0L, index, value); }
    /// Sets `coverageModulationMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageModulationMode(MemorySegment segment, @CType("VkCoverageModulationModeNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationMode(segment, 0L, value); }
    /// Sets `coverageModulationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(@CType("VkCoverageModulationModeNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationMode(this.segment(), value); return this; }

    /// {@return `coverageModulationTableEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_coverageModulationTableEnable(MemorySegment segment, long index) { return (int) VH_coverageModulationTableEnable.get(segment, 0L, index); }
    /// {@return `coverageModulationTableEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_coverageModulationTableEnable(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableEnable(segment, 0L); }
    /// {@return `coverageModulationTableEnable`}
    public @CType("VkBool32") int coverageModulationTableEnable() { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableEnable(this.segment()); }
    /// Sets `coverageModulationTableEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageModulationTableEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_coverageModulationTableEnable.set(segment, 0L, index, value); }
    /// Sets `coverageModulationTableEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageModulationTableEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableEnable(segment, 0L, value); }
    /// Sets `coverageModulationTableEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(@CType("VkBool32") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableEnable(this.segment(), value); return this; }

    /// {@return `coverageModulationTableCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_coverageModulationTableCount(MemorySegment segment, long index) { return (int) VH_coverageModulationTableCount.get(segment, 0L, index); }
    /// {@return `coverageModulationTableCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_coverageModulationTableCount(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableCount(segment, 0L); }
    /// {@return `coverageModulationTableCount`}
    public @CType("uint32_t") int coverageModulationTableCount() { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableCount(this.segment()); }
    /// Sets `coverageModulationTableCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_coverageModulationTableCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_coverageModulationTableCount.set(segment, 0L, index, value); }
    /// Sets `coverageModulationTableCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_coverageModulationTableCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableCount(segment, 0L, value); }
    /// Sets `coverageModulationTableCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(@CType("uint32_t") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableCount(this.segment(), value); return this; }

    /// {@return `pCoverageModulationTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const float *") MemorySegment get_pCoverageModulationTable(MemorySegment segment, long index) { return (MemorySegment) VH_pCoverageModulationTable.get(segment, 0L, index); }
    /// {@return `pCoverageModulationTable`}
    /// @param segment the segment of the struct
    public static @CType("const float *") MemorySegment get_pCoverageModulationTable(MemorySegment segment) { return VkPipelineCoverageModulationStateCreateInfoNV.get_pCoverageModulationTable(segment, 0L); }
    /// {@return `pCoverageModulationTable`}
    public @CType("const float *") MemorySegment pCoverageModulationTable() { return VkPipelineCoverageModulationStateCreateInfoNV.get_pCoverageModulationTable(this.segment()); }
    /// Sets `pCoverageModulationTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCoverageModulationTable(MemorySegment segment, long index, @CType("const float *") MemorySegment value) { VH_pCoverageModulationTable.set(segment, 0L, index, value); }
    /// Sets `pCoverageModulationTable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCoverageModulationTable(MemorySegment segment, @CType("const float *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pCoverageModulationTable(segment, 0L, value); }
    /// Sets `pCoverageModulationTable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(@CType("const float *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pCoverageModulationTable(this.segment(), value); return this; }

    /// A buffer of [VkPipelineCoverageModulationStateCreateInfoNV].
    public static final class Buffer extends VkPipelineCoverageModulationStateCreateInfoNV {
        private final long elementCount;

        /// Creates `VkPipelineCoverageModulationStateCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCoverageModulationStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCoverageModulationStateCreateInfoNV`
        public VkPipelineCoverageModulationStateCreateInfoNV asSlice(long index) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCoverageModulationStateCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCoverageModulationStateCreateInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int flagsAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_flags(this.segment(), index, value); return this; }

        /// {@return `coverageModulationMode` at the given index}
        /// @param index the index
        public @CType("VkCoverageModulationModeNV") int coverageModulationModeAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationMode(this.segment(), index); }
        /// Sets `coverageModulationMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer coverageModulationModeAt(long index, @CType("VkCoverageModulationModeNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationMode(this.segment(), index, value); return this; }

        /// {@return `coverageModulationTableEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int coverageModulationTableEnableAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableEnable(this.segment(), index); }
        /// Sets `coverageModulationTableEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer coverageModulationTableEnableAt(long index, @CType("VkBool32") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableEnable(this.segment(), index, value); return this; }

        /// {@return `coverageModulationTableCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int coverageModulationTableCountAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_coverageModulationTableCount(this.segment(), index); }
        /// Sets `coverageModulationTableCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer coverageModulationTableCountAt(long index, @CType("uint32_t") int value) { VkPipelineCoverageModulationStateCreateInfoNV.set_coverageModulationTableCount(this.segment(), index, value); return this; }

        /// {@return `pCoverageModulationTable` at the given index}
        /// @param index the index
        public @CType("const float *") MemorySegment pCoverageModulationTableAt(long index) { return VkPipelineCoverageModulationStateCreateInfoNV.get_pCoverageModulationTable(this.segment(), index); }
        /// Sets `pCoverageModulationTable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCoverageModulationTableAt(long index, @CType("const float *") MemorySegment value) { VkPipelineCoverageModulationStateCreateInfoNV.set_pCoverageModulationTable(this.segment(), index, value); return this; }

    }
}
