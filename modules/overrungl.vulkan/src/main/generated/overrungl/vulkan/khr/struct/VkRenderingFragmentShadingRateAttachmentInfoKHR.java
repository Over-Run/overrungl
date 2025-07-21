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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView imageView;
///     (int) VkImageLayout imageLayout;
///     (struct VkExtent2D) VkExtent2D shadingRateAttachmentTexelSize;
/// };
/// ```
public final class VkRenderingFragmentShadingRateAttachmentInfoKHR extends GroupType {
    /// The struct layout of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
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
    /// The byte offset of `shadingRateAttachmentTexelSize`.
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    /// The memory layout of `shadingRateAttachmentTexelSize`.
    public static final MemoryLayout LAYOUT_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderingFragmentShadingRateAttachmentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param shadingRateAttachmentTexelSize `shadingRateAttachmentTexelSize`
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, MemorySegment shadingRateAttachmentTexelSize) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);
    }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout);
    }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView);
    }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRenderingFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR copyFrom(VkRenderingFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderingFragmentShadingRateAttachmentInfoKHR reinterpret(long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageView(long value) { imageView(this.segment(), 0L, value); return this; }

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
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayout(int value) { imageLayout(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment shadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize); }
    /// {@return `shadingRateAttachmentTexelSize`}
    public MemorySegment shadingRateAttachmentTexelSize() { return shadingRateAttachmentTexelSize(this.segment(), 0L); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateAttachmentTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(MemorySegment value) { shadingRateAttachmentTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `shadingRateAttachmentTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(shadingRateAttachmentTexelSize())); return this; }

    /// Creates a slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingFragmentShadingRateAttachmentInfoKHR`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR asSlice(long index, long count) { return new VkRenderingFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderingFragmentShadingRateAttachmentInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR at(long index, Consumer<VkRenderingFragmentShadingRateAttachmentInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewAt(long index) { return imageView(this.segment(), index); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int imageLayoutAt(long index) { return imageLayout(this.segment(), index); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayoutAt(long index, int value) { imageLayout(this.segment(), index, value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment shadingRateAttachmentTexelSizeAt(long index) { return shadingRateAttachmentTexelSize(this.segment(), index); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSizeAt(long index, MemorySegment value) { shadingRateAttachmentTexelSize(this.segment(), index, value); return this; }
    /// Accepts `shadingRateAttachmentTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(shadingRateAttachmentTexelSizeAt(index))); return this; }

}
