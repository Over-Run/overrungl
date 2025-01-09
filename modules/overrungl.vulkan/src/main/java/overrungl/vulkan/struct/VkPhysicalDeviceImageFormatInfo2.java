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
/// ### tiling
/// [VarHandle][#VH_tiling] - [Getter][#tiling()] - [Setter][#tiling(int)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageFormatInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkFormat format;
///     VkImageType type;
///     VkImageTiling tiling;
///     VkImageUsageFlags usage;
///     VkImageCreateFlags flags;
/// } VkPhysicalDeviceImageFormatInfo2;
/// ```
public final class VkPhysicalDeviceImageFormatInfo2 extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageFormatInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkPhysicalDeviceImageFormatInfo2` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageFormatInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageFormatInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageFormatInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2(segment); }

    /// Creates `VkPhysicalDeviceImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageFormatInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageFormatInfo2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageFormatInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceImageFormatInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageFormatInfo2`
    public static VkPhysicalDeviceImageFormatInfo2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageFormatInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageFormatInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageFormatInfo2`
    public static VkPhysicalDeviceImageFormatInfo2 alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageFormatInfo2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageFormatInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageFormatInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageFormatInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageFormatInfo2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageFormatInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkPhysicalDeviceImageFormatInfo2.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 formatAt(long index, @CType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 format(@CType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2.set_format(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageType") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkImageType") int get_type(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkImageType") int typeAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkImageType") int type() { return VkPhysicalDeviceImageFormatInfo2.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkImageType") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 typeAt(long index, @CType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 type(@CType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2.set_type(this.segment(), value); return this; }

    /// {@return `tiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment, long index) { return (int) VH_tiling.get(segment, 0L, index); }
    /// {@return `tiling`}
    /// @param segment the segment of the struct
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_tiling(segment, 0L); }
    /// {@return `tiling` at the given index}
    /// @param index the index
    public @CType("VkImageTiling") int tilingAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_tiling(this.segment(), index); }
    /// {@return `tiling`}
    public @CType("VkImageTiling") int tiling() { return VkPhysicalDeviceImageFormatInfo2.get_tiling(this.segment()); }
    /// Sets `tiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, long index, @CType("VkImageTiling") int value) { VH_tiling.set(segment, 0L, index, value); }
    /// Sets `tiling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, @CType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2.set_tiling(segment, 0L, value); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 tilingAt(long index, @CType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2.set_tiling(this.segment(), index, value); return this; }
    /// Sets `tiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 tiling(@CType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2.set_tiling(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int usageAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkImageUsageFlags") int usage() { return VkPhysicalDeviceImageFormatInfo2.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 usageAt(long index, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 usage(@CType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_usage(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment) { return VkPhysicalDeviceImageFormatInfo2.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageCreateFlags") int flagsAt(long index) { return VkPhysicalDeviceImageFormatInfo2.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageCreateFlags") int flags() { return VkPhysicalDeviceImageFormatInfo2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 flagsAt(long index, @CType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageFormatInfo2 flags(@CType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2.set_flags(this.segment(), value); return this; }

}
