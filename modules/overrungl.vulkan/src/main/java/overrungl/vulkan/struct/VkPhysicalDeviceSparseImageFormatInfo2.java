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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### samples
/// [VarHandle][#VH_samples] - [Getter][#samples()] - [Setter][#samples(int)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### tiling
/// [VarHandle][#VH_tiling] - [Getter][#tiling()] - [Setter][#tiling(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSparseImageFormatInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkFormat format;
///     VkImageType type;
///     VkSampleCountFlagBits samples;
///     VkImageUsageFlags usage;
///     VkImageTiling tiling;
/// } VkPhysicalDeviceSparseImageFormatInfo2;
/// ```
public final class VkPhysicalDeviceSparseImageFormatInfo2 extends Struct {
    /// The struct layout of `VkPhysicalDeviceSparseImageFormatInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("tiling")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSparseImageFormatInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSparseImageFormatInfo2`
    public static VkPhysicalDeviceSparseImageFormatInfo2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseImageFormatInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSparseImageFormatInfo2`
    public static VkPhysicalDeviceSparseImageFormatInfo2 alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseImageFormatInfo2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSparseImageFormatInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSparseImageFormatInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSparseImageFormatInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSparseImageFormatInfo2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSparseImageFormatInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkPhysicalDeviceSparseImageFormatInfo2.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 formatAt(long index, @CType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 format(@CType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_format(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageType") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkImageType") int get_type(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkImageType") int typeAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkImageType") int type() { return VkPhysicalDeviceSparseImageFormatInfo2.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkImageType") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 typeAt(long index, @CType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 type(@CType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_type(this.segment(), value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_samples(segment, 0L); }
    /// {@return `samples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int samplesAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_samples(this.segment(), index); }
    /// {@return `samples`}
    public @CType("VkSampleCountFlagBits") int samples() { return VkPhysicalDeviceSparseImageFormatInfo2.get_samples(this.segment()); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_samples(segment, 0L, value); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 samplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_samples(this.segment(), index, value); return this; }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 samples(@CType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_samples(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int usageAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkImageUsageFlags") int usage() { return VkPhysicalDeviceSparseImageFormatInfo2.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 usageAt(long index, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 usage(@CType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_usage(this.segment(), value); return this; }

    /// {@return `tiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment, long index) { return (int) VH_tiling.get(segment, 0L, index); }
    /// {@return `tiling`}
    /// @param segment the segment of the struct
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment) { return VkPhysicalDeviceSparseImageFormatInfo2.get_tiling(segment, 0L); }
    /// {@return `tiling` at the given index}
    /// @param index the index
    public @CType("VkImageTiling") int tilingAt(long index) { return VkPhysicalDeviceSparseImageFormatInfo2.get_tiling(this.segment(), index); }
    /// {@return `tiling`}
    public @CType("VkImageTiling") int tiling() { return VkPhysicalDeviceSparseImageFormatInfo2.get_tiling(this.segment()); }
    /// Sets `tiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, long index, @CType("VkImageTiling") int value) { VH_tiling.set(segment, 0L, index, value); }
    /// Sets `tiling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, @CType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_tiling(segment, 0L, value); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 tilingAt(long index, @CType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_tiling(this.segment(), index, value); return this; }
    /// Sets `tiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 tiling(@CType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2.set_tiling(this.segment(), value); return this; }

}
