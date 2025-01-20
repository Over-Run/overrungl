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
package overrungl.vulkan.nvx.struct;

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
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(MemorySegment)]
/// ### descriptorType
/// [VarHandle][#VH_descriptorType] - [Getter][#descriptorType()] - [Setter][#descriptorType(int)]
/// ### sampler
/// [VarHandle][#VH_sampler] - [Getter][#sampler()] - [Setter][#sampler(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewHandleInfoNVX {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageView imageView;
///     VkDescriptorType descriptorType;
///     VkSampler sampler;
/// } VkImageViewHandleInfoNVX;
/// ```
public sealed class VkImageViewHandleInfoNVX extends Struct {
    /// The struct layout of `VkImageViewHandleInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("sampler")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    /// @param segment the memory segment
    public VkImageViewHandleInfoNVX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewHandleInfoNVX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewHandleInfoNVX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewHandleInfoNVX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewHandleInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageViewHandleInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewHandleInfoNVX`
    public static VkImageViewHandleInfoNVX alloc(SegmentAllocator allocator) { return new VkImageViewHandleInfoNVX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewHandleInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewHandleInfoNVX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageViewHandleInfoNVX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewHandleInfoNVX`
    public static VkImageViewHandleInfoNVX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImageView") MemorySegment imageView, @CType("VkDescriptorType") int descriptorType, @CType("VkSampler") MemorySegment sampler) { return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).descriptorType(descriptorType).sampler(sampler); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewHandleInfoNVX copyFrom(VkImageViewHandleInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewHandleInfoNVX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewHandleInfoNVX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewHandleInfoNVX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX sType(@CType("VkStructureType") int value) { VkImageViewHandleInfoNVX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageViewHandleInfoNVX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageViewHandleInfoNVX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageViewHandleInfoNVX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX pNext(@CType("const void *") MemorySegment value) { VkImageViewHandleInfoNVX.set_pNext(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") MemorySegment get_imageView(MemorySegment segment, long index) { return (MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") MemorySegment get_imageView(MemorySegment segment) { return VkImageViewHandleInfoNVX.get_imageView(segment, 0L); }
    /// {@return `imageView`}
    public @CType("VkImageView") MemorySegment imageView() { return VkImageViewHandleInfoNVX.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") MemorySegment value) { VkImageViewHandleInfoNVX.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX imageView(@CType("VkImageView") MemorySegment value) { VkImageViewHandleInfoNVX.set_imageView(this.segment(), value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment) { return VkImageViewHandleInfoNVX.get_descriptorType(segment, 0L); }
    /// {@return `descriptorType`}
    public @CType("VkDescriptorType") int descriptorType() { return VkImageViewHandleInfoNVX.get_descriptorType(this.segment()); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, long index, @CType("VkDescriptorType") int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, @CType("VkDescriptorType") int value) { VkImageViewHandleInfoNVX.set_descriptorType(segment, 0L, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX descriptorType(@CType("VkDescriptorType") int value) { VkImageViewHandleInfoNVX.set_descriptorType(this.segment(), value); return this; }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampler") MemorySegment get_sampler(MemorySegment segment, long index) { return (MemorySegment) VH_sampler.get(segment, 0L, index); }
    /// {@return `sampler`}
    /// @param segment the segment of the struct
    public static @CType("VkSampler") MemorySegment get_sampler(MemorySegment segment) { return VkImageViewHandleInfoNVX.get_sampler(segment, 0L); }
    /// {@return `sampler`}
    public @CType("VkSampler") MemorySegment sampler() { return VkImageViewHandleInfoNVX.get_sampler(this.segment()); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, long index, @CType("VkSampler") MemorySegment value) { VH_sampler.set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampler(MemorySegment segment, @CType("VkSampler") MemorySegment value) { VkImageViewHandleInfoNVX.set_sampler(segment, 0L, value); }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewHandleInfoNVX sampler(@CType("VkSampler") MemorySegment value) { VkImageViewHandleInfoNVX.set_sampler(this.segment(), value); return this; }

    /// A buffer of [VkImageViewHandleInfoNVX].
    public static final class Buffer extends VkImageViewHandleInfoNVX {
        private final long elementCount;

        /// Creates `VkImageViewHandleInfoNVX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageViewHandleInfoNVX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageViewHandleInfoNVX`
        public VkImageViewHandleInfoNVX asSlice(long index) { return new VkImageViewHandleInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageViewHandleInfoNVX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageViewHandleInfoNVX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewHandleInfoNVX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewHandleInfoNVX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageViewHandleInfoNVX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageViewHandleInfoNVX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageView` at the given index}
        /// @param index the index
        public @CType("VkImageView") MemorySegment imageViewAt(long index) { return VkImageViewHandleInfoNVX.get_imageView(this.segment(), index); }
        /// Sets `imageView` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageViewAt(long index, @CType("VkImageView") MemorySegment value) { VkImageViewHandleInfoNVX.set_imageView(this.segment(), index, value); return this; }

        /// {@return `descriptorType` at the given index}
        /// @param index the index
        public @CType("VkDescriptorType") int descriptorTypeAt(long index) { return VkImageViewHandleInfoNVX.get_descriptorType(this.segment(), index); }
        /// Sets `descriptorType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorTypeAt(long index, @CType("VkDescriptorType") int value) { VkImageViewHandleInfoNVX.set_descriptorType(this.segment(), index, value); return this; }

        /// {@return `sampler` at the given index}
        /// @param index the index
        public @CType("VkSampler") MemorySegment samplerAt(long index) { return VkImageViewHandleInfoNVX.get_sampler(this.segment(), index); }
        /// Sets `sampler` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer samplerAt(long index, @CType("VkSampler") MemorySegment value) { VkImageViewHandleInfoNVX.set_sampler(this.segment(), index, value); return this; }

    }
}
