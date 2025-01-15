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
/// ### transformFeedback
/// [VarHandle][#VH_transformFeedback] - [Getter][#transformFeedback()] - [Setter][#transformFeedback(int)]
/// ### geometryStreams
/// [VarHandle][#VH_geometryStreams] - [Getter][#geometryStreams()] - [Setter][#geometryStreams(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 transformFeedback;
///     VkBool32 geometryStreams;
/// } VkPhysicalDeviceTransformFeedbackFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transformFeedback"),
        ValueLayout.JAVA_INT.withName("geometryStreams")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `transformFeedback` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedback"));
    /// The [VarHandle] of `geometryStreams` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_geometryStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryStreams"));

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int transformFeedback, @CType("VkBool32") int geometryStreams) { return alloc(allocator).sType(sType).pNext(pNext).transformFeedback(transformFeedback).geometryStreams(geometryStreams); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT copyFrom(VkPhysicalDeviceTransformFeedbackFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `transformFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedback(MemorySegment segment, long index) { return (int) VH_transformFeedback.get(segment, 0L, index); }
    /// {@return `transformFeedback`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedback(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_transformFeedback(segment, 0L); }
    /// {@return `transformFeedback`}
    public @CType("VkBool32") int transformFeedback() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_transformFeedback(this.segment()); }
    /// Sets `transformFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedback(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedback.set(segment, 0L, index, value); }
    /// Sets `transformFeedback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedback(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_transformFeedback(segment, 0L, value); }
    /// Sets `transformFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedback(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_transformFeedback(this.segment(), value); return this; }

    /// {@return `geometryStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_geometryStreams(MemorySegment segment, long index) { return (int) VH_geometryStreams.get(segment, 0L, index); }
    /// {@return `geometryStreams`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_geometryStreams(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_geometryStreams(segment, 0L); }
    /// {@return `geometryStreams`}
    public @CType("VkBool32") int geometryStreams() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_geometryStreams(this.segment()); }
    /// Sets `geometryStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometryStreams(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_geometryStreams.set(segment, 0L, index, value); }
    /// Sets `geometryStreams` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometryStreams(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_geometryStreams(segment, 0L, value); }
    /// Sets `geometryStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreams(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_geometryStreams(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceTransformFeedbackFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceTransformFeedbackFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `transformFeedback` at the given index}
        /// @param index the index
        public @CType("VkBool32") int transformFeedbackAt(long index) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_transformFeedback(this.segment(), index); }
        /// Sets `transformFeedback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformFeedbackAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_transformFeedback(this.segment(), index, value); return this; }

        /// {@return `geometryStreams` at the given index}
        /// @param index the index
        public @CType("VkBool32") int geometryStreamsAt(long index) { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.get_geometryStreams(this.segment(), index); }
        /// Sets `geometryStreams` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer geometryStreamsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.set_geometryStreams(this.segment(), index, value); return this; }

    }
}
