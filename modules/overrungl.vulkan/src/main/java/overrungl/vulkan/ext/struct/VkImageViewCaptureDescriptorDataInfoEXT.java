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
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageView imageView;
/// } VkImageViewCaptureDescriptorDataInfoEXT;
/// ```
public final class VkImageViewCaptureDescriptorDataInfoEXT extends Struct {
    /// The struct layout of `VkImageViewCaptureDescriptorDataInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));

    /// Creates `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageViewCaptureDescriptorDataInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment); }

    /// Creates `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCaptureDescriptorDataInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewCaptureDescriptorDataInfoEXT`
    public static VkImageViewCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewCaptureDescriptorDataInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewCaptureDescriptorDataInfoEXT`
    public static VkImageViewCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewCaptureDescriptorDataInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewCaptureDescriptorDataInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewCaptureDescriptorDataInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewCaptureDescriptorDataInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewCaptureDescriptorDataInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT sType(@CType("VkStructureType") int value) { VkImageViewCaptureDescriptorDataInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageViewCaptureDescriptorDataInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageViewCaptureDescriptorDataInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageViewCaptureDescriptorDataInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment) { return VkImageViewCaptureDescriptorDataInfoEXT.get_imageView(segment, 0L); }
    /// {@return `imageView` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewAt(long index) { return VkImageViewCaptureDescriptorDataInfoEXT.get_imageView(this.segment(), index); }
    /// {@return `imageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageView() { return VkImageViewCaptureDescriptorDataInfoEXT.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT imageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_imageView(this.segment(), index, value); return this; }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCaptureDescriptorDataInfoEXT imageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkImageViewCaptureDescriptorDataInfoEXT.set_imageView(this.segment(), value); return this; }

}
