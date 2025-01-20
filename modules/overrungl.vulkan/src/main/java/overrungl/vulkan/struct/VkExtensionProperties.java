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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### extensionName
/// [Byte offset][#OFFSET_extensionName] - [Memory layout][#ML_extensionName] - [Getter][#extensionName()] - [Setter][#extensionName(MemorySegment)]
/// ### specVersion
/// [VarHandle][#VH_specVersion] - [Getter][#specVersion()] - [Setter][#specVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExtensionProperties {
///     char[VK_MAX_EXTENSION_NAME_SIZE] extensionName;
///     uint32_t specVersion;
/// } VkExtensionProperties;
/// ```
public sealed class VkExtensionProperties extends Struct {
    /// The struct layout of `VkExtensionProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    /// The byte offset of `extensionName`.
    public static final long OFFSET_extensionName = LAYOUT.byteOffset(PathElement.groupElement("extensionName"));
    /// The memory layout of `extensionName`.
    public static final MemoryLayout ML_extensionName = LAYOUT.select(PathElement.groupElement("extensionName"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    public VkExtensionProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtensionProperties(segment); }

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtensionProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator) { return new VkExtensionProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtensionProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties allocInit(SegmentAllocator allocator, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment extensionName, @CType("uint32_t") int specVersion) { return alloc(allocator).extensionName(extensionName).specVersion(specVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExtensionProperties copyFrom(VkExtensionProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `extensionName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment get_extensionName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extensionName, index), ML_extensionName); }
    /// {@return `extensionName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment get_extensionName(MemorySegment segment) { return VkExtensionProperties.get_extensionName(segment, 0L); }
    /// {@return `extensionName`}
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment extensionName() { return VkExtensionProperties.get_extensionName(this.segment()); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extensionName(MemorySegment segment, long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extensionName, index), ML_extensionName.byteSize()); }
    /// Sets `extensionName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extensionName(MemorySegment segment, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment value) { VkExtensionProperties.set_extensionName(segment, 0L, value); }
    /// Sets `extensionName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties extensionName(@CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment value) { VkExtensionProperties.set_extensionName(this.segment(), value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment) { return VkExtensionProperties.get_specVersion(segment, 0L); }
    /// {@return `specVersion`}
    public @CType("uint32_t") int specVersion() { return VkExtensionProperties.get_specVersion(this.segment()); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, @CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(segment, 0L, value); }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersion(@CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment extensionNameAt(long index) { return VkExtensionProperties.get_extensionName(this.segment(), index); }
        /// Sets `extensionName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extensionNameAt(long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") MemorySegment value) { VkExtensionProperties.set_extensionName(this.segment(), index, value); return this; }

        /// {@return `specVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int specVersionAt(long index) { return VkExtensionProperties.get_specVersion(this.segment(), index); }
        /// Sets `specVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer specVersionAt(long index, @CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(this.segment(), index, value); return this; }

    }
}
