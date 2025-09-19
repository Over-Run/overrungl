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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImportSemaphoreZirconHandleInfoFUCHSIA`.
/// ## Layout
/// ```
/// struct VkImportSemaphoreZirconHandleInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphore semaphore;
///     ((uint32_t) VkFlags) VkSemaphoreImportFlags flags;
///     (int) VkExternalSemaphoreHandleTypeFlagBits handleType;
///     (int32_t) zx_handle_t zirconHandle;
/// };
/// ```
public final class VkImportSemaphoreZirconHandleInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkImportSemaphoreZirconHandleInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("zirconHandle")
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
    /// The byte offset of `semaphore`.
    public static final long OFFSET_semaphore = LAYOUT.byteOffset(PathElement.groupElement("semaphore"));
    /// The memory layout of `semaphore`.
    public static final MemoryLayout LAYOUT_semaphore = LAYOUT.select(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The byte offset of `zirconHandle`.
    public static final long OFFSET_zirconHandle = LAYOUT.byteOffset(PathElement.groupElement("zirconHandle"));
    /// The memory layout of `zirconHandle`.
    public static final MemoryLayout LAYOUT_zirconHandle = LAYOUT.select(PathElement.groupElement("zirconHandle"));
    /// The [VarHandle] of `zirconHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_zirconHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("zirconHandle"));

    /// Creates `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportSemaphoreZirconHandleInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportSemaphoreZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportSemaphoreZirconHandleInfoFUCHSIA`
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportSemaphoreZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportSemaphoreZirconHandleInfoFUCHSIA`
    public static VkImportSemaphoreZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA copyFrom(VkImportSemaphoreZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportSemaphoreZirconHandleInfoFUCHSIA reinterpret(long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportSemaphoreZirconHandleInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportSemaphoreZirconHandleInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long semaphore(MemorySegment segment, long index) { return (long) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    public long semaphore() { return semaphore(this.segment(), 0L); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphore(MemorySegment segment, long index, long value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA semaphore(long value) { semaphore(this.segment(), 0L, value); return this; }

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
    public VkImportSemaphoreZirconHandleInfoFUCHSIA flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    public int handleType() { return handleType(this.segment(), 0L); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleType(MemorySegment segment, long index, int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// {@return `zirconHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int zirconHandle(MemorySegment segment, long index) { return (int) VH_zirconHandle.get(segment, 0L, index); }
    /// {@return `zirconHandle`}
    public int zirconHandle() { return zirconHandle(this.segment(), 0L); }
    /// Sets `zirconHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void zirconHandle(MemorySegment segment, long index, int value) { VH_zirconHandle.set(segment, 0L, index, value); }
    /// Sets `zirconHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA zirconHandle(int value) { zirconHandle(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportSemaphoreZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportSemaphoreZirconHandleInfoFUCHSIA`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA asSlice(long index) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportSemaphoreZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportSemaphoreZirconHandleInfoFUCHSIA`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA asSlice(long index, long count) { return new VkImportSemaphoreZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportSemaphoreZirconHandleInfoFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA at(long index, Consumer<VkImportSemaphoreZirconHandleInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param index the index of the struct buffer
    public long semaphoreAt(long index) { return semaphore(this.segment(), index); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA semaphoreAt(long index, long value) { semaphore(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

    /// {@return `zirconHandle` at the given index}
    /// @param index the index of the struct buffer
    public int zirconHandleAt(long index) { return zirconHandle(this.segment(), index); }
    /// Sets `zirconHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreZirconHandleInfoFUCHSIA zirconHandleAt(long index, int value) { zirconHandle(this.segment(), index, value); return this; }

}
