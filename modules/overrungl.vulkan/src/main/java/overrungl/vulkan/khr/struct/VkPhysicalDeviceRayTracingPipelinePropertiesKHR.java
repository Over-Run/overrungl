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
package overrungl.vulkan.khr.struct;

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
/// ### shaderGroupHandleSize
/// [VarHandle][#VH_shaderGroupHandleSize] - [Getter][#shaderGroupHandleSize()] - [Setter][#shaderGroupHandleSize(int)]
/// ### maxRayRecursionDepth
/// [VarHandle][#VH_maxRayRecursionDepth] - [Getter][#maxRayRecursionDepth()] - [Setter][#maxRayRecursionDepth(int)]
/// ### maxShaderGroupStride
/// [VarHandle][#VH_maxShaderGroupStride] - [Getter][#maxShaderGroupStride()] - [Setter][#maxShaderGroupStride(int)]
/// ### shaderGroupBaseAlignment
/// [VarHandle][#VH_shaderGroupBaseAlignment] - [Getter][#shaderGroupBaseAlignment()] - [Setter][#shaderGroupBaseAlignment(int)]
/// ### shaderGroupHandleCaptureReplaySize
/// [VarHandle][#VH_shaderGroupHandleCaptureReplaySize] - [Getter][#shaderGroupHandleCaptureReplaySize()] - [Setter][#shaderGroupHandleCaptureReplaySize(int)]
/// ### maxRayDispatchInvocationCount
/// [VarHandle][#VH_maxRayDispatchInvocationCount] - [Getter][#maxRayDispatchInvocationCount()] - [Setter][#maxRayDispatchInvocationCount(int)]
/// ### shaderGroupHandleAlignment
/// [VarHandle][#VH_shaderGroupHandleAlignment] - [Getter][#shaderGroupHandleAlignment()] - [Setter][#shaderGroupHandleAlignment(int)]
/// ### maxRayHitAttributeSize
/// [VarHandle][#VH_maxRayHitAttributeSize] - [Getter][#maxRayHitAttributeSize()] - [Setter][#maxRayHitAttributeSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRayRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint32_t shaderGroupHandleCaptureReplaySize;
///     uint32_t maxRayDispatchInvocationCount;
///     uint32_t shaderGroupHandleAlignment;
///     uint32_t maxRayHitAttributeSize;
/// } VkPhysicalDeviceRayTracingPipelinePropertiesKHR;
/// ```
public sealed class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRayRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleCaptureReplaySize"),
        ValueLayout.JAVA_INT.withName("maxRayDispatchInvocationCount"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleAlignment"),
        ValueLayout.JAVA_INT.withName("maxRayHitAttributeSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderGroupHandleSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    /// The [VarHandle] of `maxRayRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayRecursionDepth"));
    /// The [VarHandle] of `maxShaderGroupStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    /// The [VarHandle] of `shaderGroupBaseAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The [VarHandle] of `shaderGroupHandleCaptureReplaySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupHandleCaptureReplaySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    /// The [VarHandle] of `maxRayDispatchInvocationCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRayDispatchInvocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayDispatchInvocationCount"));
    /// The [VarHandle] of `shaderGroupHandleAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderGroupHandleAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleAlignment"));
    /// The [VarHandle] of `maxRayHitAttributeSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayHitAttributeSize"));

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int shaderGroupHandleSize, @CType("uint32_t") int maxRayRecursionDepth, @CType("uint32_t") int maxShaderGroupStride, @CType("uint32_t") int shaderGroupBaseAlignment, @CType("uint32_t") int shaderGroupHandleCaptureReplaySize, @CType("uint32_t") int maxRayDispatchInvocationCount, @CType("uint32_t") int shaderGroupHandleAlignment, @CType("uint32_t") int maxRayHitAttributeSize) { return alloc(allocator).sType(sType).pNext(pNext).shaderGroupHandleSize(shaderGroupHandleSize).maxRayRecursionDepth(maxRayRecursionDepth).maxShaderGroupStride(maxShaderGroupStride).shaderGroupBaseAlignment(shaderGroupBaseAlignment).shaderGroupHandleCaptureReplaySize(shaderGroupHandleCaptureReplaySize).maxRayDispatchInvocationCount(maxRayDispatchInvocationCount).shaderGroupHandleAlignment(shaderGroupHandleAlignment).maxRayHitAttributeSize(maxRayHitAttributeSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR copyFrom(VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderGroupHandleSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupHandleSize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleSize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupHandleSize(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleSize(segment, 0L); }
    /// {@return `shaderGroupHandleSize`}
    public @CType("uint32_t") int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleSize(this.segment()); }
    /// Sets `shaderGroupHandleSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupHandleSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupHandleSize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupHandleSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleSize(segment, 0L, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSize(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleSize(this.segment(), value); return this; }

    /// {@return `maxRayRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRayRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxRayRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxRayRecursionDepth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRayRecursionDepth(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayRecursionDepth(segment, 0L); }
    /// {@return `maxRayRecursionDepth`}
    public @CType("uint32_t") int maxRayRecursionDepth() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayRecursionDepth(this.segment()); }
    /// Sets `maxRayRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRayRecursionDepth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRayRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxRayRecursionDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRayRecursionDepth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayRecursionDepth(segment, 0L, value); }
    /// Sets `maxRayRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepth(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayRecursionDepth(this.segment(), value); return this; }

    /// {@return `maxShaderGroupStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxShaderGroupStride(MemorySegment segment, long index) { return (int) VH_maxShaderGroupStride.get(segment, 0L, index); }
    /// {@return `maxShaderGroupStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxShaderGroupStride(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxShaderGroupStride(segment, 0L); }
    /// {@return `maxShaderGroupStride`}
    public @CType("uint32_t") int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxShaderGroupStride(this.segment()); }
    /// Sets `maxShaderGroupStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxShaderGroupStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxShaderGroupStride.set(segment, 0L, index, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxShaderGroupStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxShaderGroupStride(segment, 0L, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStride(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxShaderGroupStride(this.segment(), value); return this; }

    /// {@return `shaderGroupBaseAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupBaseAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupBaseAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupBaseAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupBaseAlignment(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupBaseAlignment(segment, 0L); }
    /// {@return `shaderGroupBaseAlignment`}
    public @CType("uint32_t") int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupBaseAlignment(this.segment()); }
    /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupBaseAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupBaseAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupBaseAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupBaseAlignment(segment, 0L, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupBaseAlignment(this.segment(), value); return this; }

    /// {@return `shaderGroupHandleCaptureReplaySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupHandleCaptureReplaySize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleCaptureReplaySize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleCaptureReplaySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupHandleCaptureReplaySize(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleCaptureReplaySize(segment, 0L); }
    /// {@return `shaderGroupHandleCaptureReplaySize`}
    public @CType("uint32_t") int shaderGroupHandleCaptureReplaySize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleCaptureReplaySize(this.segment()); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupHandleCaptureReplaySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupHandleCaptureReplaySize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupHandleCaptureReplaySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleCaptureReplaySize(segment, 0L, value); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySize(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleCaptureReplaySize(this.segment(), value); return this; }

    /// {@return `maxRayDispatchInvocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRayDispatchInvocationCount(MemorySegment segment, long index) { return (int) VH_maxRayDispatchInvocationCount.get(segment, 0L, index); }
    /// {@return `maxRayDispatchInvocationCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRayDispatchInvocationCount(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayDispatchInvocationCount(segment, 0L); }
    /// {@return `maxRayDispatchInvocationCount`}
    public @CType("uint32_t") int maxRayDispatchInvocationCount() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayDispatchInvocationCount(this.segment()); }
    /// Sets `maxRayDispatchInvocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRayDispatchInvocationCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRayDispatchInvocationCount.set(segment, 0L, index, value); }
    /// Sets `maxRayDispatchInvocationCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRayDispatchInvocationCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayDispatchInvocationCount(segment, 0L, value); }
    /// Sets `maxRayDispatchInvocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCount(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayDispatchInvocationCount(this.segment(), value); return this; }

    /// {@return `shaderGroupHandleAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderGroupHandleAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleAlignment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderGroupHandleAlignment(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleAlignment(segment, 0L); }
    /// {@return `shaderGroupHandleAlignment`}
    public @CType("uint32_t") int shaderGroupHandleAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleAlignment(this.segment()); }
    /// Sets `shaderGroupHandleAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderGroupHandleAlignment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderGroupHandleAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderGroupHandleAlignment(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleAlignment(segment, 0L, value); }
    /// Sets `shaderGroupHandleAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignment(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleAlignment(this.segment(), value); return this; }

    /// {@return `maxRayHitAttributeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxRayHitAttributeSize(MemorySegment segment, long index) { return (int) VH_maxRayHitAttributeSize.get(segment, 0L, index); }
    /// {@return `maxRayHitAttributeSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxRayHitAttributeSize(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayHitAttributeSize(segment, 0L); }
    /// {@return `maxRayHitAttributeSize`}
    public @CType("uint32_t") int maxRayHitAttributeSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayHitAttributeSize(this.segment()); }
    /// Sets `maxRayHitAttributeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxRayHitAttributeSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxRayHitAttributeSize.set(segment, 0L, index, value); }
    /// Sets `maxRayHitAttributeSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxRayHitAttributeSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayHitAttributeSize(segment, 0L, value); }
    /// Sets `maxRayHitAttributeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSize(@CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayHitAttributeSize(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceRayTracingPipelinePropertiesKHR].
    public static final class Buffer extends VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderGroupHandleSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupHandleSizeAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleSize(this.segment(), index); }
        /// Sets `shaderGroupHandleSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupHandleSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleSize(this.segment(), index, value); return this; }

        /// {@return `maxRayRecursionDepth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxRayRecursionDepthAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayRecursionDepth(this.segment(), index); }
        /// Sets `maxRayRecursionDepth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxRayRecursionDepthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayRecursionDepth(this.segment(), index, value); return this; }

        /// {@return `maxShaderGroupStride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxShaderGroupStrideAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxShaderGroupStride(this.segment(), index); }
        /// Sets `maxShaderGroupStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxShaderGroupStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxShaderGroupStride(this.segment(), index, value); return this; }

        /// {@return `shaderGroupBaseAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupBaseAlignmentAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupBaseAlignment(this.segment(), index); }
        /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupBaseAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupBaseAlignment(this.segment(), index, value); return this; }

        /// {@return `shaderGroupHandleCaptureReplaySize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupHandleCaptureReplaySizeAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleCaptureReplaySize(this.segment(), index); }
        /// Sets `shaderGroupHandleCaptureReplaySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupHandleCaptureReplaySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleCaptureReplaySize(this.segment(), index, value); return this; }

        /// {@return `maxRayDispatchInvocationCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxRayDispatchInvocationCountAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayDispatchInvocationCount(this.segment(), index); }
        /// Sets `maxRayDispatchInvocationCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxRayDispatchInvocationCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayDispatchInvocationCount(this.segment(), index, value); return this; }

        /// {@return `shaderGroupHandleAlignment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderGroupHandleAlignmentAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_shaderGroupHandleAlignment(this.segment(), index); }
        /// Sets `shaderGroupHandleAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderGroupHandleAlignmentAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_shaderGroupHandleAlignment(this.segment(), index, value); return this; }

        /// {@return `maxRayHitAttributeSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxRayHitAttributeSizeAt(long index) { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.get_maxRayHitAttributeSize(this.segment(), index); }
        /// Sets `maxRayHitAttributeSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxRayHitAttributeSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.set_maxRayHitAttributeSize(this.segment(), index, value); return this; }

    }
}
