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
package overrungl.vulkan.ext.struct;

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
/// ### maxTransformFeedbackStreams
/// [VarHandle][#VH_maxTransformFeedbackStreams] - [Getter][#maxTransformFeedbackStreams()] - [Setter][#maxTransformFeedbackStreams(int)]
/// ### maxTransformFeedbackBuffers
/// [VarHandle][#VH_maxTransformFeedbackBuffers] - [Getter][#maxTransformFeedbackBuffers()] - [Setter][#maxTransformFeedbackBuffers(int)]
/// ### maxTransformFeedbackBufferSize
/// [VarHandle][#VH_maxTransformFeedbackBufferSize] - [Getter][#maxTransformFeedbackBufferSize()] - [Setter][#maxTransformFeedbackBufferSize(long)]
/// ### maxTransformFeedbackStreamDataSize
/// [VarHandle][#VH_maxTransformFeedbackStreamDataSize] - [Getter][#maxTransformFeedbackStreamDataSize()] - [Setter][#maxTransformFeedbackStreamDataSize(int)]
/// ### maxTransformFeedbackBufferDataSize
/// [VarHandle][#VH_maxTransformFeedbackBufferDataSize] - [Getter][#maxTransformFeedbackBufferDataSize()] - [Setter][#maxTransformFeedbackBufferDataSize(int)]
/// ### maxTransformFeedbackBufferDataStride
/// [VarHandle][#VH_maxTransformFeedbackBufferDataStride] - [Getter][#maxTransformFeedbackBufferDataStride()] - [Setter][#maxTransformFeedbackBufferDataStride(int)]
/// ### transformFeedbackQueries
/// [VarHandle][#VH_transformFeedbackQueries] - [Getter][#transformFeedbackQueries()] - [Setter][#transformFeedbackQueries(int)]
/// ### transformFeedbackStreamsLinesTriangles
/// [VarHandle][#VH_transformFeedbackStreamsLinesTriangles] - [Getter][#transformFeedbackStreamsLinesTriangles()] - [Setter][#transformFeedbackStreamsLinesTriangles(int)]
/// ### transformFeedbackRasterizationStreamSelect
/// [VarHandle][#VH_transformFeedbackRasterizationStreamSelect] - [Getter][#transformFeedbackRasterizationStreamSelect()] - [Setter][#transformFeedbackRasterizationStreamSelect(int)]
/// ### transformFeedbackDraw
/// [VarHandle][#VH_transformFeedbackDraw] - [Getter][#transformFeedbackDraw()] - [Setter][#transformFeedbackDraw(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxTransformFeedbackStreams;
///     uint32_t maxTransformFeedbackBuffers;
///     VkDeviceSize maxTransformFeedbackBufferSize;
///     uint32_t maxTransformFeedbackStreamDataSize;
///     uint32_t maxTransformFeedbackBufferDataSize;
///     uint32_t maxTransformFeedbackBufferDataStride;
///     VkBool32 transformFeedbackQueries;
///     VkBool32 transformFeedbackStreamsLinesTriangles;
///     VkBool32 transformFeedbackRasterizationStreamSelect;
///     VkBool32 transformFeedbackDraw;
/// } VkPhysicalDeviceTransformFeedbackPropertiesEXT;
/// ```
public final class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceTransformFeedbackPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers"),
        ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
        ValueLayout.JAVA_INT.withName("transformFeedbackQueries"),
        ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
        ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
        ValueLayout.JAVA_INT.withName("transformFeedbackDraw")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxTransformFeedbackStreams` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTransformFeedbackStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreams"));
    /// The [VarHandle] of `maxTransformFeedbackBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTransformFeedbackBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBuffers"));
    /// The [VarHandle] of `maxTransformFeedbackBufferSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxTransformFeedbackBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    /// The [VarHandle] of `maxTransformFeedbackStreamDataSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTransformFeedbackStreamDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    /// The [VarHandle] of `maxTransformFeedbackBufferDataSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTransformFeedbackBufferDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    /// The [VarHandle] of `maxTransformFeedbackBufferDataStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTransformFeedbackBufferDataStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    /// The [VarHandle] of `transformFeedbackQueries` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackQueries"));
    /// The [VarHandle] of `transformFeedbackStreamsLinesTriangles` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackStreamsLinesTriangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    /// The [VarHandle] of `transformFeedbackRasterizationStreamSelect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackRasterizationStreamSelect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    /// The [VarHandle] of `transformFeedbackDraw` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformFeedbackDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackDraw"));

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackPropertiesEXT`
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTransformFeedbackStreams(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackStreams.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackStreams`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTransformFeedbackStreams(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreams(segment, 0L); }
    /// {@return `maxTransformFeedbackStreams` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTransformFeedbackStreamsAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreams(this.segment(), index); }
    /// {@return `maxTransformFeedbackStreams`}
    public @CType("uint32_t") int maxTransformFeedbackStreams() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreams(this.segment()); }
    /// Sets `maxTransformFeedbackStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackStreams(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTransformFeedbackStreams.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackStreams` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackStreams(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreams(segment, 0L, value); }
    /// Sets `maxTransformFeedbackStreams` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreams(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreams(@CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreams(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTransformFeedbackBuffers(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBuffers.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTransformFeedbackBuffers(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBuffers(segment, 0L); }
    /// {@return `maxTransformFeedbackBuffers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTransformFeedbackBuffersAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBuffers(this.segment(), index); }
    /// {@return `maxTransformFeedbackBuffers`}
    public @CType("uint32_t") int maxTransformFeedbackBuffers() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBuffers(this.segment()); }
    /// Sets `maxTransformFeedbackBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTransformFeedbackBuffers.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBuffers(segment, 0L, value); }
    /// Sets `maxTransformFeedbackBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBuffers(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBuffers(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxTransformFeedbackBufferSize(MemorySegment segment, long index) { return (long) VH_maxTransformFeedbackBufferSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxTransformFeedbackBufferSize(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferSize(segment, 0L); }
    /// {@return `maxTransformFeedbackBufferSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxTransformFeedbackBufferSizeAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferSize(this.segment(), index); }
    /// {@return `maxTransformFeedbackBufferSize`}
    public @CType("VkDeviceSize") long maxTransformFeedbackBufferSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferSize(this.segment()); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxTransformFeedbackBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferSize(segment, 0L, value); }
    /// Sets `maxTransformFeedbackBufferSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferSize(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferSize(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackStreamDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTransformFeedbackStreamDataSize(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackStreamDataSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackStreamDataSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTransformFeedbackStreamDataSize(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreamDataSize(segment, 0L); }
    /// {@return `maxTransformFeedbackStreamDataSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTransformFeedbackStreamDataSizeAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreamDataSize(this.segment(), index); }
    /// {@return `maxTransformFeedbackStreamDataSize`}
    public @CType("uint32_t") int maxTransformFeedbackStreamDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackStreamDataSize(this.segment()); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackStreamDataSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTransformFeedbackStreamDataSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackStreamDataSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreamDataSize(segment, 0L, value); }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreamDataSize(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackStreamDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSize(@CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackStreamDataSize(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackBufferDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTransformFeedbackBufferDataSize(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBufferDataSize.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferDataSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTransformFeedbackBufferDataSize(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataSize(segment, 0L); }
    /// {@return `maxTransformFeedbackBufferDataSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTransformFeedbackBufferDataSizeAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataSize(this.segment(), index); }
    /// {@return `maxTransformFeedbackBufferDataSize`}
    public @CType("uint32_t") int maxTransformFeedbackBufferDataSize() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataSize(this.segment()); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferDataSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTransformFeedbackBufferDataSize.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferDataSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataSize(segment, 0L, value); }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataSize(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackBufferDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSize(@CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataSize(this.segment(), value); return this; }

    /// {@return `maxTransformFeedbackBufferDataStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTransformFeedbackBufferDataStride(MemorySegment segment, long index) { return (int) VH_maxTransformFeedbackBufferDataStride.get(segment, 0L, index); }
    /// {@return `maxTransformFeedbackBufferDataStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTransformFeedbackBufferDataStride(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataStride(segment, 0L); }
    /// {@return `maxTransformFeedbackBufferDataStride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTransformFeedbackBufferDataStrideAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataStride(this.segment(), index); }
    /// {@return `maxTransformFeedbackBufferDataStride`}
    public @CType("uint32_t") int maxTransformFeedbackBufferDataStride() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_maxTransformFeedbackBufferDataStride(this.segment()); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferDataStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTransformFeedbackBufferDataStride.set(segment, 0L, index, value); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTransformFeedbackBufferDataStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataStride(segment, 0L, value); }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataStride(this.segment(), index, value); return this; }
    /// Sets `maxTransformFeedbackBufferDataStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStride(@CType("uint32_t") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_maxTransformFeedbackBufferDataStride(this.segment(), value); return this; }

    /// {@return `transformFeedbackQueries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackQueries(MemorySegment segment, long index) { return (int) VH_transformFeedbackQueries.get(segment, 0L, index); }
    /// {@return `transformFeedbackQueries`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackQueries(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackQueries(segment, 0L); }
    /// {@return `transformFeedbackQueries` at the given index}
    /// @param index the index
    public @CType("VkBool32") int transformFeedbackQueriesAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackQueries(this.segment(), index); }
    /// {@return `transformFeedbackQueries`}
    public @CType("VkBool32") int transformFeedbackQueries() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackQueries(this.segment()); }
    /// Sets `transformFeedbackQueries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackQueries(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackQueries.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackQueries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackQueries(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackQueries(segment, 0L, value); }
    /// Sets `transformFeedbackQueries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueriesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackQueries(this.segment(), index, value); return this; }
    /// Sets `transformFeedbackQueries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueries(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackQueries(this.segment(), value); return this; }

    /// {@return `transformFeedbackStreamsLinesTriangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackStreamsLinesTriangles(MemorySegment segment, long index) { return (int) VH_transformFeedbackStreamsLinesTriangles.get(segment, 0L, index); }
    /// {@return `transformFeedbackStreamsLinesTriangles`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackStreamsLinesTriangles(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackStreamsLinesTriangles(segment, 0L); }
    /// {@return `transformFeedbackStreamsLinesTriangles` at the given index}
    /// @param index the index
    public @CType("VkBool32") int transformFeedbackStreamsLinesTrianglesAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackStreamsLinesTriangles(this.segment(), index); }
    /// {@return `transformFeedbackStreamsLinesTriangles`}
    public @CType("VkBool32") int transformFeedbackStreamsLinesTriangles() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackStreamsLinesTriangles(this.segment()); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackStreamsLinesTriangles(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackStreamsLinesTriangles.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackStreamsLinesTriangles(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackStreamsLinesTriangles(segment, 0L, value); }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTrianglesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackStreamsLinesTriangles(this.segment(), index, value); return this; }
    /// Sets `transformFeedbackStreamsLinesTriangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTriangles(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackStreamsLinesTriangles(this.segment(), value); return this; }

    /// {@return `transformFeedbackRasterizationStreamSelect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackRasterizationStreamSelect(MemorySegment segment, long index) { return (int) VH_transformFeedbackRasterizationStreamSelect.get(segment, 0L, index); }
    /// {@return `transformFeedbackRasterizationStreamSelect`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackRasterizationStreamSelect(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackRasterizationStreamSelect(segment, 0L); }
    /// {@return `transformFeedbackRasterizationStreamSelect` at the given index}
    /// @param index the index
    public @CType("VkBool32") int transformFeedbackRasterizationStreamSelectAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackRasterizationStreamSelect(this.segment(), index); }
    /// {@return `transformFeedbackRasterizationStreamSelect`}
    public @CType("VkBool32") int transformFeedbackRasterizationStreamSelect() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackRasterizationStreamSelect(this.segment()); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackRasterizationStreamSelect(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackRasterizationStreamSelect.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackRasterizationStreamSelect(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackRasterizationStreamSelect(segment, 0L, value); }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelectAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackRasterizationStreamSelect(this.segment(), index, value); return this; }
    /// Sets `transformFeedbackRasterizationStreamSelect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelect(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackRasterizationStreamSelect(this.segment(), value); return this; }

    /// {@return `transformFeedbackDraw` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_transformFeedbackDraw(MemorySegment segment, long index) { return (int) VH_transformFeedbackDraw.get(segment, 0L, index); }
    /// {@return `transformFeedbackDraw`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_transformFeedbackDraw(MemorySegment segment) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackDraw(segment, 0L); }
    /// {@return `transformFeedbackDraw` at the given index}
    /// @param index the index
    public @CType("VkBool32") int transformFeedbackDrawAt(long index) { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackDraw(this.segment(), index); }
    /// {@return `transformFeedbackDraw`}
    public @CType("VkBool32") int transformFeedbackDraw() { return VkPhysicalDeviceTransformFeedbackPropertiesEXT.get_transformFeedbackDraw(this.segment()); }
    /// Sets `transformFeedbackDraw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformFeedbackDraw(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_transformFeedbackDraw.set(segment, 0L, index, value); }
    /// Sets `transformFeedbackDraw` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformFeedbackDraw(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackDraw(segment, 0L, value); }
    /// Sets `transformFeedbackDraw` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDrawAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackDraw(this.segment(), index, value); return this; }
    /// Sets `transformFeedbackDraw` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDraw(@CType("VkBool32") int value) { VkPhysicalDeviceTransformFeedbackPropertiesEXT.set_transformFeedbackDraw(this.segment(), value); return this; }

}
