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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### protectedSubmit
/// [VarHandle][#VH_protectedSubmit] - [Getter][#protectedSubmit()] - [Setter][#protectedSubmit(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkProtectedSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 protectedSubmit;
/// } VkProtectedSubmitInfo;
/// ```
public sealed class VkProtectedSubmitInfo extends Struct {
    /// The struct layout of `VkProtectedSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("protectedSubmit")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `protectedSubmit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_protectedSubmit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedSubmit"));

    /// Creates `VkProtectedSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkProtectedSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkProtectedSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkProtectedSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkProtectedSubmitInfo(segment); }

    /// Creates `VkProtectedSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkProtectedSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkProtectedSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkProtectedSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkProtectedSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkProtectedSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkProtectedSubmitInfo`
    public static VkProtectedSubmitInfo alloc(SegmentAllocator allocator) { return new VkProtectedSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkProtectedSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkProtectedSubmitInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkProtectedSubmitInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkProtectedSubmitInfo`
    public static VkProtectedSubmitInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int protectedSubmit) { return alloc(allocator).sType(sType).pNext(pNext).protectedSubmit(protectedSubmit); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkProtectedSubmitInfo copyFrom(VkProtectedSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkProtectedSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkProtectedSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkProtectedSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkProtectedSubmitInfo sType(@CType("VkStructureType") int value) { VkProtectedSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkProtectedSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkProtectedSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkProtectedSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkProtectedSubmitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkProtectedSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `protectedSubmit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_protectedSubmit(MemorySegment segment, long index) { return (int) VH_protectedSubmit.get(segment, 0L, index); }
    /// {@return `protectedSubmit`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_protectedSubmit(MemorySegment segment) { return VkProtectedSubmitInfo.get_protectedSubmit(segment, 0L); }
    /// {@return `protectedSubmit`}
    public @CType("VkBool32") int protectedSubmit() { return VkProtectedSubmitInfo.get_protectedSubmit(this.segment()); }
    /// Sets `protectedSubmit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_protectedSubmit(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_protectedSubmit.set(segment, 0L, index, value); }
    /// Sets `protectedSubmit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_protectedSubmit(MemorySegment segment, @CType("VkBool32") int value) { VkProtectedSubmitInfo.set_protectedSubmit(segment, 0L, value); }
    /// Sets `protectedSubmit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkProtectedSubmitInfo protectedSubmit(@CType("VkBool32") int value) { VkProtectedSubmitInfo.set_protectedSubmit(this.segment(), value); return this; }

    /// A buffer of [VkProtectedSubmitInfo].
    public static final class Buffer extends VkProtectedSubmitInfo {
        private final long elementCount;

        /// Creates `VkProtectedSubmitInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkProtectedSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkProtectedSubmitInfo`
        public VkProtectedSubmitInfo asSlice(long index) { return new VkProtectedSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkProtectedSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkProtectedSubmitInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkProtectedSubmitInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkProtectedSubmitInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkProtectedSubmitInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkProtectedSubmitInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `protectedSubmit` at the given index}
        /// @param index the index
        public @CType("VkBool32") int protectedSubmitAt(long index) { return VkProtectedSubmitInfo.get_protectedSubmit(this.segment(), index); }
        /// Sets `protectedSubmit` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer protectedSubmitAt(long index, @CType("VkBool32") int value) { VkProtectedSubmitInfo.set_protectedSubmit(this.segment(), index, value); return this; }

    }
}
