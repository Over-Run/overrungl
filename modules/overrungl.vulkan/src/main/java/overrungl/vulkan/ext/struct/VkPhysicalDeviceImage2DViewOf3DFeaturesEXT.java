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
/// ### image2DViewOf3D
/// [VarHandle][#VH_image2DViewOf3D] - [Getter][#image2DViewOf3D()] - [Setter][#image2DViewOf3D(int)]
/// ### sampler2DViewOf3D
/// [VarHandle][#VH_sampler2DViewOf3D] - [Getter][#sampler2DViewOf3D()] - [Setter][#sampler2DViewOf3D(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceImage2DViewOf3DFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 image2DViewOf3D;
///     VkBool32 sampler2DViewOf3D;
/// } VkPhysicalDeviceImage2DViewOf3DFeaturesEXT;
/// ```
public final class VkPhysicalDeviceImage2DViewOf3DFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("image2DViewOf3D"),
        ValueLayout.JAVA_INT.withName("sampler2DViewOf3D")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `image2DViewOf3D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_image2DViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image2DViewOf3D"));
    /// The [VarHandle] of `sampler2DViewOf3D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampler2DViewOf3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler2DViewOf3D"));

    /// Creates `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImage2DViewOf3DFeaturesEXT`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `image2DViewOf3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_image2DViewOf3D(MemorySegment segment, long index) { return (int) VH_image2DViewOf3D.get(segment, 0L, index); }
    /// {@return `image2DViewOf3D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_image2DViewOf3D(MemorySegment segment) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_image2DViewOf3D(segment, 0L); }
    /// {@return `image2DViewOf3D` at the given index}
    /// @param index the index
    public @CType("VkBool32") int image2DViewOf3DAt(long index) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_image2DViewOf3D(this.segment(), index); }
    /// {@return `image2DViewOf3D`}
    public @CType("VkBool32") int image2DViewOf3D() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_image2DViewOf3D(this.segment()); }
    /// Sets `image2DViewOf3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image2DViewOf3D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_image2DViewOf3D.set(segment, 0L, index, value); }
    /// Sets `image2DViewOf3D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image2DViewOf3D(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_image2DViewOf3D(segment, 0L, value); }
    /// Sets `image2DViewOf3D` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3DAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_image2DViewOf3D(this.segment(), index, value); return this; }
    /// Sets `image2DViewOf3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3D(@CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_image2DViewOf3D(this.segment(), value); return this; }

    /// {@return `sampler2DViewOf3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sampler2DViewOf3D(MemorySegment segment, long index) { return (int) VH_sampler2DViewOf3D.get(segment, 0L, index); }
    /// {@return `sampler2DViewOf3D`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sampler2DViewOf3D(MemorySegment segment) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sampler2DViewOf3D(segment, 0L); }
    /// {@return `sampler2DViewOf3D` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sampler2DViewOf3DAt(long index) { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sampler2DViewOf3D(this.segment(), index); }
    /// {@return `sampler2DViewOf3D`}
    public @CType("VkBool32") int sampler2DViewOf3D() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.get_sampler2DViewOf3D(this.segment()); }
    /// Sets `sampler2DViewOf3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampler2DViewOf3D(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sampler2DViewOf3D.set(segment, 0L, index, value); }
    /// Sets `sampler2DViewOf3D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampler2DViewOf3D(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sampler2DViewOf3D(segment, 0L, value); }
    /// Sets `sampler2DViewOf3D` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3DAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sampler2DViewOf3D(this.segment(), index, value); return this; }
    /// Sets `sampler2DViewOf3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3D(@CType("VkBool32") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.set_sampler2DViewOf3D(this.segment(), value); return this; }

}
