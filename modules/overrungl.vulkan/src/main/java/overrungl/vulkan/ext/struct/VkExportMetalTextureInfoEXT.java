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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(MemorySegment)]
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(MemorySegment)]
/// ### bufferView
/// [VarHandle][#VH_bufferView] - [Getter][#bufferView()] - [Setter][#bufferView(MemorySegment)]
/// ### plane
/// [VarHandle][#VH_plane] - [Getter][#plane()] - [Setter][#plane(int)]
/// ### mtlTexture
/// [VarHandle][#VH_mtlTexture] - [Getter][#mtlTexture()] - [Setter][#mtlTexture(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportMetalTextureInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkImage image;
///     VkImageView imageView;
///     VkBufferView bufferView;
///     VkImageAspectFlagBits plane;
///     MTLTexture_id mtlTexture;
/// } VkExportMetalTextureInfoEXT;
/// ```
public sealed class VkExportMetalTextureInfoEXT extends Struct {
    /// The struct layout of `VkExportMetalTextureInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.ADDRESS.withName("bufferView"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `bufferView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferView"));
    /// The [VarHandle] of `plane` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    /// The [VarHandle] of `mtlTexture` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalTextureInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImage") MemorySegment image, @CType("VkImageView") MemorySegment imageView, @CType("VkBufferView") MemorySegment bufferView, @CType("VkImageAspectFlagBits") int plane, @CType("MTLTexture_id") MemorySegment mtlTexture) { return alloc(allocator).sType(sType).pNext(pNext).image(image).imageView(imageView).bufferView(bufferView).plane(plane).mtlTexture(mtlTexture); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExportMetalTextureInfoEXT copyFrom(VkExportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportMetalTextureInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkExportMetalTextureInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT pNext(@CType("const void *") MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") MemorySegment get_image(MemorySegment segment, long index) { return (MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") MemorySegment get_image(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_image(segment, 0L); }
    /// {@return `image`}
    public @CType("VkImage") MemorySegment image() { return VkExportMetalTextureInfoEXT.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(segment, 0L, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT image(@CType("VkImage") MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") MemorySegment get_imageView(MemorySegment segment, long index) { return (MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") MemorySegment get_imageView(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_imageView(segment, 0L); }
    /// {@return `imageView`}
    public @CType("VkImageView") MemorySegment imageView() { return VkExportMetalTextureInfoEXT.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageView(@CType("VkImageView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(this.segment(), value); return this; }

    /// {@return `bufferView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferView") MemorySegment get_bufferView(MemorySegment segment, long index) { return (MemorySegment) VH_bufferView.get(segment, 0L, index); }
    /// {@return `bufferView`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferView") MemorySegment get_bufferView(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_bufferView(segment, 0L); }
    /// {@return `bufferView`}
    public @CType("VkBufferView") MemorySegment bufferView() { return VkExportMetalTextureInfoEXT.get_bufferView(this.segment()); }
    /// Sets `bufferView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferView(MemorySegment segment, long index, @CType("VkBufferView") MemorySegment value) { VH_bufferView.set(segment, 0L, index, value); }
    /// Sets `bufferView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferView(MemorySegment segment, @CType("VkBufferView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(segment, 0L, value); }
    /// Sets `bufferView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT bufferView(@CType("VkBufferView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(this.segment(), value); return this; }

    /// {@return `plane` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment, long index) { return (int) VH_plane.get(segment, 0L, index); }
    /// {@return `plane`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_plane(segment, 0L); }
    /// {@return `plane`}
    public @CType("VkImageAspectFlagBits") int plane() { return VkExportMetalTextureInfoEXT.get_plane(this.segment()); }
    /// Sets `plane` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_plane(MemorySegment segment, long index, @CType("VkImageAspectFlagBits") int value) { VH_plane.set(segment, 0L, index, value); }
    /// Sets `plane` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_plane(MemorySegment segment, @CType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.set_plane(segment, 0L, value); }
    /// Sets `plane` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT plane(@CType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.set_plane(this.segment(), value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLTexture_id") MemorySegment get_mtlTexture(MemorySegment segment, long index) { return (MemorySegment) VH_mtlTexture.get(segment, 0L, index); }
    /// {@return `mtlTexture`}
    /// @param segment the segment of the struct
    public static @CType("MTLTexture_id") MemorySegment get_mtlTexture(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_mtlTexture(segment, 0L); }
    /// {@return `mtlTexture`}
    public @CType("MTLTexture_id") MemorySegment mtlTexture() { return VkExportMetalTextureInfoEXT.get_mtlTexture(this.segment()); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, long index, @CType("MTLTexture_id") MemorySegment value) { VH_mtlTexture.set(segment, 0L, index, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, @CType("MTLTexture_id") MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(segment, 0L, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT mtlTexture(@CType("MTLTexture_id") MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(this.segment(), value); return this; }

    /// A buffer of [VkExportMetalTextureInfoEXT].
    public static final class Buffer extends VkExportMetalTextureInfoEXT {
        private final long elementCount;

        /// Creates `VkExportMetalTextureInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExportMetalTextureInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExportMetalTextureInfoEXT`
        public VkExportMetalTextureInfoEXT asSlice(long index) { return new VkExportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExportMetalTextureInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExportMetalTextureInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalTextureInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkExportMetalTextureInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `image` at the given index}
        /// @param index the index
        public @CType("VkImage") MemorySegment imageAt(long index) { return VkExportMetalTextureInfoEXT.get_image(this.segment(), index); }
        /// Sets `image` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageAt(long index, @CType("VkImage") MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(this.segment(), index, value); return this; }

        /// {@return `imageView` at the given index}
        /// @param index the index
        public @CType("VkImageView") MemorySegment imageViewAt(long index) { return VkExportMetalTextureInfoEXT.get_imageView(this.segment(), index); }
        /// Sets `imageView` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageViewAt(long index, @CType("VkImageView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(this.segment(), index, value); return this; }

        /// {@return `bufferView` at the given index}
        /// @param index the index
        public @CType("VkBufferView") MemorySegment bufferViewAt(long index) { return VkExportMetalTextureInfoEXT.get_bufferView(this.segment(), index); }
        /// Sets `bufferView` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferViewAt(long index, @CType("VkBufferView") MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(this.segment(), index, value); return this; }

        /// {@return `plane` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlagBits") int planeAt(long index) { return VkExportMetalTextureInfoEXT.get_plane(this.segment(), index); }
        /// Sets `plane` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeAt(long index, @CType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.set_plane(this.segment(), index, value); return this; }

        /// {@return `mtlTexture` at the given index}
        /// @param index the index
        public @CType("MTLTexture_id") MemorySegment mtlTextureAt(long index) { return VkExportMetalTextureInfoEXT.get_mtlTexture(this.segment(), index); }
        /// Sets `mtlTexture` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mtlTextureAt(long index, @CType("MTLTexture_id") MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(this.segment(), index, value); return this; }

    }
}
