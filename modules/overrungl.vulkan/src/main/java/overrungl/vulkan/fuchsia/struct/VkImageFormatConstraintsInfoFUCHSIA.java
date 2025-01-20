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
package overrungl.vulkan.fuchsia.struct;

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
/// ### imageCreateInfo
/// [Byte offset][#OFFSET_imageCreateInfo] - [Memory layout][#ML_imageCreateInfo] - [Getter][#imageCreateInfo()] - [Setter][#imageCreateInfo(MemorySegment)]
/// ### requiredFormatFeatures
/// [VarHandle][#VH_requiredFormatFeatures] - [Getter][#requiredFormatFeatures()] - [Setter][#requiredFormatFeatures(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### sysmemPixelFormat
/// [VarHandle][#VH_sysmemPixelFormat] - [Getter][#sysmemPixelFormat()] - [Setter][#sysmemPixelFormat(long)]
/// ### colorSpaceCount
/// [VarHandle][#VH_colorSpaceCount] - [Getter][#colorSpaceCount()] - [Setter][#colorSpaceCount(int)]
/// ### pColorSpaces
/// [VarHandle][#VH_pColorSpaces] - [Getter][#pColorSpaces()] - [Setter][#pColorSpaces(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageFormatConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageCreateInfo imageCreateInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkImageFormatConstraintsFlagsFUCHSIA flags;
///     uint64_t sysmemPixelFormat;
///     uint32_t colorSpaceCount;
///     const VkSysmemColorSpaceFUCHSIA * pColorSpaces;
/// } VkImageFormatConstraintsInfoFUCHSIA;
/// ```
public sealed class VkImageFormatConstraintsInfoFUCHSIA extends Struct {
    /// The struct layout of `VkImageFormatConstraintsInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageCreateInfo.LAYOUT.withName("imageCreateInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("colorSpaceCount"),
        ValueLayout.ADDRESS.withName("pColorSpaces")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `imageCreateInfo`.
    public static final long OFFSET_imageCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("imageCreateInfo"));
    /// The memory layout of `imageCreateInfo`.
    public static final MemoryLayout ML_imageCreateInfo = LAYOUT.select(PathElement.groupElement("imageCreateInfo"));
    /// The [VarHandle] of `requiredFormatFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `sysmemPixelFormat` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    /// The [VarHandle] of `colorSpaceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorSpaceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpaceCount"));
    /// The [VarHandle] of `pColorSpaces` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorSpaces = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorSpaces"));

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatConstraintsInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageFormatConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageFormatConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatConstraintsInfoFUCHSIA`
    public static VkImageFormatConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImageFormatConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatConstraintsInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageFormatConstraintsInfoFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatConstraintsInfoFUCHSIA`
    public static VkImageFormatConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImageCreateInfo") MemorySegment imageCreateInfo, @CType("VkFormatFeatureFlags") int requiredFormatFeatures, @CType("VkImageFormatConstraintsFlagsFUCHSIA") int flags, @CType("uint64_t") long sysmemPixelFormat, @CType("uint32_t") int colorSpaceCount, @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment pColorSpaces) { return alloc(allocator).sType(sType).pNext(pNext).imageCreateInfo(imageCreateInfo).requiredFormatFeatures(requiredFormatFeatures).flags(flags).sysmemPixelFormat(sysmemPixelFormat).colorSpaceCount(colorSpaceCount).pColorSpaces(pColorSpaces); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA copyFrom(VkImageFormatConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageFormatConstraintsInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageFormatConstraintsInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA pNext(@CType("const void *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `imageCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCreateInfo") MemorySegment get_imageCreateInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageCreateInfo, index), ML_imageCreateInfo); }
    /// {@return `imageCreateInfo`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCreateInfo") MemorySegment get_imageCreateInfo(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_imageCreateInfo(segment, 0L); }
    /// {@return `imageCreateInfo`}
    public @CType("VkImageCreateInfo") MemorySegment imageCreateInfo() { return VkImageFormatConstraintsInfoFUCHSIA.get_imageCreateInfo(this.segment()); }
    /// Sets `imageCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCreateInfo(MemorySegment segment, long index, @CType("VkImageCreateInfo") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageCreateInfo, index), ML_imageCreateInfo.byteSize()); }
    /// Sets `imageCreateInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCreateInfo(MemorySegment segment, @CType("VkImageCreateInfo") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_imageCreateInfo(segment, 0L, value); }
    /// Sets `imageCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA imageCreateInfo(@CType("VkImageCreateInfo") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_imageCreateInfo(this.segment(), value); return this; }

    /// {@return `requiredFormatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_requiredFormatFeatures(MemorySegment segment, long index) { return (int) VH_requiredFormatFeatures.get(segment, 0L, index); }
    /// {@return `requiredFormatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_requiredFormatFeatures(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_requiredFormatFeatures(segment, 0L); }
    /// {@return `requiredFormatFeatures`}
    public @CType("VkFormatFeatureFlags") int requiredFormatFeatures() { return VkImageFormatConstraintsInfoFUCHSIA.get_requiredFormatFeatures(this.segment()); }
    /// Sets `requiredFormatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiredFormatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_requiredFormatFeatures.set(segment, 0L, index, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiredFormatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_requiredFormatFeatures(segment, 0L, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA requiredFormatFeatures(@CType("VkFormatFeatureFlags") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_requiredFormatFeatures(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageFormatConstraintsFlagsFUCHSIA") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageFormatConstraintsFlagsFUCHSIA") int get_flags(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkImageFormatConstraintsFlagsFUCHSIA") int flags() { return VkImageFormatConstraintsInfoFUCHSIA.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageFormatConstraintsFlagsFUCHSIA") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageFormatConstraintsFlagsFUCHSIA") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA flags(@CType("VkImageFormatConstraintsFlagsFUCHSIA") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_flags(this.segment(), value); return this; }

    /// {@return `sysmemPixelFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_sysmemPixelFormat(MemorySegment segment, long index) { return (long) VH_sysmemPixelFormat.get(segment, 0L, index); }
    /// {@return `sysmemPixelFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_sysmemPixelFormat(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_sysmemPixelFormat(segment, 0L); }
    /// {@return `sysmemPixelFormat`}
    public @CType("uint64_t") long sysmemPixelFormat() { return VkImageFormatConstraintsInfoFUCHSIA.get_sysmemPixelFormat(this.segment()); }
    /// Sets `sysmemPixelFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sysmemPixelFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_sysmemPixelFormat.set(segment, 0L, index, value); }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sysmemPixelFormat(MemorySegment segment, @CType("uint64_t") long value) { VkImageFormatConstraintsInfoFUCHSIA.set_sysmemPixelFormat(segment, 0L, value); }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA sysmemPixelFormat(@CType("uint64_t") long value) { VkImageFormatConstraintsInfoFUCHSIA.set_sysmemPixelFormat(this.segment(), value); return this; }

    /// {@return `colorSpaceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorSpaceCount(MemorySegment segment, long index) { return (int) VH_colorSpaceCount.get(segment, 0L, index); }
    /// {@return `colorSpaceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorSpaceCount(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_colorSpaceCount(segment, 0L); }
    /// {@return `colorSpaceCount`}
    public @CType("uint32_t") int colorSpaceCount() { return VkImageFormatConstraintsInfoFUCHSIA.get_colorSpaceCount(this.segment()); }
    /// Sets `colorSpaceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorSpaceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorSpaceCount.set(segment, 0L, index, value); }
    /// Sets `colorSpaceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorSpaceCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_colorSpaceCount(segment, 0L, value); }
    /// Sets `colorSpaceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA colorSpaceCount(@CType("uint32_t") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_colorSpaceCount(this.segment(), value); return this; }

    /// {@return `pColorSpaces` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment get_pColorSpaces(MemorySegment segment, long index) { return (MemorySegment) VH_pColorSpaces.get(segment, 0L, index); }
    /// {@return `pColorSpaces`}
    /// @param segment the segment of the struct
    public static @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment get_pColorSpaces(MemorySegment segment) { return VkImageFormatConstraintsInfoFUCHSIA.get_pColorSpaces(segment, 0L); }
    /// {@return `pColorSpaces`}
    public @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment pColorSpaces() { return VkImageFormatConstraintsInfoFUCHSIA.get_pColorSpaces(this.segment()); }
    /// Sets `pColorSpaces` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorSpaces(MemorySegment segment, long index, @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment value) { VH_pColorSpaces.set(segment, 0L, index, value); }
    /// Sets `pColorSpaces` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorSpaces(MemorySegment segment, @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pColorSpaces(segment, 0L, value); }
    /// Sets `pColorSpaces` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatConstraintsInfoFUCHSIA pColorSpaces(@CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pColorSpaces(this.segment(), value); return this; }

    /// A buffer of [VkImageFormatConstraintsInfoFUCHSIA].
    public static final class Buffer extends VkImageFormatConstraintsInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkImageFormatConstraintsInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageFormatConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageFormatConstraintsInfoFUCHSIA`
        public VkImageFormatConstraintsInfoFUCHSIA asSlice(long index) { return new VkImageFormatConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageFormatConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageFormatConstraintsInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageCreateInfo` at the given index}
        /// @param index the index
        public @CType("VkImageCreateInfo") MemorySegment imageCreateInfoAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_imageCreateInfo(this.segment(), index); }
        /// Sets `imageCreateInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageCreateInfoAt(long index, @CType("VkImageCreateInfo") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_imageCreateInfo(this.segment(), index, value); return this; }

        /// {@return `requiredFormatFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int requiredFormatFeaturesAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_requiredFormatFeatures(this.segment(), index); }
        /// Sets `requiredFormatFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer requiredFormatFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_requiredFormatFeatures(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkImageFormatConstraintsFlagsFUCHSIA") int flagsAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkImageFormatConstraintsFlagsFUCHSIA") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_flags(this.segment(), index, value); return this; }

        /// {@return `sysmemPixelFormat` at the given index}
        /// @param index the index
        public @CType("uint64_t") long sysmemPixelFormatAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_sysmemPixelFormat(this.segment(), index); }
        /// Sets `sysmemPixelFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sysmemPixelFormatAt(long index, @CType("uint64_t") long value) { VkImageFormatConstraintsInfoFUCHSIA.set_sysmemPixelFormat(this.segment(), index, value); return this; }

        /// {@return `colorSpaceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int colorSpaceCountAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_colorSpaceCount(this.segment(), index); }
        /// Sets `colorSpaceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorSpaceCountAt(long index, @CType("uint32_t") int value) { VkImageFormatConstraintsInfoFUCHSIA.set_colorSpaceCount(this.segment(), index, value); return this; }

        /// {@return `pColorSpaces` at the given index}
        /// @param index the index
        public @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment pColorSpacesAt(long index) { return VkImageFormatConstraintsInfoFUCHSIA.get_pColorSpaces(this.segment(), index); }
        /// Sets `pColorSpaces` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorSpacesAt(long index, @CType("const VkSysmemColorSpaceFUCHSIA *") MemorySegment value) { VkImageFormatConstraintsInfoFUCHSIA.set_pColorSpaces(this.segment(), index, value); return this; }

    }
}
