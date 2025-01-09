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
/// ### srcRect
/// [Byte offset][#OFFSET_srcRect] - [Memory layout][#ML_srcRect] - [Getter][#srcRect()] - [Setter][#srcRect(java.lang.foreign.MemorySegment)]
/// ### dstRect
/// [Byte offset][#OFFSET_dstRect] - [Memory layout][#ML_dstRect] - [Getter][#dstRect()] - [Setter][#dstRect(java.lang.foreign.MemorySegment)]
/// ### persistent
/// [VarHandle][#VH_persistent] - [Getter][#persistent()] - [Setter][#persistent(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPresentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkRect2D srcRect;
///     VkRect2D dstRect;
///     VkBool32 persistent;
/// } VkDisplayPresentInfoKHR;
/// ```
public final class VkDisplayPresentInfoKHR extends Struct {
    /// The struct layout of `VkDisplayPresentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("srcRect"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("dstRect"),
        ValueLayout.JAVA_INT.withName("persistent")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `srcRect`.
    public static final long OFFSET_srcRect = LAYOUT.byteOffset(PathElement.groupElement("srcRect"));
    /// The memory layout of `srcRect`.
    public static final MemoryLayout ML_srcRect = LAYOUT.select(PathElement.groupElement("srcRect"));
    /// The byte offset of `dstRect`.
    public static final long OFFSET_dstRect = LAYOUT.byteOffset(PathElement.groupElement("dstRect"));
    /// The memory layout of `dstRect`.
    public static final MemoryLayout ML_dstRect = LAYOUT.select(PathElement.groupElement("dstRect"));
    /// The [VarHandle] of `persistent` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_persistent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistent"));

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPresentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPresentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPresentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPresentInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplayPresentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPresentInfoKHR`
    public static VkDisplayPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPresentInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDisplayPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPresentInfoKHR`
    public VkDisplayPresentInfoKHR asSlice(long index) { return new VkDisplayPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDisplayPresentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPresentInfoKHR`
    public VkDisplayPresentInfoKHR asSlice(long index, long count) { return new VkDisplayPresentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayPresentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayPresentInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayPresentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayPresentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayPresentInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR sType(@CType("VkStructureType") int value) { VkDisplayPresentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplayPresentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplayPresentInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDisplayPresentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `srcRect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_srcRect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcRect, index), ML_srcRect); }
    /// {@return `srcRect`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_srcRect(MemorySegment segment) { return VkDisplayPresentInfoKHR.get_srcRect(segment, 0L); }
    /// {@return `srcRect` at the given index}
    /// @param index the index
    public @CType("VkRect2D") java.lang.foreign.MemorySegment srcRectAt(long index) { return VkDisplayPresentInfoKHR.get_srcRect(this.segment(), index); }
    /// {@return `srcRect`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment srcRect() { return VkDisplayPresentInfoKHR.get_srcRect(this.segment()); }
    /// Sets `srcRect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcRect(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcRect, index), ML_srcRect.byteSize()); }
    /// Sets `srcRect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcRect(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_srcRect(segment, 0L, value); }
    /// Sets `srcRect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR srcRectAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_srcRect(this.segment(), index, value); return this; }
    /// Sets `srcRect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR srcRect(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_srcRect(this.segment(), value); return this; }

    /// {@return `dstRect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_dstRect(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstRect, index), ML_dstRect); }
    /// {@return `dstRect`}
    /// @param segment the segment of the struct
    public static @CType("VkRect2D") java.lang.foreign.MemorySegment get_dstRect(MemorySegment segment) { return VkDisplayPresentInfoKHR.get_dstRect(segment, 0L); }
    /// {@return `dstRect` at the given index}
    /// @param index the index
    public @CType("VkRect2D") java.lang.foreign.MemorySegment dstRectAt(long index) { return VkDisplayPresentInfoKHR.get_dstRect(this.segment(), index); }
    /// {@return `dstRect`}
    public @CType("VkRect2D") java.lang.foreign.MemorySegment dstRect() { return VkDisplayPresentInfoKHR.get_dstRect(this.segment()); }
    /// Sets `dstRect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstRect(MemorySegment segment, long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstRect, index), ML_dstRect.byteSize()); }
    /// Sets `dstRect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstRect(MemorySegment segment, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_dstRect(segment, 0L, value); }
    /// Sets `dstRect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR dstRectAt(long index, @CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_dstRect(this.segment(), index, value); return this; }
    /// Sets `dstRect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR dstRect(@CType("VkRect2D") java.lang.foreign.MemorySegment value) { VkDisplayPresentInfoKHR.set_dstRect(this.segment(), value); return this; }

    /// {@return `persistent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_persistent(MemorySegment segment, long index) { return (int) VH_persistent.get(segment, 0L, index); }
    /// {@return `persistent`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_persistent(MemorySegment segment) { return VkDisplayPresentInfoKHR.get_persistent(segment, 0L); }
    /// {@return `persistent` at the given index}
    /// @param index the index
    public @CType("VkBool32") int persistentAt(long index) { return VkDisplayPresentInfoKHR.get_persistent(this.segment(), index); }
    /// {@return `persistent`}
    public @CType("VkBool32") int persistent() { return VkDisplayPresentInfoKHR.get_persistent(this.segment()); }
    /// Sets `persistent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_persistent(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_persistent.set(segment, 0L, index, value); }
    /// Sets `persistent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_persistent(MemorySegment segment, @CType("VkBool32") int value) { VkDisplayPresentInfoKHR.set_persistent(segment, 0L, value); }
    /// Sets `persistent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR persistentAt(long index, @CType("VkBool32") int value) { VkDisplayPresentInfoKHR.set_persistent(this.segment(), index, value); return this; }
    /// Sets `persistent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPresentInfoKHR persistent(@CType("VkBool32") int value) { VkDisplayPresentInfoKHR.set_persistent(this.segment(), value); return this; }

}
