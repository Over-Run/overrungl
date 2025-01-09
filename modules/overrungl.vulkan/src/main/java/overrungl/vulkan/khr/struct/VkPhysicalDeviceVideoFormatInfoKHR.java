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
package overrungl.vulkan.khr.struct;

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
/// ### imageUsage
/// [VarHandle][#VH_imageUsage] - [Getter][#imageUsage()] - [Setter][#imageUsage(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVideoFormatInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageUsageFlags imageUsage;
/// } VkPhysicalDeviceVideoFormatInfoKHR;
/// ```
public final class VkPhysicalDeviceVideoFormatInfoKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceVideoFormatInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageUsage")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageUsage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsage"));

    /// Creates `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVideoFormatInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoFormatInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment); }

    /// Creates `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoFormatInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoFormatInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoFormatInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoFormatInfoKHR`
    public static VkPhysicalDeviceVideoFormatInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoFormatInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVideoFormatInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoFormatInfoKHR`
    public static VkPhysicalDeviceVideoFormatInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoFormatInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceVideoFormatInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVideoFormatInfoKHR`
    public VkPhysicalDeviceVideoFormatInfoKHR asSlice(long index) { return new VkPhysicalDeviceVideoFormatInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceVideoFormatInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVideoFormatInfoKHR`
    public VkPhysicalDeviceVideoFormatInfoKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoFormatInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVideoFormatInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVideoFormatInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVideoFormatInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVideoFormatInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVideoFormatInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVideoFormatInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoFormatInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoFormatInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoFormatInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `imageUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_imageUsage(MemorySegment segment, long index) { return (int) VH_imageUsage.get(segment, 0L, index); }
    /// {@return `imageUsage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_imageUsage(MemorySegment segment) { return VkPhysicalDeviceVideoFormatInfoKHR.get_imageUsage(segment, 0L); }
    /// {@return `imageUsage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int imageUsageAt(long index) { return VkPhysicalDeviceVideoFormatInfoKHR.get_imageUsage(this.segment(), index); }
    /// {@return `imageUsage`}
    public @CType("VkImageUsageFlags") int imageUsage() { return VkPhysicalDeviceVideoFormatInfoKHR.get_imageUsage(this.segment()); }
    /// Sets `imageUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageUsage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_imageUsage.set(segment, 0L, index, value); }
    /// Sets `imageUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageUsage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_imageUsage(segment, 0L, value); }
    /// Sets `imageUsage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR imageUsageAt(long index, @CType("VkImageUsageFlags") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_imageUsage(this.segment(), index, value); return this; }
    /// Sets `imageUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoFormatInfoKHR imageUsage(@CType("VkImageUsageFlags") int value) { VkPhysicalDeviceVideoFormatInfoKHR.set_imageUsage(this.segment(), value); return this; }

}
