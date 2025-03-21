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
/// struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint8_t shaderBinaryUUID[16];
///     uint32_t shaderBinaryVersion;
/// };
/// ```
public sealed class VkPhysicalDeviceShaderObjectPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderObjectPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16L, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
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
    /// The byte offset of `shaderBinaryUUID`.
    public static final long OFFSET_shaderBinaryUUID = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryUUID"));
    /// The memory layout of `shaderBinaryUUID`.
    public static final MemoryLayout LAYOUT_shaderBinaryUUID = LAYOUT.select(PathElement.groupElement("shaderBinaryUUID"));
    /// The [VarHandle] of `shaderBinaryUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_shaderBinaryUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryUUID"), PathElement.sequenceElement());
    /// The byte offset of `shaderBinaryVersion`.
    public static final long OFFSET_shaderBinaryVersion = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryVersion"));
    /// The memory layout of `shaderBinaryVersion`.
    public static final MemoryLayout LAYOUT_shaderBinaryVersion = LAYOUT.select(PathElement.groupElement("shaderBinaryVersion"));
    /// The [VarHandle] of `shaderBinaryVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBinaryVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryVersion"));

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT copyFrom(VkPhysicalDeviceShaderObjectPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderBinaryUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment shaderBinaryUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shaderBinaryUUID, index), LAYOUT_shaderBinaryUUID); }
    /// {@return `shaderBinaryUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte shaderBinaryUUID(MemorySegment segment, long index, long index0) { return (byte) VH_shaderBinaryUUID.get(segment, 0L, index, index0); }
    /// {@return `shaderBinaryUUID`}
    public MemorySegment shaderBinaryUUID() { return shaderBinaryUUID(this.segment(), 0L); }
    /// {@return `shaderBinaryUUID`}
    /// @param index0 the Index 0 of the array
    public byte shaderBinaryUUID(long index0) { return shaderBinaryUUID(this.segment(), 0L, index0); }
    /// Sets `shaderBinaryUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBinaryUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shaderBinaryUUID, index), LAYOUT_shaderBinaryUUID.byteSize()); }
    /// Sets `shaderBinaryUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void shaderBinaryUUID(MemorySegment segment, long index, long index0, byte value) { VH_shaderBinaryUUID.set(segment, 0L, index, index0, value); }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(MemorySegment value) { shaderBinaryUUID(this.segment(), 0L, value); return this; }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(long index0, byte value) { shaderBinaryUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `shaderBinaryVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBinaryVersion(MemorySegment segment, long index) { return (int) VH_shaderBinaryVersion.get(segment, 0L, index); }
    /// {@return `shaderBinaryVersion`}
    public int shaderBinaryVersion() { return shaderBinaryVersion(this.segment(), 0L); }
    /// Sets `shaderBinaryVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBinaryVersion(MemorySegment segment, long index, int value) { VH_shaderBinaryVersion.set(segment, 0L, index, value); }
    /// Sets `shaderBinaryVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersion(int value) { shaderBinaryVersion(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceShaderObjectPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceShaderObjectPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShaderObjectPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShaderObjectPropertiesEXT`
        public VkPhysicalDeviceShaderObjectPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShaderObjectPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShaderObjectPropertiesEXT`
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

        /// {@return `shaderBinaryUUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment shaderBinaryUUIDAt(long index) { return shaderBinaryUUID(this.segment(), index); }
        /// {@return `shaderBinaryUUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte shaderBinaryUUIDAt(long index, long index0) { return shaderBinaryUUID(this.segment(), index, index0); }
        /// Sets `shaderBinaryUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBinaryUUIDAt(long index, MemorySegment value) { shaderBinaryUUID(this.segment(), index, value); return this; }
        /// Sets `shaderBinaryUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer shaderBinaryUUIDAt(long index, long index0, byte value) { shaderBinaryUUID(this.segment(), index, index0, value); return this; }

        /// {@return `shaderBinaryVersion` at the given index}
        /// @param index the index of the struct buffer
        public int shaderBinaryVersionAt(long index) { return shaderBinaryVersion(this.segment(), index); }
        /// Sets `shaderBinaryVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer shaderBinaryVersionAt(long index, int value) { shaderBinaryVersion(this.segment(), index, value); return this; }

    }
}
