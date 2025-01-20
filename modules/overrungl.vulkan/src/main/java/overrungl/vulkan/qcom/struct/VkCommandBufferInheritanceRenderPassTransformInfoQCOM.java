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
package overrungl.vulkan.qcom.struct;

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
/// ### transform
/// [VarHandle][#VH_transform] - [Getter][#transform()] - [Setter][#transform(int)]
/// ### renderArea
/// [Byte offset][#OFFSET_renderArea] - [Memory layout][#ML_renderArea] - [Getter][#renderArea()] - [Setter][#renderArea(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkSurfaceTransformFlagBitsKHR transform;
///     VkRect2D renderArea;
/// } VkCommandBufferInheritanceRenderPassTransformInfoQCOM;
/// ```
public sealed class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends Struct {
    /// The struct layout of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout ML_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM alloc(SegmentAllocator allocator) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCommandBufferInheritanceRenderPassTransformInfoQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkSurfaceTransformFlagBitsKHR") int transform, @CType("VkRect2D") MemorySegment renderArea) { return alloc(allocator).sType(sType).pNext(pNext).transform(transform).renderArea(renderArea); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM copyFrom(VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(@CType("VkStructureType") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(@CType("void *") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_transform(segment, 0L); }
    /// {@return `transform`}
    public @CType("VkSurfaceTransformFlagBitsKHR") int transform() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_transform(this.segment()); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform(MemorySegment segment, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_transform(segment, 0L, value); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(@CType("VkSurfaceTransformFlagBitsKHR") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_transform(this.segment(), value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") MemorySegment get_renderArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea); }
    /// {@return `renderArea`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") MemorySegment get_renderArea(MemorySegment segment) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_renderArea(segment, 0L); }
    /// {@return `renderArea`}
    public @CType("VkRect2D") MemorySegment renderArea() { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_renderArea(this.segment()); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, long index, @CType("VkRect2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderArea, index), ML_renderArea.byteSize()); }
    /// Sets `renderArea` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderArea(MemorySegment segment, @CType("VkRect2D") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_renderArea(segment, 0L, value); }
    /// Sets `renderArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(@CType("VkRect2D") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_renderArea(this.segment(), value); return this; }

    /// A buffer of [VkCommandBufferInheritanceRenderPassTransformInfoQCOM].
    public static final class Buffer extends VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
        private final long elementCount;

        /// Creates `VkCommandBufferInheritanceRenderPassTransformInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM asSlice(long index) { return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCommandBufferInheritanceRenderPassTransformInfoQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `transform` at the given index}
        /// @param index the index
        public @CType("VkSurfaceTransformFlagBitsKHR") int transformAt(long index) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_transform(this.segment(), index); }
        /// Sets `transform` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformAt(long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_transform(this.segment(), index, value); return this; }

        /// {@return `renderArea` at the given index}
        /// @param index the index
        public @CType("VkRect2D") MemorySegment renderAreaAt(long index) { return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.get_renderArea(this.segment(), index); }
        /// Sets `renderArea` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderAreaAt(long index, @CType("VkRect2D") MemorySegment value) { VkCommandBufferInheritanceRenderPassTransformInfoQCOM.set_renderArea(this.segment(), index, value); return this; }

    }
}
