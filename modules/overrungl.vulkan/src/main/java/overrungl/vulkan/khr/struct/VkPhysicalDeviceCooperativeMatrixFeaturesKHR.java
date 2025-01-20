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
/// ### cooperativeMatrix
/// [VarHandle][#VH_cooperativeMatrix] - [Getter][#cooperativeMatrix()] - [Setter][#cooperativeMatrix(int)]
/// ### cooperativeMatrixRobustBufferAccess
/// [VarHandle][#VH_cooperativeMatrixRobustBufferAccess] - [Getter][#cooperativeMatrixRobustBufferAccess()] - [Setter][#cooperativeMatrixRobustBufferAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCooperativeMatrixFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 cooperativeMatrix;
///     VkBool32 cooperativeMatrixRobustBufferAccess;
/// } VkPhysicalDeviceCooperativeMatrixFeaturesKHR;
/// ```
public sealed class VkPhysicalDeviceCooperativeMatrixFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrix"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixRobustBufferAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `cooperativeMatrix` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrix"));
    /// The [VarHandle] of `cooperativeMatrixRobustBufferAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixRobustBufferAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixRobustBufferAccess"));

    /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixFeaturesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int cooperativeMatrix, @CType("VkBool32") int cooperativeMatrixRobustBufferAccess) { return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrix(cooperativeMatrix).cooperativeMatrixRobustBufferAccess(cooperativeMatrixRobustBufferAccess); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR copyFrom(VkPhysicalDeviceCooperativeMatrixFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `cooperativeMatrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrix(MemorySegment segment, long index) { return (int) VH_cooperativeMatrix.get(segment, 0L, index); }
    /// {@return `cooperativeMatrix`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrix(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrix(segment, 0L); }
    /// {@return `cooperativeMatrix`}
    public @CType("VkBool32") int cooperativeMatrix() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrix(this.segment()); }
    /// Sets `cooperativeMatrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrix(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrix.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrix` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrix(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrix(segment, 0L, value); }
    /// Sets `cooperativeMatrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrix(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrix(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixRobustBufferAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cooperativeMatrixRobustBufferAccess(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixRobustBufferAccess.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixRobustBufferAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cooperativeMatrixRobustBufferAccess(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrixRobustBufferAccess(segment, 0L); }
    /// {@return `cooperativeMatrixRobustBufferAccess`}
    public @CType("VkBool32") int cooperativeMatrixRobustBufferAccess() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrixRobustBufferAccess(this.segment()); }
    /// Sets `cooperativeMatrixRobustBufferAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixRobustBufferAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cooperativeMatrixRobustBufferAccess.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixRobustBufferAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixRobustBufferAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrixRobustBufferAccess(segment, 0L, value); }
    /// Sets `cooperativeMatrixRobustBufferAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixRobustBufferAccess(@CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrixRobustBufferAccess(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceCooperativeMatrixFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceCooperativeMatrixFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrixFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrix` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixAt(long index) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrix(this.segment(), index); }
        /// Sets `cooperativeMatrix` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrix(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixRobustBufferAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int cooperativeMatrixRobustBufferAccessAt(long index) { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.get_cooperativeMatrixRobustBufferAccess(this.segment(), index); }
        /// Sets `cooperativeMatrixRobustBufferAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixRobustBufferAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.set_cooperativeMatrixRobustBufferAccess(this.segment(), index, value); return this; }

    }
}
