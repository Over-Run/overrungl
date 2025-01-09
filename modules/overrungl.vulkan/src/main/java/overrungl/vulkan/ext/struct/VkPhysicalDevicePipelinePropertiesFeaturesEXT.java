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
/// ### pipelinePropertiesIdentifier
/// [VarHandle][#VH_pipelinePropertiesIdentifier] - [Getter][#pipelinePropertiesIdentifier()] - [Setter][#pipelinePropertiesIdentifier(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePipelinePropertiesFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 pipelinePropertiesIdentifier;
/// } VkPhysicalDevicePipelinePropertiesFeaturesEXT;
/// ```
public final class VkPhysicalDevicePipelinePropertiesFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelinePropertiesIdentifier")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelinePropertiesIdentifier` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelinePropertiesIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelinePropertiesIdentifier"));

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelinePropertiesIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelinePropertiesIdentifier(MemorySegment segment, long index) { return (int) VH_pipelinePropertiesIdentifier.get(segment, 0L, index); }
    /// {@return `pipelinePropertiesIdentifier`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelinePropertiesIdentifier(MemorySegment segment) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pipelinePropertiesIdentifier(segment, 0L); }
    /// {@return `pipelinePropertiesIdentifier` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelinePropertiesIdentifierAt(long index) { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pipelinePropertiesIdentifier(this.segment(), index); }
    /// {@return `pipelinePropertiesIdentifier`}
    public @CType("VkBool32") int pipelinePropertiesIdentifier() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.get_pipelinePropertiesIdentifier(this.segment()); }
    /// Sets `pipelinePropertiesIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelinePropertiesIdentifier(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelinePropertiesIdentifier.set(segment, 0L, index, value); }
    /// Sets `pipelinePropertiesIdentifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelinePropertiesIdentifier(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pipelinePropertiesIdentifier(segment, 0L, value); }
    /// Sets `pipelinePropertiesIdentifier` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifierAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pipelinePropertiesIdentifier(this.segment(), index, value); return this; }
    /// Sets `pipelinePropertiesIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifier(@CType("VkBool32") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.set_pipelinePropertiesIdentifier(this.segment(), value); return this; }

}
