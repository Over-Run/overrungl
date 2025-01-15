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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### renderArea
/// [Byte offset][#OFFSET_renderArea] - [Memory layout][#ML_renderArea] - [Getter][#renderArea()] - [Setter][#renderArea(java.lang.foreign.MemorySegment)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ### viewMask
/// [VarHandle][#VH_viewMask] - [Getter][#viewMask()] - [Setter][#viewMask(int)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachments
/// [VarHandle][#VH_pColorAttachments] - [Getter][#pColorAttachments()] - [Setter][#pColorAttachments(java.lang.foreign.MemorySegment)]
/// ### pDepthAttachment
/// [VarHandle][#VH_pDepthAttachment] - [Getter][#pDepthAttachment()] - [Setter][#pDepthAttachment(java.lang.foreign.MemorySegment)]
/// ### pStencilAttachment
/// [VarHandle][#VH_pStencilAttachment] - [Getter][#pStencilAttachment()] - [Setter][#pStencilAttachment(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderingFlags flags;
///     VkRect2D renderArea;
///     uint32_t layerCount;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkRenderingAttachmentInfo * pColorAttachments;
///     const VkRenderingAttachmentInfo * pDepthAttachment;
///     const VkRenderingAttachmentInfo * pStencilAttachment;
/// } VkRenderingInfo;
/// ```
public sealed class VkRenderingInfo extends Struct {
    /// The struct layout of `VkRenderingInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pDepthAttachment"),
        ValueLayout.ADDRESS.withName("pStencilAttachment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout ML_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    /// The [VarHandle] of `pDepthAttachment` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDepthAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthAttachment"));
    /// The [VarHandle] of `pStencilAttachment` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilAttachment"));

    /// Creates `VkRenderingInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingInfo(segment); }

    /// Creates `VkRenderingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderingInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingInfo`
    public static VkRenderingInfo alloc(SegmentAllocator allocator) { return new VkRenderingInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderingInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingInfo`
    public static VkRenderingInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkRenderingFlags") int flags, @CType("VkRect2D") java.lang.foreign.MemorySegment renderArea, @CType("uint32_t") int layerCount, @CType("uint32_t") int viewMask, @CType("uint32_t") int colorAttachmentCount, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pColorAttachments, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pDepthAttachment, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pStencilAttachment) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).renderArea(renderArea).layerCount(layerCount).viewMask(viewMask).colorAttachmentCount(colorAttachmentCount).pColorAttachments(pColorAttachments).pDepthAttachment(pDepthAttachment).pStencilAttachment(pStencilAttachment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingInfo copyFrom(VkRenderingInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo sType(@CType("VkStructureType") int value) { VkRenderingInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderingFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderingFlags") int get_flags(MemorySegment segment) { return VkRenderingInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkRenderingFlags") int flags() { return VkRenderingInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkRenderingFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkRenderingFlags") int value) { VkRenderingInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo flags(@CType("VkRenderingFlags") int value) { VkRenderingInfo.set_flags(this.segment(), value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_renderArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea); }
    /// {@return `renderArea`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_renderArea(MemorySegment segment) { return VkRenderingInfo.get_renderArea(segment, 0L); }
    /// {@return `renderArea`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment renderArea() { return VkRenderingInfo.get_renderArea(this.segment()); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea.byteSize()); }
    /// Sets `renderArea` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_renderArea(segment, 0L, value); }
    /// Sets `renderArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo renderArea(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_renderArea(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkRenderingInfo.get_layerCount(segment, 0L); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkRenderingInfo.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingInfo.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo layerCount(@CType("uint32_t") int value) { VkRenderingInfo.set_layerCount(this.segment(), value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment) { return VkRenderingInfo.get_viewMask(segment, 0L); }
    /// {@return `viewMask`}
    public @CType("uint32_t") int viewMask() { return VkRenderingInfo.get_viewMask(this.segment()); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingInfo.set_viewMask(segment, 0L, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo viewMask(@CType("uint32_t") int value) { VkRenderingInfo.set_viewMask(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkRenderingInfo.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkRenderingInfo.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingInfo.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo colorAttachmentCount(@CType("uint32_t") int value) { VkRenderingInfo.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pColorAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachments.get(segment, 0L, index); }
    /// {@return `pColorAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pColorAttachments(MemorySegment segment) { return VkRenderingInfo.get_pColorAttachments(segment, 0L); }
    /// {@return `pColorAttachments`}
    public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pColorAttachments() { return VkRenderingInfo.get_pColorAttachments(this.segment()); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VH_pColorAttachments.set(segment, 0L, index, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pColorAttachments(segment, 0L, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pColorAttachments(@CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pColorAttachments(this.segment(), value); return this; }

    /// {@return `pDepthAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pDepthAttachment(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDepthAttachment.get(segment, 0L, index); }
    /// {@return `pDepthAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pDepthAttachment(MemorySegment segment) { return VkRenderingInfo.get_pDepthAttachment(segment, 0L); }
    /// {@return `pDepthAttachment`}
    public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pDepthAttachment() { return VkRenderingInfo.get_pDepthAttachment(this.segment()); }
    /// Sets `pDepthAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthAttachment(MemorySegment segment, long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VH_pDepthAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthAttachment(MemorySegment segment, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pDepthAttachment(segment, 0L, value); }
    /// Sets `pDepthAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pDepthAttachment(@CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pDepthAttachment(this.segment(), value); return this; }

    /// {@return `pStencilAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pStencilAttachment(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStencilAttachment.get(segment, 0L, index); }
    /// {@return `pStencilAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment get_pStencilAttachment(MemorySegment segment) { return VkRenderingInfo.get_pStencilAttachment(segment, 0L); }
    /// {@return `pStencilAttachment`}
    public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pStencilAttachment() { return VkRenderingInfo.get_pStencilAttachment(this.segment()); }
    /// Sets `pStencilAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStencilAttachment(MemorySegment segment, long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VH_pStencilAttachment.set(segment, 0L, index, value); }
    /// Sets `pStencilAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStencilAttachment(MemorySegment segment, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pStencilAttachment(segment, 0L, value); }
    /// Sets `pStencilAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pStencilAttachment(@CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pStencilAttachment(this.segment(), value); return this; }

    /// A buffer of [VkRenderingInfo].
    public static final class Buffer extends VkRenderingInfo {
        private final long elementCount;

        /// Creates `VkRenderingInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderingInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderingInfo`
        public VkRenderingInfo asSlice(long index) { return new VkRenderingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderingInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderingInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkRenderingFlags") int flagsAt(long index) { return VkRenderingInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkRenderingFlags") int value) { VkRenderingInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `renderArea` at the given index}
        /// @param index the index
        public @CType("VkRect2D") java.lang.foreign.MemorySegment renderAreaAt(long index) { return VkRenderingInfo.get_renderArea(this.segment(), index); }
        /// Sets `renderArea` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderAreaAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_renderArea(this.segment(), index, value); return this; }

        /// {@return `layerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int layerCountAt(long index) { return VkRenderingInfo.get_layerCount(this.segment(), index); }
        /// Sets `layerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layerCountAt(long index, @CType("uint32_t") int value) { VkRenderingInfo.set_layerCount(this.segment(), index, value); return this; }

        /// {@return `viewMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int viewMaskAt(long index) { return VkRenderingInfo.get_viewMask(this.segment(), index); }
        /// Sets `viewMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer viewMaskAt(long index, @CType("uint32_t") int value) { VkRenderingInfo.set_viewMask(this.segment(), index, value); return this; }

        /// {@return `colorAttachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkRenderingInfo.get_colorAttachmentCount(this.segment(), index); }
        /// Sets `colorAttachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderingInfo.set_colorAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pColorAttachments` at the given index}
        /// @param index the index
        public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pColorAttachmentsAt(long index) { return VkRenderingInfo.get_pColorAttachments(this.segment(), index); }
        /// Sets `pColorAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorAttachmentsAt(long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pColorAttachments(this.segment(), index, value); return this; }

        /// {@return `pDepthAttachment` at the given index}
        /// @param index the index
        public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pDepthAttachmentAt(long index) { return VkRenderingInfo.get_pDepthAttachment(this.segment(), index); }
        /// Sets `pDepthAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDepthAttachmentAt(long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pDepthAttachment(this.segment(), index, value); return this; }

        /// {@return `pStencilAttachment` at the given index}
        /// @param index the index
        public @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment pStencilAttachmentAt(long index) { return VkRenderingInfo.get_pStencilAttachment(this.segment(), index); }
        /// Sets `pStencilAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStencilAttachmentAt(long index, @CType("const VkRenderingAttachmentInfo *") java.lang.foreign.MemorySegment value) { VkRenderingInfo.set_pStencilAttachment(this.segment(), index, value); return this; }

    }
}
