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
/// struct VkGeneratedCommandsShaderInfoEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT* pShaders;
/// };
/// ```
public final class VkGeneratedCommandsShaderInfoEXT extends GroupType {
    /// The struct layout of `VkGeneratedCommandsShaderInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pShaders")
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
    /// The byte offset of `shaderCount`.
    public static final long OFFSET_shaderCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
    /// The memory layout of `shaderCount`.
    public static final MemoryLayout LAYOUT_shaderCount = LAYOUT.select(PathElement.groupElement("shaderCount"));
    /// The [VarHandle] of `shaderCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    /// The byte offset of `pShaders`.
    public static final long OFFSET_pShaders = LAYOUT.byteOffset(PathElement.groupElement("pShaders"));
    /// The memory layout of `pShaders`.
    public static final MemoryLayout LAYOUT_pShaders = LAYOUT.select(PathElement.groupElement("pShaders"));
    /// The [VarHandle] of `pShaders` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaders"));

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeneratedCommandsShaderInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsShaderInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsShaderInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeneratedCommandsShaderInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsShaderInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeneratedCommandsShaderInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsShaderInfoEXT`
    public static VkGeneratedCommandsShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsShaderInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeneratedCommandsShaderInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsShaderInfoEXT`
    public static VkGeneratedCommandsShaderInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsShaderInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT copyFrom(VkGeneratedCommandsShaderInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeneratedCommandsShaderInfoEXT reinterpret(long count) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkGeneratedCommandsShaderInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkGeneratedCommandsShaderInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCount(MemorySegment segment, long index) { return (int) VH_shaderCount.get(segment, 0L, index); }
    /// {@return `shaderCount`}
    public int shaderCount() { return shaderCount(this.segment(), 0L); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCount(MemorySegment segment, long index, int value) { VH_shaderCount.set(segment, 0L, index, value); }
    /// Sets `shaderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT shaderCount(int value) { shaderCount(this.segment(), 0L, value); return this; }

    /// {@return `pShaders` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShaders(MemorySegment segment, long index) { return (MemorySegment) VH_pShaders.get(segment, 0L, index); }
    /// {@return `pShaders`}
    public MemorySegment pShaders() { return pShaders(this.segment(), 0L); }
    /// Sets `pShaders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShaders(MemorySegment segment, long index, MemorySegment value) { VH_pShaders.set(segment, 0L, index, value); }
    /// Sets `pShaders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT pShaders(MemorySegment value) { pShaders(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeneratedCommandsShaderInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeneratedCommandsShaderInfoEXT`
    public VkGeneratedCommandsShaderInfoEXT asSlice(long index) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeneratedCommandsShaderInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeneratedCommandsShaderInfoEXT`
    public VkGeneratedCommandsShaderInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeneratedCommandsShaderInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT at(long index, Consumer<VkGeneratedCommandsShaderInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderCount` at the given index}
    /// @param index the index of the struct buffer
    public int shaderCountAt(long index) { return shaderCount(this.segment(), index); }
    /// Sets `shaderCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT shaderCountAt(long index, int value) { shaderCount(this.segment(), index, value); return this; }

    /// {@return `pShaders` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pShadersAt(long index) { return pShaders(this.segment(), index); }
    /// Sets `pShaders` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsShaderInfoEXT pShadersAt(long index, MemorySegment value) { pShaders(this.segment(), index, value); return this; }

}
