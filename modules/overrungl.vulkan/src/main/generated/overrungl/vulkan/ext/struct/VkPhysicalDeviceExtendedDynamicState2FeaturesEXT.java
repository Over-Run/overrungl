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
/// struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 extendedDynamicState2;
///     (uint32_t) VkBool32 extendedDynamicState2LogicOp;
///     (uint32_t) VkBool32 extendedDynamicState2PatchControlPoints;
/// };
/// ```
public final class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
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
    /// The byte offset of `extendedDynamicState2`.
    public static final long OFFSET_extendedDynamicState2 = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2"));
    /// The memory layout of `extendedDynamicState2`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2 = LAYOUT.select(PathElement.groupElement("extendedDynamicState2"));
    /// The [VarHandle] of `extendedDynamicState2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2"));
    /// The byte offset of `extendedDynamicState2LogicOp`.
    public static final long OFFSET_extendedDynamicState2LogicOp = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The memory layout of `extendedDynamicState2LogicOp`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2LogicOp = LAYOUT.select(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The [VarHandle] of `extendedDynamicState2LogicOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2LogicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The byte offset of `extendedDynamicState2PatchControlPoints`.
    public static final long OFFSET_extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    /// The memory layout of `extendedDynamicState2PatchControlPoints`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2PatchControlPoints = LAYOUT.select(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    /// The [VarHandle] of `extendedDynamicState2PatchControlPoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2PatchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param extendedDynamicState2 `extendedDynamicState2`
    /// @param extendedDynamicState2LogicOp `extendedDynamicState2LogicOp`
    /// @param extendedDynamicState2PatchControlPoints `extendedDynamicState2PatchControlPoints`
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int extendedDynamicState2, int extendedDynamicState2LogicOp, int extendedDynamicState2PatchControlPoints) {
        return alloc(allocator).sType(sType).pNext(pNext).extendedDynamicState2(extendedDynamicState2).extendedDynamicState2LogicOp(extendedDynamicState2LogicOp).extendedDynamicState2PatchControlPoints(extendedDynamicState2PatchControlPoints);
    }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param extendedDynamicState2 `extendedDynamicState2`
    /// @param extendedDynamicState2LogicOp `extendedDynamicState2LogicOp`
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int extendedDynamicState2, int extendedDynamicState2LogicOp) {
        return alloc(allocator).sType(sType).pNext(pNext).extendedDynamicState2(extendedDynamicState2).extendedDynamicState2LogicOp(extendedDynamicState2LogicOp);
    }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param extendedDynamicState2 `extendedDynamicState2`
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int extendedDynamicState2) {
        return alloc(allocator).sType(sType).pNext(pNext).extendedDynamicState2(extendedDynamicState2);
    }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2`}
    public int extendedDynamicState2() { return extendedDynamicState2(this.segment(), 0L); }
    /// Sets `extendedDynamicState2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2(MemorySegment segment, long index, int value) { VH_extendedDynamicState2.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(int value) { extendedDynamicState2(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2LogicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2LogicOp(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2LogicOp.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2LogicOp`}
    public int extendedDynamicState2LogicOp() { return extendedDynamicState2LogicOp(this.segment(), 0L); }
    /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2LogicOp(MemorySegment segment, long index, int value) { VH_extendedDynamicState2LogicOp.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2LogicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(int value) { extendedDynamicState2LogicOp(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2PatchControlPoints(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2PatchControlPoints.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2PatchControlPoints`}
    public int extendedDynamicState2PatchControlPoints() { return extendedDynamicState2PatchControlPoints(this.segment(), 0L); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2PatchControlPoints(MemorySegment segment, long index, int value) { VH_extendedDynamicState2PatchControlPoints.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(int value) { extendedDynamicState2PatchControlPoints(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState2` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState2At(long index) { return extendedDynamicState2(this.segment(), index); }
    /// Sets `extendedDynamicState2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2At(long index, int value) { extendedDynamicState2(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState2LogicOp` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState2LogicOpAt(long index) { return extendedDynamicState2LogicOp(this.segment(), index); }
    /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOpAt(long index, int value) { extendedDynamicState2LogicOp(this.segment(), index, value); return this; }

    /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
    /// @param index the index of the struct buffer
    public int extendedDynamicState2PatchControlPointsAt(long index) { return extendedDynamicState2PatchControlPoints(this.segment(), index); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPointsAt(long index, int value) { extendedDynamicState2PatchControlPoints(this.segment(), index, value); return this; }

}
