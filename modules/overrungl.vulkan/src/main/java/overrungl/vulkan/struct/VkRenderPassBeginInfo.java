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
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(java.lang.foreign.MemorySegment)]
/// ### framebuffer
/// [VarHandle][#VH_framebuffer] - [Getter][#framebuffer()] - [Setter][#framebuffer(java.lang.foreign.MemorySegment)]
/// ### renderArea
/// [Byte offset][#OFFSET_renderArea] - [Memory layout][#ML_renderArea] - [Getter][#renderArea()] - [Setter][#renderArea(java.lang.foreign.MemorySegment)]
/// ### clearValueCount
/// [VarHandle][#VH_clearValueCount] - [Getter][#clearValueCount()] - [Setter][#clearValueCount(int)]
/// ### pClearValues
/// [VarHandle][#VH_pClearValues] - [Getter][#pClearValues()] - [Setter][#pClearValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassBeginInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkRenderPass renderPass;
///     VkFramebuffer framebuffer;
///     VkRect2D renderArea;
///     uint32_t clearValueCount;
///     const VkClearValue * pClearValues;
/// } VkRenderPassBeginInfo;
/// ```
public final class VkRenderPassBeginInfo extends Struct {
    /// The struct layout of `VkRenderPassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withName("pClearValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `framebuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_framebuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebuffer"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout ML_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    /// The [VarHandle] of `clearValueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_clearValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clearValueCount"));
    /// The [VarHandle] of `pClearValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pClearValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pClearValues"));

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassBeginInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassBeginInfo`
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassBeginInfo`
    public static VkRenderPassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderPassBeginInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassBeginInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassBeginInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassBeginInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassBeginInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassBeginInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo sType(@CType("VkStructureType") int value) { VkRenderPassBeginInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassBeginInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassBeginInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassBeginInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment) { return VkRenderPassBeginInfo.get_renderPass(segment, 0L); }
    /// {@return `renderPass` at the given index}
    /// @param index the index
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPassAt(long index) { return VkRenderPassBeginInfo.get_renderPass(this.segment(), index); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass() { return VkRenderPassBeginInfo.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderPassAt(long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderPass(this.segment(), index, value); return this; }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderPass(@CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderPass(this.segment(), value); return this; }

    /// {@return `framebuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFramebuffer") java.lang.foreign.MemorySegment get_framebuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_framebuffer.get(segment, 0L, index); }
    /// {@return `framebuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkFramebuffer") java.lang.foreign.MemorySegment get_framebuffer(MemorySegment segment) { return VkRenderPassBeginInfo.get_framebuffer(segment, 0L); }
    /// {@return `framebuffer` at the given index}
    /// @param index the index
    public @CType("VkFramebuffer") java.lang.foreign.MemorySegment framebufferAt(long index) { return VkRenderPassBeginInfo.get_framebuffer(this.segment(), index); }
    /// {@return `framebuffer`}
    public @CType("VkFramebuffer") java.lang.foreign.MemorySegment framebuffer() { return VkRenderPassBeginInfo.get_framebuffer(this.segment()); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, long index, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VH_framebuffer.set(segment, 0L, index, value); }
    /// Sets `framebuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebuffer(MemorySegment segment, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_framebuffer(segment, 0L, value); }
    /// Sets `framebuffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo framebufferAt(long index, @CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_framebuffer(this.segment(), index, value); return this; }
    /// Sets `framebuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo framebuffer(@CType("VkFramebuffer") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_framebuffer(this.segment(), value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_renderArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea); }
    /// {@return `renderArea`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_renderArea(MemorySegment segment) { return VkRenderPassBeginInfo.get_renderArea(segment, 0L); }
    /// {@return `renderArea` at the given index}
    /// @param index the index
    public @CType("VkRect2D") java.lang.foreign.MemorySegment renderAreaAt(long index) { return VkRenderPassBeginInfo.get_renderArea(this.segment(), index); }
    /// {@return `renderArea`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment renderArea() { return VkRenderPassBeginInfo.get_renderArea(this.segment()); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea.byteSize()); }
    /// Sets `renderArea` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderArea(segment, 0L, value); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderAreaAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderArea(this.segment(), index, value); return this; }
    /// Sets `renderArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo renderArea(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_renderArea(this.segment(), value); return this; }

    /// {@return `clearValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_clearValueCount(MemorySegment segment, long index) { return (int) VH_clearValueCount.get(segment, 0L, index); }
    /// {@return `clearValueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_clearValueCount(MemorySegment segment) { return VkRenderPassBeginInfo.get_clearValueCount(segment, 0L); }
    /// {@return `clearValueCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int clearValueCountAt(long index) { return VkRenderPassBeginInfo.get_clearValueCount(this.segment(), index); }
    /// {@return `clearValueCount`}
    public @CType("uint32_t") int clearValueCount() { return VkRenderPassBeginInfo.get_clearValueCount(this.segment()); }
    /// Sets `clearValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clearValueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_clearValueCount.set(segment, 0L, index, value); }
    /// Sets `clearValueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clearValueCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderPassBeginInfo.set_clearValueCount(segment, 0L, value); }
    /// Sets `clearValueCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo clearValueCountAt(long index, @CType("uint32_t") int value) { VkRenderPassBeginInfo.set_clearValueCount(this.segment(), index, value); return this; }
    /// Sets `clearValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo clearValueCount(@CType("uint32_t") int value) { VkRenderPassBeginInfo.set_clearValueCount(this.segment(), value); return this; }

    /// {@return `pClearValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkClearValue *") java.lang.foreign.MemorySegment get_pClearValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pClearValues.get(segment, 0L, index); }
    /// {@return `pClearValues`}
    /// @param segment the segment of the struct
    public static @CType("const VkClearValue *") java.lang.foreign.MemorySegment get_pClearValues(MemorySegment segment) { return VkRenderPassBeginInfo.get_pClearValues(segment, 0L); }
    /// {@return `pClearValues` at the given index}
    /// @param index the index
    public @CType("const VkClearValue *") java.lang.foreign.MemorySegment pClearValuesAt(long index) { return VkRenderPassBeginInfo.get_pClearValues(this.segment(), index); }
    /// {@return `pClearValues`}
    public @CType("const VkClearValue *") java.lang.foreign.MemorySegment pClearValues() { return VkRenderPassBeginInfo.get_pClearValues(this.segment()); }
    /// Sets `pClearValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pClearValues(MemorySegment segment, long index, @CType("const VkClearValue *") java.lang.foreign.MemorySegment value) { VH_pClearValues.set(segment, 0L, index, value); }
    /// Sets `pClearValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pClearValues(MemorySegment segment, @CType("const VkClearValue *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pClearValues(segment, 0L, value); }
    /// Sets `pClearValues` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pClearValuesAt(long index, @CType("const VkClearValue *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pClearValues(this.segment(), index, value); return this; }
    /// Sets `pClearValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassBeginInfo pClearValues(@CType("const VkClearValue *") java.lang.foreign.MemorySegment value) { VkRenderPassBeginInfo.set_pClearValues(this.segment(), value); return this; }

}
