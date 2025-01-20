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
/// ### features
/// [Byte offset][#OFFSET_features] - [Memory layout][#ML_features] - [Getter][#features()] - [Setter][#features(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFeatures2 {
///     VkStructureType sType;
///     void * pNext;
///     VkPhysicalDeviceFeatures features;
/// } VkPhysicalDeviceFeatures2;
/// ```
public sealed class VkPhysicalDeviceFeatures2 extends Struct {
    /// The struct layout of `VkPhysicalDeviceFeatures2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceFeatures.LAYOUT.withName("features")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `features`.
    public static final long OFFSET_features = LAYOUT.byteOffset(PathElement.groupElement("features"));
    /// The memory layout of `features`.
    public static final MemoryLayout ML_features = LAYOUT.select(PathElement.groupElement("features"));

    /// Creates `VkPhysicalDeviceFeatures2` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFeatures2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFeatures2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures2(segment); }

    /// Creates `VkPhysicalDeviceFeatures2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFeatures2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFeatures2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFeatures2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFeatures2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFeatures2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFeatures2`
    public static VkPhysicalDeviceFeatures2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFeatures2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFeatures2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFeatures2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFeatures2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFeatures2`
    public static VkPhysicalDeviceFeatures2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkPhysicalDeviceFeatures") MemorySegment features) { return alloc(allocator).sType(sType).pNext(pNext).features(features); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFeatures2 copyFrom(VkPhysicalDeviceFeatures2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFeatures2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFeatures2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures2 sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFeatures2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceFeatures2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceFeatures2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures2 pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceFeatures2.set_pNext(this.segment(), value); return this; }

    /// {@return `features` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceFeatures") MemorySegment get_features(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_features, index), ML_features); }
    /// {@return `features`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceFeatures") MemorySegment get_features(MemorySegment segment) { return VkPhysicalDeviceFeatures2.get_features(segment, 0L); }
    /// {@return `features`}
    public @CType("VkPhysicalDeviceFeatures") MemorySegment features() { return VkPhysicalDeviceFeatures2.get_features(this.segment()); }
    /// Sets `features` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_features(MemorySegment segment, long index, @CType("VkPhysicalDeviceFeatures") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_features, index), ML_features.byteSize()); }
    /// Sets `features` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_features(MemorySegment segment, @CType("VkPhysicalDeviceFeatures") MemorySegment value) { VkPhysicalDeviceFeatures2.set_features(segment, 0L, value); }
    /// Sets `features` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFeatures2 features(@CType("VkPhysicalDeviceFeatures") MemorySegment value) { VkPhysicalDeviceFeatures2.set_features(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFeatures2].
    public static final class Buffer extends VkPhysicalDeviceFeatures2 {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFeatures2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFeatures2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFeatures2`
        public VkPhysicalDeviceFeatures2 asSlice(long index) { return new VkPhysicalDeviceFeatures2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFeatures2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFeatures2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFeatures2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceFeatures2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceFeatures2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `features` at the given index}
        /// @param index the index
        public @CType("VkPhysicalDeviceFeatures") MemorySegment featuresAt(long index) { return VkPhysicalDeviceFeatures2.get_features(this.segment(), index); }
        /// Sets `features` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer featuresAt(long index, @CType("VkPhysicalDeviceFeatures") MemorySegment value) { VkPhysicalDeviceFeatures2.set_features(this.segment(), index, value); return this; }

    }
}
