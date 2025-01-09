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
/// ### videoCodecOperations
/// [VarHandle][#VH_videoCodecOperations] - [Getter][#videoCodecOperations()] - [Setter][#videoCodecOperations(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyVideoPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoCodecOperationFlagsKHR videoCodecOperations;
/// } VkQueueFamilyVideoPropertiesKHR;
/// ```
public final class VkQueueFamilyVideoPropertiesKHR extends Struct {
    /// The struct layout of `VkQueueFamilyVideoPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `videoCodecOperations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoCodecOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoCodecOperations"));

    /// Creates `VkQueueFamilyVideoPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyVideoPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyVideoPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyVideoPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment); }

    /// Creates `VkQueueFamilyVideoPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyVideoPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyVideoPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyVideoPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyVideoPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkQueueFamilyVideoPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyVideoPropertiesKHR`
    public static VkQueueFamilyVideoPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyVideoPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyVideoPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyVideoPropertiesKHR`
    public static VkQueueFamilyVideoPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyVideoPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkQueueFamilyVideoPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyVideoPropertiesKHR`
    public VkQueueFamilyVideoPropertiesKHR asSlice(long index) { return new VkQueueFamilyVideoPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkQueueFamilyVideoPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyVideoPropertiesKHR`
    public VkQueueFamilyVideoPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyVideoPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueueFamilyVideoPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkQueueFamilyVideoPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueueFamilyVideoPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueueFamilyVideoPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkQueueFamilyVideoPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR sType(@CType("VkStructureType") int value) { VkQueueFamilyVideoPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueueFamilyVideoPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueueFamilyVideoPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkQueueFamilyVideoPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyVideoPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyVideoPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyVideoPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `videoCodecOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoCodecOperationFlagsKHR") int get_videoCodecOperations(MemorySegment segment, long index) { return (int) VH_videoCodecOperations.get(segment, 0L, index); }
    /// {@return `videoCodecOperations`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoCodecOperationFlagsKHR") int get_videoCodecOperations(MemorySegment segment) { return VkQueueFamilyVideoPropertiesKHR.get_videoCodecOperations(segment, 0L); }
    /// {@return `videoCodecOperations` at the given index}
    /// @param index the index
    public @CType("VkVideoCodecOperationFlagsKHR") int videoCodecOperationsAt(long index) { return VkQueueFamilyVideoPropertiesKHR.get_videoCodecOperations(this.segment(), index); }
    /// {@return `videoCodecOperations`}
    public @CType("VkVideoCodecOperationFlagsKHR") int videoCodecOperations() { return VkQueueFamilyVideoPropertiesKHR.get_videoCodecOperations(this.segment()); }
    /// Sets `videoCodecOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoCodecOperations(MemorySegment segment, long index, @CType("VkVideoCodecOperationFlagsKHR") int value) { VH_videoCodecOperations.set(segment, 0L, index, value); }
    /// Sets `videoCodecOperations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoCodecOperations(MemorySegment segment, @CType("VkVideoCodecOperationFlagsKHR") int value) { VkQueueFamilyVideoPropertiesKHR.set_videoCodecOperations(segment, 0L, value); }
    /// Sets `videoCodecOperations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR videoCodecOperationsAt(long index, @CType("VkVideoCodecOperationFlagsKHR") int value) { VkQueueFamilyVideoPropertiesKHR.set_videoCodecOperations(this.segment(), index, value); return this; }
    /// Sets `videoCodecOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyVideoPropertiesKHR videoCodecOperations(@CType("VkVideoCodecOperationFlagsKHR") int value) { VkQueueFamilyVideoPropertiesKHR.set_videoCodecOperations(this.segment(), value); return this; }

}
