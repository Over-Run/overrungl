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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoDecodeAV1ProfileInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) StdVideoAV1Profile stdProfile;
///     (uint32_t) VkBool32 filmGrainSupport;
/// };
/// ```
public final class VkVideoDecodeAV1ProfileInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeAV1ProfileInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdProfile"),
        ValueLayout.JAVA_INT.withName("filmGrainSupport")
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
    /// The byte offset of `stdProfile`.
    public static final long OFFSET_stdProfile = LAYOUT.byteOffset(PathElement.groupElement("stdProfile"));
    /// The memory layout of `stdProfile`.
    public static final MemoryLayout LAYOUT_stdProfile = LAYOUT.select(PathElement.groupElement("stdProfile"));
    /// The [VarHandle] of `stdProfile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdProfile"));
    /// The byte offset of `filmGrainSupport`.
    public static final long OFFSET_filmGrainSupport = LAYOUT.byteOffset(PathElement.groupElement("filmGrainSupport"));
    /// The memory layout of `filmGrainSupport`.
    public static final MemoryLayout LAYOUT_filmGrainSupport = LAYOUT.select(PathElement.groupElement("filmGrainSupport"));
    /// The [VarHandle] of `filmGrainSupport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filmGrainSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filmGrainSupport"));

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeAV1ProfileInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeAV1ProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1ProfileInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1ProfileInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1ProfileInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdProfile `stdProfile`
    /// @param filmGrainSupport `filmGrainSupport`
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdProfile, int filmGrainSupport) {
        return alloc(allocator).sType(sType).pNext(pNext).stdProfile(stdProfile).filmGrainSupport(filmGrainSupport);
    }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdProfile `stdProfile`
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdProfile) {
        return alloc(allocator).sType(sType).pNext(pNext).stdProfile(stdProfile);
    }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoDecodeAV1ProfileInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoDecodeAV1ProfileInfoKHR`
    public static VkVideoDecodeAV1ProfileInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR copyFrom(VkVideoDecodeAV1ProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeAV1ProfileInfoKHR reinterpret(long count) { return new VkVideoDecodeAV1ProfileInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeAV1ProfileInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeAV1ProfileInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stdProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdProfile(MemorySegment segment, long index) { return (int) VH_stdProfile.get(segment, 0L, index); }
    /// {@return `stdProfile`}
    public int stdProfile() { return stdProfile(this.segment(), 0L); }
    /// Sets `stdProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdProfile(MemorySegment segment, long index, int value) { VH_stdProfile.set(segment, 0L, index, value); }
    /// Sets `stdProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR stdProfile(int value) { stdProfile(this.segment(), 0L, value); return this; }

    /// {@return `filmGrainSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filmGrainSupport(MemorySegment segment, long index) { return (int) VH_filmGrainSupport.get(segment, 0L, index); }
    /// {@return `filmGrainSupport`}
    public int filmGrainSupport() { return filmGrainSupport(this.segment(), 0L); }
    /// Sets `filmGrainSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filmGrainSupport(MemorySegment segment, long index, int value) { VH_filmGrainSupport.set(segment, 0L, index, value); }
    /// Sets `filmGrainSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupport(int value) { filmGrainSupport(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
    public VkVideoDecodeAV1ProfileInfoKHR asSlice(long index) { return new VkVideoDecodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeAV1ProfileInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeAV1ProfileInfoKHR`
    public VkVideoDecodeAV1ProfileInfoKHR asSlice(long index, long count) { return new VkVideoDecodeAV1ProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeAV1ProfileInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR at(long index, Consumer<VkVideoDecodeAV1ProfileInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stdProfile` at the given index}
    /// @param index the index of the struct buffer
    public int stdProfileAt(long index) { return stdProfile(this.segment(), index); }
    /// Sets `stdProfile` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR stdProfileAt(long index, int value) { stdProfile(this.segment(), index, value); return this; }

    /// {@return `filmGrainSupport` at the given index}
    /// @param index the index of the struct buffer
    public int filmGrainSupportAt(long index) { return filmGrainSupport(this.segment(), index); }
    /// Sets `filmGrainSupport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1ProfileInfoKHR filmGrainSupportAt(long index, int value) { filmGrainSupport(this.segment(), index, value); return this; }

}
