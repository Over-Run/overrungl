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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### queueFamilyIndex
/// [VarHandle][#VH_queueFamilyIndex] - [Getter][#queueFamilyIndex()] - [Setter][#queueFamilyIndex(int)]
/// ### queueIndex
/// [VarHandle][#VH_queueIndex] - [Getter][#queueIndex()] - [Setter][#queueIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceQueueInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceQueueCreateFlags flags;
///     uint32_t queueFamilyIndex;
///     uint32_t queueIndex;
/// } VkDeviceQueueInfo2;
/// ```
public final class VkDeviceQueueInfo2 extends Struct {
    /// The struct layout of `VkDeviceQueueInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueIndex"));

    /// Creates `VkDeviceQueueInfo2` with the given segment.
    /// @param segment the memory segment
    public VkDeviceQueueInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceQueueInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment); }

    /// Creates `VkDeviceQueueInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceQueueInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceQueueInfo2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceQueueInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceQueueInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceQueueInfo2`
    public static VkDeviceQueueInfo2 alloc(SegmentAllocator allocator) { return new VkDeviceQueueInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceQueueInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceQueueInfo2`
    public static VkDeviceQueueInfo2 alloc(SegmentAllocator allocator, long count) { return new VkDeviceQueueInfo2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceQueueInfo2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceQueueInfo2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceQueueInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceQueueInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceQueueInfo2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 sType(@CType("VkStructureType") int value) { VkDeviceQueueInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceQueueInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceQueueInfo2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceQueueInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueInfo2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceQueueInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceQueueCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceQueueCreateFlags") int get_flags(MemorySegment segment) { return VkDeviceQueueInfo2.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDeviceQueueCreateFlags") int flagsAt(long index) { return VkDeviceQueueInfo2.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDeviceQueueCreateFlags") int flags() { return VkDeviceQueueInfo2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceQueueCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueInfo2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 flagsAt(long index, @CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueInfo2.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 flags(@CType("VkDeviceQueueCreateFlags") int value) { VkDeviceQueueInfo2.set_flags(this.segment(), value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment) { return VkDeviceQueueInfo2.get_queueFamilyIndex(segment, 0L); }
    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueFamilyIndexAt(long index) { return VkDeviceQueueInfo2.get_queueFamilyIndex(this.segment(), index); }
    /// {@return `queueFamilyIndex`}
    public @CType("uint32_t") int queueFamilyIndex() { return VkDeviceQueueInfo2.get_queueFamilyIndex(this.segment()); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueFamilyIndex(segment, 0L, value); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 queueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueFamilyIndex(this.segment(), index, value); return this; }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 queueFamilyIndex(@CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueFamilyIndex(this.segment(), value); return this; }

    /// {@return `queueIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueIndex(MemorySegment segment, long index) { return (int) VH_queueIndex.get(segment, 0L, index); }
    /// {@return `queueIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueIndex(MemorySegment segment) { return VkDeviceQueueInfo2.get_queueIndex(segment, 0L); }
    /// {@return `queueIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueIndexAt(long index) { return VkDeviceQueueInfo2.get_queueIndex(this.segment(), index); }
    /// {@return `queueIndex`}
    public @CType("uint32_t") int queueIndex() { return VkDeviceQueueInfo2.get_queueIndex(this.segment()); }
    /// Sets `queueIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueIndex.set(segment, 0L, index, value); }
    /// Sets `queueIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueIndex(segment, 0L, value); }
    /// Sets `queueIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 queueIndexAt(long index, @CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueIndex(this.segment(), index, value); return this; }
    /// Sets `queueIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceQueueInfo2 queueIndex(@CType("uint32_t") int value) { VkDeviceQueueInfo2.set_queueIndex(this.segment(), value); return this; }

}
