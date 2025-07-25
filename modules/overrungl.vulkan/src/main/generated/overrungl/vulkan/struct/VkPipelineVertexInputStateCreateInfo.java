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
/// struct VkPipelineVertexInputStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineVertexInputStateCreateFlags flags;
///     uint32_t vertexBindingDescriptionCount;
///     const VkVertexInputBindingDescription* pVertexBindingDescriptions;
///     uint32_t vertexAttributeDescriptionCount;
///     const VkVertexInputAttributeDescription* pVertexAttributeDescriptions;
/// };
/// ```
public final class VkPipelineVertexInputStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineVertexInputStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("vertexBindingDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexBindingDescriptions"),
        ValueLayout.JAVA_INT.withName("vertexAttributeDescriptionCount"),
        ValueLayout.ADDRESS.withName("pVertexAttributeDescriptions")
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
    /// The byte offset of `vertexBindingDescriptionCount`.
    public static final long OFFSET_vertexBindingDescriptionCount = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDescriptionCount"));
    /// The memory layout of `vertexBindingDescriptionCount`.
    public static final MemoryLayout LAYOUT_vertexBindingDescriptionCount = LAYOUT.select(PathElement.groupElement("vertexBindingDescriptionCount"));
    /// The [VarHandle] of `vertexBindingDescriptionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexBindingDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingDescriptionCount"));
    /// The byte offset of `pVertexBindingDescriptions`.
    public static final long OFFSET_pVertexBindingDescriptions = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDescriptions"));
    /// The memory layout of `pVertexBindingDescriptions`.
    public static final MemoryLayout LAYOUT_pVertexBindingDescriptions = LAYOUT.select(PathElement.groupElement("pVertexBindingDescriptions"));
    /// The [VarHandle] of `pVertexBindingDescriptions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexBindingDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBindingDescriptions"));
    /// The byte offset of `vertexAttributeDescriptionCount`.
    public static final long OFFSET_vertexAttributeDescriptionCount = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeDescriptionCount"));
    /// The memory layout of `vertexAttributeDescriptionCount`.
    public static final MemoryLayout LAYOUT_vertexAttributeDescriptionCount = LAYOUT.select(PathElement.groupElement("vertexAttributeDescriptionCount"));
    /// The [VarHandle] of `vertexAttributeDescriptionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeDescriptionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeDescriptionCount"));
    /// The byte offset of `pVertexAttributeDescriptions`.
    public static final long OFFSET_pVertexAttributeDescriptions = LAYOUT.byteOffset(PathElement.groupElement("pVertexAttributeDescriptions"));
    /// The memory layout of `pVertexAttributeDescriptions`.
    public static final MemoryLayout LAYOUT_pVertexAttributeDescriptions = LAYOUT.select(PathElement.groupElement("pVertexAttributeDescriptions"));
    /// The [VarHandle] of `pVertexAttributeDescriptions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVertexAttributeDescriptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexAttributeDescriptions"));

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineVertexInputStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineVertexInputStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineVertexInputStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineVertexInputStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param vertexBindingDescriptionCount `vertexBindingDescriptionCount`
    /// @param pVertexBindingDescriptions `pVertexBindingDescriptions`
    /// @param vertexAttributeDescriptionCount `vertexAttributeDescriptionCount`
    /// @param pVertexAttributeDescriptions `pVertexAttributeDescriptions`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, MemorySegment pVertexAttributeDescriptions) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).vertexBindingDescriptionCount(vertexBindingDescriptionCount).pVertexBindingDescriptions(pVertexBindingDescriptions).vertexAttributeDescriptionCount(vertexAttributeDescriptionCount).pVertexAttributeDescriptions(pVertexAttributeDescriptions);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param vertexBindingDescriptionCount `vertexBindingDescriptionCount`
    /// @param pVertexBindingDescriptions `pVertexBindingDescriptions`
    /// @param vertexAttributeDescriptionCount `vertexAttributeDescriptionCount`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).vertexBindingDescriptionCount(vertexBindingDescriptionCount).pVertexBindingDescriptions(pVertexBindingDescriptions).vertexAttributeDescriptionCount(vertexAttributeDescriptionCount);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param vertexBindingDescriptionCount `vertexBindingDescriptionCount`
    /// @param pVertexBindingDescriptions `pVertexBindingDescriptions`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).vertexBindingDescriptionCount(vertexBindingDescriptionCount).pVertexBindingDescriptions(pVertexBindingDescriptions);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param vertexBindingDescriptionCount `vertexBindingDescriptionCount`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int vertexBindingDescriptionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).vertexBindingDescriptionCount(vertexBindingDescriptionCount);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineVertexInputStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineVertexInputStateCreateInfo`
    public static VkPipelineVertexInputStateCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo copyFrom(VkPipelineVertexInputStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineVertexInputStateCreateInfo reinterpret(long count) { return new VkPipelineVertexInputStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineVertexInputStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineVertexInputStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineVertexInputStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `vertexBindingDescriptionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexBindingDescriptionCount(MemorySegment segment, long index) { return (int) VH_vertexBindingDescriptionCount.get(segment, 0L, index); }
    /// {@return `vertexBindingDescriptionCount`}
    public int vertexBindingDescriptionCount() { return vertexBindingDescriptionCount(this.segment(), 0L); }
    /// Sets `vertexBindingDescriptionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBindingDescriptionCount(MemorySegment segment, long index, int value) { VH_vertexBindingDescriptionCount.set(segment, 0L, index, value); }
    /// Sets `vertexBindingDescriptionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int value) { vertexBindingDescriptionCount(this.segment(), 0L, value); return this; }

    /// {@return `pVertexBindingDescriptions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexBindingDescriptions(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexBindingDescriptions.get(segment, 0L, index); }
    /// {@return `pVertexBindingDescriptions`}
    public MemorySegment pVertexBindingDescriptions() { return pVertexBindingDescriptions(this.segment(), 0L); }
    /// Sets `pVertexBindingDescriptions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexBindingDescriptions(MemorySegment segment, long index, MemorySegment value) { VH_pVertexBindingDescriptions.set(segment, 0L, index, value); }
    /// Sets `pVertexBindingDescriptions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(MemorySegment value) { pVertexBindingDescriptions(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeDescriptionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeDescriptionCount(MemorySegment segment, long index) { return (int) VH_vertexAttributeDescriptionCount.get(segment, 0L, index); }
    /// {@return `vertexAttributeDescriptionCount`}
    public int vertexAttributeDescriptionCount() { return vertexAttributeDescriptionCount(this.segment(), 0L); }
    /// Sets `vertexAttributeDescriptionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeDescriptionCount(MemorySegment segment, long index, int value) { VH_vertexAttributeDescriptionCount.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeDescriptionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int value) { vertexAttributeDescriptionCount(this.segment(), 0L, value); return this; }

    /// {@return `pVertexAttributeDescriptions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVertexAttributeDescriptions(MemorySegment segment, long index) { return (MemorySegment) VH_pVertexAttributeDescriptions.get(segment, 0L, index); }
    /// {@return `pVertexAttributeDescriptions`}
    public MemorySegment pVertexAttributeDescriptions() { return pVertexAttributeDescriptions(this.segment(), 0L); }
    /// Sets `pVertexAttributeDescriptions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVertexAttributeDescriptions(MemorySegment segment, long index, MemorySegment value) { VH_pVertexAttributeDescriptions.set(segment, 0L, index, value); }
    /// Sets `pVertexAttributeDescriptions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(MemorySegment value) { pVertexAttributeDescriptions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineVertexInputStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineVertexInputStateCreateInfo`
    public VkPipelineVertexInputStateCreateInfo asSlice(long index) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineVertexInputStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineVertexInputStateCreateInfo`
    public VkPipelineVertexInputStateCreateInfo asSlice(long index, long count) { return new VkPipelineVertexInputStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineVertexInputStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo at(long index, Consumer<VkPipelineVertexInputStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `vertexBindingDescriptionCount` at the given index}
    /// @param index the index of the struct buffer
    public int vertexBindingDescriptionCountAt(long index) { return vertexBindingDescriptionCount(this.segment(), index); }
    /// Sets `vertexBindingDescriptionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCountAt(long index, int value) { vertexBindingDescriptionCount(this.segment(), index, value); return this; }

    /// {@return `pVertexBindingDescriptions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVertexBindingDescriptionsAt(long index) { return pVertexBindingDescriptions(this.segment(), index); }
    /// Sets `pVertexBindingDescriptions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptionsAt(long index, MemorySegment value) { pVertexBindingDescriptions(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeDescriptionCount` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeDescriptionCountAt(long index) { return vertexAttributeDescriptionCount(this.segment(), index); }
    /// Sets `vertexAttributeDescriptionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCountAt(long index, int value) { vertexAttributeDescriptionCount(this.segment(), index, value); return this; }

    /// {@return `pVertexAttributeDescriptions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVertexAttributeDescriptionsAt(long index) { return pVertexAttributeDescriptions(this.segment(), index); }
    /// Sets `pVertexAttributeDescriptions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptionsAt(long index, MemorySegment value) { pVertexAttributeDescriptions(this.segment(), index, value); return this; }

}
