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
/// ### computeDerivativeGroupQuads
/// [VarHandle][#VH_computeDerivativeGroupQuads] - [Getter][#computeDerivativeGroupQuads()] - [Setter][#computeDerivativeGroupQuads(int)]
/// ### computeDerivativeGroupLinear
/// [VarHandle][#VH_computeDerivativeGroupLinear] - [Getter][#computeDerivativeGroupLinear()] - [Setter][#computeDerivativeGroupLinear(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 computeDerivativeGroupQuads;
///     VkBool32 computeDerivativeGroupLinear;
/// } VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR;
/// ```
public sealed class VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads"),
        ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `computeDerivativeGroupQuads` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeDerivativeGroupQuads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupQuads"));
    /// The [VarHandle] of `computeDerivativeGroupLinear` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeDerivativeGroupLinear = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeDerivativeGroupLinear"));

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`
    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int computeDerivativeGroupQuads, @CType("VkBool32") int computeDerivativeGroupLinear) { return alloc(allocator).sType(sType).pNext(pNext).computeDerivativeGroupQuads(computeDerivativeGroupQuads).computeDerivativeGroupLinear(computeDerivativeGroupLinear); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR copyFrom(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `computeDerivativeGroupQuads` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_computeDerivativeGroupQuads(MemorySegment segment, long index) { return (int) VH_computeDerivativeGroupQuads.get(segment, 0L, index); }
    /// {@return `computeDerivativeGroupQuads`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_computeDerivativeGroupQuads(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupQuads(segment, 0L); }
    /// {@return `computeDerivativeGroupQuads`}
    public @CType("VkBool32") int computeDerivativeGroupQuads() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupQuads(this.segment()); }
    /// Sets `computeDerivativeGroupQuads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeDerivativeGroupQuads(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_computeDerivativeGroupQuads.set(segment, 0L, index, value); }
    /// Sets `computeDerivativeGroupQuads` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeDerivativeGroupQuads(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupQuads(segment, 0L, value); }
    /// Sets `computeDerivativeGroupQuads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuads(@CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupQuads(this.segment(), value); return this; }

    /// {@return `computeDerivativeGroupLinear` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_computeDerivativeGroupLinear(MemorySegment segment, long index) { return (int) VH_computeDerivativeGroupLinear.get(segment, 0L, index); }
    /// {@return `computeDerivativeGroupLinear`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_computeDerivativeGroupLinear(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupLinear(segment, 0L); }
    /// {@return `computeDerivativeGroupLinear`}
    public @CType("VkBool32") int computeDerivativeGroupLinear() { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupLinear(this.segment()); }
    /// Sets `computeDerivativeGroupLinear` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeDerivativeGroupLinear(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_computeDerivativeGroupLinear.set(segment, 0L, index, value); }
    /// Sets `computeDerivativeGroupLinear` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeDerivativeGroupLinear(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupLinear(segment, 0L, value); }
    /// Sets `computeDerivativeGroupLinear` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinear(@CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupLinear(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `computeDerivativeGroupQuads` at the given index}
        /// @param index the index
        public @CType("VkBool32") int computeDerivativeGroupQuadsAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupQuads(this.segment(), index); }
        /// Sets `computeDerivativeGroupQuads` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer computeDerivativeGroupQuadsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupQuads(this.segment(), index, value); return this; }

        /// {@return `computeDerivativeGroupLinear` at the given index}
        /// @param index the index
        public @CType("VkBool32") int computeDerivativeGroupLinearAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.get_computeDerivativeGroupLinear(this.segment(), index); }
        /// Sets `computeDerivativeGroupLinear` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer computeDerivativeGroupLinearAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.set_computeDerivativeGroupLinear(this.segment(), index, value); return this; }

    }
}
