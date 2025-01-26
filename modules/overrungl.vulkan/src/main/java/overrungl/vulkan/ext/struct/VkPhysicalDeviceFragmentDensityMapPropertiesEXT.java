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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D minFragmentDensityTexelSize;
///     VkExtent2D maxFragmentDensityTexelSize;
///     VkBool32 fragmentDensityInvocations;
/// };
/// ```
public sealed class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
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
    /// The byte offset of `minFragmentDensityTexelSize`.
    public static final long OFFSET_minFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The memory layout of `minFragmentDensityTexelSize`.
    public static final MemoryLayout LAYOUT_minFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The byte offset of `maxFragmentDensityTexelSize`.
    public static final long OFFSET_maxFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The memory layout of `maxFragmentDensityTexelSize`.
    public static final MemoryLayout LAYOUT_maxFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The byte offset of `fragmentDensityInvocations`.
    public static final long OFFSET_fragmentDensityInvocations = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityInvocations"));
    /// The memory layout of `fragmentDensityInvocations`.
    public static final MemoryLayout LAYOUT_fragmentDensityInvocations = LAYOUT.select(PathElement.groupElement("fragmentDensityInvocations"));
    /// The [VarHandle] of `fragmentDensityInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityInvocations"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), LAYOUT_minFragmentDensityTexelSize); }
    /// {@return `minFragmentDensityTexelSize`}
    public MemorySegment minFragmentDensityTexelSize() { return minFragmentDensityTexelSize(this.segment(), 0L); }
    /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minFragmentDensityTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), LAYOUT_minFragmentDensityTexelSize.byteSize()); }
    /// Sets `minFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(MemorySegment value) { minFragmentDensityTexelSize(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), LAYOUT_maxFragmentDensityTexelSize); }
    /// {@return `maxFragmentDensityTexelSize`}
    public MemorySegment maxFragmentDensityTexelSize() { return maxFragmentDensityTexelSize(this.segment(), 0L); }
    /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentDensityTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), LAYOUT_maxFragmentDensityTexelSize.byteSize()); }
    /// Sets `maxFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(MemorySegment value) { maxFragmentDensityTexelSize(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityInvocations(MemorySegment segment, long index) { return (int) VH_fragmentDensityInvocations.get(segment, 0L, index); }
    /// {@return `fragmentDensityInvocations`}
    public int fragmentDensityInvocations() { return fragmentDensityInvocations(this.segment(), 0L); }
    /// Sets `fragmentDensityInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityInvocations(MemorySegment segment, long index, int value) { VH_fragmentDensityInvocations.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocations(int value) { fragmentDensityInvocations(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentDensityMapPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
        public VkPhysicalDeviceFragmentDensityMapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `minFragmentDensityTexelSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment minFragmentDensityTexelSizeAt(long index) { return minFragmentDensityTexelSize(this.segment(), index); }
        /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minFragmentDensityTexelSizeAt(long index, MemorySegment value) { minFragmentDensityTexelSize(this.segment(), index, value); return this; }

        /// {@return `maxFragmentDensityTexelSize` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxFragmentDensityTexelSizeAt(long index) { return maxFragmentDensityTexelSize(this.segment(), index); }
        /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentDensityTexelSizeAt(long index, MemorySegment value) { maxFragmentDensityTexelSize(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityInvocations` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentDensityInvocationsAt(long index) { return fragmentDensityInvocations(this.segment(), index); }
        /// Sets `fragmentDensityInvocations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityInvocationsAt(long index, int value) { fragmentDensityInvocations(this.segment(), index, value); return this; }

    }
}
