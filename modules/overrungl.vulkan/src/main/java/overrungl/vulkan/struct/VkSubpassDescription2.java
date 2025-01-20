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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### viewMask
/// [VarHandle][#VH_viewMask] - [Getter][#viewMask()] - [Setter][#viewMask(int)]
/// ### inputAttachmentCount
/// [VarHandle][#VH_inputAttachmentCount] - [Getter][#inputAttachmentCount()] - [Setter][#inputAttachmentCount(int)]
/// ### pInputAttachments
/// [VarHandle][#VH_pInputAttachments] - [Getter][#pInputAttachments()] - [Setter][#pInputAttachments(MemorySegment)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachments
/// [VarHandle][#VH_pColorAttachments] - [Getter][#pColorAttachments()] - [Setter][#pColorAttachments(MemorySegment)]
/// ### pResolveAttachments
/// [VarHandle][#VH_pResolveAttachments] - [Getter][#pResolveAttachments()] - [Setter][#pResolveAttachments(MemorySegment)]
/// ### pDepthStencilAttachment
/// [VarHandle][#VH_pDepthStencilAttachment] - [Getter][#pDepthStencilAttachment()] - [Setter][#pDepthStencilAttachment(MemorySegment)]
/// ### preserveAttachmentCount
/// [VarHandle][#VH_preserveAttachmentCount] - [Getter][#preserveAttachmentCount()] - [Setter][#preserveAttachmentCount(int)]
/// ### pPreserveAttachments
/// [VarHandle][#VH_pPreserveAttachments] - [Getter][#pPreserveAttachments()] - [Setter][#pPreserveAttachments(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassDescription2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkSubpassDescriptionFlags flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t viewMask;
///     uint32_t inputAttachmentCount;
///     const VkAttachmentReference2 * pInputAttachments;
///     uint32_t colorAttachmentCount;
///     const VkAttachmentReference2 * pColorAttachments;
///     const VkAttachmentReference2 * pResolveAttachments;
///     const VkAttachmentReference2 * pDepthStencilAttachment;
///     uint32_t preserveAttachmentCount;
///     const uint32_t * pPreserveAttachments;
/// } VkSubpassDescription2;
/// ```
public sealed class VkSubpassDescription2 extends Struct {
    /// The struct layout of `VkSubpassDescription2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("inputAttachmentCount"),
        ValueLayout.ADDRESS.withName("pInputAttachments"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pResolveAttachments"),
        ValueLayout.ADDRESS.withName("pDepthStencilAttachment"),
        ValueLayout.JAVA_INT.withName("preserveAttachmentCount"),
        ValueLayout.ADDRESS.withName("pPreserveAttachments")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `inputAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inputAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentCount"));
    /// The [VarHandle] of `pInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachments"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    /// The [VarHandle] of `pResolveAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pResolveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResolveAttachments"));
    /// The [VarHandle] of `pDepthStencilAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilAttachment"));
    /// The [VarHandle] of `preserveAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preserveAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preserveAttachmentCount"));
    /// The [VarHandle] of `pPreserveAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPreserveAttachments"));

    /// Creates `VkSubpassDescription2` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDescription2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDescription2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescription2(segment); }

    /// Creates `VkSubpassDescription2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescription2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassDescription2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescription2`
    public static VkSubpassDescription2 alloc(SegmentAllocator allocator) { return new VkSubpassDescription2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDescription2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDescription2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassDescription2` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescription2`
    public static VkSubpassDescription2 allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSubpassDescriptionFlags") int flags, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("uint32_t") int viewMask, @CType("uint32_t") int inputAttachmentCount, @CType("const VkAttachmentReference2 *") MemorySegment pInputAttachments, @CType("uint32_t") int colorAttachmentCount, @CType("const VkAttachmentReference2 *") MemorySegment pColorAttachments, @CType("const VkAttachmentReference2 *") MemorySegment pResolveAttachments, @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilAttachment, @CType("uint32_t") int preserveAttachmentCount, @CType("const uint32_t *") MemorySegment pPreserveAttachments) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pipelineBindPoint(pipelineBindPoint).viewMask(viewMask).inputAttachmentCount(inputAttachmentCount).pInputAttachments(pInputAttachments).colorAttachmentCount(colorAttachmentCount).pColorAttachments(pColorAttachments).pResolveAttachments(pResolveAttachments).pDepthStencilAttachment(pDepthStencilAttachment).preserveAttachmentCount(preserveAttachmentCount).pPreserveAttachments(pPreserveAttachments); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassDescription2 copyFrom(VkSubpassDescription2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassDescription2.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassDescription2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassDescription2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 sType(@CType("VkStructureType") int value) { VkSubpassDescription2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSubpassDescription2.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSubpassDescription2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSubpassDescription2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pNext(@CType("const void *") MemorySegment value) { VkSubpassDescription2.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubpassDescriptionFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSubpassDescriptionFlags") int get_flags(MemorySegment segment) { return VkSubpassDescription2.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSubpassDescriptionFlags") int flags() { return VkSubpassDescription2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSubpassDescriptionFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 flags(@CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2.set_flags(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkSubpassDescription2.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkSubpassDescription2.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkSubpassDescription2.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkSubpassDescription2.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment) { return VkSubpassDescription2.get_viewMask(segment, 0L); }
    /// {@return `viewMask`}
    public @CType("uint32_t") int viewMask() { return VkSubpassDescription2.get_viewMask(this.segment()); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription2.set_viewMask(segment, 0L, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 viewMask(@CType("uint32_t") int value) { VkSubpassDescription2.set_viewMask(this.segment(), value); return this; }

    /// {@return `inputAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_inputAttachmentCount(MemorySegment segment, long index) { return (int) VH_inputAttachmentCount.get(segment, 0L, index); }
    /// {@return `inputAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_inputAttachmentCount(MemorySegment segment) { return VkSubpassDescription2.get_inputAttachmentCount(segment, 0L); }
    /// {@return `inputAttachmentCount`}
    public @CType("uint32_t") int inputAttachmentCount() { return VkSubpassDescription2.get_inputAttachmentCount(this.segment()); }
    /// Sets `inputAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_inputAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription2.set_inputAttachmentCount(segment, 0L, value); }
    /// Sets `inputAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 inputAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription2.set_inputAttachmentCount(this.segment(), value); return this; }

    /// {@return `pInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pInputAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pInputAttachments.get(segment, 0L, index); }
    /// {@return `pInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pInputAttachments(MemorySegment segment) { return VkSubpassDescription2.get_pInputAttachments(segment, 0L); }
    /// {@return `pInputAttachments`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pInputAttachments() { return VkSubpassDescription2.get_pInputAttachments(this.segment()); }
    /// Sets `pInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInputAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pInputAttachments.set(segment, 0L, index, value); }
    /// Sets `pInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInputAttachments(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pInputAttachments(segment, 0L, value); }
    /// Sets `pInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pInputAttachments(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pInputAttachments(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkSubpassDescription2.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkSubpassDescription2.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription2.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 colorAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription2.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pColorAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachments.get(segment, 0L, index); }
    /// {@return `pColorAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pColorAttachments(MemorySegment segment) { return VkSubpassDescription2.get_pColorAttachments(segment, 0L); }
    /// {@return `pColorAttachments`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pColorAttachments() { return VkSubpassDescription2.get_pColorAttachments(this.segment()); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pColorAttachments.set(segment, 0L, index, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pColorAttachments(segment, 0L, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pColorAttachments(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pColorAttachments(this.segment(), value); return this; }

    /// {@return `pResolveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pResolveAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pResolveAttachments.get(segment, 0L, index); }
    /// {@return `pResolveAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pResolveAttachments(MemorySegment segment) { return VkSubpassDescription2.get_pResolveAttachments(segment, 0L); }
    /// {@return `pResolveAttachments`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pResolveAttachments() { return VkSubpassDescription2.get_pResolveAttachments(this.segment()); }
    /// Sets `pResolveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pResolveAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pResolveAttachments.set(segment, 0L, index, value); }
    /// Sets `pResolveAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pResolveAttachments(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pResolveAttachments(segment, 0L, value); }
    /// Sets `pResolveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pResolveAttachments(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pResolveAttachments(this.segment(), value); return this; }

    /// {@return `pDepthStencilAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pDepthStencilAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthStencilAttachment.get(segment, 0L, index); }
    /// {@return `pDepthStencilAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference2 *") MemorySegment get_pDepthStencilAttachment(MemorySegment segment) { return VkSubpassDescription2.get_pDepthStencilAttachment(segment, 0L); }
    /// {@return `pDepthStencilAttachment`}
    public @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilAttachment() { return VkSubpassDescription2.get_pDepthStencilAttachment(this.segment()); }
    /// Sets `pDepthStencilAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthStencilAttachment(MemorySegment segment, long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VH_pDepthStencilAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthStencilAttachment(MemorySegment segment, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pDepthStencilAttachment(segment, 0L, value); }
    /// Sets `pDepthStencilAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pDepthStencilAttachment(@CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pDepthStencilAttachment(this.segment(), value); return this; }

    /// {@return `preserveAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preserveAttachmentCount(MemorySegment segment, long index) { return (int) VH_preserveAttachmentCount.get(segment, 0L, index); }
    /// {@return `preserveAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preserveAttachmentCount(MemorySegment segment) { return VkSubpassDescription2.get_preserveAttachmentCount(segment, 0L); }
    /// {@return `preserveAttachmentCount`}
    public @CType("uint32_t") int preserveAttachmentCount() { return VkSubpassDescription2.get_preserveAttachmentCount(this.segment()); }
    /// Sets `preserveAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preserveAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preserveAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `preserveAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preserveAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription2.set_preserveAttachmentCount(segment, 0L, value); }
    /// Sets `preserveAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 preserveAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription2.set_preserveAttachmentCount(this.segment(), value); return this; }

    /// {@return `pPreserveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") MemorySegment get_pPreserveAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pPreserveAttachments.get(segment, 0L, index); }
    /// {@return `pPreserveAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") MemorySegment get_pPreserveAttachments(MemorySegment segment) { return VkSubpassDescription2.get_pPreserveAttachments(segment, 0L); }
    /// {@return `pPreserveAttachments`}
    public @CType("const uint32_t *") MemorySegment pPreserveAttachments() { return VkSubpassDescription2.get_pPreserveAttachments(this.segment()); }
    /// Sets `pPreserveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPreserveAttachments(MemorySegment segment, long index, @CType("const uint32_t *") MemorySegment value) { VH_pPreserveAttachments.set(segment, 0L, index, value); }
    /// Sets `pPreserveAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPreserveAttachments(MemorySegment segment, @CType("const uint32_t *") MemorySegment value) { VkSubpassDescription2.set_pPreserveAttachments(segment, 0L, value); }
    /// Sets `pPreserveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription2 pPreserveAttachments(@CType("const uint32_t *") MemorySegment value) { VkSubpassDescription2.set_pPreserveAttachments(this.segment(), value); return this; }

    /// A buffer of [VkSubpassDescription2].
    public static final class Buffer extends VkSubpassDescription2 {
        private final long elementCount;

        /// Creates `VkSubpassDescription2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassDescription2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassDescription2`
        public VkSubpassDescription2 asSlice(long index) { return new VkSubpassDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassDescription2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassDescription2`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassDescription2.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassDescription2.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSubpassDescription2.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSubpassDescription2.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSubpassDescriptionFlags") int flagsAt(long index) { return VkSubpassDescription2.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription2.set_flags(this.segment(), index, value); return this; }

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index
        public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkSubpassDescription2.get_pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkSubpassDescription2.set_pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `viewMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int viewMaskAt(long index) { return VkSubpassDescription2.get_viewMask(this.segment(), index); }
        /// Sets `viewMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer viewMaskAt(long index, @CType("uint32_t") int value) { VkSubpassDescription2.set_viewMask(this.segment(), index, value); return this; }

        /// {@return `inputAttachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int inputAttachmentCountAt(long index) { return VkSubpassDescription2.get_inputAttachmentCount(this.segment(), index); }
        /// Sets `inputAttachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer inputAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription2.set_inputAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pInputAttachments` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pInputAttachmentsAt(long index) { return VkSubpassDescription2.get_pInputAttachments(this.segment(), index); }
        /// Sets `pInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pInputAttachmentsAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pInputAttachments(this.segment(), index, value); return this; }

        /// {@return `colorAttachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkSubpassDescription2.get_colorAttachmentCount(this.segment(), index); }
        /// Sets `colorAttachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription2.set_colorAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pColorAttachments` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pColorAttachmentsAt(long index) { return VkSubpassDescription2.get_pColorAttachments(this.segment(), index); }
        /// Sets `pColorAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pColorAttachmentsAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pColorAttachments(this.segment(), index, value); return this; }

        /// {@return `pResolveAttachments` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pResolveAttachmentsAt(long index) { return VkSubpassDescription2.get_pResolveAttachments(this.segment(), index); }
        /// Sets `pResolveAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pResolveAttachmentsAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pResolveAttachments(this.segment(), index, value); return this; }

        /// {@return `pDepthStencilAttachment` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentReference2 *") MemorySegment pDepthStencilAttachmentAt(long index) { return VkSubpassDescription2.get_pDepthStencilAttachment(this.segment(), index); }
        /// Sets `pDepthStencilAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDepthStencilAttachmentAt(long index, @CType("const VkAttachmentReference2 *") MemorySegment value) { VkSubpassDescription2.set_pDepthStencilAttachment(this.segment(), index, value); return this; }

        /// {@return `preserveAttachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int preserveAttachmentCountAt(long index) { return VkSubpassDescription2.get_preserveAttachmentCount(this.segment(), index); }
        /// Sets `preserveAttachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer preserveAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription2.set_preserveAttachmentCount(this.segment(), index, value); return this; }

        /// {@return `pPreserveAttachments` at the given index}
        /// @param index the index
        public @CType("const uint32_t *") MemorySegment pPreserveAttachmentsAt(long index) { return VkSubpassDescription2.get_pPreserveAttachments(this.segment(), index); }
        /// Sets `pPreserveAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPreserveAttachmentsAt(long index, @CType("const uint32_t *") MemorySegment value) { VkSubpassDescription2.set_pPreserveAttachments(this.segment(), index, value); return this; }

    }
}
