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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkIndirectCommandsLayoutUsageFlagsEXT flags;
///     ((uint32_t) VkFlags) VkShaderStageFlags shaderStages;
///     uint32_t indirectStride;
///     (uint64_t) VkPipelineLayout pipelineLayout;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenEXT* pTokens;
/// };
/// ```
public final class VkIndirectCommandsLayoutCreateInfoEXT extends GroupType {
    /// The struct layout of `VkIndirectCommandsLayoutCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_INT.withName("indirectStride"),
        ValueLayout.JAVA_LONG.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens")
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
    /// The byte offset of `shaderStages`.
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    /// The memory layout of `shaderStages`.
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    /// The [VarHandle] of `shaderStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    /// The byte offset of `indirectStride`.
    public static final long OFFSET_indirectStride = LAYOUT.byteOffset(PathElement.groupElement("indirectStride"));
    /// The memory layout of `indirectStride`.
    public static final MemoryLayout LAYOUT_indirectStride = LAYOUT.select(PathElement.groupElement("indirectStride"));
    /// The [VarHandle] of `indirectStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStride"));
    /// The byte offset of `pipelineLayout`.
    public static final long OFFSET_pipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
    /// The memory layout of `pipelineLayout`.
    public static final MemoryLayout LAYOUT_pipelineLayout = LAYOUT.select(PathElement.groupElement("pipelineLayout"));
    /// The [VarHandle] of `pipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    /// The byte offset of `tokenCount`.
    public static final long OFFSET_tokenCount = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
    /// The memory layout of `tokenCount`.
    public static final MemoryLayout LAYOUT_tokenCount = LAYOUT.select(PathElement.groupElement("tokenCount"));
    /// The [VarHandle] of `tokenCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    /// The byte offset of `pTokens`.
    public static final long OFFSET_pTokens = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
    /// The memory layout of `pTokens`.
    public static final MemoryLayout LAYOUT_pTokens = LAYOUT.select(PathElement.groupElement("pTokens"));
    /// The [VarHandle] of `pTokens` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsLayoutCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param shaderStages `shaderStages`
    /// @param indirectStride `indirectStride`
    /// @param pipelineLayout `pipelineLayout`
    /// @param tokenCount `tokenCount`
    /// @param pTokens `pTokens`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int shaderStages, int indirectStride, long pipelineLayout, int tokenCount, MemorySegment pTokens) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).shaderStages(shaderStages).indirectStride(indirectStride).pipelineLayout(pipelineLayout).tokenCount(tokenCount).pTokens(pTokens);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param shaderStages `shaderStages`
    /// @param indirectStride `indirectStride`
    /// @param pipelineLayout `pipelineLayout`
    /// @param tokenCount `tokenCount`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int shaderStages, int indirectStride, long pipelineLayout, int tokenCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).shaderStages(shaderStages).indirectStride(indirectStride).pipelineLayout(pipelineLayout).tokenCount(tokenCount);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param shaderStages `shaderStages`
    /// @param indirectStride `indirectStride`
    /// @param pipelineLayout `pipelineLayout`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int shaderStages, int indirectStride, long pipelineLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).shaderStages(shaderStages).indirectStride(indirectStride).pipelineLayout(pipelineLayout);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param shaderStages `shaderStages`
    /// @param indirectStride `indirectStride`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int shaderStages, int indirectStride) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).shaderStages(shaderStages).indirectStride(indirectStride);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param shaderStages `shaderStages`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int shaderStages) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).shaderStages(shaderStages);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoEXT`
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT copyFrom(VkIndirectCommandsLayoutCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsLayoutCreateInfoEXT reinterpret(long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkIndirectCommandsLayoutCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkIndirectCommandsLayoutCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStages(MemorySegment segment, long index) { return (int) VH_shaderStages.get(segment, 0L, index); }
    /// {@return `shaderStages`}
    public int shaderStages() { return shaderStages(this.segment(), 0L); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStages(MemorySegment segment, long index, int value) { VH_shaderStages.set(segment, 0L, index, value); }
    /// Sets `shaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(int value) { shaderStages(this.segment(), 0L, value); return this; }

    /// {@return `indirectStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indirectStride(MemorySegment segment, long index) { return (int) VH_indirectStride.get(segment, 0L, index); }
    /// {@return `indirectStride`}
    public int indirectStride() { return indirectStride(this.segment(), 0L); }
    /// Sets `indirectStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectStride(MemorySegment segment, long index, int value) { VH_indirectStride.set(segment, 0L, index, value); }
    /// Sets `indirectStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(int value) { indirectStride(this.segment(), 0L, value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineLayout(MemorySegment segment, long index) { return (long) VH_pipelineLayout.get(segment, 0L, index); }
    /// {@return `pipelineLayout`}
    public long pipelineLayout() { return pipelineLayout(this.segment(), 0L); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineLayout(MemorySegment segment, long index, long value) { VH_pipelineLayout.set(segment, 0L, index, value); }
    /// Sets `pipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(long value) { pipelineLayout(this.segment(), 0L, value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tokenCount(MemorySegment segment, long index) { return (int) VH_tokenCount.get(segment, 0L, index); }
    /// {@return `tokenCount`}
    public int tokenCount() { return tokenCount(this.segment(), 0L); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tokenCount(MemorySegment segment, long index, int value) { VH_tokenCount.set(segment, 0L, index, value); }
    /// Sets `tokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCount(int value) { tokenCount(this.segment(), 0L, value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTokens(MemorySegment segment, long index) { return (MemorySegment) VH_pTokens.get(segment, 0L, index); }
    /// {@return `pTokens`}
    public MemorySegment pTokens() { return pTokens(this.segment(), 0L); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTokens(MemorySegment segment, long index, MemorySegment value) { VH_pTokens.set(segment, 0L, index, value); }
    /// Sets `pTokens` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(MemorySegment value) { pTokens(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsLayoutCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsLayoutCreateInfoEXT`
    public VkIndirectCommandsLayoutCreateInfoEXT asSlice(long index) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsLayoutCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsLayoutCreateInfoEXT`
    public VkIndirectCommandsLayoutCreateInfoEXT asSlice(long index, long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsLayoutCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT at(long index, Consumer<VkIndirectCommandsLayoutCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `shaderStages` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStagesAt(long index) { return shaderStages(this.segment(), index); }
    /// Sets `shaderStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStagesAt(long index, int value) { shaderStages(this.segment(), index, value); return this; }

    /// {@return `indirectStride` at the given index}
    /// @param index the index of the struct buffer
    public int indirectStrideAt(long index) { return indirectStride(this.segment(), index); }
    /// Sets `indirectStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStrideAt(long index, int value) { indirectStride(this.segment(), index, value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineLayoutAt(long index) { return pipelineLayout(this.segment(), index); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayoutAt(long index, long value) { pipelineLayout(this.segment(), index, value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param index the index of the struct buffer
    public int tokenCountAt(long index) { return tokenCount(this.segment(), index); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCountAt(long index, int value) { tokenCount(this.segment(), index, value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTokensAt(long index) { return pTokens(this.segment(), index); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoEXT pTokensAt(long index, MemorySegment value) { pTokens(this.segment(), index, value); return this; }

}
