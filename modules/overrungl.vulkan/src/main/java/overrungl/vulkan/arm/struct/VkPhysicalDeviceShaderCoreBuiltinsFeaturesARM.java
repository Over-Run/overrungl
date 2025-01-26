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
/// struct VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderCoreBuiltins;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreBuiltins")
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
    /// The byte offset of `shaderCoreBuiltins`.
    public static final long OFFSET_shaderCoreBuiltins = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreBuiltins"));
    /// The memory layout of `shaderCoreBuiltins`.
    public static final MemoryLayout LAYOUT_shaderCoreBuiltins = LAYOUT.select(PathElement.groupElement("shaderCoreBuiltins"));
    /// The [VarHandle] of `shaderCoreBuiltins` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderCoreBuiltins = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreBuiltins"));

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM copyFrom(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreBuiltins` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCoreBuiltins(MemorySegment segment, long index) { return (int) VH_shaderCoreBuiltins.get(segment, 0L, index); }
    /// {@return `shaderCoreBuiltins`}
    public int shaderCoreBuiltins() { return shaderCoreBuiltins(this.segment(), 0L); }
    /// Sets `shaderCoreBuiltins` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreBuiltins(MemorySegment segment, long index, int value) { VH_shaderCoreBuiltins.set(segment, 0L, index, value); }
    /// Sets `shaderCoreBuiltins` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltins(int value) { shaderCoreBuiltins(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM].
    public static final class Buffer extends VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
        public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM asSlice(long index) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
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

        /// {@return `shaderCoreBuiltins` at the given index}
        /// @param index the index of the struct buffer
        public int shaderCoreBuiltinsAt(long index) { return shaderCoreBuiltins(this.segment(), index); }
        /// Sets `shaderCoreBuiltins` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderCoreBuiltinsAt(long index, int value) { shaderCoreBuiltins(this.segment(), index, value); return this; }

    }
}
