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
/// struct VkPhysicalDeviceConditionalRenderingFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 conditionalRendering;
///     (uint32_t) VkBool32 inheritedConditionalRendering;
/// };
/// ```
public final class VkPhysicalDeviceConditionalRenderingFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRendering"),
        ValueLayout.JAVA_INT.withName("inheritedConditionalRendering")
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
    /// The byte offset of `conditionalRendering`.
    public static final long OFFSET_conditionalRendering = LAYOUT.byteOffset(PathElement.groupElement("conditionalRendering"));
    /// The memory layout of `conditionalRendering`.
    public static final MemoryLayout LAYOUT_conditionalRendering = LAYOUT.select(PathElement.groupElement("conditionalRendering"));
    /// The [VarHandle] of `conditionalRendering` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_conditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("conditionalRendering"));
    /// The byte offset of `inheritedConditionalRendering`.
    public static final long OFFSET_inheritedConditionalRendering = LAYOUT.byteOffset(PathElement.groupElement("inheritedConditionalRendering"));
    /// The memory layout of `inheritedConditionalRendering`.
    public static final MemoryLayout LAYOUT_inheritedConditionalRendering = LAYOUT.select(PathElement.groupElement("inheritedConditionalRendering"));
    /// The [VarHandle] of `inheritedConditionalRendering` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inheritedConditionalRendering = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inheritedConditionalRendering"));

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param conditionalRendering `conditionalRendering`
    /// @param inheritedConditionalRendering `inheritedConditionalRendering`
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int conditionalRendering, int inheritedConditionalRendering) {
        return alloc(allocator).sType(sType).pNext(pNext).conditionalRendering(conditionalRendering).inheritedConditionalRendering(inheritedConditionalRendering);
    }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param conditionalRendering `conditionalRendering`
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int conditionalRendering) {
        return alloc(allocator).sType(sType).pNext(pNext).conditionalRendering(conditionalRendering);
    }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceConditionalRenderingFeaturesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT copyFrom(VkPhysicalDeviceConditionalRenderingFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `conditionalRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int conditionalRendering(MemorySegment segment, long index) { return (int) VH_conditionalRendering.get(segment, 0L, index); }
    /// {@return `conditionalRendering`}
    public int conditionalRendering() { return conditionalRendering(this.segment(), 0L); }
    /// Sets `conditionalRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void conditionalRendering(MemorySegment segment, long index, int value) { VH_conditionalRendering.set(segment, 0L, index, value); }
    /// Sets `conditionalRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRendering(int value) { conditionalRendering(this.segment(), 0L, value); return this; }

    /// {@return `inheritedConditionalRendering` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inheritedConditionalRendering(MemorySegment segment, long index) { return (int) VH_inheritedConditionalRendering.get(segment, 0L, index); }
    /// {@return `inheritedConditionalRendering`}
    public int inheritedConditionalRendering() { return inheritedConditionalRendering(this.segment(), 0L); }
    /// Sets `inheritedConditionalRendering` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inheritedConditionalRendering(MemorySegment segment, long index, int value) { VH_inheritedConditionalRendering.set(segment, 0L, index, value); }
    /// Sets `inheritedConditionalRendering` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRendering(int value) { inheritedConditionalRendering(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceConditionalRenderingFeaturesEXT`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceConditionalRenderingFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT at(long index, Consumer<VkPhysicalDeviceConditionalRenderingFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `conditionalRendering` at the given index}
    /// @param index the index of the struct buffer
    public int conditionalRenderingAt(long index) { return conditionalRendering(this.segment(), index); }
    /// Sets `conditionalRendering` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT conditionalRenderingAt(long index, int value) { conditionalRendering(this.segment(), index, value); return this; }

    /// {@return `inheritedConditionalRendering` at the given index}
    /// @param index the index of the struct buffer
    public int inheritedConditionalRenderingAt(long index) { return inheritedConditionalRendering(this.segment(), index); }
    /// Sets `inheritedConditionalRendering` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT inheritedConditionalRenderingAt(long index, int value) { inheritedConditionalRendering(this.segment(), index, value); return this; }

}
