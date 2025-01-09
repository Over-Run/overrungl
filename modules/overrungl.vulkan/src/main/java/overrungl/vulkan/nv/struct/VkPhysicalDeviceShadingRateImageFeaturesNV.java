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
package overrungl.vulkan.nv.struct;

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
/// ### shadingRateImage
/// [VarHandle][#VH_shadingRateImage] - [Getter][#shadingRateImage()] - [Setter][#shadingRateImage(int)]
/// ### shadingRateCoarseSampleOrder
/// [VarHandle][#VH_shadingRateCoarseSampleOrder] - [Getter][#shadingRateCoarseSampleOrder()] - [Setter][#shadingRateCoarseSampleOrder(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShadingRateImageFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shadingRateImage;
///     VkBool32 shadingRateCoarseSampleOrder;
/// } VkPhysicalDeviceShadingRateImageFeaturesNV;
/// ```
public final class VkPhysicalDeviceShadingRateImageFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shadingRateImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImage"));
    /// The [VarHandle] of `shadingRateCoarseSampleOrder` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateCoarseSampleOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateCoarseSampleOrder"));

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shadingRateImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shadingRateImage(MemorySegment segment, long index) { return (int) VH_shadingRateImage.get(segment, 0L, index); }
    /// {@return `shadingRateImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shadingRateImage(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(segment, 0L); }
    /// {@return `shadingRateImage` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shadingRateImageAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(this.segment(), index); }
    /// {@return `shadingRateImage`}
    public @CType("VkBool32") int shadingRateImage() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(this.segment()); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shadingRateImage.set(segment, 0L, index, value); }
    /// Sets `shadingRateImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(segment, 0L, value); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(this.segment(), index, value); return this; }
    /// Sets `shadingRateImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(@CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(this.segment(), value); return this; }

    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shadingRateCoarseSampleOrder(MemorySegment segment, long index) { return (int) VH_shadingRateCoarseSampleOrder.get(segment, 0L, index); }
    /// {@return `shadingRateCoarseSampleOrder`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shadingRateCoarseSampleOrder(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(segment, 0L); }
    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shadingRateCoarseSampleOrderAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(this.segment(), index); }
    /// {@return `shadingRateCoarseSampleOrder`}
    public @CType("VkBool32") int shadingRateCoarseSampleOrder() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(this.segment()); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateCoarseSampleOrder(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shadingRateCoarseSampleOrder.set(segment, 0L, index, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateCoarseSampleOrder(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(segment, 0L, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(this.segment(), index, value); return this; }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(@CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(this.segment(), value); return this; }

}
