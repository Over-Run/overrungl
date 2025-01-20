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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### shaderFloatControls2
/// [VarHandle][#VH_shaderFloatControls2] - [Getter][#shaderFloatControls2()] - [Setter][#shaderFloatControls2(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderFloatControls2Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderFloatControls2;
/// } VkPhysicalDeviceShaderFloatControls2Features;
/// ```
public sealed class VkPhysicalDeviceShaderFloatControls2Features extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderFloatControls2Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderFloatControls2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloatControls2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloatControls2"));

    /// Creates `VkPhysicalDeviceShaderFloatControls2Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderFloatControls2Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderFloatControls2Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloatControls2Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloatControls2Features(segment); }

    /// Creates `VkPhysicalDeviceShaderFloatControls2Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderFloatControls2Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloatControls2Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloatControls2Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderFloatControls2Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderFloatControls2Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderFloatControls2Features`
    public static VkPhysicalDeviceShaderFloatControls2Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloatControls2Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderFloatControls2Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderFloatControls2Features`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderFloatControls2Features` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderFloatControls2Features`
    public static VkPhysicalDeviceShaderFloatControls2Features allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int shaderFloatControls2) { return alloc(allocator).sType(sType).pNext(pNext).shaderFloatControls2(shaderFloatControls2); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderFloatControls2Features copyFrom(VkPhysicalDeviceShaderFloatControls2Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderFloatControls2Features.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderFloatControls2Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloatControls2Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderFloatControls2Features.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceShaderFloatControls2Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderFloatControls2Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloatControls2Features pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceShaderFloatControls2Features.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderFloatControls2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloatControls2(MemorySegment segment, long index) { return (int) VH_shaderFloatControls2.get(segment, 0L, index); }
    /// {@return `shaderFloatControls2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloatControls2(MemorySegment segment) { return VkPhysicalDeviceShaderFloatControls2Features.get_shaderFloatControls2(segment, 0L); }
    /// {@return `shaderFloatControls2`}
    public @CType("VkBool32") int shaderFloatControls2() { return VkPhysicalDeviceShaderFloatControls2Features.get_shaderFloatControls2(this.segment()); }
    /// Sets `shaderFloatControls2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloatControls2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloatControls2.set(segment, 0L, index, value); }
    /// Sets `shaderFloatControls2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloatControls2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_shaderFloatControls2(segment, 0L, value); }
    /// Sets `shaderFloatControls2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloatControls2Features shaderFloatControls2(@CType("VkBool32") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_shaderFloatControls2(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderFloatControls2Features].
    public static final class Buffer extends VkPhysicalDeviceShaderFloatControls2Features {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderFloatControls2Features.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderFloatControls2Features`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderFloatControls2Features`
        public VkPhysicalDeviceShaderFloatControls2Features asSlice(long index) { return new VkPhysicalDeviceShaderFloatControls2Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderFloatControls2Features`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderFloatControls2Features`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderFloatControls2Features.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderFloatControls2Features.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderFloatControls2Features.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderFloatControls2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderFloatControls2At(long index) { return VkPhysicalDeviceShaderFloatControls2Features.get_shaderFloatControls2(this.segment(), index); }
        /// Sets `shaderFloatControls2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderFloatControls2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderFloatControls2Features.set_shaderFloatControls2(this.segment(), index, value); return this; }

    }
}
