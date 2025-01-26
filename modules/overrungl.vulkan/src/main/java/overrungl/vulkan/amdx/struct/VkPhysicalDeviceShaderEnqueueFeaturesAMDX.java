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
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderEnqueueFeaturesAMDX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderEnqueue;
///     VkBool32 shaderMeshEnqueue;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderEnqueueFeaturesAMDX extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEnqueue"),
        ValueLayout.JAVA_INT.withName("shaderMeshEnqueue")
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
    /// The byte offset of `shaderEnqueue`.
    public static final long OFFSET_shaderEnqueue = LAYOUT.byteOffset(PathElement.groupElement("shaderEnqueue"));
    /// The memory layout of `shaderEnqueue`.
    public static final MemoryLayout LAYOUT_shaderEnqueue = LAYOUT.select(PathElement.groupElement("shaderEnqueue"));
    /// The [VarHandle] of `shaderEnqueue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderEnqueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEnqueue"));
    /// The byte offset of `shaderMeshEnqueue`.
    public static final long OFFSET_shaderMeshEnqueue = LAYOUT.byteOffset(PathElement.groupElement("shaderMeshEnqueue"));
    /// The memory layout of `shaderMeshEnqueue`.
    public static final MemoryLayout LAYOUT_shaderMeshEnqueue = LAYOUT.select(PathElement.groupElement("shaderMeshEnqueue"));
    /// The [VarHandle] of `shaderMeshEnqueue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderMeshEnqueue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderMeshEnqueue"));

    /// Creates `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueueFeaturesAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX copyFrom(VkPhysicalDeviceShaderEnqueueFeaturesAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderEnqueue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderEnqueue(MemorySegment segment, long index) { return (int) VH_shaderEnqueue.get(segment, 0L, index); }
    /// {@return `shaderEnqueue`}
    public int shaderEnqueue() { return shaderEnqueue(this.segment(), 0L); }
    /// Sets `shaderEnqueue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderEnqueue(MemorySegment segment, long index, int value) { VH_shaderEnqueue.set(segment, 0L, index, value); }
    /// Sets `shaderEnqueue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderEnqueue(int value) { shaderEnqueue(this.segment(), 0L, value); return this; }

    /// {@return `shaderMeshEnqueue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderMeshEnqueue(MemorySegment segment, long index) { return (int) VH_shaderMeshEnqueue.get(segment, 0L, index); }
    /// {@return `shaderMeshEnqueue`}
    public int shaderMeshEnqueue() { return shaderMeshEnqueue(this.segment(), 0L); }
    /// Sets `shaderMeshEnqueue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderMeshEnqueue(MemorySegment segment, long index, int value) { VH_shaderMeshEnqueue.set(segment, 0L, index, value); }
    /// Sets `shaderMeshEnqueue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueueFeaturesAMDX shaderMeshEnqueue(int value) { shaderMeshEnqueue(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderEnqueueFeaturesAMDX].
    public static final class Buffer extends VkPhysicalDeviceShaderEnqueueFeaturesAMDX {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderEnqueueFeaturesAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`
        public VkPhysicalDeviceShaderEnqueueFeaturesAMDX asSlice(long index) { return new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderEnqueueFeaturesAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `shaderEnqueue` at the given index}
        /// @param index the index of the struct buffer
        public int shaderEnqueueAt(long index) { return shaderEnqueue(this.segment(), index); }
        /// Sets `shaderEnqueue` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderEnqueueAt(long index, int value) { shaderEnqueue(this.segment(), index, value); return this; }

        /// {@return `shaderMeshEnqueue` at the given index}
        /// @param index the index of the struct buffer
        public int shaderMeshEnqueueAt(long index) { return shaderMeshEnqueue(this.segment(), index); }
        /// Sets `shaderMeshEnqueue` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderMeshEnqueueAt(long index, int value) { shaderMeshEnqueue(this.segment(), index, value); return this; }

    }
}
