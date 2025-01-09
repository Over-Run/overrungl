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
/// ### shaderSMCount
/// [VarHandle][#VH_shaderSMCount] - [Getter][#shaderSMCount()] - [Setter][#shaderSMCount(int)]
/// ### shaderWarpsPerSM
/// [VarHandle][#VH_shaderWarpsPerSM] - [Getter][#shaderWarpsPerSM()] - [Setter][#shaderWarpsPerSM(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t shaderSMCount;
///     uint32_t shaderWarpsPerSM;
/// } VkPhysicalDeviceShaderSMBuiltinsPropertiesNV;
/// ```
public final class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerSM")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderSMCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSMCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSMCount"));
    /// The [VarHandle] of `shaderWarpsPerSM` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderWarpsPerSM = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerSM"));

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderSMCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderSMCount(MemorySegment segment, long index) { return (int) VH_shaderSMCount.get(segment, 0L, index); }
    /// {@return `shaderSMCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderSMCount(MemorySegment segment) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderSMCount(segment, 0L); }
    /// {@return `shaderSMCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderSMCountAt(long index) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderSMCount(this.segment(), index); }
    /// {@return `shaderSMCount`}
    public @CType("uint32_t") int shaderSMCount() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderSMCount(this.segment()); }
    /// Sets `shaderSMCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSMCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderSMCount.set(segment, 0L, index, value); }
    /// Sets `shaderSMCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSMCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderSMCount(segment, 0L, value); }
    /// Sets `shaderSMCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderSMCount(this.segment(), index, value); return this; }
    /// Sets `shaderSMCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderSMCount(this.segment(), value); return this; }

    /// {@return `shaderWarpsPerSM` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderWarpsPerSM(MemorySegment segment, long index) { return (int) VH_shaderWarpsPerSM.get(segment, 0L, index); }
    /// {@return `shaderWarpsPerSM`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderWarpsPerSM(MemorySegment segment) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderWarpsPerSM(segment, 0L); }
    /// {@return `shaderWarpsPerSM` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderWarpsPerSMAt(long index) { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderWarpsPerSM(this.segment(), index); }
    /// {@return `shaderWarpsPerSM`}
    public @CType("uint32_t") int shaderWarpsPerSM() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.get_shaderWarpsPerSM(this.segment()); }
    /// Sets `shaderWarpsPerSM` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderWarpsPerSM(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderWarpsPerSM.set(segment, 0L, index, value); }
    /// Sets `shaderWarpsPerSM` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderWarpsPerSM(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderWarpsPerSM(segment, 0L, value); }
    /// Sets `shaderWarpsPerSM` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSMAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderWarpsPerSM(this.segment(), index, value); return this; }
    /// Sets `shaderWarpsPerSM` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSM(@CType("uint32_t") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.set_shaderWarpsPerSM(this.segment(), value); return this; }

}
