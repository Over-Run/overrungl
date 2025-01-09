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
/// ### preferredRateControlMode
/// [VarHandle][#VH_preferredRateControlMode] - [Getter][#preferredRateControlMode()] - [Setter][#preferredRateControlMode(int)]
/// ### preferredRateControlLayerCount
/// [VarHandle][#VH_preferredRateControlLayerCount] - [Getter][#preferredRateControlLayerCount()] - [Setter][#preferredRateControlLayerCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeQualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeRateControlModeFlagBitsKHR preferredRateControlMode;
///     uint32_t preferredRateControlLayerCount;
/// } VkVideoEncodeQualityLevelPropertiesKHR;
/// ```
public final class VkVideoEncodeQualityLevelPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeQualityLevelPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlMode"),
        ValueLayout.JAVA_INT.withName("preferredRateControlLayerCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `preferredRateControlMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredRateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlMode"));
    /// The [VarHandle] of `preferredRateControlLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredRateControlLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlLayerCount"));

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQualityLevelPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQualityLevelPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeQualityLevelPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeQualityLevelPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeQualityLevelPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeQualityLevelPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeQualityLevelPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeQualityLevelPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQualityLevelPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQualityLevelPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQualityLevelPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `preferredRateControlMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int get_preferredRateControlMode(MemorySegment segment, long index) { return (int) VH_preferredRateControlMode.get(segment, 0L, index); }
    /// {@return `preferredRateControlMode`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int get_preferredRateControlMode(MemorySegment segment) { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlMode(segment, 0L); }
    /// {@return `preferredRateControlMode` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int preferredRateControlModeAt(long index) { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlMode(this.segment(), index); }
    /// {@return `preferredRateControlMode`}
    public @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int preferredRateControlMode() { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlMode(this.segment()); }
    /// Sets `preferredRateControlMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredRateControlMode(MemorySegment segment, long index, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VH_preferredRateControlMode.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredRateControlMode(MemorySegment segment, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlMode(segment, 0L, value); }
    /// Sets `preferredRateControlMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlModeAt(long index, @CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlMode(this.segment(), index, value); return this; }
    /// Sets `preferredRateControlMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlMode(@CType("VkVideoEncodeRateControlModeFlagBitsKHR") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlMode(this.segment(), value); return this; }

    /// {@return `preferredRateControlLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredRateControlLayerCount(MemorySegment segment, long index) { return (int) VH_preferredRateControlLayerCount.get(segment, 0L, index); }
    /// {@return `preferredRateControlLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredRateControlLayerCount(MemorySegment segment) { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlLayerCount(segment, 0L); }
    /// {@return `preferredRateControlLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredRateControlLayerCountAt(long index) { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlLayerCount(this.segment(), index); }
    /// {@return `preferredRateControlLayerCount`}
    public @CType("uint32_t") int preferredRateControlLayerCount() { return VkVideoEncodeQualityLevelPropertiesKHR.get_preferredRateControlLayerCount(this.segment()); }
    /// Sets `preferredRateControlLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredRateControlLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredRateControlLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredRateControlLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlLayerCount(segment, 0L, value); }
    /// Sets `preferredRateControlLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlLayerCount(this.segment(), index, value); return this; }
    /// Sets `preferredRateControlLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCount(@CType("uint32_t") int value) { VkVideoEncodeQualityLevelPropertiesKHR.set_preferredRateControlLayerCount(this.segment(), value); return this; }

}
