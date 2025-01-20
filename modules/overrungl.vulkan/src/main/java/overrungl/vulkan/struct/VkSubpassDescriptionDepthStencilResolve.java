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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### depthResolveMode
/// [VarHandle][#VH_depthResolveMode] - [Getter][#depthResolveMode()] - [Setter][#depthResolveMode(int)]
/// ### stencilResolveMode
/// [VarHandle][#VH_stencilResolveMode] - [Getter][#stencilResolveMode()] - [Setter][#stencilResolveMode(int)]
/// ### pDepthStencilResolveAttachment
/// [VarHandle][#VH_pDepthStencilResolveAttachment] - [Getter][#pDepthStencilResolveAttachment()] - [Setter][#pDepthStencilResolveAttachment(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassDescriptionDepthStencilResolve {
///     VkStructureType sType;
///     const void * pNext;
///     VkResolveModeFlagBits depthResolveMode;
///     VkResolveModeFlagBits stencilResolveMode;
///     const VkAttachmentReference2 * pDepthStencilResolveAttachment;
/// } VkSubpassDescriptionDepthStencilResolve;
/// ```
public sealed class VkSubpassDescriptionDepthStencilResolve extends Struct {
    /// The struct layout of `VkSubpassDescriptionDepthStencilResolve`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthResolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode"),
        ValueLayout.ADDRESS.withName("pDepthStencilResolveAttachment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `depthResolveMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthResolveMode"));
    /// The [VarHandle] of `stencilResolveMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilResolveMode"));
    /// The [VarHandle] of `pDepthStencilResolveAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthStencilResolveAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilResolveAttachment"));

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDescriptionDepthStencilResolve(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescriptionDepthStencilResolve of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolve(segment); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescriptionDepthStencilResolve ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolve(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassDescriptionDepthStencilResolve` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescriptionDepthStencilResolve`
    public static VkSubpassDescriptionDepthStencilResolve alloc(SegmentAllocator allocator) { return new VkSubpassDescriptionDepthStencilResolve(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDescriptionDepthStencilResolve` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDescriptionDepthStencilResolve`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassDescriptionDepthStencilResolve` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescriptionDepthStencilResolve`
    public static VkSubpassDescriptionDepthStencilResolve allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkResolveModeFlagBits") int depthResolveMode, @CType("VkResolveModeFlagBits") int stencilResolveMode, @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilResolveAttachment) { return alloc(allocator).sType(sType).pNext(pNext).depthResolveMode(depthResolveMode).stencilResolveMode(stencilResolveMode).pDepthStencilResolveAttachment(pDepthStencilResolveAttachment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve copyFrom(VkSubpassDescriptionDepthStencilResolve src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassDescriptionDepthStencilResolve.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassDescriptionDepthStencilResolve.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolve.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve sType(@CType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolve.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSubpassDescriptionDepthStencilResolve.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSubpassDescriptionDepthStencilResolve.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve pNext(@CType("const void *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pNext(this.segment(), value); return this; }

    /// {@return `depthResolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlagBits") int get_depthResolveMode(MemorySegment segment, long index) { return (int) VH_depthResolveMode.get(segment, 0L, index); }
    /// {@return `depthResolveMode`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlagBits") int get_depthResolveMode(MemorySegment segment) { return VkSubpassDescriptionDepthStencilResolve.get_depthResolveMode(segment, 0L); }
    /// {@return `depthResolveMode`}
    public @CType("VkResolveModeFlagBits") int depthResolveMode() { return VkSubpassDescriptionDepthStencilResolve.get_depthResolveMode(this.segment()); }
    /// Sets `depthResolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthResolveMode(MemorySegment segment, long index, @CType("VkResolveModeFlagBits") int value) { VH_depthResolveMode.set(segment, 0L, index, value); }
    /// Sets `depthResolveMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthResolveMode(MemorySegment segment, @CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_depthResolveMode(segment, 0L, value); }
    /// Sets `depthResolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(@CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_depthResolveMode(this.segment(), value); return this; }

    /// {@return `stencilResolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlagBits") int get_stencilResolveMode(MemorySegment segment, long index) { return (int) VH_stencilResolveMode.get(segment, 0L, index); }
    /// {@return `stencilResolveMode`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlagBits") int get_stencilResolveMode(MemorySegment segment) { return VkSubpassDescriptionDepthStencilResolve.get_stencilResolveMode(segment, 0L); }
    /// {@return `stencilResolveMode`}
    public @CType("VkResolveModeFlagBits") int stencilResolveMode() { return VkSubpassDescriptionDepthStencilResolve.get_stencilResolveMode(this.segment()); }
    /// Sets `stencilResolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilResolveMode(MemorySegment segment, long index, @CType("VkResolveModeFlagBits") int value) { VH_stencilResolveMode.set(segment, 0L, index, value); }
    /// Sets `stencilResolveMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilResolveMode(MemorySegment segment, @CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_stencilResolveMode(segment, 0L, value); }
    /// Sets `stencilResolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(@CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_stencilResolveMode(this.segment(), value); return this; }

    /// {@return `pDepthStencilResolveAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pDepthStencilResolveAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthStencilResolveAttachment.get(segment, 0L, index); }
    /// {@return `pDepthStencilResolveAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pDepthStencilResolveAttachment(MemorySegment segment) { return VkSubpassDescriptionDepthStencilResolve.get_pDepthStencilResolveAttachment(segment, 0L); }
    /// {@return `pDepthStencilResolveAttachment`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilResolveAttachment() { return VkSubpassDescriptionDepthStencilResolve.get_pDepthStencilResolveAttachment(this.segment()); }
    /// Sets `pDepthStencilResolveAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthStencilResolveAttachment(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pDepthStencilResolveAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilResolveAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthStencilResolveAttachment(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pDepthStencilResolveAttachment(segment, 0L, value); }
    /// Sets `pDepthStencilResolveAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pDepthStencilResolveAttachment(this.segment(), value); return this; }

    /// A buffer of [VkSubpassDescriptionDepthStencilResolve].
    public static final class Buffer extends VkSubpassDescriptionDepthStencilResolve {
        private final long elementCount;

        /// Creates `VkSubpassDescriptionDepthStencilResolve.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassDescriptionDepthStencilResolve`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassDescriptionDepthStencilResolve`
        public VkSubpassDescriptionDepthStencilResolve asSlice(long index) { return new VkSubpassDescriptionDepthStencilResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassDescriptionDepthStencilResolve`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassDescriptionDepthStencilResolve`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassDescriptionDepthStencilResolve.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolve.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSubpassDescriptionDepthStencilResolve.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pNext(this.segment(), index, value); return this; }

        /// {@return `depthResolveMode` at the given index}
        /// @param index the index
        public @CType("VkResolveModeFlagBits") int depthResolveModeAt(long index) { return VkSubpassDescriptionDepthStencilResolve.get_depthResolveMode(this.segment(), index); }
        /// Sets `depthResolveMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthResolveModeAt(long index, @CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_depthResolveMode(this.segment(), index, value); return this; }

        /// {@return `stencilResolveMode` at the given index}
        /// @param index the index
        public @CType("VkResolveModeFlagBits") int stencilResolveModeAt(long index) { return VkSubpassDescriptionDepthStencilResolve.get_stencilResolveMode(this.segment(), index); }
        /// Sets `stencilResolveMode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stencilResolveModeAt(long index, @CType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.set_stencilResolveMode(this.segment(), index, value); return this; }

        /// {@return `pDepthStencilResolveAttachment` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilResolveAttachmentAt(long index) { return VkSubpassDescriptionDepthStencilResolve.get_pDepthStencilResolveAttachment(this.segment(), index); }
        /// Sets `pDepthStencilResolveAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDepthStencilResolveAttachmentAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescriptionDepthStencilResolve.set_pDepthStencilResolveAttachment(this.segment(), index, value); return this; }

    }
}
