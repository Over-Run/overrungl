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
package overrungl.vulkan.ext.struct;

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
/// ### imageSlicedViewOf3D
/// [VarHandle][#VH_imageSlicedViewOf3D] - [Getter][#imageSlicedViewOf3D()] - [Setter][#imageSlicedViewOf3D(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 imageSlicedViewOf3D;
/// } VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageSlicedViewOf3D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageSlicedViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSlicedViewOf3D"));

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int imageSlicedViewOf3D) { return alloc(allocator).sType(sType).pNext(pNext).imageSlicedViewOf3D(imageSlicedViewOf3D); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT copyFrom(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `imageSlicedViewOf3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_imageSlicedViewOf3D(MemorySegment segment, long index) { return (int) VH_imageSlicedViewOf3D.get(segment, 0L, index); }
    /// {@return `imageSlicedViewOf3D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_imageSlicedViewOf3D(MemorySegment segment) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_imageSlicedViewOf3D(segment, 0L); }
    /// {@return `imageSlicedViewOf3D`}
    public @CType("VkBool32") int imageSlicedViewOf3D() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_imageSlicedViewOf3D(this.segment()); }
    /// Sets `imageSlicedViewOf3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSlicedViewOf3D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_imageSlicedViewOf3D.set(segment, 0L, index, value); }
    /// Sets `imageSlicedViewOf3D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSlicedViewOf3D(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_imageSlicedViewOf3D(segment, 0L, value); }
    /// Sets `imageSlicedViewOf3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(@CType("VkBool32") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_imageSlicedViewOf3D(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageSlicedViewOf3D` at the given index}
        /// @param index the index
        public @CType("VkBool32") int imageSlicedViewOf3DAt(long index) { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.get_imageSlicedViewOf3D(this.segment(), index); }
        /// Sets `imageSlicedViewOf3D` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageSlicedViewOf3DAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.set_imageSlicedViewOf3D(this.segment(), index, value); return this; }

    }
}
