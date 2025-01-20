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
/// ### cooperativeMatrixSupportedStages
/// [VarHandle][#VH_cooperativeMatrixSupportedStages] - [Getter][#cooperativeMatrixSupportedStages()] - [Setter][#cooperativeMatrixSupportedStages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCooperativeMatrixPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkShaderStageFlags cooperativeMatrixSupportedStages;
/// } VkPhysicalDeviceCooperativeMatrixPropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceCooperativeMatrixPropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixSupportedStages")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `cooperativeMatrixSupportedStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixSupportedStages"));

    /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCooperativeMatrixPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrixPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixPropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrixPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`
    public static VkPhysicalDeviceCooperativeMatrixPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrixPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrixPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`
    public static VkPhysicalDeviceCooperativeMatrixPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkShaderStageFlags") int cooperativeMatrixSupportedStages) { return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixSupportedStages(cooperativeMatrixSupportedStages); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixPropertiesKHR copyFrom(VkPhysicalDeviceCooperativeMatrixPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixPropertiesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixSupportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_cooperativeMatrixSupportedStages(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixSupportedStages.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixSupportedStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_cooperativeMatrixSupportedStages(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_cooperativeMatrixSupportedStages(segment, 0L); }
    /// {@return `cooperativeMatrixSupportedStages`}
    public @CType("VkShaderStageFlags") int cooperativeMatrixSupportedStages() { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_cooperativeMatrixSupportedStages(this.segment()); }
    /// Sets `cooperativeMatrixSupportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixSupportedStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_cooperativeMatrixSupportedStages.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixSupportedStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixSupportedStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_cooperativeMatrixSupportedStages(segment, 0L, value); }
    /// Sets `cooperativeMatrixSupportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrixPropertiesKHR cooperativeMatrixSupportedStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_cooperativeMatrixSupportedStages(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceCooperativeMatrixPropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceCooperativeMatrixPropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceCooperativeMatrixPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`
        public VkPhysicalDeviceCooperativeMatrixPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrixPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrixPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixSupportedStages` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int cooperativeMatrixSupportedStagesAt(long index) { return VkPhysicalDeviceCooperativeMatrixPropertiesKHR.get_cooperativeMatrixSupportedStages(this.segment(), index); }
        /// Sets `cooperativeMatrixSupportedStages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixSupportedStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceCooperativeMatrixPropertiesKHR.set_cooperativeMatrixSupportedStages(this.segment(), index, value); return this; }

    }
}
