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
//@formatter:off
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxExecutionGraphDepth;
///     uint32_t maxExecutionGraphShaderOutputNodes;
///     uint32_t maxExecutionGraphShaderPayloadSize;
///     uint32_t maxExecutionGraphShaderPayloadCount;
///     uint32_t executionGraphDispatchAddressAlignment;
///     uint32_t maxExecutionGraphWorkgroupCount[3];
///     uint32_t maxExecutionGraphWorkgroups;
/// };
/// ```
public final class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `maxExecutionGraphDepth`.
    public static final long OFFSET_maxExecutionGraphDepth = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphDepth"));
    /// The memory layout of `maxExecutionGraphDepth`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphDepth = LAYOUT.select(PathElement.groupElement("maxExecutionGraphDepth"));
    /// The [VarHandle] of `maxExecutionGraphDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphDepth"));
    /// The byte offset of `maxExecutionGraphShaderOutputNodes`.
    public static final long OFFSET_maxExecutionGraphShaderOutputNodes = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    /// The memory layout of `maxExecutionGraphShaderOutputNodes`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderOutputNodes = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    /// The [VarHandle] of `maxExecutionGraphShaderOutputNodes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphShaderOutputNodes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderOutputNodes"));
    /// The byte offset of `maxExecutionGraphShaderPayloadSize`.
    public static final long OFFSET_maxExecutionGraphShaderPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    /// The memory layout of `maxExecutionGraphShaderPayloadSize`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderPayloadSize = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    /// The [VarHandle] of `maxExecutionGraphShaderPayloadSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphShaderPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadSize"));
    /// The byte offset of `maxExecutionGraphShaderPayloadCount`.
    public static final long OFFSET_maxExecutionGraphShaderPayloadCount = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    /// The memory layout of `maxExecutionGraphShaderPayloadCount`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphShaderPayloadCount = LAYOUT.select(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    /// The [VarHandle] of `maxExecutionGraphShaderPayloadCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphShaderPayloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphShaderPayloadCount"));
    /// The byte offset of `executionGraphDispatchAddressAlignment`.
    public static final long OFFSET_executionGraphDispatchAddressAlignment = LAYOUT.byteOffset(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    /// The memory layout of `executionGraphDispatchAddressAlignment`.
    public static final MemoryLayout LAYOUT_executionGraphDispatchAddressAlignment = LAYOUT.select(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    /// The [VarHandle] of `executionGraphDispatchAddressAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_executionGraphDispatchAddressAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("executionGraphDispatchAddressAlignment"));
    /// The byte offset of `maxExecutionGraphWorkgroupCount`.
    public static final long OFFSET_maxExecutionGraphWorkgroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    /// The memory layout of `maxExecutionGraphWorkgroupCount`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphWorkgroupCount = LAYOUT.select(PathElement.groupElement("maxExecutionGraphWorkgroupCount"));
    /// The [VarHandle] of `maxExecutionGraphWorkgroupCount` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphWorkgroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphWorkgroupCount"), PathElement.sequenceElement());
    /// The byte offset of `maxExecutionGraphWorkgroups`.
    public static final long OFFSET_maxExecutionGraphWorkgroups = LAYOUT.byteOffset(PathElement.groupElement("maxExecutionGraphWorkgroups"));
    /// The memory layout of `maxExecutionGraphWorkgroups`.
    public static final MemoryLayout LAYOUT_maxExecutionGraphWorkgroups = LAYOUT.select(PathElement.groupElement("maxExecutionGraphWorkgroups"));
    /// The [VarHandle] of `maxExecutionGraphWorkgroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExecutionGraphWorkgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExecutionGraphWorkgroups"));

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX copyFrom(VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX reinterpret(long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxExecutionGraphDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExecutionGraphDepth(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphDepth.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphDepth`}
    public int maxExecutionGraphDepth() { return maxExecutionGraphDepth(this.segment(), 0L); }
    /// Sets `maxExecutionGraphDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphDepth(MemorySegment segment, long index, int value) { VH_maxExecutionGraphDepth.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepth(int value) { maxExecutionGraphDepth(this.segment(), 0L, value); return this; }

    /// {@return `maxExecutionGraphShaderOutputNodes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExecutionGraphShaderOutputNodes(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderOutputNodes.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderOutputNodes`}
    public int maxExecutionGraphShaderOutputNodes() { return maxExecutionGraphShaderOutputNodes(this.segment(), 0L); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphShaderOutputNodes(MemorySegment segment, long index, int value) { VH_maxExecutionGraphShaderOutputNodes.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodes(int value) { maxExecutionGraphShaderOutputNodes(this.segment(), 0L, value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExecutionGraphShaderPayloadSize(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderPayloadSize.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderPayloadSize`}
    public int maxExecutionGraphShaderPayloadSize() { return maxExecutionGraphShaderPayloadSize(this.segment(), 0L); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphShaderPayloadSize(MemorySegment segment, long index, int value) { VH_maxExecutionGraphShaderPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSize(int value) { maxExecutionGraphShaderPayloadSize(this.segment(), 0L, value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExecutionGraphShaderPayloadCount(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphShaderPayloadCount.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphShaderPayloadCount`}
    public int maxExecutionGraphShaderPayloadCount() { return maxExecutionGraphShaderPayloadCount(this.segment(), 0L); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphShaderPayloadCount(MemorySegment segment, long index, int value) { VH_maxExecutionGraphShaderPayloadCount.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCount(int value) { maxExecutionGraphShaderPayloadCount(this.segment(), 0L, value); return this; }

    /// {@return `executionGraphDispatchAddressAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int executionGraphDispatchAddressAlignment(MemorySegment segment, long index) { return (int) VH_executionGraphDispatchAddressAlignment.get(segment, 0L, index); }
    /// {@return `executionGraphDispatchAddressAlignment`}
    public int executionGraphDispatchAddressAlignment() { return executionGraphDispatchAddressAlignment(this.segment(), 0L); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void executionGraphDispatchAddressAlignment(MemorySegment segment, long index, int value) { VH_executionGraphDispatchAddressAlignment.set(segment, 0L, index, value); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignment(int value) { executionGraphDispatchAddressAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxExecutionGraphWorkgroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroupCount, index), LAYOUT_maxExecutionGraphWorkgroupCount); }
    /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxExecutionGraphWorkgroupCount(MemorySegment segment, long index, long index0) { return (int) VH_maxExecutionGraphWorkgroupCount.get(segment, 0L, index, index0); }
    /// {@return `maxExecutionGraphWorkgroupCount`}
    public MemorySegment maxExecutionGraphWorkgroupCount() { return maxExecutionGraphWorkgroupCount(this.segment(), 0L); }
    /// {@return `maxExecutionGraphWorkgroupCount`}
    /// @param index0 the Index 0 of the array
    public int maxExecutionGraphWorkgroupCount(long index0) { return maxExecutionGraphWorkgroupCount(this.segment(), 0L, index0); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphWorkgroupCount(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxExecutionGraphWorkgroupCount, index), LAYOUT_maxExecutionGraphWorkgroupCount.byteSize()); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxExecutionGraphWorkgroupCount(MemorySegment segment, long index, long index0, int value) { VH_maxExecutionGraphWorkgroupCount.set(segment, 0L, index, index0, value); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCount(MemorySegment value) { maxExecutionGraphWorkgroupCount(this.segment(), 0L, value); return this; }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCount(long index0, int value) { maxExecutionGraphWorkgroupCount(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxExecutionGraphWorkgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExecutionGraphWorkgroups(MemorySegment segment, long index) { return (int) VH_maxExecutionGraphWorkgroups.get(segment, 0L, index); }
    /// {@return `maxExecutionGraphWorkgroups`}
    public int maxExecutionGraphWorkgroups() { return maxExecutionGraphWorkgroups(this.segment(), 0L); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExecutionGraphWorkgroups(MemorySegment segment, long index, int value) { VH_maxExecutionGraphWorkgroups.set(segment, 0L, index, value); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroups(int value) { maxExecutionGraphWorkgroups(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX asSlice(long index) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderEnqueuePropertiesAMDX`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX asSlice(long index, long count) { return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderEnqueuePropertiesAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX at(long index, Consumer<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxExecutionGraphDepth` at the given index}
    /// @param index the index of the struct buffer
    public int maxExecutionGraphDepthAt(long index) { return maxExecutionGraphDepth(this.segment(), index); }
    /// Sets `maxExecutionGraphDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphDepthAt(long index, int value) { maxExecutionGraphDepth(this.segment(), index, value); return this; }

    /// {@return `maxExecutionGraphShaderOutputNodes` at the given index}
    /// @param index the index of the struct buffer
    public int maxExecutionGraphShaderOutputNodesAt(long index) { return maxExecutionGraphShaderOutputNodes(this.segment(), index); }
    /// Sets `maxExecutionGraphShaderOutputNodes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderOutputNodesAt(long index, int value) { maxExecutionGraphShaderOutputNodes(this.segment(), index, value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxExecutionGraphShaderPayloadSizeAt(long index) { return maxExecutionGraphShaderPayloadSize(this.segment(), index); }
    /// Sets `maxExecutionGraphShaderPayloadSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadSizeAt(long index, int value) { maxExecutionGraphShaderPayloadSize(this.segment(), index, value); return this; }

    /// {@return `maxExecutionGraphShaderPayloadCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxExecutionGraphShaderPayloadCountAt(long index) { return maxExecutionGraphShaderPayloadCount(this.segment(), index); }
    /// Sets `maxExecutionGraphShaderPayloadCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphShaderPayloadCountAt(long index, int value) { maxExecutionGraphShaderPayloadCount(this.segment(), index, value); return this; }

    /// {@return `executionGraphDispatchAddressAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int executionGraphDispatchAddressAlignmentAt(long index) { return executionGraphDispatchAddressAlignment(this.segment(), index); }
    /// Sets `executionGraphDispatchAddressAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX executionGraphDispatchAddressAlignmentAt(long index, int value) { executionGraphDispatchAddressAlignment(this.segment(), index, value); return this; }

    /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxExecutionGraphWorkgroupCountAt(long index) { return maxExecutionGraphWorkgroupCount(this.segment(), index); }
    /// {@return `maxExecutionGraphWorkgroupCount` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int maxExecutionGraphWorkgroupCountAt(long index, long index0) { return maxExecutionGraphWorkgroupCount(this.segment(), index, index0); }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCountAt(long index, MemorySegment value) { maxExecutionGraphWorkgroupCount(this.segment(), index, value); return this; }
    /// Sets `maxExecutionGraphWorkgroupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupCountAt(long index, long index0, int value) { maxExecutionGraphWorkgroupCount(this.segment(), index, index0, value); return this; }

    /// {@return `maxExecutionGraphWorkgroups` at the given index}
    /// @param index the index of the struct buffer
    public int maxExecutionGraphWorkgroupsAt(long index) { return maxExecutionGraphWorkgroups(this.segment(), index); }
    /// Sets `maxExecutionGraphWorkgroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX maxExecutionGraphWorkgroupsAt(long index, int value) { maxExecutionGraphWorkgroups(this.segment(), index, value); return this; }

}
