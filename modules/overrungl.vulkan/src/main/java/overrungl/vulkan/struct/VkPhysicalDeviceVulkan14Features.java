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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### globalPriorityQuery
/// [VarHandle][#VH_globalPriorityQuery] - [Getter][#globalPriorityQuery()] - [Setter][#globalPriorityQuery(int)]
/// ### shaderSubgroupRotate
/// [VarHandle][#VH_shaderSubgroupRotate] - [Getter][#shaderSubgroupRotate()] - [Setter][#shaderSubgroupRotate(int)]
/// ### shaderSubgroupRotateClustered
/// [VarHandle][#VH_shaderSubgroupRotateClustered] - [Getter][#shaderSubgroupRotateClustered()] - [Setter][#shaderSubgroupRotateClustered(int)]
/// ### shaderFloatControls2
/// [VarHandle][#VH_shaderFloatControls2] - [Getter][#shaderFloatControls2()] - [Setter][#shaderFloatControls2(int)]
/// ### shaderExpectAssume
/// [VarHandle][#VH_shaderExpectAssume] - [Getter][#shaderExpectAssume()] - [Setter][#shaderExpectAssume(int)]
/// ### rectangularLines
/// [VarHandle][#VH_rectangularLines] - [Getter][#rectangularLines()] - [Setter][#rectangularLines(int)]
/// ### bresenhamLines
/// [VarHandle][#VH_bresenhamLines] - [Getter][#bresenhamLines()] - [Setter][#bresenhamLines(int)]
/// ### smoothLines
/// [VarHandle][#VH_smoothLines] - [Getter][#smoothLines()] - [Setter][#smoothLines(int)]
/// ### stippledRectangularLines
/// [VarHandle][#VH_stippledRectangularLines] - [Getter][#stippledRectangularLines()] - [Setter][#stippledRectangularLines(int)]
/// ### stippledBresenhamLines
/// [VarHandle][#VH_stippledBresenhamLines] - [Getter][#stippledBresenhamLines()] - [Setter][#stippledBresenhamLines(int)]
/// ### stippledSmoothLines
/// [VarHandle][#VH_stippledSmoothLines] - [Getter][#stippledSmoothLines()] - [Setter][#stippledSmoothLines(int)]
/// ### vertexAttributeInstanceRateDivisor
/// [VarHandle][#VH_vertexAttributeInstanceRateDivisor] - [Getter][#vertexAttributeInstanceRateDivisor()] - [Setter][#vertexAttributeInstanceRateDivisor(int)]
/// ### vertexAttributeInstanceRateZeroDivisor
/// [VarHandle][#VH_vertexAttributeInstanceRateZeroDivisor] - [Getter][#vertexAttributeInstanceRateZeroDivisor()] - [Setter][#vertexAttributeInstanceRateZeroDivisor(int)]
/// ### indexTypeUint8
/// [VarHandle][#VH_indexTypeUint8] - [Getter][#indexTypeUint8()] - [Setter][#indexTypeUint8(int)]
/// ### dynamicRenderingLocalRead
/// [VarHandle][#VH_dynamicRenderingLocalRead] - [Getter][#dynamicRenderingLocalRead()] - [Setter][#dynamicRenderingLocalRead(int)]
/// ### maintenance5
/// [VarHandle][#VH_maintenance5] - [Getter][#maintenance5()] - [Setter][#maintenance5(int)]
/// ### maintenance6
/// [VarHandle][#VH_maintenance6] - [Getter][#maintenance6()] - [Setter][#maintenance6(int)]
/// ### pipelineProtectedAccess
/// [VarHandle][#VH_pipelineProtectedAccess] - [Getter][#pipelineProtectedAccess()] - [Setter][#pipelineProtectedAccess(int)]
/// ### pipelineRobustness
/// [VarHandle][#VH_pipelineRobustness] - [Getter][#pipelineRobustness()] - [Setter][#pipelineRobustness(int)]
/// ### hostImageCopy
/// [VarHandle][#VH_hostImageCopy] - [Getter][#hostImageCopy()] - [Setter][#hostImageCopy(int)]
/// ### pushDescriptor
/// [VarHandle][#VH_pushDescriptor] - [Getter][#pushDescriptor()] - [Setter][#pushDescriptor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan14Features {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 globalPriorityQuery;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
///     VkBool32 shaderFloatControls2;
///     VkBool32 shaderExpectAssume;
///     VkBool32 rectangularLines;
///     VkBool32 bresenhamLines;
///     VkBool32 smoothLines;
///     VkBool32 stippledRectangularLines;
///     VkBool32 stippledBresenhamLines;
///     VkBool32 stippledSmoothLines;
///     VkBool32 vertexAttributeInstanceRateDivisor;
///     VkBool32 vertexAttributeInstanceRateZeroDivisor;
///     VkBool32 indexTypeUint8;
///     VkBool32 dynamicRenderingLocalRead;
///     VkBool32 maintenance5;
///     VkBool32 maintenance6;
///     VkBool32 pipelineProtectedAccess;
///     VkBool32 pipelineRobustness;
///     VkBool32 hostImageCopy;
///     VkBool32 pushDescriptor;
/// } VkPhysicalDeviceVulkan14Features;
/// ```
public sealed class VkPhysicalDeviceVulkan14Features extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan14Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2"),
        ValueLayout.JAVA_INT.withName("shaderExpectAssume"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor"),
        ValueLayout.JAVA_INT.withName("indexTypeUint8"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead"),
        ValueLayout.JAVA_INT.withName("maintenance5"),
        ValueLayout.JAVA_INT.withName("maintenance6"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess"),
        ValueLayout.JAVA_INT.withName("pipelineRobustness"),
        ValueLayout.JAVA_INT.withName("hostImageCopy"),
        ValueLayout.JAVA_INT.withName("pushDescriptor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `globalPriorityQuery` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_globalPriorityQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriorityQuery"));
    /// The [VarHandle] of `shaderSubgroupRotate` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupRotate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotate"));
    /// The [VarHandle] of `shaderSubgroupRotateClustered` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupRotateClustered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));
    /// The [VarHandle] of `shaderFloatControls2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderFloatControls2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloatControls2"));
    /// The [VarHandle] of `shaderExpectAssume` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderExpectAssume = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderExpectAssume"));
    /// The [VarHandle] of `rectangularLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines"));
    /// The [VarHandle] of `bresenhamLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines"));
    /// The [VarHandle] of `smoothLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_smoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines"));
    /// The [VarHandle] of `stippledRectangularLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledRectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines"));
    /// The [VarHandle] of `stippledBresenhamLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledBresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines"));
    /// The [VarHandle] of `stippledSmoothLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stippledSmoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines"));
    /// The [VarHandle] of `vertexAttributeInstanceRateDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateZeroDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The [VarHandle] of `indexTypeUint8` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_indexTypeUint8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeUint8"));
    /// The [VarHandle] of `dynamicRenderingLocalRead` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicRenderingLocalRead = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The [VarHandle] of `maintenance5` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maintenance5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance5"));
    /// The [VarHandle] of `maintenance6` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maintenance6 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance6"));
    /// The [VarHandle] of `pipelineProtectedAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineProtectedAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineProtectedAccess"));
    /// The [VarHandle] of `pipelineRobustness` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineRobustness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineRobustness"));
    /// The [VarHandle] of `hostImageCopy` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hostImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostImageCopy"));
    /// The [VarHandle] of `pushDescriptor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushDescriptor"));

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan14Features(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Features of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Features ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceVulkan14Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan14Features`
    public static VkPhysicalDeviceVulkan14Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Features(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan14Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan14Features`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVulkan14Features` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan14Features`
    public static VkPhysicalDeviceVulkan14Features allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int globalPriorityQuery, @CType("VkBool32") int shaderSubgroupRotate, @CType("VkBool32") int shaderSubgroupRotateClustered, @CType("VkBool32") int shaderFloatControls2, @CType("VkBool32") int shaderExpectAssume, @CType("VkBool32") int rectangularLines, @CType("VkBool32") int bresenhamLines, @CType("VkBool32") int smoothLines, @CType("VkBool32") int stippledRectangularLines, @CType("VkBool32") int stippledBresenhamLines, @CType("VkBool32") int stippledSmoothLines, @CType("VkBool32") int vertexAttributeInstanceRateDivisor, @CType("VkBool32") int vertexAttributeInstanceRateZeroDivisor, @CType("VkBool32") int indexTypeUint8, @CType("VkBool32") int dynamicRenderingLocalRead, @CType("VkBool32") int maintenance5, @CType("VkBool32") int maintenance6, @CType("VkBool32") int pipelineProtectedAccess, @CType("VkBool32") int pipelineRobustness, @CType("VkBool32") int hostImageCopy, @CType("VkBool32") int pushDescriptor) { return alloc(allocator).sType(sType).pNext(pNext).globalPriorityQuery(globalPriorityQuery).shaderSubgroupRotate(shaderSubgroupRotate).shaderSubgroupRotateClustered(shaderSubgroupRotateClustered).shaderFloatControls2(shaderFloatControls2).shaderExpectAssume(shaderExpectAssume).rectangularLines(rectangularLines).bresenhamLines(bresenhamLines).smoothLines(smoothLines).stippledRectangularLines(stippledRectangularLines).stippledBresenhamLines(stippledBresenhamLines).stippledSmoothLines(stippledSmoothLines).vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor).vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor).indexTypeUint8(indexTypeUint8).dynamicRenderingLocalRead(dynamicRenderingLocalRead).maintenance5(maintenance5).maintenance6(maintenance6).pipelineProtectedAccess(pipelineProtectedAccess).pipelineRobustness(pipelineRobustness).hostImageCopy(hostImageCopy).pushDescriptor(pushDescriptor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features copyFrom(VkPhysicalDeviceVulkan14Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan14Features.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Features.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Features.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceVulkan14Features.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan14Features.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan14Features.set_pNext(this.segment(), value); return this; }

    /// {@return `globalPriorityQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_globalPriorityQuery(MemorySegment segment, long index) { return (int) VH_globalPriorityQuery.get(segment, 0L, index); }
    /// {@return `globalPriorityQuery`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_globalPriorityQuery(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_globalPriorityQuery(segment, 0L); }
    /// {@return `globalPriorityQuery`}
    public @CType("VkBool32") int globalPriorityQuery() { return VkPhysicalDeviceVulkan14Features.get_globalPriorityQuery(this.segment()); }
    /// Sets `globalPriorityQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_globalPriorityQuery(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_globalPriorityQuery.set(segment, 0L, index, value); }
    /// Sets `globalPriorityQuery` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_globalPriorityQuery(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_globalPriorityQuery(segment, 0L, value); }
    /// Sets `globalPriorityQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_globalPriorityQuery(this.segment(), value); return this; }

    /// {@return `shaderSubgroupRotate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupRotate(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotate.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotate`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupRotate(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotate(segment, 0L); }
    /// {@return `shaderSubgroupRotate`}
    public @CType("VkBool32") int shaderSubgroupRotate() { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotate(this.segment()); }
    /// Sets `shaderSubgroupRotate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupRotate(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupRotate.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupRotate(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotate(segment, 0L, value); }
    /// Sets `shaderSubgroupRotate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotate(this.segment(), value); return this; }

    /// {@return `shaderSubgroupRotateClustered` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupRotateClustered(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotateClustered.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotateClustered`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupRotateClustered(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotateClustered(segment, 0L); }
    /// {@return `shaderSubgroupRotateClustered`}
    public @CType("VkBool32") int shaderSubgroupRotateClustered() { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotateClustered(this.segment()); }
    /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupRotateClustered(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupRotateClustered.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotateClustered` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupRotateClustered(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotateClustered(segment, 0L, value); }
    /// Sets `shaderSubgroupRotateClustered` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotateClustered(this.segment(), value); return this; }

    /// {@return `shaderFloatControls2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderFloatControls2(MemorySegment segment, long index) { return (int) VH_shaderFloatControls2.get(segment, 0L, index); }
    /// {@return `shaderFloatControls2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderFloatControls2(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_shaderFloatControls2(segment, 0L); }
    /// {@return `shaderFloatControls2`}
    public @CType("VkBool32") int shaderFloatControls2() { return VkPhysicalDeviceVulkan14Features.get_shaderFloatControls2(this.segment()); }
    /// Sets `shaderFloatControls2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderFloatControls2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderFloatControls2.set(segment, 0L, index, value); }
    /// Sets `shaderFloatControls2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderFloatControls2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderFloatControls2(segment, 0L, value); }
    /// Sets `shaderFloatControls2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderFloatControls2(this.segment(), value); return this; }

    /// {@return `shaderExpectAssume` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderExpectAssume(MemorySegment segment, long index) { return (int) VH_shaderExpectAssume.get(segment, 0L, index); }
    /// {@return `shaderExpectAssume`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderExpectAssume(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_shaderExpectAssume(segment, 0L); }
    /// {@return `shaderExpectAssume`}
    public @CType("VkBool32") int shaderExpectAssume() { return VkPhysicalDeviceVulkan14Features.get_shaderExpectAssume(this.segment()); }
    /// Sets `shaderExpectAssume` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderExpectAssume(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderExpectAssume.set(segment, 0L, index, value); }
    /// Sets `shaderExpectAssume` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderExpectAssume(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderExpectAssume(segment, 0L, value); }
    /// Sets `shaderExpectAssume` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderExpectAssume(this.segment(), value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rectangularLines(MemorySegment segment, long index) { return (int) VH_rectangularLines.get(segment, 0L, index); }
    /// {@return `rectangularLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rectangularLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_rectangularLines(segment, 0L); }
    /// {@return `rectangularLines`}
    public @CType("VkBool32") int rectangularLines() { return VkPhysicalDeviceVulkan14Features.get_rectangularLines(this.segment()); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rectangularLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rectangularLines.set(segment, 0L, index, value); }
    /// Sets `rectangularLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rectangularLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_rectangularLines(segment, 0L, value); }
    /// Sets `rectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features rectangularLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_rectangularLines(this.segment(), value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_bresenhamLines(MemorySegment segment, long index) { return (int) VH_bresenhamLines.get(segment, 0L, index); }
    /// {@return `bresenhamLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_bresenhamLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_bresenhamLines(segment, 0L); }
    /// {@return `bresenhamLines`}
    public @CType("VkBool32") int bresenhamLines() { return VkPhysicalDeviceVulkan14Features.get_bresenhamLines(this.segment()); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bresenhamLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_bresenhamLines.set(segment, 0L, index, value); }
    /// Sets `bresenhamLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bresenhamLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_bresenhamLines(segment, 0L, value); }
    /// Sets `bresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features bresenhamLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_bresenhamLines(this.segment(), value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_smoothLines(MemorySegment segment, long index) { return (int) VH_smoothLines.get(segment, 0L, index); }
    /// {@return `smoothLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_smoothLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_smoothLines(segment, 0L); }
    /// {@return `smoothLines`}
    public @CType("VkBool32") int smoothLines() { return VkPhysicalDeviceVulkan14Features.get_smoothLines(this.segment()); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_smoothLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_smoothLines.set(segment, 0L, index, value); }
    /// Sets `smoothLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_smoothLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_smoothLines(segment, 0L, value); }
    /// Sets `smoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features smoothLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_smoothLines(this.segment(), value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledRectangularLines(MemorySegment segment, long index) { return (int) VH_stippledRectangularLines.get(segment, 0L, index); }
    /// {@return `stippledRectangularLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledRectangularLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_stippledRectangularLines(segment, 0L); }
    /// {@return `stippledRectangularLines`}
    public @CType("VkBool32") int stippledRectangularLines() { return VkPhysicalDeviceVulkan14Features.get_stippledRectangularLines(this.segment()); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledRectangularLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledRectangularLines.set(segment, 0L, index, value); }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledRectangularLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledRectangularLines(segment, 0L, value); }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledRectangularLines(this.segment(), value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledBresenhamLines(MemorySegment segment, long index) { return (int) VH_stippledBresenhamLines.get(segment, 0L, index); }
    /// {@return `stippledBresenhamLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledBresenhamLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_stippledBresenhamLines(segment, 0L); }
    /// {@return `stippledBresenhamLines`}
    public @CType("VkBool32") int stippledBresenhamLines() { return VkPhysicalDeviceVulkan14Features.get_stippledBresenhamLines(this.segment()); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledBresenhamLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledBresenhamLines.set(segment, 0L, index, value); }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledBresenhamLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledBresenhamLines(segment, 0L, value); }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledBresenhamLines(this.segment(), value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stippledSmoothLines(MemorySegment segment, long index) { return (int) VH_stippledSmoothLines.get(segment, 0L, index); }
    /// {@return `stippledSmoothLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stippledSmoothLines(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_stippledSmoothLines(segment, 0L); }
    /// {@return `stippledSmoothLines`}
    public @CType("VkBool32") int stippledSmoothLines() { return VkPhysicalDeviceVulkan14Features.get_stippledSmoothLines(this.segment()); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stippledSmoothLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stippledSmoothLines.set(segment, 0L, index, value); }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stippledSmoothLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledSmoothLines(segment, 0L, value); }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledSmoothLines(this.segment(), value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateDivisor(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateDivisor(segment, 0L); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    public @CType("VkBool32") int vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateDivisor(this.segment()); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateDivisor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexAttributeInstanceRateDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateDivisor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateDivisor(segment, 0L, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateDivisor(this.segment(), value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateZeroDivisor(segment, 0L); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    public @CType("VkBool32") int vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateZeroDivisor(this.segment()); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateZeroDivisor(segment, 0L, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateZeroDivisor(this.segment(), value); return this; }

    /// {@return `indexTypeUint8` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_indexTypeUint8(MemorySegment segment, long index) { return (int) VH_indexTypeUint8.get(segment, 0L, index); }
    /// {@return `indexTypeUint8`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_indexTypeUint8(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_indexTypeUint8(segment, 0L); }
    /// {@return `indexTypeUint8`}
    public @CType("VkBool32") int indexTypeUint8() { return VkPhysicalDeviceVulkan14Features.get_indexTypeUint8(this.segment()); }
    /// Sets `indexTypeUint8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indexTypeUint8(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_indexTypeUint8.set(segment, 0L, index, value); }
    /// Sets `indexTypeUint8` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indexTypeUint8(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_indexTypeUint8(segment, 0L, value); }
    /// Sets `indexTypeUint8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_indexTypeUint8(this.segment(), value); return this; }

    /// {@return `dynamicRenderingLocalRead` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicRenderingLocalRead(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalRead.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalRead`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicRenderingLocalRead(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_dynamicRenderingLocalRead(segment, 0L); }
    /// {@return `dynamicRenderingLocalRead`}
    public @CType("VkBool32") int dynamicRenderingLocalRead() { return VkPhysicalDeviceVulkan14Features.get_dynamicRenderingLocalRead(this.segment()); }
    /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicRenderingLocalRead(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicRenderingLocalRead.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalRead` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicRenderingLocalRead(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_dynamicRenderingLocalRead(segment, 0L, value); }
    /// Sets `dynamicRenderingLocalRead` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_dynamicRenderingLocalRead(this.segment(), value); return this; }

    /// {@return `maintenance5` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_maintenance5(MemorySegment segment, long index) { return (int) VH_maintenance5.get(segment, 0L, index); }
    /// {@return `maintenance5`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_maintenance5(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_maintenance5(segment, 0L); }
    /// {@return `maintenance5`}
    public @CType("VkBool32") int maintenance5() { return VkPhysicalDeviceVulkan14Features.get_maintenance5(this.segment()); }
    /// Sets `maintenance5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maintenance5(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_maintenance5.set(segment, 0L, index, value); }
    /// Sets `maintenance5` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maintenance5(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance5(segment, 0L, value); }
    /// Sets `maintenance5` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance5(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance5(this.segment(), value); return this; }

    /// {@return `maintenance6` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_maintenance6(MemorySegment segment, long index) { return (int) VH_maintenance6.get(segment, 0L, index); }
    /// {@return `maintenance6`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_maintenance6(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_maintenance6(segment, 0L); }
    /// {@return `maintenance6`}
    public @CType("VkBool32") int maintenance6() { return VkPhysicalDeviceVulkan14Features.get_maintenance6(this.segment()); }
    /// Sets `maintenance6` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maintenance6(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_maintenance6.set(segment, 0L, index, value); }
    /// Sets `maintenance6` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maintenance6(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance6(segment, 0L, value); }
    /// Sets `maintenance6` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance6(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance6(this.segment(), value); return this; }

    /// {@return `pipelineProtectedAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineProtectedAccess(MemorySegment segment, long index) { return (int) VH_pipelineProtectedAccess.get(segment, 0L, index); }
    /// {@return `pipelineProtectedAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineProtectedAccess(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_pipelineProtectedAccess(segment, 0L); }
    /// {@return `pipelineProtectedAccess`}
    public @CType("VkBool32") int pipelineProtectedAccess() { return VkPhysicalDeviceVulkan14Features.get_pipelineProtectedAccess(this.segment()); }
    /// Sets `pipelineProtectedAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineProtectedAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineProtectedAccess.set(segment, 0L, index, value); }
    /// Sets `pipelineProtectedAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineProtectedAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineProtectedAccess(segment, 0L, value); }
    /// Sets `pipelineProtectedAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineProtectedAccess(this.segment(), value); return this; }

    /// {@return `pipelineRobustness` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineRobustness(MemorySegment segment, long index) { return (int) VH_pipelineRobustness.get(segment, 0L, index); }
    /// {@return `pipelineRobustness`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineRobustness(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_pipelineRobustness(segment, 0L); }
    /// {@return `pipelineRobustness`}
    public @CType("VkBool32") int pipelineRobustness() { return VkPhysicalDeviceVulkan14Features.get_pipelineRobustness(this.segment()); }
    /// Sets `pipelineRobustness` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineRobustness(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineRobustness.set(segment, 0L, index, value); }
    /// Sets `pipelineRobustness` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineRobustness(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineRobustness(segment, 0L, value); }
    /// Sets `pipelineRobustness` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineRobustness(this.segment(), value); return this; }

    /// {@return `hostImageCopy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hostImageCopy(MemorySegment segment, long index) { return (int) VH_hostImageCopy.get(segment, 0L, index); }
    /// {@return `hostImageCopy`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hostImageCopy(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_hostImageCopy(segment, 0L); }
    /// {@return `hostImageCopy`}
    public @CType("VkBool32") int hostImageCopy() { return VkPhysicalDeviceVulkan14Features.get_hostImageCopy(this.segment()); }
    /// Sets `hostImageCopy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hostImageCopy(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hostImageCopy.set(segment, 0L, index, value); }
    /// Sets `hostImageCopy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hostImageCopy(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_hostImageCopy(segment, 0L, value); }
    /// Sets `hostImageCopy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features hostImageCopy(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_hostImageCopy(this.segment(), value); return this; }

    /// {@return `pushDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pushDescriptor(MemorySegment segment, long index) { return (int) VH_pushDescriptor.get(segment, 0L, index); }
    /// {@return `pushDescriptor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pushDescriptor(MemorySegment segment) { return VkPhysicalDeviceVulkan14Features.get_pushDescriptor(segment, 0L); }
    /// {@return `pushDescriptor`}
    public @CType("VkBool32") int pushDescriptor() { return VkPhysicalDeviceVulkan14Features.get_pushDescriptor(this.segment()); }
    /// Sets `pushDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushDescriptor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pushDescriptor.set(segment, 0L, index, value); }
    /// Sets `pushDescriptor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushDescriptor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pushDescriptor(segment, 0L, value); }
    /// Sets `pushDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pushDescriptor(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pushDescriptor(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkan14Features].
    public static final class Buffer extends VkPhysicalDeviceVulkan14Features {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkan14Features.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkan14Features`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkan14Features`
        public VkPhysicalDeviceVulkan14Features asSlice(long index) { return new VkPhysicalDeviceVulkan14Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkan14Features`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkan14Features`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan14Features.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Features.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan14Features.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceVulkan14Features.set_pNext(this.segment(), index, value); return this; }

        /// {@return `globalPriorityQuery` at the given index}
        /// @param index the index
        public @CType("VkBool32") int globalPriorityQueryAt(long index) { return VkPhysicalDeviceVulkan14Features.get_globalPriorityQuery(this.segment(), index); }
        /// Sets `globalPriorityQuery` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer globalPriorityQueryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_globalPriorityQuery(this.segment(), index, value); return this; }

        /// {@return `shaderSubgroupRotate` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSubgroupRotateAt(long index) { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotate(this.segment(), index); }
        /// Sets `shaderSubgroupRotate` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSubgroupRotateAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotate(this.segment(), index, value); return this; }

        /// {@return `shaderSubgroupRotateClustered` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderSubgroupRotateClusteredAt(long index) { return VkPhysicalDeviceVulkan14Features.get_shaderSubgroupRotateClustered(this.segment(), index); }
        /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderSubgroupRotateClusteredAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderSubgroupRotateClustered(this.segment(), index, value); return this; }

        /// {@return `shaderFloatControls2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderFloatControls2At(long index) { return VkPhysicalDeviceVulkan14Features.get_shaderFloatControls2(this.segment(), index); }
        /// Sets `shaderFloatControls2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderFloatControls2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderFloatControls2(this.segment(), index, value); return this; }

        /// {@return `shaderExpectAssume` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shaderExpectAssumeAt(long index) { return VkPhysicalDeviceVulkan14Features.get_shaderExpectAssume(this.segment(), index); }
        /// Sets `shaderExpectAssume` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderExpectAssumeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_shaderExpectAssume(this.segment(), index, value); return this; }

        /// {@return `rectangularLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int rectangularLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_rectangularLines(this.segment(), index); }
        /// Sets `rectangularLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rectangularLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_rectangularLines(this.segment(), index, value); return this; }

        /// {@return `bresenhamLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int bresenhamLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_bresenhamLines(this.segment(), index); }
        /// Sets `bresenhamLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bresenhamLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_bresenhamLines(this.segment(), index, value); return this; }

        /// {@return `smoothLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int smoothLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_smoothLines(this.segment(), index); }
        /// Sets `smoothLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer smoothLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_smoothLines(this.segment(), index, value); return this; }

        /// {@return `stippledRectangularLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int stippledRectangularLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_stippledRectangularLines(this.segment(), index); }
        /// Sets `stippledRectangularLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stippledRectangularLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledRectangularLines(this.segment(), index, value); return this; }

        /// {@return `stippledBresenhamLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int stippledBresenhamLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_stippledBresenhamLines(this.segment(), index); }
        /// Sets `stippledBresenhamLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stippledBresenhamLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledBresenhamLines(this.segment(), index, value); return this; }

        /// {@return `stippledSmoothLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int stippledSmoothLinesAt(long index) { return VkPhysicalDeviceVulkan14Features.get_stippledSmoothLines(this.segment(), index); }
        /// Sets `stippledSmoothLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stippledSmoothLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_stippledSmoothLines(this.segment(), index, value); return this; }

        /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vertexAttributeInstanceRateDivisorAt(long index) { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateDivisor(this.segment(), index); }
        /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexAttributeInstanceRateDivisorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateDivisor(this.segment(), index, value); return this; }

        /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
        /// @param index the index
        public @CType("VkBool32") int vertexAttributeInstanceRateZeroDivisorAt(long index) { return VkPhysicalDeviceVulkan14Features.get_vertexAttributeInstanceRateZeroDivisor(this.segment(), index); }
        /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer vertexAttributeInstanceRateZeroDivisorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_vertexAttributeInstanceRateZeroDivisor(this.segment(), index, value); return this; }

        /// {@return `indexTypeUint8` at the given index}
        /// @param index the index
        public @CType("VkBool32") int indexTypeUint8At(long index) { return VkPhysicalDeviceVulkan14Features.get_indexTypeUint8(this.segment(), index); }
        /// Sets `indexTypeUint8` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indexTypeUint8At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_indexTypeUint8(this.segment(), index, value); return this; }

        /// {@return `dynamicRenderingLocalRead` at the given index}
        /// @param index the index
        public @CType("VkBool32") int dynamicRenderingLocalReadAt(long index) { return VkPhysicalDeviceVulkan14Features.get_dynamicRenderingLocalRead(this.segment(), index); }
        /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dynamicRenderingLocalReadAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_dynamicRenderingLocalRead(this.segment(), index, value); return this; }

        /// {@return `maintenance5` at the given index}
        /// @param index the index
        public @CType("VkBool32") int maintenance5At(long index) { return VkPhysicalDeviceVulkan14Features.get_maintenance5(this.segment(), index); }
        /// Sets `maintenance5` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maintenance5At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance5(this.segment(), index, value); return this; }

        /// {@return `maintenance6` at the given index}
        /// @param index the index
        public @CType("VkBool32") int maintenance6At(long index) { return VkPhysicalDeviceVulkan14Features.get_maintenance6(this.segment(), index); }
        /// Sets `maintenance6` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maintenance6At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_maintenance6(this.segment(), index, value); return this; }

        /// {@return `pipelineProtectedAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int pipelineProtectedAccessAt(long index) { return VkPhysicalDeviceVulkan14Features.get_pipelineProtectedAccess(this.segment(), index); }
        /// Sets `pipelineProtectedAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineProtectedAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineProtectedAccess(this.segment(), index, value); return this; }

        /// {@return `pipelineRobustness` at the given index}
        /// @param index the index
        public @CType("VkBool32") int pipelineRobustnessAt(long index) { return VkPhysicalDeviceVulkan14Features.get_pipelineRobustness(this.segment(), index); }
        /// Sets `pipelineRobustness` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineRobustnessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pipelineRobustness(this.segment(), index, value); return this; }

        /// {@return `hostImageCopy` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hostImageCopyAt(long index) { return VkPhysicalDeviceVulkan14Features.get_hostImageCopy(this.segment(), index); }
        /// Sets `hostImageCopy` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hostImageCopyAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_hostImageCopy(this.segment(), index, value); return this; }

        /// {@return `pushDescriptor` at the given index}
        /// @param index the index
        public @CType("VkBool32") int pushDescriptorAt(long index) { return VkPhysicalDeviceVulkan14Features.get_pushDescriptor(this.segment(), index); }
        /// Sets `pushDescriptor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushDescriptorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Features.set_pushDescriptor(this.segment(), index, value); return this; }

    }
}
