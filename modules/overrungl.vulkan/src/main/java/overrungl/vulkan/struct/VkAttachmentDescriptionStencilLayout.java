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
/// ### stencilInitialLayout
/// [VarHandle][#VH_stencilInitialLayout] - [Getter][#stencilInitialLayout()] - [Setter][#stencilInitialLayout(int)]
/// ### stencilFinalLayout
/// [VarHandle][#VH_stencilFinalLayout] - [Getter][#stencilFinalLayout()] - [Setter][#stencilFinalLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentDescriptionStencilLayout {
///     VkStructureType sType;
///     void * pNext;
///     VkImageLayout stencilInitialLayout;
///     VkImageLayout stencilFinalLayout;
/// } VkAttachmentDescriptionStencilLayout;
/// ```
public final class VkAttachmentDescriptionStencilLayout extends Struct {
    /// The struct layout of `VkAttachmentDescriptionStencilLayout`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilInitialLayout"),
        ValueLayout.JAVA_INT.withName("stencilFinalLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stencilInitialLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilInitialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilInitialLayout"));
    /// The [VarHandle] of `stencilFinalLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilFinalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilFinalLayout"));

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentDescriptionStencilLayout(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayout of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayout(segment); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayout ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayout(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentDescriptionStencilLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayout ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayout(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout alloc(SegmentAllocator allocator) { return new VkAttachmentDescriptionStencilLayout(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentDescriptionStencilLayout` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentDescriptionStencilLayout`
    public static VkAttachmentDescriptionStencilLayout alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescriptionStencilLayout(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAttachmentDescriptionStencilLayout.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAttachmentDescriptionStencilLayout.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAttachmentDescriptionStencilLayout.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayout.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout sTypeAt(long index, @CType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayout.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout sType(@CType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayout.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAttachmentDescriptionStencilLayout.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAttachmentDescriptionStencilLayout.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkAttachmentDescriptionStencilLayout.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescriptionStencilLayout.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescriptionStencilLayout.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescriptionStencilLayout.set_pNext(this.segment(), value); return this; }

    /// {@return `stencilInitialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_stencilInitialLayout(MemorySegment segment, long index) { return (int) VH_stencilInitialLayout.get(segment, 0L, index); }
    /// {@return `stencilInitialLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_stencilInitialLayout(MemorySegment segment) { return VkAttachmentDescriptionStencilLayout.get_stencilInitialLayout(segment, 0L); }
    /// {@return `stencilInitialLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int stencilInitialLayoutAt(long index) { return VkAttachmentDescriptionStencilLayout.get_stencilInitialLayout(this.segment(), index); }
    /// {@return `stencilInitialLayout`}
    public @CType("VkImageLayout") int stencilInitialLayout() { return VkAttachmentDescriptionStencilLayout.get_stencilInitialLayout(this.segment()); }
    /// Sets `stencilInitialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilInitialLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_stencilInitialLayout.set(segment, 0L, index, value); }
    /// Sets `stencilInitialLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilInitialLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilInitialLayout(segment, 0L, value); }
    /// Sets `stencilInitialLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilInitialLayoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilInitialLayout(this.segment(), index, value); return this; }
    /// Sets `stencilInitialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilInitialLayout(@CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilInitialLayout(this.segment(), value); return this; }

    /// {@return `stencilFinalLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_stencilFinalLayout(MemorySegment segment, long index) { return (int) VH_stencilFinalLayout.get(segment, 0L, index); }
    /// {@return `stencilFinalLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_stencilFinalLayout(MemorySegment segment) { return VkAttachmentDescriptionStencilLayout.get_stencilFinalLayout(segment, 0L); }
    /// {@return `stencilFinalLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int stencilFinalLayoutAt(long index) { return VkAttachmentDescriptionStencilLayout.get_stencilFinalLayout(this.segment(), index); }
    /// {@return `stencilFinalLayout`}
    public @CType("VkImageLayout") int stencilFinalLayout() { return VkAttachmentDescriptionStencilLayout.get_stencilFinalLayout(this.segment()); }
    /// Sets `stencilFinalLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilFinalLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_stencilFinalLayout.set(segment, 0L, index, value); }
    /// Sets `stencilFinalLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilFinalLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilFinalLayout(segment, 0L, value); }
    /// Sets `stencilFinalLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilFinalLayoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilFinalLayout(this.segment(), index, value); return this; }
    /// Sets `stencilFinalLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayout stencilFinalLayout(@CType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayout.set_stencilFinalLayout(this.segment(), value); return this; }

}
