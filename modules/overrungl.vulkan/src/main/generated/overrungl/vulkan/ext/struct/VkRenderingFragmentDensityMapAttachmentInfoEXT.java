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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRenderingFragmentDensityMapAttachmentInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView imageView;
///     (int) VkImageLayout imageLayout;
/// };
/// ```
public final class VkRenderingFragmentDensityMapAttachmentInfoEXT extends GroupType {
    /// The struct layout of `VkRenderingFragmentDensityMapAttachmentInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `imageView`.
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    /// The memory layout of `imageView`.
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The byte offset of `imageLayout`.
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    /// The memory layout of `imageLayout`.
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));

    /// Creates `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderingFragmentDensityMapAttachmentInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentDensityMapAttachmentInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout);
    }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView);
    }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRenderingFragmentDensityMapAttachmentInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public static VkRenderingFragmentDensityMapAttachmentInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT copyFrom(VkRenderingFragmentDensityMapAttachmentInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderingFragmentDensityMapAttachmentInfoEXT reinterpret(long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageView(MemorySegment segment, long index) { return (long) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    public long imageView() { return imageView(this.segment(), 0L); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageView(MemorySegment segment, long index, long value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageView(long value) { imageView(this.segment(), 0L, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    public int imageLayout() { return imageLayout(this.segment(), 0L); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageLayout(MemorySegment segment, long index, int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayout(int value) { imageLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderingFragmentDensityMapAttachmentInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT asSlice(long index) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderingFragmentDensityMapAttachmentInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingFragmentDensityMapAttachmentInfoEXT`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT asSlice(long index, long count) { return new VkRenderingFragmentDensityMapAttachmentInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderingFragmentDensityMapAttachmentInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT at(long index, Consumer<VkRenderingFragmentDensityMapAttachmentInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewAt(long index) { return imageView(this.segment(), index); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int imageLayoutAt(long index) { return imageLayout(this.segment(), index); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentDensityMapAttachmentInfoEXT imageLayoutAt(long index, int value) { imageLayout(this.segment(), index, value); return this; }

}
