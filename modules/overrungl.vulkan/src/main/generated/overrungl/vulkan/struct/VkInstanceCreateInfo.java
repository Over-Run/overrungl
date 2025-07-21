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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkInstanceCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkInstanceCreateFlags flags;
///     const VkApplicationInfo* pApplicationInfo;
///     uint32_t enabledLayerCount;
///     const char* const * ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char* const * ppEnabledExtensionNames;
/// };
/// ```
public final class VkInstanceCreateInfo extends GroupType {
    /// The struct layout of `VkInstanceCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pApplicationInfo"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withName("ppEnabledExtensionNames")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pApplicationInfo`.
    public static final long OFFSET_pApplicationInfo = LAYOUT.byteOffset(PathElement.groupElement("pApplicationInfo"));
    /// The memory layout of `pApplicationInfo`.
    public static final MemoryLayout LAYOUT_pApplicationInfo = LAYOUT.select(PathElement.groupElement("pApplicationInfo"));
    /// The [VarHandle] of `pApplicationInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pApplicationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationInfo"));
    /// The byte offset of `enabledLayerCount`.
    public static final long OFFSET_enabledLayerCount = LAYOUT.byteOffset(PathElement.groupElement("enabledLayerCount"));
    /// The memory layout of `enabledLayerCount`.
    public static final MemoryLayout LAYOUT_enabledLayerCount = LAYOUT.select(PathElement.groupElement("enabledLayerCount"));
    /// The [VarHandle] of `enabledLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enabledLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledLayerCount"));
    /// The byte offset of `ppEnabledLayerNames`.
    public static final long OFFSET_ppEnabledLayerNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledLayerNames"));
    /// The memory layout of `ppEnabledLayerNames`.
    public static final MemoryLayout LAYOUT_ppEnabledLayerNames = LAYOUT.select(PathElement.groupElement("ppEnabledLayerNames"));
    /// The [VarHandle] of `ppEnabledLayerNames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppEnabledLayerNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledLayerNames"));
    /// The byte offset of `enabledExtensionCount`.
    public static final long OFFSET_enabledExtensionCount = LAYOUT.byteOffset(PathElement.groupElement("enabledExtensionCount"));
    /// The memory layout of `enabledExtensionCount`.
    public static final MemoryLayout LAYOUT_enabledExtensionCount = LAYOUT.select(PathElement.groupElement("enabledExtensionCount"));
    /// The [VarHandle] of `enabledExtensionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enabledExtensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledExtensionCount"));
    /// The byte offset of `ppEnabledExtensionNames`.
    public static final long OFFSET_ppEnabledExtensionNames = LAYOUT.byteOffset(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The memory layout of `ppEnabledExtensionNames`.
    public static final MemoryLayout LAYOUT_ppEnabledExtensionNames = LAYOUT.select(PathElement.groupElement("ppEnabledExtensionNames"));
    /// The [VarHandle] of `ppEnabledExtensionNames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ppEnabledExtensionNames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppEnabledExtensionNames"));

    /// Creates `VkInstanceCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkInstanceCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkInstanceCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkInstanceCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkInstanceCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkInstanceCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param pApplicationInfo `pApplicationInfo`
    /// @param enabledLayerCount `enabledLayerCount`
    /// @param ppEnabledLayerNames `ppEnabledLayerNames`
    /// @param enabledExtensionCount `enabledExtensionCount`
    /// @param ppEnabledExtensionNames `ppEnabledExtensionNames`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment pApplicationInfo, int enabledLayerCount, MemorySegment ppEnabledLayerNames, int enabledExtensionCount, MemorySegment ppEnabledExtensionNames) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pApplicationInfo(pApplicationInfo).enabledLayerCount(enabledLayerCount).ppEnabledLayerNames(ppEnabledLayerNames).enabledExtensionCount(enabledExtensionCount).ppEnabledExtensionNames(ppEnabledExtensionNames);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param pApplicationInfo `pApplicationInfo`
    /// @param enabledLayerCount `enabledLayerCount`
    /// @param ppEnabledLayerNames `ppEnabledLayerNames`
    /// @param enabledExtensionCount `enabledExtensionCount`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment pApplicationInfo, int enabledLayerCount, MemorySegment ppEnabledLayerNames, int enabledExtensionCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pApplicationInfo(pApplicationInfo).enabledLayerCount(enabledLayerCount).ppEnabledLayerNames(ppEnabledLayerNames).enabledExtensionCount(enabledExtensionCount);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param pApplicationInfo `pApplicationInfo`
    /// @param enabledLayerCount `enabledLayerCount`
    /// @param ppEnabledLayerNames `ppEnabledLayerNames`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment pApplicationInfo, int enabledLayerCount, MemorySegment ppEnabledLayerNames) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pApplicationInfo(pApplicationInfo).enabledLayerCount(enabledLayerCount).ppEnabledLayerNames(ppEnabledLayerNames);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param pApplicationInfo `pApplicationInfo`
    /// @param enabledLayerCount `enabledLayerCount`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment pApplicationInfo, int enabledLayerCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pApplicationInfo(pApplicationInfo).enabledLayerCount(enabledLayerCount);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param pApplicationInfo `pApplicationInfo`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, MemorySegment pApplicationInfo) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pApplicationInfo(pApplicationInfo);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkInstanceCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkInstanceCreateInfo`
    public static VkInstanceCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkInstanceCreateInfo copyFrom(VkInstanceCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkInstanceCreateInfo reinterpret(long count) { return new VkInstanceCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkInstanceCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkInstanceCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pApplicationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pApplicationInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pApplicationInfo.get(segment, 0L, index); }
    /// {@return `pApplicationInfo`}
    public MemorySegment pApplicationInfo() { return pApplicationInfo(this.segment(), 0L); }
    /// Sets `pApplicationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pApplicationInfo(MemorySegment segment, long index, MemorySegment value) { VH_pApplicationInfo.set(segment, 0L, index, value); }
    /// Sets `pApplicationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pApplicationInfo(MemorySegment value) { pApplicationInfo(this.segment(), 0L, value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enabledLayerCount(MemorySegment segment, long index) { return (int) VH_enabledLayerCount.get(segment, 0L, index); }
    /// {@return `enabledLayerCount`}
    public int enabledLayerCount() { return enabledLayerCount(this.segment(), 0L); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enabledLayerCount(MemorySegment segment, long index, int value) { VH_enabledLayerCount.set(segment, 0L, index, value); }
    /// Sets `enabledLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledLayerCount(int value) { enabledLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppEnabledLayerNames(MemorySegment segment, long index) { return (MemorySegment) VH_ppEnabledLayerNames.get(segment, 0L, index); }
    /// {@return `ppEnabledLayerNames`}
    public MemorySegment ppEnabledLayerNames() { return ppEnabledLayerNames(this.segment(), 0L); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppEnabledLayerNames(MemorySegment segment, long index, MemorySegment value) { VH_ppEnabledLayerNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledLayerNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledLayerNames(MemorySegment value) { ppEnabledLayerNames(this.segment(), 0L, value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enabledExtensionCount(MemorySegment segment, long index) { return (int) VH_enabledExtensionCount.get(segment, 0L, index); }
    /// {@return `enabledExtensionCount`}
    public int enabledExtensionCount() { return enabledExtensionCount(this.segment(), 0L); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enabledExtensionCount(MemorySegment segment, long index, int value) { VH_enabledExtensionCount.set(segment, 0L, index, value); }
    /// Sets `enabledExtensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledExtensionCount(int value) { enabledExtensionCount(this.segment(), 0L, value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment ppEnabledExtensionNames(MemorySegment segment, long index) { return (MemorySegment) VH_ppEnabledExtensionNames.get(segment, 0L, index); }
    /// {@return `ppEnabledExtensionNames`}
    public MemorySegment ppEnabledExtensionNames() { return ppEnabledExtensionNames(this.segment(), 0L); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ppEnabledExtensionNames(MemorySegment segment, long index, MemorySegment value) { VH_ppEnabledExtensionNames.set(segment, 0L, index, value); }
    /// Sets `ppEnabledExtensionNames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledExtensionNames(MemorySegment value) { ppEnabledExtensionNames(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkInstanceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkInstanceCreateInfo`
    public VkInstanceCreateInfo asSlice(long index) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkInstanceCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkInstanceCreateInfo`
    public VkInstanceCreateInfo asSlice(long index, long count) { return new VkInstanceCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkInstanceCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkInstanceCreateInfo at(long index, Consumer<VkInstanceCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pApplicationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pApplicationInfoAt(long index) { return pApplicationInfo(this.segment(), index); }
    /// Sets `pApplicationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo pApplicationInfoAt(long index, MemorySegment value) { pApplicationInfo(this.segment(), index, value); return this; }

    /// {@return `enabledLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int enabledLayerCountAt(long index) { return enabledLayerCount(this.segment(), index); }
    /// Sets `enabledLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledLayerCountAt(long index, int value) { enabledLayerCount(this.segment(), index, value); return this; }

    /// {@return `ppEnabledLayerNames` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppEnabledLayerNamesAt(long index) { return ppEnabledLayerNames(this.segment(), index); }
    /// Sets `ppEnabledLayerNames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledLayerNamesAt(long index, MemorySegment value) { ppEnabledLayerNames(this.segment(), index, value); return this; }

    /// {@return `enabledExtensionCount` at the given index}
    /// @param index the index of the struct buffer
    public int enabledExtensionCountAt(long index) { return enabledExtensionCount(this.segment(), index); }
    /// Sets `enabledExtensionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo enabledExtensionCountAt(long index, int value) { enabledExtensionCount(this.segment(), index, value); return this; }

    /// {@return `ppEnabledExtensionNames` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment ppEnabledExtensionNamesAt(long index) { return ppEnabledExtensionNames(this.segment(), index); }
    /// Sets `ppEnabledExtensionNames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkInstanceCreateInfo ppEnabledExtensionNamesAt(long index, MemorySegment value) { ppEnabledExtensionNames(this.segment(), index, value); return this; }

}
