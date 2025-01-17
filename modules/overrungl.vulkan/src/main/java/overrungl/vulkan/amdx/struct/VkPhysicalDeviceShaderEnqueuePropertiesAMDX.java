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
package overrungl.vulkan.amdx.struct;

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
/// ### maxExecutionGraphDepth
/// [VarHandle][#VH_maxExecutionGraphDepth] - [Getter][#maxExecutionGraphDepth()] - [Setter][#maxExecutionGraphDepth(int)]
/// ### maxExecutionGraphShaderOutputNodes
/// [VarHandle][#VH_maxExecutionGraphShaderOutputNodes] - [Getter][#maxExecutionGraphShaderOutputNodes()] - [Setter][#maxExecutionGraphShaderOutputNodes(int)]
/// ### maxExecutionGraphShaderPayloadSize
/// [VarHandle][#VH_maxExecutionGraphShaderPayloadSize] - [Getter][#maxExecutionGraphShaderPayloadSize()] - [Setter][#maxExecutionGraphShaderPayloadSize(int)]
/// ### maxExecutionGraphShaderPayloadCount
/// [VarHandle][#VH_maxExecutionGraphShaderPayloadCount] - [Getter][#maxExecutionGraphShaderPayloadCount()] - [Setter][#maxExecutionGraphShaderPayloadCount(int)]
/// ### executionGraphDispatchAddressAlignment
/// [VarHandle][#VH_executionGraphDispatchAddressAlignment] - [Getter][#executionGraphDispatchAddressAlignment()] - [Setter][#executionGraphDispatchAddressAlignment(int)]
/// ### maxExecutionGraphWorkgroupCount
/// [Byte offset][#OFFSET_maxExecutionGraphWorkgroupCount] - [Memory layout][#ML_maxExecutionGraphWorkgroupCount] - [Getter][#maxExecutionGraphWorkgroupCount()] - [Setter][#maxExecutionGraphWorkgroupCount(java.lang.foreign.MemorySegment)]
/// ### maxExecutionGraphWorkgroups
/// [VarHandle][#VH_maxExecutionGraphWorkgroups] - [Getter][#maxExecutionGraphWorkgroups()] - [Setter][#maxExecutionGraphWorkgroups(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxExecutionGraphDepth;
///     uint32_t maxExecutionGraphShaderOutputNodes;
///     uint32_t maxExecutionGraphShaderPayloadSize;
///     uint32_t maxExecutionGraphShaderPayloadCount;
///     uint32_t executionGraphDispatchAddressAlignment;
///     uint32_t[3] maxExecutionGraphWorkgroupCount;
///     uint32_t maxExecutionGraphWorkgroups;
/// } VkPhysicalDeviceShaderEnqueuePropertiesAMDX;
/// ```
public sealed class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphDepth"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderOutputNodes"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadCount"),
        ValueLayout.JAVA_INT.withName("executionGraphDispatchAddressAlignment"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxExecutionGraphWorkgroupCount"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroups")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxExecutionGraphDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxExecutionGraphDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphDepth"));
    /// The [VarHandle] of `maxExecutionGraphShaderOutputNodes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxExecutionGraphShaderOutputNodes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    /// The [VarHandle] of `maxExecutionGraphShaderPayloadSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxExecutionGraphShaderPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    /// The [VarHandle] of `maxExecutionGraphShaderPayloadCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxExecutionGraphShaderPayloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    /// The [VarHandle] of `executionGraphDispatchAddressAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_executionGraphDispatchAddressAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    /// The byte offset of `maxExecutionGraphWorkgroupCount`.
    public static final long OFFSET_maxExecutionGraphWorkgroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    /// The memory layout of `maxExecutionGraphWorkgroupCount`.
    public static final MemoryLayout ML_maxExecutionGraphWorkgroupCount = LAYOUT.select(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    /// The [VarHandle] of `maxExecutionGraphWorkgroups` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxExecutionGraphWorkgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphWorkgroups"));

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int maxExecutionGraphDepth, @CType("uint32_t") int maxExecutionGraphShaderOutputNodes, @CType("uint32_t") int maxExecutionGraphShaderPayloadSize, @CType("uint32_t") int maxExecutionGraphShaderPayloadCount, @CType("uint32_t") int executionGraphDispatchAddressAlignment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxExecutionGraphWorkgroupCount, @CType("uint32_t") int maxExecutionGraphWorkgroups) { return alloc(allocator).sType(sType).pNext(pNext).maxExecutionGraphDepth(maxExecutionGraphDepth).maxExecutionGraphShaderOutputNodes(maxExecutionGraphShaderOutputNodes).maxExecutionGraphShaderPayloadSize(maxExecutionGraphShaderPayloadSize).maxExecutionGraphShaderPayloadCount(maxExecutionGraphShaderPayloadCount).executionGraphDispatchAddressAlignment(executionGraphDispatchAddressAlignment).maxExecutionGraphWorkgroupCount(maxExecutionGraphWorkgroupCount).maxExecutionGraphWorkgroups(maxExecutionGraphWorkgroups); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX copyFrom(VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_pNext(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxExecutionGraphDepth(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphDepth.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphDepth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxExecutionGraphDepth(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphDepth(segment, 0L); }
    /// {@return `maxExecutionGraphDepth`}
    public @CType("uint32_t") int maxExecutionGraphDepth() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphDepth(this.segment()); }
    /// Sets `maxExecutionGraphDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphDepth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxExecutionGraphDepth.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphDepth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphDepth(segment, 0L, value); }
    /// Sets `maxExecutionGraphDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepth(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphDepth(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphShaderOutputNodes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxExecutionGraphShaderOutputNodes(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderOutputNodes.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderOutputNodes`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxExecutionGraphShaderOutputNodes(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderOutputNodes(segment, 0L); }
    /// {@return `maxExecutionGraphShaderOutputNodes`}
    public @CType("uint32_t") int maxExecutionGraphShaderOutputNodes() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderOutputNodes(this.segment()); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphShaderOutputNodes(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxExecutionGraphShaderOutputNodes.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphShaderOutputNodes(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderOutputNodes(segment, 0L, value); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodes(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderOutputNodes(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxExecutionGraphShaderPayloadSize(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderPayloadSize.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderPayloadSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxExecutionGraphShaderPayloadSize(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadSize(segment, 0L); }
    /// {@return `maxExecutionGraphShaderPayloadSize`}
    public @CType("uint32_t") int maxExecutionGraphShaderPayloadSize() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadSize(this.segment()); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphShaderPayloadSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxExecutionGraphShaderPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphShaderPayloadSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadSize(segment, 0L, value); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSize(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadSize(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxExecutionGraphShaderPayloadCount(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderPayloadCount.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderPayloadCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxExecutionGraphShaderPayloadCount(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadCount(segment, 0L); }
    /// {@return `maxExecutionGraphShaderPayloadCount`}
    public @CType("uint32_t") int maxExecutionGraphShaderPayloadCount() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadCount(this.segment()); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphShaderPayloadCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxExecutionGraphShaderPayloadCount.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphShaderPayloadCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadCount(segment, 0L, value); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCount(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadCount(this.segment(), value); return this; }

    /// {@return `executionGraphDispatchAddressAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_executionGraphDispatchAddressAlignment(MemorySegment segment, long index) { return (int) VH_executionGraphDispatchAddressAlignment.get(segment, 0L, index); }
    /// {@return `executionGraphDispatchAddressAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_executionGraphDispatchAddressAlignment(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_executionGraphDispatchAddressAlignment(segment, 0L); }
    /// {@return `executionGraphDispatchAddressAlignment`}
    public @CType("uint32_t") int executionGraphDispatchAddressAlignment() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_executionGraphDispatchAddressAlignment(this.segment()); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_executionGraphDispatchAddressAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_executionGraphDispatchAddressAlignment.set(segment, 0L, index, value); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_executionGraphDispatchAddressAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_executionGraphDispatchAddressAlignment(segment, 0L, value); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_executionGraphDispatchAddressAlignment(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxExecutionGraphWorkgroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroupCount, index), ML_maxExecutionGraphWorkgroupCount); }
    /// {@return `maxExecutionGraphWorkgroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxExecutionGraphWorkgroupCount(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroupCount(segment, 0L); }
    /// {@return `maxExecutionGraphWorkgroupCount`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxExecutionGraphWorkgroupCount() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroupCount(this.segment()); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphWorkgroupCount(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroupCount, index), ML_maxExecutionGraphWorkgroupCount.byteSize()); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphWorkgroupCount(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroupCount(segment, 0L, value); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCount(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroupCount(this.segment(), value); return this; }

    /// {@return `maxExecutionGraphWorkgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxExecutionGraphWorkgroups(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphWorkgroups.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphWorkgroups`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxExecutionGraphWorkgroups(MemorySegment segment) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroups(segment, 0L); }
    /// {@return `maxExecutionGraphWorkgroups`}
    public @CType("uint32_t") int maxExecutionGraphWorkgroups() { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroups(this.segment()); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxExecutionGraphWorkgroups(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxExecutionGraphWorkgroups.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxExecutionGraphWorkgroups(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroups(segment, 0L, value); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroups(@CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroups(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderEnqueuePropertiesAMDX].
    public static final class Buffer extends VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX asSlice(long index) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphDepth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxExecutionGraphDepthAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphDepth(this.segment(), index); }
        /// Sets `maxExecutionGraphDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphDepthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphDepth(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphShaderOutputNodes` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxExecutionGraphShaderOutputNodesAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderOutputNodes(this.segment(), index); }
        /// Sets `maxExecutionGraphShaderOutputNodes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphShaderOutputNodesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderOutputNodes(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphShaderPayloadSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxExecutionGraphShaderPayloadSizeAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadSize(this.segment(), index); }
        /// Sets `maxExecutionGraphShaderPayloadSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphShaderPayloadSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadSize(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphShaderPayloadCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxExecutionGraphShaderPayloadCountAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphShaderPayloadCount(this.segment(), index); }
        /// Sets `maxExecutionGraphShaderPayloadCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphShaderPayloadCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphShaderPayloadCount(this.segment(), index, value); return this; }

        /// {@return `executionGraphDispatchAddressAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int executionGraphDispatchAddressAlignmentAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_executionGraphDispatchAddressAlignment(this.segment(), index); }
        /// Sets `executionGraphDispatchAddressAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer executionGraphDispatchAddressAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_executionGraphDispatchAddressAlignment(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxExecutionGraphWorkgroupCountAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroupCount(this.segment(), index); }
        /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphWorkgroupCountAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroupCount(this.segment(), index, value); return this; }

        /// {@return `maxExecutionGraphWorkgroups` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxExecutionGraphWorkgroupsAt(long index) { return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.get_maxExecutionGraphWorkgroups(this.segment(), index); }
        /// Sets `maxExecutionGraphWorkgroups` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxExecutionGraphWorkgroupsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderEnqueuePropertiesAMDX.set_maxExecutionGraphWorkgroups(this.segment(), index, value); return this; }

    }
}
