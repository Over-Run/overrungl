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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImagePipeSurfaceCreateInfoFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkImagePipeSurfaceCreateFlagsFUCHSIA flags;
///     (int32_t) zx_handle_t imagePipeHandle;
/// };
/// ```
public sealed class VkImagePipeSurfaceCreateInfoFUCHSIA extends GroupType {
    /// The struct layout of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imagePipeHandle")
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
    /// The byte offset of `imagePipeHandle`.
    public static final long OFFSET_imagePipeHandle = LAYOUT.byteOffset(PathElement.groupElement("imagePipeHandle"));
    /// The memory layout of `imagePipeHandle`.
    public static final MemoryLayout LAYOUT_imagePipeHandle = LAYOUT.select(PathElement.groupElement("imagePipeHandle"));
    /// The [VarHandle] of `imagePipeHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imagePipeHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imagePipeHandle"));

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImagePipeSurfaceCreateInfoFUCHSIA(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imagePipeHandle `imagePipeHandle`
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imagePipeHandle) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imagePipeHandle(imagePipeHandle);
    }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImagePipeSurfaceCreateInfoFUCHSIA` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImagePipeSurfaceCreateInfoFUCHSIA`
    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA copyFrom(VkImagePipeSurfaceCreateInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkImagePipeSurfaceCreateInfoFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImagePipeSurfaceCreateInfoFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkImagePipeSurfaceCreateInfoFUCHSIA flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `imagePipeHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imagePipeHandle(MemorySegment segment, long index) { return (int) VH_imagePipeHandle.get(segment, 0L, index); }
    /// {@return `imagePipeHandle`}
    public int imagePipeHandle() { return imagePipeHandle(this.segment(), 0L); }
    /// Sets `imagePipeHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imagePipeHandle(MemorySegment segment, long index, int value) { VH_imagePipeHandle.set(segment, 0L, index, value); }
    /// Sets `imagePipeHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePipeSurfaceCreateInfoFUCHSIA imagePipeHandle(int value) { imagePipeHandle(this.segment(), 0L, value); return this; }

    /// A buffer of [VkImagePipeSurfaceCreateInfoFUCHSIA].
    public static final class Buffer extends VkImagePipeSurfaceCreateInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkImagePipeSurfaceCreateInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`
        public VkImagePipeSurfaceCreateInfoFUCHSIA asSlice(long index) { return new VkImagePipeSurfaceCreateInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImagePipeSurfaceCreateInfoFUCHSIA`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `imagePipeHandle` at the given index}
        /// @param index the index of the struct buffer
        public int imagePipeHandleAt(long index) { return imagePipeHandle(this.segment(), index); }
        /// Sets `imagePipeHandle` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imagePipeHandleAt(long index, int value) { imagePipeHandle(this.segment(), index, value); return this; }

    }
}
