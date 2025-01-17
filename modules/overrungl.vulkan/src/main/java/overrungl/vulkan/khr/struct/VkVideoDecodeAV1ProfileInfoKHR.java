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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### stdProfile
/// [VarHandle][#VH_stdProfile] - [Getter][#stdProfile()] - [Setter][#stdProfile(int)]
/// ### filmGrainSupport
/// [VarHandle][#VH_filmGrainSupport] - [Getter][#filmGrainSupport()] - [Setter][#filmGrainSupport(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeAV1ProfileInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     StdVideoAV1Profile stdProfile;
///     VkBool32 filmGrainSupport;
/// } VkVideoDecodeAV1ProfileInfoKHR;
/// ```
public sealed class VkVideoDecodeAV1ProfileInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeAV1ProfileInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfile"),
        ValueLayout.JAVA_INT.withName("filmGrainSupport")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stdProfile` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfile"));
    /// The [VarHandle] of `filmGrainSupport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_filmGrainSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filmGrainSupport"));

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1ProfileInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("StdVideoAV1Profile") int stdProfile, @CType("VkBool32") int filmGrainSupport) { return alloc(allocator).sType(sType).pNext(pNext).stdProfile(stdProfile).filmGrainSupport(filmGrainSupport); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR copyFrom(VkVideoDecodeAV1ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeAV1ProfileInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeAV1ProfileInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeAV1ProfileInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeAV1ProfileInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1ProfileInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1ProfileInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stdProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1Profile") int get_stdProfile(MemorySegment segment, long index) { return (int) VH_stdProfile.get(segment, 0L, index); }
    /// {@return `stdProfile`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1Profile") int get_stdProfile(MemorySegment segment) { return VkVideoDecodeAV1ProfileInfoKHR.get_stdProfile(segment, 0L); }
    /// {@return `stdProfile`}
    public @CType("StdVideoAV1Profile") int stdProfile() { return VkVideoDecodeAV1ProfileInfoKHR.get_stdProfile(this.segment()); }
    /// Sets `stdProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdProfile(MemorySegment segment, long index, @CType("StdVideoAV1Profile") int value) { VH_stdProfile.set(segment, 0L, index, value); }
    /// Sets `stdProfile` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdProfile(MemorySegment segment, @CType("StdVideoAV1Profile") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_stdProfile(segment, 0L, value); }
    /// Sets `stdProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(@CType("StdVideoAV1Profile") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_stdProfile(this.segment(), value); return this; }

    /// {@return `filmGrainSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_filmGrainSupport(MemorySegment segment, long index) { return (int) VH_filmGrainSupport.get(segment, 0L, index); }
    /// {@return `filmGrainSupport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_filmGrainSupport(MemorySegment segment) { return VkVideoDecodeAV1ProfileInfoKHR.get_filmGrainSupport(segment, 0L); }
    /// {@return `filmGrainSupport`}
    public @CType("VkBool32") int filmGrainSupport() { return VkVideoDecodeAV1ProfileInfoKHR.get_filmGrainSupport(this.segment()); }
    /// Sets `filmGrainSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filmGrainSupport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_filmGrainSupport.set(segment, 0L, index, value); }
    /// Sets `filmGrainSupport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filmGrainSupport(MemorySegment segment, @CType("VkBool32") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_filmGrainSupport(segment, 0L, value); }
    /// Sets `filmGrainSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(@CType("VkBool32") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_filmGrainSupport(this.segment(), value); return this; }

    /// A buffer of [VkVideoDecodeAV1ProfileInfoKHR].
    public static final class Buffer extends VkVideoDecodeAV1ProfileInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeAV1ProfileInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
        public VkVideoDecodeAV1ProfileInfoKHR asSlice(long index) { return new VkVideoDecodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeAV1ProfileInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeAV1ProfileInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1ProfileInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stdProfile` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1Profile") int stdProfileAt(long index) { return VkVideoDecodeAV1ProfileInfoKHR.get_stdProfile(this.segment(), index); }
        /// Sets `stdProfile` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdProfileAt(long index, @CType("StdVideoAV1Profile") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_stdProfile(this.segment(), index, value); return this; }

        /// {@return `filmGrainSupport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int filmGrainSupportAt(long index) { return VkVideoDecodeAV1ProfileInfoKHR.get_filmGrainSupport(this.segment(), index); }
        /// Sets `filmGrainSupport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filmGrainSupportAt(long index, @CType("VkBool32") int value) { VkVideoDecodeAV1ProfileInfoKHR.set_filmGrainSupport(this.segment(), index, value); return this; }

    }
}
