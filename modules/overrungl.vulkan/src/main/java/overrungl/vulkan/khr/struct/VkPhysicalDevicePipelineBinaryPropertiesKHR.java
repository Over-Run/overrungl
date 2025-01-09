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
/// ### pipelineBinaryInternalCache
/// [VarHandle][#VH_pipelineBinaryInternalCache] - [Getter][#pipelineBinaryInternalCache()] - [Setter][#pipelineBinaryInternalCache(int)]
/// ### pipelineBinaryInternalCacheControl
/// [VarHandle][#VH_pipelineBinaryInternalCacheControl] - [Getter][#pipelineBinaryInternalCacheControl()] - [Setter][#pipelineBinaryInternalCacheControl(int)]
/// ### pipelineBinaryPrefersInternalCache
/// [VarHandle][#VH_pipelineBinaryPrefersInternalCache] - [Getter][#pipelineBinaryPrefersInternalCache()] - [Setter][#pipelineBinaryPrefersInternalCache(int)]
/// ### pipelineBinaryPrecompiledInternalCache
/// [VarHandle][#VH_pipelineBinaryPrecompiledInternalCache] - [Getter][#pipelineBinaryPrecompiledInternalCache()] - [Setter][#pipelineBinaryPrecompiledInternalCache(int)]
/// ### pipelineBinaryCompressedData
/// [VarHandle][#VH_pipelineBinaryCompressedData] - [Getter][#pipelineBinaryCompressedData()] - [Setter][#pipelineBinaryCompressedData(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevicePipelineBinaryPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 pipelineBinaryInternalCache;
///     VkBool32 pipelineBinaryInternalCacheControl;
///     VkBool32 pipelineBinaryPrefersInternalCache;
///     VkBool32 pipelineBinaryPrecompiledInternalCache;
///     VkBool32 pipelineBinaryCompressedData;
/// } VkPhysicalDevicePipelineBinaryPropertiesKHR;
/// ```
public final class VkPhysicalDevicePipelineBinaryPropertiesKHR extends Struct {
    /// The struct layout of `VkPhysicalDevicePipelineBinaryPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryInternalCacheControl"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrefersInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryPrecompiledInternalCache"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCompressedData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineBinaryInternalCache` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBinaryInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCache"));
    /// The [VarHandle] of `pipelineBinaryInternalCacheControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBinaryInternalCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryInternalCacheControl"));
    /// The [VarHandle] of `pipelineBinaryPrefersInternalCache` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBinaryPrefersInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrefersInternalCache"));
    /// The [VarHandle] of `pipelineBinaryPrecompiledInternalCache` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBinaryPrecompiledInternalCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryPrecompiledInternalCache"));
    /// The [VarHandle] of `pipelineBinaryCompressedData` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBinaryCompressedData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBinaryCompressedData"));

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevicePipelineBinaryPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineBinaryPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineBinaryPropertiesKHR`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevicePipelineBinaryPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineBinaryPropertiesKHR`
    public static VkPhysicalDevicePipelineBinaryPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineBinaryPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineBinaryInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineBinaryInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryInternalCache`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineBinaryInternalCache(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCache(segment, 0L); }
    /// {@return `pipelineBinaryInternalCache` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineBinaryInternalCacheAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCache(this.segment(), index); }
    /// {@return `pipelineBinaryInternalCache`}
    public @CType("VkBool32") int pipelineBinaryInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCache(this.segment()); }
    /// Sets `pipelineBinaryInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinaryInternalCache(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineBinaryInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryInternalCache` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinaryInternalCache(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCache(segment, 0L, value); }
    /// Sets `pipelineBinaryInternalCache` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCache(this.segment(), index, value); return this; }
    /// Sets `pipelineBinaryInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCache(@CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCache(this.segment(), value); return this; }

    /// {@return `pipelineBinaryInternalCacheControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineBinaryInternalCacheControl(MemorySegment segment, long index) { return (int) VH_pipelineBinaryInternalCacheControl.get(segment, 0L, index); }
    /// {@return `pipelineBinaryInternalCacheControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineBinaryInternalCacheControl(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCacheControl(segment, 0L); }
    /// {@return `pipelineBinaryInternalCacheControl` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineBinaryInternalCacheControlAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCacheControl(this.segment(), index); }
    /// {@return `pipelineBinaryInternalCacheControl`}
    public @CType("VkBool32") int pipelineBinaryInternalCacheControl() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryInternalCacheControl(this.segment()); }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinaryInternalCacheControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineBinaryInternalCacheControl.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinaryInternalCacheControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCacheControl(segment, 0L, value); }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCacheControl(this.segment(), index, value); return this; }
    /// Sets `pipelineBinaryInternalCacheControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryInternalCacheControl(@CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryInternalCacheControl(this.segment(), value); return this; }

    /// {@return `pipelineBinaryPrefersInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineBinaryPrefersInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryPrefersInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryPrefersInternalCache`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineBinaryPrefersInternalCache(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrefersInternalCache(segment, 0L); }
    /// {@return `pipelineBinaryPrefersInternalCache` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineBinaryPrefersInternalCacheAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrefersInternalCache(this.segment(), index); }
    /// {@return `pipelineBinaryPrefersInternalCache`}
    public @CType("VkBool32") int pipelineBinaryPrefersInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrefersInternalCache(this.segment()); }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinaryPrefersInternalCache(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineBinaryPrefersInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinaryPrefersInternalCache(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrefersInternalCache(segment, 0L, value); }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCacheAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrefersInternalCache(this.segment(), index, value); return this; }
    /// Sets `pipelineBinaryPrefersInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrefersInternalCache(@CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrefersInternalCache(this.segment(), value); return this; }

    /// {@return `pipelineBinaryPrecompiledInternalCache` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineBinaryPrecompiledInternalCache(MemorySegment segment, long index) { return (int) VH_pipelineBinaryPrecompiledInternalCache.get(segment, 0L, index); }
    /// {@return `pipelineBinaryPrecompiledInternalCache`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineBinaryPrecompiledInternalCache(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrecompiledInternalCache(segment, 0L); }
    /// {@return `pipelineBinaryPrecompiledInternalCache` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineBinaryPrecompiledInternalCacheAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrecompiledInternalCache(this.segment(), index); }
    /// {@return `pipelineBinaryPrecompiledInternalCache`}
    public @CType("VkBool32") int pipelineBinaryPrecompiledInternalCache() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryPrecompiledInternalCache(this.segment()); }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinaryPrecompiledInternalCache(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineBinaryPrecompiledInternalCache.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinaryPrecompiledInternalCache(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrecompiledInternalCache(segment, 0L, value); }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCacheAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrecompiledInternalCache(this.segment(), index, value); return this; }
    /// Sets `pipelineBinaryPrecompiledInternalCache` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryPrecompiledInternalCache(@CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryPrecompiledInternalCache(this.segment(), value); return this; }

    /// {@return `pipelineBinaryCompressedData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_pipelineBinaryCompressedData(MemorySegment segment, long index) { return (int) VH_pipelineBinaryCompressedData.get(segment, 0L, index); }
    /// {@return `pipelineBinaryCompressedData`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_pipelineBinaryCompressedData(MemorySegment segment) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryCompressedData(segment, 0L); }
    /// {@return `pipelineBinaryCompressedData` at the given index}
    /// @param index the index
    public @CType("VkBool32") int pipelineBinaryCompressedDataAt(long index) { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryCompressedData(this.segment(), index); }
    /// {@return `pipelineBinaryCompressedData`}
    public @CType("VkBool32") int pipelineBinaryCompressedData() { return VkPhysicalDevicePipelineBinaryPropertiesKHR.get_pipelineBinaryCompressedData(this.segment()); }
    /// Sets `pipelineBinaryCompressedData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBinaryCompressedData(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_pipelineBinaryCompressedData.set(segment, 0L, index, value); }
    /// Sets `pipelineBinaryCompressedData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBinaryCompressedData(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryCompressedData(segment, 0L, value); }
    /// Sets `pipelineBinaryCompressedData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedDataAt(long index, @CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryCompressedData(this.segment(), index, value); return this; }
    /// Sets `pipelineBinaryCompressedData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineBinaryPropertiesKHR pipelineBinaryCompressedData(@CType("VkBool32") int value) { VkPhysicalDevicePipelineBinaryPropertiesKHR.set_pipelineBinaryCompressedData(this.segment(), value); return this; }

}
