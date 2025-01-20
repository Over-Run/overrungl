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
/// ### pFragmentShadingRateAttachment
/// [VarHandle][#VH_pFragmentShadingRateAttachment] - [Getter][#pFragmentShadingRateAttachment()] - [Setter][#pFragmentShadingRateAttachment(MemorySegment)]
/// ### shadingRateAttachmentTexelSize
/// [Byte offset][#OFFSET_shadingRateAttachmentTexelSize] - [Memory layout][#ML_shadingRateAttachmentTexelSize] - [Getter][#shadingRateAttachmentTexelSize()] - [Setter][#shadingRateAttachmentTexelSize(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFragmentShadingRateAttachmentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const VkAttachmentReference2 * pFragmentShadingRateAttachment;
///     VkExtent2D shadingRateAttachmentTexelSize;
/// } VkFragmentShadingRateAttachmentInfoKHR;
/// ```
public sealed class VkFragmentShadingRateAttachmentInfoKHR extends Struct {
    /// The struct layout of `VkFragmentShadingRateAttachmentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pFragmentShadingRateAttachment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pFragmentShadingRateAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFragmentShadingRateAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentShadingRateAttachment"));
    /// The byte offset of `shadingRateAttachmentTexelSize`.
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    /// The memory layout of `shadingRateAttachmentTexelSize`.
    public static final MemoryLayout ML_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const VkAttachmentReference2 *") MemorySegment pFragmentShadingRateAttachment, @CType("VkExtent2D") MemorySegment shadingRateAttachmentTexelSize) { return alloc(allocator).sType(sType).pNext(pNext).pFragmentShadingRateAttachment(pFragmentShadingRateAttachment).shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR copyFrom(VkFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFragmentShadingRateAttachmentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFragmentShadingRateAttachmentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFragmentShadingRateAttachmentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR sType(@CType("VkStructureType") int value) { VkFragmentShadingRateAttachmentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkFragmentShadingRateAttachmentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkFragmentShadingRateAttachmentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR pNext(@CType("const void *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pFragmentShadingRateAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pFragmentShadingRateAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pFragmentShadingRateAttachment.get(segment, 0L, index); }
    /// {@return `pFragmentShadingRateAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pFragmentShadingRateAttachment(MemorySegment segment) { return VkFragmentShadingRateAttachmentInfoKHR.get_pFragmentShadingRateAttachment(segment, 0L); }
    /// {@return `pFragmentShadingRateAttachment`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pFragmentShadingRateAttachment() { return VkFragmentShadingRateAttachmentInfoKHR.get_pFragmentShadingRateAttachment(this.segment()); }
    /// Sets `pFragmentShadingRateAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFragmentShadingRateAttachment(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pFragmentShadingRateAttachment.set(segment, 0L, index, value); }
    /// Sets `pFragmentShadingRateAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFragmentShadingRateAttachment(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pFragmentShadingRateAttachment(segment, 0L, value); }
    /// Sets `pFragmentShadingRateAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pFragmentShadingRateAttachment(this.segment(), value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_shadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), ML_shadingRateAttachmentTexelSize); }
    /// {@return `shadingRateAttachmentTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_shadingRateAttachmentTexelSize(MemorySegment segment) { return VkFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(segment, 0L); }
    /// {@return `shadingRateAttachmentTexelSize`}
    public @CType("VkExtent2D") MemorySegment shadingRateAttachmentTexelSize() { return VkFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(this.segment()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateAttachmentTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), ML_shadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateAttachmentTexelSize(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(segment, 0L, value); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(@CType("VkExtent2D") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(this.segment(), value); return this; }

    /// A buffer of [VkFragmentShadingRateAttachmentInfoKHR].
    public static final class Buffer extends VkFragmentShadingRateAttachmentInfoKHR {
        private final long elementCount;

        /// Creates `VkFragmentShadingRateAttachmentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFragmentShadingRateAttachmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFragmentShadingRateAttachmentInfoKHR`
        public VkFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFragmentShadingRateAttachmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFragmentShadingRateAttachmentInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFragmentShadingRateAttachmentInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFragmentShadingRateAttachmentInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkFragmentShadingRateAttachmentInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pFragmentShadingRateAttachment` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pFragmentShadingRateAttachmentAt(long index) { return VkFragmentShadingRateAttachmentInfoKHR.get_pFragmentShadingRateAttachment(this.segment(), index); }
        /// Sets `pFragmentShadingRateAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pFragmentShadingRateAttachmentAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_pFragmentShadingRateAttachment(this.segment(), index, value); return this; }

        /// {@return `shadingRateAttachmentTexelSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment shadingRateAttachmentTexelSizeAt(long index) { return VkFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(this.segment(), index); }
        /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateAttachmentTexelSizeAt(long index, @CType("VkExtent2D") MemorySegment value) { VkFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(this.segment(), index, value); return this; }

    }
}
