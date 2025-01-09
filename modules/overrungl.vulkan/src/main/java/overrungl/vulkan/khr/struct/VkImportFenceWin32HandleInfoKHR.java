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
/// ### fence
/// [VarHandle][#VH_fence] - [Getter][#fence()] - [Setter][#fence(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(java.lang.foreign.MemorySegment)]
/// ### name
/// [VarHandle][#VH_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportFenceWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkFence fence;
///     VkFenceImportFlags flags;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     HANDLE handle;
///     LPCWSTR name;
/// } VkImportFenceWin32HandleInfoKHR;
/// ```
public final class VkImportFenceWin32HandleInfoKHR extends Struct {
    /// The struct layout of `VkImportFenceWin32HandleInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle"),
        ValueLayout.ADDRESS.withName("name")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fence` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    /// Creates `VkImportFenceWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkImportFenceWin32HandleInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportFenceWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceWin32HandleInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment); }

    /// Creates `VkImportFenceWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceWin32HandleInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportFenceWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceWin32HandleInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImportFenceWin32HandleInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImportFenceWin32HandleInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportFenceWin32HandleInfoKHR`
    public static VkImportFenceWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkImportFenceWin32HandleInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportFenceWin32HandleInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportFenceWin32HandleInfoKHR`
    public static VkImportFenceWin32HandleInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkImportFenceWin32HandleInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportFenceWin32HandleInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportFenceWin32HandleInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkImportFenceWin32HandleInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR sType(@CType("VkStructureType") int value) { VkImportFenceWin32HandleInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportFenceWin32HandleInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `fence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFence") java.lang.foreign.MemorySegment get_fence(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_fence.get(segment, 0L, index); }
    /// {@return `fence`}
    /// @param segment the segment of the struct
    public static @CType("VkFence") java.lang.foreign.MemorySegment get_fence(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_fence(segment, 0L); }
    /// {@return `fence` at the given index}
    /// @param index the index
    public @CType("VkFence") java.lang.foreign.MemorySegment fenceAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_fence(this.segment(), index); }
    /// {@return `fence`}
    public @CType("VkFence") java.lang.foreign.MemorySegment fence() { return VkImportFenceWin32HandleInfoKHR.get_fence(this.segment()); }
    /// Sets `fence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fence(MemorySegment segment, long index, @CType("VkFence") java.lang.foreign.MemorySegment value) { VH_fence.set(segment, 0L, index, value); }
    /// Sets `fence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fence(MemorySegment segment, @CType("VkFence") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_fence(segment, 0L, value); }
    /// Sets `fence` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR fenceAt(long index, @CType("VkFence") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_fence(this.segment(), index, value); return this; }
    /// Sets `fence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR fence(@CType("VkFence") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_fence(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFenceImportFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkFenceImportFlags") int get_flags(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkFenceImportFlags") int flagsAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkFenceImportFlags") int flags() { return VkImportFenceWin32HandleInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkFenceImportFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkFenceImportFlags") int value) { VkImportFenceWin32HandleInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR flagsAt(long index, @CType("VkFenceImportFlags") int value) { VkImportFenceWin32HandleInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR flags(@CType("VkFenceImportFlags") int value) { VkImportFenceWin32HandleInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalFenceHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalFenceHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_handleType(segment, 0L); }
    /// {@return `handleType` at the given index}
    /// @param index the index
    public @CType("VkExternalFenceHandleTypeFlagBits") int handleTypeAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_handleType(this.segment(), index); }
    /// {@return `handleType`}
    public @CType("VkExternalFenceHandleTypeFlagBits") int handleType() { return VkImportFenceWin32HandleInfoKHR.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceWin32HandleInfoKHR.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR handleTypeAt(long index, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceWin32HandleInfoKHR.set_handleType(this.segment(), index, value); return this; }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR handleType(@CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceWin32HandleInfoKHR.set_handleType(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("HANDLE") java.lang.foreign.MemorySegment get_handle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("HANDLE") java.lang.foreign.MemorySegment get_handle(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_handle(segment, 0L); }
    /// {@return `handle` at the given index}
    /// @param index the index
    public @CType("HANDLE") java.lang.foreign.MemorySegment handleAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_handle(this.segment(), index); }
    /// {@return `handle`}
    public @CType("HANDLE") java.lang.foreign.MemorySegment handle() { return VkImportFenceWin32HandleInfoKHR.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR handleAt(long index, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_handle(this.segment(), index, value); return this; }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR handle(@CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_handle(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return VkImportFenceWin32HandleInfoKHR.get_name(segment, 0L); }
    /// {@return `name` at the given index}
    /// @param index the index
    public @CType("LPCWSTR") java.lang.foreign.MemorySegment nameAt(long index) { return VkImportFenceWin32HandleInfoKHR.get_name(this.segment(), index); }
    /// {@return `name`}
    public @CType("LPCWSTR") java.lang.foreign.MemorySegment name() { return VkImportFenceWin32HandleInfoKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR nameAt(long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_name(this.segment(), index, value); return this; }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceWin32HandleInfoKHR name(@CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportFenceWin32HandleInfoKHR.set_name(this.segment(), value); return this; }

}
