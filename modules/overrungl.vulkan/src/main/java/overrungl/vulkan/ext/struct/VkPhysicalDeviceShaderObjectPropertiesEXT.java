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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### shaderBinaryUUID
/// [Byte offset][#OFFSET_shaderBinaryUUID] - [Memory layout][#ML_shaderBinaryUUID] - [Getter][#shaderBinaryUUID()] - [Setter][#shaderBinaryUUID(MemorySegment)]
/// ### shaderBinaryVersion
/// [VarHandle][#VH_shaderBinaryVersion] - [Getter][#shaderBinaryVersion()] - [Setter][#shaderBinaryVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint8_t[VK_UUID_SIZE] shaderBinaryUUID;
///     uint32_t shaderBinaryVersion;
/// } VkPhysicalDeviceShaderObjectPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceShaderObjectPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderObjectPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `shaderBinaryUUID`.
    public static final long OFFSET_shaderBinaryUUID = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryUUID"));
    /// The memory layout of `shaderBinaryUUID`.
    public static final MemoryLayout ML_shaderBinaryUUID = LAYOUT.select(PathElement.groupElement("shaderBinaryUUID"));
    /// The [VarHandle] of `shaderBinaryVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBinaryVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryVersion"));

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment shaderBinaryUUID, @CType("uint32_t") int shaderBinaryVersion) { return alloc(allocator).sType(sType).pNext(pNext).shaderBinaryUUID(shaderBinaryUUID).shaderBinaryVersion(shaderBinaryVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT copyFrom(VkPhysicalDeviceShaderObjectPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderBinaryUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_shaderBinaryUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shaderBinaryUUID, index), ML_shaderBinaryUUID); }
    /// {@return `shaderBinaryUUID`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_shaderBinaryUUID(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(segment, 0L); }
    /// {@return `shaderBinaryUUID`}
    public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment shaderBinaryUUID() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(this.segment()); }
    /// Sets `shaderBinaryUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBinaryUUID(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shaderBinaryUUID, index), ML_shaderBinaryUUID.byteSize()); }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBinaryUUID(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(segment, 0L, value); }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(@CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(this.segment(), value); return this; }

    /// {@return `shaderBinaryVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderBinaryVersion(MemorySegment segment, long index) { return (int) VH_shaderBinaryVersion.get(segment, 0L, index); }
    /// {@return `shaderBinaryVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderBinaryVersion(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(segment, 0L); }
    /// {@return `shaderBinaryVersion`}
    public @CType("uint32_t") int shaderBinaryVersion() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(this.segment()); }
    /// Sets `shaderBinaryVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBinaryVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderBinaryVersion.set(segment, 0L, index, value); }
    /// Sets `shaderBinaryVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBinaryVersion(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(segment, 0L, value); }
    /// Sets `shaderBinaryVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersion(@CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shaderBinaryUUID` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment shaderBinaryUUIDAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(this.segment(), index); }
        /// Sets `shaderBinaryUUID` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBinaryUUIDAt(long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(this.segment(), index, value); return this; }

        /// {@return `shaderBinaryVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int shaderBinaryVersionAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(this.segment(), index); }
        /// Sets `shaderBinaryVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shaderBinaryVersionAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(this.segment(), index, value); return this; }

    }
}
