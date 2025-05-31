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
/// struct VkExtensionProperties {
///     char extensionName[256];
///     uint32_t specVersion;
/// };
/// ```
public sealed class VkExtensionProperties extends GroupType {
    /// The struct layout of `VkExtensionProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    /// The byte offset of `extensionName`.
    public static final long OFFSET_extensionName = LAYOUT.byteOffset(PathElement.groupElement("extensionName"));
    /// The memory layout of `extensionName`.
    public static final MemoryLayout LAYOUT_extensionName = LAYOUT.select(PathElement.groupElement("extensionName"));
    /// The [VarHandle] of `extensionName` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_extensionName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extensionName"), PathElement.sequenceElement());
    /// The byte offset of `specVersion`.
    public static final long OFFSET_specVersion = LAYOUT.byteOffset(PathElement.groupElement("specVersion"));
    /// The memory layout of `specVersion`.
    public static final MemoryLayout LAYOUT_specVersion = LAYOUT.select(PathElement.groupElement("specVersion"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    public VkExtensionProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExtensionProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator) { return new VkExtensionProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtensionProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExtensionProperties copyFrom(VkExtensionProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `extensionName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extensionName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extensionName, index), LAYOUT_extensionName); }
    /// {@return `extensionName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte extensionName(MemorySegment segment, long index, long index0) { return (byte) VH_extensionName.get(segment, 0L, index, index0); }
    /// {@return `extensionName`}
    public MemorySegment extensionName() { return extensionName(this.segment(), 0L); }
    /// {@return `extensionName`}
    /// @param index0 the Index 0 of the array
    public byte extensionName(long index0) { return extensionName(this.segment(), 0L, index0); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extensionName(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extensionName, index), LAYOUT_extensionName.byteSize()); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void extensionName(MemorySegment segment, long index, long index0, byte value) { VH_extensionName.set(segment, 0L, index, index0, value); }
    /// Sets `extensionName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionName(MemorySegment value) { extensionName(this.segment(), 0L, value); return this; }
    /// Sets `extensionName` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionName(long index0, byte value) { extensionName(this.segment(), 0L, index0, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    public int specVersion() { return specVersion(this.segment(), 0L); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void specVersion(MemorySegment segment, long index, int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersion(int value) { specVersion(this.segment(), 0L, value); return this; }

    /// A buffer of [VkExtensionProperties].
    public static final class Buffer extends VkExtensionProperties {
        private final long elementCount;

        /// Creates `VkExtensionProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExtensionProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExtensionProperties`
        public VkExtensionProperties asSlice(long index) { return new VkExtensionProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExtensionProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExtensionProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `extensionName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment extensionNameAt(long index) { return extensionName(this.segment(), index); }
        /// {@return `extensionName` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte extensionNameAt(long index, long index0) { return extensionName(this.segment(), index, index0); }
        /// Sets `extensionName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extensionNameAt(long index, MemorySegment value) { extensionName(this.segment(), index, value); return this; }
        /// Sets `extensionName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer extensionNameAt(long index, long index0, byte value) { extensionName(this.segment(), index, index0, value); return this; }

        /// {@return `specVersion` at the given index}
        /// @param index the index of the struct buffer
        public int specVersionAt(long index) { return specVersion(this.segment(), index); }
        /// Sets `specVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer specVersionAt(long index, int value) { specVersion(this.segment(), index, value); return this; }

    }
}
