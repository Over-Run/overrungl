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
/// ### graphicsPipelineLibraryFastLinking
/// [VarHandle][#VH_graphicsPipelineLibraryFastLinking] - [Getter][#graphicsPipelineLibraryFastLinking()] - [Setter][#graphicsPipelineLibraryFastLinking(int)]
/// ### graphicsPipelineLibraryIndependentInterpolationDecoration
/// [VarHandle][#VH_graphicsPipelineLibraryIndependentInterpolationDecoration] - [Getter][#graphicsPipelineLibraryIndependentInterpolationDecoration()] - [Setter][#graphicsPipelineLibraryIndependentInterpolationDecoration(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 graphicsPipelineLibraryFastLinking;
///     VkBool32 graphicsPipelineLibraryIndependentInterpolationDecoration;
/// } VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT;
/// ```
public final class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `graphicsPipelineLibraryFastLinking` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_graphicsPipelineLibraryFastLinking = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryFastLinking"));
    /// The [VarHandle] of `graphicsPipelineLibraryIndependentInterpolationDecoration` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration"));

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `graphicsPipelineLibraryFastLinking` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_graphicsPipelineLibraryFastLinking(MemorySegment segment, long index) { return (int) VH_graphicsPipelineLibraryFastLinking.get(segment, 0L, index); }
    /// {@return `graphicsPipelineLibraryFastLinking`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_graphicsPipelineLibraryFastLinking(MemorySegment segment) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryFastLinking(segment, 0L); }
    /// {@return `graphicsPipelineLibraryFastLinking` at the given index}
    /// @param index the index
    public @CType("VkBool32") int graphicsPipelineLibraryFastLinkingAt(long index) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryFastLinking(this.segment(), index); }
    /// {@return `graphicsPipelineLibraryFastLinking`}
    public @CType("VkBool32") int graphicsPipelineLibraryFastLinking() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryFastLinking(this.segment()); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_graphicsPipelineLibraryFastLinking(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_graphicsPipelineLibraryFastLinking.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_graphicsPipelineLibraryFastLinking(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryFastLinking(segment, 0L, value); }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinkingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryFastLinking(this.segment(), index, value); return this; }
    /// Sets `graphicsPipelineLibraryFastLinking` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinking(@CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryFastLinking(this.segment(), value); return this; }

    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment, long index) { return (int) VH_graphicsPipelineLibraryIndependentInterpolationDecoration.get(segment, 0L, index); }
    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryIndependentInterpolationDecoration(segment, 0L); }
    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration` at the given index}
    /// @param index the index
    public @CType("VkBool32") int graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index) { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), index); }
    /// {@return `graphicsPipelineLibraryIndependentInterpolationDecoration`}
    public @CType("VkBool32") int graphicsPipelineLibraryIndependentInterpolationDecoration() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.get_graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment()); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_graphicsPipelineLibraryIndependentInterpolationDecoration.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_graphicsPipelineLibraryIndependentInterpolationDecoration(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryIndependentInterpolationDecoration(segment, 0L, value); }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecorationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), index, value); return this; }
    /// Sets `graphicsPipelineLibraryIndependentInterpolationDecoration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecoration(@CType("VkBool32") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.set_graphicsPipelineLibraryIndependentInterpolationDecoration(this.segment(), value); return this; }

}
