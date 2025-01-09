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
/// ### reportAddressBinding
/// [VarHandle][#VH_reportAddressBinding] - [Getter][#reportAddressBinding()] - [Setter][#reportAddressBinding(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceAddressBindingReportFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 reportAddressBinding;
/// } VkPhysicalDeviceAddressBindingReportFeaturesEXT;
/// ```
public final class VkPhysicalDeviceAddressBindingReportFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceAddressBindingReportFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reportAddressBinding")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `reportAddressBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_reportAddressBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reportAddressBinding"));

    /// Creates `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAddressBindingReportFeaturesEXT`
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAddressBindingReportFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAddressBindingReportFeaturesEXT`
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceAddressBindingReportFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceAddressBindingReportFeaturesEXT`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceAddressBindingReportFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceAddressBindingReportFeaturesEXT`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `reportAddressBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_reportAddressBinding(MemorySegment segment, long index) { return (int) VH_reportAddressBinding.get(segment, 0L, index); }
    /// {@return `reportAddressBinding`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_reportAddressBinding(MemorySegment segment) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_reportAddressBinding(segment, 0L); }
    /// {@return `reportAddressBinding` at the given index}
    /// @param index the index
    public @CType("VkBool32") int reportAddressBindingAt(long index) { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_reportAddressBinding(this.segment(), index); }
    /// {@return `reportAddressBinding`}
    public @CType("VkBool32") int reportAddressBinding() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.get_reportAddressBinding(this.segment()); }
    /// Sets `reportAddressBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_reportAddressBinding(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_reportAddressBinding.set(segment, 0L, index, value); }
    /// Sets `reportAddressBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_reportAddressBinding(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_reportAddressBinding(segment, 0L, value); }
    /// Sets `reportAddressBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reportAddressBindingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_reportAddressBinding(this.segment(), index, value); return this; }
    /// Sets `reportAddressBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reportAddressBinding(@CType("VkBool32") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.set_reportAddressBinding(this.segment(), value); return this; }

}
