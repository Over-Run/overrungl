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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachmentSamples
/// [VarHandle][#VH_pColorAttachmentSamples] - [Getter][#pColorAttachmentSamples()] - [Setter][#pColorAttachmentSamples(java.lang.foreign.MemorySegment)]
/// ### depthStencilAttachmentSamples
/// [VarHandle][#VH_depthStencilAttachmentSamples] - [Getter][#depthStencilAttachmentSamples()] - [Setter][#depthStencilAttachmentSamples(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentSampleCountInfoAMD {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t colorAttachmentCount;
///     const VkSampleCountFlagBits * pColorAttachmentSamples;
///     VkSampleCountFlagBits depthStencilAttachmentSamples;
/// } VkAttachmentSampleCountInfoAMD;
/// ```
public sealed class VkAttachmentSampleCountInfoAMD extends Struct {
    /// The struct layout of `VkAttachmentSampleCountInfoAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachmentSamples` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentSamples"));
    /// The [VarHandle] of `depthStencilAttachmentSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthStencilAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilAttachmentSamples"));

    /// Creates `VkAttachmentSampleCountInfoAMD` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentSampleCountInfoAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentSampleCountInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleCountInfoAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoAMD(segment); }

    /// Creates `VkAttachmentSampleCountInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentSampleCountInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentSampleCountInfoAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentSampleCountInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAttachmentSampleCountInfoAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleCountInfoAMD`
    public static VkAttachmentSampleCountInfoAMD alloc(SegmentAllocator allocator) { return new VkAttachmentSampleCountInfoAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentSampleCountInfoAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentSampleCountInfoAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentSampleCountInfoAMD` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentSampleCountInfoAMD`
    public static VkAttachmentSampleCountInfoAMD allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int colorAttachmentCount, @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment pColorAttachmentSamples, @CType("VkSampleCountFlagBits") int depthStencilAttachmentSamples) { return alloc(allocator).sType(sType).pNext(pNext).colorAttachmentCount(colorAttachmentCount).pColorAttachmentSamples(pColorAttachmentSamples).depthStencilAttachmentSamples(depthStencilAttachmentSamples); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD copyFrom(VkAttachmentSampleCountInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAttachmentSampleCountInfoAMD.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAttachmentSampleCountInfoAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAttachmentSampleCountInfoAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD sType(@CType("VkStructureType") int value) { VkAttachmentSampleCountInfoAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAttachmentSampleCountInfoAMD.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAttachmentSampleCountInfoAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkAttachmentSampleCountInfoAMD.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkAttachmentSampleCountInfoAMD.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkAttachmentSampleCountInfoAMD.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD colorAttachmentCount(@CType("uint32_t") int value) { VkAttachmentSampleCountInfoAMD.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachmentSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment get_pColorAttachmentSamples(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachmentSamples.get(segment, 0L, index); }
    /// {@return `pColorAttachmentSamples`}
    /// @param segment the segment of the struct
    public static @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment get_pColorAttachmentSamples(MemorySegment segment) { return VkAttachmentSampleCountInfoAMD.get_pColorAttachmentSamples(segment, 0L); }
    /// {@return `pColorAttachmentSamples`}
    public @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment pColorAttachmentSamples() { return VkAttachmentSampleCountInfoAMD.get_pColorAttachmentSamples(this.segment()); }
    /// Sets `pColorAttachmentSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachmentSamples(MemorySegment segment, long index, @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment value) { VH_pColorAttachmentSamples.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachmentSamples(MemorySegment segment, @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pColorAttachmentSamples(segment, 0L, value); }
    /// Sets `pColorAttachmentSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(@CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pColorAttachmentSamples(this.segment(), value); return this; }

    /// {@return `depthStencilAttachmentSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_depthStencilAttachmentSamples(MemorySegment segment, long index) { return (int) VH_depthStencilAttachmentSamples.get(segment, 0L, index); }
    /// {@return `depthStencilAttachmentSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_depthStencilAttachmentSamples(MemorySegment segment) { return VkAttachmentSampleCountInfoAMD.get_depthStencilAttachmentSamples(segment, 0L); }
    /// {@return `depthStencilAttachmentSamples`}
    public @CType("VkSampleCountFlagBits") int depthStencilAttachmentSamples() { return VkAttachmentSampleCountInfoAMD.get_depthStencilAttachmentSamples(this.segment()); }
    /// Sets `depthStencilAttachmentSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthStencilAttachmentSamples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_depthStencilAttachmentSamples.set(segment, 0L, index, value); }
    /// Sets `depthStencilAttachmentSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthStencilAttachmentSamples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkAttachmentSampleCountInfoAMD.set_depthStencilAttachmentSamples(segment, 0L, value); }
    /// Sets `depthStencilAttachmentSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(@CType("VkSampleCountFlagBits") int value) { VkAttachmentSampleCountInfoAMD.set_depthStencilAttachmentSamples(this.segment(), value); return this; }

    /// A buffer of [VkAttachmentSampleCountInfoAMD].
    public static final class Buffer extends VkAttachmentSampleCountInfoAMD {
        private final long elementCount;

        /// Creates `VkAttachmentSampleCountInfoAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentSampleCountInfoAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentSampleCountInfoAMD`
        public VkAttachmentSampleCountInfoAMD asSlice(long index) { return new VkAttachmentSampleCountInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentSampleCountInfoAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentSampleCountInfoAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAttachmentSampleCountInfoAMD.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAttachmentSampleCountInfoAMD.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAttachmentSampleCountInfoAMD.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pNext(this.segment(), index, value); return this; }

        /// {@return `colorAttachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkAttachmentSampleCountInfoAMD.get_colorAttachmentCount(this.segment(), index); }
        /// Sets `colorAttachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkAttachmentSampleCountInfoAMD.set_colorAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pColorAttachmentSamples` at the given index}
        /// @param index the index
        public @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment pColorAttachmentSamplesAt(long index) { return VkAttachmentSampleCountInfoAMD.get_pColorAttachmentSamples(this.segment(), index); }
        /// Sets `pColorAttachmentSamples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorAttachmentSamplesAt(long index, @CType("const VkSampleCountFlagBits *") java.lang.foreign.MemorySegment value) { VkAttachmentSampleCountInfoAMD.set_pColorAttachmentSamples(this.segment(), index, value); return this; }

        /// {@return `depthStencilAttachmentSamples` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlagBits") int depthStencilAttachmentSamplesAt(long index) { return VkAttachmentSampleCountInfoAMD.get_depthStencilAttachmentSamples(this.segment(), index); }
        /// Sets `depthStencilAttachmentSamples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthStencilAttachmentSamplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkAttachmentSampleCountInfoAMD.set_depthStencilAttachmentSamples(this.segment(), index, value); return this; }

    }
}
