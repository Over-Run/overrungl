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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t drmFormatModifier;
///     (int) VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
/// };
/// ```
public final class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
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
    /// The byte offset of `drmFormatModifier`.
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    /// The memory layout of `drmFormatModifier`.
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    /// The byte offset of `sharingMode`.
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    /// The memory layout of `sharingMode`.
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    /// The [VarHandle] of `sharingMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    /// The byte offset of `queueFamilyIndexCount`.
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    /// The memory layout of `queueFamilyIndexCount`.
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The byte offset of `pQueueFamilyIndices`.
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    /// The memory layout of `pQueueFamilyIndices`.
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT copyFrom(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT reinterpret(long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    public long drmFormatModifier() { return drmFormatModifier(this.segment(), 0L); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifier(MemorySegment segment, long index, long value) { VH_drmFormatModifier.set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(long value) { drmFormatModifier(this.segment(), 0L, value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sharingMode(MemorySegment segment, long index) { return (int) VH_sharingMode.get(segment, 0L, index); }
    /// {@return `sharingMode`}
    public int sharingMode() { return sharingMode(this.segment(), 0L); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sharingMode(MemorySegment segment, long index, int value) { VH_sharingMode.set(segment, 0L, index, value); }
    /// Sets `sharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(int value) { sharingMode(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    public int queueFamilyIndexCount() { return queueFamilyIndexCount(this.segment(), 0L); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndexCount(MemorySegment segment, long index, int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(int value) { queueFamilyIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueueFamilyIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    public MemorySegment pQueueFamilyIndices() { return pQueueFamilyIndices(this.segment(), 0L); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueueFamilyIndices(MemorySegment segment, long index, MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(MemorySegment value) { pQueueFamilyIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT asSlice(long index) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageDrmFormatModifierInfoEXT`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageDrmFormatModifierInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT at(long index, Consumer<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param index the index of the struct buffer
    public long drmFormatModifierAt(long index) { return drmFormatModifier(this.segment(), index); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifierAt(long index, long value) { drmFormatModifier(this.segment(), index, value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param index the index of the struct buffer
    public int sharingModeAt(long index) { return sharingMode(this.segment(), index); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingModeAt(long index, int value) { sharingMode(this.segment(), index, value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int queueFamilyIndexCountAt(long index) { return queueFamilyIndexCount(this.segment(), index); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCountAt(long index, int value) { queueFamilyIndexCount(this.segment(), index, value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pQueueFamilyIndicesAt(long index) { return pQueueFamilyIndices(this.segment(), index); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndicesAt(long index, MemorySegment value) { pQueueFamilyIndices(this.segment(), index, value); return this; }

}
