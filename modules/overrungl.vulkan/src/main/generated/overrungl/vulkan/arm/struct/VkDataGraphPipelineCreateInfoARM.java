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
/// struct VkDataGraphPipelineCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (((uint64_t) VkFlags64) VkPipelineCreateFlags2) VkPipelineCreateFlags2KHR flags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t resourceInfoCount;
///     const VkDataGraphPipelineResourceInfoARM* pResourceInfos;
/// };
/// ```
public sealed class VkDataGraphPipelineCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineCreateInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("resourceInfoCount"),
        ValueLayout.ADDRESS.withName("pResourceInfos")
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
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `resourceInfoCount`.
    public static final long OFFSET_resourceInfoCount = LAYOUT.byteOffset(PathElement.groupElement("resourceInfoCount"));
    /// The memory layout of `resourceInfoCount`.
    public static final MemoryLayout LAYOUT_resourceInfoCount = LAYOUT.select(PathElement.groupElement("resourceInfoCount"));
    /// The [VarHandle] of `resourceInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resourceInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceInfoCount"));
    /// The byte offset of `pResourceInfos`.
    public static final long OFFSET_pResourceInfos = LAYOUT.byteOffset(PathElement.groupElement("pResourceInfos"));
    /// The memory layout of `pResourceInfos`.
    public static final MemoryLayout LAYOUT_pResourceInfos = LAYOUT.select(PathElement.groupElement("pResourceInfos"));
    /// The [VarHandle] of `pResourceInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pResourceInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResourceInfos"));

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    public VkDataGraphPipelineCreateInfoARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCreateInfoARM(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDataGraphPipelineCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineCreateInfoARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param layout `layout`
    /// @param resourceInfoCount `resourceInfoCount`
    /// @param pResourceInfos `pResourceInfos`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long flags, long layout, int resourceInfoCount, MemorySegment pResourceInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).layout(layout).resourceInfoCount(resourceInfoCount).pResourceInfos(pResourceInfos);
    }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param layout `layout`
    /// @param resourceInfoCount `resourceInfoCount`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long flags, long layout, int resourceInfoCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).layout(layout).resourceInfoCount(resourceInfoCount);
    }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param layout `layout`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long flags, long layout) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).layout(layout);
    }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineCreateInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineCreateInfoARM`
    public static VkDataGraphPipelineCreateInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM copyFrom(VkDataGraphPipelineCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDataGraphPipelineCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long flags(MemorySegment segment, long index) { return (long) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public long flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, long value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM flags(long value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `resourceInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resourceInfoCount(MemorySegment segment, long index) { return (int) VH_resourceInfoCount.get(segment, 0L, index); }
    /// {@return `resourceInfoCount`}
    public int resourceInfoCount() { return resourceInfoCount(this.segment(), 0L); }
    /// Sets `resourceInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceInfoCount(MemorySegment segment, long index, int value) { VH_resourceInfoCount.set(segment, 0L, index, value); }
    /// Sets `resourceInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM resourceInfoCount(int value) { resourceInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pResourceInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResourceInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pResourceInfos.get(segment, 0L, index); }
    /// {@return `pResourceInfos`}
    public MemorySegment pResourceInfos() { return pResourceInfos(this.segment(), 0L); }
    /// Sets `pResourceInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResourceInfos(MemorySegment segment, long index, MemorySegment value) { VH_pResourceInfos.set(segment, 0L, index, value); }
    /// Sets `pResourceInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCreateInfoARM pResourceInfos(MemorySegment value) { pResourceInfos(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDataGraphPipelineCreateInfoARM].
    public static final class Buffer extends VkDataGraphPipelineCreateInfoARM {
        private final long elementCount;

        /// Creates `VkDataGraphPipelineCreateInfoARM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDataGraphPipelineCreateInfoARM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDataGraphPipelineCreateInfoARM`
        public VkDataGraphPipelineCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDataGraphPipelineCreateInfoARM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDataGraphPipelineCreateInfoARM`
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
        public long flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, long value) { flags(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index of the struct buffer
        public long layoutAt(long index) { return layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

        /// {@return `resourceInfoCount` at the given index}
        /// @param index the index of the struct buffer
        public int resourceInfoCountAt(long index) { return resourceInfoCount(this.segment(), index); }
        /// Sets `resourceInfoCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer resourceInfoCountAt(long index, int value) { resourceInfoCount(this.segment(), index, value); return this; }

        /// {@return `pResourceInfos` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pResourceInfosAt(long index) { return pResourceInfos(this.segment(), index); }
        /// Sets `pResourceInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pResourceInfosAt(long index, MemorySegment value) { pResourceInfos(this.segment(), index, value); return this; }

    }
}
