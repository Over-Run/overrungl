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
package overrungl.vulkan.fuchsia.struct;

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
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(java.lang.foreign.MemorySegment)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreGetZirconHandleInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore semaphore;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
/// } VkSemaphoreGetZirconHandleInfoFUCHSIA;
/// ```
public final class VkSemaphoreGetZirconHandleInfoFUCHSIA extends Struct {
    /// The struct layout of `VkSemaphoreGetZirconHandleInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    /// Creates `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreGetZirconHandleInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetZirconHandleInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreGetZirconHandleInfoFUCHSIA(segment); }

    /// Creates `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreGetZirconHandleInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreGetZirconHandleInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreGetZirconHandleInfoFUCHSIA`
    public static VkSemaphoreGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkSemaphoreGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreGetZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreGetZirconHandleInfoFUCHSIA`
    public static VkSemaphoreGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_semaphore(segment, 0L); }
    /// {@return `semaphore` at the given index}
    /// @param index the index
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphoreAt(long index) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_semaphore(this.segment(), index); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore() { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA semaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_semaphore(this.segment(), index, value); return this; }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA semaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_semaphore(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_handleType(segment, 0L); }
    /// {@return `handleType` at the given index}
    /// @param index the index
    public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleTypeAt(long index) { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_handleType(this.segment(), index); }
    /// {@return `handleType`}
    public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleType() { return VkSemaphoreGetZirconHandleInfoFUCHSIA.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA handleTypeAt(long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_handleType(this.segment(), index, value); return this; }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetZirconHandleInfoFUCHSIA handleType(@CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetZirconHandleInfoFUCHSIA.set_handleType(this.segment(), value); return this; }

}