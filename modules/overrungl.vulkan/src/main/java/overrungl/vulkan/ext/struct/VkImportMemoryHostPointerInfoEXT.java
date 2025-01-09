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
package overrungl.vulkan.ext.struct;

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
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ### pHostPointer
/// [VarHandle][#VH_pHostPointer] - [Getter][#pHostPointer()] - [Setter][#pHostPointer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMemoryHostPointerInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkExternalMemoryHandleTypeFlagBits handleType;
///     void * pHostPointer;
/// } VkImportMemoryHostPointerInfoEXT;
/// ```
public final class VkImportMemoryHostPointerInfoEXT extends Struct {
    /// The struct layout of `VkImportMemoryHostPointerInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("pHostPointer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pHostPointer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer"));

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImportMemoryHostPointerInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImportMemoryHostPointerInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryHostPointerInfoEXT`
    public static VkImportMemoryHostPointerInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMemoryHostPointerInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMemoryHostPointerInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMemoryHostPointerInfoEXT`
    public static VkImportMemoryHostPointerInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryHostPointerInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMemoryHostPointerInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMemoryHostPointerInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMemoryHostPointerInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMemoryHostPointerInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMemoryHostPointerInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT sType(@CType("VkStructureType") int value) { VkImportMemoryHostPointerInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportMemoryHostPointerInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportMemoryHostPointerInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportMemoryHostPointerInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkImportMemoryHostPointerInfoEXT.get_handleType(segment, 0L); }
    /// {@return `handleType` at the given index}
    /// @param index the index
    public @CType("VkExternalMemoryHandleTypeFlagBits") int handleTypeAt(long index) { return VkImportMemoryHostPointerInfoEXT.get_handleType(this.segment(), index); }
    /// {@return `handleType`}
    public @CType("VkExternalMemoryHandleTypeFlagBits") int handleType() { return VkImportMemoryHostPointerInfoEXT.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryHostPointerInfoEXT.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT handleTypeAt(long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryHostPointerInfoEXT.set_handleType(this.segment(), index, value); return this; }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT handleType(@CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryHostPointerInfoEXT.set_handleType(this.segment(), value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pHostPointer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pHostPointer.get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pHostPointer(MemorySegment segment) { return VkImportMemoryHostPointerInfoEXT.get_pHostPointer(segment, 0L); }
    /// {@return `pHostPointer` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pHostPointerAt(long index) { return VkImportMemoryHostPointerInfoEXT.get_pHostPointer(this.segment(), index); }
    /// {@return `pHostPointer`}
    public @CType("void *") java.lang.foreign.MemorySegment pHostPointer() { return VkImportMemoryHostPointerInfoEXT.get_pHostPointer(this.segment()); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pHostPointer.set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pHostPointer(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pHostPointer(segment, 0L, value); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pHostPointerAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pHostPointer(this.segment(), index, value); return this; }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pHostPointer(@CType("void *") java.lang.foreign.MemorySegment value) { VkImportMemoryHostPointerInfoEXT.set_pHostPointer(this.segment(), value); return this; }

}