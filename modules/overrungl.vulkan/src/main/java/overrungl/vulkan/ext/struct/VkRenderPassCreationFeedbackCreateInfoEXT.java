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
/// ### pRenderPassFeedback
/// [VarHandle][#VH_pRenderPassFeedback] - [Getter][#pRenderPassFeedback()] - [Setter][#pRenderPassFeedback(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassCreationFeedbackCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPassCreationFeedbackInfoEXT * pRenderPassFeedback;
/// } VkRenderPassCreationFeedbackCreateInfoEXT;
/// ```
public sealed class VkRenderPassCreationFeedbackCreateInfoEXT extends Struct {
    /// The struct layout of `VkRenderPassCreationFeedbackCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pRenderPassFeedback")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pRenderPassFeedback` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRenderPassFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRenderPassFeedback"));

    /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreationFeedbackCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(segment); }

    /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreationFeedbackCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationFeedbackCreateInfoEXT`
    public static VkRenderPassCreationFeedbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassCreationFeedbackCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreationFeedbackCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassCreationFeedbackCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreationFeedbackCreateInfoEXT`
    public static VkRenderPassCreationFeedbackCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment pRenderPassFeedback) { return alloc(allocator).sType(sType).pNext(pNext).pRenderPassFeedback(pRenderPassFeedback); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreationFeedbackCreateInfoEXT copyFrom(VkRenderPassCreationFeedbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassCreationFeedbackCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackCreateInfoEXT sType(@CType("VkStructureType") int value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `pRenderPassFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment get_pRenderPassFeedback(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRenderPassFeedback.get(segment, 0L, index); }
    /// {@return `pRenderPassFeedback`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment get_pRenderPassFeedback(MemorySegment segment) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pRenderPassFeedback(segment, 0L); }
    /// {@return `pRenderPassFeedback`}
    public @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment pRenderPassFeedback() { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pRenderPassFeedback(this.segment()); }
    /// Sets `pRenderPassFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRenderPassFeedback(MemorySegment segment, long index, @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pRenderPassFeedback.set(segment, 0L, index, value); }
    /// Sets `pRenderPassFeedback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRenderPassFeedback(MemorySegment segment, @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pRenderPassFeedback(segment, 0L, value); }
    /// Sets `pRenderPassFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreationFeedbackCreateInfoEXT pRenderPassFeedback(@CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pRenderPassFeedback(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassCreationFeedbackCreateInfoEXT].
    public static final class Buffer extends VkRenderPassCreationFeedbackCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkRenderPassCreationFeedbackCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassCreationFeedbackCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassCreationFeedbackCreateInfoEXT`
        public VkRenderPassCreationFeedbackCreateInfoEXT asSlice(long index) { return new VkRenderPassCreationFeedbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassCreationFeedbackCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassCreationFeedbackCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pRenderPassFeedback` at the given index}
        /// @param index the index
        public @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment pRenderPassFeedbackAt(long index) { return VkRenderPassCreationFeedbackCreateInfoEXT.get_pRenderPassFeedback(this.segment(), index); }
        /// Sets `pRenderPassFeedback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRenderPassFeedbackAt(long index, @CType("VkRenderPassCreationFeedbackInfoEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassCreationFeedbackCreateInfoEXT.set_pRenderPassFeedback(this.segment(), index, value); return this; }

    }
}
