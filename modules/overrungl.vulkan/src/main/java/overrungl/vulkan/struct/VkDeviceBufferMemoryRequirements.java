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
/// struct VkDeviceBufferMemoryRequirements {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkBufferCreateInfo* pCreateInfo;
/// };
/// ```
public sealed class VkDeviceBufferMemoryRequirements extends GroupType {
    /// The struct layout of `VkDeviceBufferMemoryRequirements`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo")
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
    /// The byte offset of `pCreateInfo`.
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    /// The memory layout of `pCreateInfo`.
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    public VkDeviceBufferMemoryRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceBufferMemoryRequirements ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceBufferMemoryRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceBufferMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceBufferMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceBufferMemoryRequirements`
    public static VkDeviceBufferMemoryRequirements alloc(SegmentAllocator allocator) { return new VkDeviceBufferMemoryRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceBufferMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceBufferMemoryRequirements`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceBufferMemoryRequirements copyFrom(VkDeviceBufferMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDeviceBufferMemoryRequirements sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceBufferMemoryRequirements pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    public MemorySegment pCreateInfo() { return pCreateInfo(this.segment(), 0L); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCreateInfo(MemorySegment segment, long index, MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceBufferMemoryRequirements pCreateInfo(MemorySegment value) { pCreateInfo(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDeviceBufferMemoryRequirements].
    public static final class Buffer extends VkDeviceBufferMemoryRequirements {
        private final long elementCount;

        /// Creates `VkDeviceBufferMemoryRequirements.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceBufferMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceBufferMemoryRequirements`
        public VkDeviceBufferMemoryRequirements asSlice(long index) { return new VkDeviceBufferMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceBufferMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceBufferMemoryRequirements`
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

        /// {@return `pCreateInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCreateInfoAt(long index) { return pCreateInfo(this.segment(), index); }
        /// Sets `pCreateInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCreateInfoAt(long index, MemorySegment value) { pCreateInfo(this.segment(), index, value); return this; }

    }
}
