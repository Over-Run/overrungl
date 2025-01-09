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
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(java.lang.foreign.MemorySegment)]
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(java.lang.foreign.MemorySegment)]
/// ### bufferView
/// [VarHandle][#VH_bufferView] - [Getter][#bufferView()] - [Setter][#bufferView(java.lang.foreign.MemorySegment)]
/// ### plane
/// [VarHandle][#VH_plane] - [Getter][#plane()] - [Setter][#plane(int)]
/// ### mtlTexture
/// [VarHandle][#VH_mtlTexture] - [Getter][#mtlTexture()] - [Setter][#mtlTexture(java.lang.foreign.MemorySegment)]
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
public final class VkExportMetalTextureInfoEXT extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `bufferView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_bufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferView"));
    /// The [VarHandle] of `plane` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    /// The [VarHandle] of `mtlTexture` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkExportMetalTextureInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportMetalTextureInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment); }

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
    public static VkExportMetalTextureInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExportMetalTextureInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportMetalTextureInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportMetalTextureInfoEXT`
    public static VkExportMetalTextureInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalTextureInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExportMetalTextureInfoEXT.get_sType(this.segment(), index); }
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
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT sType(@CType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportMetalTextureInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportMetalTextureInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_image(segment, 0L); }
    /// {@return `image` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment imageAt(long index) { return VkExportMetalTextureInfoEXT.get_image(this.segment(), index); }
    /// {@return `image`}
    public @CType("VkImage") java.lang.foreign.MemorySegment image() { return VkExportMetalTextureInfoEXT.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(segment, 0L, value); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(this.segment(), index, value); return this; }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT image(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_image(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_imageView(segment, 0L); }
    /// {@return `imageView` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewAt(long index) { return VkExportMetalTextureInfoEXT.get_imageView(this.segment(), index); }
    /// {@return `imageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageView() { return VkExportMetalTextureInfoEXT.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(this.segment(), index, value); return this; }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT imageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_imageView(this.segment(), value); return this; }

    /// {@return `bufferView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBufferView") java.lang.foreign.MemorySegment get_bufferView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_bufferView.get(segment, 0L, index); }
    /// {@return `bufferView`}
    /// @param segment the segment of the struct
    public static @CType("VkBufferView") java.lang.foreign.MemorySegment get_bufferView(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_bufferView(segment, 0L); }
    /// {@return `bufferView` at the given index}
    /// @param index the index
    public @CType("VkBufferView") java.lang.foreign.MemorySegment bufferViewAt(long index) { return VkExportMetalTextureInfoEXT.get_bufferView(this.segment(), index); }
    /// {@return `bufferView`}
    public @CType("VkBufferView") java.lang.foreign.MemorySegment bufferView() { return VkExportMetalTextureInfoEXT.get_bufferView(this.segment()); }
    /// Sets `bufferView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferView(MemorySegment segment, long index, @CType("VkBufferView") java.lang.foreign.MemorySegment value) { VH_bufferView.set(segment, 0L, index, value); }
    /// Sets `bufferView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferView(MemorySegment segment, @CType("VkBufferView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(segment, 0L, value); }
    /// Sets `bufferView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT bufferViewAt(long index, @CType("VkBufferView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(this.segment(), index, value); return this; }
    /// Sets `bufferView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT bufferView(@CType("VkBufferView") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_bufferView(this.segment(), value); return this; }

    /// {@return `plane` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment, long index) { return (int) VH_plane.get(segment, 0L, index); }
    /// {@return `plane`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_plane(segment, 0L); }
    /// {@return `plane` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlagBits") int planeAt(long index) { return VkExportMetalTextureInfoEXT.get_plane(this.segment(), index); }
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
    /// Sets `plane` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT planeAt(long index, @CType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.set_plane(this.segment(), index, value); return this; }
    /// Sets `plane` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT plane(@CType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.set_plane(this.segment(), value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLTexture_id") java.lang.foreign.MemorySegment get_mtlTexture(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mtlTexture.get(segment, 0L, index); }
    /// {@return `mtlTexture`}
    /// @param segment the segment of the struct
    public static @CType("MTLTexture_id") java.lang.foreign.MemorySegment get_mtlTexture(MemorySegment segment) { return VkExportMetalTextureInfoEXT.get_mtlTexture(segment, 0L); }
    /// {@return `mtlTexture` at the given index}
    /// @param index the index
    public @CType("MTLTexture_id") java.lang.foreign.MemorySegment mtlTextureAt(long index) { return VkExportMetalTextureInfoEXT.get_mtlTexture(this.segment(), index); }
    /// {@return `mtlTexture`}
    public @CType("MTLTexture_id") java.lang.foreign.MemorySegment mtlTexture() { return VkExportMetalTextureInfoEXT.get_mtlTexture(this.segment()); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, long index, @CType("MTLTexture_id") java.lang.foreign.MemorySegment value) { VH_mtlTexture.set(segment, 0L, index, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, @CType("MTLTexture_id") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(segment, 0L, value); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT mtlTextureAt(long index, @CType("MTLTexture_id") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(this.segment(), index, value); return this; }
    /// Sets `mtlTexture` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportMetalTextureInfoEXT mtlTexture(@CType("MTLTexture_id") java.lang.foreign.MemorySegment value) { VkExportMetalTextureInfoEXT.set_mtlTexture(this.segment(), value); return this; }

}
