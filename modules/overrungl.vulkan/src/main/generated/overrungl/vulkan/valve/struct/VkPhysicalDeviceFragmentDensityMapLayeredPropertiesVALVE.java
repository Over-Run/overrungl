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
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxFragmentDensityMapLayers;
/// };
/// ```
public final class VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxFragmentDensityMapLayers")
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
    /// The byte offset of `maxFragmentDensityMapLayers`.
    public static final long OFFSET_maxFragmentDensityMapLayers = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityMapLayers"));
    /// The memory layout of `maxFragmentDensityMapLayers`.
    public static final MemoryLayout LAYOUT_maxFragmentDensityMapLayers = LAYOUT.select(PathElement.groupElement("maxFragmentDensityMapLayers"));
    /// The [VarHandle] of `maxFragmentDensityMapLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxFragmentDensityMapLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDensityMapLayers"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`
    public static VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`
    public static VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE copyFrom(VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentDensityMapLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentDensityMapLayers(MemorySegment segment, long index) { return (int) VH_maxFragmentDensityMapLayers.get(segment, 0L, index); }
    /// {@return `maxFragmentDensityMapLayers`}
    public int maxFragmentDensityMapLayers() { return maxFragmentDensityMapLayers(this.segment(), 0L); }
    /// Sets `maxFragmentDensityMapLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentDensityMapLayers(MemorySegment segment, long index, int value) { VH_maxFragmentDensityMapLayers.set(segment, 0L, index, value); }
    /// Sets `maxFragmentDensityMapLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE maxFragmentDensityMapLayers(int value) { maxFragmentDensityMapLayers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxFragmentDensityMapLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentDensityMapLayersAt(long index) { return maxFragmentDensityMapLayers(this.segment(), index); }
    /// Sets `maxFragmentDensityMapLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredPropertiesVALVE maxFragmentDensityMapLayersAt(long index, int value) { maxFragmentDensityMapLayers(this.segment(), index, value); return this; }

}
