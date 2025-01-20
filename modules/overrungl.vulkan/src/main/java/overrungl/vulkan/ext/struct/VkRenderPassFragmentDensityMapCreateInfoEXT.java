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
/// ### fragmentDensityMapAttachment
/// [Byte offset][#OFFSET_fragmentDensityMapAttachment] - [Memory layout][#ML_fragmentDensityMapAttachment] - [Getter][#fragmentDensityMapAttachment()] - [Setter][#fragmentDensityMapAttachment(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassFragmentDensityMapCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkAttachmentReference fragmentDensityMapAttachment;
/// } VkRenderPassFragmentDensityMapCreateInfoEXT;
/// ```
public sealed class VkRenderPassFragmentDensityMapCreateInfoEXT extends Struct {
    /// The struct layout of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `fragmentDensityMapAttachment`.
    public static final long OFFSET_fragmentDensityMapAttachment = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapAttachment"));
    /// The memory layout of `fragmentDensityMapAttachment`.
    public static final MemoryLayout ML_fragmentDensityMapAttachment = LAYOUT.select(PathElement.groupElement("fragmentDensityMapAttachment"));

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkAttachmentReference") MemorySegment fragmentDensityMapAttachment) { return alloc(allocator).sType(sType).pNext(pNext).fragmentDensityMapAttachment(fragmentDensityMapAttachment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT copyFrom(VkRenderPassFragmentDensityMapCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT sType(@CType("VkStructureType") int value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityMapAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentReference") MemorySegment get_fragmentDensityMapAttachment(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapAttachment, index), ML_fragmentDensityMapAttachment); }
    /// {@return `fragmentDensityMapAttachment`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentReference") MemorySegment get_fragmentDensityMapAttachment(MemorySegment segment) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_fragmentDensityMapAttachment(segment, 0L); }
    /// {@return `fragmentDensityMapAttachment`}
    public @CType("VkAttachmentReference") MemorySegment fragmentDensityMapAttachment() { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_fragmentDensityMapAttachment(this.segment()); }
    /// Sets `fragmentDensityMapAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMapAttachment(MemorySegment segment, long index, @CType("VkAttachmentReference") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentDensityMapAttachment, index), ML_fragmentDensityMapAttachment.byteSize()); }
    /// Sets `fragmentDensityMapAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMapAttachment(MemorySegment segment, @CType("VkAttachmentReference") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_fragmentDensityMapAttachment(segment, 0L, value); }
    /// Sets `fragmentDensityMapAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(@CType("VkAttachmentReference") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_fragmentDensityMapAttachment(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassFragmentDensityMapCreateInfoEXT].
    public static final class Buffer extends VkRenderPassFragmentDensityMapCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`
        public VkRenderPassFragmentDensityMapCreateInfoEXT asSlice(long index) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityMapAttachment` at the given index}
        /// @param index the index
        public @CType("VkAttachmentReference") MemorySegment fragmentDensityMapAttachmentAt(long index) { return VkRenderPassFragmentDensityMapCreateInfoEXT.get_fragmentDensityMapAttachment(this.segment(), index); }
        /// Sets `fragmentDensityMapAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityMapAttachmentAt(long index, @CType("VkAttachmentReference") MemorySegment value) { VkRenderPassFragmentDensityMapCreateInfoEXT.set_fragmentDensityMapAttachment(this.segment(), index, value); return this; }

    }
}
