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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 enableYDegamma;
///     (uint32_t) VkBool32 enableCbCrDegamma;
/// };
/// ```
public final class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM extends GroupType {
    /// The struct layout of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
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
    /// The byte offset of `enableYDegamma`.
    public static final long OFFSET_enableYDegamma = LAYOUT.byteOffset(PathElement.groupElement("enableYDegamma"));
    /// The memory layout of `enableYDegamma`.
    public static final MemoryLayout LAYOUT_enableYDegamma = LAYOUT.select(PathElement.groupElement("enableYDegamma"));
    /// The [VarHandle] of `enableYDegamma` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enableYDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableYDegamma"));
    /// The byte offset of `enableCbCrDegamma`.
    public static final long OFFSET_enableCbCrDegamma = LAYOUT.byteOffset(PathElement.groupElement("enableCbCrDegamma"));
    /// The memory layout of `enableCbCrDegamma`.
    public static final MemoryLayout LAYOUT_enableCbCrDegamma = LAYOUT.select(PathElement.groupElement("enableCbCrDegamma"));
    /// The [VarHandle] of `enableCbCrDegamma` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_enableCbCrDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enableCbCrDegamma"));

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param enableYDegamma `enableYDegamma`
    /// @param enableCbCrDegamma `enableCbCrDegamma`
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int enableYDegamma, int enableCbCrDegamma) {
        return alloc(allocator).sType(sType).pNext(pNext).enableYDegamma(enableYDegamma).enableCbCrDegamma(enableCbCrDegamma);
    }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param enableYDegamma `enableYDegamma`
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int enableYDegamma) {
        return alloc(allocator).sType(sType).pNext(pNext).enableYDegamma(enableYDegamma);
    }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM copyFrom(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM reinterpret(long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `enableYDegamma` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enableYDegamma(MemorySegment segment, long index) { return (int) VH_enableYDegamma.get(segment, 0L, index); }
    /// {@return `enableYDegamma`}
    public int enableYDegamma() { return enableYDegamma(this.segment(), 0L); }
    /// Sets `enableYDegamma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enableYDegamma(MemorySegment segment, long index, int value) { VH_enableYDegamma.set(segment, 0L, index, value); }
    /// Sets `enableYDegamma` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(int value) { enableYDegamma(this.segment(), 0L, value); return this; }

    /// {@return `enableCbCrDegamma` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int enableCbCrDegamma(MemorySegment segment, long index) { return (int) VH_enableCbCrDegamma.get(segment, 0L, index); }
    /// {@return `enableCbCrDegamma`}
    public int enableCbCrDegamma() { return enableCbCrDegamma(this.segment(), 0L); }
    /// Sets `enableCbCrDegamma` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void enableCbCrDegamma(MemorySegment segment, long index, int value) { VH_enableCbCrDegamma.set(segment, 0L, index, value); }
    /// Sets `enableCbCrDegamma` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(int value) { enableCbCrDegamma(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM asSlice(long index) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM asSlice(long index, long count) { return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM at(long index, Consumer<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `enableYDegamma` at the given index}
    /// @param index the index of the struct buffer
    public int enableYDegammaAt(long index) { return enableYDegamma(this.segment(), index); }
    /// Sets `enableYDegamma` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegammaAt(long index, int value) { enableYDegamma(this.segment(), index, value); return this; }

    /// {@return `enableCbCrDegamma` at the given index}
    /// @param index the index of the struct buffer
    public int enableCbCrDegammaAt(long index) { return enableCbCrDegamma(this.segment(), index); }
    /// Sets `enableCbCrDegamma` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegammaAt(long index, int value) { enableCbCrDegamma(this.segment(), index, value); return this; }

}
