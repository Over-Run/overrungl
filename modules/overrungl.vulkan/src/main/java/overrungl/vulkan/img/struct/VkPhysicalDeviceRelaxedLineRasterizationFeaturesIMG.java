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
package overrungl.vulkan.img.struct;

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
/// ### relaxedLineRasterization
/// [VarHandle][#VH_relaxedLineRasterization] - [Getter][#relaxedLineRasterization()] - [Setter][#relaxedLineRasterization(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 relaxedLineRasterization;
/// } VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG;
/// ```
public final class VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG extends Struct {
    /// The struct layout of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("relaxedLineRasterization")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `relaxedLineRasterization` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_relaxedLineRasterization = LAYOUT.arrayElementVarHandle(PathElement.groupElement("relaxedLineRasterization"));

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG asSlice(long index) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG asSlice(long index, long count) { return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_pNext(this.segment(), value); return this; }

    /// {@return `relaxedLineRasterization` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_relaxedLineRasterization(MemorySegment segment, long index) { return (int) VH_relaxedLineRasterization.get(segment, 0L, index); }
    /// {@return `relaxedLineRasterization`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_relaxedLineRasterization(MemorySegment segment) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_relaxedLineRasterization(segment, 0L); }
    /// {@return `relaxedLineRasterization` at the given index}
    /// @param index the index
    public @CType("VkBool32") int relaxedLineRasterizationAt(long index) { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_relaxedLineRasterization(this.segment(), index); }
    /// {@return `relaxedLineRasterization`}
    public @CType("VkBool32") int relaxedLineRasterization() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.get_relaxedLineRasterization(this.segment()); }
    /// Sets `relaxedLineRasterization` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_relaxedLineRasterization(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_relaxedLineRasterization.set(segment, 0L, index, value); }
    /// Sets `relaxedLineRasterization` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_relaxedLineRasterization(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_relaxedLineRasterization(segment, 0L, value); }
    /// Sets `relaxedLineRasterization` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterizationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_relaxedLineRasterization(this.segment(), index, value); return this; }
    /// Sets `relaxedLineRasterization` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterization(@CType("VkBool32") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.set_relaxedLineRasterization(this.segment(), value); return this; }

}
