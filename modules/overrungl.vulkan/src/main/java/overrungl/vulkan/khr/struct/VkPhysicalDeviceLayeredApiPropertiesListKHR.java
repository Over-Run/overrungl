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
/// ### layeredApiCount
/// [VarHandle][#VH_layeredApiCount] - [Getter][#layeredApiCount()] - [Setter][#layeredApiCount(int)]
/// ### pLayeredApis
/// [VarHandle][#VH_pLayeredApis] - [Getter][#pLayeredApis()] - [Setter][#pLayeredApis(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t layeredApiCount;
///     VkPhysicalDeviceLayeredApiPropertiesKHR * pLayeredApis;
/// } VkPhysicalDeviceLayeredApiPropertiesListKHR;
/// ```
public final class VkPhysicalDeviceLayeredApiPropertiesListKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withName("pLayeredApis")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `layeredApiCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layeredApiCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredApiCount"));
    /// The [VarHandle] of `pLayeredApis` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLayeredApis = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayeredApis"));

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `layeredApiCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layeredApiCount(MemorySegment segment, long index) { return (int) VH_layeredApiCount.get(segment, 0L, index); }
    /// {@return `layeredApiCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layeredApiCount(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_layeredApiCount(segment, 0L); }
    /// {@return `layeredApiCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layeredApiCountAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_layeredApiCount(this.segment(), index); }
    /// {@return `layeredApiCount`}
    public @CType("uint32_t") int layeredApiCount() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_layeredApiCount(this.segment()); }
    /// Sets `layeredApiCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layeredApiCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layeredApiCount.set(segment, 0L, index, value); }
    /// Sets `layeredApiCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layeredApiCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_layeredApiCount(segment, 0L, value); }
    /// Sets `layeredApiCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_layeredApiCount(this.segment(), index, value); return this; }
    /// Sets `layeredApiCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(@CType("uint32_t") int value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_layeredApiCount(this.segment(), value); return this; }

    /// {@return `pLayeredApis` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment get_pLayeredApis(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLayeredApis.get(segment, 0L, index); }
    /// {@return `pLayeredApis`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment get_pLayeredApis(MemorySegment segment) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pLayeredApis(segment, 0L); }
    /// {@return `pLayeredApis` at the given index}
    /// @param index the index
    public @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment pLayeredApisAt(long index) { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pLayeredApis(this.segment(), index); }
    /// {@return `pLayeredApis`}
    public @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment pLayeredApis() { return VkPhysicalDeviceLayeredApiPropertiesListKHR.get_pLayeredApis(this.segment()); }
    /// Sets `pLayeredApis` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLayeredApis(MemorySegment segment, long index, @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment value) { VH_pLayeredApis.set(segment, 0L, index, value); }
    /// Sets `pLayeredApis` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLayeredApis(MemorySegment segment, @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pLayeredApis(segment, 0L, value); }
    /// Sets `pLayeredApis` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApisAt(long index, @CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pLayeredApis(this.segment(), index, value); return this; }
    /// Sets `pLayeredApis` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(@CType("VkPhysicalDeviceLayeredApiPropertiesKHR *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLayeredApiPropertiesListKHR.set_pLayeredApis(this.segment(), value); return this; }

}
