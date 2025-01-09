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
package overrungl.vulkan.struct;

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
/// ### attachment
/// [VarHandle][#VH_attachment] - [Getter][#attachment()] - [Setter][#attachment(int)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(int)]
/// ### aspectMask
/// [VarHandle][#VH_aspectMask] - [Getter][#aspectMask()] - [Setter][#aspectMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentReference2 {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t attachment;
///     VkImageLayout layout;
///     VkImageAspectFlags aspectMask;
/// } VkAttachmentReference2;
/// ```
public final class VkAttachmentReference2 extends Struct {
    /// The struct layout of `VkAttachmentReference2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `attachment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachment"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));

    /// Creates `VkAttachmentReference2` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentReference2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentReference2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentReference2(segment); }

    /// Creates `VkAttachmentReference2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentReference2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentReference2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentReference2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAttachmentReference2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentReference2`
    public static VkAttachmentReference2 alloc(SegmentAllocator allocator) { return new VkAttachmentReference2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentReference2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentReference2`
    public static VkAttachmentReference2 alloc(SegmentAllocator allocator, long count) { return new VkAttachmentReference2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAttachmentReference2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAttachmentReference2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAttachmentReference2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAttachmentReference2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 sTypeAt(long index, @CType("VkStructureType") int value) { VkAttachmentReference2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 sType(@CType("VkStructureType") int value) { VkAttachmentReference2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAttachmentReference2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAttachmentReference2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAttachmentReference2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentReference2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentReference2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentReference2.set_pNext(this.segment(), value); return this; }

    /// {@return `attachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachment(MemorySegment segment, long index) { return (int) VH_attachment.get(segment, 0L, index); }
    /// {@return `attachment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachment(MemorySegment segment) { return VkAttachmentReference2.get_attachment(segment, 0L); }
    /// {@return `attachment` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentAt(long index) { return VkAttachmentReference2.get_attachment(this.segment(), index); }
    /// {@return `attachment`}
    public @CType("uint32_t") int attachment() { return VkAttachmentReference2.get_attachment(this.segment()); }
    /// Sets `attachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachment.set(segment, 0L, index, value); }
    /// Sets `attachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachment(MemorySegment segment, @CType("uint32_t") int value) { VkAttachmentReference2.set_attachment(segment, 0L, value); }
    /// Sets `attachment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 attachmentAt(long index, @CType("uint32_t") int value) { VkAttachmentReference2.set_attachment(this.segment(), index, value); return this; }
    /// Sets `attachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 attachment(@CType("uint32_t") int value) { VkAttachmentReference2.set_attachment(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_layout(MemorySegment segment, long index) { return (int) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_layout(MemorySegment segment) { return VkAttachmentReference2.get_layout(segment, 0L); }
    /// {@return `layout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int layoutAt(long index) { return VkAttachmentReference2.get_layout(this.segment(), index); }
    /// {@return `layout`}
    public @CType("VkImageLayout") int layout() { return VkAttachmentReference2.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentReference2.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 layoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentReference2.set_layout(this.segment(), index, value); return this; }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 layout(@CType("VkImageLayout") int value) { VkAttachmentReference2.set_layout(this.segment(), value); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkAttachmentReference2.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkAttachmentReference2.get_aspectMask(this.segment(), index); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkAttachmentReference2.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkAttachmentReference2.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkAttachmentReference2.set_aspectMask(this.segment(), index, value); return this; }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference2 aspectMask(@CType("VkImageAspectFlags") int value) { VkAttachmentReference2.set_aspectMask(this.segment(), value); return this; }

}
