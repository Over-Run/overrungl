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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### maxGraphicsShaderGroupCount
/// [VarHandle][#VH_maxGraphicsShaderGroupCount] - [Getter][#maxGraphicsShaderGroupCount()] - [Setter][#maxGraphicsShaderGroupCount(int)]
/// ### maxIndirectSequenceCount
/// [VarHandle][#VH_maxIndirectSequenceCount] - [Getter][#maxIndirectSequenceCount()] - [Setter][#maxIndirectSequenceCount(int)]
/// ### maxIndirectCommandsTokenCount
/// [VarHandle][#VH_maxIndirectCommandsTokenCount] - [Getter][#maxIndirectCommandsTokenCount()] - [Setter][#maxIndirectCommandsTokenCount(int)]
/// ### maxIndirectCommandsStreamCount
/// [VarHandle][#VH_maxIndirectCommandsStreamCount] - [Getter][#maxIndirectCommandsStreamCount()] - [Setter][#maxIndirectCommandsStreamCount(int)]
/// ### maxIndirectCommandsTokenOffset
/// [VarHandle][#VH_maxIndirectCommandsTokenOffset] - [Getter][#maxIndirectCommandsTokenOffset()] - [Setter][#maxIndirectCommandsTokenOffset(int)]
/// ### maxIndirectCommandsStreamStride
/// [VarHandle][#VH_maxIndirectCommandsStreamStride] - [Getter][#maxIndirectCommandsStreamStride()] - [Setter][#maxIndirectCommandsStreamStride(int)]
/// ### minSequencesCountBufferOffsetAlignment
/// [VarHandle][#VH_minSequencesCountBufferOffsetAlignment] - [Getter][#minSequencesCountBufferOffsetAlignment()] - [Setter][#minSequencesCountBufferOffsetAlignment(int)]
/// ### minSequencesIndexBufferOffsetAlignment
/// [VarHandle][#VH_minSequencesIndexBufferOffsetAlignment] - [Getter][#minSequencesIndexBufferOffsetAlignment()] - [Setter][#minSequencesIndexBufferOffsetAlignment(int)]
/// ### minIndirectCommandsBufferOffsetAlignment
/// [VarHandle][#VH_minIndirectCommandsBufferOffsetAlignment] - [Getter][#minIndirectCommandsBufferOffsetAlignment()] - [Setter][#minIndirectCommandsBufferOffsetAlignment(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxGraphicsShaderGroupCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsStreamCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsStreamStride;
///     uint32_t minSequencesCountBufferOffsetAlignment;
///     uint32_t minSequencesIndexBufferOffsetAlignment;
///     uint32_t minIndirectCommandsBufferOffsetAlignment;
/// } VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV;
/// ```
public sealed class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxGraphicsShaderGroupCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamStride"),
        ValueLayout.JAVA_INT.withName("minSequencesCountBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxGraphicsShaderGroupCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGraphicsShaderGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    /// The [VarHandle] of `maxIndirectSequenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The [VarHandle] of `maxIndirectCommandsStreamCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsStreamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The [VarHandle] of `maxIndirectCommandsStreamStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsStreamStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    /// The [VarHandle] of `minSequencesCountBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minSequencesCountBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    /// The [VarHandle] of `minSequencesIndexBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minSequencesIndexBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    /// The [VarHandle] of `minIndirectCommandsBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minIndirectCommandsBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxGraphicsShaderGroupCount, @CType("uint32_t") int maxIndirectSequenceCount, @CType("uint32_t") int maxIndirectCommandsTokenCount, @CType("uint32_t") int maxIndirectCommandsStreamCount, @CType("uint32_t") int maxIndirectCommandsTokenOffset, @CType("uint32_t") int maxIndirectCommandsStreamStride, @CType("uint32_t") int minSequencesCountBufferOffsetAlignment, @CType("uint32_t") int minSequencesIndexBufferOffsetAlignment, @CType("uint32_t") int minIndirectCommandsBufferOffsetAlignment) { return alloc(allocator).sType(sType).pNext(pNext).maxGraphicsShaderGroupCount(maxGraphicsShaderGroupCount).maxIndirectSequenceCount(maxIndirectSequenceCount).maxIndirectCommandsTokenCount(maxIndirectCommandsTokenCount).maxIndirectCommandsStreamCount(maxIndirectCommandsStreamCount).maxIndirectCommandsTokenOffset(maxIndirectCommandsTokenOffset).maxIndirectCommandsStreamStride(maxIndirectCommandsStreamStride).minSequencesCountBufferOffsetAlignment(minSequencesCountBufferOffsetAlignment).minSequencesIndexBufferOffsetAlignment(minSequencesIndexBufferOffsetAlignment).minIndirectCommandsBufferOffsetAlignment(minIndirectCommandsBufferOffsetAlignment); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `maxGraphicsShaderGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGraphicsShaderGroupCount(MemorySegment segment, long index) { return (int) VH_maxGraphicsShaderGroupCount.get(segment, 0L, index); }
    /// {@return `maxGraphicsShaderGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGraphicsShaderGroupCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxGraphicsShaderGroupCount(segment, 0L); }
    /// {@return `maxGraphicsShaderGroupCount`}
    public @CType("uint32_t") int maxGraphicsShaderGroupCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxGraphicsShaderGroupCount(this.segment()); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGraphicsShaderGroupCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGraphicsShaderGroupCount.set(segment, 0L, index, value); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGraphicsShaderGroupCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxGraphicsShaderGroupCount(segment, 0L, value); }
    /// Sets `maxGraphicsShaderGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxGraphicsShaderGroupCount(this.segment(), value); return this; }

    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectSequenceCount(MemorySegment segment, long index) { return (int) VH_maxIndirectSequenceCount.get(segment, 0L, index); }
    /// {@return `maxIndirectSequenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectSequenceCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectSequenceCount(segment, 0L); }
    /// {@return `maxIndirectSequenceCount`}
    public @CType("uint32_t") int maxIndirectSequenceCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectSequenceCount(this.segment()); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectSequenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectSequenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectSequenceCount(segment, 0L, value); }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectSequenceCount(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenCount(segment, 0L); }
    /// {@return `maxIndirectCommandsTokenCount`}
    public @CType("uint32_t") int maxIndirectCommandsTokenCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenCount(this.segment()); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsTokenCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenCount(segment, 0L, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenCount(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsStreamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsStreamCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsStreamCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsStreamCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsStreamCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamCount(segment, 0L); }
    /// {@return `maxIndirectCommandsStreamCount`}
    public @CType("uint32_t") int maxIndirectCommandsStreamCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamCount(this.segment()); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsStreamCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsStreamCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsStreamCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamCount(segment, 0L, value); }
    /// Sets `maxIndirectCommandsStreamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamCount(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenOffset(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenOffset(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenOffset(segment, 0L); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    public @CType("uint32_t") int maxIndirectCommandsTokenOffset() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenOffset(this.segment()); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsTokenOffset.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenOffset(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenOffset(segment, 0L, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffset(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenOffset(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsStreamStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsStreamStride(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsStreamStride.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsStreamStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsStreamStride(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamStride(segment, 0L); }
    /// {@return `maxIndirectCommandsStreamStride`}
    public @CType("uint32_t") int maxIndirectCommandsStreamStride() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamStride(this.segment()); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsStreamStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsStreamStride.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsStreamStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamStride(segment, 0L, value); }
    /// Sets `maxIndirectCommandsStreamStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStride(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamStride(this.segment(), value); return this; }

    /// {@return `minSequencesCountBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minSequencesCountBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minSequencesCountBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minSequencesCountBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minSequencesCountBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesCountBufferOffsetAlignment(segment, 0L); }
    /// {@return `minSequencesCountBufferOffsetAlignment`}
    public @CType("uint32_t") int minSequencesCountBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesCountBufferOffsetAlignment(this.segment()); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSequencesCountBufferOffsetAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minSequencesCountBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSequencesCountBufferOffsetAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesCountBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minSequencesCountBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesCountBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minSequencesIndexBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minSequencesIndexBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minSequencesIndexBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minSequencesIndexBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minSequencesIndexBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesIndexBufferOffsetAlignment(segment, 0L); }
    /// {@return `minSequencesIndexBufferOffsetAlignment`}
    public @CType("uint32_t") int minSequencesIndexBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesIndexBufferOffsetAlignment(this.segment()); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSequencesIndexBufferOffsetAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minSequencesIndexBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSequencesIndexBufferOffsetAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesIndexBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesIndexBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minIndirectCommandsBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minIndirectCommandsBufferOffsetAlignment(MemorySegment segment, long index) { return (int) VH_minIndirectCommandsBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minIndirectCommandsBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minIndirectCommandsBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minIndirectCommandsBufferOffsetAlignment(segment, 0L); }
    /// {@return `minIndirectCommandsBufferOffsetAlignment`}
    public @CType("uint32_t") int minIndirectCommandsBufferOffsetAlignment() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minIndirectCommandsBufferOffsetAlignment(this.segment()); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minIndirectCommandsBufferOffsetAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minIndirectCommandsBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minIndirectCommandsBufferOffsetAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minIndirectCommandsBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minIndirectCommandsBufferOffsetAlignment(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV].
    public static final class Buffer extends VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxGraphicsShaderGroupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGraphicsShaderGroupCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxGraphicsShaderGroupCount(this.segment(), index); }
        /// Sets `maxGraphicsShaderGroupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGraphicsShaderGroupCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxGraphicsShaderGroupCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectSequenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxIndirectSequenceCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectSequenceCount(this.segment(), index); }
        /// Sets `maxIndirectSequenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectSequenceCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectSequenceCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsTokenCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxIndirectCommandsTokenCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenCount(this.segment(), index); }
        /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsTokenCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsStreamCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxIndirectCommandsStreamCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamCount(this.segment(), index); }
        /// Sets `maxIndirectCommandsStreamCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsStreamCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsTokenOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxIndirectCommandsTokenOffsetAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsTokenOffset(this.segment(), index); }
        /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsTokenOffsetAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsTokenOffset(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsStreamStride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxIndirectCommandsStreamStrideAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_maxIndirectCommandsStreamStride(this.segment(), index); }
        /// Sets `maxIndirectCommandsStreamStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsStreamStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_maxIndirectCommandsStreamStride(this.segment(), index, value); return this; }

        /// {@return `minSequencesCountBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minSequencesCountBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesCountBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minSequencesCountBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minSequencesCountBufferOffsetAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesCountBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minSequencesIndexBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minSequencesIndexBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minSequencesIndexBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minSequencesIndexBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minSequencesIndexBufferOffsetAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minSequencesIndexBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minIndirectCommandsBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minIndirectCommandsBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.get_minIndirectCommandsBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minIndirectCommandsBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minIndirectCommandsBufferOffsetAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.set_minIndirectCommandsBufferOffsetAlignment(this.segment(), index, value); return this; }

    }
}
