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
/// ### plane
/// [VarHandle][#VH_plane] - [Getter][#plane()] - [Setter][#plane(int)]
/// ### mtlTexture
/// [VarHandle][#VH_mtlTexture] - [Getter][#mtlTexture()] - [Setter][#mtlTexture(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMetalTextureInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageAspectFlagBits plane;
///     MTLTexture_id mtlTexture;
/// } VkImportMetalTextureInfoEXT;
/// ```
public sealed class VkImportMetalTextureInfoEXT extends Struct {
    /// The struct layout of `VkImportMetalTextureInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `plane` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_plane = LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane"));
    /// The [VarHandle] of `mtlTexture` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlTexture = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture"));

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImportMetalTextureInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalTextureInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalTextureInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportMetalTextureInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalTextureInfoEXT`
    public static VkImportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalTextureInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMetalTextureInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalTextureInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMetalTextureInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalTextureInfoEXT`
    public static VkImportMetalTextureInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkImageAspectFlagBits") int plane, @CType("MTLTexture_id") MemorySegment mtlTexture) { return alloc(allocator).sType(sType).pNext(pNext).plane(plane).mtlTexture(mtlTexture); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalTextureInfoEXT copyFrom(VkImportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMetalTextureInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMetalTextureInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMetalTextureInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT sType(@CType("VkStructureType") int value) { VkImportMetalTextureInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImportMetalTextureInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImportMetalTextureInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImportMetalTextureInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT pNext(@CType("const void *") MemorySegment value) { VkImportMetalTextureInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `plane` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment, long index) { return (int) VH_plane.get(segment, 0L, index); }
    /// {@return `plane`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_plane(MemorySegment segment) { return VkImportMetalTextureInfoEXT.get_plane(segment, 0L); }
    /// {@return `plane`}
    public @CType("VkImageAspectFlagBits") int plane() { return VkImportMetalTextureInfoEXT.get_plane(this.segment()); }
    /// Sets `plane` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_plane(MemorySegment segment, long index, @CType("VkImageAspectFlagBits") int value) { VH_plane.set(segment, 0L, index, value); }
    /// Sets `plane` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_plane(MemorySegment segment, @CType("VkImageAspectFlagBits") int value) { VkImportMetalTextureInfoEXT.set_plane(segment, 0L, value); }
    /// Sets `plane` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT plane(@CType("VkImageAspectFlagBits") int value) { VkImportMetalTextureInfoEXT.set_plane(this.segment(), value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLTexture_id") MemorySegment get_mtlTexture(MemorySegment segment, long index) { return (MemorySegment) VH_mtlTexture.get(segment, 0L, index); }
    /// {@return `mtlTexture`}
    /// @param segment the segment of the struct
    public static @CType("MTLTexture_id") MemorySegment get_mtlTexture(MemorySegment segment) { return VkImportMetalTextureInfoEXT.get_mtlTexture(segment, 0L); }
    /// {@return `mtlTexture`}
    public @CType("MTLTexture_id") MemorySegment mtlTexture() { return VkImportMetalTextureInfoEXT.get_mtlTexture(this.segment()); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, long index, @CType("MTLTexture_id") MemorySegment value) { VH_mtlTexture.set(segment, 0L, index, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlTexture(MemorySegment segment, @CType("MTLTexture_id") MemorySegment value) { VkImportMetalTextureInfoEXT.set_mtlTexture(segment, 0L, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT mtlTexture(@CType("MTLTexture_id") MemorySegment value) { VkImportMetalTextureInfoEXT.set_mtlTexture(this.segment(), value); return this; }

    /// A buffer of [VkImportMetalTextureInfoEXT].
    public static final class Buffer extends VkImportMetalTextureInfoEXT {
        private final long elementCount;

        /// Creates `VkImportMetalTextureInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportMetalTextureInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportMetalTextureInfoEXT`
        public VkImportMetalTextureInfoEXT asSlice(long index) { return new VkImportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportMetalTextureInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportMetalTextureInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMetalTextureInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMetalTextureInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImportMetalTextureInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImportMetalTextureInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `plane` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlagBits") int planeAt(long index) { return VkImportMetalTextureInfoEXT.get_plane(this.segment(), index); }
        /// Sets `plane` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeAt(long index, @CType("VkImageAspectFlagBits") int value) { VkImportMetalTextureInfoEXT.set_plane(this.segment(), index, value); return this; }

        /// {@return `mtlTexture` at the given index}
        /// @param index the index
        public @CType("MTLTexture_id") MemorySegment mtlTextureAt(long index) { return VkImportMetalTextureInfoEXT.get_mtlTexture(this.segment(), index); }
        /// Sets `mtlTexture` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mtlTextureAt(long index, @CType("MTLTexture_id") MemorySegment value) { VkImportMetalTextureInfoEXT.set_mtlTexture(this.segment(), index, value); return this; }

    }
}
