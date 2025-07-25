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
/// struct VkFragmentShadingRateAttachmentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkAttachmentReference2* pFragmentShadingRateAttachment;
///     (struct VkExtent2D) VkExtent2D shadingRateAttachmentTexelSize;
/// };
/// ```
public final class VkFragmentShadingRateAttachmentInfoKHR extends GroupType {
    /// The struct layout of `VkFragmentShadingRateAttachmentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pFragmentShadingRateAttachment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
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
    /// The byte offset of `pFragmentShadingRateAttachment`.
    public static final long OFFSET_pFragmentShadingRateAttachment = LAYOUT.byteOffset(PathElement.groupElement("pFragmentShadingRateAttachment"));
    /// The memory layout of `pFragmentShadingRateAttachment`.
    public static final MemoryLayout LAYOUT_pFragmentShadingRateAttachment = LAYOUT.select(PathElement.groupElement("pFragmentShadingRateAttachment"));
    /// The [VarHandle] of `pFragmentShadingRateAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFragmentShadingRateAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentShadingRateAttachment"));
    /// The byte offset of `shadingRateAttachmentTexelSize`.
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    /// The memory layout of `shadingRateAttachmentTexelSize`.
    public static final MemoryLayout LAYOUT_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFragmentShadingRateAttachmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pFragmentShadingRateAttachment `pFragmentShadingRateAttachment`
    /// @param shadingRateAttachmentTexelSize `shadingRateAttachmentTexelSize`
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pFragmentShadingRateAttachment, MemorySegment shadingRateAttachmentTexelSize) {
        return alloc(allocator).sType(sType).pNext(pNext).pFragmentShadingRateAttachment(pFragmentShadingRateAttachment).shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);
    }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pFragmentShadingRateAttachment `pFragmentShadingRateAttachment`
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pFragmentShadingRateAttachment) {
        return alloc(allocator).sType(sType).pNext(pNext).pFragmentShadingRateAttachment(pFragmentShadingRateAttachment);
    }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFragmentShadingRateAttachmentInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFragmentShadingRateAttachmentInfoKHR`
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR copyFrom(VkFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFragmentShadingRateAttachmentInfoKHR reinterpret(long count) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFragmentShadingRateAttachmentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pFragmentShadingRateAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFragmentShadingRateAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pFragmentShadingRateAttachment.get(segment, 0L, index); }
    /// {@return `pFragmentShadingRateAttachment`}
    public MemorySegment pFragmentShadingRateAttachment() { return pFragmentShadingRateAttachment(this.segment(), 0L); }
    /// Sets `pFragmentShadingRateAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFragmentShadingRateAttachment(MemorySegment segment, long index, MemorySegment value) { VH_pFragmentShadingRateAttachment.set(segment, 0L, index, value); }
    /// Sets `pFragmentShadingRateAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(MemorySegment value) { pFragmentShadingRateAttachment(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment shadingRateAttachmentTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize); }
    /// {@return `shadingRateAttachmentTexelSize`}
    public MemorySegment shadingRateAttachmentTexelSize() { return shadingRateAttachmentTexelSize(this.segment(), 0L); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateAttachmentTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize.byteSize()); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(MemorySegment value) { shadingRateAttachmentTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `shadingRateAttachmentTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(shadingRateAttachmentTexelSize())); return this; }

    /// Creates a slice of `VkFragmentShadingRateAttachmentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFragmentShadingRateAttachmentInfoKHR`
    public VkFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFragmentShadingRateAttachmentInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFragmentShadingRateAttachmentInfoKHR`
    public VkFragmentShadingRateAttachmentInfoKHR asSlice(long index, long count) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFragmentShadingRateAttachmentInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR at(long index, Consumer<VkFragmentShadingRateAttachmentInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pFragmentShadingRateAttachment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pFragmentShadingRateAttachmentAt(long index) { return pFragmentShadingRateAttachment(this.segment(), index); }
    /// Sets `pFragmentShadingRateAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachmentAt(long index, MemorySegment value) { pFragmentShadingRateAttachment(this.segment(), index, value); return this; }

    /// {@return `shadingRateAttachmentTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment shadingRateAttachmentTexelSizeAt(long index) { return shadingRateAttachmentTexelSize(this.segment(), index); }
    /// Sets `shadingRateAttachmentTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSizeAt(long index, MemorySegment value) { shadingRateAttachmentTexelSize(this.segment(), index, value); return this; }
    /// Accepts `shadingRateAttachmentTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(shadingRateAttachmentTexelSizeAt(index))); return this; }

}
