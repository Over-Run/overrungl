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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### rayTracingPipeline
/// [VarHandle][#VH_rayTracingPipeline] - [Getter][#rayTracingPipeline()] - [Setter][#rayTracingPipeline(int)]
/// ### rayTracingPipelineShaderGroupHandleCaptureReplay
/// [VarHandle][#VH_rayTracingPipelineShaderGroupHandleCaptureReplay] - [Getter][#rayTracingPipelineShaderGroupHandleCaptureReplay()] - [Setter][#rayTracingPipelineShaderGroupHandleCaptureReplay(int)]
/// ### rayTracingPipelineShaderGroupHandleCaptureReplayMixed
/// [VarHandle][#VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed] - [Getter][#rayTracingPipelineShaderGroupHandleCaptureReplayMixed()] - [Setter][#rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int)]
/// ### rayTracingPipelineTraceRaysIndirect
/// [VarHandle][#VH_rayTracingPipelineTraceRaysIndirect] - [Getter][#rayTracingPipelineTraceRaysIndirect()] - [Setter][#rayTracingPipelineTraceRaysIndirect(int)]
/// ### rayTraversalPrimitiveCulling
/// [VarHandle][#VH_rayTraversalPrimitiveCulling] - [Getter][#rayTraversalPrimitiveCulling()] - [Setter][#rayTraversalPrimitiveCulling(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 rayTracingPipeline;
///     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplay;
///     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplayMixed;
///     VkBool32 rayTracingPipelineTraceRaysIndirect;
///     VkBool32 rayTraversalPrimitiveCulling;
/// } VkPhysicalDeviceRayTracingPipelineFeaturesKHR;
/// ```
public final class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingPipeline"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
        ValueLayout.JAVA_INT.withName("rayTraversalPrimitiveCulling")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `rayTracingPipeline` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipeline"));
    /// The [VarHandle] of `rayTracingPipelineShaderGroupHandleCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
    /// The [VarHandle] of `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
    /// The [VarHandle] of `rayTracingPipelineTraceRaysIndirect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTracingPipelineTraceRaysIndirect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
    /// The [VarHandle] of `rayTraversalPrimitiveCulling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rayTraversalPrimitiveCulling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rayTraversalPrimitiveCulling"));

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelineFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRayTracingPipelineFeaturesKHR`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `rayTracingPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingPipeline(MemorySegment segment, long index) { return (int) VH_rayTracingPipeline.get(segment, 0L, index); }
    /// {@return `rayTracingPipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingPipeline(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipeline(segment, 0L); }
    /// {@return `rayTracingPipeline` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rayTracingPipelineAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipeline(this.segment(), index); }
    /// {@return `rayTracingPipeline`}
    public @CType("VkBool32") int rayTracingPipeline() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipeline(this.segment()); }
    /// Sets `rayTracingPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingPipeline(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingPipeline.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingPipeline(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipeline(segment, 0L, value); }
    /// Sets `rayTracingPipeline` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipeline(this.segment(), index, value); return this; }
    /// Sets `rayTracingPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipeline(this.segment(), value); return this; }

    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplay.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplay(segment, 0L); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplay`}
    public @CType("VkBool32") int rayTracingPipelineShaderGroupHandleCaptureReplay() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment()); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingPipelineShaderGroupHandleCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplay(segment, 0L, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), index, value); return this; }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplay(this.segment(), value); return this; }

    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(segment, 0L); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), index); }
    /// {@return `rayTracingPipelineShaderGroupHandleCaptureReplayMixed`}
    public @CType("VkBool32") int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment()); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingPipelineShaderGroupHandleCaptureReplayMixed.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(segment, 0L, value); }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), index, value); return this; }
    /// Sets `rayTracingPipelineShaderGroupHandleCaptureReplayMixed` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineShaderGroupHandleCaptureReplayMixed(this.segment(), value); return this; }

    /// {@return `rayTracingPipelineTraceRaysIndirect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTracingPipelineTraceRaysIndirect(MemorySegment segment, long index) { return (int) VH_rayTracingPipelineTraceRaysIndirect.get(segment, 0L, index); }
    /// {@return `rayTracingPipelineTraceRaysIndirect`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTracingPipelineTraceRaysIndirect(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineTraceRaysIndirect(segment, 0L); }
    /// {@return `rayTracingPipelineTraceRaysIndirect` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rayTracingPipelineTraceRaysIndirectAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineTraceRaysIndirect(this.segment(), index); }
    /// {@return `rayTracingPipelineTraceRaysIndirect`}
    public @CType("VkBool32") int rayTracingPipelineTraceRaysIndirect() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTracingPipelineTraceRaysIndirect(this.segment()); }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTracingPipelineTraceRaysIndirect(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTracingPipelineTraceRaysIndirect.set(segment, 0L, index, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTracingPipelineTraceRaysIndirect(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineTraceRaysIndirect(segment, 0L, value); }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirectAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineTraceRaysIndirect(this.segment(), index, value); return this; }
    /// Sets `rayTracingPipelineTraceRaysIndirect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTracingPipelineTraceRaysIndirect(this.segment(), value); return this; }

    /// {@return `rayTraversalPrimitiveCulling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rayTraversalPrimitiveCulling(MemorySegment segment, long index) { return (int) VH_rayTraversalPrimitiveCulling.get(segment, 0L, index); }
    /// {@return `rayTraversalPrimitiveCulling`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rayTraversalPrimitiveCulling(MemorySegment segment) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTraversalPrimitiveCulling(segment, 0L); }
    /// {@return `rayTraversalPrimitiveCulling` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rayTraversalPrimitiveCullingAt(long index) { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTraversalPrimitiveCulling(this.segment(), index); }
    /// {@return `rayTraversalPrimitiveCulling`}
    public @CType("VkBool32") int rayTraversalPrimitiveCulling() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.get_rayTraversalPrimitiveCulling(this.segment()); }
    /// Sets `rayTraversalPrimitiveCulling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rayTraversalPrimitiveCulling(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rayTraversalPrimitiveCulling.set(segment, 0L, index, value); }
    /// Sets `rayTraversalPrimitiveCulling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rayTraversalPrimitiveCulling(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTraversalPrimitiveCulling(segment, 0L, value); }
    /// Sets `rayTraversalPrimitiveCulling` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCullingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTraversalPrimitiveCulling(this.segment(), index, value); return this; }
    /// Sets `rayTraversalPrimitiveCulling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(@CType("VkBool32") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.set_rayTraversalPrimitiveCulling(this.segment(), value); return this; }

}
