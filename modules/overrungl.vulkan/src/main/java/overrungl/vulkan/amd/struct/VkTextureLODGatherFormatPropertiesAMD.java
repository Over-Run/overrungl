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
package overrungl.vulkan.amd.struct;

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
/// ### supportsTextureGatherLODBiasAMD
/// [VarHandle][#VH_supportsTextureGatherLODBiasAMD] - [Getter][#supportsTextureGatherLODBiasAMD()] - [Setter][#supportsTextureGatherLODBiasAMD(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTextureLODGatherFormatPropertiesAMD {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 supportsTextureGatherLODBiasAMD;
/// } VkTextureLODGatherFormatPropertiesAMD;
/// ```
public final class VkTextureLODGatherFormatPropertiesAMD extends Struct {
    /// The struct layout of `VkTextureLODGatherFormatPropertiesAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportsTextureGatherLODBiasAMD")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `supportsTextureGatherLODBiasAMD` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportsTextureGatherLODBiasAMD = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsTextureGatherLODBiasAMD"));

    /// Creates `VkTextureLODGatherFormatPropertiesAMD` with the given segment.
    /// @param segment the memory segment
    public VkTextureLODGatherFormatPropertiesAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTextureLODGatherFormatPropertiesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTextureLODGatherFormatPropertiesAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment); }

    /// Creates `VkTextureLODGatherFormatPropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTextureLODGatherFormatPropertiesAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTextureLODGatherFormatPropertiesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTextureLODGatherFormatPropertiesAMD ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkTextureLODGatherFormatPropertiesAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkTextureLODGatherFormatPropertiesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTextureLODGatherFormatPropertiesAMD`
    public static VkTextureLODGatherFormatPropertiesAMD alloc(SegmentAllocator allocator) { return new VkTextureLODGatherFormatPropertiesAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTextureLODGatherFormatPropertiesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTextureLODGatherFormatPropertiesAMD`
    public static VkTextureLODGatherFormatPropertiesAMD alloc(SegmentAllocator allocator, long count) { return new VkTextureLODGatherFormatPropertiesAMD(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkTextureLODGatherFormatPropertiesAMD.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkTextureLODGatherFormatPropertiesAMD.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkTextureLODGatherFormatPropertiesAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkTextureLODGatherFormatPropertiesAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD sTypeAt(long index, @CType("VkStructureType") int value) { VkTextureLODGatherFormatPropertiesAMD.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD sType(@CType("VkStructureType") int value) { VkTextureLODGatherFormatPropertiesAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkTextureLODGatherFormatPropertiesAMD.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkTextureLODGatherFormatPropertiesAMD.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkTextureLODGatherFormatPropertiesAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkTextureLODGatherFormatPropertiesAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkTextureLODGatherFormatPropertiesAMD.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkTextureLODGatherFormatPropertiesAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `supportsTextureGatherLODBiasAMD` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_supportsTextureGatherLODBiasAMD(MemorySegment segment, long index) { return (int) VH_supportsTextureGatherLODBiasAMD.get(segment, 0L, index); }
    /// {@return `supportsTextureGatherLODBiasAMD`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_supportsTextureGatherLODBiasAMD(MemorySegment segment) { return VkTextureLODGatherFormatPropertiesAMD.get_supportsTextureGatherLODBiasAMD(segment, 0L); }
    /// {@return `supportsTextureGatherLODBiasAMD` at the given index}
    /// @param index the index
    public @CType("VkBool32") int supportsTextureGatherLODBiasAMDAt(long index) { return VkTextureLODGatherFormatPropertiesAMD.get_supportsTextureGatherLODBiasAMD(this.segment(), index); }
    /// {@return `supportsTextureGatherLODBiasAMD`}
    public @CType("VkBool32") int supportsTextureGatherLODBiasAMD() { return VkTextureLODGatherFormatPropertiesAMD.get_supportsTextureGatherLODBiasAMD(this.segment()); }
    /// Sets `supportsTextureGatherLODBiasAMD` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportsTextureGatherLODBiasAMD(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_supportsTextureGatherLODBiasAMD.set(segment, 0L, index, value); }
    /// Sets `supportsTextureGatherLODBiasAMD` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportsTextureGatherLODBiasAMD(MemorySegment segment, @CType("VkBool32") int value) { VkTextureLODGatherFormatPropertiesAMD.set_supportsTextureGatherLODBiasAMD(segment, 0L, value); }
    /// Sets `supportsTextureGatherLODBiasAMD` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD supportsTextureGatherLODBiasAMDAt(long index, @CType("VkBool32") int value) { VkTextureLODGatherFormatPropertiesAMD.set_supportsTextureGatherLODBiasAMD(this.segment(), index, value); return this; }
    /// Sets `supportsTextureGatherLODBiasAMD` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTextureLODGatherFormatPropertiesAMD supportsTextureGatherLODBiasAMD(@CType("VkBool32") int value) { VkTextureLODGatherFormatPropertiesAMD.set_supportsTextureGatherLODBiasAMD(this.segment(), value); return this; }

}
