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
package overrungl.vulkan.arm.struct;

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
/// ### renderPassStripeGranularity
/// [Byte offset][#OFFSET_renderPassStripeGranularity] - [Memory layout][#ML_renderPassStripeGranularity] - [Getter][#renderPassStripeGranularity()] - [Setter][#renderPassStripeGranularity(java.lang.foreign.MemorySegment)]
/// ### maxRenderPassStripes
/// [VarHandle][#VH_maxRenderPassStripes] - [Getter][#maxRenderPassStripes()] - [Setter][#maxRenderPassStripes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRenderPassStripedPropertiesARM {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D renderPassStripeGranularity;
///     uint32_t maxRenderPassStripes;
/// } VkPhysicalDeviceRenderPassStripedPropertiesARM;
/// ```
public final class VkPhysicalDeviceRenderPassStripedPropertiesARM extends Struct {
    /// The struct layout of `VkPhysicalDeviceRenderPassStripedPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("renderPassStripeGranularity"),
        ValueLayout.JAVA_INT.withName("maxRenderPassStripes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `renderPassStripeGranularity`.
    public static final long OFFSET_renderPassStripeGranularity = LAYOUT.byteOffset(PathElement.groupElement("renderPassStripeGranularity"));
    /// The memory layout of `renderPassStripeGranularity`.
    public static final MemoryLayout ML_renderPassStripeGranularity = LAYOUT.select(PathElement.groupElement("renderPassStripeGranularity"));
    /// The [VarHandle] of `maxRenderPassStripes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRenderPassStripes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRenderPassStripes"));

    /// Creates `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRenderPassStripedPropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment); }

    /// Creates `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRenderPassStripedPropertiesARM`
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRenderPassStripedPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRenderPassStripedPropertiesARM`
    public static VkPhysicalDeviceRenderPassStripedPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRenderPassStripedPropertiesARM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_pNext(this.segment(), value); return this; }

    /// {@return `renderPassStripeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_renderPassStripeGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderPassStripeGranularity, index), ML_renderPassStripeGranularity); }
    /// {@return `renderPassStripeGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_renderPassStripeGranularity(MemorySegment segment) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_renderPassStripeGranularity(segment, 0L); }
    /// {@return `renderPassStripeGranularity` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment renderPassStripeGranularityAt(long index) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_renderPassStripeGranularity(this.segment(), index); }
    /// {@return `renderPassStripeGranularity`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment renderPassStripeGranularity() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_renderPassStripeGranularity(this.segment()); }
    /// Sets `renderPassStripeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPassStripeGranularity(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderPassStripeGranularity, index), ML_renderPassStripeGranularity.byteSize()); }
    /// Sets `renderPassStripeGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPassStripeGranularity(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_renderPassStripeGranularity(segment, 0L, value); }
    /// Sets `renderPassStripeGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularityAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_renderPassStripeGranularity(this.segment(), index, value); return this; }
    /// Sets `renderPassStripeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM renderPassStripeGranularity(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_renderPassStripeGranularity(this.segment(), value); return this; }

    /// {@return `maxRenderPassStripes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRenderPassStripes(MemorySegment segment, long index) { return (int) VH_maxRenderPassStripes.get(segment, 0L, index); }
    /// {@return `maxRenderPassStripes`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRenderPassStripes(MemorySegment segment) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_maxRenderPassStripes(segment, 0L); }
    /// {@return `maxRenderPassStripes` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxRenderPassStripesAt(long index) { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_maxRenderPassStripes(this.segment(), index); }
    /// {@return `maxRenderPassStripes`}
    public @CType("uint32_t") int maxRenderPassStripes() { return VkPhysicalDeviceRenderPassStripedPropertiesARM.get_maxRenderPassStripes(this.segment()); }
    /// Sets `maxRenderPassStripes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRenderPassStripes(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRenderPassStripes.set(segment, 0L, index, value); }
    /// Sets `maxRenderPassStripes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRenderPassStripes(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_maxRenderPassStripes(segment, 0L, value); }
    /// Sets `maxRenderPassStripes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM maxRenderPassStripesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_maxRenderPassStripes(this.segment(), index, value); return this; }
    /// Sets `maxRenderPassStripes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedPropertiesARM maxRenderPassStripes(@CType("uint32_t") int value) { VkPhysicalDeviceRenderPassStripedPropertiesARM.set_maxRenderPassStripes(this.segment(), value); return this; }

}
