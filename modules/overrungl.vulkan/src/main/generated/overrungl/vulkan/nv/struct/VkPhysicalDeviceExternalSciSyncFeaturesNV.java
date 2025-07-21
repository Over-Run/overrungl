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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalSciSyncFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 sciSyncFence;
///     (uint32_t) VkBool32 sciSyncSemaphore;
///     (uint32_t) VkBool32 sciSyncImport;
///     (uint32_t) VkBool32 sciSyncExport;
/// };
/// ```
public final class VkPhysicalDeviceExternalSciSyncFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
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
    /// The byte offset of `sciSyncFence`.
    public static final long OFFSET_sciSyncFence = LAYOUT.byteOffset(PathElement.groupElement("sciSyncFence"));
    /// The memory layout of `sciSyncFence`.
    public static final MemoryLayout LAYOUT_sciSyncFence = LAYOUT.select(PathElement.groupElement("sciSyncFence"));
    /// The [VarHandle] of `sciSyncFence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciSyncFence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncFence"));
    /// The byte offset of `sciSyncSemaphore`.
    public static final long OFFSET_sciSyncSemaphore = LAYOUT.byteOffset(PathElement.groupElement("sciSyncSemaphore"));
    /// The memory layout of `sciSyncSemaphore`.
    public static final MemoryLayout LAYOUT_sciSyncSemaphore = LAYOUT.select(PathElement.groupElement("sciSyncSemaphore"));
    /// The [VarHandle] of `sciSyncSemaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciSyncSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncSemaphore"));
    /// The byte offset of `sciSyncImport`.
    public static final long OFFSET_sciSyncImport = LAYOUT.byteOffset(PathElement.groupElement("sciSyncImport"));
    /// The memory layout of `sciSyncImport`.
    public static final MemoryLayout LAYOUT_sciSyncImport = LAYOUT.select(PathElement.groupElement("sciSyncImport"));
    /// The [VarHandle] of `sciSyncImport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciSyncImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncImport"));
    /// The byte offset of `sciSyncExport`.
    public static final long OFFSET_sciSyncExport = LAYOUT.byteOffset(PathElement.groupElement("sciSyncExport"));
    /// The memory layout of `sciSyncExport`.
    public static final MemoryLayout LAYOUT_sciSyncExport = LAYOUT.select(PathElement.groupElement("sciSyncExport"));
    /// The [VarHandle] of `sciSyncExport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciSyncExport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncExport"));

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sciSyncFence `sciSyncFence`
    /// @param sciSyncSemaphore `sciSyncSemaphore`
    /// @param sciSyncImport `sciSyncImport`
    /// @param sciSyncExport `sciSyncExport`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sciSyncFence, int sciSyncSemaphore, int sciSyncImport, int sciSyncExport) {
        return alloc(allocator).sType(sType).pNext(pNext).sciSyncFence(sciSyncFence).sciSyncSemaphore(sciSyncSemaphore).sciSyncImport(sciSyncImport).sciSyncExport(sciSyncExport);
    }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sciSyncFence `sciSyncFence`
    /// @param sciSyncSemaphore `sciSyncSemaphore`
    /// @param sciSyncImport `sciSyncImport`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sciSyncFence, int sciSyncSemaphore, int sciSyncImport) {
        return alloc(allocator).sType(sType).pNext(pNext).sciSyncFence(sciSyncFence).sciSyncSemaphore(sciSyncSemaphore).sciSyncImport(sciSyncImport);
    }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sciSyncFence `sciSyncFence`
    /// @param sciSyncSemaphore `sciSyncSemaphore`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sciSyncFence, int sciSyncSemaphore) {
        return alloc(allocator).sType(sType).pNext(pNext).sciSyncFence(sciSyncFence).sciSyncSemaphore(sciSyncSemaphore);
    }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param sciSyncFence `sciSyncFence`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int sciSyncFence) {
        return alloc(allocator).sType(sType).pNext(pNext).sciSyncFence(sciSyncFence);
    }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV copyFrom(VkPhysicalDeviceExternalSciSyncFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalSciSyncFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalSciSyncFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sciSyncFence` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciSyncFence(MemorySegment segment, long index) { return (int) VH_sciSyncFence.get(segment, 0L, index); }
    /// {@return `sciSyncFence`}
    public int sciSyncFence() { return sciSyncFence(this.segment(), 0L); }
    /// Sets `sciSyncFence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciSyncFence(MemorySegment segment, long index, int value) { VH_sciSyncFence.set(segment, 0L, index, value); }
    /// Sets `sciSyncFence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncFence(int value) { sciSyncFence(this.segment(), 0L, value); return this; }

    /// {@return `sciSyncSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciSyncSemaphore(MemorySegment segment, long index) { return (int) VH_sciSyncSemaphore.get(segment, 0L, index); }
    /// {@return `sciSyncSemaphore`}
    public int sciSyncSemaphore() { return sciSyncSemaphore(this.segment(), 0L); }
    /// Sets `sciSyncSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciSyncSemaphore(MemorySegment segment, long index, int value) { VH_sciSyncSemaphore.set(segment, 0L, index, value); }
    /// Sets `sciSyncSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncSemaphore(int value) { sciSyncSemaphore(this.segment(), 0L, value); return this; }

    /// {@return `sciSyncImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciSyncImport(MemorySegment segment, long index) { return (int) VH_sciSyncImport.get(segment, 0L, index); }
    /// {@return `sciSyncImport`}
    public int sciSyncImport() { return sciSyncImport(this.segment(), 0L); }
    /// Sets `sciSyncImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciSyncImport(MemorySegment segment, long index, int value) { VH_sciSyncImport.set(segment, 0L, index, value); }
    /// Sets `sciSyncImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncImport(int value) { sciSyncImport(this.segment(), 0L, value); return this; }

    /// {@return `sciSyncExport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciSyncExport(MemorySegment segment, long index) { return (int) VH_sciSyncExport.get(segment, 0L, index); }
    /// {@return `sciSyncExport`}
    public int sciSyncExport() { return sciSyncExport(this.segment(), 0L); }
    /// Sets `sciSyncExport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciSyncExport(MemorySegment segment, long index, int value) { VH_sciSyncExport.set(segment, 0L, index, value); }
    /// Sets `sciSyncExport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncExport(int value) { sciSyncExport(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalSciSyncFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV at(long index, Consumer<VkPhysicalDeviceExternalSciSyncFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sciSyncFence` at the given index}
    /// @param index the index of the struct buffer
    public int sciSyncFenceAt(long index) { return sciSyncFence(this.segment(), index); }
    /// Sets `sciSyncFence` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncFenceAt(long index, int value) { sciSyncFence(this.segment(), index, value); return this; }

    /// {@return `sciSyncSemaphore` at the given index}
    /// @param index the index of the struct buffer
    public int sciSyncSemaphoreAt(long index) { return sciSyncSemaphore(this.segment(), index); }
    /// Sets `sciSyncSemaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncSemaphoreAt(long index, int value) { sciSyncSemaphore(this.segment(), index, value); return this; }

    /// {@return `sciSyncImport` at the given index}
    /// @param index the index of the struct buffer
    public int sciSyncImportAt(long index) { return sciSyncImport(this.segment(), index); }
    /// Sets `sciSyncImport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncImportAt(long index, int value) { sciSyncImport(this.segment(), index, value); return this; }

    /// {@return `sciSyncExport` at the given index}
    /// @param index the index of the struct buffer
    public int sciSyncExportAt(long index) { return sciSyncExport(this.segment(), index); }
    /// Sets `sciSyncExport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncExportAt(long index, int value) { sciSyncExport(this.segment(), index, value); return this; }

}
