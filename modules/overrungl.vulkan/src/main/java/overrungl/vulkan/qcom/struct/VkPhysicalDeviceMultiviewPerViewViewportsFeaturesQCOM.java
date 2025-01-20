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
package overrungl.vulkan.qcom.struct;

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
/// ### multiviewPerViewViewports
/// [VarHandle][#VH_multiviewPerViewViewports] - [Getter][#multiviewPerViewViewports()] - [Setter][#multiviewPerViewViewports(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 multiviewPerViewViewports;
/// } VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM;
/// ```
public sealed class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `multiviewPerViewViewports` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewPerViewViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewPerViewViewports"));

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int multiviewPerViewViewports) { return alloc(allocator).sType(sType).pNext(pNext).multiviewPerViewViewports(multiviewPerViewViewports); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM copyFrom(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `multiviewPerViewViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewPerViewViewports(MemorySegment segment, long index) { return (int) VH_multiviewPerViewViewports.get(segment, 0L, index); }
    /// {@return `multiviewPerViewViewports`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewPerViewViewports(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(segment, 0L); }
    /// {@return `multiviewPerViewViewports`}
    public @CType("VkBool32") int multiviewPerViewViewports() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(this.segment()); }
    /// Sets `multiviewPerViewViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewPerViewViewports(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewPerViewViewports.set(segment, 0L, index, value); }
    /// Sets `multiviewPerViewViewports` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewPerViewViewports(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(segment, 0L, value); }
    /// Sets `multiviewPerViewViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(@CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM].
    public static final class Buffer extends VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
        public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `multiviewPerViewViewports` at the given index}
        /// @param index the index
        public @CType("VkBool32") int multiviewPerViewViewportsAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(this.segment(), index); }
        /// Sets `multiviewPerViewViewports` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer multiviewPerViewViewportsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(this.segment(), index, value); return this; }

    }
}
