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
package overrungl.vulkan.nv.struct;

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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### accelerationStructure
/// [VarHandle][#VH_accelerationStructure] - [Getter][#accelerationStructure()] - [Setter][#accelerationStructure(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureMemoryRequirementsInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureMemoryRequirementsTypeNV type;
///     VkAccelerationStructureNV accelerationStructure;
/// } VkAccelerationStructureMemoryRequirementsInfoNV;
/// ```
public final class VkAccelerationStructureMemoryRequirementsInfoNV extends Struct {
    /// The struct layout of `VkAccelerationStructureMemoryRequirementsInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("accelerationStructure")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    /// Creates `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureMemoryRequirementsInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMemoryRequirementsInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment); }

    /// Creates `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMemoryRequirementsInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMemoryRequirementsInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMemoryRequirementsInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMemoryRequirementsInfoNV`
    public static VkAccelerationStructureMemoryRequirementsInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMemoryRequirementsInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureMemoryRequirementsInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMemoryRequirementsInfoNV`
    public static VkAccelerationStructureMemoryRequirementsInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMemoryRequirementsInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureMemoryRequirementsInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureMemoryRequirementsInfoNV`
    public VkAccelerationStructureMemoryRequirementsInfoNV asSlice(long index) { return new VkAccelerationStructureMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureMemoryRequirementsInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureMemoryRequirementsInfoNV`
    public VkAccelerationStructureMemoryRequirementsInfoNV asSlice(long index, long count) { return new VkAccelerationStructureMemoryRequirementsInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureMemoryRequirementsInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV sType(@CType("VkStructureType") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureMemoryRequirementsInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int get_type(MemorySegment segment) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int typeAt(long index) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int type() { return VkAccelerationStructureMemoryRequirementsInfoNV.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV typeAt(long index, @CType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV type(@CType("VkAccelerationStructureMemoryRequirementsTypeNV") int value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_type(this.segment(), value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment get_accelerationStructure(MemorySegment segment) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_accelerationStructure(segment, 0L); }
    /// {@return `accelerationStructure` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructureAt(long index) { return VkAccelerationStructureMemoryRequirementsInfoNV.get_accelerationStructure(this.segment(), index); }
    /// {@return `accelerationStructure`}
    public @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment accelerationStructure() { return VkAccelerationStructureMemoryRequirementsInfoNV.get_accelerationStructure(this.segment()); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_accelerationStructure(segment, 0L, value); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructureAt(long index, @CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_accelerationStructure(this.segment(), index, value); return this; }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMemoryRequirementsInfoNV accelerationStructure(@CType("VkAccelerationStructureNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMemoryRequirementsInfoNV.set_accelerationStructure(this.segment(), value); return this; }

}
