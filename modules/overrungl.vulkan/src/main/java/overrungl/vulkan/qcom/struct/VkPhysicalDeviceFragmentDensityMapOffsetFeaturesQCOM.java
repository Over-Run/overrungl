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
/// ### fragmentDensityMapOffset
/// [VarHandle][#VH_fragmentDensityMapOffset] - [Getter][#fragmentDensityMapOffset()] - [Setter][#fragmentDensityMapOffset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 fragmentDensityMapOffset;
/// } VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM;
/// ```
public final class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentDensityMapOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityMapOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapOffset"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM`
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM`
    public static VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityMapOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityMapOffset(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapOffset.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityMapOffset(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_fragmentDensityMapOffset(segment, 0L); }
    /// {@return `fragmentDensityMapOffset` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentDensityMapOffsetAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_fragmentDensityMapOffset(this.segment(), index); }
    /// {@return `fragmentDensityMapOffset`}
    public @CType("VkBool32") int fragmentDensityMapOffset() { return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.get_fragmentDensityMapOffset(this.segment()); }
    /// Sets `fragmentDensityMapOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMapOffset(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityMapOffset.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMapOffset(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_fragmentDensityMapOffset(segment, 0L, value); }
    /// Sets `fragmentDensityMapOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffsetAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_fragmentDensityMapOffset(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityMapOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM fragmentDensityMapOffset(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.set_fragmentDensityMapOffset(this.segment(), value); return this; }

}
