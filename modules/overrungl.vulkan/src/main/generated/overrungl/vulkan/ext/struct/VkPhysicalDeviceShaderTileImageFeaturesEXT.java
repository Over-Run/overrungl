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
/// struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderTileImageColorReadAccess;
///     (uint32_t) VkBool32 shaderTileImageDepthReadAccess;
///     (uint32_t) VkBool32 shaderTileImageStencilReadAccess;
/// };
/// ```
public final class VkPhysicalDeviceShaderTileImageFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderTileImageFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
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
    /// The byte offset of `shaderTileImageColorReadAccess`.
    public static final long OFFSET_shaderTileImageColorReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageColorReadAccess"));
    /// The memory layout of `shaderTileImageColorReadAccess`.
    public static final MemoryLayout LAYOUT_shaderTileImageColorReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageColorReadAccess"));
    /// The [VarHandle] of `shaderTileImageColorReadAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageColorReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageColorReadAccess"));
    /// The byte offset of `shaderTileImageDepthReadAccess`.
    public static final long OFFSET_shaderTileImageDepthReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    /// The memory layout of `shaderTileImageDepthReadAccess`.
    public static final MemoryLayout LAYOUT_shaderTileImageDepthReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    /// The [VarHandle] of `shaderTileImageDepthReadAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageDepthReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    /// The byte offset of `shaderTileImageStencilReadAccess`.
    public static final long OFFSET_shaderTileImageStencilReadAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageStencilReadAccess"));
    /// The memory layout of `shaderTileImageStencilReadAccess`.
    public static final MemoryLayout LAYOUT_shaderTileImageStencilReadAccess = LAYOUT.select(PathElement.groupElement("shaderTileImageStencilReadAccess"));
    /// The [VarHandle] of `shaderTileImageStencilReadAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageStencilReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageStencilReadAccess"));

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT copyFrom(VkPhysicalDeviceShaderTileImageFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderTileImageFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageColorReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageColorReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageColorReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageColorReadAccess`}
    public int shaderTileImageColorReadAccess() { return shaderTileImageColorReadAccess(this.segment(), 0L); }
    /// Sets `shaderTileImageColorReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageColorReadAccess(MemorySegment segment, long index, int value) { VH_shaderTileImageColorReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageColorReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(int value) { shaderTileImageColorReadAccess(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageDepthReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageDepthReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageDepthReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageDepthReadAccess`}
    public int shaderTileImageDepthReadAccess() { return shaderTileImageDepthReadAccess(this.segment(), 0L); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageDepthReadAccess(MemorySegment segment, long index, int value) { VH_shaderTileImageDepthReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(int value) { shaderTileImageDepthReadAccess(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageStencilReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageStencilReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageStencilReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageStencilReadAccess`}
    public int shaderTileImageStencilReadAccess() { return shaderTileImageStencilReadAccess(this.segment(), 0L); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageStencilReadAccess(MemorySegment segment, long index, int value) { VH_shaderTileImageStencilReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(int value) { shaderTileImageStencilReadAccess(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderTileImageFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderTileImageFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderTileImageFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderTileImageFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderTileImageColorReadAccess` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTileImageColorReadAccessAt(long index) { return shaderTileImageColorReadAccess(this.segment(), index); }
    /// Sets `shaderTileImageColorReadAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccessAt(long index, int value) { shaderTileImageColorReadAccess(this.segment(), index, value); return this; }

    /// {@return `shaderTileImageDepthReadAccess` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTileImageDepthReadAccessAt(long index) { return shaderTileImageDepthReadAccess(this.segment(), index); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccessAt(long index, int value) { shaderTileImageDepthReadAccess(this.segment(), index, value); return this; }

    /// {@return `shaderTileImageStencilReadAccess` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTileImageStencilReadAccessAt(long index) { return shaderTileImageStencilReadAccess(this.segment(), index); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccessAt(long index, int value) { shaderTileImageStencilReadAccess(this.segment(), index, value); return this; }

}
