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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMeshShaderFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 taskShader;
///     (uint32_t) VkBool32 meshShader;
/// };
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader")
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

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesNV`
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMeshShaderFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMeshShaderFeaturesNV`
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV copyFrom(VkPhysicalDeviceMeshShaderFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMeshShaderFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMeshShaderFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(int value) { taskShader(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(int value) { meshShader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesNV`
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMeshShaderFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMeshShaderFeaturesNV`
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMeshShaderFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV at(long index, Consumer<VkPhysicalDeviceMeshShaderFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `taskShader` at the given index}
    /// @param index the index of the struct buffer
    public int taskShaderAt(long index) { return taskShader(this.segment(), index); }
    /// Sets `taskShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShaderAt(long index, int value) { taskShader(this.segment(), index, value); return this; }

    /// {@return `meshShader` at the given index}
    /// @param index the index of the struct buffer
    public int meshShaderAt(long index) { return meshShader(this.segment(), index); }
    /// Sets `meshShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShaderAt(long index, int value) { meshShader(this.segment(), index, value); return this; }

}
