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
/// ### pAttributes
/// [VarHandle][#VH_pAttributes] - [Getter][#pAttributes()] - [Setter][#pAttributes(java.lang.foreign.MemorySegment)]
/// ### dwAccess
/// [VarHandle][#VH_dwAccess] - [Getter][#dwAccess()] - [Setter][#dwAccess(int)]
/// ### name
/// [VarHandle][#VH_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportSemaphoreWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const SECURITY_ATTRIBUTES * pAttributes;
///     DWORD dwAccess;
///     LPCWSTR name;
/// } VkExportSemaphoreWin32HandleInfoKHR;
/// ```
public final class VkExportSemaphoreWin32HandleInfoKHR extends Struct {
    /// The struct layout of `VkExportSemaphoreWin32HandleInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess"),
        ValueLayout.ADDRESS.withName("name")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));
    /// The [VarHandle] of `dwAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dwAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dwAccess"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    /// Creates `VkExportSemaphoreWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkExportSemaphoreWin32HandleInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportSemaphoreWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreWin32HandleInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreWin32HandleInfoKHR(segment); }

    /// Creates `VkExportSemaphoreWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreWin32HandleInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreWin32HandleInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportSemaphoreWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreWin32HandleInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExportSemaphoreWin32HandleInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportSemaphoreWin32HandleInfoKHR`
    public static VkExportSemaphoreWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkExportSemaphoreWin32HandleInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportSemaphoreWin32HandleInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportSemaphoreWin32HandleInfoKHR`
    public static VkExportSemaphoreWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkExportSemaphoreWin32HandleInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportSemaphoreWin32HandleInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExportSemaphoreWin32HandleInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportSemaphoreWin32HandleInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR sType(@CType("VkStructureType") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportSemaphoreWin32HandleInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportSemaphoreWin32HandleInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportSemaphoreWin32HandleInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    /// @param segment the segment of the struct
    public static @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment) { return VkExportSemaphoreWin32HandleInfoKHR.get_pAttributes(segment, 0L); }
    /// {@return `pAttributes` at the given index}
    /// @param index the index
    public @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment pAttributesAt(long index) { return VkExportSemaphoreWin32HandleInfoKHR.get_pAttributes(this.segment(), index); }
    /// {@return `pAttributes`}
    public @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment pAttributes() { return VkExportSemaphoreWin32HandleInfoKHR.get_pAttributes(this.segment()); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, long index, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pAttributes(segment, 0L, value); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR pAttributesAt(long index, @CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pAttributes(this.segment(), index, value); return this; }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR pAttributes(@CType("const SECURITY_ATTRIBUTES *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_pAttributes(this.segment(), value); return this; }

    /// {@return `dwAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("DWORD") int get_dwAccess(MemorySegment segment, long index) { return (int) VH_dwAccess.get(segment, 0L, index); }
    /// {@return `dwAccess`}
    /// @param segment the segment of the struct
    public static @CType("DWORD") int get_dwAccess(MemorySegment segment) { return VkExportSemaphoreWin32HandleInfoKHR.get_dwAccess(segment, 0L); }
    /// {@return `dwAccess` at the given index}
    /// @param index the index
    public @CType("DWORD") int dwAccessAt(long index) { return VkExportSemaphoreWin32HandleInfoKHR.get_dwAccess(this.segment(), index); }
    /// {@return `dwAccess`}
    public @CType("DWORD") int dwAccess() { return VkExportSemaphoreWin32HandleInfoKHR.get_dwAccess(this.segment()); }
    /// Sets `dwAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dwAccess(MemorySegment segment, long index, @CType("DWORD") int value) { VH_dwAccess.set(segment, 0L, index, value); }
    /// Sets `dwAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dwAccess(MemorySegment segment, @CType("DWORD") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_dwAccess(segment, 0L, value); }
    /// Sets `dwAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR dwAccessAt(long index, @CType("DWORD") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_dwAccess(this.segment(), index, value); return this; }
    /// Sets `dwAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR dwAccess(@CType("DWORD") int value) { VkExportSemaphoreWin32HandleInfoKHR.set_dwAccess(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return VkExportSemaphoreWin32HandleInfoKHR.get_name(segment, 0L); }
    /// {@return `name` at the given index}
    /// @param index the index
    public @CType("LPCWSTR") java.lang.foreign.MemorySegment nameAt(long index) { return VkExportSemaphoreWin32HandleInfoKHR.get_name(this.segment(), index); }
    /// {@return `name`}
    public @CType("LPCWSTR") java.lang.foreign.MemorySegment name() { return VkExportSemaphoreWin32HandleInfoKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR nameAt(long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreWin32HandleInfoKHR name(@CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkExportSemaphoreWin32HandleInfoKHR.set_name(this.segment(), value); return this; }

}