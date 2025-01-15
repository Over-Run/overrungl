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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### createInfo
/// [Byte offset][#OFFSET_createInfo] - [Memory layout][#ML_createInfo] - [Getter][#createInfo()] - [Setter][#createInfo(java.lang.foreign.MemorySegment)]
/// ### requiredFormatFeatures
/// [VarHandle][#VH_requiredFormatFeatures] - [Getter][#requiredFormatFeatures()] - [Setter][#requiredFormatFeatures(int)]
/// ### bufferCollectionConstraints
/// [Byte offset][#OFFSET_bufferCollectionConstraints] - [Memory layout][#ML_bufferCollectionConstraints] - [Getter][#bufferCollectionConstraints()] - [Setter][#bufferCollectionConstraints(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkBufferCreateInfo createInfo;
///     VkFormatFeatureFlags requiredFormatFeatures;
///     VkBufferCollectionConstraintsInfoFUCHSIA bufferCollectionConstraints;
/// } VkBufferConstraintsInfoFUCHSIA;
/// ```
public sealed class VkBufferConstraintsInfoFUCHSIA extends Struct {
    /// The struct layout of `VkBufferConstraintsInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkBufferCreateInfo.LAYOUT.withName("createInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        overrungl.vulkan.fuchsia.struct.VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT.withName("bufferCollectionConstraints")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `createInfo`.
    public static final long OFFSET_createInfo = LAYOUT.byteOffset(PathElement.groupElement("createInfo"));
    /// The memory layout of `createInfo`.
    public static final MemoryLayout ML_createInfo = LAYOUT.select(PathElement.groupElement("createInfo"));
    /// The [VarHandle] of `requiredFormatFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiredFormatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFormatFeatures"));
    /// The byte offset of `bufferCollectionConstraints`.
    public static final long OFFSET_bufferCollectionConstraints = LAYOUT.byteOffset(PathElement.groupElement("bufferCollectionConstraints"));
    /// The memory layout of `bufferCollectionConstraints`.
    public static final MemoryLayout ML_bufferCollectionConstraints = LAYOUT.select(PathElement.groupElement("bufferCollectionConstraints"));

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferConstraintsInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferConstraintsInfoFUCHSIA`
    public static VkBufferConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferConstraintsInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBufferConstraintsInfoFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferConstraintsInfoFUCHSIA`
    public static VkBufferConstraintsInfoFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment createInfo, @CType("VkFormatFeatureFlags") int requiredFormatFeatures, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment bufferCollectionConstraints) { return alloc(allocator).sType(sType).pNext(pNext).createInfo(createInfo).requiredFormatFeatures(requiredFormatFeatures).bufferCollectionConstraints(bufferCollectionConstraints); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA copyFrom(VkBufferConstraintsInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferConstraintsInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferConstraintsInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferConstraintsInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkBufferConstraintsInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferConstraintsInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBufferConstraintsInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `createInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment get_createInfo(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_createInfo, index), ML_createInfo); }
    /// {@return `createInfo`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment get_createInfo(MemorySegment segment) { return VkBufferConstraintsInfoFUCHSIA.get_createInfo(segment, 0L); }
    /// {@return `createInfo`}
    public @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment createInfo() { return VkBufferConstraintsInfoFUCHSIA.get_createInfo(this.segment()); }
    /// Sets `createInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_createInfo(MemorySegment segment, long index, @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_createInfo, index), ML_createInfo.byteSize()); }
    /// Sets `createInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_createInfo(MemorySegment segment, @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_createInfo(segment, 0L, value); }
    /// Sets `createInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA createInfo(@CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_createInfo(this.segment(), value); return this; }

    /// {@return `requiredFormatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_requiredFormatFeatures(MemorySegment segment, long index) { return (int) VH_requiredFormatFeatures.get(segment, 0L, index); }
    /// {@return `requiredFormatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_requiredFormatFeatures(MemorySegment segment) { return VkBufferConstraintsInfoFUCHSIA.get_requiredFormatFeatures(segment, 0L); }
    /// {@return `requiredFormatFeatures`}
    public @CType("VkFormatFeatureFlags") int requiredFormatFeatures() { return VkBufferConstraintsInfoFUCHSIA.get_requiredFormatFeatures(this.segment()); }
    /// Sets `requiredFormatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiredFormatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_requiredFormatFeatures.set(segment, 0L, index, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiredFormatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkBufferConstraintsInfoFUCHSIA.set_requiredFormatFeatures(segment, 0L, value); }
    /// Sets `requiredFormatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA requiredFormatFeatures(@CType("VkFormatFeatureFlags") int value) { VkBufferConstraintsInfoFUCHSIA.set_requiredFormatFeatures(this.segment(), value); return this; }

    /// {@return `bufferCollectionConstraints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment get_bufferCollectionConstraints(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), ML_bufferCollectionConstraints); }
    /// {@return `bufferCollectionConstraints`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment get_bufferCollectionConstraints(MemorySegment segment) { return VkBufferConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(segment, 0L); }
    /// {@return `bufferCollectionConstraints`}
    public @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment bufferCollectionConstraints() { return VkBufferConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(this.segment()); }
    /// Sets `bufferCollectionConstraints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferCollectionConstraints(MemorySegment segment, long index, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_bufferCollectionConstraints, index), ML_bufferCollectionConstraints.byteSize()); }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferCollectionConstraints(MemorySegment segment, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(segment, 0L, value); }
    /// Sets `bufferCollectionConstraints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferConstraintsInfoFUCHSIA bufferCollectionConstraints(@CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(this.segment(), value); return this; }

    /// A buffer of [VkBufferConstraintsInfoFUCHSIA].
    public static final class Buffer extends VkBufferConstraintsInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkBufferConstraintsInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferConstraintsInfoFUCHSIA`
        public VkBufferConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferConstraintsInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferConstraintsInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferConstraintsInfoFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferConstraintsInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferConstraintsInfoFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `createInfo` at the given index}
        /// @param index the index
        public @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment createInfoAt(long index) { return VkBufferConstraintsInfoFUCHSIA.get_createInfo(this.segment(), index); }
        /// Sets `createInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer createInfoAt(long index, @CType("VkBufferCreateInfo") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_createInfo(this.segment(), index, value); return this; }

        /// {@return `requiredFormatFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int requiredFormatFeaturesAt(long index) { return VkBufferConstraintsInfoFUCHSIA.get_requiredFormatFeatures(this.segment(), index); }
        /// Sets `requiredFormatFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer requiredFormatFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkBufferConstraintsInfoFUCHSIA.set_requiredFormatFeatures(this.segment(), index, value); return this; }

        /// {@return `bufferCollectionConstraints` at the given index}
        /// @param index the index
        public @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment bufferCollectionConstraintsAt(long index) { return VkBufferConstraintsInfoFUCHSIA.get_bufferCollectionConstraints(this.segment(), index); }
        /// Sets `bufferCollectionConstraints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferCollectionConstraintsAt(long index, @CType("VkBufferCollectionConstraintsInfoFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferConstraintsInfoFUCHSIA.set_bufferCollectionConstraints(this.segment(), index, value); return this; }

    }
}
