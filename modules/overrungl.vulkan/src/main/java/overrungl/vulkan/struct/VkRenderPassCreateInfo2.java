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
/// ### attachmentCount
/// [VarHandle][#VH_attachmentCount] - [Getter][#attachmentCount()] - [Setter][#attachmentCount(int)]
/// ### pAttachments
/// [VarHandle][#VH_pAttachments] - [Getter][#pAttachments()] - [Setter][#pAttachments(java.lang.foreign.MemorySegment)]
/// ### subpassCount
/// [VarHandle][#VH_subpassCount] - [Getter][#subpassCount()] - [Setter][#subpassCount(int)]
/// ### pSubpasses
/// [VarHandle][#VH_pSubpasses] - [Getter][#pSubpasses()] - [Setter][#pSubpasses(java.lang.foreign.MemorySegment)]
/// ### dependencyCount
/// [VarHandle][#VH_dependencyCount] - [Getter][#dependencyCount()] - [Setter][#dependencyCount(int)]
/// ### pDependencies
/// [VarHandle][#VH_pDependencies] - [Getter][#pDependencies()] - [Setter][#pDependencies(java.lang.foreign.MemorySegment)]
/// ### correlatedViewMaskCount
/// [VarHandle][#VH_correlatedViewMaskCount] - [Getter][#correlatedViewMaskCount()] - [Setter][#correlatedViewMaskCount(int)]
/// ### pCorrelatedViewMasks
/// [VarHandle][#VH_pCorrelatedViewMasks] - [Getter][#pCorrelatedViewMasks()] - [Setter][#pCorrelatedViewMasks(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassCreateInfo2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription2 * pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription2 * pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency2 * pDependencies;
///     uint32_t correlatedViewMaskCount;
///     const uint32_t * pCorrelatedViewMasks;
/// } VkRenderPassCreateInfo2;
/// ```
public final class VkRenderPassCreateInfo2 extends Struct {
    /// The struct layout of `VkRenderPassCreateInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pDependencies"),
        ValueLayout.JAVA_INT.withName("correlatedViewMaskCount"),
        ValueLayout.ADDRESS.withName("pCorrelatedViewMasks")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `subpassCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    /// The [VarHandle] of `pSubpasses` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSubpasses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubpasses"));
    /// The [VarHandle] of `dependencyCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    /// The [VarHandle] of `pDependencies` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDependencies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDependencies"));
    /// The [VarHandle] of `correlatedViewMaskCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_correlatedViewMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlatedViewMaskCount"));
    /// The [VarHandle] of `pCorrelatedViewMasks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCorrelatedViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelatedViewMasks"));

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreateInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassCreateInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreateInfo2`
    public static VkRenderPassCreateInfo2 alloc(SegmentAllocator allocator) { return new VkRenderPassCreateInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreateInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreateInfo2`
    public static VkRenderPassCreateInfo2 alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreateInfo2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassCreateInfo2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassCreateInfo2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassCreateInfo2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassCreateInfo2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassCreateInfo2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 sType(@CType("VkStructureType") int value) { VkRenderPassCreateInfo2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassCreateInfo2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassCreateInfo2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassCreateInfo2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPassCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPassCreateFlags") int get_flags(MemorySegment segment) { return VkRenderPassCreateInfo2.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkRenderPassCreateFlags") int flagsAt(long index) { return VkRenderPassCreateInfo2.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkRenderPassCreateFlags") int flags() { return VkRenderPassCreateInfo2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkRenderPassCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 flagsAt(long index, @CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 flags(@CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo2.set_flags(this.segment(), value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment) { return VkRenderPassCreateInfo2.get_attachmentCount(segment, 0L); }
    /// {@return `attachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentCountAt(long index) { return VkRenderPassCreateInfo2.get_attachmentCount(this.segment(), index); }
    /// {@return `attachmentCount`}
    public @CType("uint32_t") int attachmentCount() { return VkRenderPassCreateInfo2.get_attachmentCount(this.segment()); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_attachmentCount(segment, 0L, value); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 attachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_attachmentCount(this.segment(), index, value); return this; }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 attachmentCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_attachmentCount(this.segment(), value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment) { return VkRenderPassCreateInfo2.get_pAttachments(segment, 0L); }
    /// {@return `pAttachments` at the given index}
    /// @param index the index
    public @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment pAttachmentsAt(long index) { return VkRenderPassCreateInfo2.get_pAttachments(this.segment(), index); }
    /// {@return `pAttachments`}
    public @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment pAttachments() { return VkRenderPassCreateInfo2.get_pAttachments(this.segment()); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, long index, @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pAttachments(segment, 0L, value); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pAttachmentsAt(long index, @CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pAttachments(this.segment(), index, value); return this; }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pAttachments(@CType("const VkAttachmentDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pAttachments(this.segment(), value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get(segment, 0L, index); }
    /// {@return `subpassCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment) { return VkRenderPassCreateInfo2.get_subpassCount(segment, 0L); }
    /// {@return `subpassCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subpassCountAt(long index) { return VkRenderPassCreateInfo2.get_subpassCount(this.segment(), index); }
    /// {@return `subpassCount`}
    public @CType("uint32_t") int subpassCount() { return VkRenderPassCreateInfo2.get_subpassCount(this.segment()); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpassCount.set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_subpassCount(segment, 0L, value); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 subpassCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_subpassCount(this.segment(), index, value); return this; }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 subpassCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_subpassCount(this.segment(), value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment get_pSubpasses(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSubpasses.get(segment, 0L, index); }
    /// {@return `pSubpasses`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment get_pSubpasses(MemorySegment segment) { return VkRenderPassCreateInfo2.get_pSubpasses(segment, 0L); }
    /// {@return `pSubpasses` at the given index}
    /// @param index the index
    public @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment pSubpassesAt(long index) { return VkRenderPassCreateInfo2.get_pSubpasses(this.segment(), index); }
    /// {@return `pSubpasses`}
    public @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment pSubpasses() { return VkRenderPassCreateInfo2.get_pSubpasses(this.segment()); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSubpasses(MemorySegment segment, long index, @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment value) { VH_pSubpasses.set(segment, 0L, index, value); }
    /// Sets `pSubpasses` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSubpasses(MemorySegment segment, @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pSubpasses(segment, 0L, value); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pSubpassesAt(long index, @CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pSubpasses(this.segment(), index, value); return this; }
    /// Sets `pSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pSubpasses(@CType("const VkSubpassDescription2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pSubpasses(this.segment(), value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment) { return VkRenderPassCreateInfo2.get_dependencyCount(segment, 0L); }
    /// {@return `dependencyCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dependencyCountAt(long index) { return VkRenderPassCreateInfo2.get_dependencyCount(this.segment(), index); }
    /// {@return `dependencyCount`}
    public @CType("uint32_t") int dependencyCount() { return VkRenderPassCreateInfo2.get_dependencyCount(this.segment()); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dependencyCount.set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_dependencyCount(segment, 0L, value); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 dependencyCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_dependencyCount(this.segment(), index, value); return this; }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 dependencyCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_dependencyCount(this.segment(), value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment get_pDependencies(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDependencies.get(segment, 0L, index); }
    /// {@return `pDependencies`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment get_pDependencies(MemorySegment segment) { return VkRenderPassCreateInfo2.get_pDependencies(segment, 0L); }
    /// {@return `pDependencies` at the given index}
    /// @param index the index
    public @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment pDependenciesAt(long index) { return VkRenderPassCreateInfo2.get_pDependencies(this.segment(), index); }
    /// {@return `pDependencies`}
    public @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment pDependencies() { return VkRenderPassCreateInfo2.get_pDependencies(this.segment()); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDependencies(MemorySegment segment, long index, @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment value) { VH_pDependencies.set(segment, 0L, index, value); }
    /// Sets `pDependencies` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDependencies(MemorySegment segment, @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pDependencies(segment, 0L, value); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pDependenciesAt(long index, @CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pDependencies(this.segment(), index, value); return this; }
    /// Sets `pDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pDependencies(@CType("const VkSubpassDependency2 *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pDependencies(this.segment(), value); return this; }

    /// {@return `correlatedViewMaskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_correlatedViewMaskCount(MemorySegment segment, long index) { return (int) VH_correlatedViewMaskCount.get(segment, 0L, index); }
    /// {@return `correlatedViewMaskCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_correlatedViewMaskCount(MemorySegment segment) { return VkRenderPassCreateInfo2.get_correlatedViewMaskCount(segment, 0L); }
    /// {@return `correlatedViewMaskCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int correlatedViewMaskCountAt(long index) { return VkRenderPassCreateInfo2.get_correlatedViewMaskCount(this.segment(), index); }
    /// {@return `correlatedViewMaskCount`}
    public @CType("uint32_t") int correlatedViewMaskCount() { return VkRenderPassCreateInfo2.get_correlatedViewMaskCount(this.segment()); }
    /// Sets `correlatedViewMaskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_correlatedViewMaskCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_correlatedViewMaskCount.set(segment, 0L, index, value); }
    /// Sets `correlatedViewMaskCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_correlatedViewMaskCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_correlatedViewMaskCount(segment, 0L, value); }
    /// Sets `correlatedViewMaskCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 correlatedViewMaskCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_correlatedViewMaskCount(this.segment(), index, value); return this; }
    /// Sets `correlatedViewMaskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 correlatedViewMaskCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo2.set_correlatedViewMaskCount(this.segment(), value); return this; }

    /// {@return `pCorrelatedViewMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCorrelatedViewMasks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCorrelatedViewMasks.get(segment, 0L, index); }
    /// {@return `pCorrelatedViewMasks`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pCorrelatedViewMasks(MemorySegment segment) { return VkRenderPassCreateInfo2.get_pCorrelatedViewMasks(segment, 0L); }
    /// {@return `pCorrelatedViewMasks` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCorrelatedViewMasksAt(long index) { return VkRenderPassCreateInfo2.get_pCorrelatedViewMasks(this.segment(), index); }
    /// {@return `pCorrelatedViewMasks`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pCorrelatedViewMasks() { return VkRenderPassCreateInfo2.get_pCorrelatedViewMasks(this.segment()); }
    /// Sets `pCorrelatedViewMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCorrelatedViewMasks(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pCorrelatedViewMasks.set(segment, 0L, index, value); }
    /// Sets `pCorrelatedViewMasks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCorrelatedViewMasks(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pCorrelatedViewMasks(segment, 0L, value); }
    /// Sets `pCorrelatedViewMasks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pCorrelatedViewMasksAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pCorrelatedViewMasks(this.segment(), index, value); return this; }
    /// Sets `pCorrelatedViewMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo2.set_pCorrelatedViewMasks(this.segment(), value); return this; }

}
