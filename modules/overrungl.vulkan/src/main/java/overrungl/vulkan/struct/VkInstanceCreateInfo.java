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
/// ### pApplicationInfo
/// [VarHandle][#VH_pApplicationInfo] - [Getter][#pApplicationInfo()] - [Setter][#pApplicationInfo(java.lang.foreign.MemorySegment)]
/// ### enabledLayerCount
/// [VarHandle][#VH_enabledLayerCount] - [Getter][#enabledLayerCount()] - [Setter][#enabledLayerCount(int)]
/// ### ppEnabledLayerNames
/// [VarHandle][#VH_ppEnabledLayerNames] - [Getter][#ppEnabledLayerNames()] - [Setter][#ppEnabledLayerNames(java.lang.foreign.MemorySegment)]
/// ### enabledExtensionCount
/// [VarHandle][#VH_enabledExtensionCount] - [Getter][#enabledExtensionCount()] - [Setter][#enabledExtensionCount(int)]
/// ### ppEnabledExtensionNames
/// [VarHandle][#VH_ppEnabledExtensionNames] - [Getter][#ppEnabledExtensionNames()] - [Setter][#ppEnabledExtensionNames(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkInstanceCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkInstanceCreateFlags flags;
///     const VkApplicationInfo * pApplicationInfo;
///     uint32_t enabledLayerCount;
///     const char * const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char * const* ppEnabledExtensionNames;
/// } VkInstanceCreateInfo;
/// ```
public final class VkInstanceCreateInfo extends Struct {
    /// The struct layout of `VkInstanceCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pApplicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withName("ppEnabledExtensionNames")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pApplicationInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pApplicationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationInfo"));
    /// The [VarHandle] of `enabledLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    /// The [VarHandle] of `ppEnabledLayerNames` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    /// The [VarHandle] of `enabledExtensionCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    /// The [VarHandle] of `ppEnabledExtensionNames` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));

    /// Creates `VkInstanceCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkInstanceCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkInstanceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkInstanceCreateInfo`
    public VkInstanceCreateInfo asSlice(long index) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkInstanceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkInstanceCreateInfo`
    public VkInstanceCreateInfo asSlice(long index, long count) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkInstanceCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkInstanceCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkInstanceCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkInstanceCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkInstanceCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo sType(@CType("VkStructureType") int value) { VkInstanceCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkInstanceCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkInstanceCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkInstanceCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkInstanceCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkInstanceCreateFlags") int get_flags(MemorySegment segment) { return VkInstanceCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkInstanceCreateFlags") int flagsAt(long index) { return VkInstanceCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkInstanceCreateFlags") int flags() { return VkInstanceCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkInstanceCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkInstanceCreateFlags") int value) { VkInstanceCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo flagsAt(long index, @CType("VkInstanceCreateFlags") int value) { VkInstanceCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo flags(@CType("VkInstanceCreateFlags") int value) { VkInstanceCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `pApplicationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment get_pApplicationInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pApplicationInfo.get(segment, 0L, index); }
    /// {@return `pApplicationInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment get_pApplicationInfo(MemorySegment segment) { return VkInstanceCreateInfo.get_pApplicationInfo(segment, 0L); }
    /// {@return `pApplicationInfo` at the given index}
    /// @param index the index
    public @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment pApplicationInfoAt(long index) { return VkInstanceCreateInfo.get_pApplicationInfo(this.segment(), index); }
    /// {@return `pApplicationInfo`}
    public @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment pApplicationInfo() { return VkInstanceCreateInfo.get_pApplicationInfo(this.segment()); }
    /// Sets `pApplicationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pApplicationInfo(MemorySegment segment, long index, @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment value) { VH_pApplicationInfo.set(segment, 0L, index, value); }
    /// Sets `pApplicationInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pApplicationInfo(MemorySegment segment, @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pApplicationInfo(segment, 0L, value); }
    /// Sets `pApplicationInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pApplicationInfoAt(long index, @CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pApplicationInfo(this.segment(), index, value); return this; }
    /// Sets `pApplicationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pApplicationInfo(@CType("const VkApplicationInfo *") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_pApplicationInfo(this.segment(), value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_enabledLayerCount(MemorySegment segment, long index) { return (int) VH_enabledLayerCount.get(segment, 0L, index); }
    /// {@return `enabledLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_enabledLayerCount(MemorySegment segment) { return VkInstanceCreateInfo.get_enabledLayerCount(segment, 0L); }
    /// {@return `enabledLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int enabledLayerCountAt(long index) { return VkInstanceCreateInfo.get_enabledLayerCount(this.segment(), index); }
    /// {@return `enabledLayerCount`}
    public @CType("uint32_t") int enabledLayerCount() { return VkInstanceCreateInfo.get_enabledLayerCount(this.segment()); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enabledLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_enabledLayerCount.set(segment, 0L, index, value); }
    /// Sets `enabledLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enabledLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledLayerCount(segment, 0L, value); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledLayerCountAt(long index, @CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledLayerCount(this.segment(), index, value); return this; }
    /// Sets `enabledLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledLayerCount(@CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledLayerCount(this.segment(), value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledLayerNames(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppEnabledLayerNames.get(segment, 0L, index); }
    /// {@return `ppEnabledLayerNames`}
    /// @param segment the segment of the struct
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledLayerNames(MemorySegment segment) { return VkInstanceCreateInfo.get_ppEnabledLayerNames(segment, 0L); }
    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param index the index
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledLayerNamesAt(long index) { return VkInstanceCreateInfo.get_ppEnabledLayerNames(this.segment(), index); }
    /// {@return `ppEnabledLayerNames`}
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledLayerNames() { return VkInstanceCreateInfo.get_ppEnabledLayerNames(this.segment()); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppEnabledLayerNames(MemorySegment segment, long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VH_ppEnabledLayerNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppEnabledLayerNames(MemorySegment segment, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledLayerNames(segment, 0L, value); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledLayerNamesAt(long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledLayerNames(this.segment(), index, value); return this; }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledLayerNames(@CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledLayerNames(this.segment(), value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_enabledExtensionCount(MemorySegment segment, long index) { return (int) VH_enabledExtensionCount.get(segment, 0L, index); }
    /// {@return `enabledExtensionCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_enabledExtensionCount(MemorySegment segment) { return VkInstanceCreateInfo.get_enabledExtensionCount(segment, 0L); }
    /// {@return `enabledExtensionCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int enabledExtensionCountAt(long index) { return VkInstanceCreateInfo.get_enabledExtensionCount(this.segment(), index); }
    /// {@return `enabledExtensionCount`}
    public @CType("uint32_t") int enabledExtensionCount() { return VkInstanceCreateInfo.get_enabledExtensionCount(this.segment()); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enabledExtensionCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_enabledExtensionCount.set(segment, 0L, index, value); }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enabledExtensionCount(MemorySegment segment, @CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledExtensionCount(segment, 0L, value); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledExtensionCountAt(long index, @CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledExtensionCount(this.segment(), index, value); return this; }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledExtensionCount(@CType("uint32_t") int value) { VkInstanceCreateInfo.set_enabledExtensionCount(this.segment(), value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledExtensionNames(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppEnabledExtensionNames.get(segment, 0L, index); }
    /// {@return `ppEnabledExtensionNames`}
    /// @param segment the segment of the struct
    public static @CType("const char * const*") java.lang.foreign.MemorySegment get_ppEnabledExtensionNames(MemorySegment segment) { return VkInstanceCreateInfo.get_ppEnabledExtensionNames(segment, 0L); }
    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param index the index
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledExtensionNamesAt(long index) { return VkInstanceCreateInfo.get_ppEnabledExtensionNames(this.segment(), index); }
    /// {@return `ppEnabledExtensionNames`}
    public @CType("const char * const*") java.lang.foreign.MemorySegment ppEnabledExtensionNames() { return VkInstanceCreateInfo.get_ppEnabledExtensionNames(this.segment()); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppEnabledExtensionNames(MemorySegment segment, long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VH_ppEnabledExtensionNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppEnabledExtensionNames(MemorySegment segment, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledExtensionNames(segment, 0L, value); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledExtensionNamesAt(long index, @CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledExtensionNames(this.segment(), index, value); return this; }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledExtensionNames(@CType("const char * const*") java.lang.foreign.MemorySegment value) { VkInstanceCreateInfo.set_ppEnabledExtensionNames(this.segment(), value); return this; }

}
