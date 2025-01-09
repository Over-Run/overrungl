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
/// ### shaderTileImageCoherentReadAccelerated
/// [VarHandle][#VH_shaderTileImageCoherentReadAccelerated] - [Getter][#shaderTileImageCoherentReadAccelerated()] - [Setter][#shaderTileImageCoherentReadAccelerated(int)]
/// ### shaderTileImageReadSampleFromPixelRateInvocation
/// [VarHandle][#VH_shaderTileImageReadSampleFromPixelRateInvocation] - [Getter][#shaderTileImageReadSampleFromPixelRateInvocation()] - [Setter][#shaderTileImageReadSampleFromPixelRateInvocation(int)]
/// ### shaderTileImageReadFromHelperInvocation
/// [VarHandle][#VH_shaderTileImageReadFromHelperInvocation] - [Getter][#shaderTileImageReadFromHelperInvocation()] - [Setter][#shaderTileImageReadFromHelperInvocation(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderTileImageCoherentReadAccelerated;
///     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
///     VkBool32 shaderTileImageReadFromHelperInvocation;
/// } VkPhysicalDeviceShaderTileImagePropertiesEXT;
/// ```
public final class VkPhysicalDeviceShaderTileImagePropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageCoherentReadAccelerated"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadSampleFromPixelRateInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTileImageReadFromHelperInvocation")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderTileImageCoherentReadAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageCoherentReadAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageCoherentReadAccelerated"));
    /// The [VarHandle] of `shaderTileImageReadSampleFromPixelRateInvocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageReadSampleFromPixelRateInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadSampleFromPixelRateInvocation"));
    /// The [VarHandle] of `shaderTileImageReadFromHelperInvocation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageReadFromHelperInvocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageReadFromHelperInvocation"));

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderTileImagePropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderTileImagePropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderTileImagePropertiesEXT`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderTileImagePropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderTileImageCoherentReadAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageCoherentReadAccelerated(MemorySegment segment, long index) { return (int) VH_shaderTileImageCoherentReadAccelerated.get(segment, 0L, index); }
    /// {@return `shaderTileImageCoherentReadAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageCoherentReadAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageCoherentReadAccelerated(segment, 0L); }
    /// {@return `shaderTileImageCoherentReadAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageCoherentReadAcceleratedAt(long index) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageCoherentReadAccelerated(this.segment(), index); }
    /// {@return `shaderTileImageCoherentReadAccelerated`}
    public @CType("VkBool32") int shaderTileImageCoherentReadAccelerated() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageCoherentReadAccelerated(this.segment()); }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageCoherentReadAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageCoherentReadAccelerated.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageCoherentReadAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageCoherentReadAccelerated(segment, 0L, value); }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageCoherentReadAccelerated(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageCoherentReadAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageCoherentReadAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageCoherentReadAccelerated(this.segment(), value); return this; }

    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment, long index) { return (int) VH_shaderTileImageReadSampleFromPixelRateInvocation.get(segment, 0L, index); }
    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadSampleFromPixelRateInvocation(segment, 0L); }
    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageReadSampleFromPixelRateInvocationAt(long index) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), index); }
    /// {@return `shaderTileImageReadSampleFromPixelRateInvocation`}
    public @CType("VkBool32") int shaderTileImageReadSampleFromPixelRateInvocation() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadSampleFromPixelRateInvocation(this.segment()); }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageReadSampleFromPixelRateInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageReadSampleFromPixelRateInvocation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadSampleFromPixelRateInvocation(segment, 0L, value); }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageReadSampleFromPixelRateInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadSampleFromPixelRateInvocation(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadSampleFromPixelRateInvocation(this.segment(), value); return this; }

    /// {@return `shaderTileImageReadFromHelperInvocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageReadFromHelperInvocation(MemorySegment segment, long index) { return (int) VH_shaderTileImageReadFromHelperInvocation.get(segment, 0L, index); }
    /// {@return `shaderTileImageReadFromHelperInvocation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageReadFromHelperInvocation(MemorySegment segment) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadFromHelperInvocation(segment, 0L); }
    /// {@return `shaderTileImageReadFromHelperInvocation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageReadFromHelperInvocationAt(long index) { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadFromHelperInvocation(this.segment(), index); }
    /// {@return `shaderTileImageReadFromHelperInvocation`}
    public @CType("VkBool32") int shaderTileImageReadFromHelperInvocation() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.get_shaderTileImageReadFromHelperInvocation(this.segment()); }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageReadFromHelperInvocation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageReadFromHelperInvocation.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageReadFromHelperInvocation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadFromHelperInvocation(segment, 0L, value); }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadFromHelperInvocation(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageReadFromHelperInvocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImagePropertiesEXT shaderTileImageReadFromHelperInvocation(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.set_shaderTileImageReadFromHelperInvocation(this.segment(), value); return this; }

}
