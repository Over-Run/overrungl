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
/// struct VkShaderModuleCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderModuleCreateFlags flags;
///     size_t codeSize;
///     const uint32_t* pCode;
/// };
/// ```
public final class VkShaderModuleCreateInfo extends GroupType {
    /// The struct layout of `VkShaderModuleCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        CanonicalTypes.SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode")
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
    /// The byte offset of `codeSize`.
    public static final long OFFSET_codeSize = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
    /// The memory layout of `codeSize`.
    public static final MemoryLayout LAYOUT_codeSize = LAYOUT.select(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The byte offset of `pCode`.
    public static final long OFFSET_pCode = LAYOUT.byteOffset(PathElement.groupElement("pCode"));
    /// The memory layout of `pCode`.
    public static final MemoryLayout LAYOUT_pCode = LAYOUT.select(PathElement.groupElement("pCode"));
    /// The [VarHandle] of `pCode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkShaderModuleCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkShaderModuleCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo alloc(SegmentAllocator allocator) { return new VkShaderModuleCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkShaderModuleCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param codeSize `codeSize`
    /// @param pCode `pCode`
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long codeSize, MemorySegment pCode) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).codeSize(codeSize).pCode(pCode);
    }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param codeSize `codeSize`
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long codeSize) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).codeSize(codeSize);
    }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkShaderModuleCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkShaderModuleCreateInfo`
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderModuleCreateInfo copyFrom(VkShaderModuleCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkShaderModuleCreateInfo reinterpret(long count) { return new VkShaderModuleCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkShaderModuleCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkShaderModuleCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkShaderModuleCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long codeSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_codeSize.get(segment, 0L, index)); }
    /// {@return `codeSize`}
    public long codeSize() { return codeSize(this.segment(), 0L); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codeSize(MemorySegment segment, long index, long value) { VH_codeSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo codeSize(long value) { codeSize(this.segment(), 0L, value); return this; }

    /// {@return `pCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCode(MemorySegment segment, long index) { return (MemorySegment) VH_pCode.get(segment, 0L, index); }
    /// {@return `pCode`}
    public MemorySegment pCode() { return pCode(this.segment(), 0L); }
    /// Sets `pCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCode(MemorySegment segment, long index, MemorySegment value) { VH_pCode.set(segment, 0L, index, value); }
    /// Sets `pCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo pCode(MemorySegment value) { pCode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkShaderModuleCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkShaderModuleCreateInfo`
    public VkShaderModuleCreateInfo asSlice(long index) { return new VkShaderModuleCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkShaderModuleCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkShaderModuleCreateInfo`
    public VkShaderModuleCreateInfo asSlice(long index, long count) { return new VkShaderModuleCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkShaderModuleCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkShaderModuleCreateInfo at(long index, Consumer<VkShaderModuleCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param index the index of the struct buffer
    public long codeSizeAt(long index) { return codeSize(this.segment(), index); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo codeSizeAt(long index, long value) { codeSize(this.segment(), index, value); return this; }

    /// {@return `pCode` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCodeAt(long index) { return pCode(this.segment(), index); }
    /// Sets `pCode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderModuleCreateInfo pCodeAt(long index, MemorySegment value) { pCode(this.segment(), index, value); return this; }

}
