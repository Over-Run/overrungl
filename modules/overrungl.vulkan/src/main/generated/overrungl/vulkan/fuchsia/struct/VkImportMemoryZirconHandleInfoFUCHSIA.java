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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImportMemoryZirconHandleInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkExternalMemoryHandleTypeFlagBits handleType;
///     (int32_t) zx_handle_t handle;
/// };
/// ```
public final class VkImportMemoryZirconHandleInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkImportMemoryZirconHandleInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle")
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
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The byte offset of `handle`.
    public static final long OFFSET_handle = LAYOUT.byteOffset(PathElement.groupElement("handle"));
    /// The memory layout of `handle`.
    public static final MemoryLayout LAYOUT_handle = LAYOUT.select(PathElement.groupElement("handle"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportMemoryZirconHandleInfoFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryZirconHandleInfoFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryZirconHandleInfoFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryZirconHandleInfoFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryZirconHandleInfoFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImportMemoryZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param handleType `handleType`
    /// @param handle `handle`
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int handleType, int handle) {
        return alloc(allocator).sType(sType).pNext(pNext).handleType(handleType).handle(handle);
    }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param handleType `handleType`
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int handleType) {
        return alloc(allocator).sType(sType).pNext(pNext).handleType(handleType);
    }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA copyFrom(VkImportMemoryZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportMemoryZirconHandleInfoFUCHSIA reinterpret(long count) { return new VkImportMemoryZirconHandleInfoFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportMemoryZirconHandleInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportMemoryZirconHandleInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkImportMemoryZirconHandleInfoFUCHSIA handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handle(MemorySegment segment, long index) { return (int) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    public int handle() { return handle(this.segment(), 0L); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handle(MemorySegment segment, long index, int value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA handle(int value) { handle(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportMemoryZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportMemoryZirconHandleInfoFUCHSIA`
    public VkImportMemoryZirconHandleInfoFUCHSIA asSlice(long index) { return new VkImportMemoryZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportMemoryZirconHandleInfoFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportMemoryZirconHandleInfoFUCHSIA`
    public VkImportMemoryZirconHandleInfoFUCHSIA asSlice(long index, long count) { return new VkImportMemoryZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportMemoryZirconHandleInfoFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA at(long index, Consumer<VkImportMemoryZirconHandleInfoFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

    /// {@return `handle` at the given index}
    /// @param index the index of the struct buffer
    public int handleAt(long index) { return handle(this.segment(), index); }
    /// Sets `handle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA handleAt(long index, int value) { handle(this.segment(), index, value); return this; }

}
