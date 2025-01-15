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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### frameID
/// [VarHandle][#VH_frameID] - [Getter][#frameID()] - [Setter][#frameID(long)]
/// ### imageCount
/// [VarHandle][#VH_imageCount] - [Getter][#imageCount()] - [Setter][#imageCount(int)]
/// ### pImages
/// [VarHandle][#VH_pImages] - [Getter][#pImages()] - [Setter][#pImages(java.lang.foreign.MemorySegment)]
/// ### bufferCount
/// [VarHandle][#VH_bufferCount] - [Getter][#bufferCount()] - [Setter][#bufferCount(int)]
/// ### pBuffers
/// [VarHandle][#VH_pBuffers] - [Getter][#pBuffers()] - [Setter][#pBuffers(java.lang.foreign.MemorySegment)]
/// ### tagName
/// [VarHandle][#VH_tagName] - [Getter][#tagName()] - [Setter][#tagName(long)]
/// ### tagSize
/// [VarHandle][#VH_tagSize] - [Getter][#tagSize()] - [Setter][#tagSize(long)]
/// ### pTag
/// [VarHandle][#VH_pTag] - [Getter][#pTag()] - [Setter][#pTag(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFrameBoundaryEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkFrameBoundaryFlagsEXT flags;
///     uint64_t frameID;
///     uint32_t imageCount;
///     const VkImage * pImages;
///     uint32_t bufferCount;
///     const VkBuffer * pBuffers;
///     uint64_t tagName;
///     size_t tagSize;
///     const void * pTag;
/// } VkFrameBoundaryEXT;
/// ```
public sealed class VkFrameBoundaryEXT extends Struct {
    /// The struct layout of `VkFrameBoundaryEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("frameID"),
        ValueLayout.JAVA_INT.withName("imageCount"),
        ValueLayout.ADDRESS.withName("pImages"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.ADDRESS.withName("pBuffers"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        ValueLayout.JAVA_LONG.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `frameID` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_frameID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameID"));
    /// The [VarHandle] of `imageCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCount"));
    /// The [VarHandle] of `pImages` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImages"));
    /// The [VarHandle] of `bufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    /// The [VarHandle] of `pBuffers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBuffers"));
    /// The [VarHandle] of `tagName` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    /// The [VarHandle] of `tagSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    /// The [VarHandle] of `pTag` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    /// @param segment the memory segment
    public VkFrameBoundaryEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFrameBoundaryEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFrameBoundaryEXT`
    public static VkFrameBoundaryEXT alloc(SegmentAllocator allocator) { return new VkFrameBoundaryEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFrameBoundaryEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFrameBoundaryEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFrameBoundaryEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFrameBoundaryEXT`
    public static VkFrameBoundaryEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkFrameBoundaryFlagsEXT") int flags, @CType("uint64_t") long frameID, @CType("uint32_t") int imageCount, @CType("const VkImage *") java.lang.foreign.MemorySegment pImages, @CType("uint32_t") int bufferCount, @CType("const VkBuffer *") java.lang.foreign.MemorySegment pBuffers, @CType("uint64_t") long tagName, @CType("size_t") long tagSize, @CType("const void *") java.lang.foreign.MemorySegment pTag) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).frameID(frameID).imageCount(imageCount).pImages(pImages).bufferCount(bufferCount).pBuffers(pBuffers).tagName(tagName).tagSize(tagSize).pTag(pTag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFrameBoundaryEXT copyFrom(VkFrameBoundaryEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFrameBoundaryEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFrameBoundaryEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFrameBoundaryEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT sType(@CType("VkStructureType") int value) { VkFrameBoundaryEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFrameBoundaryEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkFrameBoundaryEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFrameBoundaryFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkFrameBoundaryFlagsEXT") int get_flags(MemorySegment segment) { return VkFrameBoundaryEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkFrameBoundaryFlagsEXT") int flags() { return VkFrameBoundaryEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkFrameBoundaryFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkFrameBoundaryFlagsEXT") int value) { VkFrameBoundaryEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT flags(@CType("VkFrameBoundaryFlagsEXT") int value) { VkFrameBoundaryEXT.set_flags(this.segment(), value); return this; }

    /// {@return `frameID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_frameID(MemorySegment segment, long index) { return (long) VH_frameID.get(segment, 0L, index); }
    /// {@return `frameID`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_frameID(MemorySegment segment) { return VkFrameBoundaryEXT.get_frameID(segment, 0L); }
    /// {@return `frameID`}
    public @CType("uint64_t") long frameID() { return VkFrameBoundaryEXT.get_frameID(this.segment()); }
    /// Sets `frameID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameID(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_frameID.set(segment, 0L, index, value); }
    /// Sets `frameID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameID(MemorySegment segment, @CType("uint64_t") long value) { VkFrameBoundaryEXT.set_frameID(segment, 0L, value); }
    /// Sets `frameID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT frameID(@CType("uint64_t") long value) { VkFrameBoundaryEXT.set_frameID(this.segment(), value); return this; }

    /// {@return `imageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageCount(MemorySegment segment, long index) { return (int) VH_imageCount.get(segment, 0L, index); }
    /// {@return `imageCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageCount(MemorySegment segment) { return VkFrameBoundaryEXT.get_imageCount(segment, 0L); }
    /// {@return `imageCount`}
    public @CType("uint32_t") int imageCount() { return VkFrameBoundaryEXT.get_imageCount(this.segment()); }
    /// Sets `imageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageCount.set(segment, 0L, index, value); }
    /// Sets `imageCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCount(MemorySegment segment, @CType("uint32_t") int value) { VkFrameBoundaryEXT.set_imageCount(segment, 0L, value); }
    /// Sets `imageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT imageCount(@CType("uint32_t") int value) { VkFrameBoundaryEXT.set_imageCount(this.segment(), value); return this; }

    /// {@return `pImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImage *") java.lang.foreign.MemorySegment get_pImages(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImages.get(segment, 0L, index); }
    /// {@return `pImages`}
    /// @param segment the segment of the struct
    public static @CType("const VkImage *") java.lang.foreign.MemorySegment get_pImages(MemorySegment segment) { return VkFrameBoundaryEXT.get_pImages(segment, 0L); }
    /// {@return `pImages`}
    public @CType("const VkImage *") java.lang.foreign.MemorySegment pImages() { return VkFrameBoundaryEXT.get_pImages(this.segment()); }
    /// Sets `pImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImages(MemorySegment segment, long index, @CType("const VkImage *") java.lang.foreign.MemorySegment value) { VH_pImages.set(segment, 0L, index, value); }
    /// Sets `pImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImages(MemorySegment segment, @CType("const VkImage *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pImages(segment, 0L, value); }
    /// Sets `pImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pImages(@CType("const VkImage *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pImages(this.segment(), value); return this; }

    /// {@return `bufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferCount(MemorySegment segment, long index) { return (int) VH_bufferCount.get(segment, 0L, index); }
    /// {@return `bufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferCount(MemorySegment segment) { return VkFrameBoundaryEXT.get_bufferCount(segment, 0L); }
    /// {@return `bufferCount`}
    public @CType("uint32_t") int bufferCount() { return VkFrameBoundaryEXT.get_bufferCount(this.segment()); }
    /// Sets `bufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferCount.set(segment, 0L, index, value); }
    /// Sets `bufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkFrameBoundaryEXT.set_bufferCount(segment, 0L, value); }
    /// Sets `bufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT bufferCount(@CType("uint32_t") int value) { VkFrameBoundaryEXT.set_bufferCount(this.segment(), value); return this; }

    /// {@return `pBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBuffer *") java.lang.foreign.MemorySegment get_pBuffers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBuffers.get(segment, 0L, index); }
    /// {@return `pBuffers`}
    /// @param segment the segment of the struct
    public static @CType("const VkBuffer *") java.lang.foreign.MemorySegment get_pBuffers(MemorySegment segment) { return VkFrameBoundaryEXT.get_pBuffers(segment, 0L); }
    /// {@return `pBuffers`}
    public @CType("const VkBuffer *") java.lang.foreign.MemorySegment pBuffers() { return VkFrameBoundaryEXT.get_pBuffers(this.segment()); }
    /// Sets `pBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBuffers(MemorySegment segment, long index, @CType("const VkBuffer *") java.lang.foreign.MemorySegment value) { VH_pBuffers.set(segment, 0L, index, value); }
    /// Sets `pBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBuffers(MemorySegment segment, @CType("const VkBuffer *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pBuffers(segment, 0L, value); }
    /// Sets `pBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pBuffers(@CType("const VkBuffer *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pBuffers(this.segment(), value); return this; }

    /// {@return `tagName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_tagName(MemorySegment segment, long index) { return (long) VH_tagName.get(segment, 0L, index); }
    /// {@return `tagName`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_tagName(MemorySegment segment) { return VkFrameBoundaryEXT.get_tagName(segment, 0L); }
    /// {@return `tagName`}
    public @CType("uint64_t") long tagName() { return VkFrameBoundaryEXT.get_tagName(this.segment()); }
    /// Sets `tagName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_tagName.set(segment, 0L, index, value); }
    /// Sets `tagName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, @CType("uint64_t") long value) { VkFrameBoundaryEXT.set_tagName(segment, 0L, value); }
    /// Sets `tagName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT tagName(@CType("uint64_t") long value) { VkFrameBoundaryEXT.set_tagName(this.segment(), value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_tagSize(MemorySegment segment, long index) { return (long) VH_tagSize.get(segment, 0L, index); }
    /// {@return `tagSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_tagSize(MemorySegment segment) { return VkFrameBoundaryEXT.get_tagSize(segment, 0L); }
    /// {@return `tagSize`}
    public @CType("size_t") long tagSize() { return VkFrameBoundaryEXT.get_tagSize(this.segment()); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_tagSize.set(segment, 0L, index, value); }
    /// Sets `tagSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, @CType("size_t") long value) { VkFrameBoundaryEXT.set_tagSize(segment, 0L, value); }
    /// Sets `tagSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT tagSize(@CType("size_t") long value) { VkFrameBoundaryEXT.set_tagSize(this.segment(), value); return this; }

    /// {@return `pTag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pTag(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTag.get(segment, 0L, index); }
    /// {@return `pTag`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pTag(MemorySegment segment) { return VkFrameBoundaryEXT.get_pTag(segment, 0L); }
    /// {@return `pTag`}
    public @CType("const void *") java.lang.foreign.MemorySegment pTag() { return VkFrameBoundaryEXT.get_pTag(this.segment()); }
    /// Sets `pTag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pTag.set(segment, 0L, index, value); }
    /// Sets `pTag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pTag(segment, 0L, value); }
    /// Sets `pTag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pTag(@CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pTag(this.segment(), value); return this; }

    /// A buffer of [VkFrameBoundaryEXT].
    public static final class Buffer extends VkFrameBoundaryEXT {
        private final long elementCount;

        /// Creates `VkFrameBoundaryEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFrameBoundaryEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFrameBoundaryEXT`
        public VkFrameBoundaryEXT asSlice(long index) { return new VkFrameBoundaryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFrameBoundaryEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFrameBoundaryEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFrameBoundaryEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFrameBoundaryEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFrameBoundaryEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkFrameBoundaryFlagsEXT") int flagsAt(long index) { return VkFrameBoundaryEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkFrameBoundaryFlagsEXT") int value) { VkFrameBoundaryEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `frameID` at the given index}
        /// @param index the index
        public @CType("uint64_t") long frameIDAt(long index) { return VkFrameBoundaryEXT.get_frameID(this.segment(), index); }
        /// Sets `frameID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer frameIDAt(long index, @CType("uint64_t") long value) { VkFrameBoundaryEXT.set_frameID(this.segment(), index, value); return this; }

        /// {@return `imageCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int imageCountAt(long index) { return VkFrameBoundaryEXT.get_imageCount(this.segment(), index); }
        /// Sets `imageCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageCountAt(long index, @CType("uint32_t") int value) { VkFrameBoundaryEXT.set_imageCount(this.segment(), index, value); return this; }

        /// {@return `pImages` at the given index}
        /// @param index the index
        public @CType("const VkImage *") java.lang.foreign.MemorySegment pImagesAt(long index) { return VkFrameBoundaryEXT.get_pImages(this.segment(), index); }
        /// Sets `pImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImagesAt(long index, @CType("const VkImage *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pImages(this.segment(), index, value); return this; }

        /// {@return `bufferCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bufferCountAt(long index) { return VkFrameBoundaryEXT.get_bufferCount(this.segment(), index); }
        /// Sets `bufferCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferCountAt(long index, @CType("uint32_t") int value) { VkFrameBoundaryEXT.set_bufferCount(this.segment(), index, value); return this; }

        /// {@return `pBuffers` at the given index}
        /// @param index the index
        public @CType("const VkBuffer *") java.lang.foreign.MemorySegment pBuffersAt(long index) { return VkFrameBoundaryEXT.get_pBuffers(this.segment(), index); }
        /// Sets `pBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pBuffersAt(long index, @CType("const VkBuffer *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pBuffers(this.segment(), index, value); return this; }

        /// {@return `tagName` at the given index}
        /// @param index the index
        public @CType("uint64_t") long tagNameAt(long index) { return VkFrameBoundaryEXT.get_tagName(this.segment(), index); }
        /// Sets `tagName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tagNameAt(long index, @CType("uint64_t") long value) { VkFrameBoundaryEXT.set_tagName(this.segment(), index, value); return this; }

        /// {@return `tagSize` at the given index}
        /// @param index the index
        public @CType("size_t") long tagSizeAt(long index) { return VkFrameBoundaryEXT.get_tagSize(this.segment(), index); }
        /// Sets `tagSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tagSizeAt(long index, @CType("size_t") long value) { VkFrameBoundaryEXT.set_tagSize(this.segment(), index, value); return this; }

        /// {@return `pTag` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pTagAt(long index) { return VkFrameBoundaryEXT.get_pTag(this.segment(), index); }
        /// Sets `pTag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTagAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFrameBoundaryEXT.set_pTag(this.segment(), index, value); return this; }

    }
}
