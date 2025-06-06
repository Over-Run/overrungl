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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rayTracingPipeline;
///     (uint32_t) VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplay;
///     (uint32_t) VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplayMixed;
///     (uint32_t) VkBool32 rayTracingPipelineTraceRaysIndirect;
///     (uint32_t) VkBool32 rayTraversalPrimitiveCulling;
/// };
/// ```
public sealed class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPipeline"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        ValueLayout.JAVA_INT.withName("rayTraversalPrimitiveCulling")
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
    /// The byte offset of `rayTracingPipeline`.
    public static final long OFFSET_rayTracingPipeline = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipeline"));
    /// The memory layout of `rayTracingPipeline`.
    public static final MemoryLayout LAYOUT_rayTracingPipeline = LAYOUT.select(PathElement.groupElement("rayTracingPipeline"));
    /// The [VarHandle] of `rayTracingPipeline` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipeline"));
    /// The byte offset of `rayTracingPipelineShaderGroupHandleCaptureReplay`.
    public static final long OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    /// The memory layout of `rayTracingPipelineShaderGroupHandleCaptureReplay`.
    public static final MemoryLayout LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.select(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    /// The [VarHandle] of `rayTracingPipelineShaderGroupHandleCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    /// The byte offset of `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`.
    public static final long OFFSET_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    /// The memory layout of `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`.
    public static final MemoryLayout LAYOUT_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.select(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    /// The [VarHandle] of `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    /// The byte offset of `rayTracingPipelineTraceRaysIndirect`.
    public static final long OFFSET_rayTracingPipelineTraceRaysIndirect = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    /// The memory layout of `rayTracingPipelineTraceRaysIndirect`.
    public static final MemoryLayout LAYOUT_rayTracingPipelineTraceRaysIndirect = LAYOUT.select(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    /// The [VarHandle] of `rayTracingPipelineTraceRaysIndirect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    /// The byte offset of `rayTraversalPrimitiveCulling`.
    public static final long OFFSET_rayTraversalPrimitiveCulling = LAYOUT.byteOffset(PathElement.groupElement("rayTraversalPrimitiveCulling"));
    /// The memory layout of `rayTraversalPrimitiveCulling`.
    public static final MemoryLayout LAYOUT_rayTraversalPrimitiveCulling = LAYOUT.select(PathElement.groupElement("rayTraversalPrimitiveCulling"));
    /// The [VarHandle] of `rayTraversalPrimitiveCulling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rayTraversalPrimitiveCulling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTraversalPrimitiveCulling"));

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param rayTracingPipeline `rayTracingPipeline`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplay `rayTracingPipelineShaderGroupHandleCaptureReplay`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplayMixed `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`
    /// @param rayTracingPipelineTraceRaysIndirect `rayTracingPipelineTraceRaysIndirect`
    /// @param rayTraversalPrimitiveCulling `rayTraversalPrimitiveCulling`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int rayTracingPipeline, int rayTracingPipelineShaderGroupHandleCaptureReplay, int rayTracingPipelineShaderGroupHandleCaptureReplayMixed, int rayTracingPipelineTraceRaysIndirect, int rayTraversalPrimitiveCulling) {
        return alloc(allocator).sType(sType).pNext(pNext).rayTracingPipeline(rayTracingPipeline).rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay).rayTracingPipelineShaderGroupHandleCaptureReplayMixed(rayTracingPipelineShaderGroupHandleCaptureReplayMixed).rayTracingPipelineTraceRaysIndirect(rayTracingPipelineTraceRaysIndirect).rayTraversalPrimitiveCulling(rayTraversalPrimitiveCulling);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param rayTracingPipeline `rayTracingPipeline`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplay `rayTracingPipelineShaderGroupHandleCaptureReplay`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplayMixed `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`
    /// @param rayTracingPipelineTraceRaysIndirect `rayTracingPipelineTraceRaysIndirect`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int rayTracingPipeline, int rayTracingPipelineShaderGroupHandleCaptureReplay, int rayTracingPipelineShaderGroupHandleCaptureReplayMixed, int rayTracingPipelineTraceRaysIndirect) {
        return alloc(allocator).sType(sType).pNext(pNext).rayTracingPipeline(rayTracingPipeline).rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay).rayTracingPipelineShaderGroupHandleCaptureReplayMixed(rayTracingPipelineShaderGroupHandleCaptureReplayMixed).rayTracingPipelineTraceRaysIndirect(rayTracingPipelineTraceRaysIndirect);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param rayTracingPipeline `rayTracingPipeline`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplay `rayTracingPipelineShaderGroupHandleCaptureReplay`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplayMixed `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int rayTracingPipeline, int rayTracingPipelineShaderGroupHandleCaptureReplay, int rayTracingPipelineShaderGroupHandleCaptureReplayMixed) {
        return alloc(allocator).sType(sType).pNext(pNext).rayTracingPipeline(rayTracingPipeline).rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay).rayTracingPipelineShaderGroupHandleCaptureReplayMixed(rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param rayTracingPipeline `rayTracingPipeline`
    /// @param rayTracingPipelineShaderGroupHandleCaptureReplay `rayTracingPipelineShaderGroupHandleCaptureReplay`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int rayTracingPipeline, int rayTracingPipelineShaderGroupHandleCaptureReplay) {
        return alloc(allocator).sType(sType).pNext(pNext).rayTracingPipeline(rayTracingPipeline).rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param rayTracingPipeline `rayTracingPipeline`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int rayTracingPipeline) {
        return alloc(allocator).sType(sType).pNext(pNext).rayTracingPipeline(rayTracingPipeline);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR copyFrom(VkPhysicalDeviceRayTracingPipelineFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingPipeline(MemorySegment segment, long index) { return (int) VH_rayTracingPipeline.get(segment, 0L, index); }
    /// {@return `rayTracingPipeline`}
    public int rayTracingPipeline() { return rayTracingPipeline(this.segment(), 0L); }
    /// Sets `rayTracingPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingPipeline(MemorySegment segment, long index, int value) { VH_rayTracingPipeline.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(int value) { rayTracingPipeline(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplay.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay`}
    public int rayTracingPipelineShaderGroupHandleCaptureReplay() { return rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), 0L); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment, long index, int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(int value) { rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`}
    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), 0L); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment, long index, int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int value) { rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), 0L, value); return this; }

    /// {@return `rayTracingPipelineTraceRaysIndirect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTracingPipelineTraceRaysIndirect(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineTraceRaysIndirect`}
    public int rayTracingPipelineTraceRaysIndirect() { return rayTracingPipelineTraceRaysIndirect(this.segment(), 0L); }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTracingPipelineTraceRaysIndirect(MemorySegment segment, long index, int value) { VH_rayTracingPipelineTraceRaysIndirect.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(int value) { rayTracingPipelineTraceRaysIndirect(this.segment(), 0L, value); return this; }

    /// {@return `rayTraversalPrimitiveCulling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rayTraversalPrimitiveCulling(MemorySegment segment, long index) { return (int) VH_rayTraversalPrimitiveCulling.get(segment, 0L, index); }
    /// {@return `rayTraversalPrimitiveCulling`}
    public int rayTraversalPrimitiveCulling() { return rayTraversalPrimitiveCulling(this.segment(), 0L); }
    /// Sets `rayTraversalPrimitiveCulling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rayTraversalPrimitiveCulling(MemorySegment segment, long index, int value) { VH_rayTraversalPrimitiveCulling.set(segment, 0L, index, value); }
    /// Sets `rayTraversalPrimitiveCulling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(int value) { rayTraversalPrimitiveCulling(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceRayTracingPipelineFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipeline` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingPipelineAt(long index) { return rayTracingPipeline(this.segment(), index); }
        /// Sets `rayTracingPipeline` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineAt(long index, int value) { rayTracingPipeline(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index) { return rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), index); }
        /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index, int value) { rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index) { return rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), index); }
        /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index, int value) { rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), index, value); return this; }

        /// {@return `rayTracingPipelineTraceRaysIndirect` at the given index}
        /// @param index the index of the struct buffer
        public int rayTracingPipelineTraceRaysIndirectAt(long index) { return rayTracingPipelineTraceRaysIndirect(this.segment(), index); }
        /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTracingPipelineTraceRaysIndirectAt(long index, int value) { rayTracingPipelineTraceRaysIndirect(this.segment(), index, value); return this; }

        /// {@return `rayTraversalPrimitiveCulling` at the given index}
        /// @param index the index of the struct buffer
        public int rayTraversalPrimitiveCullingAt(long index) { return rayTraversalPrimitiveCulling(this.segment(), index); }
        /// Sets `rayTraversalPrimitiveCulling` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer rayTraversalPrimitiveCullingAt(long index, int value) { rayTraversalPrimitiveCulling(this.segment(), index, value); return this; }

    }
}
