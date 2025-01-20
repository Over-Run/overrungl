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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### identifierSize
/// [VarHandle][#VH_identifierSize] - [Getter][#identifierSize()] - [Setter][#identifierSize(int)]
/// ### identifier
/// [Byte offset][#OFFSET_identifier] - [Memory layout][#ML_identifier] - [Getter][#identifier()] - [Setter][#identifier(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderModuleIdentifierEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t identifierSize;
///     uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT] identifier;
/// } VkShaderModuleIdentifierEXT;
/// ```
public sealed class VkShaderModuleIdentifierEXT extends Struct {
    /// The struct layout of `VkShaderModuleIdentifierEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("identifier")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    /// The byte offset of `identifier`.
    public static final long OFFSET_identifier = LAYOUT.byteOffset(PathElement.groupElement("identifier"));
    /// The memory layout of `identifier`.
    public static final MemoryLayout ML_identifier = LAYOUT.select(PathElement.groupElement("identifier"));

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    public VkShaderModuleIdentifierEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint32_t") int identifierSize, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment identifier) { return alloc(allocator).sType(sType).pNext(pNext).identifierSize(identifierSize).identifier(identifier); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderModuleIdentifierEXT copyFrom(VkShaderModuleIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkShaderModuleIdentifierEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT sType(@CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkShaderModuleIdentifierEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT pNext(@CType("void *") MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get(segment, 0L, index); }
    /// {@return `identifierSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_identifierSize(segment, 0L); }
    /// {@return `identifierSize`}
    public @CType("uint32_t") int identifierSize() { return VkShaderModuleIdentifierEXT.get_identifierSize(this.segment()); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_identifierSize.set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, @CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(segment, 0L, value); }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifierSize(@CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(this.segment(), value); return this; }

    /// {@return `identifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment get_identifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_identifier, index), ML_identifier); }
    /// {@return `identifier`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment get_identifier(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_identifier(segment, 0L); }
    /// {@return `identifier`}
    public @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment identifier() { return VkShaderModuleIdentifierEXT.get_identifier(this.segment()); }
    /// Sets `identifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identifier(MemorySegment segment, long index, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_identifier, index), ML_identifier.byteSize()); }
    /// Sets `identifier` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identifier(MemorySegment segment, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(segment, 0L, value); }
    /// Sets `identifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifier(@CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkShaderModuleIdentifierEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkShaderModuleIdentifierEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `identifierSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int identifierSizeAt(long index) { return VkShaderModuleIdentifierEXT.get_identifierSize(this.segment(), index); }
        /// Sets `identifierSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer identifierSizeAt(long index, @CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(this.segment(), index, value); return this; }

        /// {@return `identifier` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment identifierAt(long index) { return VkShaderModuleIdentifierEXT.get_identifier(this.segment(), index); }
        /// Sets `identifier` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer identifierAt(long index, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(this.segment(), index, value); return this; }

    }
}
