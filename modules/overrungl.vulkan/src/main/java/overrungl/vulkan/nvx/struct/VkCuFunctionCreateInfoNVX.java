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
package overrungl.vulkan.nvx.struct;

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
/// ### module
/// [VarHandle][#VH_module] - [Getter][#module()] - [Setter][#module(java.lang.foreign.MemorySegment)]
/// ### pName
/// [VarHandle][#VH_pName] - [Getter][#pName()] - [Setter][#pName(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCuFunctionCreateInfoNVX {
///     VkStructureType sType;
///     const void * pNext;
///     VkCuModuleNVX module;
///     const char * pName;
/// } VkCuFunctionCreateInfoNVX;
/// ```
public final class VkCuFunctionCreateInfoNVX extends Struct {
    /// The struct layout of `VkCuFunctionCreateInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("module"),
        ValueLayout.ADDRESS.withName("pName")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `module` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    public VkCuFunctionCreateInfoNVX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCuFunctionCreateInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuFunctionCreateInfoNVX`
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCuFunctionCreateInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCuFunctionCreateInfoNVX`
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCuFunctionCreateInfoNVX.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCuFunctionCreateInfoNVX.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCuFunctionCreateInfoNVX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCuFunctionCreateInfoNVX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX sTypeAt(long index, @CType("VkStructureType") int value) { VkCuFunctionCreateInfoNVX.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX sType(@CType("VkStructureType") int value) { VkCuFunctionCreateInfoNVX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCuFunctionCreateInfoNVX.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCuFunctionCreateInfoNVX.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCuFunctionCreateInfoNVX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pNext(this.segment(), value); return this; }

    /// {@return `module` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment get_module(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_module.get(segment, 0L, index); }
    /// {@return `module`}
    /// @param segment the segment of the struct
    public static @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment get_module(MemorySegment segment) { return VkCuFunctionCreateInfoNVX.get_module(segment, 0L); }
    /// {@return `module` at the given index}
    /// @param index the index
    public @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment moduleAt(long index) { return VkCuFunctionCreateInfoNVX.get_module(this.segment(), index); }
    /// {@return `module`}
    public @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment module() { return VkCuFunctionCreateInfoNVX.get_module(this.segment()); }
    /// Sets `module` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_module(MemorySegment segment, long index, @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment value) { VH_module.set(segment, 0L, index, value); }
    /// Sets `module` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_module(MemorySegment segment, @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_module(segment, 0L, value); }
    /// Sets `module` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX moduleAt(long index, @CType("VkCuModuleNVX") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_module(this.segment(), index, value); return this; }
    /// Sets `module` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX module(@CType("VkCuModuleNVX") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_module(this.segment(), value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment) { return VkCuFunctionCreateInfoNVX.get_pName(segment, 0L); }
    /// {@return `pName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pNameAt(long index) { return VkCuFunctionCreateInfoNVX.get_pName(this.segment(), index); }
    /// {@return `pName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pName() { return VkCuFunctionCreateInfoNVX.get_pName(this.segment()); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pName(segment, 0L, value); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pName(this.segment(), index, value); return this; }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkCuFunctionCreateInfoNVX.set_pName(this.segment(), value); return this; }

}
