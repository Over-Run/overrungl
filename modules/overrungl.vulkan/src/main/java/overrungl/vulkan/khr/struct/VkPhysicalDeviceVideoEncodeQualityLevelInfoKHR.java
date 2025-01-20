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
package overrungl.vulkan.khr.struct;

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
/// ### pVideoProfile
/// [VarHandle][#VH_pVideoProfile] - [Getter][#pVideoProfile()] - [Setter][#pVideoProfile(MemorySegment)]
/// ### qualityLevel
/// [VarHandle][#VH_qualityLevel] - [Getter][#qualityLevel()] - [Setter][#qualityLevel(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const VkVideoProfileInfoKHR * pVideoProfile;
///     uint32_t qualityLevel;
/// } VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR;
/// ```
public sealed class VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("qualityLevel")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pVideoProfile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    /// The [VarHandle] of `qualityLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_qualityLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qualityLevel"));

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const VkVideoProfileInfoKHR *") MemorySegment pVideoProfile, @CType("uint32_t") int qualityLevel) { return alloc(allocator).sType(sType).pNext(pNext).pVideoProfile(pVideoProfile).qualityLevel(qualityLevel); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR copyFrom(VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNext(@CType("const void *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoProfileInfoKHR *") MemorySegment get_pVideoProfile(MemorySegment segment, long index) { return (MemorySegment) VH_pVideoProfile.get(segment, 0L, index); }
    /// {@return `pVideoProfile`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoProfileInfoKHR *") MemorySegment get_pVideoProfile(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pVideoProfile(segment, 0L); }
    /// {@return `pVideoProfile`}
    public @CType("const VkVideoProfileInfoKHR *") MemorySegment pVideoProfile() { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pVideoProfile(this.segment()); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVideoProfile(MemorySegment segment, long index, @CType("const VkVideoProfileInfoKHR *") MemorySegment value) { VH_pVideoProfile.set(segment, 0L, index, value); }
    /// Sets `pVideoProfile` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVideoProfile(MemorySegment segment, @CType("const VkVideoProfileInfoKHR *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pVideoProfile(segment, 0L, value); }
    /// Sets `pVideoProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfile(@CType("const VkVideoProfileInfoKHR *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pVideoProfile(this.segment(), value); return this; }

    /// {@return `qualityLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_qualityLevel(MemorySegment segment, long index) { return (int) VH_qualityLevel.get(segment, 0L, index); }
    /// {@return `qualityLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_qualityLevel(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_qualityLevel(segment, 0L); }
    /// {@return `qualityLevel`}
    public @CType("uint32_t") int qualityLevel() { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_qualityLevel(this.segment()); }
    /// Sets `qualityLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_qualityLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_qualityLevel.set(segment, 0L, index, value); }
    /// Sets `qualityLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_qualityLevel(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_qualityLevel(segment, 0L, value); }
    /// Sets `qualityLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevel(@CType("uint32_t") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_qualityLevel(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR].
    public static final class Buffer extends VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
        public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pVideoProfile` at the given index}
        /// @param index the index
        public @CType("const VkVideoProfileInfoKHR *") MemorySegment pVideoProfileAt(long index) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_pVideoProfile(this.segment(), index); }
        /// Sets `pVideoProfile` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pVideoProfileAt(long index, @CType("const VkVideoProfileInfoKHR *") MemorySegment value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_pVideoProfile(this.segment(), index, value); return this; }

        /// {@return `qualityLevel` at the given index}
        /// @param index the index
        public @CType("uint32_t") int qualityLevelAt(long index) { return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.get_qualityLevel(this.segment(), index); }
        /// Sets `qualityLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer qualityLevelAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.set_qualityLevel(this.segment(), index, value); return this; }

    }
}
