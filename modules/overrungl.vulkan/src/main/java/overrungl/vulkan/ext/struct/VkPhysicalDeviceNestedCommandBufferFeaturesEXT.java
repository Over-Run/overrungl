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
package overrungl.vulkan.ext.struct;

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
/// ### nestedCommandBuffer
/// [VarHandle][#VH_nestedCommandBuffer] - [Getter][#nestedCommandBuffer()] - [Setter][#nestedCommandBuffer(int)]
/// ### nestedCommandBufferRendering
/// [VarHandle][#VH_nestedCommandBufferRendering] - [Getter][#nestedCommandBufferRendering()] - [Setter][#nestedCommandBufferRendering(int)]
/// ### nestedCommandBufferSimultaneousUse
/// [VarHandle][#VH_nestedCommandBufferSimultaneousUse] - [Getter][#nestedCommandBufferSimultaneousUse()] - [Setter][#nestedCommandBufferSimultaneousUse(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 nestedCommandBuffer;
///     VkBool32 nestedCommandBufferRendering;
///     VkBool32 nestedCommandBufferSimultaneousUse;
/// } VkPhysicalDeviceNestedCommandBufferFeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceNestedCommandBufferFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nestedCommandBuffer"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferRendering"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferSimultaneousUse")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `nestedCommandBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nestedCommandBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBuffer"));
    /// The [VarHandle] of `nestedCommandBufferRendering` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nestedCommandBufferRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferRendering"));
    /// The [VarHandle] of `nestedCommandBufferSimultaneousUse` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nestedCommandBufferSimultaneousUse = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nestedCommandBufferSimultaneousUse"));

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int nestedCommandBuffer, @CType("VkBool32") int nestedCommandBufferRendering, @CType("VkBool32") int nestedCommandBufferSimultaneousUse) { return alloc(allocator).sType(sType).pNext(pNext).nestedCommandBuffer(nestedCommandBuffer).nestedCommandBufferRendering(nestedCommandBufferRendering).nestedCommandBufferSimultaneousUse(nestedCommandBufferSimultaneousUse); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT copyFrom(VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `nestedCommandBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nestedCommandBuffer(MemorySegment segment, long index) { return (int) VH_nestedCommandBuffer.get(segment, 0L, index); }
    /// {@return `nestedCommandBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nestedCommandBuffer(MemorySegment segment) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBuffer(segment, 0L); }
    /// {@return `nestedCommandBuffer`}
    public @CType("VkBool32") int nestedCommandBuffer() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBuffer(this.segment()); }
    /// Sets `nestedCommandBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nestedCommandBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nestedCommandBuffer.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nestedCommandBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBuffer(segment, 0L, value); }
    /// Sets `nestedCommandBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBuffer(this.segment(), value); return this; }

    /// {@return `nestedCommandBufferRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nestedCommandBufferRendering(MemorySegment segment, long index) { return (int) VH_nestedCommandBufferRendering.get(segment, 0L, index); }
    /// {@return `nestedCommandBufferRendering`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nestedCommandBufferRendering(MemorySegment segment) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferRendering(segment, 0L); }
    /// {@return `nestedCommandBufferRendering`}
    public @CType("VkBool32") int nestedCommandBufferRendering() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferRendering(this.segment()); }
    /// Sets `nestedCommandBufferRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nestedCommandBufferRendering(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nestedCommandBufferRendering.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBufferRendering` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nestedCommandBufferRendering(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferRendering(segment, 0L, value); }
    /// Sets `nestedCommandBufferRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(@CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferRendering(this.segment(), value); return this; }

    /// {@return `nestedCommandBufferSimultaneousUse` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nestedCommandBufferSimultaneousUse(MemorySegment segment, long index) { return (int) VH_nestedCommandBufferSimultaneousUse.get(segment, 0L, index); }
    /// {@return `nestedCommandBufferSimultaneousUse`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nestedCommandBufferSimultaneousUse(MemorySegment segment) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferSimultaneousUse(segment, 0L); }
    /// {@return `nestedCommandBufferSimultaneousUse`}
    public @CType("VkBool32") int nestedCommandBufferSimultaneousUse() { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferSimultaneousUse(this.segment()); }
    /// Sets `nestedCommandBufferSimultaneousUse` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nestedCommandBufferSimultaneousUse(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nestedCommandBufferSimultaneousUse.set(segment, 0L, index, value); }
    /// Sets `nestedCommandBufferSimultaneousUse` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nestedCommandBufferSimultaneousUse(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferSimultaneousUse(segment, 0L, value); }
    /// Sets `nestedCommandBufferSimultaneousUse` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(@CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferSimultaneousUse(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceNestedCommandBufferFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceNestedCommandBufferFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceNestedCommandBufferFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `nestedCommandBuffer` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nestedCommandBufferAt(long index) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBuffer(this.segment(), index); }
        /// Sets `nestedCommandBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBuffer(this.segment(), index, value); return this; }

        /// {@return `nestedCommandBufferRendering` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nestedCommandBufferRenderingAt(long index) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferRendering(this.segment(), index); }
        /// Sets `nestedCommandBufferRendering` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferRenderingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferRendering(this.segment(), index, value); return this; }

        /// {@return `nestedCommandBufferSimultaneousUse` at the given index}
        /// @param index the index
        public @CType("VkBool32") int nestedCommandBufferSimultaneousUseAt(long index) { return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.get_nestedCommandBufferSimultaneousUse(this.segment(), index); }
        /// Sets `nestedCommandBufferSimultaneousUse` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nestedCommandBufferSimultaneousUseAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceNestedCommandBufferFeaturesEXT.set_nestedCommandBufferSimultaneousUse(this.segment(), index, value); return this; }

    }
}
