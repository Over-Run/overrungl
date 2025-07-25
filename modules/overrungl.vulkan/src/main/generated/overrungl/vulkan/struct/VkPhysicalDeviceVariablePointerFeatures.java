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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVariablePointerFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 variablePointersStorageBuffer;
///     (uint32_t) VkBool32 variablePointers;
/// };
/// ```
public final class VkPhysicalDeviceVariablePointerFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVariablePointerFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
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
    /// The byte offset of `variablePointersStorageBuffer`.
    public static final long OFFSET_variablePointersStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The memory layout of `variablePointersStorageBuffer`.
    public static final MemoryLayout LAYOUT_variablePointersStorageBuffer = LAYOUT.select(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variablePointersStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The byte offset of `variablePointers`.
    public static final long OFFSET_variablePointers = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
    /// The memory layout of `variablePointers`.
    public static final MemoryLayout LAYOUT_variablePointers = LAYOUT.select(PathElement.groupElement("variablePointers"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_variablePointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers"));

    /// Creates `VkPhysicalDeviceVariablePointerFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVariablePointerFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVariablePointerFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVariablePointerFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVariablePointerFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVariablePointerFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVariablePointerFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param variablePointersStorageBuffer `variablePointersStorageBuffer`
    /// @param variablePointers `variablePointers`
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int variablePointersStorageBuffer, int variablePointers) {
        return alloc(allocator).sType(sType).pNext(pNext).variablePointersStorageBuffer(variablePointersStorageBuffer).variablePointers(variablePointers);
    }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param variablePointersStorageBuffer `variablePointersStorageBuffer`
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int variablePointersStorageBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).variablePointersStorageBuffer(variablePointersStorageBuffer);
    }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeatures` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeatures`
    public static VkPhysicalDeviceVariablePointerFeatures allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures copyFrom(VkPhysicalDeviceVariablePointerFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVariablePointerFeatures reinterpret(long count) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVariablePointerFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVariablePointerFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    public int variablePointersStorageBuffer() { return variablePointersStorageBuffer(this.segment(), 0L); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointersStorageBuffer(MemorySegment segment, long index, int value) { VH_variablePointersStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBuffer(int value) { variablePointersStorageBuffer(this.segment(), 0L, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get(segment, 0L, index); }
    /// {@return `variablePointers`}
    public int variablePointers() { return variablePointers(this.segment(), 0L); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointers(MemorySegment segment, long index, int value) { VH_variablePointers.set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures variablePointers(int value) { variablePointers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVariablePointerFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVariablePointerFeatures`
    public VkPhysicalDeviceVariablePointerFeatures asSlice(long index) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVariablePointerFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVariablePointerFeatures`
    public VkPhysicalDeviceVariablePointerFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVariablePointerFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVariablePointerFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures at(long index, Consumer<VkPhysicalDeviceVariablePointerFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersStorageBufferAt(long index) { return variablePointersStorageBuffer(this.segment(), index); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures variablePointersStorageBufferAt(long index, int value) { variablePointersStorageBuffer(this.segment(), index, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersAt(long index) { return variablePointers(this.segment(), index); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeatures variablePointersAt(long index, int value) { variablePointers(this.segment(), index, value); return this; }

}
