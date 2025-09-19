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

/// Represents `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCustomBorderColorFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 customBorderColors;
///     (uint32_t) VkBool32 customBorderColorWithoutFormat;
/// };
/// ```
public final class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("customBorderColors"),
        ValueLayout.JAVA_INT.withName("customBorderColorWithoutFormat")
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
    /// The byte offset of `customBorderColors`.
    public static final long OFFSET_customBorderColors = LAYOUT.byteOffset(PathElement.groupElement("customBorderColors"));
    /// The memory layout of `customBorderColors`.
    public static final MemoryLayout LAYOUT_customBorderColors = LAYOUT.select(PathElement.groupElement("customBorderColors"));
    /// The [VarHandle] of `customBorderColors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_customBorderColors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColors"));
    /// The byte offset of `customBorderColorWithoutFormat`.
    public static final long OFFSET_customBorderColorWithoutFormat = LAYOUT.byteOffset(PathElement.groupElement("customBorderColorWithoutFormat"));
    /// The memory layout of `customBorderColorWithoutFormat`.
    public static final MemoryLayout LAYOUT_customBorderColorWithoutFormat = LAYOUT.select(PathElement.groupElement("customBorderColorWithoutFormat"));
    /// The [VarHandle] of `customBorderColorWithoutFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_customBorderColorWithoutFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customBorderColorWithoutFormat"));

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCustomBorderColorFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT copyFrom(VkPhysicalDeviceCustomBorderColorFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `customBorderColors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int customBorderColors(MemorySegment segment, long index) { return (int) VH_customBorderColors.get(segment, 0L, index); }
    /// {@return `customBorderColors`}
    public int customBorderColors() { return customBorderColors(this.segment(), 0L); }
    /// Sets `customBorderColors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void customBorderColors(MemorySegment segment, long index, int value) { VH_customBorderColors.set(segment, 0L, index, value); }
    /// Sets `customBorderColors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(int value) { customBorderColors(this.segment(), 0L, value); return this; }

    /// {@return `customBorderColorWithoutFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int customBorderColorWithoutFormat(MemorySegment segment, long index) { return (int) VH_customBorderColorWithoutFormat.get(segment, 0L, index); }
    /// {@return `customBorderColorWithoutFormat`}
    public int customBorderColorWithoutFormat() { return customBorderColorWithoutFormat(this.segment(), 0L); }
    /// Sets `customBorderColorWithoutFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void customBorderColorWithoutFormat(MemorySegment segment, long index, int value) { VH_customBorderColorWithoutFormat.set(segment, 0L, index, value); }
    /// Sets `customBorderColorWithoutFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(int value) { customBorderColorWithoutFormat(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCustomBorderColorFeaturesEXT`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCustomBorderColorFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT at(long index, Consumer<VkPhysicalDeviceCustomBorderColorFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `customBorderColors` at the given index}
    /// @param index the index of the struct buffer
    public int customBorderColorsAt(long index) { return customBorderColors(this.segment(), index); }
    /// Sets `customBorderColors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorsAt(long index, int value) { customBorderColors(this.segment(), index, value); return this; }

    /// {@return `customBorderColorWithoutFormat` at the given index}
    /// @param index the index of the struct buffer
    public int customBorderColorWithoutFormatAt(long index) { return customBorderColorWithoutFormat(this.segment(), index); }
    /// Sets `customBorderColorWithoutFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormatAt(long index, int value) { customBorderColorWithoutFormat(this.segment(), index, value); return this; }

}
