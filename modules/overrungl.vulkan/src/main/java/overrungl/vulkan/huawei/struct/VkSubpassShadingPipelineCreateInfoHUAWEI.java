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
package overrungl.vulkan.huawei.struct;

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
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(java.lang.foreign.MemorySegment)]
/// ### subpass
/// [VarHandle][#VH_subpass] - [Getter][#subpass()] - [Setter][#subpass(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassShadingPipelineCreateInfoHUAWEI {
///     VkStructureType sType;
///     void * pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
/// } VkSubpassShadingPipelineCreateInfoHUAWEI;
/// ```
public sealed class VkSubpassShadingPipelineCreateInfoHUAWEI extends Struct {
    /// The struct layout of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `subpass` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI alloc(SegmentAllocator allocator) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubpassShadingPipelineCreateInfoHUAWEI` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassShadingPipelineCreateInfoHUAWEI`
    public static VkSubpassShadingPipelineCreateInfoHUAWEI allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass, @CType("uint32_t") int subpass) { return alloc(allocator).sType(sType).pNext(pNext).renderPass(renderPass).subpass(subpass); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI copyFrom(VkSubpassShadingPipelineCreateInfoHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(@CType("VkStructureType") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_renderPass(segment, 0L); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(@CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_renderPass(this.segment(), value); return this; }

    /// {@return `subpass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpass(MemorySegment segment, long index) { return (int) VH_subpass.get(segment, 0L, index); }
    /// {@return `subpass`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpass(MemorySegment segment) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_subpass(segment, 0L); }
    /// {@return `subpass`}
    public @CType("uint32_t") int subpass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_subpass(this.segment()); }
    /// Sets `subpass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpass.set(segment, 0L, index, value); }
    /// Sets `subpass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpass(MemorySegment segment, @CType("uint32_t") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_subpass(segment, 0L, value); }
    /// Sets `subpass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(@CType("uint32_t") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_subpass(this.segment(), value); return this; }

    /// A buffer of [VkSubpassShadingPipelineCreateInfoHUAWEI].
    public static final class Buffer extends VkSubpassShadingPipelineCreateInfoHUAWEI {
        private final long elementCount;

        /// Creates `VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`
        public VkSubpassShadingPipelineCreateInfoHUAWEI asSlice(long index) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubpassShadingPipelineCreateInfoHUAWEI`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_pNext(this.segment(), index, value); return this; }

        /// {@return `renderPass` at the given index}
        /// @param index the index
        public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPassAt(long index) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_renderPass(this.segment(), index); }
        /// Sets `renderPass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderPassAt(long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_renderPass(this.segment(), index, value); return this; }

        /// {@return `subpass` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subpassAt(long index) { return VkSubpassShadingPipelineCreateInfoHUAWEI.get_subpass(this.segment(), index); }
        /// Sets `subpass` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subpassAt(long index, @CType("uint32_t") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.set_subpass(this.segment(), index, value); return this; }

    }
}
