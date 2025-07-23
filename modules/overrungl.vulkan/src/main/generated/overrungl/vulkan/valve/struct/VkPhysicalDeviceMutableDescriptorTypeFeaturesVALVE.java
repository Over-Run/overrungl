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
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 mutableDescriptorType;
/// };
/// ```
public final class VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorType")
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
    /// The byte offset of `mutableDescriptorType`.
    public static final long OFFSET_mutableDescriptorType = LAYOUT.byteOffset(PathElement.groupElement("mutableDescriptorType"));
    /// The memory layout of `mutableDescriptorType`.
    public static final MemoryLayout LAYOUT_mutableDescriptorType = LAYOUT.select(PathElement.groupElement("mutableDescriptorType"));
    /// The [VarHandle] of `mutableDescriptorType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mutableDescriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mutableDescriptorType"));

    /// Creates `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mutableDescriptorType `mutableDescriptorType`
    /// @return the allocated `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mutableDescriptorType) {
        return alloc(allocator).sType(sType).pNext(pNext).mutableDescriptorType(mutableDescriptorType);
    }

    /// Allocates a `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE copyFrom(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mutableDescriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mutableDescriptorType(MemorySegment segment, long index) { return (int) VH_mutableDescriptorType.get(segment, 0L, index); }
    /// {@return `mutableDescriptorType`}
    public int mutableDescriptorType() { return mutableDescriptorType(this.segment(), 0L); }
    /// Sets `mutableDescriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mutableDescriptorType(MemorySegment segment, long index, int value) { VH_mutableDescriptorType.set(segment, 0L, index, value); }
    /// Sets `mutableDescriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE mutableDescriptorType(int value) { mutableDescriptorType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `mutableDescriptorType` at the given index}
    /// @param index the index of the struct buffer
    public int mutableDescriptorTypeAt(long index) { return mutableDescriptorType(this.segment(), index); }
    /// Sets `mutableDescriptorType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE mutableDescriptorTypeAt(long index, int value) { mutableDescriptorType(this.segment(), index, value); return this; }

}
