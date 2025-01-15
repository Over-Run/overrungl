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
/// ### sciSyncFence
/// [VarHandle][#VH_sciSyncFence] - [Getter][#sciSyncFence()] - [Setter][#sciSyncFence(int)]
/// ### sciSyncSemaphore
/// [VarHandle][#VH_sciSyncSemaphore] - [Getter][#sciSyncSemaphore()] - [Setter][#sciSyncSemaphore(int)]
/// ### sciSyncImport
/// [VarHandle][#VH_sciSyncImport] - [Getter][#sciSyncImport()] - [Setter][#sciSyncImport(int)]
/// ### sciSyncExport
/// [VarHandle][#VH_sciSyncExport] - [Getter][#sciSyncExport()] - [Setter][#sciSyncExport(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExternalSciSyncFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 sciSyncFence;
///     VkBool32 sciSyncSemaphore;
///     VkBool32 sciSyncImport;
///     VkBool32 sciSyncExport;
/// } VkPhysicalDeviceExternalSciSyncFeaturesNV;
/// ```
public sealed class VkPhysicalDeviceExternalSciSyncFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sciSyncFence` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncFence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncFence"));
    /// The [VarHandle] of `sciSyncSemaphore` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncSemaphore"));
    /// The [VarHandle] of `sciSyncImport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncImport"));
    /// The [VarHandle] of `sciSyncExport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sciSyncExport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncExport"));

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExternalSciSyncFeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalSciSyncFeaturesNV`
    public static VkPhysicalDeviceExternalSciSyncFeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int sciSyncFence, @CType("VkBool32") int sciSyncSemaphore, @CType("VkBool32") int sciSyncImport, @CType("VkBool32") int sciSyncExport) { return alloc(allocator).sType(sType).pNext(pNext).sciSyncFence(sciSyncFence).sciSyncSemaphore(sciSyncSemaphore).sciSyncImport(sciSyncImport).sciSyncExport(sciSyncExport); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV copyFrom(VkPhysicalDeviceExternalSciSyncFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `sciSyncFence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncFence(MemorySegment segment, long index) { return (int) VH_sciSyncFence.get(segment, 0L, index); }
    /// {@return `sciSyncFence`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncFence(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncFence(segment, 0L); }
    /// {@return `sciSyncFence`}
    public @CType("VkBool32") int sciSyncFence() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncFence(this.segment()); }
    /// Sets `sciSyncFence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncFence(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncFence.set(segment, 0L, index, value); }
    /// Sets `sciSyncFence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncFence(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncFence(segment, 0L, value); }
    /// Sets `sciSyncFence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncFence(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncFence(this.segment(), value); return this; }

    /// {@return `sciSyncSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncSemaphore(MemorySegment segment, long index) { return (int) VH_sciSyncSemaphore.get(segment, 0L, index); }
    /// {@return `sciSyncSemaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncSemaphore(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncSemaphore(segment, 0L); }
    /// {@return `sciSyncSemaphore`}
    public @CType("VkBool32") int sciSyncSemaphore() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncSemaphore(this.segment()); }
    /// Sets `sciSyncSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncSemaphore(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncSemaphore.set(segment, 0L, index, value); }
    /// Sets `sciSyncSemaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncSemaphore(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncSemaphore(segment, 0L, value); }
    /// Sets `sciSyncSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncSemaphore(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncSemaphore(this.segment(), value); return this; }

    /// {@return `sciSyncImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncImport(MemorySegment segment, long index) { return (int) VH_sciSyncImport.get(segment, 0L, index); }
    /// {@return `sciSyncImport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncImport(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncImport(segment, 0L); }
    /// {@return `sciSyncImport`}
    public @CType("VkBool32") int sciSyncImport() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncImport(this.segment()); }
    /// Sets `sciSyncImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncImport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncImport.set(segment, 0L, index, value); }
    /// Sets `sciSyncImport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncImport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncImport(segment, 0L, value); }
    /// Sets `sciSyncImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncImport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncImport(this.segment(), value); return this; }

    /// {@return `sciSyncExport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sciSyncExport(MemorySegment segment, long index) { return (int) VH_sciSyncExport.get(segment, 0L, index); }
    /// {@return `sciSyncExport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sciSyncExport(MemorySegment segment) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncExport(segment, 0L); }
    /// {@return `sciSyncExport`}
    public @CType("VkBool32") int sciSyncExport() { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncExport(this.segment()); }
    /// Sets `sciSyncExport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sciSyncExport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sciSyncExport.set(segment, 0L, index, value); }
    /// Sets `sciSyncExport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sciSyncExport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncExport(segment, 0L, value); }
    /// Sets `sciSyncExport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSyncFeaturesNV sciSyncExport(@CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncExport(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceExternalSciSyncFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceExternalSciSyncFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExternalSciSyncFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`
        public VkPhysicalDeviceExternalSciSyncFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalSciSyncFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExternalSciSyncFeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `sciSyncFence` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciSyncFenceAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncFence(this.segment(), index); }
        /// Sets `sciSyncFence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncFenceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncFence(this.segment(), index, value); return this; }

        /// {@return `sciSyncSemaphore` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciSyncSemaphoreAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncSemaphore(this.segment(), index); }
        /// Sets `sciSyncSemaphore` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncSemaphoreAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncSemaphore(this.segment(), index, value); return this; }

        /// {@return `sciSyncImport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciSyncImportAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncImport(this.segment(), index); }
        /// Sets `sciSyncImport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncImportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncImport(this.segment(), index, value); return this; }

        /// {@return `sciSyncExport` at the given index}
        /// @param index the index
        public @CType("VkBool32") int sciSyncExportAt(long index) { return VkPhysicalDeviceExternalSciSyncFeaturesNV.get_sciSyncExport(this.segment(), index); }
        /// Sets `sciSyncExport` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncExportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExternalSciSyncFeaturesNV.set_sciSyncExport(this.segment(), index, value); return this; }

    }
}
