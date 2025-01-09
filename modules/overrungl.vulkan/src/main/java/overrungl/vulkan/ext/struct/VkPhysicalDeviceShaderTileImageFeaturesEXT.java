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
/// ### shaderTileImageColorReadAccess
/// [VarHandle][#VH_shaderTileImageColorReadAccess] - [Getter][#shaderTileImageColorReadAccess()] - [Setter][#shaderTileImageColorReadAccess(int)]
/// ### shaderTileImageDepthReadAccess
/// [VarHandle][#VH_shaderTileImageDepthReadAccess] - [Getter][#shaderTileImageDepthReadAccess()] - [Setter][#shaderTileImageDepthReadAccess(int)]
/// ### shaderTileImageStencilReadAccess
/// [VarHandle][#VH_shaderTileImageStencilReadAccess] - [Getter][#shaderTileImageStencilReadAccess()] - [Setter][#shaderTileImageStencilReadAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderTileImageColorReadAccess;
///     VkBool32 shaderTileImageDepthReadAccess;
///     VkBool32 shaderTileImageStencilReadAccess;
/// } VkPhysicalDeviceShaderTileImageFeaturesEXT;
/// ```
public final class VkPhysicalDeviceShaderTileImageFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderTileImageFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderTileImageColorReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageDepthReadAccess"),
        ValueLayout.JAVA_INT.withName("shaderTileImageStencilReadAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderTileImageColorReadAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageColorReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageColorReadAccess"));
    /// The [VarHandle] of `shaderTileImageDepthReadAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageDepthReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageDepthReadAccess"));
    /// The [VarHandle] of `shaderTileImageStencilReadAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderTileImageStencilReadAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTileImageStencilReadAccess"));

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderTileImageFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderTileImageFeaturesEXT`
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderTileImageFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderTileImageColorReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageColorReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageColorReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageColorReadAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageColorReadAccess(MemorySegment segment) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageColorReadAccess(segment, 0L); }
    /// {@return `shaderTileImageColorReadAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageColorReadAccessAt(long index) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageColorReadAccess(this.segment(), index); }
    /// {@return `shaderTileImageColorReadAccess`}
    public @CType("VkBool32") int shaderTileImageColorReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageColorReadAccess(this.segment()); }
    /// Sets `shaderTileImageColorReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageColorReadAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageColorReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageColorReadAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageColorReadAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageColorReadAccess(segment, 0L, value); }
    /// Sets `shaderTileImageColorReadAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageColorReadAccess(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageColorReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageColorReadAccess(this.segment(), value); return this; }

    /// {@return `shaderTileImageDepthReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageDepthReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageDepthReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageDepthReadAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageDepthReadAccess(MemorySegment segment) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageDepthReadAccess(segment, 0L); }
    /// {@return `shaderTileImageDepthReadAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageDepthReadAccessAt(long index) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageDepthReadAccess(this.segment(), index); }
    /// {@return `shaderTileImageDepthReadAccess`}
    public @CType("VkBool32") int shaderTileImageDepthReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageDepthReadAccess(this.segment()); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageDepthReadAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageDepthReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageDepthReadAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageDepthReadAccess(segment, 0L, value); }
    /// Sets `shaderTileImageDepthReadAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageDepthReadAccess(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageDepthReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageDepthReadAccess(this.segment(), value); return this; }

    /// {@return `shaderTileImageStencilReadAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderTileImageStencilReadAccess(MemorySegment segment, long index) { return (int) VH_shaderTileImageStencilReadAccess.get(segment, 0L, index); }
    /// {@return `shaderTileImageStencilReadAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderTileImageStencilReadAccess(MemorySegment segment) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageStencilReadAccess(segment, 0L); }
    /// {@return `shaderTileImageStencilReadAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderTileImageStencilReadAccessAt(long index) { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageStencilReadAccess(this.segment(), index); }
    /// {@return `shaderTileImageStencilReadAccess`}
    public @CType("VkBool32") int shaderTileImageStencilReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.get_shaderTileImageStencilReadAccess(this.segment()); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderTileImageStencilReadAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderTileImageStencilReadAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderTileImageStencilReadAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageStencilReadAccess(segment, 0L, value); }
    /// Sets `shaderTileImageStencilReadAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageStencilReadAccess(this.segment(), index, value); return this; }
    /// Sets `shaderTileImageStencilReadAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(@CType("VkBool32") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.set_shaderTileImageStencilReadAccess(this.segment(), value); return this; }

}
