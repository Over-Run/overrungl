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
/// struct VkWriteIndirectExecutionSetShaderEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t index;
///     (uint64_t) VkShaderEXT shader;
/// };
/// ```
public final class VkWriteIndirectExecutionSetShaderEXT extends GroupType {
    /// The struct layout of `VkWriteIndirectExecutionSetShaderEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("index"),
        ValueLayout.JAVA_LONG.withName("shader")
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
    /// The byte offset of `index`.
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    /// The memory layout of `index`.
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    /// The [VarHandle] of `index` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));
    /// The byte offset of `shader`.
    public static final long OFFSET_shader = LAYOUT.byteOffset(PathElement.groupElement("shader"));
    /// The memory layout of `shader`.
    public static final MemoryLayout LAYOUT_shader = LAYOUT.select(PathElement.groupElement("shader"));
    /// The [VarHandle] of `shader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shader"));

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWriteIndirectExecutionSetShaderEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWriteIndirectExecutionSetShaderEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteIndirectExecutionSetShaderEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteIndirectExecutionSetShaderEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT alloc(SegmentAllocator allocator, long count) { return new VkWriteIndirectExecutionSetShaderEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param index `index`
    /// @param shader `shader`
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int index, long shader) {
        return alloc(allocator).sType(sType).pNext(pNext).index(index).shader(shader);
    }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param index `index`
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int index) {
        return alloc(allocator).sType(sType).pNext(pNext).index(index);
    }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkWriteIndirectExecutionSetShaderEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkWriteIndirectExecutionSetShaderEXT`
    public static VkWriteIndirectExecutionSetShaderEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT copyFrom(VkWriteIndirectExecutionSetShaderEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWriteIndirectExecutionSetShaderEXT reinterpret(long count) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWriteIndirectExecutionSetShaderEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWriteIndirectExecutionSetShaderEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `index` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int index(MemorySegment segment, long index) { return (int) VH_index.get(segment, 0L, index); }
    /// {@return `index`}
    public int index() { return index(this.segment(), 0L); }
    /// Sets `index` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void index(MemorySegment segment, long index, int value) { VH_index.set(segment, 0L, index, value); }
    /// Sets `index` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT index(int value) { index(this.segment(), 0L, value); return this; }

    /// {@return `shader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long shader(MemorySegment segment, long index) { return (long) VH_shader.get(segment, 0L, index); }
    /// {@return `shader`}
    public long shader() { return shader(this.segment(), 0L); }
    /// Sets `shader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shader(MemorySegment segment, long index, long value) { VH_shader.set(segment, 0L, index, value); }
    /// Sets `shader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT shader(long value) { shader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWriteIndirectExecutionSetShaderEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteIndirectExecutionSetShaderEXT`
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWriteIndirectExecutionSetShaderEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteIndirectExecutionSetShaderEXT`
    public VkWriteIndirectExecutionSetShaderEXT asSlice(long index, long count) { return new VkWriteIndirectExecutionSetShaderEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWriteIndirectExecutionSetShaderEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT at(long index, Consumer<VkWriteIndirectExecutionSetShaderEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `index` at the given index}
    /// @param index the index of the struct buffer
    public int indexAt(long index) { return index(this.segment(), index); }
    /// Sets `index` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT indexAt(long index, int value) { index(this.segment(), index, value); return this; }

    /// {@return `shader` at the given index}
    /// @param index the index of the struct buffer
    public long shaderAt(long index) { return shader(this.segment(), index); }
    /// Sets `shader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteIndirectExecutionSetShaderEXT shaderAt(long index, long value) { shader(this.segment(), index, value); return this; }

}
