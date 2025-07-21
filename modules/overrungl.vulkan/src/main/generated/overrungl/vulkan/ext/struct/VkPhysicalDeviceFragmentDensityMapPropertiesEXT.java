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
/// struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkExtent2D) VkExtent2D minFragmentDensityTexelSize;
///     (struct VkExtent2D) VkExtent2D maxFragmentDensityTexelSize;
///     (uint32_t) VkBool32 fragmentDensityInvocations;
/// };
/// ```
public final class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
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
    /// The byte offset of `minFragmentDensityTexelSize`.
    public static final long OFFSET_minFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The memory layout of `minFragmentDensityTexelSize`.
    public static final MemoryLayout LAYOUT_minFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("minFragmentDensityTexelSize"));
    /// The byte offset of `maxFragmentDensityTexelSize`.
    public static final long OFFSET_maxFragmentDensityTexelSize = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The memory layout of `maxFragmentDensityTexelSize`.
    public static final MemoryLayout LAYOUT_maxFragmentDensityTexelSize = LAYOUT.select(PathElement.groupElement("maxFragmentDensityTexelSize"));
    /// The byte offset of `fragmentDensityInvocations`.
    public static final long OFFSET_fragmentDensityInvocations = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityInvocations"));
    /// The memory layout of `fragmentDensityInvocations`.
    public static final MemoryLayout LAYOUT_fragmentDensityInvocations = LAYOUT.select(PathElement.groupElement("fragmentDensityInvocations"));
    /// The [VarHandle] of `fragmentDensityInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityInvocations"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minFragmentDensityTexelSize `minFragmentDensityTexelSize`
    /// @param maxFragmentDensityTexelSize `maxFragmentDensityTexelSize`
    /// @param fragmentDensityInvocations `fragmentDensityInvocations`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment minFragmentDensityTexelSize, MemorySegment maxFragmentDensityTexelSize, int fragmentDensityInvocations) {
        return alloc(allocator).sType(sType).pNext(pNext).minFragmentDensityTexelSize(minFragmentDensityTexelSize).maxFragmentDensityTexelSize(maxFragmentDensityTexelSize).fragmentDensityInvocations(fragmentDensityInvocations);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minFragmentDensityTexelSize `minFragmentDensityTexelSize`
    /// @param maxFragmentDensityTexelSize `maxFragmentDensityTexelSize`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment minFragmentDensityTexelSize, MemorySegment maxFragmentDensityTexelSize) {
        return alloc(allocator).sType(sType).pNext(pNext).minFragmentDensityTexelSize(minFragmentDensityTexelSize).maxFragmentDensityTexelSize(maxFragmentDensityTexelSize);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minFragmentDensityTexelSize `minFragmentDensityTexelSize`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment minFragmentDensityTexelSize) {
        return alloc(allocator).sType(sType).pNext(pNext).minFragmentDensityTexelSize(minFragmentDensityTexelSize);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), LAYOUT_minFragmentDensityTexelSize); }
    /// {@return `minFragmentDensityTexelSize`}
    public MemorySegment minFragmentDensityTexelSize() { return minFragmentDensityTexelSize(this.segment(), 0L); }
    /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minFragmentDensityTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minFragmentDensityTexelSize, index), LAYOUT_minFragmentDensityTexelSize.byteSize()); }
    /// Sets `minFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(MemorySegment value) { minFragmentDensityTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `minFragmentDensityTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minFragmentDensityTexelSize())); return this; }

    /// {@return `maxFragmentDensityTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFragmentDensityTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), LAYOUT_maxFragmentDensityTexelSize); }
    /// {@return `maxFragmentDensityTexelSize`}
    public MemorySegment maxFragmentDensityTexelSize() { return maxFragmentDensityTexelSize(this.segment(), 0L); }
    /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentDensityTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFragmentDensityTexelSize, index), LAYOUT_maxFragmentDensityTexelSize.byteSize()); }
    /// Sets `maxFragmentDensityTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(MemorySegment value) { maxFragmentDensityTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxFragmentDensityTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentDensityTexelSize())); return this; }

    /// {@return `fragmentDensityInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityInvocations(MemorySegment segment, long index) { return (int) VH_fragmentDensityInvocations.get(segment, 0L, index); }
    /// {@return `fragmentDensityInvocations`}
    public int fragmentDensityInvocations() { return fragmentDensityInvocations(this.segment(), 0L); }
    /// Sets `fragmentDensityInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityInvocations(MemorySegment segment, long index, int value) { VH_fragmentDensityInvocations.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocations(int value) { fragmentDensityInvocations(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapPropertiesEXT`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentDensityMapPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minFragmentDensityTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minFragmentDensityTexelSizeAt(long index) { return minFragmentDensityTexelSize(this.segment(), index); }
    /// Sets `minFragmentDensityTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSizeAt(long index, MemorySegment value) { minFragmentDensityTexelSize(this.segment(), index, value); return this; }
    /// Accepts `minFragmentDensityTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT minFragmentDensityTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minFragmentDensityTexelSizeAt(index))); return this; }

    /// {@return `maxFragmentDensityTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxFragmentDensityTexelSizeAt(long index) { return maxFragmentDensityTexelSize(this.segment(), index); }
    /// Sets `maxFragmentDensityTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSizeAt(long index, MemorySegment value) { maxFragmentDensityTexelSize(this.segment(), index, value); return this; }
    /// Accepts `maxFragmentDensityTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT maxFragmentDensityTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxFragmentDensityTexelSizeAt(index))); return this; }

    /// {@return `fragmentDensityInvocations` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentDensityInvocationsAt(long index) { return fragmentDensityInvocations(this.segment(), index); }
    /// Sets `fragmentDensityInvocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT fragmentDensityInvocationsAt(long index, int value) { fragmentDensityInvocations(this.segment(), index, value); return this; }

}
