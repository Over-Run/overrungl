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
/// struct VkSurfacePresentScalingCapabilitiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkPresentScalingFlagsKHR supportedPresentScaling;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR supportedPresentGravityX;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR supportedPresentGravityY;
///     (struct VkExtent2D) VkExtent2D minScaledImageExtent;
///     (struct VkExtent2D) VkExtent2D maxScaledImageExtent;
/// };
/// ```
public final class VkSurfacePresentScalingCapabilitiesEXT extends GroupType {
    /// The struct layout of `VkSurfacePresentScalingCapabilitiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedPresentScaling"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityX"),
        ValueLayout.JAVA_INT.withName("supportedPresentGravityY"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minScaledImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxScaledImageExtent")
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
    /// The byte offset of `supportedPresentScaling`.
    public static final long OFFSET_supportedPresentScaling = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentScaling"));
    /// The memory layout of `supportedPresentScaling`.
    public static final MemoryLayout LAYOUT_supportedPresentScaling = LAYOUT.select(PathElement.groupElement("supportedPresentScaling"));
    /// The [VarHandle] of `supportedPresentScaling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedPresentScaling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentScaling"));
    /// The byte offset of `supportedPresentGravityX`.
    public static final long OFFSET_supportedPresentGravityX = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityX"));
    /// The memory layout of `supportedPresentGravityX`.
    public static final MemoryLayout LAYOUT_supportedPresentGravityX = LAYOUT.select(PathElement.groupElement("supportedPresentGravityX"));
    /// The [VarHandle] of `supportedPresentGravityX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedPresentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityX"));
    /// The byte offset of `supportedPresentGravityY`.
    public static final long OFFSET_supportedPresentGravityY = LAYOUT.byteOffset(PathElement.groupElement("supportedPresentGravityY"));
    /// The memory layout of `supportedPresentGravityY`.
    public static final MemoryLayout LAYOUT_supportedPresentGravityY = LAYOUT.select(PathElement.groupElement("supportedPresentGravityY"));
    /// The [VarHandle] of `supportedPresentGravityY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedPresentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedPresentGravityY"));
    /// The byte offset of `minScaledImageExtent`.
    public static final long OFFSET_minScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minScaledImageExtent"));
    /// The memory layout of `minScaledImageExtent`.
    public static final MemoryLayout LAYOUT_minScaledImageExtent = LAYOUT.select(PathElement.groupElement("minScaledImageExtent"));
    /// The byte offset of `maxScaledImageExtent`.
    public static final long OFFSET_maxScaledImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxScaledImageExtent"));
    /// The memory layout of `maxScaledImageExtent`.
    public static final MemoryLayout LAYOUT_maxScaledImageExtent = LAYOUT.select(PathElement.groupElement("maxScaledImageExtent"));

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfacePresentScalingCapabilitiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentScalingCapabilitiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentScalingCapabilitiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfacePresentScalingCapabilitiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentScalingCapabilitiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentScalingCapabilitiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT alloc(SegmentAllocator allocator) { return new VkSurfacePresentScalingCapabilitiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentScalingCapabilitiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedPresentScaling `supportedPresentScaling`
    /// @param supportedPresentGravityX `supportedPresentGravityX`
    /// @param supportedPresentGravityY `supportedPresentGravityY`
    /// @param minScaledImageExtent `minScaledImageExtent`
    /// @param maxScaledImageExtent `maxScaledImageExtent`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedPresentScaling, int supportedPresentGravityX, int supportedPresentGravityY, MemorySegment minScaledImageExtent, MemorySegment maxScaledImageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling).supportedPresentGravityX(supportedPresentGravityX).supportedPresentGravityY(supportedPresentGravityY).minScaledImageExtent(minScaledImageExtent).maxScaledImageExtent(maxScaledImageExtent);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedPresentScaling `supportedPresentScaling`
    /// @param supportedPresentGravityX `supportedPresentGravityX`
    /// @param supportedPresentGravityY `supportedPresentGravityY`
    /// @param minScaledImageExtent `minScaledImageExtent`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedPresentScaling, int supportedPresentGravityX, int supportedPresentGravityY, MemorySegment minScaledImageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling).supportedPresentGravityX(supportedPresentGravityX).supportedPresentGravityY(supportedPresentGravityY).minScaledImageExtent(minScaledImageExtent);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedPresentScaling `supportedPresentScaling`
    /// @param supportedPresentGravityX `supportedPresentGravityX`
    /// @param supportedPresentGravityY `supportedPresentGravityY`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedPresentScaling, int supportedPresentGravityX, int supportedPresentGravityY) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling).supportedPresentGravityX(supportedPresentGravityX).supportedPresentGravityY(supportedPresentGravityY);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedPresentScaling `supportedPresentScaling`
    /// @param supportedPresentGravityX `supportedPresentGravityX`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedPresentScaling, int supportedPresentGravityX) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling).supportedPresentGravityX(supportedPresentGravityX);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedPresentScaling `supportedPresentScaling`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedPresentScaling) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedPresentScaling(supportedPresentScaling);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSurfacePresentScalingCapabilitiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSurfacePresentScalingCapabilitiesEXT`
    public static VkSurfacePresentScalingCapabilitiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT copyFrom(VkSurfacePresentScalingCapabilitiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfacePresentScalingCapabilitiesEXT reinterpret(long count) { return new VkSurfacePresentScalingCapabilitiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSurfacePresentScalingCapabilitiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfacePresentScalingCapabilitiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `supportedPresentScaling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedPresentScaling(MemorySegment segment, long index) { return (int) VH_supportedPresentScaling.get(segment, 0L, index); }
    /// {@return `supportedPresentScaling`}
    public int supportedPresentScaling() { return supportedPresentScaling(this.segment(), 0L); }
    /// Sets `supportedPresentScaling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedPresentScaling(MemorySegment segment, long index, int value) { VH_supportedPresentScaling.set(segment, 0L, index, value); }
    /// Sets `supportedPresentScaling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScaling(int value) { supportedPresentScaling(this.segment(), 0L, value); return this; }

    /// {@return `supportedPresentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedPresentGravityX(MemorySegment segment, long index) { return (int) VH_supportedPresentGravityX.get(segment, 0L, index); }
    /// {@return `supportedPresentGravityX`}
    public int supportedPresentGravityX() { return supportedPresentGravityX(this.segment(), 0L); }
    /// Sets `supportedPresentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedPresentGravityX(MemorySegment segment, long index, int value) { VH_supportedPresentGravityX.set(segment, 0L, index, value); }
    /// Sets `supportedPresentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityX(int value) { supportedPresentGravityX(this.segment(), 0L, value); return this; }

    /// {@return `supportedPresentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedPresentGravityY(MemorySegment segment, long index) { return (int) VH_supportedPresentGravityY.get(segment, 0L, index); }
    /// {@return `supportedPresentGravityY`}
    public int supportedPresentGravityY() { return supportedPresentGravityY(this.segment(), 0L); }
    /// Sets `supportedPresentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedPresentGravityY(MemorySegment segment, long index, int value) { VH_supportedPresentGravityY.set(segment, 0L, index, value); }
    /// Sets `supportedPresentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityY(int value) { supportedPresentGravityY(this.segment(), 0L, value); return this; }

    /// {@return `minScaledImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minScaledImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minScaledImageExtent, index), LAYOUT_minScaledImageExtent); }
    /// {@return `minScaledImageExtent`}
    public MemorySegment minScaledImageExtent() { return minScaledImageExtent(this.segment(), 0L); }
    /// Sets `minScaledImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minScaledImageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minScaledImageExtent, index), LAYOUT_minScaledImageExtent.byteSize()); }
    /// Sets `minScaledImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(MemorySegment value) { minScaledImageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `minScaledImageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minScaledImageExtent())); return this; }

    /// {@return `maxScaledImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxScaledImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxScaledImageExtent, index), LAYOUT_maxScaledImageExtent); }
    /// {@return `maxScaledImageExtent`}
    public MemorySegment maxScaledImageExtent() { return maxScaledImageExtent(this.segment(), 0L); }
    /// Sets `maxScaledImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxScaledImageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxScaledImageExtent, index), LAYOUT_maxScaledImageExtent.byteSize()); }
    /// Sets `maxScaledImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(MemorySegment value) { maxScaledImageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxScaledImageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxScaledImageExtent())); return this; }

    /// Creates a slice of `VkSurfacePresentScalingCapabilitiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfacePresentScalingCapabilitiesEXT`
    public VkSurfacePresentScalingCapabilitiesEXT asSlice(long index) { return new VkSurfacePresentScalingCapabilitiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfacePresentScalingCapabilitiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfacePresentScalingCapabilitiesEXT`
    public VkSurfacePresentScalingCapabilitiesEXT asSlice(long index, long count) { return new VkSurfacePresentScalingCapabilitiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfacePresentScalingCapabilitiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT at(long index, Consumer<VkSurfacePresentScalingCapabilitiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `supportedPresentScaling` at the given index}
    /// @param index the index of the struct buffer
    public int supportedPresentScalingAt(long index) { return supportedPresentScaling(this.segment(), index); }
    /// Sets `supportedPresentScaling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScalingAt(long index, int value) { supportedPresentScaling(this.segment(), index, value); return this; }

    /// {@return `supportedPresentGravityX` at the given index}
    /// @param index the index of the struct buffer
    public int supportedPresentGravityXAt(long index) { return supportedPresentGravityX(this.segment(), index); }
    /// Sets `supportedPresentGravityX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityXAt(long index, int value) { supportedPresentGravityX(this.segment(), index, value); return this; }

    /// {@return `supportedPresentGravityY` at the given index}
    /// @param index the index of the struct buffer
    public int supportedPresentGravityYAt(long index) { return supportedPresentGravityY(this.segment(), index); }
    /// Sets `supportedPresentGravityY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityYAt(long index, int value) { supportedPresentGravityY(this.segment(), index, value); return this; }

    /// {@return `minScaledImageExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minScaledImageExtentAt(long index) { return minScaledImageExtent(this.segment(), index); }
    /// Sets `minScaledImageExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtentAt(long index, MemorySegment value) { minScaledImageExtent(this.segment(), index, value); return this; }
    /// Accepts `minScaledImageExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minScaledImageExtentAt(index))); return this; }

    /// {@return `maxScaledImageExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxScaledImageExtentAt(long index) { return maxScaledImageExtent(this.segment(), index); }
    /// Sets `maxScaledImageExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtentAt(long index, MemorySegment value) { maxScaledImageExtent(this.segment(), index, value); return this; }
    /// Accepts `maxScaledImageExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxScaledImageExtentAt(index))); return this; }

}
