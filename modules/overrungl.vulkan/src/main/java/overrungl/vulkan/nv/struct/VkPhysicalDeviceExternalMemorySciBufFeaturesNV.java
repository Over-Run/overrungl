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
package overrungl.vulkan.nv.struct;

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
/// ### sciBufImport
/// [VarHandle][#VH_sciBufImport] - [Getter][#sciBufImport()] - [Setter][#sciBufImport(int)]
/// ### sciBufExport
/// [VarHandle][#VH_sciBufExport] - [Getter][#sciBufExport()] - [Setter][#sciBufExport(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExternalMemorySciBufFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 sciBufImport;
///     VkBool32 sciBufExport;
/// } VkPhysicalDeviceExternalMemorySciBufFeaturesNV;
/// ```
public sealed class VkPhysicalDeviceExternalMemorySciBufFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciBufImport"),
        ValueLayout.JAVA_INT.withName("sciBufExport")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sciBufImport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciBufImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciBufImport"));
    /// The [VarHandle] of `sciBufExport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciBufExport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciBufExport"));

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExternalMemorySciBufFeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
    public static VkPhysicalDeviceExternalMemorySciBufFeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int sciBufImport, @CType("VkBool32") int sciBufExport) { return alloc(allocator).sType(sType).pNext(pNext).sciBufImport(sciBufImport).sciBufExport(sciBufExport); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV copyFrom(VkPhysicalDeviceExternalMemorySciBufFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `sciBufImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciBufImport(MemorySegment segment, long index) { return (int) VH_sciBufImport.get(segment, 0L, index); }
    /// {@return `sciBufImport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciBufImport(MemorySegment segment) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufImport(segment, 0L); }
    /// {@return `sciBufImport`}
    public @CType("VkBool32") int sciBufImport() { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufImport(this.segment()); }
    /// Sets `sciBufImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciBufImport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciBufImport.set(segment, 0L, index, value); }
    /// Sets `sciBufImport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciBufImport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufImport(segment, 0L, value); }
    /// Sets `sciBufImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufImport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufImport(this.segment(), value); return this; }

    /// {@return `sciBufExport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciBufExport(MemorySegment segment, long index) { return (int) VH_sciBufExport.get(segment, 0L, index); }
    /// {@return `sciBufExport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciBufExport(MemorySegment segment) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufExport(segment, 0L); }
    /// {@return `sciBufExport`}
    public @CType("VkBool32") int sciBufExport() { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufExport(this.segment()); }
    /// Sets `sciBufExport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciBufExport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciBufExport.set(segment, 0L, index, value); }
    /// Sets `sciBufExport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciBufExport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufExport(segment, 0L, value); }
    /// Sets `sciBufExport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV sciBufExport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufExport(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceExternalMemorySciBufFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceExternalMemorySciBufFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExternalMemorySciBufFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
        public VkPhysicalDeviceExternalMemorySciBufFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExternalMemorySciBufFeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `sciBufImport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciBufImportAt(long index) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufImport(this.segment(), index); }
        /// Sets `sciBufImport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciBufImportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufImport(this.segment(), index, value); return this; }

        /// {@return `sciBufExport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciBufExportAt(long index) { return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.get_sciBufExport(this.segment(), index); }
        /// Sets `sciBufExport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciBufExportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalMemorySciBufFeaturesNV.set_sciBufExport(this.segment(), index, value); return this; }

    }
}
