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
/// ### shaderSubgroupRotate
/// [VarHandle][#VH_shaderSubgroupRotate] - [Getter][#shaderSubgroupRotate()] - [Setter][#shaderSubgroupRotate(int)]
/// ### shaderSubgroupRotateClustered
/// [VarHandle][#VH_shaderSubgroupRotateClustered] - [Getter][#shaderSubgroupRotateClustered()] - [Setter][#shaderSubgroupRotateClustered(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderSubgroupRotateFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
/// } VkPhysicalDeviceShaderSubgroupRotateFeatures;
/// ```
public sealed class VkPhysicalDeviceShaderSubgroupRotateFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderSubgroupRotateFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderSubgroupRotate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupRotate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotate"));
    /// The [VarHandle] of `shaderSubgroupRotateClustered` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupRotateClustered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));

    /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderSubgroupRotateFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment); }

    /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupRotateFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderSubgroupRotateFeatures`
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderSubgroupRotateFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderSubgroupRotateFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderSubgroupRotateFeatures`
    public static VkPhysicalDeviceShaderSubgroupRotateFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int shaderSubgroupRotate, @CType("VkBool32") int shaderSubgroupRotateClustered) { return alloc(allocator).sType(sType).pNext(pNext).shaderSubgroupRotate(shaderSubgroupRotate).shaderSubgroupRotateClustered(shaderSubgroupRotateClustered); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupRotateFeatures copyFrom(VkPhysicalDeviceShaderSubgroupRotateFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupRotateFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupRotateFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderSubgroupRotate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupRotate(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotate.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupRotate(MemorySegment segment) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotate(segment, 0L); }
    /// {@return `shaderSubgroupRotate`}
    public @CType("VkBool32") int shaderSubgroupRotate() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotate(this.segment()); }
    /// Sets `shaderSubgroupRotate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupRotate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupRotate.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupRotate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotate(segment, 0L, value); }
    /// Sets `shaderSubgroupRotate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotate(@CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotate(this.segment(), value); return this; }

    /// {@return `shaderSubgroupRotateClustered` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupRotateClustered(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotateClustered.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotateClustered`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupRotateClustered(MemorySegment segment) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotateClustered(segment, 0L); }
    /// {@return `shaderSubgroupRotateClustered`}
    public @CType("VkBool32") int shaderSubgroupRotateClustered() { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotateClustered(this.segment()); }
    /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupRotateClustered(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupRotateClustered.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotateClustered` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupRotateClustered(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotateClustered(segment, 0L, value); }
    /// Sets `shaderSubgroupRotateClustered` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupRotateFeatures shaderSubgroupRotateClustered(@CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotateClustered(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderSubgroupRotateFeatures].
    public static final class Buffer extends VkPhysicalDeviceShaderSubgroupRotateFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderSubgroupRotateFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderSubgroupRotateFeatures`
        public VkPhysicalDeviceShaderSubgroupRotateFeatures asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupRotateFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderSubgroupRotateFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderSubgroupRotateFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderSubgroupRotate` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSubgroupRotateAt(long index) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotate(this.segment(), index); }
        /// Sets `shaderSubgroupRotate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSubgroupRotateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotate(this.segment(), index, value); return this; }

        /// {@return `shaderSubgroupRotateClustered` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSubgroupRotateClusteredAt(long index) { return VkPhysicalDeviceShaderSubgroupRotateFeatures.get_shaderSubgroupRotateClustered(this.segment(), index); }
        /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSubgroupRotateClusteredAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderSubgroupRotateFeatures.set_shaderSubgroupRotateClustered(this.segment(), index, value); return this; }

    }
}
