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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### rateControlMode
/// [VarHandle][#VH_rateControlMode] - [Getter][#rateControlMode()] - [Setter][#rateControlMode(int)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ### pLayers
/// [VarHandle][#VH_pLayers] - [Getter][#pLayers()] - [Setter][#pLayers(java.lang.foreign.MemorySegment)]
/// ### virtualBufferSizeInMs
/// [VarHandle][#VH_virtualBufferSizeInMs] - [Getter][#virtualBufferSizeInMs()] - [Setter][#virtualBufferSizeInMs(int)]
/// ### initialVirtualBufferSizeInMs
/// [VarHandle][#VH_initialVirtualBufferSizeInMs] - [Getter][#initialVirtualBufferSizeInMs()] - [Setter][#initialVirtualBufferSizeInMs(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeRateControlInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeRateControlFlagsKHR flags;
///     VkVideoEncodeRateControlModeFlagBitsKHR rateControlMode;
///     uint32_t layerCount;
///     const VkVideoEncodeRateControlLayerInfoKHR * pLayers;
///     uint32_t virtualBufferSizeInMs;
///     uint32_t initialVirtualBufferSizeInMs;
/// } VkVideoEncodeRateControlInfoKHR;
/// ```
public final class VkVideoEncodeRateControlInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeRateControlInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlMode"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.ADDRESS.withName("pLayers"),
        ValueLayout.JAVA_INT.withName("virtualBufferSizeInMs"),
        ValueLayout.JAVA_INT.withName("initialVirtualBufferSizeInMs")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `rateControlMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlMode"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `pLayers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayers"));
    /// The [VarHandle] of `virtualBufferSizeInMs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_virtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("virtualBufferSizeInMs"));
    /// The [VarHandle] of `initialVirtualBufferSizeInMs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initialVirtualBufferSizeInMs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialVirtualBufferSizeInMs"));

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeRateControlInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeRateControlInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRateControlInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeRateControlInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeRateControlInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRateControlInfoKHR`
    public static VkVideoEncodeRateControlInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeRateControlInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeRateControlInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeRateControlInfoKHR`
    public static VkVideoEncodeRateControlInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRateControlInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeRateControlInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeRateControlInfoKHR`
    public VkVideoEncodeRateControlInfoKHR asSlice(long index) { return new VkVideoEncodeRateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeRateControlInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeRateControlInfoKHR`
    public VkVideoEncodeRateControlInfoKHR asSlice(long index, long count) { return new VkVideoEncodeRateControlInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeRateControlInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeRateControlInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeRateControlInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeRateControlInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeRateControlInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeRateControlFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeRateControlFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeRateControlFlagsKHR") int flagsAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeRateControlFlagsKHR") int flags() { return VkVideoEncodeRateControlInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeRateControlFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeRateControlFlagsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR flagsAt(long index, @CType("VkVideoEncodeRateControlFlagsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR flags(@CType("VkVideoEncodeRateControlFlagsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `rateControlMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int get_rateControlMode(MemorySegment segment, long index) { return (int) VH_rateControlMode.get(segment, 0L, index); }
    /// {@return `rateControlMode`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int get_rateControlMode(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_rateControlMode(segment, 0L); }
    /// {@return `rateControlMode` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int rateControlModeAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_rateControlMode(this.segment(), index); }
    /// {@return `rateControlMode`}
    public @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int rateControlMode() { return VkVideoEncodeRateControlInfoKHR.get_rateControlMode(this.segment()); }
    /// Sets `rateControlMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rateControlMode(MemorySegment segment, long index, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VH_rateControlMode.set(segment, 0L, index, value); }
    /// Sets `rateControlMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rateControlMode(MemorySegment segment, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_rateControlMode(segment, 0L, value); }
    /// Sets `rateControlMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR rateControlModeAt(long index, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_rateControlMode(this.segment(), index, value); return this; }
    /// Sets `rateControlMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR rateControlMode(@CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeRateControlInfoKHR.set_rateControlMode(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_layerCount(segment, 0L); }
    /// {@return `layerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerCountAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_layerCount(this.segment(), index); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkVideoEncodeRateControlInfoKHR.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR layerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_layerCount(this.segment(), index, value); return this; }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR layerCount(@CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_layerCount(this.segment(), value); return this; }

    /// {@return `pLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment get_pLayers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pLayers.get(segment, 0L, index); }
    /// {@return `pLayers`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment get_pLayers(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_pLayers(segment, 0L); }
    /// {@return `pLayers` at the given index}
    /// @param index the index
    public @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment pLayersAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_pLayers(this.segment(), index); }
    /// {@return `pLayers`}
    public @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment pLayers() { return VkVideoEncodeRateControlInfoKHR.get_pLayers(this.segment()); }
    /// Sets `pLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pLayers(MemorySegment segment, long index, @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pLayers.set(segment, 0L, index, value); }
    /// Sets `pLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pLayers(MemorySegment segment, @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pLayers(segment, 0L, value); }
    /// Sets `pLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR pLayersAt(long index, @CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pLayers(this.segment(), index, value); return this; }
    /// Sets `pLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR pLayers(@CType("const VkVideoEncodeRateControlLayerInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeRateControlInfoKHR.set_pLayers(this.segment(), value); return this; }

    /// {@return `virtualBufferSizeInMs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_virtualBufferSizeInMs(MemorySegment segment, long index) { return (int) VH_virtualBufferSizeInMs.get(segment, 0L, index); }
    /// {@return `virtualBufferSizeInMs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_virtualBufferSizeInMs(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_virtualBufferSizeInMs(segment, 0L); }
    /// {@return `virtualBufferSizeInMs` at the given index}
    /// @param index the index
    public @CType("uint32_t") int virtualBufferSizeInMsAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_virtualBufferSizeInMs(this.segment(), index); }
    /// {@return `virtualBufferSizeInMs`}
    public @CType("uint32_t") int virtualBufferSizeInMs() { return VkVideoEncodeRateControlInfoKHR.get_virtualBufferSizeInMs(this.segment()); }
    /// Sets `virtualBufferSizeInMs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_virtualBufferSizeInMs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_virtualBufferSizeInMs.set(segment, 0L, index, value); }
    /// Sets `virtualBufferSizeInMs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_virtualBufferSizeInMs(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_virtualBufferSizeInMs(segment, 0L, value); }
    /// Sets `virtualBufferSizeInMs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMsAt(long index, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_virtualBufferSizeInMs(this.segment(), index, value); return this; }
    /// Sets `virtualBufferSizeInMs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR virtualBufferSizeInMs(@CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_virtualBufferSizeInMs(this.segment(), value); return this; }

    /// {@return `initialVirtualBufferSizeInMs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_initialVirtualBufferSizeInMs(MemorySegment segment, long index) { return (int) VH_initialVirtualBufferSizeInMs.get(segment, 0L, index); }
    /// {@return `initialVirtualBufferSizeInMs`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_initialVirtualBufferSizeInMs(MemorySegment segment) { return VkVideoEncodeRateControlInfoKHR.get_initialVirtualBufferSizeInMs(segment, 0L); }
    /// {@return `initialVirtualBufferSizeInMs` at the given index}
    /// @param index the index
    public @CType("uint32_t") int initialVirtualBufferSizeInMsAt(long index) { return VkVideoEncodeRateControlInfoKHR.get_initialVirtualBufferSizeInMs(this.segment(), index); }
    /// {@return `initialVirtualBufferSizeInMs`}
    public @CType("uint32_t") int initialVirtualBufferSizeInMs() { return VkVideoEncodeRateControlInfoKHR.get_initialVirtualBufferSizeInMs(this.segment()); }
    /// Sets `initialVirtualBufferSizeInMs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialVirtualBufferSizeInMs(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_initialVirtualBufferSizeInMs.set(segment, 0L, index, value); }
    /// Sets `initialVirtualBufferSizeInMs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialVirtualBufferSizeInMs(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_initialVirtualBufferSizeInMs(segment, 0L, value); }
    /// Sets `initialVirtualBufferSizeInMs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMsAt(long index, @CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_initialVirtualBufferSizeInMs(this.segment(), index, value); return this; }
    /// Sets `initialVirtualBufferSizeInMs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRateControlInfoKHR initialVirtualBufferSizeInMs(@CType("uint32_t") int value) { VkVideoEncodeRateControlInfoKHR.set_initialVirtualBufferSizeInMs(this.segment(), value); return this; }

}
