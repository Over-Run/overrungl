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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassCreateInfo2`.
/// ## Layout
/// ```
/// struct VkRenderPassCreateInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription2* pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription2* pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency2* pDependencies;
///     uint32_t correlatedViewMaskCount;
///     const uint32_t* pCorrelatedViewMasks;
/// };
/// ```
public final class VkRenderPassCreateInfo2 extends GroupType {
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `attachmentCount`.
    public static final long OFFSET_attachmentCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
    /// The memory layout of `attachmentCount`.
    public static final MemoryLayout LAYOUT_attachmentCount = LAYOUT.select(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The byte offset of `pAttachments`.
    public static final long OFFSET_pAttachments = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
    /// The memory layout of `pAttachments`.
    public static final MemoryLayout LAYOUT_pAttachments = LAYOUT.select(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The byte offset of `subpassCount`.
    public static final long OFFSET_subpassCount = LAYOUT.byteOffset(PathElement.groupElement("subpassCount"));
    /// The memory layout of `subpassCount`.
    public static final MemoryLayout LAYOUT_subpassCount = LAYOUT.select(PathElement.groupElement("subpassCount"));
    /// The [VarHandle] of `subpassCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpassCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassCount"));
    /// The byte offset of `pSubpasses`.
    public static final long OFFSET_pSubpasses = LAYOUT.byteOffset(PathElement.groupElement("pSubpasses"));
    /// The memory layout of `pSubpasses`.
    public static final MemoryLayout LAYOUT_pSubpasses = LAYOUT.select(PathElement.groupElement("pSubpasses"));
    /// The [VarHandle] of `pSubpasses` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSubpasses = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubpasses"));
    /// The byte offset of `dependencyCount`.
    public static final long OFFSET_dependencyCount = LAYOUT.byteOffset(PathElement.groupElement("dependencyCount"));
    /// The memory layout of `dependencyCount`.
    public static final MemoryLayout LAYOUT_dependencyCount = LAYOUT.select(PathElement.groupElement("dependencyCount"));
    /// The [VarHandle] of `dependencyCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dependencyCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dependencyCount"));
    /// The byte offset of `pDependencies`.
    public static final long OFFSET_pDependencies = LAYOUT.byteOffset(PathElement.groupElement("pDependencies"));
    /// The memory layout of `pDependencies`.
    public static final MemoryLayout LAYOUT_pDependencies = LAYOUT.select(PathElement.groupElement("pDependencies"));
    /// The [VarHandle] of `pDependencies` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDependencies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDependencies"));
    /// The byte offset of `correlatedViewMaskCount`.
    public static final long OFFSET_correlatedViewMaskCount = LAYOUT.byteOffset(PathElement.groupElement("correlatedViewMaskCount"));
    /// The memory layout of `correlatedViewMaskCount`.
    public static final MemoryLayout LAYOUT_correlatedViewMaskCount = LAYOUT.select(PathElement.groupElement("correlatedViewMaskCount"));
    /// The [VarHandle] of `correlatedViewMaskCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_correlatedViewMaskCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("correlatedViewMaskCount"));
    /// The byte offset of `pCorrelatedViewMasks`.
    public static final long OFFSET_pCorrelatedViewMasks = LAYOUT.byteOffset(PathElement.groupElement("pCorrelatedViewMasks"));
    /// The memory layout of `pCorrelatedViewMasks`.
    public static final MemoryLayout LAYOUT_pCorrelatedViewMasks = LAYOUT.select(PathElement.groupElement("pCorrelatedViewMasks"));
    /// The [VarHandle] of `pCorrelatedViewMasks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCorrelatedViewMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCorrelatedViewMasks"));

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassCreateInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassCreateInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassCreateInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassCreateInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreateInfo2`
    public static VkRenderPassCreateInfo2 alloc(SegmentAllocator allocator) { return new VkRenderPassCreateInfo2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassCreateInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreateInfo2`
    public static VkRenderPassCreateInfo2 alloc(SegmentAllocator allocator, long count) { return new VkRenderPassCreateInfo2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreateInfo2 copyFrom(VkRenderPassCreateInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassCreateInfo2 reinterpret(long count) { return new VkRenderPassCreateInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    public int attachmentCount() { return attachmentCount(this.segment(), 0L); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentCount(MemorySegment segment, long index, int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 attachmentCount(int value) { attachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    public MemorySegment pAttachments() { return pAttachments(this.segment(), 0L); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pAttachments(MemorySegment value) { pAttachments(this.segment(), 0L, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get(segment, 0L, index); }
    /// {@return `subpassCount`}
    public int subpassCount() { return subpassCount(this.segment(), 0L); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassCount(MemorySegment segment, long index, int value) { VH_subpassCount.set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 subpassCount(int value) { subpassCount(this.segment(), 0L, value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSubpasses(MemorySegment segment, long index) { return (MemorySegment) VH_pSubpasses.get(segment, 0L, index); }
    /// {@return `pSubpasses`}
    public MemorySegment pSubpasses() { return pSubpasses(this.segment(), 0L); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSubpasses(MemorySegment segment, long index, MemorySegment value) { VH_pSubpasses.set(segment, 0L, index, value); }
    /// Sets `pSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pSubpasses(MemorySegment value) { pSubpasses(this.segment(), 0L, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    public int dependencyCount() { return dependencyCount(this.segment(), 0L); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dependencyCount(MemorySegment segment, long index, int value) { VH_dependencyCount.set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 dependencyCount(int value) { dependencyCount(this.segment(), 0L, value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDependencies(MemorySegment segment, long index) { return (MemorySegment) VH_pDependencies.get(segment, 0L, index); }
    /// {@return `pDependencies`}
    public MemorySegment pDependencies() { return pDependencies(this.segment(), 0L); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDependencies(MemorySegment segment, long index, MemorySegment value) { VH_pDependencies.set(segment, 0L, index, value); }
    /// Sets `pDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pDependencies(MemorySegment value) { pDependencies(this.segment(), 0L, value); return this; }

    /// {@return `correlatedViewMaskCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int correlatedViewMaskCount(MemorySegment segment, long index) { return (int) VH_correlatedViewMaskCount.get(segment, 0L, index); }
    /// {@return `correlatedViewMaskCount`}
    public int correlatedViewMaskCount() { return correlatedViewMaskCount(this.segment(), 0L); }
    /// Sets `correlatedViewMaskCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void correlatedViewMaskCount(MemorySegment segment, long index, int value) { VH_correlatedViewMaskCount.set(segment, 0L, index, value); }
    /// Sets `correlatedViewMaskCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 correlatedViewMaskCount(int value) { correlatedViewMaskCount(this.segment(), 0L, value); return this; }

    /// {@return `pCorrelatedViewMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCorrelatedViewMasks(MemorySegment segment, long index) { return (MemorySegment) VH_pCorrelatedViewMasks.get(segment, 0L, index); }
    /// {@return `pCorrelatedViewMasks`}
    public MemorySegment pCorrelatedViewMasks() { return pCorrelatedViewMasks(this.segment(), 0L); }
    /// Sets `pCorrelatedViewMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCorrelatedViewMasks(MemorySegment segment, long index, MemorySegment value) { VH_pCorrelatedViewMasks.set(segment, 0L, index, value); }
    /// Sets `pCorrelatedViewMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pCorrelatedViewMasks(MemorySegment value) { pCorrelatedViewMasks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderPassCreateInfo2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassCreateInfo2`
    public VkRenderPassCreateInfo2 asSlice(long index) { return new VkRenderPassCreateInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassCreateInfo2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassCreateInfo2`
    public VkRenderPassCreateInfo2 asSlice(long index, long count) { return new VkRenderPassCreateInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassCreateInfo2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassCreateInfo2 at(long index, Consumer<VkRenderPassCreateInfo2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentCountAt(long index) { return attachmentCount(this.segment(), index); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 attachmentCountAt(long index, int value) { attachmentCount(this.segment(), index, value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAttachmentsAt(long index) { return pAttachments(this.segment(), index); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pAttachmentsAt(long index, MemorySegment value) { pAttachments(this.segment(), index, value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param index the index of the struct buffer
    public int subpassCountAt(long index) { return subpassCount(this.segment(), index); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 subpassCountAt(long index, int value) { subpassCount(this.segment(), index, value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSubpassesAt(long index) { return pSubpasses(this.segment(), index); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pSubpassesAt(long index, MemorySegment value) { pSubpasses(this.segment(), index, value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param index the index of the struct buffer
    public int dependencyCountAt(long index) { return dependencyCount(this.segment(), index); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 dependencyCountAt(long index, int value) { dependencyCount(this.segment(), index, value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDependenciesAt(long index) { return pDependencies(this.segment(), index); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pDependenciesAt(long index, MemorySegment value) { pDependencies(this.segment(), index, value); return this; }

    /// {@return `correlatedViewMaskCount` at the given index}
    /// @param index the index of the struct buffer
    public int correlatedViewMaskCountAt(long index) { return correlatedViewMaskCount(this.segment(), index); }
    /// Sets `correlatedViewMaskCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 correlatedViewMaskCountAt(long index, int value) { correlatedViewMaskCount(this.segment(), index, value); return this; }

    /// {@return `pCorrelatedViewMasks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCorrelatedViewMasksAt(long index) { return pCorrelatedViewMasks(this.segment(), index); }
    /// Sets `pCorrelatedViewMasks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo2 pCorrelatedViewMasksAt(long index, MemorySegment value) { pCorrelatedViewMasks(this.segment(), index, value); return this; }

}
