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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### headerVersionOne
/// [Byte offset][#OFFSET_headerVersionOne] - [Memory layout][#ML_headerVersionOne] - [Getter][#headerVersionOne()] - [Setter][#headerVersionOne(java.lang.foreign.MemorySegment)]
/// ### validationVersion
/// [VarHandle][#VH_validationVersion] - [Getter][#validationVersion()] - [Setter][#validationVersion(int)]
/// ### implementationData
/// [VarHandle][#VH_implementationData] - [Getter][#implementationData()] - [Setter][#implementationData(int)]
/// ### pipelineIndexCount
/// [VarHandle][#VH_pipelineIndexCount] - [Getter][#pipelineIndexCount()] - [Setter][#pipelineIndexCount(int)]
/// ### pipelineIndexStride
/// [VarHandle][#VH_pipelineIndexStride] - [Getter][#pipelineIndexStride()] - [Setter][#pipelineIndexStride(int)]
/// ### pipelineIndexOffset
/// [VarHandle][#VH_pipelineIndexOffset] - [Getter][#pipelineIndexOffset()] - [Setter][#pipelineIndexOffset(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineCacheHeaderVersionSafetyCriticalOne {
///     VkPipelineCacheHeaderVersionOne headerVersionOne;
///     VkPipelineCacheValidationVersion validationVersion;
///     uint32_t implementationData;
///     uint32_t pipelineIndexCount;
///     uint32_t pipelineIndexStride;
///     uint64_t pipelineIndexOffset;
/// } VkPipelineCacheHeaderVersionSafetyCriticalOne;
/// ```
public final class VkPipelineCacheHeaderVersionSafetyCriticalOne extends Struct {
    /// The struct layout of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne.LAYOUT.withName("headerVersionOne"),
        ValueLayout.JAVA_INT.withName("validationVersion"),
        ValueLayout.JAVA_INT.withName("implementationData"),
        ValueLayout.JAVA_INT.withName("pipelineIndexCount"),
        ValueLayout.JAVA_INT.withName("pipelineIndexStride"),
        ValueLayout.JAVA_LONG.withName("pipelineIndexOffset")
    );
    /// The byte offset of `headerVersionOne`.
    public static final long OFFSET_headerVersionOne = LAYOUT.byteOffset(PathElement.groupElement("headerVersionOne"));
    /// The memory layout of `headerVersionOne`.
    public static final MemoryLayout ML_headerVersionOne = LAYOUT.select(PathElement.groupElement("headerVersionOne"));
    /// The [VarHandle] of `validationVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_validationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("validationVersion"));
    /// The [VarHandle] of `implementationData` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_implementationData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationData"));
    /// The [VarHandle] of `pipelineIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexCount"));
    /// The [VarHandle] of `pipelineIndexStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineIndexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexStride"));
    /// The [VarHandle] of `pipelineIndexOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_pipelineIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexOffset"));

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheHeaderVersionSafetyCriticalOne(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionSafetyCriticalOne(segment); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionSafetyCriticalOne(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionSafetyCriticalOne(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne asSlice(long index) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne asSlice(long index, long count) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `headerVersionOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment get_headerVersionOne(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_headerVersionOne, index), ML_headerVersionOne); }
    /// {@return `headerVersionOne`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment get_headerVersionOne(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_headerVersionOne(segment, 0L); }
    /// {@return `headerVersionOne` at the given index}
    /// @param index the index
    public @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment headerVersionOneAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_headerVersionOne(this.segment(), index); }
    /// {@return `headerVersionOne`}
    public @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment headerVersionOne() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_headerVersionOne(this.segment()); }
    /// Sets `headerVersionOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_headerVersionOne(MemorySegment segment, long index, @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_headerVersionOne, index), ML_headerVersionOne.byteSize()); }
    /// Sets `headerVersionOne` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_headerVersionOne(MemorySegment segment, @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_headerVersionOne(segment, 0L, value); }
    /// Sets `headerVersionOne` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne headerVersionOneAt(long index, @CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_headerVersionOne(this.segment(), index, value); return this; }
    /// Sets `headerVersionOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne headerVersionOne(@CType("VkPipelineCacheHeaderVersionOne") java.lang.foreign.MemorySegment value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_headerVersionOne(this.segment(), value); return this; }

    /// {@return `validationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineCacheValidationVersion") int get_validationVersion(MemorySegment segment, long index) { return (int) VH_validationVersion.get(segment, 0L, index); }
    /// {@return `validationVersion`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineCacheValidationVersion") int get_validationVersion(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_validationVersion(segment, 0L); }
    /// {@return `validationVersion` at the given index}
    /// @param index the index
    public @CType("VkPipelineCacheValidationVersion") int validationVersionAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_validationVersion(this.segment(), index); }
    /// {@return `validationVersion`}
    public @CType("VkPipelineCacheValidationVersion") int validationVersion() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_validationVersion(this.segment()); }
    /// Sets `validationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_validationVersion(MemorySegment segment, long index, @CType("VkPipelineCacheValidationVersion") int value) { VH_validationVersion.set(segment, 0L, index, value); }
    /// Sets `validationVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_validationVersion(MemorySegment segment, @CType("VkPipelineCacheValidationVersion") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_validationVersion(segment, 0L, value); }
    /// Sets `validationVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne validationVersionAt(long index, @CType("VkPipelineCacheValidationVersion") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_validationVersion(this.segment(), index, value); return this; }
    /// Sets `validationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne validationVersion(@CType("VkPipelineCacheValidationVersion") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_validationVersion(this.segment(), value); return this; }

    /// {@return `implementationData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_implementationData(MemorySegment segment, long index) { return (int) VH_implementationData.get(segment, 0L, index); }
    /// {@return `implementationData`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_implementationData(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_implementationData(segment, 0L); }
    /// {@return `implementationData` at the given index}
    /// @param index the index
    public @CType("uint32_t") int implementationDataAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_implementationData(this.segment(), index); }
    /// {@return `implementationData`}
    public @CType("uint32_t") int implementationData() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_implementationData(this.segment()); }
    /// Sets `implementationData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_implementationData(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_implementationData.set(segment, 0L, index, value); }
    /// Sets `implementationData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_implementationData(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_implementationData(segment, 0L, value); }
    /// Sets `implementationData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne implementationDataAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_implementationData(this.segment(), index, value); return this; }
    /// Sets `implementationData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne implementationData(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_implementationData(this.segment(), value); return this; }

    /// {@return `pipelineIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineIndexCount(MemorySegment segment, long index) { return (int) VH_pipelineIndexCount.get(segment, 0L, index); }
    /// {@return `pipelineIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineIndexCount(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexCount(segment, 0L); }
    /// {@return `pipelineIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineIndexCountAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexCount(this.segment(), index); }
    /// {@return `pipelineIndexCount`}
    public @CType("uint32_t") int pipelineIndexCount() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexCount(this.segment()); }
    /// Sets `pipelineIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineIndexCount.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexCount(segment, 0L, value); }
    /// Sets `pipelineIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexCountAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexCount(this.segment(), index, value); return this; }
    /// Sets `pipelineIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexCount(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexCount(this.segment(), value); return this; }

    /// {@return `pipelineIndexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineIndexStride(MemorySegment segment, long index) { return (int) VH_pipelineIndexStride.get(segment, 0L, index); }
    /// {@return `pipelineIndexStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineIndexStride(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexStride(segment, 0L); }
    /// {@return `pipelineIndexStride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineIndexStrideAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexStride(this.segment(), index); }
    /// {@return `pipelineIndexStride`}
    public @CType("uint32_t") int pipelineIndexStride() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexStride(this.segment()); }
    /// Sets `pipelineIndexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineIndexStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineIndexStride.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineIndexStride(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexStride(segment, 0L, value); }
    /// Sets `pipelineIndexStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexStrideAt(long index, @CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexStride(this.segment(), index, value); return this; }
    /// Sets `pipelineIndexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexStride(@CType("uint32_t") int value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexStride(this.segment(), value); return this; }

    /// {@return `pipelineIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_pipelineIndexOffset(MemorySegment segment, long index) { return (long) VH_pipelineIndexOffset.get(segment, 0L, index); }
    /// {@return `pipelineIndexOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_pipelineIndexOffset(MemorySegment segment) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexOffset(segment, 0L); }
    /// {@return `pipelineIndexOffset` at the given index}
    /// @param index the index
    public @CType("uint64_t") long pipelineIndexOffsetAt(long index) { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexOffset(this.segment(), index); }
    /// {@return `pipelineIndexOffset`}
    public @CType("uint64_t") long pipelineIndexOffset() { return VkPipelineCacheHeaderVersionSafetyCriticalOne.get_pipelineIndexOffset(this.segment()); }
    /// Sets `pipelineIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineIndexOffset(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_pipelineIndexOffset.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineIndexOffset(MemorySegment segment, @CType("uint64_t") long value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexOffset(segment, 0L, value); }
    /// Sets `pipelineIndexOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexOffsetAt(long index, @CType("uint64_t") long value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexOffset(this.segment(), index, value); return this; }
    /// Sets `pipelineIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexOffset(@CType("uint64_t") long value) { VkPipelineCacheHeaderVersionSafetyCriticalOne.set_pipelineIndexOffset(this.segment(), value); return this; }

}
