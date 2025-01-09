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
/// ### rasterizationOrderColorAttachmentAccess
/// [VarHandle][#VH_rasterizationOrderColorAttachmentAccess] - [Getter][#rasterizationOrderColorAttachmentAccess()] - [Setter][#rasterizationOrderColorAttachmentAccess(int)]
/// ### rasterizationOrderDepthAttachmentAccess
/// [VarHandle][#VH_rasterizationOrderDepthAttachmentAccess] - [Getter][#rasterizationOrderDepthAttachmentAccess()] - [Setter][#rasterizationOrderDepthAttachmentAccess(int)]
/// ### rasterizationOrderStencilAttachmentAccess
/// [VarHandle][#VH_rasterizationOrderStencilAttachmentAccess] - [Getter][#rasterizationOrderStencilAttachmentAccess()] - [Setter][#rasterizationOrderStencilAttachmentAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 rasterizationOrderColorAttachmentAccess;
///     VkBool32 rasterizationOrderDepthAttachmentAccess;
///     VkBool32 rasterizationOrderStencilAttachmentAccess;
/// } VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT;
/// ```
public final class VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `rasterizationOrderColorAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationOrderColorAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderColorAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderDepthAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationOrderDepthAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderDepthAttachmentAccess"));
    /// The [VarHandle] of `rasterizationOrderStencilAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationOrderStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrderStencilAttachmentAccess"));

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT`
    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderColorAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderColorAttachmentAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rasterizationOrderColorAttachmentAccess(MemorySegment segment) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderColorAttachmentAccess(segment, 0L); }
    /// {@return `rasterizationOrderColorAttachmentAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rasterizationOrderColorAttachmentAccessAt(long index) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderColorAttachmentAccess(this.segment(), index); }
    /// {@return `rasterizationOrderColorAttachmentAccess`}
    public @CType("VkBool32") int rasterizationOrderColorAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderColorAttachmentAccess(this.segment()); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationOrderColorAttachmentAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rasterizationOrderColorAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationOrderColorAttachmentAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderColorAttachmentAccess(segment, 0L, value); }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderColorAttachmentAccess(this.segment(), index, value); return this; }
    /// Sets `rasterizationOrderColorAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderColorAttachmentAccess(@CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderColorAttachmentAccess(this.segment(), value); return this; }

    /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderDepthAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderDepthAttachmentAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rasterizationOrderDepthAttachmentAccess(MemorySegment segment) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderDepthAttachmentAccess(segment, 0L); }
    /// {@return `rasterizationOrderDepthAttachmentAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rasterizationOrderDepthAttachmentAccessAt(long index) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderDepthAttachmentAccess(this.segment(), index); }
    /// {@return `rasterizationOrderDepthAttachmentAccess`}
    public @CType("VkBool32") int rasterizationOrderDepthAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderDepthAttachmentAccess(this.segment()); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationOrderDepthAttachmentAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rasterizationOrderDepthAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationOrderDepthAttachmentAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderDepthAttachmentAccess(segment, 0L, value); }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderDepthAttachmentAccess(this.segment(), index, value); return this; }
    /// Sets `rasterizationOrderDepthAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderDepthAttachmentAccess(@CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderDepthAttachmentAccess(this.segment(), value); return this; }

    /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index) { return (int) VH_rasterizationOrderStencilAttachmentAccess.get(segment, 0L, index); }
    /// {@return `rasterizationOrderStencilAttachmentAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rasterizationOrderStencilAttachmentAccess(MemorySegment segment) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderStencilAttachmentAccess(segment, 0L); }
    /// {@return `rasterizationOrderStencilAttachmentAccess` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rasterizationOrderStencilAttachmentAccessAt(long index) { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderStencilAttachmentAccess(this.segment(), index); }
    /// {@return `rasterizationOrderStencilAttachmentAccess`}
    public @CType("VkBool32") int rasterizationOrderStencilAttachmentAccess() { return VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.get_rasterizationOrderStencilAttachmentAccess(this.segment()); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationOrderStencilAttachmentAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rasterizationOrderStencilAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationOrderStencilAttachmentAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderStencilAttachmentAccess(segment, 0L, value); }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderStencilAttachmentAccess(this.segment(), index, value); return this; }
    /// Sets `rasterizationOrderStencilAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT rasterizationOrderStencilAttachmentAccess(@CType("VkBool32") int value) { VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.set_rasterizationOrderStencilAttachmentAccess(this.segment(), value); return this; }

}
