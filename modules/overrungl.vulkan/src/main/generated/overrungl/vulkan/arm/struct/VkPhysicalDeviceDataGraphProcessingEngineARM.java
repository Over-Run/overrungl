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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphProcessingEngineARM {
///     (int) VkPhysicalDeviceDataGraphProcessingEngineTypeARM type;
///     (uint32_t) VkBool32 isForeign;
/// };
/// ```
public sealed class VkPhysicalDeviceDataGraphProcessingEngineARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("isForeign")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `isForeign`.
    public static final long OFFSET_isForeign = LAYOUT.byteOffset(PathElement.groupElement("isForeign"));
    /// The memory layout of `isForeign`.
    public static final MemoryLayout LAYOUT_isForeign = LAYOUT.select(PathElement.groupElement("isForeign"));
    /// The [VarHandle] of `isForeign` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_isForeign = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isForeign"));

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDataGraphProcessingEngineARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param type `type`
    /// @param isForeign `isForeign`
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM allocInit(SegmentAllocator allocator, int type, int isForeign) {
        return alloc(allocator).type(type).isForeign(isForeign);
    }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param type `type`
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM allocInit(SegmentAllocator allocator, int type) {
        return alloc(allocator).type(type);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM copyFrom(VkPhysicalDeviceDataGraphProcessingEngineARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `isForeign` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int isForeign(MemorySegment segment, long index) { return (int) VH_isForeign.get(segment, 0L, index); }
    /// {@return `isForeign`}
    public int isForeign() { return isForeign(this.segment(), 0L); }
    /// Sets `isForeign` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void isForeign(MemorySegment segment, long index, int value) { VH_isForeign.set(segment, 0L, index, value); }
    /// Sets `isForeign` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(int value) { isForeign(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDataGraphProcessingEngineARM].
    public static final class Buffer extends VkPhysicalDeviceDataGraphProcessingEngineARM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`
        public VkPhysicalDeviceDataGraphProcessingEngineARM asSlice(long index) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `type` at the given index}
        /// @param index the index of the struct buffer
        public int typeAt(long index) { return type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, int value) { type(this.segment(), index, value); return this; }

        /// {@return `isForeign` at the given index}
        /// @param index the index of the struct buffer
        public int isForeignAt(long index) { return isForeign(this.segment(), index); }
        /// Sets `isForeign` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer isForeignAt(long index, int value) { isForeign(this.segment(), index, value); return this; }

    }
}
