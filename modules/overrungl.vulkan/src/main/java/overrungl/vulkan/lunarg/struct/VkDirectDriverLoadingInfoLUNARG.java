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
package overrungl.vulkan.lunarg.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDirectDriverLoadingInfoLUNARG {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkDirectDriverLoadingFlagsLUNARG flags;
///     ((void (*VkVoidFunction)()) PFN_vkVoidFunction (*VkGetInstanceProcAddrLUNARG)((struct VkInstance*) VkInstance instance, const char* pName)) PFN_vkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr;
/// };
/// ```
public sealed class VkDirectDriverLoadingInfoLUNARG extends GroupType {
    /// The struct layout of `VkDirectDriverLoadingInfoLUNARG`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
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
    /// The byte offset of `pfnGetInstanceProcAddr`.
    public static final long OFFSET_pfnGetInstanceProcAddr = LAYOUT.byteOffset(PathElement.groupElement("pfnGetInstanceProcAddr"));
    /// The memory layout of `pfnGetInstanceProcAddr`.
    public static final MemoryLayout LAYOUT_pfnGetInstanceProcAddr = LAYOUT.select(PathElement.groupElement("pfnGetInstanceProcAddr"));
    /// The [VarHandle] of `pfnGetInstanceProcAddr` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnGetInstanceProcAddr = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnGetInstanceProcAddr"));

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    /// @param segment the memory segment
    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingInfoLUNARG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingInfoLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDirectDriverLoadingInfoLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDirectDriverLoadingInfoLUNARG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectDriverLoadingInfoLUNARG`
    public static VkDirectDriverLoadingInfoLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingInfoLUNARG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDirectDriverLoadingInfoLUNARG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectDriverLoadingInfoLUNARG`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG copyFrom(VkDirectDriverLoadingInfoLUNARG src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDirectDriverLoadingInfoLUNARG sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDirectDriverLoadingInfoLUNARG pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkDirectDriverLoadingInfoLUNARG flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pfnGetInstanceProcAddr` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnGetInstanceProcAddr(MemorySegment segment, long index) { return (MemorySegment) VH_pfnGetInstanceProcAddr.get(segment, 0L, index); }
    /// {@return `pfnGetInstanceProcAddr`}
    public MemorySegment pfnGetInstanceProcAddr() { return pfnGetInstanceProcAddr(this.segment(), 0L); }
    /// Sets `pfnGetInstanceProcAddr` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnGetInstanceProcAddr(MemorySegment segment, long index, MemorySegment value) { VH_pfnGetInstanceProcAddr.set(segment, 0L, index, value); }
    /// Sets `pfnGetInstanceProcAddr` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(MemorySegment value) { pfnGetInstanceProcAddr(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDirectDriverLoadingInfoLUNARG].
    public static final class Buffer extends VkDirectDriverLoadingInfoLUNARG {
        private final long elementCount;

        /// Creates `VkDirectDriverLoadingInfoLUNARG.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDirectDriverLoadingInfoLUNARG`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDirectDriverLoadingInfoLUNARG`
        public VkDirectDriverLoadingInfoLUNARG asSlice(long index) { return new VkDirectDriverLoadingInfoLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDirectDriverLoadingInfoLUNARG`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDirectDriverLoadingInfoLUNARG`
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

        /// {@return `pfnGetInstanceProcAddr` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pfnGetInstanceProcAddrAt(long index) { return pfnGetInstanceProcAddr(this.segment(), index); }
        /// Sets `pfnGetInstanceProcAddr` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pfnGetInstanceProcAddrAt(long index, MemorySegment value) { pfnGetInstanceProcAddr(this.segment(), index, value); return this; }

    }
}
