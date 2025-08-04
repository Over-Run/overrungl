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
/// struct VkPhysicalDeviceExternalMemorySciBufFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 sciBufImport;
///     (uint32_t) VkBool32 sciBufExport;
/// };
/// ```
public final class VkPhysicalDeviceExternalMemorySciBufFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciBufImport"),
        ValueLayout.JAVA_INT.withName("sciBufExport")
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
    /// The byte offset of `sciBufImport`.
    public static final long OFFSET_sciBufImport = LAYOUT.byteOffset(PathElement.groupElement("sciBufImport"));
    /// The memory layout of `sciBufImport`.
    public static final MemoryLayout LAYOUT_sciBufImport = LAYOUT.select(PathElement.groupElement("sciBufImport"));
    /// The [VarHandle] of `sciBufImport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciBufImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciBufImport"));
    /// The byte offset of `sciBufExport`.
    public static final long OFFSET_sciBufExport = LAYOUT.byteOffset(PathElement.groupElement("sciBufExport"));
    /// The memory layout of `sciBufExport`.
    public static final MemoryLayout LAYOUT_sciBufExport = LAYOUT.select(PathElement.groupElement("sciBufExport"));
    /// The [VarHandle] of `sciBufExport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciBufExport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciBufExport"));

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV copyFrom(VkPhysicalDeviceExternalMemorySciBufFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sciBufImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciBufImport(MemorySegment segment, long index) { return (int) VH_sciBufImport.get(segment, 0L, index); }
    /// {@return `sciBufImport`}
    public int sciBufImport() { return sciBufImport(this.segment(), 0L); }
    /// Sets `sciBufImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciBufImport(MemorySegment segment, long index, int value) { VH_sciBufImport.set(segment, 0L, index, value); }
    /// Sets `sciBufImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufImport(int value) { sciBufImport(this.segment(), 0L, value); return this; }

    /// {@return `sciBufExport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciBufExport(MemorySegment segment, long index) { return (int) VH_sciBufExport.get(segment, 0L, index); }
    /// {@return `sciBufExport`}
    public int sciBufExport() { return sciBufExport(this.segment(), 0L); }
    /// Sets `sciBufExport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciBufExport(MemorySegment segment, long index, int value) { VH_sciBufExport.set(segment, 0L, index, value); }
    /// Sets `sciBufExport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufExport(int value) { sciBufExport(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV at(long index, Consumer<VkPhysicalDeviceExternalMemorySciBufFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sciBufImport` at the given index}
    /// @param index the index of the struct buffer
    public int sciBufImportAt(long index) { return sciBufImport(this.segment(), index); }
    /// Sets `sciBufImport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufImportAt(long index, int value) { sciBufImport(this.segment(), index, value); return this; }

    /// {@return `sciBufExport` at the given index}
    /// @param index the index of the struct buffer
    public int sciBufExportAt(long index) { return sciBufExport(this.segment(), index); }
    /// Sets `sciBufExport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufExportAt(long index, int value) { sciBufExport(this.segment(), index, value); return this; }

}
