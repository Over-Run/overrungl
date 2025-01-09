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
package overrungl.vulkan.huawei.struct;

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
/// ### maxWorkGroupCount
/// [VarHandle][#VH_maxWorkGroupCount] - [Getter][#maxWorkGroupCount()] - [Setter][#maxWorkGroupCount(int)]
/// ### maxWorkGroupSize
/// [VarHandle][#VH_maxWorkGroupSize] - [Getter][#maxWorkGroupSize()] - [Setter][#maxWorkGroupSize(int)]
/// ### maxOutputClusterCount
/// [VarHandle][#VH_maxOutputClusterCount] - [Getter][#maxOutputClusterCount()] - [Setter][#maxOutputClusterCount(int)]
/// ### indirectBufferOffsetAlignment
/// [VarHandle][#VH_indirectBufferOffsetAlignment] - [Getter][#indirectBufferOffsetAlignment()] - [Setter][#indirectBufferOffsetAlignment(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxWorkGroupCount;
///     uint32_t maxWorkGroupSize;
///     uint32_t maxOutputClusterCount;
///     VkDeviceSize indirectBufferOffsetAlignment;
/// } VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI;
/// ```
public final class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI extends Struct {
    /// The struct layout of `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxWorkGroupCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupCount"));
    /// The [VarHandle] of `maxWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWorkGroupSize"));
    /// The [VarHandle] of `maxOutputClusterCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOutputClusterCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOutputClusterCount"));
    /// The [VarHandle] of `indirectBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_indirectBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectBufferOffsetAlignment"));

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI`
    public static VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI sType(@CType("VkStructureType") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_pNext(this.segment(), value); return this; }

    /// {@return `maxWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxWorkGroupCount(MemorySegment segment, long index) { return (int) VH_maxWorkGroupCount.get(segment, 0L, index); }
    /// {@return `maxWorkGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxWorkGroupCount(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(segment, 0L); }
    /// {@return `maxWorkGroupCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxWorkGroupCountAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(this.segment(), index); }
    /// {@return `maxWorkGroupCount`}
    public @CType("uint32_t") int maxWorkGroupCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupCount(this.segment()); }
    /// Sets `maxWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWorkGroupCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxWorkGroupCount.set(segment, 0L, index, value); }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWorkGroupCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(segment, 0L, value); }
    /// Sets `maxWorkGroupCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(this.segment(), index, value); return this; }
    /// Sets `maxWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupCount(@CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupCount(this.segment(), value); return this; }

    /// {@return `maxWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxWorkGroupSize(MemorySegment segment, long index) { return (int) VH_maxWorkGroupSize.get(segment, 0L, index); }
    /// {@return `maxWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(segment, 0L); }
    /// {@return `maxWorkGroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxWorkGroupSizeAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(this.segment(), index); }
    /// {@return `maxWorkGroupSize`}
    public @CType("uint32_t") int maxWorkGroupSize() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxWorkGroupSize(this.segment()); }
    /// Sets `maxWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxWorkGroupSize.set(segment, 0L, index, value); }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxWorkGroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(segment, 0L, value); }
    /// Sets `maxWorkGroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxWorkGroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxWorkGroupSize(this.segment(), value); return this; }

    /// {@return `maxOutputClusterCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOutputClusterCount(MemorySegment segment, long index) { return (int) VH_maxOutputClusterCount.get(segment, 0L, index); }
    /// {@return `maxOutputClusterCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOutputClusterCount(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(segment, 0L); }
    /// {@return `maxOutputClusterCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxOutputClusterCountAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(this.segment(), index); }
    /// {@return `maxOutputClusterCount`}
    public @CType("uint32_t") int maxOutputClusterCount() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_maxOutputClusterCount(this.segment()); }
    /// Sets `maxOutputClusterCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOutputClusterCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOutputClusterCount.set(segment, 0L, index, value); }
    /// Sets `maxOutputClusterCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOutputClusterCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(segment, 0L, value); }
    /// Sets `maxOutputClusterCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(this.segment(), index, value); return this; }
    /// Sets `maxOutputClusterCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI maxOutputClusterCount(@CType("uint32_t") int value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_maxOutputClusterCount(this.segment(), value); return this; }

    /// {@return `indirectBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_indirectBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_indirectBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `indirectBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_indirectBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(segment, 0L); }
    /// {@return `indirectBufferOffsetAlignment` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long indirectBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(this.segment(), index); }
    /// {@return `indirectBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long indirectBufferOffsetAlignment() { return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.get_indirectBufferOffsetAlignment(this.segment()); }
    /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_indirectBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `indirectBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `indirectBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(this.segment(), index, value); return this; }
    /// Sets `indirectBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI indirectBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.set_indirectBufferOffsetAlignment(this.segment(), value); return this; }

}
