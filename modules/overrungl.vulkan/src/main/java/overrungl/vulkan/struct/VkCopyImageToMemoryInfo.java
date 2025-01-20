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
package overrungl.vulkan.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### srcImage
/// [VarHandle][#VH_srcImage] - [Getter][#srcImage()] - [Setter][#srcImage(MemorySegment)]
/// ### srcImageLayout
/// [VarHandle][#VH_srcImageLayout] - [Getter][#srcImageLayout()] - [Setter][#srcImageLayout(int)]
/// ### regionCount
/// [VarHandle][#VH_regionCount] - [Getter][#regionCount()] - [Setter][#regionCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyImageToMemoryInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkHostImageCopyFlags flags;
///     VkImage srcImage;
///     VkImageLayout srcImageLayout;
///     uint32_t regionCount;
///     const VkImageToMemoryCopy * pRegions;
/// } VkCopyImageToMemoryInfo;
/// ```
public sealed class VkCopyImageToMemoryInfo extends Struct {
    /// The struct layout of `VkCopyImageToMemoryInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `srcImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    /// The [VarHandle] of `srcImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkCopyImageToMemoryInfo` with the given segment.
    /// @param segment the memory segment
    public VkCopyImageToMemoryInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyImageToMemoryInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyImageToMemoryInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyImageToMemoryInfo(segment); }

    /// Creates `VkCopyImageToMemoryInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyImageToMemoryInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyImageToMemoryInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyImageToMemoryInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyImageToMemoryInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyImageToMemoryInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyImageToMemoryInfo`
    public static VkCopyImageToMemoryInfo alloc(SegmentAllocator allocator) { return new VkCopyImageToMemoryInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyImageToMemoryInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyImageToMemoryInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyImageToMemoryInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyImageToMemoryInfo`
    public static VkCopyImageToMemoryInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkHostImageCopyFlags") int flags, @CType("VkImage") MemorySegment srcImage, @CType("VkImageLayout") int srcImageLayout, @CType("uint32_t") int regionCount, @CType("const VkImageToMemoryCopy *") MemorySegment pRegions) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).srcImage(srcImage).srcImageLayout(srcImageLayout).regionCount(regionCount).pRegions(pRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyImageToMemoryInfo copyFrom(VkCopyImageToMemoryInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyImageToMemoryInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyImageToMemoryInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo sType(@CType("VkStructureType") int value) { VkCopyImageToMemoryInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCopyImageToMemoryInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo pNext(@CType("const void *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkHostImageCopyFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkHostImageCopyFlags") int get_flags(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkHostImageCopyFlags") int flags() { return VkCopyImageToMemoryInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkHostImageCopyFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkHostImageCopyFlags") int value) { VkCopyImageToMemoryInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo flags(@CType("VkHostImageCopyFlags") int value) { VkCopyImageToMemoryInfo.set_flags(this.segment(), value); return this; }

    /// {@return `srcImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") MemorySegment get_srcImage(MemorySegment segment, long index) { return (MemorySegment) VH_srcImage.get(segment, 0L, index); }
    /// {@return `srcImage`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") MemorySegment get_srcImage(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_srcImage(segment, 0L); }
    /// {@return `srcImage`}
    public @CType("VkImage") MemorySegment srcImage() { return VkCopyImageToMemoryInfo.get_srcImage(this.segment()); }
    /// Sets `srcImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, long index, @CType("VkImage") MemorySegment value) { VH_srcImage.set(segment, 0L, index, value); }
    /// Sets `srcImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImage(MemorySegment segment, @CType("VkImage") MemorySegment value) { VkCopyImageToMemoryInfo.set_srcImage(segment, 0L, value); }
    /// Sets `srcImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo srcImage(@CType("VkImage") MemorySegment value) { VkCopyImageToMemoryInfo.set_srcImage(this.segment(), value); return this; }

    /// {@return `srcImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment, long index) { return (int) VH_srcImageLayout.get(segment, 0L, index); }
    /// {@return `srcImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_srcImageLayout(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_srcImageLayout(segment, 0L); }
    /// {@return `srcImageLayout`}
    public @CType("VkImageLayout") int srcImageLayout() { return VkCopyImageToMemoryInfo.get_srcImageLayout(this.segment()); }
    /// Sets `srcImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_srcImageLayout.set(segment, 0L, index, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkCopyImageToMemoryInfo.set_srcImageLayout(segment, 0L, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo srcImageLayout(@CType("VkImageLayout") int value) { VkCopyImageToMemoryInfo.set_srcImageLayout(this.segment(), value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_regionCount(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_regionCount(segment, 0L); }
    /// {@return `regionCount`}
    public @CType("uint32_t") int regionCount() { return VkCopyImageToMemoryInfo.get_regionCount(this.segment()); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_regionCount(MemorySegment segment, @CType("uint32_t") int value) { VkCopyImageToMemoryInfo.set_regionCount(segment, 0L, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo regionCount(@CType("uint32_t") int value) { VkCopyImageToMemoryInfo.set_regionCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageToMemoryCopy *") MemorySegment get_pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageToMemoryCopy *") MemorySegment get_pRegions(MemorySegment segment) { return VkCopyImageToMemoryInfo.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkImageToMemoryCopy *") MemorySegment pRegions() { return VkCopyImageToMemoryInfo.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkImageToMemoryCopy *") MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkImageToMemoryCopy *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyImageToMemoryInfo pRegions(@CType("const VkImageToMemoryCopy *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pRegions(this.segment(), value); return this; }

    /// A buffer of [VkCopyImageToMemoryInfo].
    public static final class Buffer extends VkCopyImageToMemoryInfo {
        private final long elementCount;

        /// Creates `VkCopyImageToMemoryInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyImageToMemoryInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyImageToMemoryInfo`
        public VkCopyImageToMemoryInfo asSlice(long index) { return new VkCopyImageToMemoryInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyImageToMemoryInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyImageToMemoryInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyImageToMemoryInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyImageToMemoryInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCopyImageToMemoryInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkHostImageCopyFlags") int flagsAt(long index) { return VkCopyImageToMemoryInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkHostImageCopyFlags") int value) { VkCopyImageToMemoryInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `srcImage` at the given index}
        /// @param index the index
        public @CType("VkImage") MemorySegment srcImageAt(long index) { return VkCopyImageToMemoryInfo.get_srcImage(this.segment(), index); }
        /// Sets `srcImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcImageAt(long index, @CType("VkImage") MemorySegment value) { VkCopyImageToMemoryInfo.set_srcImage(this.segment(), index, value); return this; }

        /// {@return `srcImageLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int srcImageLayoutAt(long index) { return VkCopyImageToMemoryInfo.get_srcImageLayout(this.segment(), index); }
        /// Sets `srcImageLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkCopyImageToMemoryInfo.set_srcImageLayout(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int regionCountAt(long index) { return VkCopyImageToMemoryInfo.get_regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, @CType("uint32_t") int value) { VkCopyImageToMemoryInfo.set_regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkImageToMemoryCopy *") MemorySegment pRegionsAt(long index) { return VkCopyImageToMemoryInfo.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkImageToMemoryCopy *") MemorySegment value) { VkCopyImageToMemoryInfo.set_pRegions(this.segment(), index, value); return this; }

    }
}
