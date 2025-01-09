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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### inputAttachmentCount
/// [VarHandle][#VH_inputAttachmentCount] - [Getter][#inputAttachmentCount()] - [Setter][#inputAttachmentCount(int)]
/// ### pInputAttachments
/// [VarHandle][#VH_pInputAttachments] - [Getter][#pInputAttachments()] - [Setter][#pInputAttachments(java.lang.foreign.MemorySegment)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachments
/// [VarHandle][#VH_pColorAttachments] - [Getter][#pColorAttachments()] - [Setter][#pColorAttachments(java.lang.foreign.MemorySegment)]
/// ### pResolveAttachments
/// [VarHandle][#VH_pResolveAttachments] - [Getter][#pResolveAttachments()] - [Setter][#pResolveAttachments(java.lang.foreign.MemorySegment)]
/// ### pDepthStencilAttachment
/// [VarHandle][#VH_pDepthStencilAttachment] - [Getter][#pDepthStencilAttachment()] - [Setter][#pDepthStencilAttachment(java.lang.foreign.MemorySegment)]
/// ### preserveAttachmentCount
/// [VarHandle][#VH_preserveAttachmentCount] - [Getter][#preserveAttachmentCount()] - [Setter][#preserveAttachmentCount(int)]
/// ### pPreserveAttachments
/// [VarHandle][#VH_pPreserveAttachments] - [Getter][#pPreserveAttachments()] - [Setter][#pPreserveAttachments(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassDescription {
///     VkSubpassDescriptionFlags flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t inputAttachmentCount;
///     const VkAttachmentReference * pInputAttachments;
///     uint32_t colorAttachmentCount;
///     const VkAttachmentReference * pColorAttachments;
///     const VkAttachmentReference * pResolveAttachments;
///     const VkAttachmentReference * pDepthStencilAttachment;
///     uint32_t preserveAttachmentCount;
///     const uint32_t * pPreserveAttachments;
/// } VkSubpassDescription;
/// ```
public final class VkSubpassDescription extends Struct {
    /// The struct layout of `VkSubpassDescription`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("inputAttachmentCount"),
        ValueLayout.ADDRESS.withName("pInputAttachments"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pResolveAttachments"),
        ValueLayout.ADDRESS.withName("pDepthStencilAttachment"),
        ValueLayout.JAVA_INT.withName("preserveAttachmentCount"),
        ValueLayout.ADDRESS.withName("pPreserveAttachments")
    );
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `inputAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inputAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputAttachmentCount"));
    /// The [VarHandle] of `pInputAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachments"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    /// The [VarHandle] of `pResolveAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pResolveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResolveAttachments"));
    /// The [VarHandle] of `pDepthStencilAttachment` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDepthStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilAttachment"));
    /// The [VarHandle] of `preserveAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preserveAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preserveAttachmentCount"));
    /// The [VarHandle] of `pPreserveAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPreserveAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPreserveAttachments"));

    /// Creates `VkSubpassDescription` with the given segment.
    /// @param segment the memory segment
    public VkSubpassDescription(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescription(segment); }

    /// Creates `VkSubpassDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescription ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSubpassDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescription`
    public static VkSubpassDescription alloc(SegmentAllocator allocator) { return new VkSubpassDescription(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDescription`
    public static VkSubpassDescription alloc(SegmentAllocator allocator, long count) { return new VkSubpassDescription(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSubpassDescription`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubpassDescription`
    public VkSubpassDescription asSlice(long index) { return new VkSubpassDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSubpassDescription`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubpassDescription`
    public VkSubpassDescription asSlice(long index, long count) { return new VkSubpassDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubpassDescriptionFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSubpassDescriptionFlags") int get_flags(MemorySegment segment) { return VkSubpassDescription.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkSubpassDescriptionFlags") int flagsAt(long index) { return VkSubpassDescription.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkSubpassDescriptionFlags") int flags() { return VkSubpassDescription.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSubpassDescriptionFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription flagsAt(long index, @CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription flags(@CType("VkSubpassDescriptionFlags") int value) { VkSubpassDescription.set_flags(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkSubpassDescription.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index
    public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkSubpassDescription.get_pipelineBindPoint(this.segment(), index); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkSubpassDescription.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkSubpassDescription.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkSubpassDescription.set_pipelineBindPoint(this.segment(), index, value); return this; }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkSubpassDescription.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `inputAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_inputAttachmentCount(MemorySegment segment, long index) { return (int) VH_inputAttachmentCount.get(segment, 0L, index); }
    /// {@return `inputAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_inputAttachmentCount(MemorySegment segment) { return VkSubpassDescription.get_inputAttachmentCount(segment, 0L); }
    /// {@return `inputAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int inputAttachmentCountAt(long index) { return VkSubpassDescription.get_inputAttachmentCount(this.segment(), index); }
    /// {@return `inputAttachmentCount`}
    public @CType("uint32_t") int inputAttachmentCount() { return VkSubpassDescription.get_inputAttachmentCount(this.segment()); }
    /// Sets `inputAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inputAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_inputAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `inputAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inputAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription.set_inputAttachmentCount(segment, 0L, value); }
    /// Sets `inputAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription inputAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription.set_inputAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `inputAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription inputAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription.set_inputAttachmentCount(this.segment(), value); return this; }

    /// {@return `pInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pInputAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInputAttachments.get(segment, 0L, index); }
    /// {@return `pInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pInputAttachments(MemorySegment segment) { return VkSubpassDescription.get_pInputAttachments(segment, 0L); }
    /// {@return `pInputAttachments` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pInputAttachmentsAt(long index) { return VkSubpassDescription.get_pInputAttachments(this.segment(), index); }
    /// {@return `pInputAttachments`}
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pInputAttachments() { return VkSubpassDescription.get_pInputAttachments(this.segment()); }
    /// Sets `pInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pInputAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VH_pInputAttachments.set(segment, 0L, index, value); }
    /// Sets `pInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pInputAttachments(MemorySegment segment, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pInputAttachments(segment, 0L, value); }
    /// Sets `pInputAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pInputAttachmentsAt(long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pInputAttachments(this.segment(), index, value); return this; }
    /// Sets `pInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pInputAttachments(@CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pInputAttachments(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkSubpassDescription.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkSubpassDescription.get_colorAttachmentCount(this.segment(), index); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkSubpassDescription.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription.set_colorAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription colorAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pColorAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachments.get(segment, 0L, index); }
    /// {@return `pColorAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pColorAttachments(MemorySegment segment) { return VkSubpassDescription.get_pColorAttachments(segment, 0L); }
    /// {@return `pColorAttachments` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pColorAttachmentsAt(long index) { return VkSubpassDescription.get_pColorAttachments(this.segment(), index); }
    /// {@return `pColorAttachments`}
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pColorAttachments() { return VkSubpassDescription.get_pColorAttachments(this.segment()); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VH_pColorAttachments.set(segment, 0L, index, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachments(MemorySegment segment, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pColorAttachments(segment, 0L, value); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pColorAttachmentsAt(long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pColorAttachments(this.segment(), index, value); return this; }
    /// Sets `pColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pColorAttachments(@CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pColorAttachments(this.segment(), value); return this; }

    /// {@return `pResolveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pResolveAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pResolveAttachments.get(segment, 0L, index); }
    /// {@return `pResolveAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pResolveAttachments(MemorySegment segment) { return VkSubpassDescription.get_pResolveAttachments(segment, 0L); }
    /// {@return `pResolveAttachments` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pResolveAttachmentsAt(long index) { return VkSubpassDescription.get_pResolveAttachments(this.segment(), index); }
    /// {@return `pResolveAttachments`}
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pResolveAttachments() { return VkSubpassDescription.get_pResolveAttachments(this.segment()); }
    /// Sets `pResolveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pResolveAttachments(MemorySegment segment, long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VH_pResolveAttachments.set(segment, 0L, index, value); }
    /// Sets `pResolveAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pResolveAttachments(MemorySegment segment, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pResolveAttachments(segment, 0L, value); }
    /// Sets `pResolveAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pResolveAttachmentsAt(long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pResolveAttachments(this.segment(), index, value); return this; }
    /// Sets `pResolveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pResolveAttachments(@CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pResolveAttachments(this.segment(), value); return this; }

    /// {@return `pDepthStencilAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pDepthStencilAttachment(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDepthStencilAttachment.get(segment, 0L, index); }
    /// {@return `pDepthStencilAttachment`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment get_pDepthStencilAttachment(MemorySegment segment) { return VkSubpassDescription.get_pDepthStencilAttachment(segment, 0L); }
    /// {@return `pDepthStencilAttachment` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pDepthStencilAttachmentAt(long index) { return VkSubpassDescription.get_pDepthStencilAttachment(this.segment(), index); }
    /// {@return `pDepthStencilAttachment`}
    public @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment pDepthStencilAttachment() { return VkSubpassDescription.get_pDepthStencilAttachment(this.segment()); }
    /// Sets `pDepthStencilAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDepthStencilAttachment(MemorySegment segment, long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VH_pDepthStencilAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDepthStencilAttachment(MemorySegment segment, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pDepthStencilAttachment(segment, 0L, value); }
    /// Sets `pDepthStencilAttachment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pDepthStencilAttachmentAt(long index, @CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pDepthStencilAttachment(this.segment(), index, value); return this; }
    /// Sets `pDepthStencilAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pDepthStencilAttachment(@CType("const VkAttachmentReference *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pDepthStencilAttachment(this.segment(), value); return this; }

    /// {@return `preserveAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preserveAttachmentCount(MemorySegment segment, long index) { return (int) VH_preserveAttachmentCount.get(segment, 0L, index); }
    /// {@return `preserveAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preserveAttachmentCount(MemorySegment segment) { return VkSubpassDescription.get_preserveAttachmentCount(segment, 0L); }
    /// {@return `preserveAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preserveAttachmentCountAt(long index) { return VkSubpassDescription.get_preserveAttachmentCount(this.segment(), index); }
    /// {@return `preserveAttachmentCount`}
    public @CType("uint32_t") int preserveAttachmentCount() { return VkSubpassDescription.get_preserveAttachmentCount(this.segment()); }
    /// Sets `preserveAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preserveAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preserveAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `preserveAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preserveAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassDescription.set_preserveAttachmentCount(segment, 0L, value); }
    /// Sets `preserveAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription preserveAttachmentCountAt(long index, @CType("uint32_t") int value) { VkSubpassDescription.set_preserveAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `preserveAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription preserveAttachmentCount(@CType("uint32_t") int value) { VkSubpassDescription.set_preserveAttachmentCount(this.segment(), value); return this; }

    /// {@return `pPreserveAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pPreserveAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPreserveAttachments.get(segment, 0L, index); }
    /// {@return `pPreserveAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pPreserveAttachments(MemorySegment segment) { return VkSubpassDescription.get_pPreserveAttachments(segment, 0L); }
    /// {@return `pPreserveAttachments` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pPreserveAttachmentsAt(long index) { return VkSubpassDescription.get_pPreserveAttachments(this.segment(), index); }
    /// {@return `pPreserveAttachments`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pPreserveAttachments() { return VkSubpassDescription.get_pPreserveAttachments(this.segment()); }
    /// Sets `pPreserveAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPreserveAttachments(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pPreserveAttachments.set(segment, 0L, index, value); }
    /// Sets `pPreserveAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPreserveAttachments(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pPreserveAttachments(segment, 0L, value); }
    /// Sets `pPreserveAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pPreserveAttachmentsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pPreserveAttachments(this.segment(), index, value); return this; }
    /// Sets `pPreserveAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescription pPreserveAttachments(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkSubpassDescription.set_pPreserveAttachments(this.segment(), value); return this; }

}
