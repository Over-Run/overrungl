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
/// struct VkVideoProfileListInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t profileCount;
///     const VkVideoProfileInfoKHR* pProfiles;
/// };
/// ```
public final class VkVideoProfileListInfoKHR extends GroupType {
    /// The struct layout of `VkVideoProfileListInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("profileCount"),
        ValueLayout.ADDRESS.withName("pProfiles")
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
    /// The byte offset of `profileCount`.
    public static final long OFFSET_profileCount = LAYOUT.byteOffset(PathElement.groupElement("profileCount"));
    /// The memory layout of `profileCount`.
    public static final MemoryLayout LAYOUT_profileCount = LAYOUT.select(PathElement.groupElement("profileCount"));
    /// The [VarHandle] of `profileCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_profileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profileCount"));
    /// The byte offset of `pProfiles`.
    public static final long OFFSET_pProfiles = LAYOUT.byteOffset(PathElement.groupElement("pProfiles"));
    /// The memory layout of `pProfiles`.
    public static final MemoryLayout LAYOUT_pProfiles = LAYOUT.select(PathElement.groupElement("pProfiles"));
    /// The [VarHandle] of `pProfiles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pProfiles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfiles"));

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoProfileListInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileListInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileListInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileListInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileListInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoProfileListInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param profileCount `profileCount`
    /// @param pProfiles `pProfiles`
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int profileCount, MemorySegment pProfiles) {
        return alloc(allocator).sType(sType).pNext(pNext).profileCount(profileCount).pProfiles(pProfiles);
    }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param profileCount `profileCount`
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int profileCount) {
        return alloc(allocator).sType(sType).pNext(pNext).profileCount(profileCount);
    }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoProfileListInfoKHR copyFrom(VkVideoProfileListInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoProfileListInfoKHR reinterpret(long count) { return new VkVideoProfileListInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoProfileListInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoProfileListInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `profileCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int profileCount(MemorySegment segment, long index) { return (int) VH_profileCount.get(segment, 0L, index); }
    /// {@return `profileCount`}
    public int profileCount() { return profileCount(this.segment(), 0L); }
    /// Sets `profileCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void profileCount(MemorySegment segment, long index, int value) { VH_profileCount.set(segment, 0L, index, value); }
    /// Sets `profileCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR profileCount(int value) { profileCount(this.segment(), 0L, value); return this; }

    /// {@return `pProfiles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pProfiles(MemorySegment segment, long index) { return (MemorySegment) VH_pProfiles.get(segment, 0L, index); }
    /// {@return `pProfiles`}
    public MemorySegment pProfiles() { return pProfiles(this.segment(), 0L); }
    /// Sets `pProfiles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pProfiles(MemorySegment segment, long index, MemorySegment value) { VH_pProfiles.set(segment, 0L, index, value); }
    /// Sets `pProfiles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR pProfiles(MemorySegment value) { pProfiles(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoProfileListInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoProfileListInfoKHR`
    public VkVideoProfileListInfoKHR asSlice(long index) { return new VkVideoProfileListInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoProfileListInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoProfileListInfoKHR`
    public VkVideoProfileListInfoKHR asSlice(long index, long count) { return new VkVideoProfileListInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoProfileListInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoProfileListInfoKHR at(long index, Consumer<VkVideoProfileListInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `profileCount` at the given index}
    /// @param index the index of the struct buffer
    public int profileCountAt(long index) { return profileCount(this.segment(), index); }
    /// Sets `profileCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR profileCountAt(long index, int value) { profileCount(this.segment(), index, value); return this; }

    /// {@return `pProfiles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pProfilesAt(long index) { return pProfiles(this.segment(), index); }
    /// Sets `pProfiles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR pProfilesAt(long index, MemorySegment value) { pProfiles(this.segment(), index, value); return this; }

}
