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
/// struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 fragmentShaderSampleInterlock;
///     (uint32_t) VkBool32 fragmentShaderPixelInterlock;
///     (uint32_t) VkBool32 fragmentShaderShadingRateInterlock;
/// };
/// ```
public sealed class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
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
    /// The byte offset of `fragmentShaderSampleInterlock`.
    public static final long OFFSET_fragmentShaderSampleInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderSampleInterlock"));
    /// The memory layout of `fragmentShaderSampleInterlock`.
    public static final MemoryLayout LAYOUT_fragmentShaderSampleInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderSampleInterlock"));
    /// The [VarHandle] of `fragmentShaderSampleInterlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShaderSampleInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderSampleInterlock"));
    /// The byte offset of `fragmentShaderPixelInterlock`.
    public static final long OFFSET_fragmentShaderPixelInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderPixelInterlock"));
    /// The memory layout of `fragmentShaderPixelInterlock`.
    public static final MemoryLayout LAYOUT_fragmentShaderPixelInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderPixelInterlock"));
    /// The [VarHandle] of `fragmentShaderPixelInterlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShaderPixelInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderPixelInterlock"));
    /// The byte offset of `fragmentShaderShadingRateInterlock`.
    public static final long OFFSET_fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
    /// The memory layout of `fragmentShaderShadingRateInterlock`.
    public static final MemoryLayout LAYOUT_fragmentShaderShadingRateInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
    /// The [VarHandle] of `fragmentShaderShadingRateInterlock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShaderShadingRateInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderShadingRateInterlock"));

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param fragmentShaderSampleInterlock `fragmentShaderSampleInterlock`
    /// @param fragmentShaderPixelInterlock `fragmentShaderPixelInterlock`
    /// @param fragmentShaderShadingRateInterlock `fragmentShaderShadingRateInterlock`
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int fragmentShaderSampleInterlock, int fragmentShaderPixelInterlock, int fragmentShaderShadingRateInterlock) {
        return alloc(allocator).sType(sType).pNext(pNext).fragmentShaderSampleInterlock(fragmentShaderSampleInterlock).fragmentShaderPixelInterlock(fragmentShaderPixelInterlock).fragmentShaderShadingRateInterlock(fragmentShaderShadingRateInterlock);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param fragmentShaderSampleInterlock `fragmentShaderSampleInterlock`
    /// @param fragmentShaderPixelInterlock `fragmentShaderPixelInterlock`
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int fragmentShaderSampleInterlock, int fragmentShaderPixelInterlock) {
        return alloc(allocator).sType(sType).pNext(pNext).fragmentShaderSampleInterlock(fragmentShaderSampleInterlock).fragmentShaderPixelInterlock(fragmentShaderPixelInterlock);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param fragmentShaderSampleInterlock `fragmentShaderSampleInterlock`
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int fragmentShaderSampleInterlock) {
        return alloc(allocator).sType(sType).pNext(pNext).fragmentShaderSampleInterlock(fragmentShaderSampleInterlock);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT copyFrom(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShaderSampleInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShaderSampleInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderSampleInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderSampleInterlock`}
    public int fragmentShaderSampleInterlock() { return fragmentShaderSampleInterlock(this.segment(), 0L); }
    /// Sets `fragmentShaderSampleInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShaderSampleInterlock(MemorySegment segment, long index, int value) { VH_fragmentShaderSampleInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderSampleInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(int value) { fragmentShaderSampleInterlock(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShaderPixelInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShaderPixelInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderPixelInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderPixelInterlock`}
    public int fragmentShaderPixelInterlock() { return fragmentShaderPixelInterlock(this.segment(), 0L); }
    /// Sets `fragmentShaderPixelInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShaderPixelInterlock(MemorySegment segment, long index, int value) { VH_fragmentShaderPixelInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderPixelInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(int value) { fragmentShaderPixelInterlock(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShaderShadingRateInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShaderShadingRateInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderShadingRateInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderShadingRateInterlock`}
    public int fragmentShaderShadingRateInterlock() { return fragmentShaderShadingRateInterlock(this.segment(), 0L); }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShaderShadingRateInterlock(MemorySegment segment, long index, int value) { VH_fragmentShaderShadingRateInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(int value) { fragmentShaderShadingRateInterlock(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
        public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
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

        /// {@return `fragmentShaderSampleInterlock` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentShaderSampleInterlockAt(long index) { return fragmentShaderSampleInterlock(this.segment(), index); }
        /// Sets `fragmentShaderSampleInterlock` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShaderSampleInterlockAt(long index, int value) { fragmentShaderSampleInterlock(this.segment(), index, value); return this; }

        /// {@return `fragmentShaderPixelInterlock` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentShaderPixelInterlockAt(long index) { return fragmentShaderPixelInterlock(this.segment(), index); }
        /// Sets `fragmentShaderPixelInterlock` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShaderPixelInterlockAt(long index, int value) { fragmentShaderPixelInterlock(this.segment(), index, value); return this; }

        /// {@return `fragmentShaderShadingRateInterlock` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentShaderShadingRateInterlockAt(long index) { return fragmentShaderShadingRateInterlock(this.segment(), index); }
        /// Sets `fragmentShaderShadingRateInterlock` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShaderShadingRateInterlockAt(long index, int value) { fragmentShaderShadingRateInterlock(this.segment(), index, value); return this; }

    }
}
