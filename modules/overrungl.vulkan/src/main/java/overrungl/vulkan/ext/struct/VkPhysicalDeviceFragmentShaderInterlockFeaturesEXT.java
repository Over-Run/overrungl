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
/// ### fragmentShaderSampleInterlock
/// [VarHandle][#VH_fragmentShaderSampleInterlock] - [Getter][#fragmentShaderSampleInterlock()] - [Setter][#fragmentShaderSampleInterlock(int)]
/// ### fragmentShaderPixelInterlock
/// [VarHandle][#VH_fragmentShaderPixelInterlock] - [Getter][#fragmentShaderPixelInterlock()] - [Setter][#fragmentShaderPixelInterlock(int)]
/// ### fragmentShaderShadingRateInterlock
/// [VarHandle][#VH_fragmentShaderShadingRateInterlock] - [Getter][#fragmentShaderShadingRateInterlock()] - [Setter][#fragmentShaderShadingRateInterlock(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 fragmentShaderSampleInterlock;
///     VkBool32 fragmentShaderPixelInterlock;
///     VkBool32 fragmentShaderShadingRateInterlock;
/// } VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT;
/// ```
public final class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentShaderSampleInterlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShaderSampleInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderSampleInterlock"));
    /// The [VarHandle] of `fragmentShaderPixelInterlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShaderPixelInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderPixelInterlock"));
    /// The [VarHandle] of `fragmentShaderShadingRateInterlock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShaderShadingRateInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderShadingRateInterlock"));

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentShaderSampleInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShaderSampleInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderSampleInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderSampleInterlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShaderSampleInterlock(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderSampleInterlock(segment, 0L); }
    /// {@return `fragmentShaderSampleInterlock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentShaderSampleInterlockAt(long index) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderSampleInterlock(this.segment(), index); }
    /// {@return `fragmentShaderSampleInterlock`}
    public @CType("VkBool32") int fragmentShaderSampleInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderSampleInterlock(this.segment()); }
    /// Sets `fragmentShaderSampleInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShaderSampleInterlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShaderSampleInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderSampleInterlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShaderSampleInterlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderSampleInterlock(segment, 0L, value); }
    /// Sets `fragmentShaderSampleInterlock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderSampleInterlock(this.segment(), index, value); return this; }
    /// Sets `fragmentShaderSampleInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderSampleInterlock(this.segment(), value); return this; }

    /// {@return `fragmentShaderPixelInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShaderPixelInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderPixelInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderPixelInterlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShaderPixelInterlock(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderPixelInterlock(segment, 0L); }
    /// {@return `fragmentShaderPixelInterlock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentShaderPixelInterlockAt(long index) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderPixelInterlock(this.segment(), index); }
    /// {@return `fragmentShaderPixelInterlock`}
    public @CType("VkBool32") int fragmentShaderPixelInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderPixelInterlock(this.segment()); }
    /// Sets `fragmentShaderPixelInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShaderPixelInterlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShaderPixelInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderPixelInterlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShaderPixelInterlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderPixelInterlock(segment, 0L, value); }
    /// Sets `fragmentShaderPixelInterlock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderPixelInterlock(this.segment(), index, value); return this; }
    /// Sets `fragmentShaderPixelInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderPixelInterlock(this.segment(), value); return this; }

    /// {@return `fragmentShaderShadingRateInterlock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShaderShadingRateInterlock(MemorySegment segment, long index) { return (int) VH_fragmentShaderShadingRateInterlock.get(segment, 0L, index); }
    /// {@return `fragmentShaderShadingRateInterlock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShaderShadingRateInterlock(MemorySegment segment) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderShadingRateInterlock(segment, 0L); }
    /// {@return `fragmentShaderShadingRateInterlock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentShaderShadingRateInterlockAt(long index) { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderShadingRateInterlock(this.segment(), index); }
    /// {@return `fragmentShaderShadingRateInterlock`}
    public @CType("VkBool32") int fragmentShaderShadingRateInterlock() { return VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.get_fragmentShaderShadingRateInterlock(this.segment()); }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShaderShadingRateInterlock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShaderShadingRateInterlock.set(segment, 0L, index, value); }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShaderShadingRateInterlock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderShadingRateInterlock(segment, 0L, value); }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderShadingRateInterlock(this.segment(), index, value); return this; }
    /// Sets `fragmentShaderShadingRateInterlock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT.set_fragmentShaderShadingRateInterlock(this.segment(), value); return this; }

}
