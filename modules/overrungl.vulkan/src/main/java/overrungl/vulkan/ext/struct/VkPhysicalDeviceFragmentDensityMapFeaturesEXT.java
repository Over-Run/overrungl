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
/// ### fragmentDensityMap
/// [VarHandle][#VH_fragmentDensityMap] - [Getter][#fragmentDensityMap()] - [Setter][#fragmentDensityMap(int)]
/// ### fragmentDensityMapDynamic
/// [VarHandle][#VH_fragmentDensityMapDynamic] - [Getter][#fragmentDensityMapDynamic()] - [Setter][#fragmentDensityMapDynamic(int)]
/// ### fragmentDensityMapNonSubsampledImages
/// [VarHandle][#VH_fragmentDensityMapNonSubsampledImages] - [Getter][#fragmentDensityMapNonSubsampledImages()] - [Setter][#fragmentDensityMapNonSubsampledImages(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 fragmentDensityMap;
///     VkBool32 fragmentDensityMapDynamic;
///     VkBool32 fragmentDensityMapNonSubsampledImages;
/// } VkPhysicalDeviceFragmentDensityMapFeaturesEXT;
/// ```
public final class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentDensityMap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMap"));
    /// The [VarHandle] of `fragmentDensityMapDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityMapDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The [VarHandle] of `fragmentDensityMapNonSubsampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityMapNonSubsampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityMap(MemorySegment segment, long index) { return (int) VH_fragmentDensityMap.get(segment, 0L, index); }
    /// {@return `fragmentDensityMap`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityMap(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMap(segment, 0L); }
    /// {@return `fragmentDensityMap` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentDensityMapAt(long index) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMap(this.segment(), index); }
    /// {@return `fragmentDensityMap`}
    public @CType("VkBool32") int fragmentDensityMap() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMap(this.segment()); }
    /// Sets `fragmentDensityMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMap(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityMap.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMap(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMap(segment, 0L, value); }
    /// Sets `fragmentDensityMap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMap(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMap(this.segment(), value); return this; }

    /// {@return `fragmentDensityMapDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityMapDynamic(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapDynamic.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapDynamic`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityMapDynamic(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapDynamic(segment, 0L); }
    /// {@return `fragmentDensityMapDynamic` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentDensityMapDynamicAt(long index) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapDynamic(this.segment(), index); }
    /// {@return `fragmentDensityMapDynamic`}
    public @CType("VkBool32") int fragmentDensityMapDynamic() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapDynamic(this.segment()); }
    /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMapDynamic(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityMapDynamic.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMapDynamic(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapDynamic(segment, 0L, value); }
    /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamicAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapDynamic(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityMapDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapDynamic(this.segment(), value); return this; }

    /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapNonSubsampledImages.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapNonSubsampledImages`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityMapNonSubsampledImages(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapNonSubsampledImages(segment, 0L); }
    /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentDensityMapNonSubsampledImagesAt(long index) { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapNonSubsampledImages(this.segment(), index); }
    /// {@return `fragmentDensityMapNonSubsampledImages`}
    public @CType("VkBool32") int fragmentDensityMapNonSubsampledImages() { return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.get_fragmentDensityMapNonSubsampledImages(this.segment()); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityMapNonSubsampledImages.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMapNonSubsampledImages(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapNonSubsampledImages(segment, 0L, value); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImagesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapNonSubsampledImages(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMapFeaturesEXT.set_fragmentDensityMapNonSubsampledImages(this.segment(), value); return this; }

}
