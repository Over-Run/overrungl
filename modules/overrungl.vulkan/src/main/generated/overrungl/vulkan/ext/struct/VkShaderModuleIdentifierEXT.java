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
/// struct VkShaderModuleIdentifierEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t identifierSize;
///     uint8_t identifier[32];
/// };
/// ```
public sealed class VkShaderModuleIdentifierEXT extends GroupType {
    /// The struct layout of `VkShaderModuleIdentifierEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("identifier")
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
    /// The byte offset of `identifierSize`.
    public static final long OFFSET_identifierSize = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
    /// The memory layout of `identifierSize`.
    public static final MemoryLayout LAYOUT_identifierSize = LAYOUT.select(PathElement.groupElement("identifierSize"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    /// The byte offset of `identifier`.
    public static final long OFFSET_identifier = LAYOUT.byteOffset(PathElement.groupElement("identifier"));
    /// The memory layout of `identifier`.
    public static final MemoryLayout LAYOUT_identifier = LAYOUT.select(PathElement.groupElement("identifier"));
    /// The [VarHandle] of `identifier` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_identifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifier"), PathElement.sequenceElement());

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    public VkShaderModuleIdentifierEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param identifierSize `identifierSize`
    /// @param identifier `identifier`
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int identifierSize, MemorySegment identifier) {
        return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize).identifier(identifier);
    }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param identifierSize `identifierSize`
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int identifierSize) {
        return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize);
    }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderModuleIdentifierEXT copyFrom(VkShaderModuleIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkShaderModuleIdentifierEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkShaderModuleIdentifierEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get(segment, 0L, index); }
    /// {@return `identifierSize`}
    public int identifierSize() { return identifierSize(this.segment(), 0L); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identifierSize(MemorySegment segment, long index, int value) { VH_identifierSize.set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifierSize(int value) { identifierSize(this.segment(), 0L, value); return this; }

    /// {@return `identifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment identifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_identifier, index), LAYOUT_identifier); }
    /// {@return `identifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte identifier(MemorySegment segment, long index, long index0) { return (byte) VH_identifier.get(segment, 0L, index, index0); }
    /// {@return `identifier`}
    public MemorySegment identifier() { return identifier(this.segment(), 0L); }
    /// {@return `identifier`}
    /// @param index0 the Index 0 of the array
    public byte identifier(long index0) { return identifier(this.segment(), 0L, index0); }
    /// Sets `identifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identifier(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_identifier, index), LAYOUT_identifier.byteSize()); }
    /// Sets `identifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void identifier(MemorySegment segment, long index, long index0, byte value) { VH_identifier.set(segment, 0L, index, index0, value); }
    /// Sets `identifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifier(MemorySegment value) { identifier(this.segment(), 0L, value); return this; }
    /// Sets `identifier` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifier(long index0, byte value) { identifier(this.segment(), 0L, index0, value); return this; }

    /// A buffer of [VkShaderModuleIdentifierEXT].
    public static final class Buffer extends VkShaderModuleIdentifierEXT {
        private final long elementCount;

        /// Creates `VkShaderModuleIdentifierEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShaderModuleIdentifierEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShaderModuleIdentifierEXT`
        public VkShaderModuleIdentifierEXT asSlice(long index) { return new VkShaderModuleIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShaderModuleIdentifierEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShaderModuleIdentifierEXT`
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

        /// {@return `identifierSize` at the given index}
        /// @param index the index of the struct buffer
        public int identifierSizeAt(long index) { return identifierSize(this.segment(), index); }
        /// Sets `identifierSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer identifierSizeAt(long index, int value) { identifierSize(this.segment(), index, value); return this; }

        /// {@return `identifier` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment identifierAt(long index) { return identifier(this.segment(), index); }
        /// {@return `identifier` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte identifierAt(long index, long index0) { return identifier(this.segment(), index, index0); }
        /// Sets `identifier` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer identifierAt(long index, MemorySegment value) { identifier(this.segment(), index, value); return this; }
        /// Sets `identifier` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer identifierAt(long index, long index0, byte value) { identifier(this.segment(), index, index0, value); return this; }

    }
}
