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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineCoverageModulationStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCoverageModulationStateCreateFlagsNV flags;
///     (int) VkCoverageModulationModeNV coverageModulationMode;
///     (uint32_t) VkBool32 coverageModulationTableEnable;
///     uint32_t coverageModulationTableCount;
///     const float* pCoverageModulationTable;
/// };
/// ```
public final class VkPipelineCoverageModulationStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineCoverageModulationStateCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageModulationMode"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("coverageModulationTableCount"),
        ValueLayout.ADDRESS.withName("pCoverageModulationTable")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `coverageModulationMode`.
    public static final long OFFSET_coverageModulationMode = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationMode"));
    /// The memory layout of `coverageModulationMode`.
    public static final MemoryLayout LAYOUT_coverageModulationMode = LAYOUT.select(PathElement.groupElement("coverageModulationMode"));
    /// The [VarHandle] of `coverageModulationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageModulationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationMode"));
    /// The byte offset of `coverageModulationTableEnable`.
    public static final long OFFSET_coverageModulationTableEnable = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableEnable"));
    /// The memory layout of `coverageModulationTableEnable`.
    public static final MemoryLayout LAYOUT_coverageModulationTableEnable = LAYOUT.select(PathElement.groupElement("coverageModulationTableEnable"));
    /// The [VarHandle] of `coverageModulationTableEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageModulationTableEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableEnable"));
    /// The byte offset of `coverageModulationTableCount`.
    public static final long OFFSET_coverageModulationTableCount = LAYOUT.byteOffset(PathElement.groupElement("coverageModulationTableCount"));
    /// The memory layout of `coverageModulationTableCount`.
    public static final MemoryLayout LAYOUT_coverageModulationTableCount = LAYOUT.select(PathElement.groupElement("coverageModulationTableCount"));
    /// The [VarHandle] of `coverageModulationTableCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_coverageModulationTableCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageModulationTableCount"));
    /// The byte offset of `pCoverageModulationTable`.
    public static final long OFFSET_pCoverageModulationTable = LAYOUT.byteOffset(PathElement.groupElement("pCoverageModulationTable"));
    /// The memory layout of `pCoverageModulationTable`.
    public static final MemoryLayout LAYOUT_pCoverageModulationTable = LAYOUT.select(PathElement.groupElement("pCoverageModulationTable"));
    /// The [VarHandle] of `pCoverageModulationTable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCoverageModulationTable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCoverageModulationTable"));

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCoverageModulationStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageModulationStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageModulationStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCoverageModulationStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageModulationStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageModulationStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param coverageModulationMode `coverageModulationMode`
    /// @param coverageModulationTableEnable `coverageModulationTableEnable`
    /// @param coverageModulationTableCount `coverageModulationTableCount`
    /// @param pCoverageModulationTable `pCoverageModulationTable`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int coverageModulationMode, int coverageModulationTableEnable, int coverageModulationTableCount, MemorySegment pCoverageModulationTable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).coverageModulationMode(coverageModulationMode).coverageModulationTableEnable(coverageModulationTableEnable).coverageModulationTableCount(coverageModulationTableCount).pCoverageModulationTable(pCoverageModulationTable);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param coverageModulationMode `coverageModulationMode`
    /// @param coverageModulationTableEnable `coverageModulationTableEnable`
    /// @param coverageModulationTableCount `coverageModulationTableCount`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int coverageModulationMode, int coverageModulationTableEnable, int coverageModulationTableCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).coverageModulationMode(coverageModulationMode).coverageModulationTableEnable(coverageModulationTableEnable).coverageModulationTableCount(coverageModulationTableCount);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param coverageModulationMode `coverageModulationMode`
    /// @param coverageModulationTableEnable `coverageModulationTableEnable`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int coverageModulationMode, int coverageModulationTableEnable) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).coverageModulationMode(coverageModulationMode).coverageModulationTableEnable(coverageModulationTableEnable);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param coverageModulationMode `coverageModulationMode`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int coverageModulationMode) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).coverageModulationMode(coverageModulationMode);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineCoverageModulationStateCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineCoverageModulationStateCreateInfoNV`
    public static VkPipelineCoverageModulationStateCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV copyFrom(VkPipelineCoverageModulationStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCoverageModulationStateCreateInfoNV reinterpret(long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineCoverageModulationStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `coverageModulationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageModulationMode(MemorySegment segment, long index) { return (int) VH_coverageModulationMode.get(segment, 0L, index); }
    /// {@return `coverageModulationMode`}
    public int coverageModulationMode() { return coverageModulationMode(this.segment(), 0L); }
    /// Sets `coverageModulationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageModulationMode(MemorySegment segment, long index, int value) { VH_coverageModulationMode.set(segment, 0L, index, value); }
    /// Sets `coverageModulationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(int value) { coverageModulationMode(this.segment(), 0L, value); return this; }

    /// {@return `coverageModulationTableEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageModulationTableEnable(MemorySegment segment, long index) { return (int) VH_coverageModulationTableEnable.get(segment, 0L, index); }
    /// {@return `coverageModulationTableEnable`}
    public int coverageModulationTableEnable() { return coverageModulationTableEnable(this.segment(), 0L); }
    /// Sets `coverageModulationTableEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageModulationTableEnable(MemorySegment segment, long index, int value) { VH_coverageModulationTableEnable.set(segment, 0L, index, value); }
    /// Sets `coverageModulationTableEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(int value) { coverageModulationTableEnable(this.segment(), 0L, value); return this; }

    /// {@return `coverageModulationTableCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int coverageModulationTableCount(MemorySegment segment, long index) { return (int) VH_coverageModulationTableCount.get(segment, 0L, index); }
    /// {@return `coverageModulationTableCount`}
    public int coverageModulationTableCount() { return coverageModulationTableCount(this.segment(), 0L); }
    /// Sets `coverageModulationTableCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void coverageModulationTableCount(MemorySegment segment, long index, int value) { VH_coverageModulationTableCount.set(segment, 0L, index, value); }
    /// Sets `coverageModulationTableCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(int value) { coverageModulationTableCount(this.segment(), 0L, value); return this; }

    /// {@return `pCoverageModulationTable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCoverageModulationTable(MemorySegment segment, long index) { return (MemorySegment) VH_pCoverageModulationTable.get(segment, 0L, index); }
    /// {@return `pCoverageModulationTable`}
    public MemorySegment pCoverageModulationTable() { return pCoverageModulationTable(this.segment(), 0L); }
    /// Sets `pCoverageModulationTable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCoverageModulationTable(MemorySegment segment, long index, MemorySegment value) { VH_pCoverageModulationTable.set(segment, 0L, index, value); }
    /// Sets `pCoverageModulationTable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(MemorySegment value) { pCoverageModulationTable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCoverageModulationStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCoverageModulationStateCreateInfoNV`
    public VkPipelineCoverageModulationStateCreateInfoNV asSlice(long index) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCoverageModulationStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCoverageModulationStateCreateInfoNV`
    public VkPipelineCoverageModulationStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineCoverageModulationStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCoverageModulationStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV at(long index, Consumer<VkPipelineCoverageModulationStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `coverageModulationMode` at the given index}
    /// @param index the index of the struct buffer
    public int coverageModulationModeAt(long index) { return coverageModulationMode(this.segment(), index); }
    /// Sets `coverageModulationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationModeAt(long index, int value) { coverageModulationMode(this.segment(), index, value); return this; }

    /// {@return `coverageModulationTableEnable` at the given index}
    /// @param index the index of the struct buffer
    public int coverageModulationTableEnableAt(long index) { return coverageModulationTableEnable(this.segment(), index); }
    /// Sets `coverageModulationTableEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnableAt(long index, int value) { coverageModulationTableEnable(this.segment(), index, value); return this; }

    /// {@return `coverageModulationTableCount` at the given index}
    /// @param index the index of the struct buffer
    public int coverageModulationTableCountAt(long index) { return coverageModulationTableCount(this.segment(), index); }
    /// Sets `coverageModulationTableCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCountAt(long index, int value) { coverageModulationTableCount(this.segment(), index, value); return this; }

    /// {@return `pCoverageModulationTable` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCoverageModulationTableAt(long index) { return pCoverageModulationTable(this.segment(), index); }
    /// Sets `pCoverageModulationTable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTableAt(long index, MemorySegment value) { pCoverageModulationTable(this.segment(), index, value); return this; }

}
