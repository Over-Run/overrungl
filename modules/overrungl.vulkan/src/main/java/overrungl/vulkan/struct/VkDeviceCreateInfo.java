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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### queueCreateInfoCount
/// [VarHandle][#VH_queueCreateInfoCount] - [Getter][#queueCreateInfoCount()] - [Setter][#queueCreateInfoCount(int)]
/// ### pQueueCreateInfos
/// [VarHandle][#VH_pQueueCreateInfos] - [Getter][#pQueueCreateInfos()] - [Setter][#pQueueCreateInfos(java.lang.foreign.MemorySegment)]
/// ### enabledLayerCount
/// [VarHandle][#VH_enabledLayerCount] - [Getter][#enabledLayerCount()] - [Setter][#enabledLayerCount(int)]
/// ### ppEnabledLayerNames
/// [VarHandle][#VH_ppEnabledLayerNames] - [Getter][#ppEnabledLayerNames()] - [Setter][#ppEnabledLayerNames(java.lang.foreign.MemorySegment)]
/// ### enabledExtensionCount
/// [VarHandle][#VH_enabledExtensionCount] - [Getter][#enabledExtensionCount()] - [Setter][#enabledExtensionCount(int)]
/// ### ppEnabledExtensionNames
/// [VarHandle][#VH_ppEnabledExtensionNames] - [Getter][#ppEnabledExtensionNames()] - [Setter][#ppEnabledExtensionNames(java.lang.foreign.MemorySegment)]
/// ### pEnabledFeatures
/// [VarHandle][#VH_pEnabledFeatures] - [Getter][#pEnabledFeatures()] - [Setter][#pEnabledFeatures(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceCreateFlags flags;
///     uint32_t queueCreateInfoCount;
///     const VkDeviceQueueCreateInfo * pQueueCreateInfos;
///     uint32_t enabledLayerCount;
///     const char * const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char * const* ppEnabledExtensionNames;
///     const VkPhysicalDeviceFeatures * pEnabledFeatures;
/// } VkDeviceCreateInfo;
/// ```
public sealed class VkDeviceCreateInfo extends Struct {
    /// The struct layout of `VkDeviceCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueCreateInfoCount"),
        ValueLayout.ADDRESS.withName("pQueueCreateInfos"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withName("ppEnabledExtensionNames"),
        ValueLayout.ADDRESS.withName("pEnabledFeatures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `queueCreateInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueCreateInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCreateInfoCount"));
    /// The [VarHandle] of `pQueueCreateInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueCreateInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueCreateInfos"));
    /// The [VarHandle] of `enabledLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    /// The [VarHandle] of `ppEnabledLayerNames` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    /// The [VarHandle] of `enabledExtensionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    /// The [VarHandle] of `ppEnabledExtensionNames` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The [VarHandle] of `pEnabledFeatures` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pEnabledFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledFeatures"));

    /// Creates `VkDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceCreateInfo`
    public static VkDeviceCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceCreateInfo`
    public static VkDeviceCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceCreateFlags") int flags, @CType("uint32_t") int queueCreateInfoCount, @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment pQueueCreateInfos, @CType("uint32_t") int enabledLayerCount, @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledLayerNames, @CType("uint32_t") int enabledExtensionCount, @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledExtensionNames, @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment pEnabledFeatures) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).queueCreateInfoCount(queueCreateInfoCount).pQueueCreateInfos(pQueueCreateInfos).enabledLayerCount(enabledLayerCount).ppEnabledLayerNames(ppEnabledLayerNames).enabledExtensionCount(enabledExtensionCount).ppEnabledExtensionNames(ppEnabledExtensionNames).pEnabledFeatures(pEnabledFeatures); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceCreateInfo copyFrom(VkDeviceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo sType(@CType("VkStructureType") int value) { VkDeviceCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceCreateFlags") int get_flags(MemorySegment segment) { return VkDeviceCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDeviceCreateFlags") int flags() { return VkDeviceCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo flags(@CType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `queueCreateInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueCreateInfoCount(MemorySegment segment, long index) { return (int) VH_queueCreateInfoCount.get(segment, 0L, index); }
    /// {@return `queueCreateInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueCreateInfoCount(MemorySegment segment) { return VkDeviceCreateInfo.get_queueCreateInfoCount(segment, 0L); }
    /// {@return `queueCreateInfoCount`}
    public @CType("uint32_t") int queueCreateInfoCount() { return VkDeviceCreateInfo.get_queueCreateInfoCount(this.segment()); }
    /// Sets `queueCreateInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueCreateInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueCreateInfoCount.set(segment, 0L, index, value); }
    /// Sets `queueCreateInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueCreateInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_queueCreateInfoCount(segment, 0L, value); }
    /// Sets `queueCreateInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo queueCreateInfoCount(@CType("uint32_t") int value) { VkDeviceCreateInfo.set_queueCreateInfoCount(this.segment(), value); return this; }

    /// {@return `pQueueCreateInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment get_pQueueCreateInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueCreateInfos.get(segment, 0L, index); }
    /// {@return `pQueueCreateInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment get_pQueueCreateInfos(MemorySegment segment) { return VkDeviceCreateInfo.get_pQueueCreateInfos(segment, 0L); }
    /// {@return `pQueueCreateInfos`}
    public @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment pQueueCreateInfos() { return VkDeviceCreateInfo.get_pQueueCreateInfos(this.segment()); }
    /// Sets `pQueueCreateInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueCreateInfos(MemorySegment segment, long index, @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pQueueCreateInfos.set(segment, 0L, index, value); }
    /// Sets `pQueueCreateInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueCreateInfos(MemorySegment segment, @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pQueueCreateInfos(segment, 0L, value); }
    /// Sets `pQueueCreateInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pQueueCreateInfos(@CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pQueueCreateInfos(this.segment(), value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_enabledLayerCount(MemorySegment segment, long index) { return (int) VH_enabledLayerCount.get(segment, 0L, index); }
    /// {@return `enabledLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_enabledLayerCount(MemorySegment segment) { return VkDeviceCreateInfo.get_enabledLayerCount(segment, 0L); }
    /// {@return `enabledLayerCount`}
    public @CType("uint32_t") int enabledLayerCount() { return VkDeviceCreateInfo.get_enabledLayerCount(this.segment()); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enabledLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_enabledLayerCount.set(segment, 0L, index, value); }
    /// Sets `enabledLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enabledLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledLayerCount(segment, 0L, value); }
    /// Sets `enabledLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledLayerCount(@CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledLayerCount(this.segment(), value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledLayerNames(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppEnabledLayerNames.get(segment, 0L, index); }
    /// {@return `ppEnabledLayerNames`}
    /// @param segment the segment of the struct
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledLayerNames(MemorySegment segment) { return VkDeviceCreateInfo.get_ppEnabledLayerNames(segment, 0L); }
    /// {@return `ppEnabledLayerNames`}
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledLayerNames() { return VkDeviceCreateInfo.get_ppEnabledLayerNames(this.segment()); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppEnabledLayerNames(MemorySegment segment, long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VH_ppEnabledLayerNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppEnabledLayerNames(MemorySegment segment, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledLayerNames(segment, 0L, value); }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledLayerNames(@CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledLayerNames(this.segment(), value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_enabledExtensionCount(MemorySegment segment, long index) { return (int) VH_enabledExtensionCount.get(segment, 0L, index); }
    /// {@return `enabledExtensionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_enabledExtensionCount(MemorySegment segment) { return VkDeviceCreateInfo.get_enabledExtensionCount(segment, 0L); }
    /// {@return `enabledExtensionCount`}
    public @CType("uint32_t") int enabledExtensionCount() { return VkDeviceCreateInfo.get_enabledExtensionCount(this.segment()); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enabledExtensionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_enabledExtensionCount.set(segment, 0L, index, value); }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enabledExtensionCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledExtensionCount(segment, 0L, value); }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo enabledExtensionCount(@CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledExtensionCount(this.segment(), value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledExtensionNames(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppEnabledExtensionNames.get(segment, 0L, index); }
    /// {@return `ppEnabledExtensionNames`}
    /// @param segment the segment of the struct
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledExtensionNames(MemorySegment segment) { return VkDeviceCreateInfo.get_ppEnabledExtensionNames(segment, 0L); }
    /// {@return `ppEnabledExtensionNames`}
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledExtensionNames() { return VkDeviceCreateInfo.get_ppEnabledExtensionNames(this.segment()); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppEnabledExtensionNames(MemorySegment segment, long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VH_ppEnabledExtensionNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppEnabledExtensionNames(MemorySegment segment, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledExtensionNames(segment, 0L, value); }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo ppEnabledExtensionNames(@CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledExtensionNames(this.segment(), value); return this; }

    /// {@return `pEnabledFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment get_pEnabledFeatures(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pEnabledFeatures.get(segment, 0L, index); }
    /// {@return `pEnabledFeatures`}
    /// @param segment the segment of the struct
    public static @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment get_pEnabledFeatures(MemorySegment segment) { return VkDeviceCreateInfo.get_pEnabledFeatures(segment, 0L); }
    /// {@return `pEnabledFeatures`}
    public @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment pEnabledFeatures() { return VkDeviceCreateInfo.get_pEnabledFeatures(this.segment()); }
    /// Sets `pEnabledFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pEnabledFeatures(MemorySegment segment, long index, @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment value) { VH_pEnabledFeatures.set(segment, 0L, index, value); }
    /// Sets `pEnabledFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pEnabledFeatures(MemorySegment segment, @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pEnabledFeatures(segment, 0L, value); }
    /// Sets `pEnabledFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceCreateInfo pEnabledFeatures(@CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pEnabledFeatures(this.segment(), value); return this; }

    /// A buffer of [VkDeviceCreateInfo].
    public static final class Buffer extends VkDeviceCreateInfo {
        private final long elementCount;

        /// Creates `VkDeviceCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceCreateInfo`
        public VkDeviceCreateInfo asSlice(long index) { return new VkDeviceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDeviceCreateFlags") int flagsAt(long index) { return VkDeviceCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDeviceCreateFlags") int value) { VkDeviceCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `queueCreateInfoCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueCreateInfoCountAt(long index) { return VkDeviceCreateInfo.get_queueCreateInfoCount(this.segment(), index); }
        /// Sets `queueCreateInfoCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueCreateInfoCountAt(long index, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_queueCreateInfoCount(this.segment(), index, value); return this; }

        /// {@return `pQueueCreateInfos` at the given index}
        /// @param index the index
        public @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment pQueueCreateInfosAt(long index) { return VkDeviceCreateInfo.get_pQueueCreateInfos(this.segment(), index); }
        /// Sets `pQueueCreateInfos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pQueueCreateInfosAt(long index, @CType("const VkDeviceQueueCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pQueueCreateInfos(this.segment(), index, value); return this; }

        /// {@return `enabledLayerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int enabledLayerCountAt(long index) { return VkDeviceCreateInfo.get_enabledLayerCount(this.segment(), index); }
        /// Sets `enabledLayerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer enabledLayerCountAt(long index, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledLayerCount(this.segment(), index, value); return this; }

        /// {@return `ppEnabledLayerNames` at the given index}
        /// @param index the index
        public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledLayerNamesAt(long index) { return VkDeviceCreateInfo.get_ppEnabledLayerNames(this.segment(), index); }
        /// Sets `ppEnabledLayerNames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ppEnabledLayerNamesAt(long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledLayerNames(this.segment(), index, value); return this; }

        /// {@return `enabledExtensionCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int enabledExtensionCountAt(long index) { return VkDeviceCreateInfo.get_enabledExtensionCount(this.segment(), index); }
        /// Sets `enabledExtensionCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer enabledExtensionCountAt(long index, @CType("uint32_t") int value) { VkDeviceCreateInfo.set_enabledExtensionCount(this.segment(), index, value); return this; }

        /// {@return `ppEnabledExtensionNames` at the given index}
        /// @param index the index
        public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledExtensionNamesAt(long index) { return VkDeviceCreateInfo.get_ppEnabledExtensionNames(this.segment(), index); }
        /// Sets `ppEnabledExtensionNames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ppEnabledExtensionNamesAt(long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_ppEnabledExtensionNames(this.segment(), index, value); return this; }

        /// {@return `pEnabledFeatures` at the given index}
        /// @param index the index
        public @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment pEnabledFeaturesAt(long index) { return VkDeviceCreateInfo.get_pEnabledFeatures(this.segment(), index); }
        /// Sets `pEnabledFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pEnabledFeaturesAt(long index, @CType("const VkPhysicalDeviceFeatures *") java.lang.foreign.MemorySegment value) { VkDeviceCreateInfo.set_pEnabledFeatures(this.segment(), index, value); return this; }

    }
}
