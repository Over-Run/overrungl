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
/// struct VkPhysicalDevice8BitStorageFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 storageBuffer8BitAccess;
///     VkBool32 uniformAndStorageBuffer8BitAccess;
///     VkBool32 storagePushConstant8;
/// };
/// ```
public sealed class VkPhysicalDevice8BitStorageFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDevice8BitStorageFeatures`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8")
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
    /// The byte offset of `storageBuffer8BitAccess`.
    public static final long OFFSET_storageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The memory layout of `storageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_storageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The [VarHandle] of `storageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The byte offset of `uniformAndStorageBuffer8BitAccess`.
    public static final long OFFSET_uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The memory layout of `uniformAndStorageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformAndStorageBuffer8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The byte offset of `storagePushConstant8`.
    public static final long OFFSET_storagePushConstant8 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
    /// The memory layout of `storagePushConstant8`.
    public static final MemoryLayout LAYOUT_storagePushConstant8 = LAYOUT.select(PathElement.groupElement("storagePushConstant8"));
    /// The [VarHandle] of `storagePushConstant8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storagePushConstant8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8"));

    /// Creates `VkPhysicalDevice8BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevice8BitStorageFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevice8BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice8BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice8BitStorageFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevice8BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevice8BitStorageFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice8BitStorageFeatures`
    public static VkPhysicalDevice8BitStorageFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevice8BitStorageFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevice8BitStorageFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice8BitStorageFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeatures copyFrom(VkPhysicalDevice8BitStorageFeatures src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDevice8BitStorageFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevice8BitStorageFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer8BitAccess`}
    public int storageBuffer8BitAccess() { return storageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_storageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(int value) { storageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer8BitAccess`}
    public int uniformAndStorageBuffer8BitAccess() { return uniformAndStorageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_uniformAndStorageBuffer8BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(int value) { uniformAndStorageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storagePushConstant8(MemorySegment segment, long index) { return (int) VH_storagePushConstant8.get(segment, 0L, index); }
    /// {@return `storagePushConstant8`}
    public int storagePushConstant8() { return storagePushConstant8(this.segment(), 0L); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storagePushConstant8(MemorySegment segment, long index, int value) { VH_storagePushConstant8.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeatures storagePushConstant8(int value) { storagePushConstant8(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDevice8BitStorageFeatures].
    public static final class Buffer extends VkPhysicalDevice8BitStorageFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDevice8BitStorageFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevice8BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevice8BitStorageFeatures`
        public VkPhysicalDevice8BitStorageFeatures asSlice(long index) { return new VkPhysicalDevice8BitStorageFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevice8BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevice8BitStorageFeatures`
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

        /// {@return `storageBuffer8BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int storageBuffer8BitAccessAt(long index) { return storageBuffer8BitAccess(this.segment(), index); }
        /// Sets `storageBuffer8BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storageBuffer8BitAccessAt(long index, int value) { storageBuffer8BitAccess(this.segment(), index, value); return this; }

        /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int uniformAndStorageBuffer8BitAccessAt(long index) { return uniformAndStorageBuffer8BitAccess(this.segment(), index); }
        /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer uniformAndStorageBuffer8BitAccessAt(long index, int value) { uniformAndStorageBuffer8BitAccess(this.segment(), index, value); return this; }

        /// {@return `storagePushConstant8` at the given index}
        /// @param index the index of the struct buffer
        public int storagePushConstant8At(long index) { return storagePushConstant8(this.segment(), index); }
        /// Sets `storagePushConstant8` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer storagePushConstant8At(long index, int value) { storagePushConstant8(this.segment(), index, value); return this; }

    }
}
