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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloat16Int8FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderFloat16;
///     (uint32_t) VkBool32 shaderInt8;
/// };
/// ```
public final class VkPhysicalDeviceShaderFloat16Int8FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8")
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
    /// The byte offset of `shaderFloat16`.
    public static final long OFFSET_shaderFloat16 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
    /// The memory layout of `shaderFloat16`.
    public static final MemoryLayout LAYOUT_shaderFloat16 = LAYOUT.select(PathElement.groupElement("shaderFloat16"));
    /// The [VarHandle] of `shaderFloat16` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloat16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16"));
    /// The byte offset of `shaderInt8`.
    public static final long OFFSET_shaderInt8 = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
    /// The memory layout of `shaderInt8`.
    public static final MemoryLayout LAYOUT_shaderInt8 = LAYOUT.select(PathElement.groupElement("shaderInt8"));
    /// The [VarHandle] of `shaderInt8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderInt8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderInt8"));

    /// Creates `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param shaderFloat16 `shaderFloat16`
    /// @param shaderInt8 `shaderInt8`
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int shaderFloat16, int shaderInt8) {
        return alloc(allocator).sType(sType).pNext(pNext).shaderFloat16(shaderFloat16).shaderInt8(shaderInt8);
    }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param shaderFloat16 `shaderFloat16`
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int shaderFloat16) {
        return alloc(allocator).sType(sType).pNext(pNext).shaderFloat16(shaderFloat16);
    }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public static VkPhysicalDeviceShaderFloat16Int8FeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR copyFrom(VkPhysicalDeviceShaderFloat16Int8FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat16(MemorySegment segment, long index) { return (int) VH_shaderFloat16.get(segment, 0L, index); }
    /// {@return `shaderFloat16`}
    public int shaderFloat16() { return shaderFloat16(this.segment(), 0L); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat16(MemorySegment segment, long index, int value) { VH_shaderFloat16.set(segment, 0L, index, value); }
    /// Sets `shaderFloat16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderFloat16(int value) { shaderFloat16(this.segment(), 0L, value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderInt8(MemorySegment segment, long index) { return (int) VH_shaderInt8.get(segment, 0L, index); }
    /// {@return `shaderInt8`}
    public int shaderInt8() { return shaderInt8(this.segment(), 0L); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderInt8(MemorySegment segment, long index, int value) { VH_shaderInt8.set(segment, 0L, index, value); }
    /// Sets `shaderInt8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderInt8(int value) { shaderInt8(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloat16Int8FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderFloat16Int8FeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderFloat16Int8FeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderFloat16` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat16At(long index) { return shaderFloat16(this.segment(), index); }
    /// Sets `shaderFloat16` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderFloat16At(long index, int value) { shaderFloat16(this.segment(), index, value); return this; }

    /// {@return `shaderInt8` at the given index}
    /// @param index the index of the struct buffer
    public int shaderInt8At(long index) { return shaderInt8(this.segment(), index); }
    /// Sets `shaderInt8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat16Int8FeaturesKHR shaderInt8At(long index, int value) { shaderInt8(this.segment(), index, value); return this; }

}
