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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize compactedSize;
///     (struct VkAccelerationStructureInfoNV) VkAccelerationStructureInfoNV info;
/// };
/// ```
public final class VkAccelerationStructureCreateInfoNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("compactedSize"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV.LAYOUT.withName("info")
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
    /// The byte offset of `compactedSize`.
    public static final long OFFSET_compactedSize = LAYOUT.byteOffset(PathElement.groupElement("compactedSize"));
    /// The memory layout of `compactedSize`.
    public static final MemoryLayout LAYOUT_compactedSize = LAYOUT.select(PathElement.groupElement("compactedSize"));
    /// The [VarHandle] of `compactedSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compactedSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compactedSize"));
    /// The byte offset of `info`.
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    /// The memory layout of `info`.
    public static final MemoryLayout LAYOUT_info = LAYOUT.select(PathElement.groupElement("info"));

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureCreateInfoNV`
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureCreateInfoNV`
    public static VkAccelerationStructureCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV copyFrom(VkAccelerationStructureCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureCreateInfoNV reinterpret(long count) { return new VkAccelerationStructureCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAccelerationStructureCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAccelerationStructureCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `compactedSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long compactedSize(MemorySegment segment, long index) { return (long) VH_compactedSize.get(segment, 0L, index); }
    /// {@return `compactedSize`}
    public long compactedSize() { return compactedSize(this.segment(), 0L); }
    /// Sets `compactedSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compactedSize(MemorySegment segment, long index, long value) { VH_compactedSize.set(segment, 0L, index, value); }
    /// Sets `compactedSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV compactedSize(long value) { compactedSize(this.segment(), 0L, value); return this; }

    /// {@return `info` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment info(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_info, index), LAYOUT_info); }
    /// {@return `info`}
    public MemorySegment info() { return info(this.segment(), 0L); }
    /// Sets `info` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void info(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_info, index), LAYOUT_info.byteSize()); }
    /// Sets `info` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV info(MemorySegment value) { info(this.segment(), 0L, value); return this; }
    /// Accepts `info` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV info(Consumer<overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV> func) { func.accept(overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV.of(info())); return this; }

    /// Creates a slice of `VkAccelerationStructureCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureCreateInfoNV`
    public VkAccelerationStructureCreateInfoNV asSlice(long index) { return new VkAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureCreateInfoNV`
    public VkAccelerationStructureCreateInfoNV asSlice(long index, long count) { return new VkAccelerationStructureCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV at(long index, Consumer<VkAccelerationStructureCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `compactedSize` at the given index}
    /// @param index the index of the struct buffer
    public long compactedSizeAt(long index) { return compactedSize(this.segment(), index); }
    /// Sets `compactedSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV compactedSizeAt(long index, long value) { compactedSize(this.segment(), index, value); return this; }

    /// {@return `info` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment infoAt(long index) { return info(this.segment(), index); }
    /// Sets `info` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV infoAt(long index, MemorySegment value) { info(this.segment(), index, value); return this; }
    /// Accepts `info` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureCreateInfoNV infoAt(long index, Consumer<overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV> func) { func.accept(overrungl.vulkan.nv.struct.VkAccelerationStructureInfoNV.of(infoAt(index))); return this; }

}
