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
package overrungl.vulkan.amd.struct;

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
/// ### antiLag
/// [VarHandle][#VH_antiLag] - [Getter][#antiLag()] - [Setter][#antiLag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceAntiLagFeaturesAMD {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 antiLag;
/// } VkPhysicalDeviceAntiLagFeaturesAMD;
/// ```
public sealed class VkPhysicalDeviceAntiLagFeaturesAMD extends Struct {
    /// The struct layout of `VkPhysicalDeviceAntiLagFeaturesAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("antiLag")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `antiLag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_antiLag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("antiLag"));

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAntiLagFeaturesAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAntiLagFeaturesAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAntiLagFeaturesAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAntiLagFeaturesAMD`
    public static VkPhysicalDeviceAntiLagFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAntiLagFeaturesAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAntiLagFeaturesAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceAntiLagFeaturesAMD` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAntiLagFeaturesAMD`
    public static VkPhysicalDeviceAntiLagFeaturesAMD allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int antiLag) { return alloc(allocator).sType(sType).pNext(pNext).antiLag(antiLag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD copyFrom(VkPhysicalDeviceAntiLagFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceAntiLagFeaturesAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD sType(@CType("VkStructureType") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceAntiLagFeaturesAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `antiLag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_antiLag(MemorySegment segment, long index) { return (int) VH_antiLag.get(segment, 0L, index); }
    /// {@return `antiLag`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_antiLag(MemorySegment segment) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_antiLag(segment, 0L); }
    /// {@return `antiLag`}
    public @CType("VkBool32") int antiLag() { return VkPhysicalDeviceAntiLagFeaturesAMD.get_antiLag(this.segment()); }
    /// Sets `antiLag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_antiLag(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_antiLag.set(segment, 0L, index, value); }
    /// Sets `antiLag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_antiLag(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_antiLag(segment, 0L, value); }
    /// Sets `antiLag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(@CType("VkBool32") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_antiLag(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceAntiLagFeaturesAMD].
    public static final class Buffer extends VkPhysicalDeviceAntiLagFeaturesAMD {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceAntiLagFeaturesAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceAntiLagFeaturesAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceAntiLagFeaturesAMD`
        public VkPhysicalDeviceAntiLagFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceAntiLagFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceAntiLagFeaturesAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceAntiLagFeaturesAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_pNext(this.segment(), index, value); return this; }

        /// {@return `antiLag` at the given index}
        /// @param index the index
        public @CType("VkBool32") int antiLagAt(long index) { return VkPhysicalDeviceAntiLagFeaturesAMD.get_antiLag(this.segment(), index); }
        /// Sets `antiLag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer antiLagAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.set_antiLag(this.segment(), index, value); return this; }

    }
}
