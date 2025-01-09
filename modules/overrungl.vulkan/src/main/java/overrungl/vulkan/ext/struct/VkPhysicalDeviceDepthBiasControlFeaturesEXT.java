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
/// ### depthBiasControl
/// [VarHandle][#VH_depthBiasControl] - [Getter][#depthBiasControl()] - [Setter][#depthBiasControl(int)]
/// ### leastRepresentableValueForceUnormRepresentation
/// [VarHandle][#VH_leastRepresentableValueForceUnormRepresentation] - [Getter][#leastRepresentableValueForceUnormRepresentation()] - [Setter][#leastRepresentableValueForceUnormRepresentation(int)]
/// ### floatRepresentation
/// [VarHandle][#VH_floatRepresentation] - [Getter][#floatRepresentation()] - [Setter][#floatRepresentation(int)]
/// ### depthBiasExact
/// [VarHandle][#VH_depthBiasExact] - [Getter][#depthBiasExact()] - [Setter][#depthBiasExact(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDepthBiasControlFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 depthBiasControl;
///     VkBool32 leastRepresentableValueForceUnormRepresentation;
///     VkBool32 floatRepresentation;
///     VkBool32 depthBiasExact;
/// } VkPhysicalDeviceDepthBiasControlFeaturesEXT;
/// ```
public final class VkPhysicalDeviceDepthBiasControlFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasControl"),
        ValueLayout.JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation"),
        ValueLayout.JAVA_INT.withName("floatRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `depthBiasControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasControl"));
    /// The [VarHandle] of `leastRepresentableValueForceUnormRepresentation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_leastRepresentableValueForceUnormRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    /// The [VarHandle] of `floatRepresentation` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_floatRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("floatRepresentation"));
    /// The [VarHandle] of `depthBiasExact` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `depthBiasControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBiasControl(MemorySegment segment, long index) { return (int) VH_depthBiasControl.get(segment, 0L, index); }
    /// {@return `depthBiasControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBiasControl(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasControl(segment, 0L); }
    /// {@return `depthBiasControl` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBiasControlAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasControl(this.segment(), index); }
    /// {@return `depthBiasControl`}
    public @CType("VkBool32") int depthBiasControl() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasControl(this.segment()); }
    /// Sets `depthBiasControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBiasControl.set(segment, 0L, index, value); }
    /// Sets `depthBiasControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasControl(segment, 0L, value); }
    /// Sets `depthBiasControl` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasControl(this.segment(), index, value); return this; }
    /// Sets `depthBiasControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(@CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasControl(this.segment(), value); return this; }

    /// {@return `leastRepresentableValueForceUnormRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_leastRepresentableValueForceUnormRepresentation(MemorySegment segment, long index) { return (int) VH_leastRepresentableValueForceUnormRepresentation.get(segment, 0L, index); }
    /// {@return `leastRepresentableValueForceUnormRepresentation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_leastRepresentableValueForceUnormRepresentation(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_leastRepresentableValueForceUnormRepresentation(segment, 0L); }
    /// {@return `leastRepresentableValueForceUnormRepresentation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int leastRepresentableValueForceUnormRepresentationAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_leastRepresentableValueForceUnormRepresentation(this.segment(), index); }
    /// {@return `leastRepresentableValueForceUnormRepresentation`}
    public @CType("VkBool32") int leastRepresentableValueForceUnormRepresentation() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_leastRepresentableValueForceUnormRepresentation(this.segment()); }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_leastRepresentableValueForceUnormRepresentation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_leastRepresentableValueForceUnormRepresentation.set(segment, 0L, index, value); }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_leastRepresentableValueForceUnormRepresentation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_leastRepresentableValueForceUnormRepresentation(segment, 0L, value); }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_leastRepresentableValueForceUnormRepresentation(this.segment(), index, value); return this; }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(@CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_leastRepresentableValueForceUnormRepresentation(this.segment(), value); return this; }

    /// {@return `floatRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_floatRepresentation(MemorySegment segment, long index) { return (int) VH_floatRepresentation.get(segment, 0L, index); }
    /// {@return `floatRepresentation`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_floatRepresentation(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_floatRepresentation(segment, 0L); }
    /// {@return `floatRepresentation` at the given index}
    /// @param index the index
    public @CType("VkBool32") int floatRepresentationAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_floatRepresentation(this.segment(), index); }
    /// {@return `floatRepresentation`}
    public @CType("VkBool32") int floatRepresentation() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_floatRepresentation(this.segment()); }
    /// Sets `floatRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_floatRepresentation(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_floatRepresentation.set(segment, 0L, index, value); }
    /// Sets `floatRepresentation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_floatRepresentation(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_floatRepresentation(segment, 0L, value); }
    /// Sets `floatRepresentation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentationAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_floatRepresentation(this.segment(), index, value); return this; }
    /// Sets `floatRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(@CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_floatRepresentation(this.segment(), value); return this; }

    /// {@return `depthBiasExact` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBiasExact(MemorySegment segment, long index) { return (int) VH_depthBiasExact.get(segment, 0L, index); }
    /// {@return `depthBiasExact`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBiasExact(MemorySegment segment) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasExact(segment, 0L); }
    /// {@return `depthBiasExact` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBiasExactAt(long index) { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasExact(this.segment(), index); }
    /// {@return `depthBiasExact`}
    public @CType("VkBool32") int depthBiasExact() { return VkPhysicalDeviceDepthBiasControlFeaturesEXT.get_depthBiasExact(this.segment()); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasExact(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBiasExact.set(segment, 0L, index, value); }
    /// Sets `depthBiasExact` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasExact(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasExact(segment, 0L, value); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExactAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasExact(this.segment(), index, value); return this; }
    /// Sets `depthBiasExact` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(@CType("VkBool32") int value) { VkPhysicalDeviceDepthBiasControlFeaturesEXT.set_depthBiasExact(this.segment(), value); return this; }

}
