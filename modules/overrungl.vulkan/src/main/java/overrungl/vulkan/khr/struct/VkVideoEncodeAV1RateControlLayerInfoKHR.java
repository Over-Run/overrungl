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
package overrungl.vulkan.khr.struct;

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
/// ### useMinQIndex
/// [VarHandle][#VH_useMinQIndex] - [Getter][#useMinQIndex()] - [Setter][#useMinQIndex(int)]
/// ### minQIndex
/// [Byte offset][#OFFSET_minQIndex] - [Memory layout][#ML_minQIndex] - [Getter][#minQIndex()] - [Setter][#minQIndex(java.lang.foreign.MemorySegment)]
/// ### useMaxQIndex
/// [VarHandle][#VH_useMaxQIndex] - [Getter][#useMaxQIndex()] - [Setter][#useMaxQIndex(int)]
/// ### maxQIndex
/// [Byte offset][#OFFSET_maxQIndex] - [Memory layout][#ML_maxQIndex] - [Getter][#maxQIndex()] - [Setter][#maxQIndex(java.lang.foreign.MemorySegment)]
/// ### useMaxFrameSize
/// [VarHandle][#VH_useMaxFrameSize] - [Getter][#useMaxFrameSize()] - [Setter][#useMaxFrameSize(int)]
/// ### maxFrameSize
/// [Byte offset][#OFFSET_maxFrameSize] - [Memory layout][#ML_maxFrameSize] - [Getter][#maxFrameSize()] - [Setter][#maxFrameSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1RateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useMinQIndex;
///     VkVideoEncodeAV1QIndexKHR minQIndex;
///     VkBool32 useMaxQIndex;
///     VkVideoEncodeAV1QIndexKHR maxQIndex;
///     VkBool32 useMaxFrameSize;
///     VkVideoEncodeAV1FrameSizeKHR maxFrameSize;
/// } VkVideoEncodeAV1RateControlLayerInfoKHR;
/// ```
public final class VkVideoEncodeAV1RateControlLayerInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useMinQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMinQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQIndex"));
    /// The byte offset of `minQIndex`.
    public static final long OFFSET_minQIndex = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
    /// The memory layout of `minQIndex`.
    public static final MemoryLayout ML_minQIndex = LAYOUT.select(PathElement.groupElement("minQIndex"));
    /// The [VarHandle] of `useMaxQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQIndex"));
    /// The byte offset of `maxQIndex`.
    public static final long OFFSET_maxQIndex = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
    /// The memory layout of `maxQIndex`.
    public static final MemoryLayout ML_maxQIndex = LAYOUT.select(PathElement.groupElement("maxQIndex"));
    /// The [VarHandle] of `useMaxFrameSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    /// The byte offset of `maxFrameSize`.
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    /// The memory layout of `maxFrameSize`.
    public static final MemoryLayout ML_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1RateControlLayerInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useMinQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMinQIndex(MemorySegment segment, long index) { return (int) VH_useMinQIndex.get(segment, 0L, index); }
    /// {@return `useMinQIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMinQIndex(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMinQIndex(segment, 0L); }
    /// {@return `useMinQIndex` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMinQIndexAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMinQIndex(this.segment(), index); }
    /// {@return `useMinQIndex`}
    public @CType("VkBool32") int useMinQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMinQIndex(this.segment()); }
    /// Sets `useMinQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMinQIndex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMinQIndex.set(segment, 0L, index, value); }
    /// Sets `useMinQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMinQIndex(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMinQIndex(segment, 0L, value); }
    /// Sets `useMinQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndexAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMinQIndex(this.segment(), index, value); return this; }
    /// Sets `useMinQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(@CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMinQIndex(this.segment(), value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_minQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minQIndex, index), ML_minQIndex); }
    /// {@return `minQIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_minQIndex(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_minQIndex(segment, 0L); }
    /// {@return `minQIndex` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment minQIndexAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_minQIndex(this.segment(), index); }
    /// {@return `minQIndex`}
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment minQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_minQIndex(this.segment()); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQIndex(MemorySegment segment, long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minQIndex, index), ML_minQIndex.byteSize()); }
    /// Sets `minQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQIndex(MemorySegment segment, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_minQIndex(segment, 0L, value); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndexAt(long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_minQIndex(this.segment(), index, value); return this; }
    /// Sets `minQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(@CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_minQIndex(this.segment(), value); return this; }

    /// {@return `useMaxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxQIndex(MemorySegment segment, long index) { return (int) VH_useMaxQIndex.get(segment, 0L, index); }
    /// {@return `useMaxQIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxQIndex(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxQIndex(segment, 0L); }
    /// {@return `useMaxQIndex` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMaxQIndexAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxQIndex(this.segment(), index); }
    /// {@return `useMaxQIndex`}
    public @CType("VkBool32") int useMaxQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxQIndex(this.segment()); }
    /// Sets `useMaxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxQIndex(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxQIndex.set(segment, 0L, index, value); }
    /// Sets `useMaxQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxQIndex(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxQIndex(segment, 0L, value); }
    /// Sets `useMaxQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndexAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxQIndex(this.segment(), index, value); return this; }
    /// Sets `useMaxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(@CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxQIndex(this.segment(), value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_maxQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxQIndex, index), ML_maxQIndex); }
    /// {@return `maxQIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_maxQIndex(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxQIndex(segment, 0L); }
    /// {@return `maxQIndex` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment maxQIndexAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxQIndex(this.segment(), index); }
    /// {@return `maxQIndex`}
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment maxQIndex() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxQIndex(this.segment()); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQIndex(MemorySegment segment, long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxQIndex, index), ML_maxQIndex.byteSize()); }
    /// Sets `maxQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQIndex(MemorySegment segment, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxQIndex(segment, 0L, value); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndexAt(long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxQIndex(this.segment(), index, value); return this; }
    /// Sets `maxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(@CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxQIndex(this.segment(), value); return this; }

    /// {@return `useMaxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxFrameSize(MemorySegment segment, long index) { return (int) VH_useMaxFrameSize.get(segment, 0L, index); }
    /// {@return `useMaxFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxFrameSize(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxFrameSize(segment, 0L); }
    /// {@return `useMaxFrameSize` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMaxFrameSizeAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxFrameSize(this.segment(), index); }
    /// {@return `useMaxFrameSize`}
    public @CType("VkBool32") int useMaxFrameSize() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_useMaxFrameSize(this.segment()); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxFrameSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxFrameSize.set(segment, 0L, index, value); }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxFrameSize(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxFrameSize(segment, 0L, value); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSizeAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxFrameSize(this.segment(), index, value); return this; }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(@CType("VkBool32") int value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_useMaxFrameSize(this.segment(), value); return this; }

    /// {@return `maxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment get_maxFrameSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), ML_maxFrameSize); }
    /// {@return `maxFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment get_maxFrameSize(MemorySegment segment) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxFrameSize(segment, 0L); }
    /// {@return `maxFrameSize` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment maxFrameSizeAt(long index) { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxFrameSize(this.segment(), index); }
    /// {@return `maxFrameSize`}
    public @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment maxFrameSize() { return VkVideoEncodeAV1RateControlLayerInfoKHR.get_maxFrameSize(this.segment()); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFrameSize(MemorySegment segment, long index, @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFrameSize, index), ML_maxFrameSize.byteSize()); }
    /// Sets `maxFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFrameSize(MemorySegment segment, @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxFrameSize(segment, 0L, value); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSizeAt(long index, @CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxFrameSize(this.segment(), index, value); return this; }
    /// Sets `maxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(@CType("VkVideoEncodeAV1FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1RateControlLayerInfoKHR.set_maxFrameSize(this.segment(), value); return this; }

}
