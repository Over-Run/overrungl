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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDevice16BitStorageFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 storageBuffer16BitAccess;
///     (uint32_t) VkBool32 uniformAndStorageBuffer16BitAccess;
///     (uint32_t) VkBool32 storagePushConstant16;
///     (uint32_t) VkBool32 storageInputOutput16;
/// };
/// ```
public sealed class VkPhysicalDevice16BitStorageFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDevice16BitStorageFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16")
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
    /// The byte offset of `storageBuffer16BitAccess`.
    public static final long OFFSET_storageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The memory layout of `storageBuffer16BitAccess`.
    public static final MemoryLayout LAYOUT_storageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The [VarHandle] of `storageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The byte offset of `uniformAndStorageBuffer16BitAccess`.
    public static final long OFFSET_uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The memory layout of `uniformAndStorageBuffer16BitAccess`.
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer16BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The byte offset of `storagePushConstant16`.
    public static final long OFFSET_storagePushConstant16 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant16"));
    /// The memory layout of `storagePushConstant16`.
    public static final MemoryLayout LAYOUT_storagePushConstant16 = LAYOUT.select(PathElement.groupElement("storagePushConstant16"));
    /// The [VarHandle] of `storagePushConstant16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    /// The byte offset of `storageInputOutput16`.
    public static final long OFFSET_storageInputOutput16 = LAYOUT.byteOffset(PathElement.groupElement("storageInputOutput16"));
    /// The memory layout of `storageInputOutput16`.
    public static final MemoryLayout LAYOUT_storageInputOutput16 = LAYOUT.select(PathElement.groupElement("storageInputOutput16"));
    /// The [VarHandle] of `storageInputOutput16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevice16BitStorageFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice16BitStorageFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeatures(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevice16BitStorageFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice16BitStorageFeatures`
    public static VkPhysicalDevice16BitStorageFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevice16BitStorageFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevice16BitStorageFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice16BitStorageFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures copyFrom(VkPhysicalDevice16BitStorageFeatures src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDevice16BitStorageFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevice16BitStorageFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer16BitAccess`}
    public int storageBuffer16BitAccess() { return storageBuffer16BitAccess(this.segment(), 0L); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffer16BitAccess(MemorySegment segment, long index, int value) { VH_storageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(int value) { storageBuffer16BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    public int uniformAndStorageBuffer16BitAccess() { return uniformAndStorageBuffer16BitAccess(this.segment(), 0L); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index, int value) { VH_uniformAndStorageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(int value) { uniformAndStorageBuffer16BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `storagePushConstant16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storagePushConstant16(MemorySegment segment, long index) { return (int) VH_storagePushConstant16.get(segment, 0L, index); }
    /// {@return `storagePushConstant16`}
    public int storagePushConstant16() { return storagePushConstant16(this.segment(), 0L); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storagePushConstant16(MemorySegment segment, long index, int value) { VH_storagePushConstant16.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storagePushConstant16(int value) { storagePushConstant16(this.segment(), 0L, value); return this; }

    /// {@return `storageInputOutput16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageInputOutput16(MemorySegment segment, long index) { return (int) VH_storageInputOutput16.get(segment, 0L, index); }
    /// {@return `storageInputOutput16`}
    public int storageInputOutput16() { return storageInputOutput16(this.segment(), 0L); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageInputOutput16(MemorySegment segment, long index, int value) { VH_storageInputOutput16.set(segment, 0L, index, value); }
    /// Sets `storageInputOutput16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storageInputOutput16(int value) { storageInputOutput16(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDevice16BitStorageFeatures].
    public static final class Buffer extends VkPhysicalDevice16BitStorageFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDevice16BitStorageFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevice16BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevice16BitStorageFeatures`
        public VkPhysicalDevice16BitStorageFeatures asSlice(long index) { return new VkPhysicalDevice16BitStorageFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevice16BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevice16BitStorageFeatures`
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

        /// {@return `storageBuffer16BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int storageBuffer16BitAccessAt(long index) { return storageBuffer16BitAccess(this.segment(), index); }
        /// Sets `storageBuffer16BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageBuffer16BitAccessAt(long index, int value) { storageBuffer16BitAccess(this.segment(), index, value); return this; }

        /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int uniformAndStorageBuffer16BitAccessAt(long index) { return uniformAndStorageBuffer16BitAccess(this.segment(), index); }
        /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer uniformAndStorageBuffer16BitAccessAt(long index, int value) { uniformAndStorageBuffer16BitAccess(this.segment(), index, value); return this; }

        /// {@return `storagePushConstant16` at the given index}
        /// @param index the index of the struct buffer
        public int storagePushConstant16At(long index) { return storagePushConstant16(this.segment(), index); }
        /// Sets `storagePushConstant16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storagePushConstant16At(long index, int value) { storagePushConstant16(this.segment(), index, value); return this; }

        /// {@return `storageInputOutput16` at the given index}
        /// @param index the index of the struct buffer
        public int storageInputOutput16At(long index) { return storageInputOutput16(this.segment(), index); }
        /// Sets `storageInputOutput16` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageInputOutput16At(long index, int value) { storageInputOutput16(this.segment(), index, value); return this; }

    }
}
