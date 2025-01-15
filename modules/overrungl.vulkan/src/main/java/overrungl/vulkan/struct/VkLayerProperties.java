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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### layerName
/// [Byte offset][#OFFSET_layerName] - [Memory layout][#ML_layerName] - [Getter][#layerName()] - [Setter][#layerName(java.lang.foreign.MemorySegment)]
/// ### specVersion
/// [VarHandle][#VH_specVersion] - [Getter][#specVersion()] - [Setter][#specVersion(int)]
/// ### implementationVersion
/// [VarHandle][#VH_implementationVersion] - [Getter][#implementationVersion()] - [Setter][#implementationVersion(int)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLayerProperties {
///     char[VK_MAX_EXTENSION_NAME_SIZE] layerName;
///     uint32_t specVersion;
///     uint32_t implementationVersion;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
/// } VkLayerProperties;
/// ```
public sealed class VkLayerProperties extends Struct {
    /// The struct layout of `VkLayerProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    /// The byte offset of `layerName`.
    public static final long OFFSET_layerName = LAYOUT.byteOffset(PathElement.groupElement("layerName"));
    /// The memory layout of `layerName`.
    public static final MemoryLayout ML_layerName = LAYOUT.select(PathElement.groupElement("layerName"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));
    /// The [VarHandle] of `implementationVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_implementationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationVersion"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    public VkLayerProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerProperties(segment); }

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLayerProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties alloc(SegmentAllocator allocator) { return new VkLayerProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLayerProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties allocInit(SegmentAllocator allocator, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerName, @CType("uint32_t") int specVersion, @CType("uint32_t") int implementationVersion, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description) { return alloc(allocator).layerName(layerName).specVersion(specVersion).implementationVersion(implementationVersion).description(description); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLayerProperties copyFrom(VkLayerProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `layerName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layerName(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_layerName, index), ML_layerName); }
    /// {@return `layerName`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layerName(MemorySegment segment) { return VkLayerProperties.get_layerName(segment, 0L); }
    /// {@return `layerName`}
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerName() { return VkLayerProperties.get_layerName(this.segment()); }
    /// Sets `layerName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerName(MemorySegment segment, long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_layerName, index), ML_layerName.byteSize()); }
    /// Sets `layerName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerName(MemorySegment segment, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(segment, 0L, value); }
    /// Sets `layerName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties layerName(@CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(this.segment(), value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment) { return VkLayerProperties.get_specVersion(segment, 0L); }
    /// {@return `specVersion`}
    public @CType("uint32_t") int specVersion() { return VkLayerProperties.get_specVersion(this.segment()); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, @CType("uint32_t") int value) { VkLayerProperties.set_specVersion(segment, 0L, value); }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties specVersion(@CType("uint32_t") int value) { VkLayerProperties.set_specVersion(this.segment(), value); return this; }

    /// {@return `implementationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_implementationVersion(MemorySegment segment, long index) { return (int) VH_implementationVersion.get(segment, 0L, index); }
    /// {@return `implementationVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_implementationVersion(MemorySegment segment) { return VkLayerProperties.get_implementationVersion(segment, 0L); }
    /// {@return `implementationVersion`}
    public @CType("uint32_t") int implementationVersion() { return VkLayerProperties.get_implementationVersion(this.segment()); }
    /// Sets `implementationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_implementationVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_implementationVersion.set(segment, 0L, index, value); }
    /// Sets `implementationVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_implementationVersion(MemorySegment segment, @CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(segment, 0L, value); }
    /// Sets `implementationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties implementationVersion(@CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment) { return VkLayerProperties.get_description(segment, 0L); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description() { return VkLayerProperties.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(segment, 0L, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(this.segment(), value); return this; }

    /// A buffer of [VkLayerProperties].
    public static final class Buffer extends VkLayerProperties {
        private final long elementCount;

        /// Creates `VkLayerProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLayerProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLayerProperties`
        public VkLayerProperties asSlice(long index) { return new VkLayerProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLayerProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLayerProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `layerName` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerNameAt(long index) { return VkLayerProperties.get_layerName(this.segment(), index); }
        /// Sets `layerName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layerNameAt(long index, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(this.segment(), index, value); return this; }

        /// {@return `specVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int specVersionAt(long index) { return VkLayerProperties.get_specVersion(this.segment(), index); }
        /// Sets `specVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer specVersionAt(long index, @CType("uint32_t") int value) { VkLayerProperties.set_specVersion(this.segment(), index, value); return this; }

        /// {@return `implementationVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int implementationVersionAt(long index) { return VkLayerProperties.get_implementationVersion(this.segment(), index); }
        /// Sets `implementationVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer implementationVersionAt(long index, @CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(this.segment(), index, value); return this; }

        /// {@return `description` at the given index}
        /// @param index the index
        public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index) { return VkLayerProperties.get_description(this.segment(), index); }
        /// Sets `description` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(this.segment(), index, value); return this; }

    }
}
