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
/// ### pipelineFragmentShadingRate
/// [VarHandle][#VH_pipelineFragmentShadingRate] - [Getter][#pipelineFragmentShadingRate()] - [Setter][#pipelineFragmentShadingRate(int)]
/// ### primitiveFragmentShadingRate
/// [VarHandle][#VH_primitiveFragmentShadingRate] - [Getter][#primitiveFragmentShadingRate()] - [Setter][#primitiveFragmentShadingRate(int)]
/// ### attachmentFragmentShadingRate
/// [VarHandle][#VH_attachmentFragmentShadingRate] - [Getter][#attachmentFragmentShadingRate()] - [Setter][#attachmentFragmentShadingRate(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 pipelineFragmentShadingRate;
///     VkBool32 primitiveFragmentShadingRate;
///     VkBool32 attachmentFragmentShadingRate;
/// } VkPhysicalDeviceFragmentShadingRateFeaturesKHR;
/// ```
public final class VkPhysicalDeviceFragmentShadingRateFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRate"),
        ValueLayout.JAVA_INT.withName("attachmentFragmentShadingRate")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineFragmentShadingRate"));
    /// The [VarHandle] of `primitiveFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRate"));
    /// The [VarHandle] of `attachmentFragmentShadingRate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentFragmentShadingRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFragmentShadingRate"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateFeaturesKHR`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_pipelineFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `pipelineFragmentShadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineFragmentShadingRate(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pipelineFragmentShadingRate(segment, 0L); }
    /// {@return `pipelineFragmentShadingRate` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineFragmentShadingRateAt(long index) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pipelineFragmentShadingRate(this.segment(), index); }
    /// {@return `pipelineFragmentShadingRate`}
    public @CType("VkBool32") int pipelineFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_pipelineFragmentShadingRate(this.segment()); }
    /// Sets `pipelineFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineFragmentShadingRate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `pipelineFragmentShadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineFragmentShadingRate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pipelineFragmentShadingRate(segment, 0L, value); }
    /// Sets `pipelineFragmentShadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pipelineFragmentShadingRate(this.segment(), index, value); return this; }
    /// Sets `pipelineFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_pipelineFragmentShadingRate(this.segment(), value); return this; }

    /// {@return `primitiveFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_primitiveFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `primitiveFragmentShadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveFragmentShadingRate(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_primitiveFragmentShadingRate(segment, 0L); }
    /// {@return `primitiveFragmentShadingRate` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primitiveFragmentShadingRateAt(long index) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_primitiveFragmentShadingRate(this.segment(), index); }
    /// {@return `primitiveFragmentShadingRate`}
    public @CType("VkBool32") int primitiveFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_primitiveFragmentShadingRate(this.segment()); }
    /// Sets `primitiveFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveFragmentShadingRate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `primitiveFragmentShadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveFragmentShadingRate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_primitiveFragmentShadingRate(segment, 0L, value); }
    /// Sets `primitiveFragmentShadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_primitiveFragmentShadingRate(this.segment(), index, value); return this; }
    /// Sets `primitiveFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_primitiveFragmentShadingRate(this.segment(), value); return this; }

    /// {@return `attachmentFragmentShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_attachmentFragmentShadingRate(MemorySegment segment, long index) { return (int) VH_attachmentFragmentShadingRate.get(segment, 0L, index); }
    /// {@return `attachmentFragmentShadingRate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_attachmentFragmentShadingRate(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_attachmentFragmentShadingRate(segment, 0L); }
    /// {@return `attachmentFragmentShadingRate` at the given index}
    /// @param index the index
    public @CType("VkBool32") int attachmentFragmentShadingRateAt(long index) { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_attachmentFragmentShadingRate(this.segment(), index); }
    /// {@return `attachmentFragmentShadingRate`}
    public @CType("VkBool32") int attachmentFragmentShadingRate() { return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.get_attachmentFragmentShadingRate(this.segment()); }
    /// Sets `attachmentFragmentShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentFragmentShadingRate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_attachmentFragmentShadingRate.set(segment, 0L, index, value); }
    /// Sets `attachmentFragmentShadingRate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentFragmentShadingRate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_attachmentFragmentShadingRate(segment, 0L, value); }
    /// Sets `attachmentFragmentShadingRate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_attachmentFragmentShadingRate(this.segment(), index, value); return this; }
    /// Sets `attachmentFragmentShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateFeaturesKHR.set_attachmentFragmentShadingRate(this.segment(), value); return this; }

}
