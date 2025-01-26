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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPipelineInputAssemblyStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineInputAssemblyStateCreateFlags flags;
///     (int) VkPrimitiveTopology topology;
///     (uint32_t) VkBool32 primitiveRestartEnable;
/// };
/// ```
public sealed class VkPipelineInputAssemblyStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineInputAssemblyStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("primitiveRestartEnable")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `topology`.
    public static final long OFFSET_topology = LAYOUT.byteOffset(PathElement.groupElement("topology"));
    /// The memory layout of `topology`.
    public static final MemoryLayout LAYOUT_topology = LAYOUT.select(PathElement.groupElement("topology"));
    /// The [VarHandle] of `topology` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_topology = LAYOUT.arrayElementVarHandle(PathElement.groupElement("topology"));
    /// The byte offset of `primitiveRestartEnable`.
    public static final long OFFSET_primitiveRestartEnable = LAYOUT.byteOffset(PathElement.groupElement("primitiveRestartEnable"));
    /// The memory layout of `primitiveRestartEnable`.
    public static final MemoryLayout LAYOUT_primitiveRestartEnable = LAYOUT.select(PathElement.groupElement("primitiveRestartEnable"));
    /// The [VarHandle] of `primitiveRestartEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primitiveRestartEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveRestartEnable"));

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineInputAssemblyStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineInputAssemblyStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineInputAssemblyStateCreateInfo`
    public static VkPipelineInputAssemblyStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineInputAssemblyStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineInputAssemblyStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineInputAssemblyStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo copyFrom(VkPipelineInputAssemblyStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPipelineInputAssemblyStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineInputAssemblyStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `topology` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int topology(MemorySegment segment, long index) { return (int) VH_topology.get(segment, 0L, index); }
    /// {@return `topology`}
    public int topology() { return topology(this.segment(), 0L); }
    /// Sets `topology` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void topology(MemorySegment segment, long index, int value) { VH_topology.set(segment, 0L, index, value); }
    /// Sets `topology` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo topology(int value) { topology(this.segment(), 0L, value); return this; }

    /// {@return `primitiveRestartEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primitiveRestartEnable(MemorySegment segment, long index) { return (int) VH_primitiveRestartEnable.get(segment, 0L, index); }
    /// {@return `primitiveRestartEnable`}
    public int primitiveRestartEnable() { return primitiveRestartEnable(this.segment(), 0L); }
    /// Sets `primitiveRestartEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primitiveRestartEnable(MemorySegment segment, long index, int value) { VH_primitiveRestartEnable.set(segment, 0L, index, value); }
    /// Sets `primitiveRestartEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(int value) { primitiveRestartEnable(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineInputAssemblyStateCreateInfo].
    public static final class Buffer extends VkPipelineInputAssemblyStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineInputAssemblyStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineInputAssemblyStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineInputAssemblyStateCreateInfo`
        public VkPipelineInputAssemblyStateCreateInfo asSlice(long index) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineInputAssemblyStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineInputAssemblyStateCreateInfo`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `topology` at the given index}
        /// @param index the index of the struct buffer
        public int topologyAt(long index) { return topology(this.segment(), index); }
        /// Sets `topology` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer topologyAt(long index, int value) { topology(this.segment(), index, value); return this; }

        /// {@return `primitiveRestartEnable` at the given index}
        /// @param index the index of the struct buffer
        public int primitiveRestartEnableAt(long index) { return primitiveRestartEnable(this.segment(), index); }
        /// Sets `primitiveRestartEnable` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer primitiveRestartEnableAt(long index, int value) { primitiveRestartEnable(this.segment(), index, value); return this; }

    }
}
