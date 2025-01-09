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
/// ### swapchainCount
/// [VarHandle][#VH_swapchainCount] - [Getter][#swapchainCount()] - [Setter][#swapchainCount(int)]
/// ### pDeviceMasks
/// [VarHandle][#VH_pDeviceMasks] - [Getter][#pDeviceMasks()] - [Setter][#pDeviceMasks(java.lang.foreign.MemorySegment)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupPresentInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t swapchainCount;
///     const uint32_t * pDeviceMasks;
///     VkDeviceGroupPresentModeFlagBitsKHR mode;
/// } VkDeviceGroupPresentInfoKHR;
/// ```
public final class VkDeviceGroupPresentInfoKHR extends Struct {
    /// The struct layout of `VkDeviceGroupPresentInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pDeviceMasks"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `pDeviceMasks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDeviceMasks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceMasks"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupPresentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupPresentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupPresentInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupPresentInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupPresentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupPresentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupPresentInfoKHR`
    public static VkDeviceGroupPresentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupPresentInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupPresentInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupPresentInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupPresentInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupPresentInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupPresentInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR sType(@CType("VkStructureType") int value) { VkDeviceGroupPresentInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupPresentInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceGroupPresentInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceGroupPresentInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment) { return VkDeviceGroupPresentInfoKHR.get_swapchainCount(segment, 0L); }
    /// {@return `swapchainCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int swapchainCountAt(long index) { return VkDeviceGroupPresentInfoKHR.get_swapchainCount(this.segment(), index); }
    /// {@return `swapchainCount`}
    public @CType("uint32_t") int swapchainCount() { return VkDeviceGroupPresentInfoKHR.get_swapchainCount(this.segment()); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupPresentInfoKHR.set_swapchainCount(segment, 0L, value); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR swapchainCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupPresentInfoKHR.set_swapchainCount(this.segment(), index, value); return this; }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR swapchainCount(@CType("uint32_t") int value) { VkDeviceGroupPresentInfoKHR.set_swapchainCount(this.segment(), value); return this; }

    /// {@return `pDeviceMasks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceMasks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDeviceMasks.get(segment, 0L, index); }
    /// {@return `pDeviceMasks`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pDeviceMasks(MemorySegment segment) { return VkDeviceGroupPresentInfoKHR.get_pDeviceMasks(segment, 0L); }
    /// {@return `pDeviceMasks` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceMasksAt(long index) { return VkDeviceGroupPresentInfoKHR.get_pDeviceMasks(this.segment(), index); }
    /// {@return `pDeviceMasks`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pDeviceMasks() { return VkDeviceGroupPresentInfoKHR.get_pDeviceMasks(this.segment()); }
    /// Sets `pDeviceMasks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceMasks(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pDeviceMasks.set(segment, 0L, index, value); }
    /// Sets `pDeviceMasks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceMasks(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pDeviceMasks(segment, 0L, value); }
    /// Sets `pDeviceMasks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR pDeviceMasksAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pDeviceMasks(this.segment(), index, value); return this; }
    /// Sets `pDeviceMasks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkDeviceGroupPresentInfoKHR.set_pDeviceMasks(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceGroupPresentModeFlagBitsKHR") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceGroupPresentModeFlagBitsKHR") int get_mode(MemorySegment segment) { return VkDeviceGroupPresentInfoKHR.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkDeviceGroupPresentModeFlagBitsKHR") int modeAt(long index) { return VkDeviceGroupPresentInfoKHR.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkDeviceGroupPresentModeFlagBitsKHR") int mode() { return VkDeviceGroupPresentInfoKHR.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VkDeviceGroupPresentInfoKHR.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR modeAt(long index, @CType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VkDeviceGroupPresentInfoKHR.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupPresentInfoKHR mode(@CType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VkDeviceGroupPresentInfoKHR.set_mode(this.segment(), value); return this; }

}
