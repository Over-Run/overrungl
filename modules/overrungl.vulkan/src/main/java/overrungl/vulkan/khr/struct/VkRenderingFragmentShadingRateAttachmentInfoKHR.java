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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(java.lang.foreign.MemorySegment)]
/// ### imageLayout
/// [VarHandle][#VH_imageLayout] - [Getter][#imageLayout()] - [Setter][#imageLayout(int)]
/// ### shadingRateAttachmentTexelSize
/// [Byte offset][#OFFSET_shadingRateAttachmentTexelSize] - [Memory layout][#ML_shadingRateAttachmentTexelSize] - [Getter][#shadingRateAttachmentTexelSize()] - [Setter][#shadingRateAttachmentTexelSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
///     VkExtent2D shadingRateAttachmentTexelSize;
/// } VkRenderingFragmentShadingRateAttachmentInfoKHR;
/// ```
public sealed class VkRenderingFragmentShadingRateAttachmentInfoKHR extends Struct {
    /// The struct layout of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));
    /// The byte offset of `shadingRateAttachmentTexelSize`.
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    /// The memory layout of `shadingRateAttachmentTexelSize`.
    public static final MemoryLayout ML_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkRenderingFragmentShadingRateAttachmentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkImageView") java.lang.foreign.MemorySegment imageView, @CType("VkImageLayout") int imageLayout, @CType("VkExtent2D") java.lang.foreign.MemorySegment shadingRateAttachmentTexelSize) { return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR copyFrom(VkRenderingFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType(@CType("VkStructureType") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageView(segment, 0L); }
    /// {@return `imageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageView() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageView(this.segment(), value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageLayout(segment, 0L); }
    /// {@return `imageLayout`}
    public @CType("VkImageLayout") int imageLayout() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageLayout(this.segment()); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageLayout(segment, 0L, value); }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayout(@CType("VkImageLayout") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageLayout(this.segment(), value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_shadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), ML_shadingRateAttachmentTexelSize); }
    /// {@return `shadingRateAttachmentTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_shadingRateAttachmentTexelSize(MemorySegment segment) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(segment, 0L); }
    /// {@return `shadingRateAttachmentTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment shadingRateAttachmentTexelSize() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(this.segment()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateAttachmentTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), ML_shadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateAttachmentTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(segment, 0L, value); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(this.segment(), value); return this; }

    /// A buffer of [VkRenderingFragmentShadingRateAttachmentInfoKHR].
    public static final class Buffer extends VkRenderingFragmentShadingRateAttachmentInfoKHR {
        private final long elementCount;

        /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`
        public VkRenderingFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `imageView` at the given index}
        /// @param index the index
        public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewAt(long index) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageView(this.segment(), index); }
        /// Sets `imageView` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageView(this.segment(), index, value); return this; }

        /// {@return `imageLayout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int imageLayoutAt(long index) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_imageLayout(this.segment(), index); }
        /// Sets `imageLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageLayoutAt(long index, @CType("VkImageLayout") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_imageLayout(this.segment(), index, value); return this; }

        /// {@return `shadingRateAttachmentTexelSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment shadingRateAttachmentTexelSizeAt(long index) { return VkRenderingFragmentShadingRateAttachmentInfoKHR.get_shadingRateAttachmentTexelSize(this.segment(), index); }
        /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateAttachmentTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.set_shadingRateAttachmentTexelSize(this.segment(), index, value); return this; }

    }
}
