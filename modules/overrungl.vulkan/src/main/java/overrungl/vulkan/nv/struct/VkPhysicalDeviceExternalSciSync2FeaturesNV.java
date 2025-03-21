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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalSciSync2FeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 sciSyncFence;
///     (uint32_t) VkBool32 sciSyncSemaphore2;
///     (uint32_t) VkBool32 sciSyncImport;
///     (uint32_t) VkBool32 sciSyncExport;
/// };
/// ```
public sealed class VkPhysicalDeviceExternalSciSync2FeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore2"),
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
    /// The byte offset of `sciSyncSemaphore2`.
    public static final long OFFSET_sciSyncSemaphore2 = LAYOUT.byteOffset(PathElement.groupElement("sciSyncSemaphore2"));
    /// The memory layout of `sciSyncSemaphore2`.
    public static final MemoryLayout LAYOUT_sciSyncSemaphore2 = LAYOUT.select(PathElement.groupElement("sciSyncSemaphore2"));
    /// The [VarHandle] of `sciSyncSemaphore2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sciSyncSemaphore2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sciSyncSemaphore2"));
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

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExternalSciSync2FeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalSciSync2FeaturesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public static VkPhysicalDeviceExternalSciSync2FeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExternalSciSync2FeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalSciSync2FeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV copyFrom(VkPhysicalDeviceExternalSciSync2FeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalSciSync2FeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncFence(int value) { sciSyncFence(this.segment(), 0L, value); return this; }

    /// {@return `sciSyncSemaphore2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sciSyncSemaphore2(MemorySegment segment, long index) { return (int) VH_sciSyncSemaphore2.get(segment, 0L, index); }
    /// {@return `sciSyncSemaphore2`}
    public int sciSyncSemaphore2() { return sciSyncSemaphore2(this.segment(), 0L); }
    /// Sets `sciSyncSemaphore2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sciSyncSemaphore2(MemorySegment segment, long index, int value) { VH_sciSyncSemaphore2.set(segment, 0L, index, value); }
    /// Sets `sciSyncSemaphore2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncSemaphore2(int value) { sciSyncSemaphore2(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncImport(int value) { sciSyncImport(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalSciSync2FeaturesNV sciSyncExport(int value) { sciSyncExport(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceExternalSciSync2FeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceExternalSciSync2FeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExternalSciSync2FeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`
        public VkPhysicalDeviceExternalSciSync2FeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalSciSync2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExternalSciSync2FeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `sciSyncFence` at the given index}
        /// @param index the index of the struct buffer
        public int sciSyncFenceAt(long index) { return sciSyncFence(this.segment(), index); }
        /// Sets `sciSyncFence` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncFenceAt(long index, int value) { sciSyncFence(this.segment(), index, value); return this; }

        /// {@return `sciSyncSemaphore2` at the given index}
        /// @param index the index of the struct buffer
        public int sciSyncSemaphore2At(long index) { return sciSyncSemaphore2(this.segment(), index); }
        /// Sets `sciSyncSemaphore2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncSemaphore2At(long index, int value) { sciSyncSemaphore2(this.segment(), index, value); return this; }

        /// {@return `sciSyncImport` at the given index}
        /// @param index the index of the struct buffer
        public int sciSyncImportAt(long index) { return sciSyncImport(this.segment(), index); }
        /// Sets `sciSyncImport` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncImportAt(long index, int value) { sciSyncImport(this.segment(), index, value); return this; }

        /// {@return `sciSyncExport` at the given index}
        /// @param index the index of the struct buffer
        public int sciSyncExportAt(long index) { return sciSyncExport(this.segment(), index); }
        /// Sets `sciSyncExport` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sciSyncExportAt(long index, int value) { sciSyncExport(this.segment(), index, value); return this; }

    }
}
