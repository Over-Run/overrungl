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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### generalShader
/// [VarHandle][#VH_generalShader] - [Getter][#generalShader()] - [Setter][#generalShader(int)]
/// ### closestHitShader
/// [VarHandle][#VH_closestHitShader] - [Getter][#closestHitShader()] - [Setter][#closestHitShader(int)]
/// ### anyHitShader
/// [VarHandle][#VH_anyHitShader] - [Getter][#anyHitShader()] - [Setter][#anyHitShader(int)]
/// ### intersectionShader
/// [VarHandle][#VH_intersectionShader] - [Getter][#intersectionShader()] - [Setter][#intersectionShader(int)]
/// ### pShaderGroupCaptureReplayHandle
/// [VarHandle][#VH_pShaderGroupCaptureReplayHandle] - [Getter][#pShaderGroupCaptureReplayHandle()] - [Setter][#pShaderGroupCaptureReplayHandle(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRayTracingShaderGroupCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkRayTracingShaderGroupTypeKHR type;
///     uint32_t generalShader;
///     uint32_t closestHitShader;
///     uint32_t anyHitShader;
///     uint32_t intersectionShader;
///     const void * pShaderGroupCaptureReplayHandle;
/// } VkRayTracingShaderGroupCreateInfoKHR;
/// ```
public final class VkRayTracingShaderGroupCreateInfoKHR extends Struct {
    /// The struct layout of `VkRayTracingShaderGroupCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader"),
        ValueLayout.ADDRESS.withName("pShaderGroupCaptureReplayHandle")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `generalShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_generalShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generalShader"));
    /// The [VarHandle] of `closestHitShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_closestHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("closestHitShader"));
    /// The [VarHandle] of `anyHitShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_anyHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anyHitShader"));
    /// The [VarHandle] of `intersectionShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intersectionShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intersectionShader"));
    /// The [VarHandle] of `pShaderGroupCaptureReplayHandle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pShaderGroupCaptureReplayHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));

    /// Creates `VkRayTracingShaderGroupCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkRayTracingShaderGroupCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRayTracingShaderGroupCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment); }

    /// Creates `VkRayTracingShaderGroupCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRayTracingShaderGroupCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoKHR`
    public static VkRayTracingShaderGroupCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingShaderGroupCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoKHR`
    public static VkRayTracingShaderGroupCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingShaderGroupCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRayTracingShaderGroupCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRayTracingShaderGroupCreateInfoKHR`
    public VkRayTracingShaderGroupCreateInfoKHR asSlice(long index) { return new VkRayTracingShaderGroupCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRayTracingShaderGroupCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRayTracingShaderGroupCreateInfoKHR`
    public VkRayTracingShaderGroupCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingShaderGroupCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRayTracingShaderGroupCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR sType(@CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRayTracingShaderGroupCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRayTracingShaderGroupTypeKHR") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkRayTracingShaderGroupTypeKHR") int get_type(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkRayTracingShaderGroupTypeKHR") int typeAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkRayTracingShaderGroupTypeKHR") int type() { return VkRayTracingShaderGroupCreateInfoKHR.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR typeAt(long index, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR type(@CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_type(this.segment(), value); return this; }

    /// {@return `generalShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_generalShader(MemorySegment segment, long index) { return (int) VH_generalShader.get(segment, 0L, index); }
    /// {@return `generalShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_generalShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_generalShader(segment, 0L); }
    /// {@return `generalShader` at the given index}
    /// @param index the index
    public @CType("uint32_t") int generalShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_generalShader(this.segment(), index); }
    /// {@return `generalShader`}
    public @CType("uint32_t") int generalShader() { return VkRayTracingShaderGroupCreateInfoKHR.get_generalShader(this.segment()); }
    /// Sets `generalShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_generalShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_generalShader.set(segment, 0L, index, value); }
    /// Sets `generalShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_generalShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_generalShader(segment, 0L, value); }
    /// Sets `generalShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR generalShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_generalShader(this.segment(), index, value); return this; }
    /// Sets `generalShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR generalShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_generalShader(this.segment(), value); return this; }

    /// {@return `closestHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_closestHitShader(MemorySegment segment, long index) { return (int) VH_closestHitShader.get(segment, 0L, index); }
    /// {@return `closestHitShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_closestHitShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_closestHitShader(segment, 0L); }
    /// {@return `closestHitShader` at the given index}
    /// @param index the index
    public @CType("uint32_t") int closestHitShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_closestHitShader(this.segment(), index); }
    /// {@return `closestHitShader`}
    public @CType("uint32_t") int closestHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.get_closestHitShader(this.segment()); }
    /// Sets `closestHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_closestHitShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_closestHitShader.set(segment, 0L, index, value); }
    /// Sets `closestHitShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_closestHitShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_closestHitShader(segment, 0L, value); }
    /// Sets `closestHitShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_closestHitShader(this.segment(), index, value); return this; }
    /// Sets `closestHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_closestHitShader(this.segment(), value); return this; }

    /// {@return `anyHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_anyHitShader(MemorySegment segment, long index) { return (int) VH_anyHitShader.get(segment, 0L, index); }
    /// {@return `anyHitShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_anyHitShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_anyHitShader(segment, 0L); }
    /// {@return `anyHitShader` at the given index}
    /// @param index the index
    public @CType("uint32_t") int anyHitShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_anyHitShader(this.segment(), index); }
    /// {@return `anyHitShader`}
    public @CType("uint32_t") int anyHitShader() { return VkRayTracingShaderGroupCreateInfoKHR.get_anyHitShader(this.segment()); }
    /// Sets `anyHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_anyHitShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_anyHitShader.set(segment, 0L, index, value); }
    /// Sets `anyHitShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_anyHitShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_anyHitShader(segment, 0L, value); }
    /// Sets `anyHitShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_anyHitShader(this.segment(), index, value); return this; }
    /// Sets `anyHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_anyHitShader(this.segment(), value); return this; }

    /// {@return `intersectionShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_intersectionShader(MemorySegment segment, long index) { return (int) VH_intersectionShader.get(segment, 0L, index); }
    /// {@return `intersectionShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_intersectionShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_intersectionShader(segment, 0L); }
    /// {@return `intersectionShader` at the given index}
    /// @param index the index
    public @CType("uint32_t") int intersectionShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_intersectionShader(this.segment(), index); }
    /// {@return `intersectionShader`}
    public @CType("uint32_t") int intersectionShader() { return VkRayTracingShaderGroupCreateInfoKHR.get_intersectionShader(this.segment()); }
    /// Sets `intersectionShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intersectionShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_intersectionShader.set(segment, 0L, index, value); }
    /// Sets `intersectionShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intersectionShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_intersectionShader(segment, 0L, value); }
    /// Sets `intersectionShader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_intersectionShader(this.segment(), index, value); return this; }
    /// Sets `intersectionShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoKHR.set_intersectionShader(this.segment(), value); return this; }

    /// {@return `pShaderGroupCaptureReplayHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pShaderGroupCaptureReplayHandle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pShaderGroupCaptureReplayHandle.get(segment, 0L, index); }
    /// {@return `pShaderGroupCaptureReplayHandle`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pShaderGroupCaptureReplayHandle(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoKHR.get_pShaderGroupCaptureReplayHandle(segment, 0L); }
    /// {@return `pShaderGroupCaptureReplayHandle` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pShaderGroupCaptureReplayHandleAt(long index) { return VkRayTracingShaderGroupCreateInfoKHR.get_pShaderGroupCaptureReplayHandle(this.segment(), index); }
    /// {@return `pShaderGroupCaptureReplayHandle`}
    public @CType("const void *") java.lang.foreign.MemorySegment pShaderGroupCaptureReplayHandle() { return VkRayTracingShaderGroupCreateInfoKHR.get_pShaderGroupCaptureReplayHandle(this.segment()); }
    /// Sets `pShaderGroupCaptureReplayHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pShaderGroupCaptureReplayHandle(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pShaderGroupCaptureReplayHandle.set(segment, 0L, index, value); }
    /// Sets `pShaderGroupCaptureReplayHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pShaderGroupCaptureReplayHandle(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pShaderGroupCaptureReplayHandle(segment, 0L, value); }
    /// Sets `pShaderGroupCaptureReplayHandle` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandleAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pShaderGroupCaptureReplayHandle(this.segment(), index, value); return this; }
    /// Sets `pShaderGroupCaptureReplayHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRayTracingShaderGroupCreateInfoKHR.set_pShaderGroupCaptureReplayHandle(this.segment(), value); return this; }

}
