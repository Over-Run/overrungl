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
/// ### src
/// [Byte offset][#OFFSET_src] - [Memory layout][#ML_src] - [Getter][#src()] - [Setter][#src(MemorySegment)]
/// ### dst
/// [VarHandle][#VH_dst] - [Getter][#dst()] - [Setter][#dst(MemorySegment)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyMemoryToAccelerationStructureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceOrHostAddressConstKHR src;
///     VkAccelerationStructureKHR dst;
///     VkCopyAccelerationStructureModeKHR mode;
/// } VkCopyMemoryToAccelerationStructureInfoKHR;
/// ```
public sealed class VkCopyMemoryToAccelerationStructureInfoKHR extends Struct {
    /// The struct layout of `VkCopyMemoryToAccelerationStructureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `src`.
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    /// The memory layout of `src`.
    public static final MemoryLayout ML_src = LAYOUT.select(PathElement.groupElement("src"));
    /// The [VarHandle] of `dst` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dst = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkCopyMemoryToAccelerationStructureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToAccelerationStructureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryToAccelerationStructureInfoKHR(segment); }

    /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToAccelerationStructureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyMemoryToAccelerationStructureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToAccelerationStructureInfoKHR`
    public static VkCopyMemoryToAccelerationStructureInfoKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryToAccelerationStructureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryToAccelerationStructureInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyMemoryToAccelerationStructureInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToAccelerationStructureInfoKHR`
    public static VkCopyMemoryToAccelerationStructureInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment src, @CType("VkAccelerationStructureKHR") MemorySegment dst, @CType("VkCopyAccelerationStructureModeKHR") int mode) { return alloc(allocator).sType(sType).pNext(pNext).src(src).dst(dst).mode(mode); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR copyFrom(VkCopyMemoryToAccelerationStructureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyMemoryToAccelerationStructureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR sType(@CType("VkStructureType") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCopyMemoryToAccelerationStructureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR pNext(@CType("const void *") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_src(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_src, index), ML_src); }
    /// {@return `src`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_src(MemorySegment segment) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_src(segment, 0L); }
    /// {@return `src`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment src() { return VkCopyMemoryToAccelerationStructureInfoKHR.get_src(this.segment()); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_src(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_src, index), ML_src.byteSize()); }
    /// Sets `src` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_src(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_src(segment, 0L, value); }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR src(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_src(this.segment(), value); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureKHR") MemorySegment get_dst(MemorySegment segment, long index) { return (MemorySegment) VH_dst.get(segment, 0L, index); }
    /// {@return `dst`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureKHR") MemorySegment get_dst(MemorySegment segment) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_dst(segment, 0L); }
    /// {@return `dst`}
    public @CType("VkAccelerationStructureKHR") MemorySegment dst() { return VkCopyMemoryToAccelerationStructureInfoKHR.get_dst(this.segment()); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dst(MemorySegment segment, long index, @CType("VkAccelerationStructureKHR") MemorySegment value) { VH_dst.set(segment, 0L, index, value); }
    /// Sets `dst` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dst(MemorySegment segment, @CType("VkAccelerationStructureKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_dst(segment, 0L, value); }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR dst(@CType("VkAccelerationStructureKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_dst(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCopyAccelerationStructureModeKHR") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkCopyAccelerationStructureModeKHR") int get_mode(MemorySegment segment) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_mode(segment, 0L); }
    /// {@return `mode`}
    public @CType("VkCopyAccelerationStructureModeKHR") int mode() { return VkCopyMemoryToAccelerationStructureInfoKHR.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkCopyAccelerationStructureModeKHR") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToAccelerationStructureInfoKHR mode(@CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_mode(this.segment(), value); return this; }

    /// A buffer of [VkCopyMemoryToAccelerationStructureInfoKHR].
    public static final class Buffer extends VkCopyMemoryToAccelerationStructureInfoKHR {
        private final long elementCount;

        /// Creates `VkCopyMemoryToAccelerationStructureInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyMemoryToAccelerationStructureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyMemoryToAccelerationStructureInfoKHR`
        public VkCopyMemoryToAccelerationStructureInfoKHR asSlice(long index) { return new VkCopyMemoryToAccelerationStructureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyMemoryToAccelerationStructureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyMemoryToAccelerationStructureInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `src` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment srcAt(long index) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_src(this.segment(), index); }
        /// Sets `src` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_src(this.segment(), index, value); return this; }

        /// {@return `dst` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureKHR") MemorySegment dstAt(long index) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_dst(this.segment(), index); }
        /// Sets `dst` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstAt(long index, @CType("VkAccelerationStructureKHR") MemorySegment value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_dst(this.segment(), index, value); return this; }

        /// {@return `mode` at the given index}
        /// @param index the index
        public @CType("VkCopyAccelerationStructureModeKHR") int modeAt(long index) { return VkCopyMemoryToAccelerationStructureInfoKHR.get_mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, @CType("VkCopyAccelerationStructureModeKHR") int value) { VkCopyMemoryToAccelerationStructureInfoKHR.set_mode(this.segment(), index, value); return this; }

    }
}
