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
/// struct VkConformanceVersion {
///     uint8_t major;
///     uint8_t minor;
///     uint8_t subminor;
///     uint8_t patch;
/// };
/// ```
public sealed class VkConformanceVersion extends GroupType {
    /// The struct layout of `VkConformanceVersion`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_BYTE.withName("major"),
        ValueLayout.JAVA_BYTE.withName("minor"),
        ValueLayout.JAVA_BYTE.withName("subminor"),
        ValueLayout.JAVA_BYTE.withName("patch")
    );
    /// The byte offset of `major`.
    public static final long OFFSET_major = LAYOUT.byteOffset(PathElement.groupElement("major"));
    /// The memory layout of `major`.
    public static final MemoryLayout LAYOUT_major = LAYOUT.select(PathElement.groupElement("major"));
    /// The [VarHandle] of `major` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_major = LAYOUT.arrayElementVarHandle(PathElement.groupElement("major"));
    /// The byte offset of `minor`.
    public static final long OFFSET_minor = LAYOUT.byteOffset(PathElement.groupElement("minor"));
    /// The memory layout of `minor`.
    public static final MemoryLayout LAYOUT_minor = LAYOUT.select(PathElement.groupElement("minor"));
    /// The [VarHandle] of `minor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minor"));
    /// The byte offset of `subminor`.
    public static final long OFFSET_subminor = LAYOUT.byteOffset(PathElement.groupElement("subminor"));
    /// The memory layout of `subminor`.
    public static final MemoryLayout LAYOUT_subminor = LAYOUT.select(PathElement.groupElement("subminor"));
    /// The [VarHandle] of `subminor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subminor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subminor"));
    /// The byte offset of `patch`.
    public static final long OFFSET_patch = LAYOUT.byteOffset(PathElement.groupElement("patch"));
    /// The memory layout of `patch`.
    public static final MemoryLayout LAYOUT_patch = LAYOUT.select(PathElement.groupElement("patch"));
    /// The [VarHandle] of `patch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_patch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("patch"));

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment the memory segment
    public VkConformanceVersion(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkConformanceVersion` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkConformanceVersion ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConformanceVersion(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkConformanceVersion` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion alloc(SegmentAllocator allocator) { return new VkConformanceVersion(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkConformanceVersion`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @param subminor `subminor`
    /// @param patch `patch`
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion allocInit(SegmentAllocator allocator, byte major, byte minor, byte subminor, byte patch) {
        return alloc(allocator).major(major).minor(minor).subminor(subminor).patch(patch);
    }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @param subminor `subminor`
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion allocInit(SegmentAllocator allocator, byte major, byte minor, byte subminor) {
        return alloc(allocator).major(major).minor(minor).subminor(subminor);
    }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @param minor `minor`
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion allocInit(SegmentAllocator allocator, byte major, byte minor) {
        return alloc(allocator).major(major).minor(minor);
    }

    /// Allocates a `VkConformanceVersion` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param major `major`
    /// @return the allocated `VkConformanceVersion`
    public static VkConformanceVersion allocInit(SegmentAllocator allocator, byte major) {
        return alloc(allocator).major(major);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkConformanceVersion copyFrom(VkConformanceVersion src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `major` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte major(MemorySegment segment, long index) { return (byte) VH_major.get(segment, 0L, index); }
    /// {@return `major`}
    public byte major() { return major(this.segment(), 0L); }
    /// Sets `major` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void major(MemorySegment segment, long index, byte value) { VH_major.set(segment, 0L, index, value); }
    /// Sets `major` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion major(byte value) { major(this.segment(), 0L, value); return this; }

    /// {@return `minor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte minor(MemorySegment segment, long index) { return (byte) VH_minor.get(segment, 0L, index); }
    /// {@return `minor`}
    public byte minor() { return minor(this.segment(), 0L); }
    /// Sets `minor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minor(MemorySegment segment, long index, byte value) { VH_minor.set(segment, 0L, index, value); }
    /// Sets `minor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion minor(byte value) { minor(this.segment(), 0L, value); return this; }

    /// {@return `subminor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte subminor(MemorySegment segment, long index) { return (byte) VH_subminor.get(segment, 0L, index); }
    /// {@return `subminor`}
    public byte subminor() { return subminor(this.segment(), 0L); }
    /// Sets `subminor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subminor(MemorySegment segment, long index, byte value) { VH_subminor.set(segment, 0L, index, value); }
    /// Sets `subminor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion subminor(byte value) { subminor(this.segment(), 0L, value); return this; }

    /// {@return `patch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static byte patch(MemorySegment segment, long index) { return (byte) VH_patch.get(segment, 0L, index); }
    /// {@return `patch`}
    public byte patch() { return patch(this.segment(), 0L); }
    /// Sets `patch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void patch(MemorySegment segment, long index, byte value) { VH_patch.set(segment, 0L, index, value); }
    /// Sets `patch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkConformanceVersion patch(byte value) { patch(this.segment(), 0L, value); return this; }

    /// A buffer of [VkConformanceVersion].
    public static final class Buffer extends VkConformanceVersion {
        private final long elementCount;

        /// Creates `VkConformanceVersion.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkConformanceVersion`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkConformanceVersion`
        public VkConformanceVersion asSlice(long index) { return new VkConformanceVersion(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkConformanceVersion`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkConformanceVersion`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `major` at the given index}
        /// @param index the index of the struct buffer
        public byte majorAt(long index) { return major(this.segment(), index); }
        /// Sets `major` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer majorAt(long index, byte value) { major(this.segment(), index, value); return this; }

        /// {@return `minor` at the given index}
        /// @param index the index of the struct buffer
        public byte minorAt(long index) { return minor(this.segment(), index); }
        /// Sets `minor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minorAt(long index, byte value) { minor(this.segment(), index, value); return this; }

        /// {@return `subminor` at the given index}
        /// @param index the index of the struct buffer
        public byte subminorAt(long index) { return subminor(this.segment(), index); }
        /// Sets `subminor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer subminorAt(long index, byte value) { subminor(this.segment(), index, value); return this; }

        /// {@return `patch` at the given index}
        /// @param index the index of the struct buffer
        public byte patchAt(long index) { return patch(this.segment(), index); }
        /// Sets `patch` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer patchAt(long index, byte value) { patch(this.segment(), index, value); return this; }

    }
}
