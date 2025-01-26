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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkValidationFlagsEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t disabledValidationCheckCount;
///     const VkValidationCheckEXT* pDisabledValidationChecks;
/// };
/// ```
public sealed class VkValidationFlagsEXT extends GroupType {
    /// The struct layout of `VkValidationFlagsEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationChecks")
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
    /// The byte offset of `disabledValidationCheckCount`.
    public static final long OFFSET_disabledValidationCheckCount = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationCheckCount"));
    /// The memory layout of `disabledValidationCheckCount`.
    public static final MemoryLayout LAYOUT_disabledValidationCheckCount = LAYOUT.select(PathElement.groupElement("disabledValidationCheckCount"));
    /// The [VarHandle] of `disabledValidationCheckCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_disabledValidationCheckCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationCheckCount"));
    /// The byte offset of `pDisabledValidationChecks`.
    public static final long OFFSET_pDisabledValidationChecks = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationChecks"));
    /// The memory layout of `pDisabledValidationChecks`.
    public static final MemoryLayout LAYOUT_pDisabledValidationChecks = LAYOUT.select(PathElement.groupElement("pDisabledValidationChecks"));
    /// The [VarHandle] of `pDisabledValidationChecks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDisabledValidationChecks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationChecks"));

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment the memory segment
    public VkValidationFlagsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFlagsEXT`
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationFlagsEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkValidationFlagsEXT copyFrom(VkValidationFlagsEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkValidationFlagsEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkValidationFlagsEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `disabledValidationCheckCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int disabledValidationCheckCount(MemorySegment segment, long index) { return (int) VH_disabledValidationCheckCount.get(segment, 0L, index); }
    /// {@return `disabledValidationCheckCount`}
    public int disabledValidationCheckCount() { return disabledValidationCheckCount(this.segment(), 0L); }
    /// Sets `disabledValidationCheckCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void disabledValidationCheckCount(MemorySegment segment, long index, int value) { VH_disabledValidationCheckCount.set(segment, 0L, index, value); }
    /// Sets `disabledValidationCheckCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT disabledValidationCheckCount(int value) { disabledValidationCheckCount(this.segment(), 0L, value); return this; }

    /// {@return `pDisabledValidationChecks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDisabledValidationChecks(MemorySegment segment, long index) { return (MemorySegment) VH_pDisabledValidationChecks.get(segment, 0L, index); }
    /// {@return `pDisabledValidationChecks`}
    public MemorySegment pDisabledValidationChecks() { return pDisabledValidationChecks(this.segment(), 0L); }
    /// Sets `pDisabledValidationChecks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDisabledValidationChecks(MemorySegment segment, long index, MemorySegment value) { VH_pDisabledValidationChecks.set(segment, 0L, index, value); }
    /// Sets `pDisabledValidationChecks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pDisabledValidationChecks(MemorySegment value) { pDisabledValidationChecks(this.segment(), 0L, value); return this; }

    /// A buffer of [VkValidationFlagsEXT].
    public static final class Buffer extends VkValidationFlagsEXT {
        private final long elementCount;

        /// Creates `VkValidationFlagsEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkValidationFlagsEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkValidationFlagsEXT`
        public VkValidationFlagsEXT asSlice(long index) { return new VkValidationFlagsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkValidationFlagsEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkValidationFlagsEXT`
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

        /// {@return `disabledValidationCheckCount` at the given index}
        /// @param index the index of the struct buffer
        public int disabledValidationCheckCountAt(long index) { return disabledValidationCheckCount(this.segment(), index); }
        /// Sets `disabledValidationCheckCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer disabledValidationCheckCountAt(long index, int value) { disabledValidationCheckCount(this.segment(), index, value); return this; }

        /// {@return `pDisabledValidationChecks` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDisabledValidationChecksAt(long index) { return pDisabledValidationChecks(this.segment(), index); }
        /// Sets `pDisabledValidationChecks` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDisabledValidationChecksAt(long index, MemorySegment value) { pDisabledValidationChecks(this.segment(), index, value); return this; }

    }
}
