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
package overrungl.vulkan.ext.struct;

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
/// ### minFragmentDensityTexelSize
/// [Byte offset][#OFFSET_minFragmentDensityTexelSize] - [Memory layout][#ML_minFragmentDensityTexelSize] - [Getter][#minFragmentDensityTexelSize()] - [Setter][#minFragmentDensityTexelSize(java.lang.foreign.MemorySegment)]
/// ### maxFragmentDensityTexelSize
/// [Byte offset][#OFFSET_maxFragmentDensityTexelSize] - [Memory layout][#ML_maxFragmentDensityTexelSize] - [Getter][#maxFragmentDensityTexelSize()] - [Setter][#maxFragmentDensityTexelSize(java.lang.foreign.MemorySegment)]
/// ### fragmentDensityInvocations
/// [VarHandle][#VH_fragmentDensityInvocations] - [Getter][#fragmentDensityInvocations()] - [Setter][#fragmentDensityInvocations(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D minFragmentDensityTexelSize;
///     VkExtent2D maxFragmentDensityTexelSize;
///     VkBool32 fragmentDensityInvocations;
/// } VkPhysicalDeviceFragmentDensityMapPropertiesEXT;
/// ```
public final class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `minFragmentDensityTexelSize`.
    public static final long OFFSET_minFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The memory layout of `minFragmentDensityTexelSize`.
    public static final MemoryLayout ML_minFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The byte offset of `maxFragmentDensityTexelSize`.
    public static final long OFFSET_maxFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The memory layout of `maxFragmentDensityTexelSize`.
    public static final MemoryLayout ML_maxFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The [VarHandle] of `fragmentDensityInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityInvocations"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `minFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), ML_minFragmentDensityTexelSize); }
    /// {@return `minFragmentDensityTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_minFragmentDensityTexelSize(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_minFragmentDensityTexelSize(segment, 0L); }
    /// {@return `minFragmentDensityTexelSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minFragmentDensityTexelSizeAt(long index) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_minFragmentDensityTexelSize(this.segment(), index); }
    /// {@return `minFragmentDensityTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment minFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_minFragmentDensityTexelSize(this.segment()); }
    /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minFragmentDensityTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), ML_minFragmentDensityTexelSize.byteSize()); }
    /// Sets `minFragmentDensityTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minFragmentDensityTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_minFragmentDensityTexelSize(segment, 0L, value); }
    /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_minFragmentDensityTexelSize(this.segment(), index, value); return this; }
    /// Sets `minFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_minFragmentDensityTexelSize(this.segment(), value); return this; }

    /// {@return `maxFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), ML_maxFragmentDensityTexelSize); }
    /// {@return `maxFragmentDensityTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxFragmentDensityTexelSize(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_maxFragmentDensityTexelSize(segment, 0L); }
    /// {@return `maxFragmentDensityTexelSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentDensityTexelSizeAt(long index) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_maxFragmentDensityTexelSize(this.segment(), index); }
    /// {@return `maxFragmentDensityTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxFragmentDensityTexelSize() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_maxFragmentDensityTexelSize(this.segment()); }
    /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentDensityTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), ML_maxFragmentDensityTexelSize.byteSize()); }
    /// Sets `maxFragmentDensityTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentDensityTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_maxFragmentDensityTexelSize(segment, 0L, value); }
    /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_maxFragmentDensityTexelSize(this.segment(), index, value); return this; }
    /// Sets `maxFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_maxFragmentDensityTexelSize(this.segment(), value); return this; }

    /// {@return `fragmentDensityInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityInvocations(MemorySegment segment, long index) { return (int) VH_fragmentDensityInvocations.get(segment, 0L, index); }
    /// {@return `fragmentDensityInvocations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityInvocations(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_fragmentDensityInvocations(segment, 0L); }
    /// {@return `fragmentDensityInvocations` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentDensityInvocationsAt(long index) { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_fragmentDensityInvocations(this.segment(), index); }
    /// {@return `fragmentDensityInvocations`}
    public @CType("VkBool32") int fragmentDensityInvocations() { return VkPhysicalDeviceFragmentDensityMapPropertiesEXT.get_fragmentDensityInvocations(this.segment()); }
    /// Sets `fragmentDensityInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityInvocations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityInvocations.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityInvocations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_fragmentDensityInvocations(segment, 0L, value); }
    /// Sets `fragmentDensityInvocations` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_fragmentDensityInvocations(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocations(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapPropertiesEXT.set_fragmentDensityInvocations(this.segment(), value); return this; }

}
