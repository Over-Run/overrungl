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
/// ### useMinQp
/// [VarHandle][#VH_useMinQp] - [Getter][#useMinQp()] - [Setter][#useMinQp(int)]
/// ### minQp
/// [Byte offset][#OFFSET_minQp] - [Memory layout][#ML_minQp] - [Getter][#minQp()] - [Setter][#minQp(java.lang.foreign.MemorySegment)]
/// ### useMaxQp
/// [VarHandle][#VH_useMaxQp] - [Getter][#useMaxQp()] - [Setter][#useMaxQp(int)]
/// ### maxQp
/// [Byte offset][#OFFSET_maxQp] - [Memory layout][#ML_maxQp] - [Getter][#maxQp()] - [Setter][#maxQp(java.lang.foreign.MemorySegment)]
/// ### useMaxFrameSize
/// [VarHandle][#VH_useMaxFrameSize] - [Getter][#useMaxFrameSize()] - [Setter][#useMaxFrameSize(int)]
/// ### maxFrameSize
/// [Byte offset][#OFFSET_maxFrameSize] - [Memory layout][#ML_maxFrameSize] - [Getter][#maxFrameSize()] - [Setter][#maxFrameSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264RateControlLayerInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 useMinQp;
///     VkVideoEncodeH264QpKHR minQp;
///     VkBool32 useMaxQp;
///     VkVideoEncodeH264QpKHR maxQp;
///     VkBool32 useMaxFrameSize;
///     VkVideoEncodeH264FrameSizeKHR maxFrameSize;
/// } VkVideoEncodeH264RateControlLayerInfoKHR;
/// ```
public final class VkVideoEncodeH264RateControlLayerInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264RateControlLayerInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264QpKHR.LAYOUT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("useMaxQp"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264QpKHR.LAYOUT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264FrameSizeKHR.LAYOUT.withName("maxFrameSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `useMinQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMinQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQp"));
    /// The byte offset of `minQp`.
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    /// The memory layout of `minQp`.
    public static final MemoryLayout ML_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    /// The [VarHandle] of `useMaxQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQp"));
    /// The byte offset of `maxQp`.
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    /// The memory layout of `maxQp`.
    public static final MemoryLayout ML_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    /// The [VarHandle] of `useMaxFrameSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    /// The byte offset of `maxFrameSize`.
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    /// The memory layout of `maxFrameSize`.
    public static final MemoryLayout ML_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));

    /// Creates `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264RateControlLayerInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264RateControlLayerInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264RateControlLayerInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264RateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264RateControlLayerInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264RateControlLayerInfoKHR`
    public static VkVideoEncodeH264RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264RateControlLayerInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264RateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264RateControlLayerInfoKHR`
    public static VkVideoEncodeH264RateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264RateControlLayerInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeH264RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH264RateControlLayerInfoKHR`
    public VkVideoEncodeH264RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeH264RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeH264RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH264RateControlLayerInfoKHR`
    public VkVideoEncodeH264RateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `useMinQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMinQp(MemorySegment segment, long index) { return (int) VH_useMinQp.get(segment, 0L, index); }
    /// {@return `useMinQp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMinQp(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMinQp(segment, 0L); }
    /// {@return `useMinQp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMinQpAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMinQp(this.segment(), index); }
    /// {@return `useMinQp`}
    public @CType("VkBool32") int useMinQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMinQp(this.segment()); }
    /// Sets `useMinQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMinQp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMinQp.set(segment, 0L, index, value); }
    /// Sets `useMinQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMinQp(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMinQp(segment, 0L, value); }
    /// Sets `useMinQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQpAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMinQp(this.segment(), index, value); return this; }
    /// Sets `useMinQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(@CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMinQp(this.segment(), value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_minQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minQp, index), ML_minQp); }
    /// {@return `minQp`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_minQp(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_minQp(segment, 0L); }
    /// {@return `minQp` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment minQpAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_minQp(this.segment(), index); }
    /// {@return `minQp`}
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment minQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_minQp(this.segment()); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minQp, index), ML_minQp.byteSize()); }
    /// Sets `minQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_minQp(segment, 0L, value); }
    /// Sets `minQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR minQpAt(long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_minQp(this.segment(), index, value); return this; }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(@CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_minQp(this.segment(), value); return this; }

    /// {@return `useMaxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxQp(MemorySegment segment, long index) { return (int) VH_useMaxQp.get(segment, 0L, index); }
    /// {@return `useMaxQp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxQp(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxQp(segment, 0L); }
    /// {@return `useMaxQp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMaxQpAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxQp(this.segment(), index); }
    /// {@return `useMaxQp`}
    public @CType("VkBool32") int useMaxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxQp(this.segment()); }
    /// Sets `useMaxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxQp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxQp.set(segment, 0L, index, value); }
    /// Sets `useMaxQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxQp(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxQp(segment, 0L, value); }
    /// Sets `useMaxQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQpAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxQp(this.segment(), index, value); return this; }
    /// Sets `useMaxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(@CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxQp(this.segment(), value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_maxQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxQp, index), ML_maxQp); }
    /// {@return `maxQp`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_maxQp(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxQp(segment, 0L); }
    /// {@return `maxQp` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment maxQpAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxQp(this.segment(), index); }
    /// {@return `maxQp`}
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment maxQp() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxQp(this.segment()); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxQp, index), ML_maxQp.byteSize()); }
    /// Sets `maxQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxQp(segment, 0L, value); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQpAt(long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxQp(this.segment(), index, value); return this; }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(@CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxQp(this.segment(), value); return this; }

    /// {@return `useMaxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_useMaxFrameSize(MemorySegment segment, long index) { return (int) VH_useMaxFrameSize.get(segment, 0L, index); }
    /// {@return `useMaxFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_useMaxFrameSize(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxFrameSize(segment, 0L); }
    /// {@return `useMaxFrameSize` at the given index}
    /// @param index the index
    public @CType("VkBool32") int useMaxFrameSizeAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxFrameSize(this.segment(), index); }
    /// {@return `useMaxFrameSize`}
    public @CType("VkBool32") int useMaxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_useMaxFrameSize(this.segment()); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_useMaxFrameSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_useMaxFrameSize.set(segment, 0L, index, value); }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_useMaxFrameSize(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxFrameSize(segment, 0L, value); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSizeAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxFrameSize(this.segment(), index, value); return this; }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(@CType("VkBool32") int value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_useMaxFrameSize(this.segment(), value); return this; }

    /// {@return `maxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment get_maxFrameSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), ML_maxFrameSize); }
    /// {@return `maxFrameSize`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment get_maxFrameSize(MemorySegment segment) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxFrameSize(segment, 0L); }
    /// {@return `maxFrameSize` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment maxFrameSizeAt(long index) { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxFrameSize(this.segment(), index); }
    /// {@return `maxFrameSize`}
    public @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment maxFrameSize() { return VkVideoEncodeH264RateControlLayerInfoKHR.get_maxFrameSize(this.segment()); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFrameSize(MemorySegment segment, long index, @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFrameSize, index), ML_maxFrameSize.byteSize()); }
    /// Sets `maxFrameSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFrameSize(MemorySegment segment, @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxFrameSize(segment, 0L, value); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSizeAt(long index, @CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxFrameSize(this.segment(), index, value); return this; }
    /// Sets `maxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(@CType("VkVideoEncodeH264FrameSizeKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264RateControlLayerInfoKHR.set_maxFrameSize(this.segment(), value); return this; }

}
