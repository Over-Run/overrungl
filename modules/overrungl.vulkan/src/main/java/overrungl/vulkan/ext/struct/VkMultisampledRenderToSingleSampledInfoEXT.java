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
/// ### multisampledRenderToSingleSampledEnable
/// [VarHandle][#VH_multisampledRenderToSingleSampledEnable] - [Getter][#multisampledRenderToSingleSampledEnable()] - [Setter][#multisampledRenderToSingleSampledEnable(int)]
/// ### rasterizationSamples
/// [VarHandle][#VH_rasterizationSamples] - [Getter][#rasterizationSamples()] - [Setter][#rasterizationSamples(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultisampledRenderToSingleSampledInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 multisampledRenderToSingleSampledEnable;
///     VkSampleCountFlagBits rasterizationSamples;
/// } VkMultisampledRenderToSingleSampledInfoEXT;
/// ```
public sealed class VkMultisampledRenderToSingleSampledInfoEXT extends Struct {
    /// The struct layout of `VkMultisampledRenderToSingleSampledInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampledEnable"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `multisampledRenderToSingleSampledEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multisampledRenderToSingleSampledEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisampledRenderToSingleSampledInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultisampledRenderToSingleSampledInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultisampledRenderToSingleSampledInfoEXT`
    public static VkMultisampledRenderToSingleSampledInfoEXT alloc(SegmentAllocator allocator) { return new VkMultisampledRenderToSingleSampledInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultisampledRenderToSingleSampledInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMultisampledRenderToSingleSampledInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultisampledRenderToSingleSampledInfoEXT`
    public static VkMultisampledRenderToSingleSampledInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int multisampledRenderToSingleSampledEnable, @CType("VkSampleCountFlagBits") int rasterizationSamples) { return alloc(allocator).sType(sType).pNext(pNext).multisampledRenderToSingleSampledEnable(multisampledRenderToSingleSampledEnable).rasterizationSamples(rasterizationSamples); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT copyFrom(VkMultisampledRenderToSingleSampledInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMultisampledRenderToSingleSampledInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMultisampledRenderToSingleSampledInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT sType(@CType("VkStructureType") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMultisampledRenderToSingleSampledInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMultisampledRenderToSingleSampledInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultisampledRenderToSingleSampledInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMultisampledRenderToSingleSampledInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `multisampledRenderToSingleSampledEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multisampledRenderToSingleSampledEnable(MemorySegment segment, long index) { return (int) VH_multisampledRenderToSingleSampledEnable.get(segment, 0L, index); }
    /// {@return `multisampledRenderToSingleSampledEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multisampledRenderToSingleSampledEnable(MemorySegment segment) { return VkMultisampledRenderToSingleSampledInfoEXT.get_multisampledRenderToSingleSampledEnable(segment, 0L); }
    /// {@return `multisampledRenderToSingleSampledEnable`}
    public @CType("VkBool32") int multisampledRenderToSingleSampledEnable() { return VkMultisampledRenderToSingleSampledInfoEXT.get_multisampledRenderToSingleSampledEnable(this.segment()); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multisampledRenderToSingleSampledEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multisampledRenderToSingleSampledEnable.set(segment, 0L, index, value); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multisampledRenderToSingleSampledEnable(MemorySegment segment, @CType("VkBool32") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_multisampledRenderToSingleSampledEnable(segment, 0L, value); }
    /// Sets `multisampledRenderToSingleSampledEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(@CType("VkBool32") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_multisampledRenderToSingleSampledEnable(this.segment(), value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment) { return VkMultisampledRenderToSingleSampledInfoEXT.get_rasterizationSamples(segment, 0L); }
    /// {@return `rasterizationSamples`}
    public @CType("VkSampleCountFlagBits") int rasterizationSamples() { return VkMultisampledRenderToSingleSampledInfoEXT.get_rasterizationSamples(this.segment()); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_rasterizationSamples(segment, 0L, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(@CType("VkSampleCountFlagBits") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_rasterizationSamples(this.segment(), value); return this; }

    /// A buffer of [VkMultisampledRenderToSingleSampledInfoEXT].
    public static final class Buffer extends VkMultisampledRenderToSingleSampledInfoEXT {
        private final long elementCount;

        /// Creates `VkMultisampledRenderToSingleSampledInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMultisampledRenderToSingleSampledInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMultisampledRenderToSingleSampledInfoEXT`
        public VkMultisampledRenderToSingleSampledInfoEXT asSlice(long index) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMultisampledRenderToSingleSampledInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMultisampledRenderToSingleSampledInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMultisampledRenderToSingleSampledInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMultisampledRenderToSingleSampledInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultisampledRenderToSingleSampledInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `multisampledRenderToSingleSampledEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int multisampledRenderToSingleSampledEnableAt(long index) { return VkMultisampledRenderToSingleSampledInfoEXT.get_multisampledRenderToSingleSampledEnable(this.segment(), index); }
        /// Sets `multisampledRenderToSingleSampledEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer multisampledRenderToSingleSampledEnableAt(long index, @CType("VkBool32") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_multisampledRenderToSingleSampledEnable(this.segment(), index, value); return this; }

        /// {@return `rasterizationSamples` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlagBits") int rasterizationSamplesAt(long index) { return VkMultisampledRenderToSingleSampledInfoEXT.get_rasterizationSamples(this.segment(), index); }
        /// Sets `rasterizationSamples` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rasterizationSamplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkMultisampledRenderToSingleSampledInfoEXT.set_rasterizationSamples(this.segment(), index, value); return this; }

    }
}
