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
/// ### conditionalRendering
/// [VarHandle][#VH_conditionalRendering] - [Getter][#conditionalRendering()] - [Setter][#conditionalRendering(int)]
/// ### inheritedConditionalRendering
/// [VarHandle][#VH_inheritedConditionalRendering] - [Getter][#inheritedConditionalRendering()] - [Setter][#inheritedConditionalRendering(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceConditionalRenderingFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 conditionalRendering;
///     VkBool32 inheritedConditionalRendering;
/// } VkPhysicalDeviceConditionalRenderingFeaturesEXT;
/// ```
public final class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRendering"),
        ValueLayout.JAVA_INT.withName("inheritedConditionalRendering")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `conditionalRendering` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_conditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conditionalRendering"));
    /// The [VarHandle] of `inheritedConditionalRendering` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_inheritedConditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedConditionalRendering"));

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `conditionalRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_conditionalRendering(MemorySegment segment, long index) { return (int) VH_conditionalRendering.get(segment, 0L, index); }
    /// {@return `conditionalRendering`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_conditionalRendering(MemorySegment segment) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_conditionalRendering(segment, 0L); }
    /// {@return `conditionalRendering` at the given index}
    /// @param index the index
    public @CType("VkBool32") int conditionalRenderingAt(long index) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_conditionalRendering(this.segment(), index); }
    /// {@return `conditionalRendering`}
    public @CType("VkBool32") int conditionalRendering() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_conditionalRendering(this.segment()); }
    /// Sets `conditionalRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_conditionalRendering(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_conditionalRendering.set(segment, 0L, index, value); }
    /// Sets `conditionalRendering` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_conditionalRendering(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_conditionalRendering(segment, 0L, value); }
    /// Sets `conditionalRendering` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRenderingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_conditionalRendering(this.segment(), index, value); return this; }
    /// Sets `conditionalRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(@CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_conditionalRendering(this.segment(), value); return this; }

    /// {@return `inheritedConditionalRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_inheritedConditionalRendering(MemorySegment segment, long index) { return (int) VH_inheritedConditionalRendering.get(segment, 0L, index); }
    /// {@return `inheritedConditionalRendering`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_inheritedConditionalRendering(MemorySegment segment) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_inheritedConditionalRendering(segment, 0L); }
    /// {@return `inheritedConditionalRendering` at the given index}
    /// @param index the index
    public @CType("VkBool32") int inheritedConditionalRenderingAt(long index) { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_inheritedConditionalRendering(this.segment(), index); }
    /// {@return `inheritedConditionalRendering`}
    public @CType("VkBool32") int inheritedConditionalRendering() { return VkPhysicalDeviceConditionalRenderingFeaturesEXT.get_inheritedConditionalRendering(this.segment()); }
    /// Sets `inheritedConditionalRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_inheritedConditionalRendering(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_inheritedConditionalRendering.set(segment, 0L, index, value); }
    /// Sets `inheritedConditionalRendering` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_inheritedConditionalRendering(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_inheritedConditionalRendering(segment, 0L, value); }
    /// Sets `inheritedConditionalRendering` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRenderingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_inheritedConditionalRendering(this.segment(), index, value); return this; }
    /// Sets `inheritedConditionalRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(@CType("VkBool32") int value) { VkPhysicalDeviceConditionalRenderingFeaturesEXT.set_inheritedConditionalRendering(this.segment(), value); return this; }

}