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
/// ### rayTracingMaintenance1
/// [VarHandle][#VH_rayTracingMaintenance1] - [Getter][#rayTracingMaintenance1()] - [Setter][#rayTracingMaintenance1(int)]
/// ### rayTracingPipelineTraceRaysIndirect2
/// [VarHandle][#VH_rayTracingPipelineTraceRaysIndirect2] - [Getter][#rayTracingPipelineTraceRaysIndirect2()] - [Setter][#rayTracingPipelineTraceRaysIndirect2(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 rayTracingMaintenance1;
///     VkBool32 rayTracingPipelineTraceRaysIndirect2;
/// } VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR;
/// ```
public sealed class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `rayTracingMaintenance1` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingMaintenance1"));
    /// The [VarHandle] of `rayTracingPipelineTraceRaysIndirect2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int rayTracingMaintenance1, @CType("VkBool32") int rayTracingPipelineTraceRaysIndirect2) { return alloc(allocator).sType(sType).pNext(pNext).rayTracingMaintenance1(rayTracingMaintenance1).rayTracingPipelineTraceRaysIndirect2(rayTracingPipelineTraceRaysIndirect2); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR copyFrom(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `rayTracingMaintenance1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingMaintenance1(MemorySegment segment, long index) { return (int) VH_rayTracingMaintenance1.get(segment, 0L, index); }
    /// {@return `rayTracingMaintenance1`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingMaintenance1(MemorySegment segment) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingMaintenance1(segment, 0L); }
    /// {@return `rayTracingMaintenance1`}
    public @CType("VkBool32") int rayTracingMaintenance1() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingMaintenance1(this.segment()); }
    /// Sets `rayTracingMaintenance1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingMaintenance1(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingMaintenance1.set(segment, 0L, index, value); }
    /// Sets `rayTracingMaintenance1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingMaintenance1(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingMaintenance1(segment, 0L, value); }
    /// Sets `rayTracingMaintenance1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingMaintenance1(this.segment(), value); return this; }

    /// {@return `rayTracingPipelineTraceRaysIndirect2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingPipelineTraceRaysIndirect2(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect2.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineTraceRaysIndirect2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingPipelineTraceRaysIndirect2(MemorySegment segment) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingPipelineTraceRaysIndirect2(segment, 0L); }
    /// {@return `rayTracingPipelineTraceRaysIndirect2`}
    public @CType("VkBool32") int rayTracingPipelineTraceRaysIndirect2() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingPipelineTraceRaysIndirect2(this.segment()); }
    /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingPipelineTraceRaysIndirect2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingPipelineTraceRaysIndirect2.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingPipelineTraceRaysIndirect2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingPipelineTraceRaysIndirect2(segment, 0L, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingPipelineTraceRaysIndirect2(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `rayTracingMaintenance1` at the given index}
        /// @param index the index
        public @CType("VkBool32") int rayTracingMaintenance1At(long index) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingMaintenance1(this.segment(), index); }
        /// Sets `rayTracingMaintenance1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingMaintenance1At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingMaintenance1(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipelineTraceRaysIndirect2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int rayTracingPipelineTraceRaysIndirect2At(long index) { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.get_rayTracingPipelineTraceRaysIndirect2(this.segment(), index); }
        /// Sets `rayTracingPipelineTraceRaysIndirect2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineTraceRaysIndirect2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.set_rayTracingPipelineTraceRaysIndirect2(this.segment(), index, value); return this; }

    }
}
