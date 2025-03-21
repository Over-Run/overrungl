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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderTileImageCoherentReadAccelerated;
///     (uint32_t) VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
///     (uint32_t) VkBool32 shaderTileImageReadFromHelperInvocation;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderTileImagePropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation")
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
    /// The byte offset of `shaderTileImageCoherentReadAccelerated`.
    public static final long OFFSET_shaderTileImageCoherentReadAccelerated = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    /// The memory layout of `shaderTileImageCoherentReadAccelerated`.
    public static final MemoryLayout LAYOUT_shaderTileImageCoherentReadAccelerated = LAYOUT.select(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    /// The [VarHandle] of `shaderTileImageCoherentReadAccelerated` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageCoherentReadAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    /// The byte offset of `shaderTileImageReadSampleFromPixelRateInvocation`.
    public static final long OFFSET_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    /// The memory layout of `shaderTileImageReadSampleFromPixelRateInvocation`.
    public static final MemoryLayout LAYOUT_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.select(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    /// The [VarHandle] of `shaderTileImageReadSampleFromPixelRateInvocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    /// The byte offset of `shaderTileImageReadFromHelperInvocation`.
    public static final long OFFSET_shaderTileImageReadFromHelperInvocation = LAYOUT.byteOffset(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
    /// The memory layout of `shaderTileImageReadFromHelperInvocation`.
    public static final MemoryLayout LAYOUT_shaderTileImageReadFromHelperInvocation = LAYOUT.select(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));
    /// The [VarHandle] of `shaderTileImageReadFromHelperInvocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTileImageReadFromHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT copyFrom(VkPhysicalDeviceShaderTileImagePropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageCoherentReadAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageCoherentReadAccelerated(MemorySegment segment, long index) { return (int) VH_shaderTileImageCoherentReadAccelerated.get(segment, 0L, index); }
    /// {@return `shaderTileImageCoherentReadAccelerated`}
    public int shaderTileImageCoherentReadAccelerated() { return shaderTileImageCoherentReadAccelerated(this.segment(), 0L); }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageCoherentReadAccelerated(MemorySegment segment, long index, int value) { VH_shaderTileImageCoherentReadAccelerated.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAccelerated(int value) { shaderTileImageCoherentReadAccelerated(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment, long index) { return (int) VH_shaderTileImageReadSampleFromPixelRateInvocation.get(segment, 0L, index); }
    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation`}
    public int shaderTileImageReadSampleFromPixelRateInvocation() { return shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), 0L); }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment, long index, int value) { VH_shaderTileImageReadSampleFromPixelRateInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocation(int value) { shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), 0L, value); return this; }

    /// {@return `shaderTileImageReadFromHelperInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTileImageReadFromHelperInvocation(MemorySegment segment, long index) { return (int) VH_shaderTileImageReadFromHelperInvocation.get(segment, 0L, index); }
    /// {@return `shaderTileImageReadFromHelperInvocation`}
    public int shaderTileImageReadFromHelperInvocation() { return shaderTileImageReadFromHelperInvocation(this.segment(), 0L); }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTileImageReadFromHelperInvocation(MemorySegment segment, long index, int value) { VH_shaderTileImageReadFromHelperInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocation(int value) { shaderTileImageReadFromHelperInvocation(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderTileImagePropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceShaderTileImagePropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`
        public VkPhysicalDeviceShaderTileImagePropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`
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

        /// {@return `shaderTileImageCoherentReadAccelerated` at the given index}
        /// @param index the index of the struct buffer
        public int shaderTileImageCoherentReadAcceleratedAt(long index) { return shaderTileImageCoherentReadAccelerated(this.segment(), index); }
        /// Sets `shaderTileImageCoherentReadAccelerated` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderTileImageCoherentReadAcceleratedAt(long index, int value) { shaderTileImageCoherentReadAccelerated(this.segment(), index, value); return this; }

        /// {@return `shaderTileImageReadSampleFromPixelRateInvocation` at the given index}
        /// @param index the index of the struct buffer
        public int shaderTileImageReadSampleFromPixelRateInvocationAt(long index) { return shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), index); }
        /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderTileImageReadSampleFromPixelRateInvocationAt(long index, int value) { shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), index, value); return this; }

        /// {@return `shaderTileImageReadFromHelperInvocation` at the given index}
        /// @param index the index of the struct buffer
        public int shaderTileImageReadFromHelperInvocationAt(long index) { return shaderTileImageReadFromHelperInvocation(this.segment(), index); }
        /// Sets `shaderTileImageReadFromHelperInvocation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderTileImageReadFromHelperInvocationAt(long index, int value) { shaderTileImageReadFromHelperInvocation(this.segment(), index, value); return this; }

    }
}
