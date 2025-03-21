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
/// struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t shaderCoreMask;
///     uint32_t shaderCoreCount;
///     uint32_t shaderWarpsPerCore;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
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
    /// The byte offset of `shaderCoreMask`.
    public static final long OFFSET_shaderCoreMask = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreMask"));
    /// The memory layout of `shaderCoreMask`.
    public static final MemoryLayout LAYOUT_shaderCoreMask = LAYOUT.select(PathElement.groupElement("shaderCoreMask"));
    /// The [VarHandle] of `shaderCoreMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCoreMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreMask"));
    /// The byte offset of `shaderCoreCount`.
    public static final long OFFSET_shaderCoreCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
    /// The memory layout of `shaderCoreCount`.
    public static final MemoryLayout LAYOUT_shaderCoreCount = LAYOUT.select(PathElement.groupElement("shaderCoreCount"));
    /// The [VarHandle] of `shaderCoreCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreCount"));
    /// The byte offset of `shaderWarpsPerCore`.
    public static final long OFFSET_shaderWarpsPerCore = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerCore"));
    /// The memory layout of `shaderWarpsPerCore`.
    public static final MemoryLayout LAYOUT_shaderWarpsPerCore = LAYOUT.select(PathElement.groupElement("shaderWarpsPerCore"));
    /// The [VarHandle] of `shaderWarpsPerCore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderWarpsPerCore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerCore"));

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM copyFrom(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long shaderCoreMask(MemorySegment segment, long index) { return (long) VH_shaderCoreMask.get(segment, 0L, index); }
    /// {@return `shaderCoreMask`}
    public long shaderCoreMask() { return shaderCoreMask(this.segment(), 0L); }
    /// Sets `shaderCoreMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreMask(MemorySegment segment, long index, long value) { VH_shaderCoreMask.set(segment, 0L, index, value); }
    /// Sets `shaderCoreMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMask(long value) { shaderCoreMask(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCoreCount(MemorySegment segment, long index) { return (int) VH_shaderCoreCount.get(segment, 0L, index); }
    /// {@return `shaderCoreCount`}
    public int shaderCoreCount() { return shaderCoreCount(this.segment(), 0L); }
    /// Sets `shaderCoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreCount(MemorySegment segment, long index, int value) { VH_shaderCoreCount.set(segment, 0L, index, value); }
    /// Sets `shaderCoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCount(int value) { shaderCoreCount(this.segment(), 0L, value); return this; }

    /// {@return `shaderWarpsPerCore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderWarpsPerCore(MemorySegment segment, long index) { return (int) VH_shaderWarpsPerCore.get(segment, 0L, index); }
    /// {@return `shaderWarpsPerCore`}
    public int shaderWarpsPerCore() { return shaderWarpsPerCore(this.segment(), 0L); }
    /// Sets `shaderWarpsPerCore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderWarpsPerCore(MemorySegment segment, long index, int value) { VH_shaderWarpsPerCore.set(segment, 0L, index, value); }
    /// Sets `shaderWarpsPerCore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCore(int value) { shaderWarpsPerCore(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM].
    public static final class Buffer extends VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM asSlice(long index) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
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

        /// {@return `shaderCoreMask` at the given index}
        /// @param index the index of the struct buffer
        public long shaderCoreMaskAt(long index) { return shaderCoreMask(this.segment(), index); }
        /// Sets `shaderCoreMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderCoreMaskAt(long index, long value) { shaderCoreMask(this.segment(), index, value); return this; }

        /// {@return `shaderCoreCount` at the given index}
        /// @param index the index of the struct buffer
        public int shaderCoreCountAt(long index) { return shaderCoreCount(this.segment(), index); }
        /// Sets `shaderCoreCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderCoreCountAt(long index, int value) { shaderCoreCount(this.segment(), index, value); return this; }

        /// {@return `shaderWarpsPerCore` at the given index}
        /// @param index the index of the struct buffer
        public int shaderWarpsPerCoreAt(long index) { return shaderWarpsPerCore(this.segment(), index); }
        /// Sets `shaderWarpsPerCore` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderWarpsPerCoreAt(long index, int value) { shaderWarpsPerCore(this.segment(), index, value); return this; }

    }
}
