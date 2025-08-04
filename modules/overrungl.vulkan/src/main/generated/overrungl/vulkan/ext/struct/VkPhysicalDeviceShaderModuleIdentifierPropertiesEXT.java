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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint8_t shaderModuleIdentifierAlgorithmUUID[16];
/// };
/// ```
public final class VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("shaderModuleIdentifierAlgorithmUUID")
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
    /// The byte offset of `shaderModuleIdentifierAlgorithmUUID`.
    public static final long OFFSET_shaderModuleIdentifierAlgorithmUUID = LAYOUT.byteOffset(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"));
    /// The memory layout of `shaderModuleIdentifierAlgorithmUUID`.
    public static final MemoryLayout LAYOUT_shaderModuleIdentifierAlgorithmUUID = LAYOUT.select(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"));
    /// The [VarHandle] of `shaderModuleIdentifierAlgorithmUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_shaderModuleIdentifierAlgorithmUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"), PathElement.sequenceElement());

    /// Creates `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT copyFrom(VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderModuleIdentifierAlgorithmUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment shaderModuleIdentifierAlgorithmUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shaderModuleIdentifierAlgorithmUUID, index), LAYOUT_shaderModuleIdentifierAlgorithmUUID); }
    /// {@return `shaderModuleIdentifierAlgorithmUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte shaderModuleIdentifierAlgorithmUUID(MemorySegment segment, long index, long index0) { return (byte) VH_shaderModuleIdentifierAlgorithmUUID.get(segment, 0L, index, index0); }
    /// {@return `shaderModuleIdentifierAlgorithmUUID`}
    public MemorySegment shaderModuleIdentifierAlgorithmUUID() { return shaderModuleIdentifierAlgorithmUUID(this.segment(), 0L); }
    /// {@return `shaderModuleIdentifierAlgorithmUUID`}
    /// @param index0 the Index 0 of the array
    public byte shaderModuleIdentifierAlgorithmUUID(long index0) { return shaderModuleIdentifierAlgorithmUUID(this.segment(), 0L, index0); }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderModuleIdentifierAlgorithmUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shaderModuleIdentifierAlgorithmUUID, index), LAYOUT_shaderModuleIdentifierAlgorithmUUID.byteSize()); }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void shaderModuleIdentifierAlgorithmUUID(MemorySegment segment, long index, long index0, byte value) { VH_shaderModuleIdentifierAlgorithmUUID.set(segment, 0L, index, index0, value); }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUID(MemorySegment value) { shaderModuleIdentifierAlgorithmUUID(this.segment(), 0L, value); return this; }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUID(long index0, byte value) { shaderModuleIdentifierAlgorithmUUID(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT at(long index, Consumer<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderModuleIdentifierAlgorithmUUID` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment shaderModuleIdentifierAlgorithmUUIDAt(long index) { return shaderModuleIdentifierAlgorithmUUID(this.segment(), index); }
    /// {@return `shaderModuleIdentifierAlgorithmUUID` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte shaderModuleIdentifierAlgorithmUUIDAt(long index, long index0) { return shaderModuleIdentifierAlgorithmUUID(this.segment(), index, index0); }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUIDAt(long index, MemorySegment value) { shaderModuleIdentifierAlgorithmUUID(this.segment(), index, value); return this; }
    /// Sets `shaderModuleIdentifierAlgorithmUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUIDAt(long index, long index0, byte value) { shaderModuleIdentifierAlgorithmUUID(this.segment(), index, index0, value); return this; }

}
