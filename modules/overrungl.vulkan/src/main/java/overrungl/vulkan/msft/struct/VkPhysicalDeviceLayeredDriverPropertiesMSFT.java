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
package overrungl.vulkan.msft.struct;

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
/// ### underlyingAPI
/// [VarHandle][#VH_underlyingAPI] - [Getter][#underlyingAPI()] - [Setter][#underlyingAPI(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLayeredDriverPropertiesMSFT {
///     VkStructureType sType;
///     void * pNext;
///     VkLayeredDriverUnderlyingApiMSFT underlyingAPI;
/// } VkPhysicalDeviceLayeredDriverPropertiesMSFT;
/// ```
public sealed class VkPhysicalDeviceLayeredDriverPropertiesMSFT extends Struct {
    /// The struct layout of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("underlyingAPI")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `underlyingAPI` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_underlyingAPI = LAYOUT.arrayElementVarHandle(PathElement.groupElement("underlyingAPI"));

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkLayeredDriverUnderlyingApiMSFT") int underlyingAPI) { return alloc(allocator).sType(sType).pNext(pNext).underlyingAPI(underlyingAPI); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT copyFrom(VkPhysicalDeviceLayeredDriverPropertiesMSFT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_pNext(this.segment(), value); return this; }

    /// {@return `underlyingAPI` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLayeredDriverUnderlyingApiMSFT") int get_underlyingAPI(MemorySegment segment, long index) { return (int) VH_underlyingAPI.get(segment, 0L, index); }
    /// {@return `underlyingAPI`}
    /// @param segment the segment of the struct
    public static @CType("VkLayeredDriverUnderlyingApiMSFT") int get_underlyingAPI(MemorySegment segment) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_underlyingAPI(segment, 0L); }
    /// {@return `underlyingAPI`}
    public @CType("VkLayeredDriverUnderlyingApiMSFT") int underlyingAPI() { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_underlyingAPI(this.segment()); }
    /// Sets `underlyingAPI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_underlyingAPI(MemorySegment segment, long index, @CType("VkLayeredDriverUnderlyingApiMSFT") int value) { VH_underlyingAPI.set(segment, 0L, index, value); }
    /// Sets `underlyingAPI` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_underlyingAPI(MemorySegment segment, @CType("VkLayeredDriverUnderlyingApiMSFT") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_underlyingAPI(segment, 0L, value); }
    /// Sets `underlyingAPI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPI(@CType("VkLayeredDriverUnderlyingApiMSFT") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_underlyingAPI(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceLayeredDriverPropertiesMSFT].
    public static final class Buffer extends VkPhysicalDeviceLayeredDriverPropertiesMSFT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
        public VkPhysicalDeviceLayeredDriverPropertiesMSFT asSlice(long index) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `underlyingAPI` at the given index}
        /// @param index the index
        public @CType("VkLayeredDriverUnderlyingApiMSFT") int underlyingAPIAt(long index) { return VkPhysicalDeviceLayeredDriverPropertiesMSFT.get_underlyingAPI(this.segment(), index); }
        /// Sets `underlyingAPI` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer underlyingAPIAt(long index, @CType("VkLayeredDriverUnderlyingApiMSFT") int value) { VkPhysicalDeviceLayeredDriverPropertiesMSFT.set_underlyingAPI(this.segment(), index, value); return this; }

    }
}
