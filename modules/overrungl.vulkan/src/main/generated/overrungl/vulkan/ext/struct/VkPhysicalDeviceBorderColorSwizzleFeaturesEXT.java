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

/// Represents `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 borderColorSwizzle;
///     (uint32_t) VkBool32 borderColorSwizzleFromImage;
/// };
/// ```
public final class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzle"),
        ValueLayout.JAVA_INT.withName("borderColorSwizzleFromImage")
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
    /// The byte offset of `borderColorSwizzle`.
    public static final long OFFSET_borderColorSwizzle = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzle"));
    /// The memory layout of `borderColorSwizzle`.
    public static final MemoryLayout LAYOUT_borderColorSwizzle = LAYOUT.select(PathElement.groupElement("borderColorSwizzle"));
    /// The [VarHandle] of `borderColorSwizzle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_borderColorSwizzle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzle"));
    /// The byte offset of `borderColorSwizzleFromImage`.
    public static final long OFFSET_borderColorSwizzleFromImage = LAYOUT.byteOffset(PathElement.groupElement("borderColorSwizzleFromImage"));
    /// The memory layout of `borderColorSwizzleFromImage`.
    public static final MemoryLayout LAYOUT_borderColorSwizzleFromImage = LAYOUT.select(PathElement.groupElement("borderColorSwizzleFromImage"));
    /// The [VarHandle] of `borderColorSwizzleFromImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_borderColorSwizzleFromImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("borderColorSwizzleFromImage"));

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT copyFrom(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `borderColorSwizzle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int borderColorSwizzle(MemorySegment segment, long index) { return (int) VH_borderColorSwizzle.get(segment, 0L, index); }
    /// {@return `borderColorSwizzle`}
    public int borderColorSwizzle() { return borderColorSwizzle(this.segment(), 0L); }
    /// Sets `borderColorSwizzle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void borderColorSwizzle(MemorySegment segment, long index, int value) { VH_borderColorSwizzle.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(int value) { borderColorSwizzle(this.segment(), 0L, value); return this; }

    /// {@return `borderColorSwizzleFromImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int borderColorSwizzleFromImage(MemorySegment segment, long index) { return (int) VH_borderColorSwizzleFromImage.get(segment, 0L, index); }
    /// {@return `borderColorSwizzleFromImage`}
    public int borderColorSwizzleFromImage() { return borderColorSwizzleFromImage(this.segment(), 0L); }
    /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void borderColorSwizzleFromImage(MemorySegment segment, long index, int value) { VH_borderColorSwizzleFromImage.set(segment, 0L, index, value); }
    /// Sets `borderColorSwizzleFromImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(int value) { borderColorSwizzleFromImage(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceBorderColorSwizzleFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT at(long index, Consumer<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `borderColorSwizzle` at the given index}
    /// @param index the index of the struct buffer
    public int borderColorSwizzleAt(long index) { return borderColorSwizzle(this.segment(), index); }
    /// Sets `borderColorSwizzle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleAt(long index, int value) { borderColorSwizzle(this.segment(), index, value); return this; }

    /// {@return `borderColorSwizzleFromImage` at the given index}
    /// @param index the index of the struct buffer
    public int borderColorSwizzleFromImageAt(long index) { return borderColorSwizzleFromImage(this.segment(), index); }
    /// Sets `borderColorSwizzleFromImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImageAt(long index, int value) { borderColorSwizzleFromImage(this.segment(), index, value); return this; }

}
