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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineOfflineCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineOfflineCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint8_t pipelineIdentifier[16];
///     (int) VkPipelineMatchControl matchControl;
///     (uint64_t) VkDeviceSize poolEntrySize;
/// };
/// ```
public final class VkPipelineOfflineCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineOfflineCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier"),
        ValueLayout.JAVA_INT.withName("matchControl"),
        ValueLayout.JAVA_LONG.withName("poolEntrySize")
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
    /// The byte offset of `pipelineIdentifier`.
    public static final long OFFSET_pipelineIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout LAYOUT_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    /// The [VarHandle] of `pipelineIdentifier` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_pipelineIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());
    /// The byte offset of `matchControl`.
    public static final long OFFSET_matchControl = LAYOUT.byteOffset(PathElement.groupElement("matchControl"));
    /// The memory layout of `matchControl`.
    public static final MemoryLayout LAYOUT_matchControl = LAYOUT.select(PathElement.groupElement("matchControl"));
    /// The [VarHandle] of `matchControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_matchControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matchControl"));
    /// The byte offset of `poolEntrySize`.
    public static final long OFFSET_poolEntrySize = LAYOUT.byteOffset(PathElement.groupElement("poolEntrySize"));
    /// The memory layout of `poolEntrySize`.
    public static final MemoryLayout LAYOUT_poolEntrySize = LAYOUT.select(PathElement.groupElement("poolEntrySize"));
    /// The [VarHandle] of `poolEntrySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_poolEntrySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntrySize"));

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineOfflineCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineOfflineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineOfflineCreateInfo`
    public static VkPipelineOfflineCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineOfflineCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineOfflineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineOfflineCreateInfo`
    public static VkPipelineOfflineCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineOfflineCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineOfflineCreateInfo copyFrom(VkPipelineOfflineCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineOfflineCreateInfo reinterpret(long count) { return new VkPipelineOfflineCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineOfflineCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineOfflineCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pipelineIdentifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte pipelineIdentifier(MemorySegment segment, long index, long index0) { return (byte) VH_pipelineIdentifier.get(segment, 0L, index, index0); }
    /// {@return `pipelineIdentifier`}
    public MemorySegment pipelineIdentifier() { return pipelineIdentifier(this.segment(), 0L); }
    /// {@return `pipelineIdentifier`}
    /// @param index0 the Index 0 of the array
    public byte pipelineIdentifier(long index0) { return pipelineIdentifier(this.segment(), 0L, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier.byteSize()); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, long index0, byte value) { VH_pipelineIdentifier.set(segment, 0L, index, index0, value); }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifier(MemorySegment value) { pipelineIdentifier(this.segment(), 0L, value); return this; }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifier(long index0, byte value) { pipelineIdentifier(this.segment(), 0L, index0, value); return this; }

    /// {@return `matchControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int matchControl(MemorySegment segment, long index) { return (int) VH_matchControl.get(segment, 0L, index); }
    /// {@return `matchControl`}
    public int matchControl() { return matchControl(this.segment(), 0L); }
    /// Sets `matchControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matchControl(MemorySegment segment, long index, int value) { VH_matchControl.set(segment, 0L, index, value); }
    /// Sets `matchControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo matchControl(int value) { matchControl(this.segment(), 0L, value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long poolEntrySize(MemorySegment segment, long index) { return (long) VH_poolEntrySize.get(segment, 0L, index); }
    /// {@return `poolEntrySize`}
    public long poolEntrySize() { return poolEntrySize(this.segment(), 0L); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void poolEntrySize(MemorySegment segment, long index, long value) { VH_poolEntrySize.set(segment, 0L, index, value); }
    /// Sets `poolEntrySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo poolEntrySize(long value) { poolEntrySize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineOfflineCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineOfflineCreateInfo`
    public VkPipelineOfflineCreateInfo asSlice(long index) { return new VkPipelineOfflineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineOfflineCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineOfflineCreateInfo`
    public VkPipelineOfflineCreateInfo asSlice(long index, long count) { return new VkPipelineOfflineCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineOfflineCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineOfflineCreateInfo at(long index, Consumer<VkPipelineOfflineCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pipelineIdentifierAt(long index) { return pipelineIdentifier(this.segment(), index); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte pipelineIdentifierAt(long index, long index0) { return pipelineIdentifier(this.segment(), index, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifierAt(long index, MemorySegment value) { pipelineIdentifier(this.segment(), index, value); return this; }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifierAt(long index, long index0, byte value) { pipelineIdentifier(this.segment(), index, index0, value); return this; }

    /// {@return `matchControl` at the given index}
    /// @param index the index of the struct buffer
    public int matchControlAt(long index) { return matchControl(this.segment(), index); }
    /// Sets `matchControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo matchControlAt(long index, int value) { matchControl(this.segment(), index, value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param index the index of the struct buffer
    public long poolEntrySizeAt(long index) { return poolEntrySize(this.segment(), index); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo poolEntrySizeAt(long index, long value) { poolEntrySize(this.segment(), index, value); return this; }

}
