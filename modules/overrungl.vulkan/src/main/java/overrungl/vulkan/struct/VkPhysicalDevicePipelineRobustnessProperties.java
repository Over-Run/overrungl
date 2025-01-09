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
/// ### defaultRobustnessStorageBuffers
/// [VarHandle][#VH_defaultRobustnessStorageBuffers] - [Getter][#defaultRobustnessStorageBuffers()] - [Setter][#defaultRobustnessStorageBuffers(int)]
/// ### defaultRobustnessUniformBuffers
/// [VarHandle][#VH_defaultRobustnessUniformBuffers] - [Getter][#defaultRobustnessUniformBuffers()] - [Setter][#defaultRobustnessUniformBuffers(int)]
/// ### defaultRobustnessVertexInputs
/// [VarHandle][#VH_defaultRobustnessVertexInputs] - [Getter][#defaultRobustnessVertexInputs()] - [Setter][#defaultRobustnessVertexInputs(int)]
/// ### defaultRobustnessImages
/// [VarHandle][#VH_defaultRobustnessImages] - [Getter][#defaultRobustnessImages()] - [Setter][#defaultRobustnessImages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePipelineRobustnessProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
/// } VkPhysicalDevicePipelineRobustnessProperties;
/// ```
public final class VkPhysicalDevicePipelineRobustnessProperties extends Struct {
    /// The struct layout of `VkPhysicalDevicePipelineRobustnessProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `defaultRobustnessStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The [VarHandle] of `defaultRobustnessUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The [VarHandle] of `defaultRobustnessVertexInputs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The [VarHandle] of `defaultRobustnessImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));

    /// Creates `VkPhysicalDevicePipelineRobustnessProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePipelineRobustnessProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePipelineRobustnessProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessProperties(segment); }

    /// Creates `VkPhysicalDevicePipelineRobustnessProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePipelineRobustnessProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePipelineRobustnessProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineRobustnessProperties`
    public static VkPhysicalDevicePipelineRobustnessProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineRobustnessProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePipelineRobustnessProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineRobustnessProperties`
    public static VkPhysicalDevicePipelineRobustnessProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineRobustnessProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePipelineRobustnessProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties sType(@CType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePipelineRobustnessProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineRobustnessProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineRobustnessProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineRobustnessProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessStorageBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessStorageBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessStorageBuffers(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessStorageBuffers(segment, 0L); }
    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessStorageBuffersAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessStorageBuffers(this.segment(), index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessStorageBuffers() { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessStorageBuffers(this.segment()); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessStorageBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessStorageBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessStorageBuffers(segment, 0L, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessStorageBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessStorageBuffers(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessStorageBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessStorageBuffers(this.segment(), value); return this; }

    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessUniformBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessUniformBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessUniformBuffers(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessUniformBuffers(segment, 0L); }
    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessUniformBuffersAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessUniformBuffers(this.segment(), index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessUniformBuffers() { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessUniformBuffers(this.segment()); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessUniformBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessUniformBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessUniformBuffers(segment, 0L, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessUniformBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessUniformBuffers(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessUniformBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessUniformBuffers(this.segment(), value); return this; }

    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessVertexInputs(MemorySegment segment, long index) { return (int) VH_defaultRobustnessVertexInputs.get(segment, 0L, index); }
    /// {@return `defaultRobustnessVertexInputs`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessVertexInputs(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessVertexInputs(segment, 0L); }
    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessVertexInputsAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessVertexInputs(this.segment(), index); }
    /// {@return `defaultRobustnessVertexInputs`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessVertexInputs() { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessVertexInputs(this.segment()); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessVertexInputs(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessVertexInputs.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessVertexInputs(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessVertexInputs(segment, 0L, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessVertexInputsAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessVertexInputs(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessVertexInputs(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessVertexInputs(this.segment(), value); return this; }

    /// {@return `defaultRobustnessImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessImageBehavior") int get_defaultRobustnessImages(MemorySegment segment, long index) { return (int) VH_defaultRobustnessImages.get(segment, 0L, index); }
    /// {@return `defaultRobustnessImages`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessImageBehavior") int get_defaultRobustnessImages(MemorySegment segment) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessImages(segment, 0L); }
    /// {@return `defaultRobustnessImages` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessImageBehavior") int defaultRobustnessImagesAt(long index) { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessImages(this.segment(), index); }
    /// {@return `defaultRobustnessImages`}
    public @CType("VkPipelineRobustnessImageBehavior") int defaultRobustnessImages() { return VkPhysicalDevicePipelineRobustnessProperties.get_defaultRobustnessImages(this.segment()); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessImages(MemorySegment segment, long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VH_defaultRobustnessImages.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessImages(MemorySegment segment, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessImages(segment, 0L, value); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessImagesAt(long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessImages(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessProperties defaultRobustnessImages(@CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDevicePipelineRobustnessProperties.set_defaultRobustnessImages(this.segment(), value); return this; }

}
