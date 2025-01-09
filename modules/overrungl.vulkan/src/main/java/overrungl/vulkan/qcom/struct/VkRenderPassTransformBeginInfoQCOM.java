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
package overrungl.vulkan.qcom.struct;

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
/// ### transform
/// [VarHandle][#VH_transform] - [Getter][#transform()] - [Setter][#transform(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderPassTransformBeginInfoQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkSurfaceTransformFlagBitsKHR transform;
/// } VkRenderPassTransformBeginInfoQCOM;
/// ```
public final class VkRenderPassTransformBeginInfoQCOM extends Struct {
    /// The struct layout of `VkRenderPassTransformBeginInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transform")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));

    /// Creates `VkRenderPassTransformBeginInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkRenderPassTransformBeginInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderPassTransformBeginInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassTransformBeginInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassTransformBeginInfoQCOM(segment); }

    /// Creates `VkRenderPassTransformBeginInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassTransformBeginInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassTransformBeginInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderPassTransformBeginInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassTransformBeginInfoQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderPassTransformBeginInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderPassTransformBeginInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassTransformBeginInfoQCOM`
    public static VkRenderPassTransformBeginInfoQCOM alloc(SegmentAllocator allocator) { return new VkRenderPassTransformBeginInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderPassTransformBeginInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassTransformBeginInfoQCOM`
    public static VkRenderPassTransformBeginInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassTransformBeginInfoQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderPassTransformBeginInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderPassTransformBeginInfoQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderPassTransformBeginInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderPassTransformBeginInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderPassTransformBeginInfoQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM sType(@CType("VkStructureType") int value) { VkRenderPassTransformBeginInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderPassTransformBeginInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderPassTransformBeginInfoQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkRenderPassTransformBeginInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkRenderPassTransformBeginInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkRenderPassTransformBeginInfoQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkRenderPassTransformBeginInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagBitsKHR") int get_transform(MemorySegment segment) { return VkRenderPassTransformBeginInfoQCOM.get_transform(segment, 0L); }
    /// {@return `transform` at the given index}
    /// @param index the index
    public @CType("VkSurfaceTransformFlagBitsKHR") int transformAt(long index) { return VkRenderPassTransformBeginInfoQCOM.get_transform(this.segment(), index); }
    /// {@return `transform`}
    public @CType("VkSurfaceTransformFlagBitsKHR") int transform() { return VkRenderPassTransformBeginInfoQCOM.get_transform(this.segment()); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform(MemorySegment segment, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkRenderPassTransformBeginInfoQCOM.set_transform(segment, 0L, value); }
    /// Sets `transform` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM transformAt(long index, @CType("VkSurfaceTransformFlagBitsKHR") int value) { VkRenderPassTransformBeginInfoQCOM.set_transform(this.segment(), index, value); return this; }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassTransformBeginInfoQCOM transform(@CType("VkSurfaceTransformFlagBitsKHR") int value) { VkRenderPassTransformBeginInfoQCOM.set_transform(this.segment(), value); return this; }

}
