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
/// ### attachmentInitialSampleLocationsCount
/// [VarHandle][#VH_attachmentInitialSampleLocationsCount] - [Getter][#attachmentInitialSampleLocationsCount()] - [Setter][#attachmentInitialSampleLocationsCount(int)]
/// ### pAttachmentInitialSampleLocations
/// [VarHandle][#VH_pAttachmentInitialSampleLocations] - [Getter][#pAttachmentInitialSampleLocations()] - [Setter][#pAttachmentInitialSampleLocations(java.lang.foreign.MemorySegment)]
/// ### postSubpassSampleLocationsCount
/// [VarHandle][#VH_postSubpassSampleLocationsCount] - [Getter][#postSubpassSampleLocationsCount()] - [Setter][#postSubpassSampleLocationsCount(int)]
/// ### pPostSubpassSampleLocations
/// [VarHandle][#VH_pPostSubpassSampleLocations] - [Getter][#pPostSubpassSampleLocations()] - [Setter][#pPostSubpassSampleLocations(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassSampleLocationsBeginInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t attachmentInitialSampleLocationsCount;
///     const VkAttachmentSampleLocationsEXT * pAttachmentInitialSampleLocations;
///     uint32_t postSubpassSampleLocationsCount;
///     const VkSubpassSampleLocationsEXT * pPostSubpassSampleLocations;
/// } VkRenderPassSampleLocationsBeginInfoEXT;
/// ```
public final class VkRenderPassSampleLocationsBeginInfoEXT extends Struct {
    /// The struct layout of `VkRenderPassSampleLocationsBeginInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentInitialSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pAttachmentInitialSampleLocations"),
        ValueLayout.JAVA_INT.withName("postSubpassSampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pPostSubpassSampleLocations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `attachmentInitialSampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentInitialSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentInitialSampleLocationsCount"));
    /// The [VarHandle] of `pAttachmentInitialSampleLocations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttachmentInitialSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachmentInitialSampleLocations"));
    /// The [VarHandle] of `postSubpassSampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_postSubpassSampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("postSubpassSampleLocationsCount"));
    /// The [VarHandle] of `pPostSubpassSampleLocations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPostSubpassSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPostSubpassSampleLocations"));

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassSampleLocationsBeginInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassSampleLocationsBeginInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassSampleLocationsBeginInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassSampleLocationsBeginInfoEXT`
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassSampleLocationsBeginInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassSampleLocationsBeginInfoEXT`
    public static VkRenderPassSampleLocationsBeginInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRenderPassSampleLocationsBeginInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassSampleLocationsBeginInfoEXT`
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRenderPassSampleLocationsBeginInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassSampleLocationsBeginInfoEXT`
    public VkRenderPassSampleLocationsBeginInfoEXT asSlice(long index, long count) { return new VkRenderPassSampleLocationsBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassSampleLocationsBeginInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT sType(@CType("VkStructureType") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassSampleLocationsBeginInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `attachmentInitialSampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentInitialSampleLocationsCount(MemorySegment segment, long index) { return (int) VH_attachmentInitialSampleLocationsCount.get(segment, 0L, index); }
    /// {@return `attachmentInitialSampleLocationsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentInitialSampleLocationsCount(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_attachmentInitialSampleLocationsCount(segment, 0L); }
    /// {@return `attachmentInitialSampleLocationsCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentInitialSampleLocationsCountAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_attachmentInitialSampleLocationsCount(this.segment(), index); }
    /// {@return `attachmentInitialSampleLocationsCount`}
    public @CType("uint32_t") int attachmentInitialSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.get_attachmentInitialSampleLocationsCount(this.segment()); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentInitialSampleLocationsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentInitialSampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentInitialSampleLocationsCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_attachmentInitialSampleLocationsCount(segment, 0L, value); }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCountAt(long index, @CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_attachmentInitialSampleLocationsCount(this.segment(), index, value); return this; }
    /// Sets `attachmentInitialSampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT attachmentInitialSampleLocationsCount(@CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_attachmentInitialSampleLocationsCount(this.segment(), value); return this; }

    /// {@return `pAttachmentInitialSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment get_pAttachmentInitialSampleLocations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttachmentInitialSampleLocations.get(segment, 0L, index); }
    /// {@return `pAttachmentInitialSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment get_pAttachmentInitialSampleLocations(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pAttachmentInitialSampleLocations(segment, 0L); }
    /// {@return `pAttachmentInitialSampleLocations` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment pAttachmentInitialSampleLocationsAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pAttachmentInitialSampleLocations(this.segment(), index); }
    /// {@return `pAttachmentInitialSampleLocations`}
    public @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment pAttachmentInitialSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.get_pAttachmentInitialSampleLocations(this.segment()); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachmentInitialSampleLocations(MemorySegment segment, long index, @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VH_pAttachmentInitialSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachmentInitialSampleLocations(MemorySegment segment, @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pAttachmentInitialSampleLocations(segment, 0L, value); }
    /// Sets `pAttachmentInitialSampleLocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocationsAt(long index, @CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pAttachmentInitialSampleLocations(this.segment(), index, value); return this; }
    /// Sets `pAttachmentInitialSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(@CType("const VkAttachmentSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pAttachmentInitialSampleLocations(this.segment(), value); return this; }

    /// {@return `postSubpassSampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_postSubpassSampleLocationsCount(MemorySegment segment, long index) { return (int) VH_postSubpassSampleLocationsCount.get(segment, 0L, index); }
    /// {@return `postSubpassSampleLocationsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_postSubpassSampleLocationsCount(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_postSubpassSampleLocationsCount(segment, 0L); }
    /// {@return `postSubpassSampleLocationsCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int postSubpassSampleLocationsCountAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_postSubpassSampleLocationsCount(this.segment(), index); }
    /// {@return `postSubpassSampleLocationsCount`}
    public @CType("uint32_t") int postSubpassSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.get_postSubpassSampleLocationsCount(this.segment()); }
    /// Sets `postSubpassSampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_postSubpassSampleLocationsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_postSubpassSampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `postSubpassSampleLocationsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_postSubpassSampleLocationsCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_postSubpassSampleLocationsCount(segment, 0L, value); }
    /// Sets `postSubpassSampleLocationsCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCountAt(long index, @CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_postSubpassSampleLocationsCount(this.segment(), index, value); return this; }
    /// Sets `postSubpassSampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT postSubpassSampleLocationsCount(@CType("uint32_t") int value) { VkRenderPassSampleLocationsBeginInfoEXT.set_postSubpassSampleLocationsCount(this.segment(), value); return this; }

    /// {@return `pPostSubpassSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment get_pPostSubpassSampleLocations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPostSubpassSampleLocations.get(segment, 0L, index); }
    /// {@return `pPostSubpassSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment get_pPostSubpassSampleLocations(MemorySegment segment) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pPostSubpassSampleLocations(segment, 0L); }
    /// {@return `pPostSubpassSampleLocations` at the given index}
    /// @param index the index
    public @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment pPostSubpassSampleLocationsAt(long index) { return VkRenderPassSampleLocationsBeginInfoEXT.get_pPostSubpassSampleLocations(this.segment(), index); }
    /// {@return `pPostSubpassSampleLocations`}
    public @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment pPostSubpassSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.get_pPostSubpassSampleLocations(this.segment()); }
    /// Sets `pPostSubpassSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPostSubpassSampleLocations(MemorySegment segment, long index, @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VH_pPostSubpassSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pPostSubpassSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPostSubpassSampleLocations(MemorySegment segment, @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pPostSubpassSampleLocations(segment, 0L, value); }
    /// Sets `pPostSubpassSampleLocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocationsAt(long index, @CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pPostSubpassSampleLocations(this.segment(), index, value); return this; }
    /// Sets `pPostSubpassSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(@CType("const VkSubpassSampleLocationsEXT *") java.lang.foreign.MemorySegment value) { VkRenderPassSampleLocationsBeginInfoEXT.set_pPostSubpassSampleLocations(this.segment(), value); return this; }

}
