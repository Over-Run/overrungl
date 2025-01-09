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
/// ### numUsedVgprs
/// [VarHandle][#VH_numUsedVgprs] - [Getter][#numUsedVgprs()] - [Setter][#numUsedVgprs(int)]
/// ### numUsedSgprs
/// [VarHandle][#VH_numUsedSgprs] - [Getter][#numUsedSgprs()] - [Setter][#numUsedSgprs(int)]
/// ### ldsSizePerLocalWorkGroup
/// [VarHandle][#VH_ldsSizePerLocalWorkGroup] - [Getter][#ldsSizePerLocalWorkGroup()] - [Setter][#ldsSizePerLocalWorkGroup(int)]
/// ### ldsUsageSizeInBytes
/// [VarHandle][#VH_ldsUsageSizeInBytes] - [Getter][#ldsUsageSizeInBytes()] - [Setter][#ldsUsageSizeInBytes(long)]
/// ### scratchMemUsageInBytes
/// [VarHandle][#VH_scratchMemUsageInBytes] - [Getter][#scratchMemUsageInBytes()] - [Setter][#scratchMemUsageInBytes(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderResourceUsageAMD {
///     uint32_t numUsedVgprs;
///     uint32_t numUsedSgprs;
///     uint32_t ldsSizePerLocalWorkGroup;
///     size_t ldsUsageSizeInBytes;
///     size_t scratchMemUsageInBytes;
/// } VkShaderResourceUsageAMD;
/// ```
public final class VkShaderResourceUsageAMD extends Struct {
    /// The struct layout of `VkShaderResourceUsageAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        ValueLayout.JAVA_LONG.withName("ldsUsageSizeInBytes"),
        ValueLayout.JAVA_LONG.withName("scratchMemUsageInBytes")
    );
    /// The [VarHandle] of `numUsedVgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numUsedVgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedVgprs"));
    /// The [VarHandle] of `numUsedSgprs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numUsedSgprs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedSgprs"));
    /// The [VarHandle] of `ldsSizePerLocalWorkGroup` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ldsSizePerLocalWorkGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The [VarHandle] of `ldsUsageSizeInBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_ldsUsageSizeInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The [VarHandle] of `scratchMemUsageInBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_scratchMemUsageInBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchMemUsageInBytes"));

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment the memory segment
    public VkShaderResourceUsageAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator, long count) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT, count)); }

    /// {@return `numUsedVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numUsedVgprs(MemorySegment segment, long index) { return (int) VH_numUsedVgprs.get(segment, 0L, index); }
    /// {@return `numUsedVgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numUsedVgprs(MemorySegment segment) { return VkShaderResourceUsageAMD.get_numUsedVgprs(segment, 0L); }
    /// {@return `numUsedVgprs` at the given index}
    /// @param index the index
    public @CType("uint32_t") int numUsedVgprsAt(long index) { return VkShaderResourceUsageAMD.get_numUsedVgprs(this.segment(), index); }
    /// {@return `numUsedVgprs`}
    public @CType("uint32_t") int numUsedVgprs() { return VkShaderResourceUsageAMD.get_numUsedVgprs(this.segment()); }
    /// Sets `numUsedVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numUsedVgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numUsedVgprs.set(segment, 0L, index, value); }
    /// Sets `numUsedVgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numUsedVgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedVgprs(segment, 0L, value); }
    /// Sets `numUsedVgprs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedVgprsAt(long index, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedVgprs(this.segment(), index, value); return this; }
    /// Sets `numUsedVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedVgprs(@CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedVgprs(this.segment(), value); return this; }

    /// {@return `numUsedSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numUsedSgprs(MemorySegment segment, long index) { return (int) VH_numUsedSgprs.get(segment, 0L, index); }
    /// {@return `numUsedSgprs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numUsedSgprs(MemorySegment segment) { return VkShaderResourceUsageAMD.get_numUsedSgprs(segment, 0L); }
    /// {@return `numUsedSgprs` at the given index}
    /// @param index the index
    public @CType("uint32_t") int numUsedSgprsAt(long index) { return VkShaderResourceUsageAMD.get_numUsedSgprs(this.segment(), index); }
    /// {@return `numUsedSgprs`}
    public @CType("uint32_t") int numUsedSgprs() { return VkShaderResourceUsageAMD.get_numUsedSgprs(this.segment()); }
    /// Sets `numUsedSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numUsedSgprs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numUsedSgprs.set(segment, 0L, index, value); }
    /// Sets `numUsedSgprs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numUsedSgprs(MemorySegment segment, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedSgprs(segment, 0L, value); }
    /// Sets `numUsedSgprs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedSgprsAt(long index, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedSgprs(this.segment(), index, value); return this; }
    /// Sets `numUsedSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedSgprs(@CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_numUsedSgprs(this.segment(), value); return this; }

    /// {@return `ldsSizePerLocalWorkGroup` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_ldsSizePerLocalWorkGroup(MemorySegment segment, long index) { return (int) VH_ldsSizePerLocalWorkGroup.get(segment, 0L, index); }
    /// {@return `ldsSizePerLocalWorkGroup`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_ldsSizePerLocalWorkGroup(MemorySegment segment) { return VkShaderResourceUsageAMD.get_ldsSizePerLocalWorkGroup(segment, 0L); }
    /// {@return `ldsSizePerLocalWorkGroup` at the given index}
    /// @param index the index
    public @CType("uint32_t") int ldsSizePerLocalWorkGroupAt(long index) { return VkShaderResourceUsageAMD.get_ldsSizePerLocalWorkGroup(this.segment(), index); }
    /// {@return `ldsSizePerLocalWorkGroup`}
    public @CType("uint32_t") int ldsSizePerLocalWorkGroup() { return VkShaderResourceUsageAMD.get_ldsSizePerLocalWorkGroup(this.segment()); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ldsSizePerLocalWorkGroup(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_ldsSizePerLocalWorkGroup.set(segment, 0L, index, value); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ldsSizePerLocalWorkGroup(MemorySegment segment, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_ldsSizePerLocalWorkGroup(segment, 0L, value); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroupAt(long index, @CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_ldsSizePerLocalWorkGroup(this.segment(), index, value); return this; }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroup(@CType("uint32_t") int value) { VkShaderResourceUsageAMD.set_ldsSizePerLocalWorkGroup(this.segment(), value); return this; }

    /// {@return `ldsUsageSizeInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_ldsUsageSizeInBytes(MemorySegment segment, long index) { return (long) VH_ldsUsageSizeInBytes.get(segment, 0L, index); }
    /// {@return `ldsUsageSizeInBytes`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_ldsUsageSizeInBytes(MemorySegment segment) { return VkShaderResourceUsageAMD.get_ldsUsageSizeInBytes(segment, 0L); }
    /// {@return `ldsUsageSizeInBytes` at the given index}
    /// @param index the index
    public @CType("size_t") long ldsUsageSizeInBytesAt(long index) { return VkShaderResourceUsageAMD.get_ldsUsageSizeInBytes(this.segment(), index); }
    /// {@return `ldsUsageSizeInBytes`}
    public @CType("size_t") long ldsUsageSizeInBytes() { return VkShaderResourceUsageAMD.get_ldsUsageSizeInBytes(this.segment()); }
    /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ldsUsageSizeInBytes(MemorySegment segment, long index, @CType("size_t") long value) { VH_ldsUsageSizeInBytes.set(segment, 0L, index, value); }
    /// Sets `ldsUsageSizeInBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ldsUsageSizeInBytes(MemorySegment segment, @CType("size_t") long value) { VkShaderResourceUsageAMD.set_ldsUsageSizeInBytes(segment, 0L, value); }
    /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsUsageSizeInBytesAt(long index, @CType("size_t") long value) { VkShaderResourceUsageAMD.set_ldsUsageSizeInBytes(this.segment(), index, value); return this; }
    /// Sets `ldsUsageSizeInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsUsageSizeInBytes(@CType("size_t") long value) { VkShaderResourceUsageAMD.set_ldsUsageSizeInBytes(this.segment(), value); return this; }

    /// {@return `scratchMemUsageInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_scratchMemUsageInBytes(MemorySegment segment, long index) { return (long) VH_scratchMemUsageInBytes.get(segment, 0L, index); }
    /// {@return `scratchMemUsageInBytes`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_scratchMemUsageInBytes(MemorySegment segment) { return VkShaderResourceUsageAMD.get_scratchMemUsageInBytes(segment, 0L); }
    /// {@return `scratchMemUsageInBytes` at the given index}
    /// @param index the index
    public @CType("size_t") long scratchMemUsageInBytesAt(long index) { return VkShaderResourceUsageAMD.get_scratchMemUsageInBytes(this.segment(), index); }
    /// {@return `scratchMemUsageInBytes`}
    public @CType("size_t") long scratchMemUsageInBytes() { return VkShaderResourceUsageAMD.get_scratchMemUsageInBytes(this.segment()); }
    /// Sets `scratchMemUsageInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scratchMemUsageInBytes(MemorySegment segment, long index, @CType("size_t") long value) { VH_scratchMemUsageInBytes.set(segment, 0L, index, value); }
    /// Sets `scratchMemUsageInBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scratchMemUsageInBytes(MemorySegment segment, @CType("size_t") long value) { VkShaderResourceUsageAMD.set_scratchMemUsageInBytes(segment, 0L, value); }
    /// Sets `scratchMemUsageInBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD scratchMemUsageInBytesAt(long index, @CType("size_t") long value) { VkShaderResourceUsageAMD.set_scratchMemUsageInBytes(this.segment(), index, value); return this; }
    /// Sets `scratchMemUsageInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD scratchMemUsageInBytes(@CType("size_t") long value) { VkShaderResourceUsageAMD.set_scratchMemUsageInBytes(this.segment(), value); return this; }

}