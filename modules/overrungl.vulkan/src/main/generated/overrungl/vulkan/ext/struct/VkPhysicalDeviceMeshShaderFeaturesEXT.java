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
/// struct VkPhysicalDeviceMeshShaderFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 taskShader;
///     (uint32_t) VkBool32 meshShader;
///     (uint32_t) VkBool32 multiviewMeshShader;
///     (uint32_t) VkBool32 primitiveFragmentShadingRateMeshShader;
///     (uint32_t) VkBool32 meshShaderQueries;
/// };
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMeshShaderFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader"),
        ValueLayout.JAVA_INT.withName("multiviewMeshShader"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
        ValueLayout.JAVA_INT.withName("meshShaderQueries")
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
    /// The byte offset of `taskShader`.
    public static final long OFFSET_taskShader = LAYOUT.byteOffset(PathElement.groupElement("taskShader"));
    /// The memory layout of `taskShader`.
    public static final MemoryLayout LAYOUT_taskShader = LAYOUT.select(PathElement.groupElement("taskShader"));
    /// The [VarHandle] of `taskShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_taskShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskShader"));
    /// The byte offset of `meshShader`.
    public static final long OFFSET_meshShader = LAYOUT.byteOffset(PathElement.groupElement("meshShader"));
    /// The memory layout of `meshShader`.
    public static final MemoryLayout LAYOUT_meshShader = LAYOUT.select(PathElement.groupElement("meshShader"));
    /// The [VarHandle] of `meshShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_meshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShader"));
    /// The byte offset of `multiviewMeshShader`.
    public static final long OFFSET_multiviewMeshShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewMeshShader"));
    /// The memory layout of `multiviewMeshShader`.
    public static final MemoryLayout LAYOUT_multiviewMeshShader = LAYOUT.select(PathElement.groupElement("multiviewMeshShader"));
    /// The [VarHandle] of `multiviewMeshShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_multiviewMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewMeshShader"));
    /// The byte offset of `primitiveFragmentShadingRateMeshShader`.
    public static final long OFFSET_primitiveFragmentShadingRateMeshShader = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    /// The memory layout of `primitiveFragmentShadingRateMeshShader`.
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRateMeshShader = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    /// The [VarHandle] of `primitiveFragmentShadingRateMeshShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveFragmentShadingRateMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    /// The byte offset of `meshShaderQueries`.
    public static final long OFFSET_meshShaderQueries = LAYOUT.byteOffset(PathElement.groupElement("meshShaderQueries"));
    /// The memory layout of `meshShaderQueries`.
    public static final MemoryLayout LAYOUT_meshShaderQueries = LAYOUT.select(PathElement.groupElement("meshShaderQueries"));
    /// The [VarHandle] of `meshShaderQueries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_meshShaderQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShaderQueries"));

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT copyFrom(VkPhysicalDeviceMeshShaderFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMeshShaderFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `taskShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int taskShader(MemorySegment segment, long index) { return (int) VH_taskShader.get(segment, 0L, index); }
    /// {@return `taskShader`}
    public int taskShader() { return taskShader(this.segment(), 0L); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void taskShader(MemorySegment segment, long index, int value) { VH_taskShader.set(segment, 0L, index, value); }
    /// Sets `taskShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(int value) { taskShader(this.segment(), 0L, value); return this; }

    /// {@return `meshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int meshShader(MemorySegment segment, long index) { return (int) VH_meshShader.get(segment, 0L, index); }
    /// {@return `meshShader`}
    public int meshShader() { return meshShader(this.segment(), 0L); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void meshShader(MemorySegment segment, long index, int value) { VH_meshShader.set(segment, 0L, index, value); }
    /// Sets `meshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(int value) { meshShader(this.segment(), 0L, value); return this; }

    /// {@return `multiviewMeshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int multiviewMeshShader(MemorySegment segment, long index) { return (int) VH_multiviewMeshShader.get(segment, 0L, index); }
    /// {@return `multiviewMeshShader`}
    public int multiviewMeshShader() { return multiviewMeshShader(this.segment(), 0L); }
    /// Sets `multiviewMeshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void multiviewMeshShader(MemorySegment segment, long index, int value) { VH_multiviewMeshShader.set(segment, 0L, index, value); }
    /// Sets `multiviewMeshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(int value) { multiviewMeshShader(this.segment(), 0L, value); return this; }

    /// {@return `primitiveFragmentShadingRateMeshShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveFragmentShadingRateMeshShader(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRateMeshShader.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRateMeshShader`}
    public int primitiveFragmentShadingRateMeshShader() { return primitiveFragmentShadingRateMeshShader(this.segment(), 0L); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveFragmentShadingRateMeshShader(MemorySegment segment, long index, int value) { VH_primitiveFragmentShadingRateMeshShader.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(int value) { primitiveFragmentShadingRateMeshShader(this.segment(), 0L, value); return this; }

    /// {@return `meshShaderQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int meshShaderQueries(MemorySegment segment, long index) { return (int) VH_meshShaderQueries.get(segment, 0L, index); }
    /// {@return `meshShaderQueries`}
    public int meshShaderQueries() { return meshShaderQueries(this.segment(), 0L); }
    /// Sets `meshShaderQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void meshShaderQueries(MemorySegment segment, long index, int value) { VH_meshShaderQueries.set(segment, 0L, index, value); }
    /// Sets `meshShaderQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(int value) { meshShaderQueries(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public VkPhysicalDeviceMeshShaderFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesEXT`
    public VkPhysicalDeviceMeshShaderFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMeshShaderFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMeshShaderFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `taskShader` at the given index}
    /// @param index the index of the struct buffer
    public int taskShaderAt(long index) { return taskShader(this.segment(), index); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShaderAt(long index, int value) { taskShader(this.segment(), index, value); return this; }

    /// {@return `meshShader` at the given index}
    /// @param index the index of the struct buffer
    public int meshShaderAt(long index) { return meshShader(this.segment(), index); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderAt(long index, int value) { meshShader(this.segment(), index, value); return this; }

    /// {@return `multiviewMeshShader` at the given index}
    /// @param index the index of the struct buffer
    public int multiviewMeshShaderAt(long index) { return multiviewMeshShader(this.segment(), index); }
    /// Sets `multiviewMeshShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShaderAt(long index, int value) { multiviewMeshShader(this.segment(), index, value); return this; }

    /// {@return `primitiveFragmentShadingRateMeshShader` at the given index}
    /// @param index the index of the struct buffer
    public int primitiveFragmentShadingRateMeshShaderAt(long index) { return primitiveFragmentShadingRateMeshShader(this.segment(), index); }
    /// Sets `primitiveFragmentShadingRateMeshShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShaderAt(long index, int value) { primitiveFragmentShadingRateMeshShader(this.segment(), index, value); return this; }

    /// {@return `meshShaderQueries` at the given index}
    /// @param index the index of the struct buffer
    public int meshShaderQueriesAt(long index) { return meshShaderQueries(this.segment(), index); }
    /// Sets `meshShaderQueries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueriesAt(long index, int value) { meshShaderQueries(this.segment(), index, value); return this; }

}
