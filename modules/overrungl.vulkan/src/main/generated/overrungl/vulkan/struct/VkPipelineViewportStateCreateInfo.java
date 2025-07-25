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
/// struct VkPipelineViewportStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineViewportStateCreateFlags flags;
///     uint32_t viewportCount;
///     const VkViewport* pViewports;
///     uint32_t scissorCount;
///     const VkRect2D* pScissors;
/// };
/// ```
public final class VkPipelineViewportStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineViewportStateCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewports"),
        ValueLayout.JAVA_INT.withName("scissorCount"),
        ValueLayout.ADDRESS.withName("pScissors")
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
    /// The byte offset of `viewportCount`.
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    /// The memory layout of `viewportCount`.
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewportCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount"));
    /// The byte offset of `pViewports`.
    public static final long OFFSET_pViewports = LAYOUT.byteOffset(PathElement.groupElement("pViewports"));
    /// The memory layout of `pViewports`.
    public static final MemoryLayout LAYOUT_pViewports = LAYOUT.select(PathElement.groupElement("pViewports"));
    /// The [VarHandle] of `pViewports` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewports"));
    /// The byte offset of `scissorCount`.
    public static final long OFFSET_scissorCount = LAYOUT.byteOffset(PathElement.groupElement("scissorCount"));
    /// The memory layout of `scissorCount`.
    public static final MemoryLayout LAYOUT_scissorCount = LAYOUT.select(PathElement.groupElement("scissorCount"));
    /// The [VarHandle] of `scissorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scissorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scissorCount"));
    /// The byte offset of `pScissors`.
    public static final long OFFSET_pScissors = LAYOUT.byteOffset(PathElement.groupElement("pScissors"));
    /// The memory layout of `pScissors`.
    public static final MemoryLayout LAYOUT_pScissors = LAYOUT.select(PathElement.groupElement("pScissors"));
    /// The [VarHandle] of `pScissors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pScissors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pScissors"));

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param viewportCount `viewportCount`
    /// @param pViewports `pViewports`
    /// @param scissorCount `scissorCount`
    /// @param pScissors `pScissors`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int viewportCount, MemorySegment pViewports, int scissorCount, MemorySegment pScissors) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).viewportCount(viewportCount).pViewports(pViewports).scissorCount(scissorCount).pScissors(pScissors);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param viewportCount `viewportCount`
    /// @param pViewports `pViewports`
    /// @param scissorCount `scissorCount`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int viewportCount, MemorySegment pViewports, int scissorCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).viewportCount(viewportCount).pViewports(pViewports).scissorCount(scissorCount);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param viewportCount `viewportCount`
    /// @param pViewports `pViewports`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int viewportCount, MemorySegment pViewports) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).viewportCount(viewportCount).pViewports(pViewports);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param viewportCount `viewportCount`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int viewportCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).viewportCount(viewportCount);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPipelineViewportStateCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPipelineViewportStateCreateInfo`
    public static VkPipelineViewportStateCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportStateCreateInfo copyFrom(VkPipelineViewportStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportStateCreateInfo reinterpret(long count) { return new VkPipelineViewportStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportStateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get(segment, 0L, index); }
    /// {@return `viewportCount`}
    public int viewportCount() { return viewportCount(this.segment(), 0L); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportCount(MemorySegment segment, long index, int value) { VH_viewportCount.set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo viewportCount(int value) { viewportCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewports(MemorySegment segment, long index) { return (MemorySegment) VH_pViewports.get(segment, 0L, index); }
    /// {@return `pViewports`}
    public MemorySegment pViewports() { return pViewports(this.segment(), 0L); }
    /// Sets `pViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewports(MemorySegment segment, long index, MemorySegment value) { VH_pViewports.set(segment, 0L, index, value); }
    /// Sets `pViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pViewports(MemorySegment value) { pViewports(this.segment(), 0L, value); return this; }

    /// {@return `scissorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scissorCount(MemorySegment segment, long index) { return (int) VH_scissorCount.get(segment, 0L, index); }
    /// {@return `scissorCount`}
    public int scissorCount() { return scissorCount(this.segment(), 0L); }
    /// Sets `scissorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scissorCount(MemorySegment segment, long index, int value) { VH_scissorCount.set(segment, 0L, index, value); }
    /// Sets `scissorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo scissorCount(int value) { scissorCount(this.segment(), 0L, value); return this; }

    /// {@return `pScissors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pScissors(MemorySegment segment, long index) { return (MemorySegment) VH_pScissors.get(segment, 0L, index); }
    /// {@return `pScissors`}
    public MemorySegment pScissors() { return pScissors(this.segment(), 0L); }
    /// Sets `pScissors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pScissors(MemorySegment segment, long index, MemorySegment value) { VH_pScissors.set(segment, 0L, index, value); }
    /// Sets `pScissors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pScissors(MemorySegment value) { pScissors(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportStateCreateInfo`
    public VkPipelineViewportStateCreateInfo asSlice(long index) { return new VkPipelineViewportStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportStateCreateInfo`
    public VkPipelineViewportStateCreateInfo asSlice(long index, long count) { return new VkPipelineViewportStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportStateCreateInfo at(long index, Consumer<VkPipelineViewportStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param index the index of the struct buffer
    public int viewportCountAt(long index) { return viewportCount(this.segment(), index); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo viewportCountAt(long index, int value) { viewportCount(this.segment(), index, value); return this; }

    /// {@return `pViewports` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewportsAt(long index) { return pViewports(this.segment(), index); }
    /// Sets `pViewports` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pViewportsAt(long index, MemorySegment value) { pViewports(this.segment(), index, value); return this; }

    /// {@return `scissorCount` at the given index}
    /// @param index the index of the struct buffer
    public int scissorCountAt(long index) { return scissorCount(this.segment(), index); }
    /// Sets `scissorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo scissorCountAt(long index, int value) { scissorCount(this.segment(), index, value); return this; }

    /// {@return `pScissors` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pScissorsAt(long index) { return pScissors(this.segment(), index); }
    /// Sets `pScissors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportStateCreateInfo pScissorsAt(long index, MemorySegment value) { pScissors(this.segment(), index, value); return this; }

}
