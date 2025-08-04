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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rasterizationOrderColorAttachmentAccess;
///     (uint32_t) VkBool32 rasterizationOrderDepthAttachmentAccess;
///     (uint32_t) VkBool32 rasterizationOrderStencilAttachmentAccess;
/// };
/// ```
public final class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
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
    /// The byte offset of `rasterizationOrderColorAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderColorAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The memory layout of `rasterizationOrderColorAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderColorAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderColorAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderColorAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The byte offset of `rasterizationOrderDepthAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderDepthAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The memory layout of `rasterizationOrderDepthAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderDepthAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderDepthAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderDepthAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The byte offset of `rasterizationOrderStencilAttachmentAccess`.
    public static final long OFFSET_rasterizationOrderStencilAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    /// The memory layout of `rasterizationOrderStencilAttachmentAccess`.
    public static final MemoryLayout LAYOUT_rasterizationOrderStencilAttachmentAccess = LAYOUT.select(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderStencilAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rasterizationOrderStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM copyFrom(VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderColorAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderColorAttachmentAccess`}
    public int rasterizationOrderColorAttachmentAccess() { return rasterizationOrderColorAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderColorAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccess(int value) { rasterizationOrderColorAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderDepthAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderDepthAttachmentAccess`}
    public int rasterizationOrderDepthAttachmentAccess() { return rasterizationOrderDepthAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderDepthAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccess(int value) { rasterizationOrderDepthAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderStencilAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderStencilAttachmentAccess`}
    public int rasterizationOrderStencilAttachmentAccess() { return rasterizationOrderStencilAttachmentAccess(this.segment(), 0L); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index, int value) { VH_rasterizationOrderStencilAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccess(int value) { rasterizationOrderStencilAttachmentAccess(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM asSlice(long index) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM at(long index, Consumer<VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
    /// @param index the index of the struct buffer
    public int rasterizationOrderColorAttachmentAccessAt(long index) { return rasterizationOrderColorAttachmentAccess(this.segment(), index); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderColorAttachmentAccessAt(long index, int value) { rasterizationOrderColorAttachmentAccess(this.segment(), index, value); return this; }

    /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
    /// @param index the index of the struct buffer
    public int rasterizationOrderDepthAttachmentAccessAt(long index) { return rasterizationOrderDepthAttachmentAccess(this.segment(), index); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderDepthAttachmentAccessAt(long index, int value) { rasterizationOrderDepthAttachmentAccess(this.segment(), index, value); return this; }

    /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
    /// @param index the index of the struct buffer
    public int rasterizationOrderStencilAttachmentAccessAt(long index) { return rasterizationOrderStencilAttachmentAccess(this.segment(), index); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM rasterizationOrderStencilAttachmentAccessAt(long index, int value) { rasterizationOrderStencilAttachmentAccess(this.segment(), index, value); return this; }

}
