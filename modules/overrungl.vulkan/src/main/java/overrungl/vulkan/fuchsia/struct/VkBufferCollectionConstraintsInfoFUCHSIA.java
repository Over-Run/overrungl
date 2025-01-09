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
package overrungl.vulkan.fuchsia.struct;

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
/// ### minBufferCount
/// [VarHandle][#VH_minBufferCount] - [Getter][#minBufferCount()] - [Setter][#minBufferCount(int)]
/// ### maxBufferCount
/// [VarHandle][#VH_maxBufferCount] - [Getter][#maxBufferCount()] - [Setter][#maxBufferCount(int)]
/// ### minBufferCountForCamping
/// [VarHandle][#VH_minBufferCountForCamping] - [Getter][#minBufferCountForCamping()] - [Setter][#minBufferCountForCamping(int)]
/// ### minBufferCountForDedicatedSlack
/// [VarHandle][#VH_minBufferCountForDedicatedSlack] - [Getter][#minBufferCountForDedicatedSlack()] - [Setter][#minBufferCountForDedicatedSlack(int)]
/// ### minBufferCountForSharedSlack
/// [VarHandle][#VH_minBufferCountForSharedSlack] - [Getter][#minBufferCountForSharedSlack()] - [Setter][#minBufferCountForSharedSlack(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkBufferCollectionConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t minBufferCount;
///     uint32_t maxBufferCount;
///     uint32_t minBufferCountForCamping;
///     uint32_t minBufferCountForDedicatedSlack;
///     uint32_t minBufferCountForSharedSlack;
/// } VkBufferCollectionConstraintsInfoFUCHSIA;
/// ```
public final class VkBufferCollectionConstraintsInfoFUCHSIA extends Struct {
    /// The struct layout of `VkBufferCollectionConstraintsInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minBufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCount"));
    /// The [VarHandle] of `maxBufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferCount"));
    /// The [VarHandle] of `minBufferCountForCamping` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minBufferCountForCamping = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForCamping"));
    /// The [VarHandle] of `minBufferCountForDedicatedSlack` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minBufferCountForDedicatedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForDedicatedSlack"));
    /// The [VarHandle] of `minBufferCountForSharedSlack` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minBufferCountForSharedSlack = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBufferCountForSharedSlack"));

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionConstraintsInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionConstraintsInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionConstraintsInfoFUCHSIA ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionConstraintsInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCollectionConstraintsInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionConstraintsInfoFUCHSIA`
    public static VkBufferCollectionConstraintsInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionConstraintsInfoFUCHSIA(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkBufferCollectionConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferCollectionConstraintsInfoFUCHSIA`
    public VkBufferCollectionConstraintsInfoFUCHSIA asSlice(long index) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkBufferCollectionConstraintsInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferCollectionConstraintsInfoFUCHSIA`
    public VkBufferCollectionConstraintsInfoFUCHSIA asSlice(long index, long count) { return new VkBufferCollectionConstraintsInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `minBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minBufferCount(MemorySegment segment, long index) { return (int) VH_minBufferCount.get(segment, 0L, index); }
    /// {@return `minBufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minBufferCount(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCount(segment, 0L); }
    /// {@return `minBufferCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minBufferCountAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCount(this.segment(), index); }
    /// {@return `minBufferCount`}
    public @CType("uint32_t") int minBufferCount() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCount(this.segment()); }
    /// Sets `minBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minBufferCount.set(segment, 0L, index, value); }
    /// Sets `minBufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCount(segment, 0L, value); }
    /// Sets `minBufferCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountAt(long index, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCount(this.segment(), index, value); return this; }
    /// Sets `minBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCount(@CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCount(this.segment(), value); return this; }

    /// {@return `maxBufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBufferCount(MemorySegment segment, long index) { return (int) VH_maxBufferCount.get(segment, 0L, index); }
    /// {@return `maxBufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBufferCount(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_maxBufferCount(segment, 0L); }
    /// {@return `maxBufferCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxBufferCountAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_maxBufferCount(this.segment(), index); }
    /// {@return `maxBufferCount`}
    public @CType("uint32_t") int maxBufferCount() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_maxBufferCount(this.segment()); }
    /// Sets `maxBufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBufferCount.set(segment, 0L, index, value); }
    /// Sets `maxBufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_maxBufferCount(segment, 0L, value); }
    /// Sets `maxBufferCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA maxBufferCountAt(long index, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_maxBufferCount(this.segment(), index, value); return this; }
    /// Sets `maxBufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA maxBufferCount(@CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_maxBufferCount(this.segment(), value); return this; }

    /// {@return `minBufferCountForCamping` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minBufferCountForCamping(MemorySegment segment, long index) { return (int) VH_minBufferCountForCamping.get(segment, 0L, index); }
    /// {@return `minBufferCountForCamping`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minBufferCountForCamping(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForCamping(segment, 0L); }
    /// {@return `minBufferCountForCamping` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minBufferCountForCampingAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForCamping(this.segment(), index); }
    /// {@return `minBufferCountForCamping`}
    public @CType("uint32_t") int minBufferCountForCamping() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForCamping(this.segment()); }
    /// Sets `minBufferCountForCamping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBufferCountForCamping(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minBufferCountForCamping.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForCamping` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBufferCountForCamping(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForCamping(segment, 0L, value); }
    /// Sets `minBufferCountForCamping` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForCampingAt(long index, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForCamping(this.segment(), index, value); return this; }
    /// Sets `minBufferCountForCamping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForCamping(@CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForCamping(this.segment(), value); return this; }

    /// {@return `minBufferCountForDedicatedSlack` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minBufferCountForDedicatedSlack(MemorySegment segment, long index) { return (int) VH_minBufferCountForDedicatedSlack.get(segment, 0L, index); }
    /// {@return `minBufferCountForDedicatedSlack`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minBufferCountForDedicatedSlack(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForDedicatedSlack(segment, 0L); }
    /// {@return `minBufferCountForDedicatedSlack` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minBufferCountForDedicatedSlackAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForDedicatedSlack(this.segment(), index); }
    /// {@return `minBufferCountForDedicatedSlack`}
    public @CType("uint32_t") int minBufferCountForDedicatedSlack() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForDedicatedSlack(this.segment()); }
    /// Sets `minBufferCountForDedicatedSlack` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBufferCountForDedicatedSlack(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minBufferCountForDedicatedSlack.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForDedicatedSlack` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBufferCountForDedicatedSlack(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForDedicatedSlack(segment, 0L, value); }
    /// Sets `minBufferCountForDedicatedSlack` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForDedicatedSlackAt(long index, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForDedicatedSlack(this.segment(), index, value); return this; }
    /// Sets `minBufferCountForDedicatedSlack` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForDedicatedSlack(@CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForDedicatedSlack(this.segment(), value); return this; }

    /// {@return `minBufferCountForSharedSlack` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minBufferCountForSharedSlack(MemorySegment segment, long index) { return (int) VH_minBufferCountForSharedSlack.get(segment, 0L, index); }
    /// {@return `minBufferCountForSharedSlack`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minBufferCountForSharedSlack(MemorySegment segment) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForSharedSlack(segment, 0L); }
    /// {@return `minBufferCountForSharedSlack` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minBufferCountForSharedSlackAt(long index) { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForSharedSlack(this.segment(), index); }
    /// {@return `minBufferCountForSharedSlack`}
    public @CType("uint32_t") int minBufferCountForSharedSlack() { return VkBufferCollectionConstraintsInfoFUCHSIA.get_minBufferCountForSharedSlack(this.segment()); }
    /// Sets `minBufferCountForSharedSlack` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minBufferCountForSharedSlack(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minBufferCountForSharedSlack.set(segment, 0L, index, value); }
    /// Sets `minBufferCountForSharedSlack` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minBufferCountForSharedSlack(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForSharedSlack(segment, 0L, value); }
    /// Sets `minBufferCountForSharedSlack` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForSharedSlackAt(long index, @CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForSharedSlack(this.segment(), index, value); return this; }
    /// Sets `minBufferCountForSharedSlack` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionConstraintsInfoFUCHSIA minBufferCountForSharedSlack(@CType("uint32_t") int value) { VkBufferCollectionConstraintsInfoFUCHSIA.set_minBufferCountForSharedSlack(this.segment(), value); return this; }

}
