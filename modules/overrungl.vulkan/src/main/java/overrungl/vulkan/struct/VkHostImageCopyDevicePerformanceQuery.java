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
/// ### optimalDeviceAccess
/// [VarHandle][#VH_optimalDeviceAccess] - [Getter][#optimalDeviceAccess()] - [Setter][#optimalDeviceAccess(int)]
/// ### identicalMemoryLayout
/// [VarHandle][#VH_identicalMemoryLayout] - [Getter][#identicalMemoryLayout()] - [Setter][#identicalMemoryLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkHostImageCopyDevicePerformanceQuery {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 optimalDeviceAccess;
///     VkBool32 identicalMemoryLayout;
/// } VkHostImageCopyDevicePerformanceQuery;
/// ```
public final class VkHostImageCopyDevicePerformanceQuery extends Struct {
    /// The struct layout of `VkHostImageCopyDevicePerformanceQuery`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `optimalDeviceAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_optimalDeviceAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalDeviceAccess"));
    /// The [VarHandle] of `identicalMemoryLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identicalMemoryLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryLayout"));

    /// Creates `VkHostImageCopyDevicePerformanceQuery` with the given segment.
    /// @param segment the memory segment
    public VkHostImageCopyDevicePerformanceQuery(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkHostImageCopyDevicePerformanceQuery` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQuery of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQuery(segment); }

    /// Creates `VkHostImageCopyDevicePerformanceQuery` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQuery ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQuery(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkHostImageCopyDevicePerformanceQuery` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQuery ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQuery(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkHostImageCopyDevicePerformanceQuery` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHostImageCopyDevicePerformanceQuery`
    public static VkHostImageCopyDevicePerformanceQuery alloc(SegmentAllocator allocator) { return new VkHostImageCopyDevicePerformanceQuery(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkHostImageCopyDevicePerformanceQuery` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHostImageCopyDevicePerformanceQuery`
    public static VkHostImageCopyDevicePerformanceQuery alloc(SegmentAllocator allocator, long count) { return new VkHostImageCopyDevicePerformanceQuery(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkHostImageCopyDevicePerformanceQuery.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkHostImageCopyDevicePerformanceQuery.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkHostImageCopyDevicePerformanceQuery.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkHostImageCopyDevicePerformanceQuery.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery sTypeAt(long index, @CType("VkStructureType") int value) { VkHostImageCopyDevicePerformanceQuery.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery sType(@CType("VkStructureType") int value) { VkHostImageCopyDevicePerformanceQuery.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkHostImageCopyDevicePerformanceQuery.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkHostImageCopyDevicePerformanceQuery.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkHostImageCopyDevicePerformanceQuery.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkHostImageCopyDevicePerformanceQuery.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkHostImageCopyDevicePerformanceQuery.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkHostImageCopyDevicePerformanceQuery.set_pNext(this.segment(), value); return this; }

    /// {@return `optimalDeviceAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_optimalDeviceAccess(MemorySegment segment, long index) { return (int) VH_optimalDeviceAccess.get(segment, 0L, index); }
    /// {@return `optimalDeviceAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_optimalDeviceAccess(MemorySegment segment) { return VkHostImageCopyDevicePerformanceQuery.get_optimalDeviceAccess(segment, 0L); }
    /// {@return `optimalDeviceAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int optimalDeviceAccessAt(long index) { return VkHostImageCopyDevicePerformanceQuery.get_optimalDeviceAccess(this.segment(), index); }
    /// {@return `optimalDeviceAccess`}
    public @CType("VkBool32") int optimalDeviceAccess() { return VkHostImageCopyDevicePerformanceQuery.get_optimalDeviceAccess(this.segment()); }
    /// Sets `optimalDeviceAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_optimalDeviceAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_optimalDeviceAccess.set(segment, 0L, index, value); }
    /// Sets `optimalDeviceAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_optimalDeviceAccess(MemorySegment segment, @CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_optimalDeviceAccess(segment, 0L, value); }
    /// Sets `optimalDeviceAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery optimalDeviceAccessAt(long index, @CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_optimalDeviceAccess(this.segment(), index, value); return this; }
    /// Sets `optimalDeviceAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery optimalDeviceAccess(@CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_optimalDeviceAccess(this.segment(), value); return this; }

    /// {@return `identicalMemoryLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_identicalMemoryLayout(MemorySegment segment, long index) { return (int) VH_identicalMemoryLayout.get(segment, 0L, index); }
    /// {@return `identicalMemoryLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_identicalMemoryLayout(MemorySegment segment) { return VkHostImageCopyDevicePerformanceQuery.get_identicalMemoryLayout(segment, 0L); }
    /// {@return `identicalMemoryLayout` at the given index}
    /// @param index the index
    public @CType("VkBool32") int identicalMemoryLayoutAt(long index) { return VkHostImageCopyDevicePerformanceQuery.get_identicalMemoryLayout(this.segment(), index); }
    /// {@return `identicalMemoryLayout`}
    public @CType("VkBool32") int identicalMemoryLayout() { return VkHostImageCopyDevicePerformanceQuery.get_identicalMemoryLayout(this.segment()); }
    /// Sets `identicalMemoryLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identicalMemoryLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_identicalMemoryLayout.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identicalMemoryLayout(MemorySegment segment, @CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_identicalMemoryLayout(segment, 0L, value); }
    /// Sets `identicalMemoryLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery identicalMemoryLayoutAt(long index, @CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_identicalMemoryLayout(this.segment(), index, value); return this; }
    /// Sets `identicalMemoryLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQuery identicalMemoryLayout(@CType("VkBool32") int value) { VkHostImageCopyDevicePerformanceQuery.set_identicalMemoryLayout(this.segment(), value); return this; }

}
