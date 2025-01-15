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
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPassCreateFlags flags;
///     uint32_t attachmentCount;
///     const VkAttachmentDescription * pAttachments;
///     uint32_t subpassCount;
///     const VkSubpassDescription * pSubpasses;
///     uint32_t dependencyCount;
///     const VkSubpassDependency * pDependencies;
/// } VkRenderPassCreateInfo;
/// ```
public sealed class VkRenderPassCreateInfo extends Struct {
    /// The struct layout of `VkRenderPassCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withName("pSubpasses"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withName("pDependencies")
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

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreateInfo(segment); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRenderPassCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreateInfo`
    public static VkRenderPassCreateInfo alloc(SegmentAllocator allocator) { return new VkRenderPassCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderPassCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassCreateInfo`
    public static VkRenderPassCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkRenderPassCreateFlags") int flags, @CType("uint32_t") int attachmentCount, @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment pAttachments, @CType("uint32_t") int subpassCount, @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment pSubpasses, @CType("uint32_t") int dependencyCount, @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment pDependencies) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).attachmentCount(attachmentCount).pAttachments(pAttachments).subpassCount(subpassCount).pSubpasses(pSubpasses).dependencyCount(dependencyCount).pDependencies(pDependencies); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassCreateInfo copyFrom(VkRenderPassCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo sType(@CType("VkStructureType") int value) { VkRenderPassCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPassCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPassCreateFlags") int get_flags(MemorySegment segment) { return VkRenderPassCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkRenderPassCreateFlags") int flags() { return VkRenderPassCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkRenderPassCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo flags(@CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment) { return VkRenderPassCreateInfo.get_attachmentCount(segment, 0L); }
    /// {@return `attachmentCount`}
    public @CType("uint32_t") int attachmentCount() { return VkRenderPassCreateInfo.get_attachmentCount(this.segment()); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_attachmentCount(segment, 0L, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo attachmentCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo.set_attachmentCount(this.segment(), value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment) { return VkRenderPassCreateInfo.get_pAttachments(segment, 0L); }
    /// {@return `pAttachments`}
    public @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment pAttachments() { return VkRenderPassCreateInfo.get_pAttachments(this.segment()); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, long index, @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pAttachments(segment, 0L, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pAttachments(@CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pAttachments(this.segment(), value); return this; }

    /// {@return `subpassCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment, long index) { return (int) VH_subpassCount.get(segment, 0L, index); }
    /// {@return `subpassCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpassCount(MemorySegment segment) { return VkRenderPassCreateInfo.get_subpassCount(segment, 0L); }
    /// {@return `subpassCount`}
    public @CType("uint32_t") int subpassCount() { return VkRenderPassCreateInfo.get_subpassCount(this.segment()); }
    /// Sets `subpassCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpassCount.set(segment, 0L, index, value); }
    /// Sets `subpassCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_subpassCount(segment, 0L, value); }
    /// Sets `subpassCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo subpassCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo.set_subpassCount(this.segment(), value); return this; }

    /// {@return `pSubpasses` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment get_pSubpasses(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSubpasses.get(segment, 0L, index); }
    /// {@return `pSubpasses`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment get_pSubpasses(MemorySegment segment) { return VkRenderPassCreateInfo.get_pSubpasses(segment, 0L); }
    /// {@return `pSubpasses`}
    public @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment pSubpasses() { return VkRenderPassCreateInfo.get_pSubpasses(this.segment()); }
    /// Sets `pSubpasses` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSubpasses(MemorySegment segment, long index, @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment value) { VH_pSubpasses.set(segment, 0L, index, value); }
    /// Sets `pSubpasses` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSubpasses(MemorySegment segment, @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pSubpasses(segment, 0L, value); }
    /// Sets `pSubpasses` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pSubpasses(@CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pSubpasses(this.segment(), value); return this; }

    /// {@return `dependencyCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment, long index) { return (int) VH_dependencyCount.get(segment, 0L, index); }
    /// {@return `dependencyCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dependencyCount(MemorySegment segment) { return VkRenderPassCreateInfo.get_dependencyCount(segment, 0L); }
    /// {@return `dependencyCount`}
    public @CType("uint32_t") int dependencyCount() { return VkRenderPassCreateInfo.get_dependencyCount(this.segment()); }
    /// Sets `dependencyCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dependencyCount.set(segment, 0L, index, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dependencyCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_dependencyCount(segment, 0L, value); }
    /// Sets `dependencyCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo dependencyCount(@CType("uint32_t") int value) { VkRenderPassCreateInfo.set_dependencyCount(this.segment(), value); return this; }

    /// {@return `pDependencies` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment get_pDependencies(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDependencies.get(segment, 0L, index); }
    /// {@return `pDependencies`}
    /// @param segment the segment of the struct
    public static @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment get_pDependencies(MemorySegment segment) { return VkRenderPassCreateInfo.get_pDependencies(segment, 0L); }
    /// {@return `pDependencies`}
    public @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment pDependencies() { return VkRenderPassCreateInfo.get_pDependencies(this.segment()); }
    /// Sets `pDependencies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDependencies(MemorySegment segment, long index, @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment value) { VH_pDependencies.set(segment, 0L, index, value); }
    /// Sets `pDependencies` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDependencies(MemorySegment segment, @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pDependencies(segment, 0L, value); }
    /// Sets `pDependencies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassCreateInfo pDependencies(@CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pDependencies(this.segment(), value); return this; }

    /// A buffer of [VkRenderPassCreateInfo].
    public static final class Buffer extends VkRenderPassCreateInfo {
        private final long elementCount;

        /// Creates `VkRenderPassCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRenderPassCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRenderPassCreateInfo`
        public VkRenderPassCreateInfo asSlice(long index) { return new VkRenderPassCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRenderPassCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRenderPassCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkRenderPassCreateFlags") int flagsAt(long index) { return VkRenderPassCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkRenderPassCreateFlags") int value) { VkRenderPassCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `attachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int attachmentCountAt(long index) { return VkRenderPassCreateInfo.get_attachmentCount(this.segment(), index); }
        /// Sets `attachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer attachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_attachmentCount(this.segment(), index, value); return this; }

        /// {@return `pAttachments` at the given index}
        /// @param index the index
        public @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment pAttachmentsAt(long index) { return VkRenderPassCreateInfo.get_pAttachments(this.segment(), index); }
        /// Sets `pAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAttachmentsAt(long index, @CType("const VkAttachmentDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pAttachments(this.segment(), index, value); return this; }

        /// {@return `subpassCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subpassCountAt(long index) { return VkRenderPassCreateInfo.get_subpassCount(this.segment(), index); }
        /// Sets `subpassCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_subpassCount(this.segment(), index, value); return this; }

        /// {@return `pSubpasses` at the given index}
        /// @param index the index
        public @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment pSubpassesAt(long index) { return VkRenderPassCreateInfo.get_pSubpasses(this.segment(), index); }
        /// Sets `pSubpasses` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSubpassesAt(long index, @CType("const VkSubpassDescription *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pSubpasses(this.segment(), index, value); return this; }

        /// {@return `dependencyCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dependencyCountAt(long index) { return VkRenderPassCreateInfo.get_dependencyCount(this.segment(), index); }
        /// Sets `dependencyCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dependencyCountAt(long index, @CType("uint32_t") int value) { VkRenderPassCreateInfo.set_dependencyCount(this.segment(), index, value); return this; }

        /// {@return `pDependencies` at the given index}
        /// @param index the index
        public @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment pDependenciesAt(long index) { return VkRenderPassCreateInfo.get_pDependencies(this.segment(), index); }
        /// Sets `pDependencies` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDependenciesAt(long index, @CType("const VkSubpassDependency *") java.lang.foreign.MemorySegment value) { VkRenderPassCreateInfo.set_pDependencies(this.segment(), index, value); return this; }

    }
}
