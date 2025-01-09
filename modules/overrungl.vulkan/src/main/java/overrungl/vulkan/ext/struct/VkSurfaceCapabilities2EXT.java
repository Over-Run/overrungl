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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### minImageCount
/// [VarHandle][#VH_minImageCount] - [Getter][#minImageCount()] - [Setter][#minImageCount(int)]
/// ### maxImageCount
/// [VarHandle][#VH_maxImageCount] - [Getter][#maxImageCount()] - [Setter][#maxImageCount(int)]
/// ### currentExtent
/// [Byte offset][#OFFSET_currentExtent] - [Memory layout][#ML_currentExtent] - [Getter][#currentExtent()] - [Setter][#currentExtent(java.lang.foreign.MemorySegment)]
/// ### minImageExtent
/// [Byte offset][#OFFSET_minImageExtent] - [Memory layout][#ML_minImageExtent] - [Getter][#minImageExtent()] - [Setter][#minImageExtent(java.lang.foreign.MemorySegment)]
/// ### maxImageExtent
/// [Byte offset][#OFFSET_maxImageExtent] - [Memory layout][#ML_maxImageExtent] - [Getter][#maxImageExtent()] - [Setter][#maxImageExtent(java.lang.foreign.MemorySegment)]
/// ### maxImageArrayLayers
/// [VarHandle][#VH_maxImageArrayLayers] - [Getter][#maxImageArrayLayers()] - [Setter][#maxImageArrayLayers(int)]
/// ### supportedTransforms
/// [VarHandle][#VH_supportedTransforms] - [Getter][#supportedTransforms()] - [Setter][#supportedTransforms(int)]
/// ### currentTransform
/// [VarHandle][#VH_currentTransform] - [Getter][#currentTransform()] - [Setter][#currentTransform(int)]
/// ### supportedCompositeAlpha
/// [VarHandle][#VH_supportedCompositeAlpha] - [Getter][#supportedCompositeAlpha()] - [Setter][#supportedCompositeAlpha(int)]
/// ### supportedUsageFlags
/// [VarHandle][#VH_supportedUsageFlags] - [Getter][#supportedUsageFlags()] - [Setter][#supportedUsageFlags(int)]
/// ### supportedSurfaceCounters
/// [VarHandle][#VH_supportedSurfaceCounters] - [Getter][#supportedSurfaceCounters()] - [Setter][#supportedSurfaceCounters(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSurfaceCapabilities2EXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t minImageCount;
///     uint32_t maxImageCount;
///     VkExtent2D currentExtent;
///     VkExtent2D minImageExtent;
///     VkExtent2D maxImageExtent;
///     uint32_t maxImageArrayLayers;
///     VkSurfaceTransformFlagsKHR supportedTransforms;
///     VkSurfaceTransformFlagBitsKHR currentTransform;
///     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
///     VkImageUsageFlags supportedUsageFlags;
///     VkSurfaceCounterFlagsEXT supportedSurfaceCounters;
/// } VkSurfaceCapabilities2EXT;
/// ```
public final class VkSurfaceCapabilities2EXT extends Struct {
    /// The struct layout of `VkSurfaceCapabilities2EXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("currentExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags"),
        ValueLayout.JAVA_INT.withName("supportedSurfaceCounters")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minImageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    /// The [VarHandle] of `maxImageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageCount"));
    /// The byte offset of `currentExtent`.
    public static final long OFFSET_currentExtent = LAYOUT.byteOffset(PathElement.groupElement("currentExtent"));
    /// The memory layout of `currentExtent`.
    public static final MemoryLayout ML_currentExtent = LAYOUT.select(PathElement.groupElement("currentExtent"));
    /// The byte offset of `minImageExtent`.
    public static final long OFFSET_minImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minImageExtent"));
    /// The memory layout of `minImageExtent`.
    public static final MemoryLayout ML_minImageExtent = LAYOUT.select(PathElement.groupElement("minImageExtent"));
    /// The byte offset of `maxImageExtent`.
    public static final long OFFSET_maxImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxImageExtent"));
    /// The memory layout of `maxImageExtent`.
    public static final MemoryLayout ML_maxImageExtent = LAYOUT.select(PathElement.groupElement("maxImageExtent"));
    /// The [VarHandle] of `maxImageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers"));
    /// The [VarHandle] of `supportedTransforms` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    /// The [VarHandle] of `currentTransform` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_currentTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentTransform"));
    /// The [VarHandle] of `supportedCompositeAlpha` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedCompositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedCompositeAlpha"));
    /// The [VarHandle] of `supportedUsageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedUsageFlags"));
    /// The [VarHandle] of `supportedSurfaceCounters` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedSurfaceCounters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedSurfaceCounters"));

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceCapabilities2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2EXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2EXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2EXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilities2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilities2EXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSurfaceCapabilities2EXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfaceCapabilities2EXT`
    public VkSurfaceCapabilities2EXT asSlice(long index) { return new VkSurfaceCapabilities2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSurfaceCapabilities2EXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfaceCapabilities2EXT`
    public VkSurfaceCapabilities2EXT asSlice(long index, long count) { return new VkSurfaceCapabilities2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSurfaceCapabilities2EXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSurfaceCapabilities2EXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSurfaceCapabilities2EXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT sTypeAt(long index, @CType("VkStructureType") int value) { VkSurfaceCapabilities2EXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT sType(@CType("VkStructureType") int value) { VkSurfaceCapabilities2EXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSurfaceCapabilities2EXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSurfaceCapabilities2EXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_pNext(this.segment(), value); return this; }

    /// {@return `minImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minImageCount(MemorySegment segment, long index) { return (int) VH_minImageCount.get(segment, 0L, index); }
    /// {@return `minImageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minImageCount(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_minImageCount(segment, 0L); }
    /// {@return `minImageCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minImageCountAt(long index) { return VkSurfaceCapabilities2EXT.get_minImageCount(this.segment(), index); }
    /// {@return `minImageCount`}
    public @CType("uint32_t") int minImageCount() { return VkSurfaceCapabilities2EXT.get_minImageCount(this.segment()); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minImageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minImageCount.set(segment, 0L, index, value); }
    /// Sets `minImageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minImageCount(MemorySegment segment, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_minImageCount(segment, 0L, value); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageCountAt(long index, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_minImageCount(this.segment(), index, value); return this; }
    /// Sets `minImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageCount(@CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_minImageCount(this.segment(), value); return this; }

    /// {@return `maxImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageCount(MemorySegment segment, long index) { return (int) VH_maxImageCount.get(segment, 0L, index); }
    /// {@return `maxImageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageCount(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_maxImageCount(segment, 0L); }
    /// {@return `maxImageCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxImageCountAt(long index) { return VkSurfaceCapabilities2EXT.get_maxImageCount(this.segment(), index); }
    /// {@return `maxImageCount`}
    public @CType("uint32_t") int maxImageCount() { return VkSurfaceCapabilities2EXT.get_maxImageCount(this.segment()); }
    /// Sets `maxImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageCount.set(segment, 0L, index, value); }
    /// Sets `maxImageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageCount(MemorySegment segment, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageCount(segment, 0L, value); }
    /// Sets `maxImageCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageCountAt(long index, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageCount(this.segment(), index, value); return this; }
    /// Sets `maxImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageCount(@CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageCount(this.segment(), value); return this; }

    /// {@return `currentExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_currentExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_currentExtent, index), ML_currentExtent); }
    /// {@return `currentExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_currentExtent(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_currentExtent(segment, 0L); }
    /// {@return `currentExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment currentExtentAt(long index) { return VkSurfaceCapabilities2EXT.get_currentExtent(this.segment(), index); }
    /// {@return `currentExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment currentExtent() { return VkSurfaceCapabilities2EXT.get_currentExtent(this.segment()); }
    /// Sets `currentExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_currentExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_currentExtent, index), ML_currentExtent.byteSize()); }
    /// Sets `currentExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_currentExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_currentExtent(segment, 0L, value); }
    /// Sets `currentExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_currentExtent(this.segment(), index, value); return this; }
    /// Sets `currentExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_currentExtent(this.segment(), value); return this; }

    /// {@return `minImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minImageExtent, index), ML_minImageExtent); }
    /// {@return `minImageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minImageExtent(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_minImageExtent(segment, 0L); }
    /// {@return `minImageExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minImageExtentAt(long index) { return VkSurfaceCapabilities2EXT.get_minImageExtent(this.segment(), index); }
    /// {@return `minImageExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minImageExtent() { return VkSurfaceCapabilities2EXT.get_minImageExtent(this.segment()); }
    /// Sets `minImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minImageExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minImageExtent, index), ML_minImageExtent.byteSize()); }
    /// Sets `minImageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minImageExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_minImageExtent(segment, 0L, value); }
    /// Sets `minImageExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_minImageExtent(this.segment(), index, value); return this; }
    /// Sets `minImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_minImageExtent(this.segment(), value); return this; }

    /// {@return `maxImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxImageExtent, index), ML_maxImageExtent); }
    /// {@return `maxImageExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxImageExtent(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_maxImageExtent(segment, 0L); }
    /// {@return `maxImageExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxImageExtentAt(long index) { return VkSurfaceCapabilities2EXT.get_maxImageExtent(this.segment(), index); }
    /// {@return `maxImageExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxImageExtent() { return VkSurfaceCapabilities2EXT.get_maxImageExtent(this.segment()); }
    /// Sets `maxImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxImageExtent, index), ML_maxImageExtent.byteSize()); }
    /// Sets `maxImageExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_maxImageExtent(segment, 0L, value); }
    /// Sets `maxImageExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_maxImageExtent(this.segment(), index, value); return this; }
    /// Sets `maxImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSurfaceCapabilities2EXT.set_maxImageExtent(this.segment(), value); return this; }

    /// {@return `maxImageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageArrayLayers.get(segment, 0L, index); }
    /// {@return `maxImageArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageArrayLayers(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_maxImageArrayLayers(segment, 0L); }
    /// {@return `maxImageArrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxImageArrayLayersAt(long index) { return VkSurfaceCapabilities2EXT.get_maxImageArrayLayers(this.segment(), index); }
    /// {@return `maxImageArrayLayers`}
    public @CType("uint32_t") int maxImageArrayLayers() { return VkSurfaceCapabilities2EXT.get_maxImageArrayLayers(this.segment()); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageArrayLayers(segment, 0L, value); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageArrayLayersAt(long index, @CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageArrayLayers(this.segment(), index, value); return this; }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageArrayLayers(@CType("uint32_t") int value) { VkSurfaceCapabilities2EXT.set_maxImageArrayLayers(this.segment(), value); return this; }

    /// {@return `supportedTransforms` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment, long index) { return (int) VH_supportedTransforms.get(segment, 0L, index); }
    /// {@return `supportedTransforms`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_supportedTransforms(segment, 0L); }
    /// {@return `supportedTransforms` at the given index}
    /// @param index the index
    public @CType("VkSurfaceTransformFlagsKHR") int supportedTransformsAt(long index) { return VkSurfaceCapabilities2EXT.get_supportedTransforms(this.segment(), index); }
    /// {@return `supportedTransforms`}
    public @CType("VkSurfaceTransformFlagsKHR") int supportedTransforms() { return VkSurfaceCapabilities2EXT.get_supportedTransforms(this.segment()); }
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedTransforms(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagsKHR") int value) { VH_supportedTransforms.set(segment, 0L, index, value); }
    /// Sets `supportedTransforms` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedTransforms(MemorySegment segment, @CType("VkSurfaceTransformFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedTransforms(segment, 0L, value); }
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedTransformsAt(long index, @CType("VkSurfaceTransformFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedTransforms(this.segment(), index, value); return this; }
    /// Sets `supportedTransforms` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedTransforms(@CType("VkSurfaceTransformFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedTransforms(this.segment(), value); return this; }

    /// {@return `currentTransform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_currentTransform(MemorySegment segment, long index) { return (int) VH_currentTransform.get(segment, 0L, index); }
    /// {@return `currentTransform`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_currentTransform(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_currentTransform(segment, 0L); }
    /// {@return `currentTransform` at the given index}
    /// @param index the index
    public @CType("VkSurfaceTransformFlagBitsKHR") int currentTransformAt(long index) { return VkSurfaceCapabilities2EXT.get_currentTransform(this.segment(), index); }
    /// {@return `currentTransform`}
    public @CType("VkSurfaceTransformFlagBitsKHR") int currentTransform() { return VkSurfaceCapabilities2EXT.get_currentTransform(this.segment()); }
    /// Sets `currentTransform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_currentTransform(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VH_currentTransform.set(segment, 0L, index, value); }
    /// Sets `currentTransform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_currentTransform(MemorySegment segment, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSurfaceCapabilities2EXT.set_currentTransform(segment, 0L, value); }
    /// Sets `currentTransform` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentTransformAt(long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSurfaceCapabilities2EXT.set_currentTransform(this.segment(), index, value); return this; }
    /// Sets `currentTransform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentTransform(@CType("VkSurfaceTransformFlagBitsKHR") int value) { VkSurfaceCapabilities2EXT.set_currentTransform(this.segment(), value); return this; }

    /// {@return `supportedCompositeAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCompositeAlphaFlagsKHR") int get_supportedCompositeAlpha(MemorySegment segment, long index) { return (int) VH_supportedCompositeAlpha.get(segment, 0L, index); }
    /// {@return `supportedCompositeAlpha`}
    /// @param segment the segment of the struct
    public static @CType("VkCompositeAlphaFlagsKHR") int get_supportedCompositeAlpha(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_supportedCompositeAlpha(segment, 0L); }
    /// {@return `supportedCompositeAlpha` at the given index}
    /// @param index the index
    public @CType("VkCompositeAlphaFlagsKHR") int supportedCompositeAlphaAt(long index) { return VkSurfaceCapabilities2EXT.get_supportedCompositeAlpha(this.segment(), index); }
    /// {@return `supportedCompositeAlpha`}
    public @CType("VkCompositeAlphaFlagsKHR") int supportedCompositeAlpha() { return VkSurfaceCapabilities2EXT.get_supportedCompositeAlpha(this.segment()); }
    /// Sets `supportedCompositeAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedCompositeAlpha(MemorySegment segment, long index, @CType("VkCompositeAlphaFlagsKHR") int value) { VH_supportedCompositeAlpha.set(segment, 0L, index, value); }
    /// Sets `supportedCompositeAlpha` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedCompositeAlpha(MemorySegment segment, @CType("VkCompositeAlphaFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedCompositeAlpha(segment, 0L, value); }
    /// Sets `supportedCompositeAlpha` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedCompositeAlphaAt(long index, @CType("VkCompositeAlphaFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedCompositeAlpha(this.segment(), index, value); return this; }
    /// Sets `supportedCompositeAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedCompositeAlpha(@CType("VkCompositeAlphaFlagsKHR") int value) { VkSurfaceCapabilities2EXT.set_supportedCompositeAlpha(this.segment(), value); return this; }

    /// {@return `supportedUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_supportedUsageFlags(MemorySegment segment, long index) { return (int) VH_supportedUsageFlags.get(segment, 0L, index); }
    /// {@return `supportedUsageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_supportedUsageFlags(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_supportedUsageFlags(segment, 0L); }
    /// {@return `supportedUsageFlags` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int supportedUsageFlagsAt(long index) { return VkSurfaceCapabilities2EXT.get_supportedUsageFlags(this.segment(), index); }
    /// {@return `supportedUsageFlags`}
    public @CType("VkImageUsageFlags") int supportedUsageFlags() { return VkSurfaceCapabilities2EXT.get_supportedUsageFlags(this.segment()); }
    /// Sets `supportedUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedUsageFlags(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_supportedUsageFlags.set(segment, 0L, index, value); }
    /// Sets `supportedUsageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedUsageFlags(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkSurfaceCapabilities2EXT.set_supportedUsageFlags(segment, 0L, value); }
    /// Sets `supportedUsageFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedUsageFlagsAt(long index, @CType("VkImageUsageFlags") int value) { VkSurfaceCapabilities2EXT.set_supportedUsageFlags(this.segment(), index, value); return this; }
    /// Sets `supportedUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedUsageFlags(@CType("VkImageUsageFlags") int value) { VkSurfaceCapabilities2EXT.set_supportedUsageFlags(this.segment(), value); return this; }

    /// {@return `supportedSurfaceCounters` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceCounterFlagsEXT") int get_supportedSurfaceCounters(MemorySegment segment, long index) { return (int) VH_supportedSurfaceCounters.get(segment, 0L, index); }
    /// {@return `supportedSurfaceCounters`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceCounterFlagsEXT") int get_supportedSurfaceCounters(MemorySegment segment) { return VkSurfaceCapabilities2EXT.get_supportedSurfaceCounters(segment, 0L); }
    /// {@return `supportedSurfaceCounters` at the given index}
    /// @param index the index
    public @CType("VkSurfaceCounterFlagsEXT") int supportedSurfaceCountersAt(long index) { return VkSurfaceCapabilities2EXT.get_supportedSurfaceCounters(this.segment(), index); }
    /// {@return `supportedSurfaceCounters`}
    public @CType("VkSurfaceCounterFlagsEXT") int supportedSurfaceCounters() { return VkSurfaceCapabilities2EXT.get_supportedSurfaceCounters(this.segment()); }
    /// Sets `supportedSurfaceCounters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedSurfaceCounters(MemorySegment segment, long index, @CType("VkSurfaceCounterFlagsEXT") int value) { VH_supportedSurfaceCounters.set(segment, 0L, index, value); }
    /// Sets `supportedSurfaceCounters` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedSurfaceCounters(MemorySegment segment, @CType("VkSurfaceCounterFlagsEXT") int value) { VkSurfaceCapabilities2EXT.set_supportedSurfaceCounters(segment, 0L, value); }
    /// Sets `supportedSurfaceCounters` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedSurfaceCountersAt(long index, @CType("VkSurfaceCounterFlagsEXT") int value) { VkSurfaceCapabilities2EXT.set_supportedSurfaceCounters(this.segment(), index, value); return this; }
    /// Sets `supportedSurfaceCounters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedSurfaceCounters(@CType("VkSurfaceCounterFlagsEXT") int value) { VkSurfaceCapabilities2EXT.set_supportedSurfaceCounters(this.segment(), value); return this; }

}
