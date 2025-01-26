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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t shaderSMCount;
///     uint32_t shaderWarpsPerSM;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerSM")
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
    /// The byte offset of `shaderSMCount`.
    public static final long OFFSET_shaderSMCount = LAYOUT.byteOffset(PathElement.groupElement("shaderSMCount"));
    /// The memory layout of `shaderSMCount`.
    public static final MemoryLayout LAYOUT_shaderSMCount = LAYOUT.select(PathElement.groupElement("shaderSMCount"));
    /// The [VarHandle] of `shaderSMCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSMCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSMCount"));
    /// The byte offset of `shaderWarpsPerSM`.
    public static final long OFFSET_shaderWarpsPerSM = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerSM"));
    /// The memory layout of `shaderWarpsPerSM`.
    public static final MemoryLayout LAYOUT_shaderWarpsPerSM = LAYOUT.select(PathElement.groupElement("shaderWarpsPerSM"));
    /// The [VarHandle] of `shaderWarpsPerSM` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderWarpsPerSM = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerSM"));

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV copyFrom(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderSMCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSMCount(MemorySegment segment, long index) { return (int) VH_shaderSMCount.get(segment, 0L, index); }
    /// {@return `shaderSMCount`}
    public int shaderSMCount() { return shaderSMCount(this.segment(), 0L); }
    /// Sets `shaderSMCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSMCount(MemorySegment segment, long index, int value) { VH_shaderSMCount.set(segment, 0L, index, value); }
    /// Sets `shaderSMCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCount(int value) { shaderSMCount(this.segment(), 0L, value); return this; }

    /// {@return `shaderWarpsPerSM` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderWarpsPerSM(MemorySegment segment, long index) { return (int) VH_shaderWarpsPerSM.get(segment, 0L, index); }
    /// {@return `shaderWarpsPerSM`}
    public int shaderWarpsPerSM() { return shaderWarpsPerSM(this.segment(), 0L); }
    /// Sets `shaderWarpsPerSM` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderWarpsPerSM(MemorySegment segment, long index, int value) { VH_shaderWarpsPerSM.set(segment, 0L, index, value); }
    /// Sets `shaderWarpsPerSM` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSM(int value) { shaderWarpsPerSM(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderSMBuiltinsPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
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

        /// {@return `shaderSMCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderSMCountAt(long index) { return shaderSMCount(this.segment(), index); }
        /// Sets `shaderSMCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderSMCountAt(long index, int value) { shaderSMCount(this.segment(), index, value); return this; }

        /// {@return `shaderWarpsPerSM` at the given index}
        /// @param index the index of the struct buffer
        public int shaderWarpsPerSMAt(long index) { return shaderWarpsPerSM(this.segment(), index); }
        /// Sets `shaderWarpsPerSM` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderWarpsPerSMAt(long index, int value) { shaderWarpsPerSM(this.segment(), index, value); return this; }

    }
}
