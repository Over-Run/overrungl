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
/// ### meshAndTaskShaderDerivatives
/// [VarHandle][#VH_meshAndTaskShaderDerivatives] - [Getter][#meshAndTaskShaderDerivatives()] - [Setter][#meshAndTaskShaderDerivatives(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 meshAndTaskShaderDerivatives;
/// } VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("meshAndTaskShaderDerivatives")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `meshAndTaskShaderDerivatives` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_meshAndTaskShaderDerivatives = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshAndTaskShaderDerivatives"));

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int meshAndTaskShaderDerivatives) { return alloc(allocator).sType(sType).pNext(pNext).meshAndTaskShaderDerivatives(meshAndTaskShaderDerivatives); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR copyFrom(VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `meshAndTaskShaderDerivatives` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_meshAndTaskShaderDerivatives(MemorySegment segment, long index) { return (int) VH_meshAndTaskShaderDerivatives.get(segment, 0L, index); }
    /// {@return `meshAndTaskShaderDerivatives`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_meshAndTaskShaderDerivatives(MemorySegment segment) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_meshAndTaskShaderDerivatives(segment, 0L); }
    /// {@return `meshAndTaskShaderDerivatives`}
    public @CType("VkBool32") int meshAndTaskShaderDerivatives() { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_meshAndTaskShaderDerivatives(this.segment()); }
    /// Sets `meshAndTaskShaderDerivatives` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_meshAndTaskShaderDerivatives(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_meshAndTaskShaderDerivatives.set(segment, 0L, index, value); }
    /// Sets `meshAndTaskShaderDerivatives` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_meshAndTaskShaderDerivatives(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_meshAndTaskShaderDerivatives(segment, 0L, value); }
    /// Sets `meshAndTaskShaderDerivatives` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR meshAndTaskShaderDerivatives(@CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_meshAndTaskShaderDerivatives(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`
        public VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `meshAndTaskShaderDerivatives` at the given index}
        /// @param index the index
        public @CType("VkBool32") int meshAndTaskShaderDerivativesAt(long index) { return VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.get_meshAndTaskShaderDerivatives(this.segment(), index); }
        /// Sets `meshAndTaskShaderDerivatives` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer meshAndTaskShaderDerivativesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.set_meshAndTaskShaderDerivatives(this.segment(), index, value); return this; }

    }
}
