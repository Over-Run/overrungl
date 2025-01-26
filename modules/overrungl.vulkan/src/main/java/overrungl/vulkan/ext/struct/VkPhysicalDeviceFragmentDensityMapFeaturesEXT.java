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
/// struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentDensityMap;
///     VkBool32 fragmentDensityMapDynamic;
///     VkBool32 fragmentDensityMapNonSubsampledImages;
/// };
/// ```
public sealed class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
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
    /// The byte offset of `fragmentDensityMap`.
    public static final long OFFSET_fragmentDensityMap = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMap"));
    /// The memory layout of `fragmentDensityMap`.
    public static final MemoryLayout LAYOUT_fragmentDensityMap = LAYOUT.select(PathElement.groupElement("fragmentDensityMap"));
    /// The [VarHandle] of `fragmentDensityMap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMap"));
    /// The byte offset of `fragmentDensityMapDynamic`.
    public static final long OFFSET_fragmentDensityMapDynamic = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The memory layout of `fragmentDensityMapDynamic`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapDynamic = LAYOUT.select(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The [VarHandle] of `fragmentDensityMapDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityMapDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The byte offset of `fragmentDensityMapNonSubsampledImages`.
    public static final long OFFSET_fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    /// The memory layout of `fragmentDensityMapNonSubsampledImages`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapNonSubsampledImages = LAYOUT.select(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    /// The [VarHandle] of `fragmentDensityMapNonSubsampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityMapNonSubsampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMap(MemorySegment segment, long index) { return (int) VH_fragmentDensityMap.get(segment, 0L, index); }
    /// {@return `fragmentDensityMap`}
    public int fragmentDensityMap() { return fragmentDensityMap(this.segment(), 0L); }
    /// Sets `fragmentDensityMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMap(MemorySegment segment, long index, int value) { VH_fragmentDensityMap.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(int value) { fragmentDensityMap(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMapDynamic(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapDynamic.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapDynamic`}
    public int fragmentDensityMapDynamic() { return fragmentDensityMapDynamic(this.segment(), 0L); }
    /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapDynamic(MemorySegment segment, long index, int value) { VH_fragmentDensityMapDynamic.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(int value) { fragmentDensityMapDynamic(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapNonSubsampledImages.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapNonSubsampledImages`}
    public int fragmentDensityMapNonSubsampledImages() { return fragmentDensityMapNonSubsampledImages(this.segment(), 0L); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index, int value) { VH_fragmentDensityMapNonSubsampledImages.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(int value) { fragmentDensityMapNonSubsampledImages(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentDensityMapFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
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

        /// {@return `fragmentDensityMap` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentDensityMapAt(long index) { return fragmentDensityMap(this.segment(), index); }
        /// Sets `fragmentDensityMap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityMapAt(long index, int value) { fragmentDensityMap(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityMapDynamic` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentDensityMapDynamicAt(long index) { return fragmentDensityMapDynamic(this.segment(), index); }
        /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityMapDynamicAt(long index, int value) { fragmentDensityMapDynamic(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentDensityMapNonSubsampledImagesAt(long index) { return fragmentDensityMapNonSubsampledImages(this.segment(), index); }
        /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityMapNonSubsampledImagesAt(long index, int value) { fragmentDensityMapNonSubsampledImages(this.segment(), index, value); return this; }

    }
}
