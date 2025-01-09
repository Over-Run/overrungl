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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(java.lang.foreign.MemorySegment)]
/// ### value
/// [VarHandle][#VH_value] - [Getter][#value()] - [Setter][#value(long)]
/// ### stageMask
/// [VarHandle][#VH_stageMask] - [Getter][#stageMask()] - [Setter][#stageMask(long)]
/// ### deviceIndex
/// [VarHandle][#VH_deviceIndex] - [Getter][#deviceIndex()] - [Setter][#deviceIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore semaphore;
///     uint64_t value;
///     VkPipelineStageFlags2 stageMask;
///     uint32_t deviceIndex;
/// } VkSemaphoreSubmitInfo;
/// ```
public final class VkSemaphoreSubmitInfo extends Struct {
    /// The struct layout of `VkSemaphoreSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value"),
        ValueLayout.JAVA_LONG.withName("stageMask"),
        ValueLayout.JAVA_INT.withName("deviceIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));
    /// The [VarHandle] of `stageMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageMask"));
    /// The [VarHandle] of `deviceIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndex"));

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreSubmitInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSemaphoreSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreSubmitInfo`
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreSubmitInfo`
    public static VkSemaphoreSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreSubmitInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreSubmitInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreSubmitInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo sType(@CType("VkStructureType") int value) { VkSemaphoreSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSemaphoreSubmitInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSemaphoreSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_semaphore(segment, 0L); }
    /// {@return `semaphore` at the given index}
    /// @param index the index
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphoreAt(long index) { return VkSemaphoreSubmitInfo.get_semaphore(this.segment(), index); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore() { return VkSemaphoreSubmitInfo.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo semaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_semaphore(this.segment(), index, value); return this; }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo semaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkSemaphoreSubmitInfo.set_semaphore(this.segment(), value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_value(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_value(segment, 0L); }
    /// {@return `value` at the given index}
    /// @param index the index
    public @CType("uint64_t") long valueAt(long index) { return VkSemaphoreSubmitInfo.get_value(this.segment(), index); }
    /// {@return `value`}
    public @CType("uint64_t") long value() { return VkSemaphoreSubmitInfo.get_value(this.segment()); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_value(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_value(MemorySegment segment, @CType("uint64_t") long value) { VkSemaphoreSubmitInfo.set_value(segment, 0L, value); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo valueAt(long index, @CType("uint64_t") long value) { VkSemaphoreSubmitInfo.set_value(this.segment(), index, value); return this; }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo value(@CType("uint64_t") long value) { VkSemaphoreSubmitInfo.set_value(this.segment(), value); return this; }

    /// {@return `stageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_stageMask(MemorySegment segment, long index) { return (long) VH_stageMask.get(segment, 0L, index); }
    /// {@return `stageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_stageMask(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_stageMask(segment, 0L); }
    /// {@return `stageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags2") long stageMaskAt(long index) { return VkSemaphoreSubmitInfo.get_stageMask(this.segment(), index); }
    /// {@return `stageMask`}
    public @CType("VkPipelineStageFlags2") long stageMask() { return VkSemaphoreSubmitInfo.get_stageMask(this.segment()); }
    /// Sets `stageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_stageMask.set(segment, 0L, index, value); }
    /// Sets `stageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfo.set_stageMask(segment, 0L, value); }
    /// Sets `stageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo stageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfo.set_stageMask(this.segment(), index, value); return this; }
    /// Sets `stageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo stageMask(@CType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfo.set_stageMask(this.segment(), value); return this; }

    /// {@return `deviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceIndex(MemorySegment segment, long index) { return (int) VH_deviceIndex.get(segment, 0L, index); }
    /// {@return `deviceIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceIndex(MemorySegment segment) { return VkSemaphoreSubmitInfo.get_deviceIndex(segment, 0L); }
    /// {@return `deviceIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceIndexAt(long index) { return VkSemaphoreSubmitInfo.get_deviceIndex(this.segment(), index); }
    /// {@return `deviceIndex`}
    public @CType("uint32_t") int deviceIndex() { return VkSemaphoreSubmitInfo.get_deviceIndex(this.segment()); }
    /// Sets `deviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceIndex.set(segment, 0L, index, value); }
    /// Sets `deviceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceIndex(MemorySegment segment, @CType("uint32_t") int value) { VkSemaphoreSubmitInfo.set_deviceIndex(segment, 0L, value); }
    /// Sets `deviceIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo deviceIndexAt(long index, @CType("uint32_t") int value) { VkSemaphoreSubmitInfo.set_deviceIndex(this.segment(), index, value); return this; }
    /// Sets `deviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreSubmitInfo deviceIndex(@CType("uint32_t") int value) { VkSemaphoreSubmitInfo.set_deviceIndex(this.segment(), value); return this; }

}
