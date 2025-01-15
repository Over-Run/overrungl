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
/// ### profileCount
/// [VarHandle][#VH_profileCount] - [Getter][#profileCount()] - [Setter][#profileCount(int)]
/// ### pProfiles
/// [VarHandle][#VH_pProfiles] - [Getter][#pProfiles()] - [Setter][#pProfiles(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoProfileListInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t profileCount;
///     const VkVideoProfileInfoKHR * pProfiles;
/// } VkVideoProfileListInfoKHR;
/// ```
public sealed class VkVideoProfileListInfoKHR extends Struct {
    /// The struct layout of `VkVideoProfileListInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("profileCount"),
        ValueLayout.ADDRESS.withName("pProfiles")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `profileCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_profileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("profileCount"));
    /// The [VarHandle] of `pProfiles` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pProfiles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pProfiles"));

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoProfileListInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileListInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileListInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoProfileListInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoProfileListInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileListInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoProfileListInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileListInfoKHR`
    public static VkVideoProfileListInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int profileCount, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment pProfiles) { return alloc(allocator).sType(sType).pNext(pNext).profileCount(profileCount).pProfiles(pProfiles); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoProfileListInfoKHR copyFrom(VkVideoProfileListInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoProfileListInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoProfileListInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoProfileListInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR sType(@CType("VkStructureType") int value) { VkVideoProfileListInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoProfileListInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoProfileListInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `profileCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_profileCount(MemorySegment segment, long index) { return (int) VH_profileCount.get(segment, 0L, index); }
    /// {@return `profileCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_profileCount(MemorySegment segment) { return VkVideoProfileListInfoKHR.get_profileCount(segment, 0L); }
    /// {@return `profileCount`}
    public @CType("uint32_t") int profileCount() { return VkVideoProfileListInfoKHR.get_profileCount(this.segment()); }
    /// Sets `profileCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_profileCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_profileCount.set(segment, 0L, index, value); }
    /// Sets `profileCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_profileCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoProfileListInfoKHR.set_profileCount(segment, 0L, value); }
    /// Sets `profileCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR profileCount(@CType("uint32_t") int value) { VkVideoProfileListInfoKHR.set_profileCount(this.segment(), value); return this; }

    /// {@return `pProfiles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment get_pProfiles(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pProfiles.get(segment, 0L, index); }
    /// {@return `pProfiles`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment get_pProfiles(MemorySegment segment) { return VkVideoProfileListInfoKHR.get_pProfiles(segment, 0L); }
    /// {@return `pProfiles`}
    public @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment pProfiles() { return VkVideoProfileListInfoKHR.get_pProfiles(this.segment()); }
    /// Sets `pProfiles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pProfiles(MemorySegment segment, long index, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pProfiles.set(segment, 0L, index, value); }
    /// Sets `pProfiles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pProfiles(MemorySegment segment, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pProfiles(segment, 0L, value); }
    /// Sets `pProfiles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileListInfoKHR pProfiles(@CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pProfiles(this.segment(), value); return this; }

    /// A buffer of [VkVideoProfileListInfoKHR].
    public static final class Buffer extends VkVideoProfileListInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoProfileListInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoProfileListInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoProfileListInfoKHR`
        public VkVideoProfileListInfoKHR asSlice(long index) { return new VkVideoProfileListInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoProfileListInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoProfileListInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoProfileListInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoProfileListInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoProfileListInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `profileCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int profileCountAt(long index) { return VkVideoProfileListInfoKHR.get_profileCount(this.segment(), index); }
        /// Sets `profileCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer profileCountAt(long index, @CType("uint32_t") int value) { VkVideoProfileListInfoKHR.set_profileCount(this.segment(), index, value); return this; }

        /// {@return `pProfiles` at the given index}
        /// @param index the index
        public @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment pProfilesAt(long index) { return VkVideoProfileListInfoKHR.get_pProfiles(this.segment(), index); }
        /// Sets `pProfiles` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pProfilesAt(long index, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoProfileListInfoKHR.set_pProfiles(this.segment(), index, value); return this; }

    }
}
