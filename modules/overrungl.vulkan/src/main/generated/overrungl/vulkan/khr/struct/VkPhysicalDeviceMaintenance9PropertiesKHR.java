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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance9PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance9PropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 image2DViewOf3DSparse;
///     (int) VkDefaultVertexAttributeValueKHR defaultVertexAttributeValue;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance9PropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance9PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3DSparse"),
        ValueLayout.JAVA_INT.withName("defaultVertexAttributeValue")
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
    /// The byte offset of `image2DViewOf3DSparse`.
    public static final long OFFSET_image2DViewOf3DSparse = LAYOUT.byteOffset(PathElement.groupElement("image2DViewOf3DSparse"));
    /// The memory layout of `image2DViewOf3DSparse`.
    public static final MemoryLayout LAYOUT_image2DViewOf3DSparse = LAYOUT.select(PathElement.groupElement("image2DViewOf3DSparse"));
    /// The [VarHandle] of `image2DViewOf3DSparse` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image2DViewOf3DSparse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image2DViewOf3DSparse"));
    /// The byte offset of `defaultVertexAttributeValue`.
    public static final long OFFSET_defaultVertexAttributeValue = LAYOUT.byteOffset(PathElement.groupElement("defaultVertexAttributeValue"));
    /// The memory layout of `defaultVertexAttributeValue`.
    public static final MemoryLayout LAYOUT_defaultVertexAttributeValue = LAYOUT.select(PathElement.groupElement("defaultVertexAttributeValue"));
    /// The [VarHandle] of `defaultVertexAttributeValue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultVertexAttributeValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultVertexAttributeValue"));

    /// Creates `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance9PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance9PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance9PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance9PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance9PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance9PropertiesKHR`
    public static VkPhysicalDeviceMaintenance9PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance9PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance9PropertiesKHR`
    public static VkPhysicalDeviceMaintenance9PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance9PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance9PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance9PropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `image2DViewOf3DSparse` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int image2DViewOf3DSparse(MemorySegment segment, long index) { return (int) VH_image2DViewOf3DSparse.get(segment, 0L, index); }
    /// {@return `image2DViewOf3DSparse`}
    public int image2DViewOf3DSparse() { return image2DViewOf3DSparse(this.segment(), 0L); }
    /// Sets `image2DViewOf3DSparse` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image2DViewOf3DSparse(MemorySegment segment, long index, int value) { VH_image2DViewOf3DSparse.set(segment, 0L, index, value); }
    /// Sets `image2DViewOf3DSparse` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR image2DViewOf3DSparse(int value) { image2DViewOf3DSparse(this.segment(), 0L, value); return this; }

    /// {@return `defaultVertexAttributeValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultVertexAttributeValue(MemorySegment segment, long index) { return (int) VH_defaultVertexAttributeValue.get(segment, 0L, index); }
    /// {@return `defaultVertexAttributeValue`}
    public int defaultVertexAttributeValue() { return defaultVertexAttributeValue(this.segment(), 0L); }
    /// Sets `defaultVertexAttributeValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultVertexAttributeValue(MemorySegment segment, long index, int value) { VH_defaultVertexAttributeValue.set(segment, 0L, index, value); }
    /// Sets `defaultVertexAttributeValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR defaultVertexAttributeValue(int value) { defaultVertexAttributeValue(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance9PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance9PropertiesKHR`
    public VkPhysicalDeviceMaintenance9PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance9PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance9PropertiesKHR`
    public VkPhysicalDeviceMaintenance9PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance9PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance9PropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance9PropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image2DViewOf3DSparse` at the given index}
    /// @param index the index of the struct buffer
    public int image2DViewOf3DSparseAt(long index) { return image2DViewOf3DSparse(this.segment(), index); }
    /// Sets `image2DViewOf3DSparse` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR image2DViewOf3DSparseAt(long index, int value) { image2DViewOf3DSparse(this.segment(), index, value); return this; }

    /// {@return `defaultVertexAttributeValue` at the given index}
    /// @param index the index of the struct buffer
    public int defaultVertexAttributeValueAt(long index) { return defaultVertexAttributeValue(this.segment(), index); }
    /// Sets `defaultVertexAttributeValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance9PropertiesKHR defaultVertexAttributeValueAt(long index, int value) { defaultVertexAttributeValue(this.segment(), index, value); return this; }

}
