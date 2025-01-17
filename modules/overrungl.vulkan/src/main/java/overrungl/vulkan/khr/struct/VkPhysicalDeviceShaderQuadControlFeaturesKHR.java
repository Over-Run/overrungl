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
/// ### shaderQuadControl
/// [VarHandle][#VH_shaderQuadControl] - [Getter][#shaderQuadControl()] - [Setter][#shaderQuadControl(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderQuadControlFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderQuadControl;
/// } VkPhysicalDeviceShaderQuadControlFeaturesKHR;
/// ```
public sealed class VkPhysicalDeviceShaderQuadControlFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderQuadControlFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderQuadControl")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderQuadControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderQuadControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderQuadControl"));

    /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderQuadControlFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderQuadControlFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderQuadControlFeaturesKHR`
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderQuadControlFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderQuadControlFeaturesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderQuadControlFeaturesKHR`
    public static VkPhysicalDeviceShaderQuadControlFeaturesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int shaderQuadControl) { return alloc(allocator).sType(sType).pNext(pNext).shaderQuadControl(shaderQuadControl); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR copyFrom(VkPhysicalDeviceShaderQuadControlFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderQuadControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderQuadControl(MemorySegment segment, long index) { return (int) VH_shaderQuadControl.get(segment, 0L, index); }
    /// {@return `shaderQuadControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderQuadControl(MemorySegment segment) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_shaderQuadControl(segment, 0L); }
    /// {@return `shaderQuadControl`}
    public @CType("VkBool32") int shaderQuadControl() { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_shaderQuadControl(this.segment()); }
    /// Sets `shaderQuadControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderQuadControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderQuadControl.set(segment, 0L, index, value); }
    /// Sets `shaderQuadControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderQuadControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_shaderQuadControl(segment, 0L, value); }
    /// Sets `shaderQuadControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderQuadControlFeaturesKHR shaderQuadControl(@CType("VkBool32") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_shaderQuadControl(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderQuadControlFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceShaderQuadControlFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderQuadControlFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderQuadControlFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderQuadControlFeaturesKHR`
        public VkPhysicalDeviceShaderQuadControlFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderQuadControlFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderQuadControlFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderQuadControlFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderQuadControl` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderQuadControlAt(long index) { return VkPhysicalDeviceShaderQuadControlFeaturesKHR.get_shaderQuadControl(this.segment(), index); }
        /// Sets `shaderQuadControl` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderQuadControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderQuadControlFeaturesKHR.set_shaderQuadControl(this.segment(), index, value); return this; }

    }
}
