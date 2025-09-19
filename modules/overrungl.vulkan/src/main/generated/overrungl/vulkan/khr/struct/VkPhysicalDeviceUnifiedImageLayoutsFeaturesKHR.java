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

/// Represents `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 unifiedImageLayouts;
///     (uint32_t) VkBool32 unifiedImageLayoutsVideo;
/// };
/// ```
public final class VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unifiedImageLayouts"),
        ValueLayout.JAVA_INT.withName("unifiedImageLayoutsVideo")
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
    /// The byte offset of `unifiedImageLayouts`.
    public static final long OFFSET_unifiedImageLayouts = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayouts"));
    /// The memory layout of `unifiedImageLayouts`.
    public static final MemoryLayout LAYOUT_unifiedImageLayouts = LAYOUT.select(PathElement.groupElement("unifiedImageLayouts"));
    /// The [VarHandle] of `unifiedImageLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_unifiedImageLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unifiedImageLayouts"));
    /// The byte offset of `unifiedImageLayoutsVideo`.
    public static final long OFFSET_unifiedImageLayoutsVideo = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayoutsVideo"));
    /// The memory layout of `unifiedImageLayoutsVideo`.
    public static final MemoryLayout LAYOUT_unifiedImageLayoutsVideo = LAYOUT.select(PathElement.groupElement("unifiedImageLayoutsVideo"));
    /// The [VarHandle] of `unifiedImageLayoutsVideo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_unifiedImageLayoutsVideo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unifiedImageLayoutsVideo"));

    /// Creates `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`
    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR copyFrom(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `unifiedImageLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unifiedImageLayouts(MemorySegment segment, long index) { return (int) VH_unifiedImageLayouts.get(segment, 0L, index); }
    /// {@return `unifiedImageLayouts`}
    public int unifiedImageLayouts() { return unifiedImageLayouts(this.segment(), 0L); }
    /// Sets `unifiedImageLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unifiedImageLayouts(MemorySegment segment, long index, int value) { VH_unifiedImageLayouts.set(segment, 0L, index, value); }
    /// Sets `unifiedImageLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayouts(int value) { unifiedImageLayouts(this.segment(), 0L, value); return this; }

    /// {@return `unifiedImageLayoutsVideo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unifiedImageLayoutsVideo(MemorySegment segment, long index) { return (int) VH_unifiedImageLayoutsVideo.get(segment, 0L, index); }
    /// {@return `unifiedImageLayoutsVideo`}
    public int unifiedImageLayoutsVideo() { return unifiedImageLayoutsVideo(this.segment(), 0L); }
    /// Sets `unifiedImageLayoutsVideo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unifiedImageLayoutsVideo(MemorySegment segment, long index, int value) { VH_unifiedImageLayoutsVideo.set(segment, 0L, index, value); }
    /// Sets `unifiedImageLayoutsVideo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideo(int value) { unifiedImageLayoutsVideo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR at(long index, Consumer<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `unifiedImageLayouts` at the given index}
    /// @param index the index of the struct buffer
    public int unifiedImageLayoutsAt(long index) { return unifiedImageLayouts(this.segment(), index); }
    /// Sets `unifiedImageLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsAt(long index, int value) { unifiedImageLayouts(this.segment(), index, value); return this; }

    /// {@return `unifiedImageLayoutsVideo` at the given index}
    /// @param index the index of the struct buffer
    public int unifiedImageLayoutsVideoAt(long index) { return unifiedImageLayoutsVideo(this.segment(), index); }
    /// Sets `unifiedImageLayoutsVideo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideoAt(long index, int value) { unifiedImageLayoutsVideo(this.segment(), index, value); return this; }

}
