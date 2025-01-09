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
package overrungl.vulkan.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### topology
/// [VarHandle][#VH_topology] - [Getter][#topology()] - [Setter][#topology(int)]
/// ### primitiveRestartEnable
/// [VarHandle][#VH_primitiveRestartEnable] - [Getter][#primitiveRestartEnable()] - [Setter][#primitiveRestartEnable(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineInputAssemblyStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineInputAssemblyStateCreateFlags flags;
///     VkPrimitiveTopology topology;
///     VkBool32 primitiveRestartEnable;
/// } VkPipelineInputAssemblyStateCreateInfo;
/// ```
public final class VkPipelineInputAssemblyStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineInputAssemblyStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("primitiveRestartEnable")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `topology` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_topology = LAYOUT.arrayElementVarHandle(PathElement.groupElement("topology"));
    /// The [VarHandle] of `primitiveRestartEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primitiveRestartEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveRestartEnable"));

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineInputAssemblyStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineInputAssemblyStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineInputAssemblyStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineInputAssemblyStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineInputAssemblyStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineInputAssemblyStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineInputAssemblyStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineInputAssemblyStateCreateInfo`
    public static VkPipelineInputAssemblyStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineInputAssemblyStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineInputAssemblyStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineInputAssemblyStateCreateInfo`
    public static VkPipelineInputAssemblyStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineInputAssemblyStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineInputAssemblyStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineInputAssemblyStateCreateInfo`
    public VkPipelineInputAssemblyStateCreateInfo asSlice(long index) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineInputAssemblyStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineInputAssemblyStateCreateInfo`
    public VkPipelineInputAssemblyStateCreateInfo asSlice(long index, long count) { return new VkPipelineInputAssemblyStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineInputAssemblyStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineInputAssemblyStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineInputAssemblyStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineInputAssemblyStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineInputAssemblyStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineInputAssemblyStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineInputAssemblyStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineInputAssemblyStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineInputAssemblyStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineInputAssemblyStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineInputAssemblyStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineInputAssemblyStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineInputAssemblyStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineInputAssemblyStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineInputAssemblyStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineInputAssemblyStateCreateFlags") int flagsAt(long index) { return VkPipelineInputAssemblyStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineInputAssemblyStateCreateFlags") int flags() { return VkPipelineInputAssemblyStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineInputAssemblyStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineInputAssemblyStateCreateFlags") int value) { VkPipelineInputAssemblyStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo flagsAt(long index, @CType("VkPipelineInputAssemblyStateCreateFlags") int value) { VkPipelineInputAssemblyStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo flags(@CType("VkPipelineInputAssemblyStateCreateFlags") int value) { VkPipelineInputAssemblyStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `topology` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPrimitiveTopology") int get_topology(MemorySegment segment, long index) { return (int) VH_topology.get(segment, 0L, index); }
    /// {@return `topology`}
    /// @param segment the segment of the struct
    public static @CType("VkPrimitiveTopology") int get_topology(MemorySegment segment) { return VkPipelineInputAssemblyStateCreateInfo.get_topology(segment, 0L); }
    /// {@return `topology` at the given index}
    /// @param index the index
    public @CType("VkPrimitiveTopology") int topologyAt(long index) { return VkPipelineInputAssemblyStateCreateInfo.get_topology(this.segment(), index); }
    /// {@return `topology`}
    public @CType("VkPrimitiveTopology") int topology() { return VkPipelineInputAssemblyStateCreateInfo.get_topology(this.segment()); }
    /// Sets `topology` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_topology(MemorySegment segment, long index, @CType("VkPrimitiveTopology") int value) { VH_topology.set(segment, 0L, index, value); }
    /// Sets `topology` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_topology(MemorySegment segment, @CType("VkPrimitiveTopology") int value) { VkPipelineInputAssemblyStateCreateInfo.set_topology(segment, 0L, value); }
    /// Sets `topology` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo topologyAt(long index, @CType("VkPrimitiveTopology") int value) { VkPipelineInputAssemblyStateCreateInfo.set_topology(this.segment(), index, value); return this; }
    /// Sets `topology` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo topology(@CType("VkPrimitiveTopology") int value) { VkPipelineInputAssemblyStateCreateInfo.set_topology(this.segment(), value); return this; }

    /// {@return `primitiveRestartEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primitiveRestartEnable(MemorySegment segment, long index) { return (int) VH_primitiveRestartEnable.get(segment, 0L, index); }
    /// {@return `primitiveRestartEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primitiveRestartEnable(MemorySegment segment) { return VkPipelineInputAssemblyStateCreateInfo.get_primitiveRestartEnable(segment, 0L); }
    /// {@return `primitiveRestartEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primitiveRestartEnableAt(long index) { return VkPipelineInputAssemblyStateCreateInfo.get_primitiveRestartEnable(this.segment(), index); }
    /// {@return `primitiveRestartEnable`}
    public @CType("VkBool32") int primitiveRestartEnable() { return VkPipelineInputAssemblyStateCreateInfo.get_primitiveRestartEnable(this.segment()); }
    /// Sets `primitiveRestartEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primitiveRestartEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primitiveRestartEnable.set(segment, 0L, index, value); }
    /// Sets `primitiveRestartEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primitiveRestartEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineInputAssemblyStateCreateInfo.set_primitiveRestartEnable(segment, 0L, value); }
    /// Sets `primitiveRestartEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnableAt(long index, @CType("VkBool32") int value) { VkPipelineInputAssemblyStateCreateInfo.set_primitiveRestartEnable(this.segment(), index, value); return this; }
    /// Sets `primitiveRestartEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(@CType("VkBool32") int value) { VkPipelineInputAssemblyStateCreateInfo.set_primitiveRestartEnable(this.segment(), value); return this; }

}
