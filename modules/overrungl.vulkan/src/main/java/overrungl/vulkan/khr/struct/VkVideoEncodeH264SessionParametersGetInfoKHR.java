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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeH264SessionParametersGetInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 writeStdSPS;
///     (uint32_t) VkBool32 writeStdPPS;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// };
/// ```
public sealed class VkVideoEncodeH264SessionParametersGetInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264SessionParametersGetInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
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
    /// The byte offset of `writeStdSPS`.
    public static final long OFFSET_writeStdSPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdSPS"));
    /// The memory layout of `writeStdSPS`.
    public static final MemoryLayout LAYOUT_writeStdSPS = LAYOUT.select(PathElement.groupElement("writeStdSPS"));
    /// The [VarHandle] of `writeStdSPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdSPS"));
    /// The byte offset of `writeStdPPS`.
    public static final long OFFSET_writeStdPPS = LAYOUT.byteOffset(PathElement.groupElement("writeStdPPS"));
    /// The memory layout of `writeStdPPS`.
    public static final MemoryLayout LAYOUT_writeStdPPS = LAYOUT.select(PathElement.groupElement("writeStdPPS"));
    /// The [VarHandle] of `writeStdPPS` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdPPS"));
    /// The byte offset of `stdSPSId`.
    public static final long OFFSET_stdSPSId = LAYOUT.byteOffset(PathElement.groupElement("stdSPSId"));
    /// The memory layout of `stdSPSId`.
    public static final MemoryLayout LAYOUT_stdSPSId = LAYOUT.select(PathElement.groupElement("stdSPSId"));
    /// The [VarHandle] of `stdSPSId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSId"));
    /// The byte offset of `stdPPSId`.
    public static final long OFFSET_stdPPSId = LAYOUT.byteOffset(PathElement.groupElement("stdPPSId"));
    /// The memory layout of `stdPPSId`.
    public static final MemoryLayout LAYOUT_stdPPSId = LAYOUT.select(PathElement.groupElement("stdPPSId"));
    /// The [VarHandle] of `stdPPSId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdPPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSId"));

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionParametersGetInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersGetInfoKHR`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersGetInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR copyFrom(VkVideoEncodeH264SessionParametersGetInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH264SessionParametersGetInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `writeStdSPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeStdSPS(MemorySegment segment, long index) { return (int) VH_writeStdSPS.get(segment, 0L, index); }
    /// {@return `writeStdSPS`}
    public int writeStdSPS() { return writeStdSPS(this.segment(), 0L); }
    /// Sets `writeStdSPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeStdSPS(MemorySegment segment, long index, int value) { VH_writeStdSPS.set(segment, 0L, index, value); }
    /// Sets `writeStdSPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPS(int value) { writeStdSPS(this.segment(), 0L, value); return this; }

    /// {@return `writeStdPPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeStdPPS(MemorySegment segment, long index) { return (int) VH_writeStdPPS.get(segment, 0L, index); }
    /// {@return `writeStdPPS`}
    public int writeStdPPS() { return writeStdPPS(this.segment(), 0L); }
    /// Sets `writeStdPPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeStdPPS(MemorySegment segment, long index, int value) { VH_writeStdPPS.set(segment, 0L, index, value); }
    /// Sets `writeStdPPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPS(int value) { writeStdPPS(this.segment(), 0L, value); return this; }

    /// {@return `stdSPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSPSId(MemorySegment segment, long index) { return (int) VH_stdSPSId.get(segment, 0L, index); }
    /// {@return `stdSPSId`}
    public int stdSPSId() { return stdSPSId(this.segment(), 0L); }
    /// Sets `stdSPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSPSId(MemorySegment segment, long index, int value) { VH_stdSPSId.set(segment, 0L, index, value); }
    /// Sets `stdSPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSId(int value) { stdSPSId(this.segment(), 0L, value); return this; }

    /// {@return `stdPPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdPPSId(MemorySegment segment, long index) { return (int) VH_stdPPSId.get(segment, 0L, index); }
    /// {@return `stdPPSId`}
    public int stdPPSId() { return stdPPSId(this.segment(), 0L); }
    /// Sets `stdPPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdPPSId(MemorySegment segment, long index, int value) { VH_stdPPSId.set(segment, 0L, index, value); }
    /// Sets `stdPPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSId(int value) { stdPPSId(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH264SessionParametersGetInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264SessionParametersGetInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersGetInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264SessionParametersGetInfoKHR`
        public VkVideoEncodeH264SessionParametersGetInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersGetInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264SessionParametersGetInfoKHR`
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

        /// {@return `writeStdSPS` at the given index}
        /// @param index the index of the struct buffer
        public int writeStdSPSAt(long index) { return writeStdSPS(this.segment(), index); }
        /// Sets `writeStdSPS` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer writeStdSPSAt(long index, int value) { writeStdSPS(this.segment(), index, value); return this; }

        /// {@return `writeStdPPS` at the given index}
        /// @param index the index of the struct buffer
        public int writeStdPPSAt(long index) { return writeStdPPS(this.segment(), index); }
        /// Sets `writeStdPPS` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer writeStdPPSAt(long index, int value) { writeStdPPS(this.segment(), index, value); return this; }

        /// {@return `stdSPSId` at the given index}
        /// @param index the index of the struct buffer
        public int stdSPSIdAt(long index) { return stdSPSId(this.segment(), index); }
        /// Sets `stdSPSId` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdSPSIdAt(long index, int value) { stdSPSId(this.segment(), index, value); return this; }

        /// {@return `stdPPSId` at the given index}
        /// @param index the index of the struct buffer
        public int stdPPSIdAt(long index) { return stdPPSId(this.segment(), index); }
        /// Sets `stdPPSId` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdPPSIdAt(long index, int value) { stdPPSId(this.segment(), index, value); return this; }

    }
}
