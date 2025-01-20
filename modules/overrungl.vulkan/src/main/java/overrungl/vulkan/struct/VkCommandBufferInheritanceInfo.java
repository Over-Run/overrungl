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
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(MemorySegment)]
/// ### subpass
/// [VarHandle][#VH_subpass] - [Getter][#subpass()] - [Setter][#subpass(int)]
/// ### framebuffer
/// [VarHandle][#VH_framebuffer] - [Getter][#framebuffer()] - [Setter][#framebuffer(MemorySegment)]
/// ### occlusionQueryEnable
/// [VarHandle][#VH_occlusionQueryEnable] - [Getter][#occlusionQueryEnable()] - [Setter][#occlusionQueryEnable(int)]
/// ### queryFlags
/// [VarHandle][#VH_queryFlags] - [Getter][#queryFlags()] - [Setter][#queryFlags(int)]
/// ### pipelineStatistics
/// [VarHandle][#VH_pipelineStatistics] - [Getter][#pipelineStatistics()] - [Setter][#pipelineStatistics(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferInheritanceInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkFramebuffer framebuffer;
///     VkBool32 occlusionQueryEnable;
///     VkQueryControlFlags queryFlags;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// } VkCommandBufferInheritanceInfo;
/// ```
public sealed class VkCommandBufferInheritanceInfo extends Struct {
    /// The struct layout of `VkCommandBufferInheritanceInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));
    /// The [VarHandle] of `framebuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    /// The [VarHandle] of `occlusionQueryEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_occlusionQueryEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("occlusionQueryEnable"));
    /// The [VarHandle] of `queryFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryFlags"));
    /// The [VarHandle] of `pipelineStatistics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineStatistics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineStatistics"));

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferInheritanceInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static VkCommandBufferInheritanceInfo alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferInheritanceInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceInfo`
    public static VkCommandBufferInheritanceInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkRenderPass") MemorySegment renderPass, @CType("uint32_t") int subpass, @CType("VkFramebuffer") MemorySegment framebuffer, @CType("VkBool32") int occlusionQueryEnable, @CType("VkQueryControlFlags") int queryFlags, @CType("VkQueryPipelineStatisticFlags") int pipelineStatistics) { return alloc(allocator).sType(sType).pNext(pNext).renderPass(renderPass).subpass(subpass).framebuffer(framebuffer).occlusionQueryEnable(occlusionQueryEnable).queryFlags(queryFlags).pipelineStatistics(pipelineStatistics); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceInfo copyFrom(VkCommandBufferInheritanceInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferInheritanceInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo sType(@CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkCommandBufferInheritanceInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pNext(@CType("const void *") MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") MemorySegment get_renderPass(MemorySegment segment, long index) { return (MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") MemorySegment get_renderPass(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_renderPass(segment, 0L); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") MemorySegment renderPass() { return VkCommandBufferInheritanceInfo.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo renderPass(@CType("VkRenderPass") MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(this.segment(), value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpass(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_subpass(segment, 0L); }
    /// {@return `subpass`}
    public @CType("uint32_t") int subpass() { return VkCommandBufferInheritanceInfo.get_subpass(this.segment()); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, @CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(segment, 0L, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo subpass(@CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(this.segment(), value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFramebuffer") MemorySegment get_framebuffer(MemorySegment segment, long index) { return (MemorySegment) VH_framebuffer.get(segment, 0L, index); }
    /// {@return `framebuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkFramebuffer") MemorySegment get_framebuffer(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_framebuffer(segment, 0L); }
    /// {@return `framebuffer`}
    public @CType("VkFramebuffer") MemorySegment framebuffer() { return VkCommandBufferInheritanceInfo.get_framebuffer(this.segment()); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, long index, @CType("VkFramebuffer") MemorySegment value) { VH_framebuffer.set(segment, 0L, index, value); }
    /// Sets `framebuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, @CType("VkFramebuffer") MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(segment, 0L, value); }
    /// Sets `framebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo framebuffer(@CType("VkFramebuffer") MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(this.segment(), value); return this; }

    /// {@return `occlusionQueryEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_occlusionQueryEnable(MemorySegment segment, long index) { return (int) VH_occlusionQueryEnable.get(segment, 0L, index); }
    /// {@return `occlusionQueryEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_occlusionQueryEnable(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(segment, 0L); }
    /// {@return `occlusionQueryEnable`}
    public @CType("VkBool32") int occlusionQueryEnable() { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(this.segment()); }
    /// Sets `occlusionQueryEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_occlusionQueryEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_occlusionQueryEnable.set(segment, 0L, index, value); }
    /// Sets `occlusionQueryEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_occlusionQueryEnable(MemorySegment segment, @CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(segment, 0L, value); }
    /// Sets `occlusionQueryEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(@CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(this.segment(), value); return this; }

    /// {@return `queryFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryControlFlags") int get_queryFlags(MemorySegment segment, long index) { return (int) VH_queryFlags.get(segment, 0L, index); }
    /// {@return `queryFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryControlFlags") int get_queryFlags(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_queryFlags(segment, 0L); }
    /// {@return `queryFlags`}
    public @CType("VkQueryControlFlags") int queryFlags() { return VkCommandBufferInheritanceInfo.get_queryFlags(this.segment()); }
    /// Sets `queryFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryFlags(MemorySegment segment, long index, @CType("VkQueryControlFlags") int value) { VH_queryFlags.set(segment, 0L, index, value); }
    /// Sets `queryFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryFlags(MemorySegment segment, @CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(segment, 0L, value); }
    /// Sets `queryFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo queryFlags(@CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(this.segment(), value); return this; }

    /// {@return `pipelineStatistics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment, long index) { return (int) VH_pipelineStatistics.get(segment, 0L, index); }
    /// {@return `pipelineStatistics`}
    /// @param segment the segment of the struct
    public static @CType("VkQueryPipelineStatisticFlags") int get_pipelineStatistics(MemorySegment segment) { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(segment, 0L); }
    /// {@return `pipelineStatistics`}
    public @CType("VkQueryPipelineStatisticFlags") int pipelineStatistics() { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(this.segment()); }
    /// Sets `pipelineStatistics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, long index, @CType("VkQueryPipelineStatisticFlags") int value) { VH_pipelineStatistics.set(segment, 0L, index, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineStatistics(MemorySegment segment, @CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(segment, 0L, value); }
    /// Sets `pipelineStatistics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceInfo pipelineStatistics(@CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(this.segment(), value); return this; }

    /// A buffer of [VkCommandBufferInheritanceInfo].
    public static final class Buffer extends VkCommandBufferInheritanceInfo {
        private final long elementCount;

        /// Creates `VkCommandBufferInheritanceInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferInheritanceInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferInheritanceInfo`
        public VkCommandBufferInheritanceInfo asSlice(long index) { return new VkCommandBufferInheritanceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferInheritanceInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferInheritanceInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferInheritanceInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferInheritanceInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkCommandBufferInheritanceInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkCommandBufferInheritanceInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `renderPass` at the given index}
        /// @param index the index
        public @CType("VkRenderPass") MemorySegment renderPassAt(long index) { return VkCommandBufferInheritanceInfo.get_renderPass(this.segment(), index); }
        /// Sets `renderPass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderPassAt(long index, @CType("VkRenderPass") MemorySegment value) { VkCommandBufferInheritanceInfo.set_renderPass(this.segment(), index, value); return this; }

        /// {@return `subpass` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subpassAt(long index) { return VkCommandBufferInheritanceInfo.get_subpass(this.segment(), index); }
        /// Sets `subpass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassAt(long index, @CType("uint32_t") int value) { VkCommandBufferInheritanceInfo.set_subpass(this.segment(), index, value); return this; }

        /// {@return `framebuffer` at the given index}
        /// @param index the index
        public @CType("VkFramebuffer") MemorySegment framebufferAt(long index) { return VkCommandBufferInheritanceInfo.get_framebuffer(this.segment(), index); }
        /// Sets `framebuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferAt(long index, @CType("VkFramebuffer") MemorySegment value) { VkCommandBufferInheritanceInfo.set_framebuffer(this.segment(), index, value); return this; }

        /// {@return `occlusionQueryEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int occlusionQueryEnableAt(long index) { return VkCommandBufferInheritanceInfo.get_occlusionQueryEnable(this.segment(), index); }
        /// Sets `occlusionQueryEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer occlusionQueryEnableAt(long index, @CType("VkBool32") int value) { VkCommandBufferInheritanceInfo.set_occlusionQueryEnable(this.segment(), index, value); return this; }

        /// {@return `queryFlags` at the given index}
        /// @param index the index
        public @CType("VkQueryControlFlags") int queryFlagsAt(long index) { return VkCommandBufferInheritanceInfo.get_queryFlags(this.segment(), index); }
        /// Sets `queryFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queryFlagsAt(long index, @CType("VkQueryControlFlags") int value) { VkCommandBufferInheritanceInfo.set_queryFlags(this.segment(), index, value); return this; }

        /// {@return `pipelineStatistics` at the given index}
        /// @param index the index
        public @CType("VkQueryPipelineStatisticFlags") int pipelineStatisticsAt(long index) { return VkCommandBufferInheritanceInfo.get_pipelineStatistics(this.segment(), index); }
        /// Sets `pipelineStatistics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineStatisticsAt(long index, @CType("VkQueryPipelineStatisticFlags") int value) { VkCommandBufferInheritanceInfo.set_pipelineStatistics(this.segment(), index, value); return this; }

    }
}
