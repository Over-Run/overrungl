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
/// ### shaderZeroInitializeWorkgroupMemory
/// [VarHandle][#VH_shaderZeroInitializeWorkgroupMemory] - [Getter][#shaderZeroInitializeWorkgroupMemory()] - [Setter][#shaderZeroInitializeWorkgroupMemory(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderZeroInitializeWorkgroupMemory;
/// } VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures;
/// ```
public sealed class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderZeroInitializeWorkgroupMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderZeroInitializeWorkgroupMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderZeroInitializeWorkgroupMemory"));

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int shaderZeroInitializeWorkgroupMemory) { return alloc(allocator).sType(sType).pNext(pNext).shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures copyFrom(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index) { return (int) VH_shaderZeroInitializeWorkgroupMemory.get(segment, 0L, index); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderZeroInitializeWorkgroupMemory(MemorySegment segment) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_shaderZeroInitializeWorkgroupMemory(segment, 0L); }
    /// {@return `shaderZeroInitializeWorkgroupMemory`}
    public @CType("VkBool32") int shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_shaderZeroInitializeWorkgroupMemory(this.segment()); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderZeroInitializeWorkgroupMemory.set(segment, 0L, index, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderZeroInitializeWorkgroupMemory(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_shaderZeroInitializeWorkgroupMemory(segment, 0L, value); }
    /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures shaderZeroInitializeWorkgroupMemory(@CType("VkBool32") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_shaderZeroInitializeWorkgroupMemory(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures].
    public static final class Buffer extends VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures asSlice(long index) { return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderZeroInitializeWorkgroupMemory` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderZeroInitializeWorkgroupMemoryAt(long index) { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.get_shaderZeroInitializeWorkgroupMemory(this.segment(), index); }
        /// Sets `shaderZeroInitializeWorkgroupMemory` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderZeroInitializeWorkgroupMemoryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.set_shaderZeroInitializeWorkgroupMemory(this.segment(), index, value); return this; }

    }
}
