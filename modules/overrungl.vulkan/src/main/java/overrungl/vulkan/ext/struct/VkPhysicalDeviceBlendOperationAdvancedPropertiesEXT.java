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
/// ### advancedBlendMaxColorAttachments
/// [VarHandle][#VH_advancedBlendMaxColorAttachments] - [Getter][#advancedBlendMaxColorAttachments()] - [Setter][#advancedBlendMaxColorAttachments(int)]
/// ### advancedBlendIndependentBlend
/// [VarHandle][#VH_advancedBlendIndependentBlend] - [Getter][#advancedBlendIndependentBlend()] - [Setter][#advancedBlendIndependentBlend(int)]
/// ### advancedBlendNonPremultipliedSrcColor
/// [VarHandle][#VH_advancedBlendNonPremultipliedSrcColor] - [Getter][#advancedBlendNonPremultipliedSrcColor()] - [Setter][#advancedBlendNonPremultipliedSrcColor(int)]
/// ### advancedBlendNonPremultipliedDstColor
/// [VarHandle][#VH_advancedBlendNonPremultipliedDstColor] - [Getter][#advancedBlendNonPremultipliedDstColor()] - [Setter][#advancedBlendNonPremultipliedDstColor(int)]
/// ### advancedBlendCorrelatedOverlap
/// [VarHandle][#VH_advancedBlendCorrelatedOverlap] - [Getter][#advancedBlendCorrelatedOverlap()] - [Setter][#advancedBlendCorrelatedOverlap(int)]
/// ### advancedBlendAllOperations
/// [VarHandle][#VH_advancedBlendAllOperations] - [Getter][#advancedBlendAllOperations()] - [Setter][#advancedBlendAllOperations(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t advancedBlendMaxColorAttachments;
///     VkBool32 advancedBlendIndependentBlend;
///     VkBool32 advancedBlendNonPremultipliedSrcColor;
///     VkBool32 advancedBlendNonPremultipliedDstColor;
///     VkBool32 advancedBlendCorrelatedOverlap;
///     VkBool32 advancedBlendAllOperations;
/// } VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT;
/// ```
public final class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments"),
        ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
        ValueLayout.JAVA_INT.withName("advancedBlendAllOperations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `advancedBlendMaxColorAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendMaxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    /// The [VarHandle] of `advancedBlendIndependentBlend` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendIndependentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendIndependentBlend"));
    /// The [VarHandle] of `advancedBlendNonPremultipliedSrcColor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendNonPremultipliedSrcColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    /// The [VarHandle] of `advancedBlendNonPremultipliedDstColor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendNonPremultipliedDstColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    /// The [VarHandle] of `advancedBlendCorrelatedOverlap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendCorrelatedOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    /// The [VarHandle] of `advancedBlendAllOperations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_advancedBlendAllOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendAllOperations"));

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `advancedBlendMaxColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_advancedBlendMaxColorAttachments(MemorySegment segment, long index) { return (int) VH_advancedBlendMaxColorAttachments.get(segment, 0L, index); }
    /// {@return `advancedBlendMaxColorAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_advancedBlendMaxColorAttachments(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendMaxColorAttachments(segment, 0L); }
    /// {@return `advancedBlendMaxColorAttachments` at the given index}
    /// @param index the index
    public @CType("uint32_t") int advancedBlendMaxColorAttachmentsAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendMaxColorAttachments(this.segment(), index); }
    /// {@return `advancedBlendMaxColorAttachments`}
    public @CType("uint32_t") int advancedBlendMaxColorAttachments() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendMaxColorAttachments(this.segment()); }
    /// Sets `advancedBlendMaxColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendMaxColorAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_advancedBlendMaxColorAttachments.set(segment, 0L, index, value); }
    /// Sets `advancedBlendMaxColorAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendMaxColorAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendMaxColorAttachments(segment, 0L, value); }
    /// Sets `advancedBlendMaxColorAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendMaxColorAttachments(this.segment(), index, value); return this; }
    /// Sets `advancedBlendMaxColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendMaxColorAttachments(this.segment(), value); return this; }

    /// {@return `advancedBlendIndependentBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_advancedBlendIndependentBlend(MemorySegment segment, long index) { return (int) VH_advancedBlendIndependentBlend.get(segment, 0L, index); }
    /// {@return `advancedBlendIndependentBlend`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_advancedBlendIndependentBlend(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendIndependentBlend(segment, 0L); }
    /// {@return `advancedBlendIndependentBlend` at the given index}
    /// @param index the index
    public @CType("VkBool32") int advancedBlendIndependentBlendAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendIndependentBlend(this.segment(), index); }
    /// {@return `advancedBlendIndependentBlend`}
    public @CType("VkBool32") int advancedBlendIndependentBlend() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendIndependentBlend(this.segment()); }
    /// Sets `advancedBlendIndependentBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendIndependentBlend(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_advancedBlendIndependentBlend.set(segment, 0L, index, value); }
    /// Sets `advancedBlendIndependentBlend` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendIndependentBlend(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendIndependentBlend(segment, 0L, value); }
    /// Sets `advancedBlendIndependentBlend` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlendAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendIndependentBlend(this.segment(), index, value); return this; }
    /// Sets `advancedBlendIndependentBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlend(@CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendIndependentBlend(this.segment(), value); return this; }

    /// {@return `advancedBlendNonPremultipliedSrcColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_advancedBlendNonPremultipliedSrcColor(MemorySegment segment, long index) { return (int) VH_advancedBlendNonPremultipliedSrcColor.get(segment, 0L, index); }
    /// {@return `advancedBlendNonPremultipliedSrcColor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_advancedBlendNonPremultipliedSrcColor(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedSrcColor(segment, 0L); }
    /// {@return `advancedBlendNonPremultipliedSrcColor` at the given index}
    /// @param index the index
    public @CType("VkBool32") int advancedBlendNonPremultipliedSrcColorAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedSrcColor(this.segment(), index); }
    /// {@return `advancedBlendNonPremultipliedSrcColor`}
    public @CType("VkBool32") int advancedBlendNonPremultipliedSrcColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedSrcColor(this.segment()); }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendNonPremultipliedSrcColor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_advancedBlendNonPremultipliedSrcColor.set(segment, 0L, index, value); }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendNonPremultipliedSrcColor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedSrcColor(segment, 0L, value); }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedSrcColor(this.segment(), index, value); return this; }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColor(@CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedSrcColor(this.segment(), value); return this; }

    /// {@return `advancedBlendNonPremultipliedDstColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_advancedBlendNonPremultipliedDstColor(MemorySegment segment, long index) { return (int) VH_advancedBlendNonPremultipliedDstColor.get(segment, 0L, index); }
    /// {@return `advancedBlendNonPremultipliedDstColor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_advancedBlendNonPremultipliedDstColor(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedDstColor(segment, 0L); }
    /// {@return `advancedBlendNonPremultipliedDstColor` at the given index}
    /// @param index the index
    public @CType("VkBool32") int advancedBlendNonPremultipliedDstColorAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedDstColor(this.segment(), index); }
    /// {@return `advancedBlendNonPremultipliedDstColor`}
    public @CType("VkBool32") int advancedBlendNonPremultipliedDstColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendNonPremultipliedDstColor(this.segment()); }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendNonPremultipliedDstColor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_advancedBlendNonPremultipliedDstColor.set(segment, 0L, index, value); }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendNonPremultipliedDstColor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedDstColor(segment, 0L, value); }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedDstColor(this.segment(), index, value); return this; }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColor(@CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendNonPremultipliedDstColor(this.segment(), value); return this; }

    /// {@return `advancedBlendCorrelatedOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_advancedBlendCorrelatedOverlap(MemorySegment segment, long index) { return (int) VH_advancedBlendCorrelatedOverlap.get(segment, 0L, index); }
    /// {@return `advancedBlendCorrelatedOverlap`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_advancedBlendCorrelatedOverlap(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendCorrelatedOverlap(segment, 0L); }
    /// {@return `advancedBlendCorrelatedOverlap` at the given index}
    /// @param index the index
    public @CType("VkBool32") int advancedBlendCorrelatedOverlapAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendCorrelatedOverlap(this.segment(), index); }
    /// {@return `advancedBlendCorrelatedOverlap`}
    public @CType("VkBool32") int advancedBlendCorrelatedOverlap() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendCorrelatedOverlap(this.segment()); }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendCorrelatedOverlap(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_advancedBlendCorrelatedOverlap.set(segment, 0L, index, value); }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendCorrelatedOverlap(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendCorrelatedOverlap(segment, 0L, value); }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlapAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendCorrelatedOverlap(this.segment(), index, value); return this; }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlap(@CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendCorrelatedOverlap(this.segment(), value); return this; }

    /// {@return `advancedBlendAllOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_advancedBlendAllOperations(MemorySegment segment, long index) { return (int) VH_advancedBlendAllOperations.get(segment, 0L, index); }
    /// {@return `advancedBlendAllOperations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_advancedBlendAllOperations(MemorySegment segment) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendAllOperations(segment, 0L); }
    /// {@return `advancedBlendAllOperations` at the given index}
    /// @param index the index
    public @CType("VkBool32") int advancedBlendAllOperationsAt(long index) { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendAllOperations(this.segment(), index); }
    /// {@return `advancedBlendAllOperations`}
    public @CType("VkBool32") int advancedBlendAllOperations() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.get_advancedBlendAllOperations(this.segment()); }
    /// Sets `advancedBlendAllOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_advancedBlendAllOperations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_advancedBlendAllOperations.set(segment, 0L, index, value); }
    /// Sets `advancedBlendAllOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_advancedBlendAllOperations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendAllOperations(segment, 0L, value); }
    /// Sets `advancedBlendAllOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendAllOperations(this.segment(), index, value); return this; }
    /// Sets `advancedBlendAllOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperations(@CType("VkBool32") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.set_advancedBlendAllOperations(this.segment(), value); return this; }

}
