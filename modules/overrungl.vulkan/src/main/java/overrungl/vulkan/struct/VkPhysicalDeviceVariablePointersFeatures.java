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
/// ### variablePointersStorageBuffer
/// [VarHandle][#VH_variablePointersStorageBuffer] - [Getter][#variablePointersStorageBuffer()] - [Setter][#variablePointersStorageBuffer(int)]
/// ### variablePointers
/// [VarHandle][#VH_variablePointers] - [Getter][#variablePointers()] - [Setter][#variablePointers(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVariablePointersFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
/// } VkPhysicalDeviceVariablePointersFeatures;
/// ```
public final class VkPhysicalDeviceVariablePointersFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceVariablePointersFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVariablePointersFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointersFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointersFeatures(segment); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointersFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointersFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointersFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointersFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVariablePointersFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVariablePointersFeatures`
    public static VkPhysicalDeviceVariablePointersFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVariablePointersFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVariablePointersFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVariablePointersFeatures`
    public static VkPhysicalDeviceVariablePointersFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVariablePointersFeatures(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVariablePointersFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(segment, 0L); }
    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variablePointersStorageBufferAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(this.segment(), index); }
    /// {@return `variablePointersStorageBuffer`}
    public @CType("VkBool32") int variablePointersStorageBuffer() { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(this.segment()); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointersStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(segment, 0L, value); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(this.segment(), index, value); return this; }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(this.segment(), value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get(segment, 0L, index); }
    /// {@return `variablePointers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(segment, 0L); }
    /// {@return `variablePointers` at the given index}
    /// @param index the index
    public @CType("VkBool32") int variablePointersAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(this.segment(), index); }
    /// {@return `variablePointers`}
    public @CType("VkBool32") int variablePointers() { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(this.segment()); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointers.set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(segment, 0L, value); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(this.segment(), index, value); return this; }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointers(@CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(this.segment(), value); return this; }

}
