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
/// struct VkStencilOpState {
///     (int) VkStencilOp failOp;
///     (int) VkStencilOp passOp;
///     (int) VkStencilOp depthFailOp;
///     (int) VkCompareOp compareOp;
///     uint32_t compareMask;
///     uint32_t writeMask;
///     uint32_t reference;
/// };
/// ```
public sealed class VkStencilOpState extends GroupType {
    /// The struct layout of `VkStencilOpState`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("passOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_INT.withName("compareMask"),
        ValueLayout.JAVA_INT.withName("writeMask"),
        ValueLayout.JAVA_INT.withName("reference")
    );
    /// The byte offset of `failOp`.
    public static final long OFFSET_failOp = LAYOUT.byteOffset(PathElement.groupElement("failOp"));
    /// The memory layout of `failOp`.
    public static final MemoryLayout LAYOUT_failOp = LAYOUT.select(PathElement.groupElement("failOp"));
    /// The [VarHandle] of `failOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_failOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("failOp"));
    /// The byte offset of `passOp`.
    public static final long OFFSET_passOp = LAYOUT.byteOffset(PathElement.groupElement("passOp"));
    /// The memory layout of `passOp`.
    public static final MemoryLayout LAYOUT_passOp = LAYOUT.select(PathElement.groupElement("passOp"));
    /// The [VarHandle] of `passOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_passOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("passOp"));
    /// The byte offset of `depthFailOp`.
    public static final long OFFSET_depthFailOp = LAYOUT.byteOffset(PathElement.groupElement("depthFailOp"));
    /// The memory layout of `depthFailOp`.
    public static final MemoryLayout LAYOUT_depthFailOp = LAYOUT.select(PathElement.groupElement("depthFailOp"));
    /// The [VarHandle] of `depthFailOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthFailOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthFailOp"));
    /// The byte offset of `compareOp`.
    public static final long OFFSET_compareOp = LAYOUT.byteOffset(PathElement.groupElement("compareOp"));
    /// The memory layout of `compareOp`.
    public static final MemoryLayout LAYOUT_compareOp = LAYOUT.select(PathElement.groupElement("compareOp"));
    /// The [VarHandle] of `compareOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareOp"));
    /// The byte offset of `compareMask`.
    public static final long OFFSET_compareMask = LAYOUT.byteOffset(PathElement.groupElement("compareMask"));
    /// The memory layout of `compareMask`.
    public static final MemoryLayout LAYOUT_compareMask = LAYOUT.select(PathElement.groupElement("compareMask"));
    /// The [VarHandle] of `compareMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compareMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compareMask"));
    /// The byte offset of `writeMask`.
    public static final long OFFSET_writeMask = LAYOUT.byteOffset(PathElement.groupElement("writeMask"));
    /// The memory layout of `writeMask`.
    public static final MemoryLayout LAYOUT_writeMask = LAYOUT.select(PathElement.groupElement("writeMask"));
    /// The [VarHandle] of `writeMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_writeMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeMask"));
    /// The byte offset of `reference`.
    public static final long OFFSET_reference = LAYOUT.byteOffset(PathElement.groupElement("reference"));
    /// The memory layout of `reference`.
    public static final MemoryLayout LAYOUT_reference = LAYOUT.select(PathElement.groupElement("reference"));
    /// The [VarHandle] of `reference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_reference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reference"));

    /// Creates `VkStencilOpState` with the given segment.
    /// @param segment the memory segment
    public VkStencilOpState(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkStencilOpState` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkStencilOpState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStencilOpState ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStencilOpState(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkStencilOpState` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkStencilOpState` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStencilOpState`
    public static VkStencilOpState alloc(SegmentAllocator allocator) { return new VkStencilOpState(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkStencilOpState` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStencilOpState`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStencilOpState copyFrom(VkStencilOpState src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `failOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int failOp(MemorySegment segment, long index) { return (int) VH_failOp.get(segment, 0L, index); }
    /// {@return `failOp`}
    public int failOp() { return failOp(this.segment(), 0L); }
    /// Sets `failOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void failOp(MemorySegment segment, long index, int value) { VH_failOp.set(segment, 0L, index, value); }
    /// Sets `failOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState failOp(int value) { failOp(this.segment(), 0L, value); return this; }

    /// {@return `passOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int passOp(MemorySegment segment, long index) { return (int) VH_passOp.get(segment, 0L, index); }
    /// {@return `passOp`}
    public int passOp() { return passOp(this.segment(), 0L); }
    /// Sets `passOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void passOp(MemorySegment segment, long index, int value) { VH_passOp.set(segment, 0L, index, value); }
    /// Sets `passOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState passOp(int value) { passOp(this.segment(), 0L, value); return this; }

    /// {@return `depthFailOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthFailOp(MemorySegment segment, long index) { return (int) VH_depthFailOp.get(segment, 0L, index); }
    /// {@return `depthFailOp`}
    public int depthFailOp() { return depthFailOp(this.segment(), 0L); }
    /// Sets `depthFailOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthFailOp(MemorySegment segment, long index, int value) { VH_depthFailOp.set(segment, 0L, index, value); }
    /// Sets `depthFailOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState depthFailOp(int value) { depthFailOp(this.segment(), 0L, value); return this; }

    /// {@return `compareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compareOp(MemorySegment segment, long index) { return (int) VH_compareOp.get(segment, 0L, index); }
    /// {@return `compareOp`}
    public int compareOp() { return compareOp(this.segment(), 0L); }
    /// Sets `compareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compareOp(MemorySegment segment, long index, int value) { VH_compareOp.set(segment, 0L, index, value); }
    /// Sets `compareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareOp(int value) { compareOp(this.segment(), 0L, value); return this; }

    /// {@return `compareMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compareMask(MemorySegment segment, long index) { return (int) VH_compareMask.get(segment, 0L, index); }
    /// {@return `compareMask`}
    public int compareMask() { return compareMask(this.segment(), 0L); }
    /// Sets `compareMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compareMask(MemorySegment segment, long index, int value) { VH_compareMask.set(segment, 0L, index, value); }
    /// Sets `compareMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState compareMask(int value) { compareMask(this.segment(), 0L, value); return this; }

    /// {@return `writeMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int writeMask(MemorySegment segment, long index) { return (int) VH_writeMask.get(segment, 0L, index); }
    /// {@return `writeMask`}
    public int writeMask() { return writeMask(this.segment(), 0L); }
    /// Sets `writeMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void writeMask(MemorySegment segment, long index, int value) { VH_writeMask.set(segment, 0L, index, value); }
    /// Sets `writeMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState writeMask(int value) { writeMask(this.segment(), 0L, value); return this; }

    /// {@return `reference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reference(MemorySegment segment, long index) { return (int) VH_reference.get(segment, 0L, index); }
    /// {@return `reference`}
    public int reference() { return reference(this.segment(), 0L); }
    /// Sets `reference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reference(MemorySegment segment, long index, int value) { VH_reference.set(segment, 0L, index, value); }
    /// Sets `reference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStencilOpState reference(int value) { reference(this.segment(), 0L, value); return this; }

    /// A buffer of [VkStencilOpState].
    public static final class Buffer extends VkStencilOpState {
        private final long elementCount;

        /// Creates `VkStencilOpState.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkStencilOpState`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkStencilOpState`
        public VkStencilOpState asSlice(long index) { return new VkStencilOpState(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkStencilOpState`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkStencilOpState`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `failOp` at the given index}
        /// @param index the index of the struct buffer
        public int failOpAt(long index) { return failOp(this.segment(), index); }
        /// Sets `failOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer failOpAt(long index, int value) { failOp(this.segment(), index, value); return this; }

        /// {@return `passOp` at the given index}
        /// @param index the index of the struct buffer
        public int passOpAt(long index) { return passOp(this.segment(), index); }
        /// Sets `passOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer passOpAt(long index, int value) { passOp(this.segment(), index, value); return this; }

        /// {@return `depthFailOp` at the given index}
        /// @param index the index of the struct buffer
        public int depthFailOpAt(long index) { return depthFailOp(this.segment(), index); }
        /// Sets `depthFailOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthFailOpAt(long index, int value) { depthFailOp(this.segment(), index, value); return this; }

        /// {@return `compareOp` at the given index}
        /// @param index the index of the struct buffer
        public int compareOpAt(long index) { return compareOp(this.segment(), index); }
        /// Sets `compareOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer compareOpAt(long index, int value) { compareOp(this.segment(), index, value); return this; }

        /// {@return `compareMask` at the given index}
        /// @param index the index of the struct buffer
        public int compareMaskAt(long index) { return compareMask(this.segment(), index); }
        /// Sets `compareMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer compareMaskAt(long index, int value) { compareMask(this.segment(), index, value); return this; }

        /// {@return `writeMask` at the given index}
        /// @param index the index of the struct buffer
        public int writeMaskAt(long index) { return writeMask(this.segment(), index); }
        /// Sets `writeMask` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer writeMaskAt(long index, int value) { writeMask(this.segment(), index, value); return this; }

        /// {@return `reference` at the given index}
        /// @param index the index of the struct buffer
        public int referenceAt(long index) { return reference(this.segment(), index); }
        /// Sets `reference` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer referenceAt(long index, int value) { reference(this.segment(), index, value); return this; }

    }
}
