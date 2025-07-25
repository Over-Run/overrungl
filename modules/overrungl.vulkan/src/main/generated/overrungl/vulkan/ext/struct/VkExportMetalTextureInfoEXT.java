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
/// struct VkExportMetalTextureInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage image;
///     (uint64_t) VkImageView imageView;
///     (uint64_t) VkBufferView bufferView;
///     (int) VkImageAspectFlagBits plane;
///     (void*) MTLTexture_id mtlTexture;
/// };
/// ```
public final class VkExportMetalTextureInfoEXT extends GroupType {
    /// The struct layout of `VkExportMetalTextureInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_LONG.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
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
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `imageView`.
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    /// The memory layout of `imageView`.
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The byte offset of `bufferView`.
    public static final long OFFSET_bufferView = LAYOUT.byteOffset(PathElement.groupElement("bufferView"));
    /// The memory layout of `bufferView`.
    public static final MemoryLayout LAYOUT_bufferView = LAYOUT.select(PathElement.groupElement("bufferView"));
    /// The [VarHandle] of `bufferView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferView"));
    /// The byte offset of `plane`.
    public static final long OFFSET_plane = LAYOUT.byteOffset(PathElement.groupElement("plane"));
    /// The memory layout of `plane`.
    public static final MemoryLayout LAYOUT_plane = LAYOUT.select(PathElement.groupElement("plane"));
    /// The [VarHandle] of `plane` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    /// The byte offset of `mtlTexture`.
    public static final long OFFSET_mtlTexture = LAYOUT.byteOffset(PathElement.groupElement("mtlTexture"));
    /// The memory layout of `mtlTexture`.
    public static final MemoryLayout LAYOUT_mtlTexture = LAYOUT.select(PathElement.groupElement("mtlTexture"));
    /// The [VarHandle] of `mtlTexture` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExportMetalTextureInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @param imageView `imageView`
    /// @param bufferView `bufferView`
    /// @param plane `plane`
    /// @param mtlTexture `mtlTexture`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image, long imageView, long bufferView, int plane, MemorySegment mtlTexture) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image).imageView(imageView).bufferView(bufferView).plane(plane).mtlTexture(mtlTexture);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @param imageView `imageView`
    /// @param bufferView `bufferView`
    /// @param plane `plane`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image, long imageView, long bufferView, int plane) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image).imageView(imageView).bufferView(bufferView).plane(plane);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @param imageView `imageView`
    /// @param bufferView `bufferView`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image, long imageView, long bufferView) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image).imageView(imageView).bufferView(bufferView);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @param imageView `imageView`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image, long imageView) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image).imageView(imageView);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalTextureInfoEXT copyFrom(VkExportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExportMetalTextureInfoEXT reinterpret(long count) { return new VkExportMetalTextureInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExportMetalTextureInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExportMetalTextureInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT image(long value) { image(this.segment(), 0L, value); return this; }

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
    public VkExportMetalTextureInfoEXT imageView(long value) { imageView(this.segment(), 0L, value); return this; }

    /// {@return `bufferView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferView(MemorySegment segment, long index) { return (long) VH_bufferView.get(segment, 0L, index); }
    /// {@return `bufferView`}
    public long bufferView() { return bufferView(this.segment(), 0L); }
    /// Sets `bufferView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferView(MemorySegment segment, long index, long value) { VH_bufferView.set(segment, 0L, index, value); }
    /// Sets `bufferView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT bufferView(long value) { bufferView(this.segment(), 0L, value); return this; }

    /// {@return `plane` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int plane(MemorySegment segment, long index) { return (int) VH_plane.get(segment, 0L, index); }
    /// {@return `plane`}
    public int plane() { return plane(this.segment(), 0L); }
    /// Sets `plane` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void plane(MemorySegment segment, long index, int value) { VH_plane.set(segment, 0L, index, value); }
    /// Sets `plane` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT plane(int value) { plane(this.segment(), 0L, value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlTexture(MemorySegment segment, long index) { return (MemorySegment) VH_mtlTexture.get(segment, 0L, index); }
    /// {@return `mtlTexture`}
    public MemorySegment mtlTexture() { return mtlTexture(this.segment(), 0L); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlTexture(MemorySegment segment, long index, MemorySegment value) { VH_mtlTexture.set(segment, 0L, index, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT mtlTexture(MemorySegment value) { mtlTexture(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExportMetalTextureInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExportMetalTextureInfoEXT`
    public VkExportMetalTextureInfoEXT asSlice(long index) { return new VkExportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExportMetalTextureInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExportMetalTextureInfoEXT`
    public VkExportMetalTextureInfoEXT asSlice(long index, long count) { return new VkExportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExportMetalTextureInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExportMetalTextureInfoEXT at(long index, Consumer<VkExportMetalTextureInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageAt(long index, long value) { image(this.segment(), index, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewAt(long index) { return imageView(this.segment(), index); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

    /// {@return `bufferView` at the given index}
    /// @param index the index of the struct buffer
    public long bufferViewAt(long index) { return bufferView(this.segment(), index); }
    /// Sets `bufferView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT bufferViewAt(long index, long value) { bufferView(this.segment(), index, value); return this; }

    /// {@return `plane` at the given index}
    /// @param index the index of the struct buffer
    public int planeAt(long index) { return plane(this.segment(), index); }
    /// Sets `plane` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT planeAt(long index, int value) { plane(this.segment(), index, value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment mtlTextureAt(long index) { return mtlTexture(this.segment(), index); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT mtlTextureAt(long index, MemorySegment value) { mtlTexture(this.segment(), index, value); return this; }

}
