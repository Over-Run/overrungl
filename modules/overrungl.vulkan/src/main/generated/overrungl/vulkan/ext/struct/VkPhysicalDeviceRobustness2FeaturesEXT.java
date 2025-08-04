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
/// struct VkPhysicalDeviceRobustness2FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 robustBufferAccess2;
///     (uint32_t) VkBool32 robustImageAccess2;
///     (uint32_t) VkBool32 nullDescriptor;
/// };
/// ```
public final class VkPhysicalDeviceRobustness2FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRobustness2FeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
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
    /// The byte offset of `robustBufferAccess2`.
    public static final long OFFSET_robustBufferAccess2 = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess2"));
    /// The memory layout of `robustBufferAccess2`.
    public static final MemoryLayout LAYOUT_robustBufferAccess2 = LAYOUT.select(PathElement.groupElement("robustBufferAccess2"));
    /// The [VarHandle] of `robustBufferAccess2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustBufferAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustBufferAccess2"));
    /// The byte offset of `robustImageAccess2`.
    public static final long OFFSET_robustImageAccess2 = LAYOUT.byteOffset(PathElement.groupElement("robustImageAccess2"));
    /// The memory layout of `robustImageAccess2`.
    public static final MemoryLayout LAYOUT_robustImageAccess2 = LAYOUT.select(PathElement.groupElement("robustImageAccess2"));
    /// The [VarHandle] of `robustImageAccess2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustImageAccess2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustImageAccess2"));
    /// The byte offset of `nullDescriptor`.
    public static final long OFFSET_nullDescriptor = LAYOUT.byteOffset(PathElement.groupElement("nullDescriptor"));
    /// The memory layout of `nullDescriptor`.
    public static final MemoryLayout LAYOUT_nullDescriptor = LAYOUT.select(PathElement.groupElement("nullDescriptor"));
    /// The [VarHandle] of `nullDescriptor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nullDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nullDescriptor"));

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRobustness2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2FeaturesEXT`
    public static VkPhysicalDeviceRobustness2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRobustness2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRobustness2FeaturesEXT`
    public static VkPhysicalDeviceRobustness2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT copyFrom(VkPhysicalDeviceRobustness2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRobustness2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRobustness2FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `robustBufferAccess2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustBufferAccess2(MemorySegment segment, long index) { return (int) VH_robustBufferAccess2.get(segment, 0L, index); }
    /// {@return `robustBufferAccess2`}
    public int robustBufferAccess2() { return robustBufferAccess2(this.segment(), 0L); }
    /// Sets `robustBufferAccess2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustBufferAccess2(MemorySegment segment, long index, int value) { VH_robustBufferAccess2.set(segment, 0L, index, value); }
    /// Sets `robustBufferAccess2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(int value) { robustBufferAccess2(this.segment(), 0L, value); return this; }

    /// {@return `robustImageAccess2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustImageAccess2(MemorySegment segment, long index) { return (int) VH_robustImageAccess2.get(segment, 0L, index); }
    /// {@return `robustImageAccess2`}
    public int robustImageAccess2() { return robustImageAccess2(this.segment(), 0L); }
    /// Sets `robustImageAccess2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustImageAccess2(MemorySegment segment, long index, int value) { VH_robustImageAccess2.set(segment, 0L, index, value); }
    /// Sets `robustImageAccess2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(int value) { robustImageAccess2(this.segment(), 0L, value); return this; }

    /// {@return `nullDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nullDescriptor(MemorySegment segment, long index) { return (int) VH_nullDescriptor.get(segment, 0L, index); }
    /// {@return `nullDescriptor`}
    public int nullDescriptor() { return nullDescriptor(this.segment(), 0L); }
    /// Sets `nullDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nullDescriptor(MemorySegment segment, long index, int value) { VH_nullDescriptor.set(segment, 0L, index, value); }
    /// Sets `nullDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(int value) { nullDescriptor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRobustness2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRobustness2FeaturesEXT`
    public VkPhysicalDeviceRobustness2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRobustness2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRobustness2FeaturesEXT`
    public VkPhysicalDeviceRobustness2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceRobustness2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRobustness2FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceRobustness2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `robustBufferAccess2` at the given index}
    /// @param index the index of the struct buffer
    public int robustBufferAccess2At(long index) { return robustBufferAccess2(this.segment(), index); }
    /// Sets `robustBufferAccess2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2At(long index, int value) { robustBufferAccess2(this.segment(), index, value); return this; }

    /// {@return `robustImageAccess2` at the given index}
    /// @param index the index of the struct buffer
    public int robustImageAccess2At(long index) { return robustImageAccess2(this.segment(), index); }
    /// Sets `robustImageAccess2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2At(long index, int value) { robustImageAccess2(this.segment(), index, value); return this; }

    /// {@return `nullDescriptor` at the given index}
    /// @param index the index of the struct buffer
    public int nullDescriptorAt(long index) { return nullDescriptor(this.segment(), index); }
    /// Sets `nullDescriptor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptorAt(long index, int value) { nullDescriptor(this.segment(), index, value); return this; }

}
