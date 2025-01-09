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
package overrungl.vulkan.arm.struct;

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
/// ### shaderCoreMask
/// [VarHandle][#VH_shaderCoreMask] - [Getter][#shaderCoreMask()] - [Setter][#shaderCoreMask(long)]
/// ### shaderCoreCount
/// [VarHandle][#VH_shaderCoreCount] - [Getter][#shaderCoreCount()] - [Setter][#shaderCoreCount(int)]
/// ### shaderWarpsPerCore
/// [VarHandle][#VH_shaderWarpsPerCore] - [Getter][#shaderWarpsPerCore()] - [Setter][#shaderWarpsPerCore(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
///     VkStructureType sType;
///     void * pNext;
///     uint64_t shaderCoreMask;
///     uint32_t shaderCoreCount;
///     uint32_t shaderWarpsPerCore;
/// } VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM;
/// ```
public final class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderCoreMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_shaderCoreMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreMask"));
    /// The [VarHandle] of `shaderCoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderCoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreCount"));
    /// The [VarHandle] of `shaderWarpsPerCore` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderWarpsPerCore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerCore"));

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderCoreMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_shaderCoreMask(MemorySegment segment, long index) { return (long) VH_shaderCoreMask.get(segment, 0L, index); }
    /// {@return `shaderCoreMask`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_shaderCoreMask(MemorySegment segment) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreMask(segment, 0L); }
    /// {@return `shaderCoreMask` at the given index}
    /// @param index the index
    public @CType("uint64_t") long shaderCoreMaskAt(long index) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreMask(this.segment(), index); }
    /// {@return `shaderCoreMask`}
    public @CType("uint64_t") long shaderCoreMask() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreMask(this.segment()); }
    /// Sets `shaderCoreMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCoreMask(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_shaderCoreMask.set(segment, 0L, index, value); }
    /// Sets `shaderCoreMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCoreMask(MemorySegment segment, @CType("uint64_t") long value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreMask(segment, 0L, value); }
    /// Sets `shaderCoreMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMaskAt(long index, @CType("uint64_t") long value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreMask(this.segment(), index, value); return this; }
    /// Sets `shaderCoreMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMask(@CType("uint64_t") long value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreMask(this.segment(), value); return this; }

    /// {@return `shaderCoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderCoreCount(MemorySegment segment, long index) { return (int) VH_shaderCoreCount.get(segment, 0L, index); }
    /// {@return `shaderCoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderCoreCount(MemorySegment segment) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreCount(segment, 0L); }
    /// {@return `shaderCoreCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderCoreCountAt(long index) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreCount(this.segment(), index); }
    /// {@return `shaderCoreCount`}
    public @CType("uint32_t") int shaderCoreCount() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderCoreCount(this.segment()); }
    /// Sets `shaderCoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderCoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderCoreCount.set(segment, 0L, index, value); }
    /// Sets `shaderCoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderCoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreCount(segment, 0L, value); }
    /// Sets `shaderCoreCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreCount(this.segment(), index, value); return this; }
    /// Sets `shaderCoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderCoreCount(this.segment(), value); return this; }

    /// {@return `shaderWarpsPerCore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderWarpsPerCore(MemorySegment segment, long index) { return (int) VH_shaderWarpsPerCore.get(segment, 0L, index); }
    /// {@return `shaderWarpsPerCore`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderWarpsPerCore(MemorySegment segment) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderWarpsPerCore(segment, 0L); }
    /// {@return `shaderWarpsPerCore` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderWarpsPerCoreAt(long index) { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderWarpsPerCore(this.segment(), index); }
    /// {@return `shaderWarpsPerCore`}
    public @CType("uint32_t") int shaderWarpsPerCore() { return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.get_shaderWarpsPerCore(this.segment()); }
    /// Sets `shaderWarpsPerCore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderWarpsPerCore(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderWarpsPerCore.set(segment, 0L, index, value); }
    /// Sets `shaderWarpsPerCore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderWarpsPerCore(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderWarpsPerCore(segment, 0L, value); }
    /// Sets `shaderWarpsPerCore` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCoreAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderWarpsPerCore(this.segment(), index, value); return this; }
    /// Sets `shaderWarpsPerCore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCore(@CType("uint32_t") int value) { VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.set_shaderWarpsPerCore(this.segment(), value); return this; }

}
