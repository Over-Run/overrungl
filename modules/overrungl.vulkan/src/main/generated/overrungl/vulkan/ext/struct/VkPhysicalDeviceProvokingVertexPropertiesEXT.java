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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 provokingVertexModePerPipeline;
///     (uint32_t) VkBool32 transformFeedbackPreservesTriangleFanProvokingVertex;
/// };
/// ```
public final class VkPhysicalDeviceProvokingVertexPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `provokingVertexModePerPipeline`.
    public static final long OFFSET_provokingVertexModePerPipeline = LAYOUT.byteOffset(PathElement.groupElement("provokingVertexModePerPipeline"));
    /// The memory layout of `provokingVertexModePerPipeline`.
    public static final MemoryLayout LAYOUT_provokingVertexModePerPipeline = LAYOUT.select(PathElement.groupElement("provokingVertexModePerPipeline"));
    /// The [VarHandle] of `provokingVertexModePerPipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_provokingVertexModePerPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("provokingVertexModePerPipeline"));
    /// The byte offset of `transformFeedbackPreservesTriangleFanProvokingVertex`.
    public static final long OFFSET_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
    /// The memory layout of `transformFeedbackPreservesTriangleFanProvokingVertex`.
    public static final MemoryLayout LAYOUT_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.select(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));
    /// The [VarHandle] of `transformFeedbackPreservesTriangleFanProvokingVertex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackPreservesTriangleFanProvokingVertex"));

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceProvokingVertexPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceProvokingVertexPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT copyFrom(VkPhysicalDeviceProvokingVertexPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceProvokingVertexPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `provokingVertexModePerPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int provokingVertexModePerPipeline(MemorySegment segment, long index) { return (int) VH_provokingVertexModePerPipeline.get(segment, 0L, index); }
    /// {@return `provokingVertexModePerPipeline`}
    public int provokingVertexModePerPipeline() { return provokingVertexModePerPipeline(this.segment(), 0L); }
    /// Sets `provokingVertexModePerPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void provokingVertexModePerPipeline(MemorySegment segment, long index, int value) { VH_provokingVertexModePerPipeline.set(segment, 0L, index, value); }
    /// Sets `provokingVertexModePerPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipeline(int value) { provokingVertexModePerPipeline(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment, long index) { return (int) VH_transformFeedbackPreservesTriangleFanProvokingVertex.get(segment, 0L, index); }
    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex`}
    public int transformFeedbackPreservesTriangleFanProvokingVertex() { return transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), 0L); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedbackPreservesTriangleFanProvokingVertex(MemorySegment segment, long index, int value) { VH_transformFeedbackPreservesTriangleFanProvokingVertex.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertex(int value) { transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceProvokingVertexPropertiesEXT`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceProvokingVertexPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceProvokingVertexPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT at(long index, Consumer<VkPhysicalDeviceProvokingVertexPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `provokingVertexModePerPipeline` at the given index}
    /// @param index the index of the struct buffer
    public int provokingVertexModePerPipelineAt(long index) { return provokingVertexModePerPipeline(this.segment(), index); }
    /// Sets `provokingVertexModePerPipeline` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT provokingVertexModePerPipelineAt(long index, int value) { provokingVertexModePerPipeline(this.segment(), index, value); return this; }

    /// {@return `transformFeedbackPreservesTriangleFanProvokingVertex` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackPreservesTriangleFanProvokingVertexAt(long index) { return transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), index); }
    /// Sets `transformFeedbackPreservesTriangleFanProvokingVertex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProvokingVertexPropertiesEXT transformFeedbackPreservesTriangleFanProvokingVertexAt(long index, int value) { transformFeedbackPreservesTriangleFanProvokingVertex(this.segment(), index, value); return this; }

}
