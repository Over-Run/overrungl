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
/// ### variablePointersStorageBuffer
/// [VarHandle][#VH_variablePointersStorageBuffer] - [Getter][#variablePointersStorageBuffer()] - [Setter][#variablePointersStorageBuffer(int)]
/// ### variablePointers
/// [VarHandle][#VH_variablePointers] - [Getter][#variablePointers()] - [Setter][#variablePointers(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVariablePointersFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
/// } VkPhysicalDeviceVariablePointersFeatures;
/// ```
public sealed class VkPhysicalDeviceVariablePointersFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceVariablePointersFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVariablePointersFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointersFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointersFeatures(segment); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointersFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointersFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVariablePointersFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVariablePointersFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVariablePointersFeatures`
    public static VkPhysicalDeviceVariablePointersFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVariablePointersFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVariablePointersFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVariablePointersFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVariablePointersFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVariablePointersFeatures`
    public static VkPhysicalDeviceVariablePointersFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int variablePointersStorageBuffer, @CType("VkBool32") int variablePointers) { return alloc(allocator).sType(sType).pNext(pNext).variablePointersStorageBuffer(variablePointersStorageBuffer).variablePointers(variablePointers); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures copyFrom(VkPhysicalDeviceVariablePointersFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVariablePointersFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointersStorageBuffer(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(segment, 0L); }
    /// {@return `variablePointersStorageBuffer`}
    public @CType("VkBool32") int variablePointersStorageBuffer() { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(this.segment()); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointersStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointersStorageBuffer(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(segment, 0L, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(@CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(this.segment(), value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get(segment, 0L, index); }
    /// {@return `variablePointers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_variablePointers(MemorySegment segment) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(segment, 0L); }
    /// {@return `variablePointers`}
    public @CType("VkBool32") int variablePointers() { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(this.segment()); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_variablePointers.set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_variablePointers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(segment, 0L, value); }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointersFeatures variablePointers(@CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVariablePointersFeatures].
    public static final class Buffer extends VkPhysicalDeviceVariablePointersFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVariablePointersFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVariablePointersFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVariablePointersFeatures`
        public VkPhysicalDeviceVariablePointersFeatures asSlice(long index) { return new VkPhysicalDeviceVariablePointersFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVariablePointersFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVariablePointersFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVariablePointersFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceVariablePointersFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `variablePointersStorageBuffer` at the given index}
        /// @param index the index
        public @CType("VkBool32") int variablePointersStorageBufferAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointersStorageBuffer(this.segment(), index); }
        /// Sets `variablePointersStorageBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer variablePointersStorageBufferAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointersStorageBuffer(this.segment(), index, value); return this; }

        /// {@return `variablePointers` at the given index}
        /// @param index the index
        public @CType("VkBool32") int variablePointersAt(long index) { return VkPhysicalDeviceVariablePointersFeatures.get_variablePointers(this.segment(), index); }
        /// Sets `variablePointers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer variablePointersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVariablePointersFeatures.set_variablePointers(this.segment(), index, value); return this; }

    }
}
