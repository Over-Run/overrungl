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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCooperativeVectorPropertiesNV`.
/// ## Layout
/// ```
/// struct VkCooperativeVectorPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkComponentTypeKHR inputType;
///     (int) VkComponentTypeKHR inputInterpretation;
///     (int) VkComponentTypeKHR matrixInterpretation;
///     (int) VkComponentTypeKHR biasInterpretation;
///     (int) VkComponentTypeKHR resultType;
///     (uint32_t) VkBool32 transpose;
/// };
/// ```
public final class VkCooperativeVectorPropertiesNV extends GroupType {
    /// The struct layout of `VkCooperativeVectorPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inputType"),
        ValueLayout.JAVA_INT.withName("inputInterpretation"),
        ValueLayout.JAVA_INT.withName("matrixInterpretation"),
        ValueLayout.JAVA_INT.withName("biasInterpretation"),
        ValueLayout.JAVA_INT.withName("resultType"),
        ValueLayout.JAVA_INT.withName("transpose")
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
    /// The byte offset of `inputType`.
    public static final long OFFSET_inputType = LAYOUT.byteOffset(PathElement.groupElement("inputType"));
    /// The memory layout of `inputType`.
    public static final MemoryLayout LAYOUT_inputType = LAYOUT.select(PathElement.groupElement("inputType"));
    /// The [VarHandle] of `inputType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputType"));
    /// The byte offset of `inputInterpretation`.
    public static final long OFFSET_inputInterpretation = LAYOUT.byteOffset(PathElement.groupElement("inputInterpretation"));
    /// The memory layout of `inputInterpretation`.
    public static final MemoryLayout LAYOUT_inputInterpretation = LAYOUT.select(PathElement.groupElement("inputInterpretation"));
    /// The [VarHandle] of `inputInterpretation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_inputInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputInterpretation"));
    /// The byte offset of `matrixInterpretation`.
    public static final long OFFSET_matrixInterpretation = LAYOUT.byteOffset(PathElement.groupElement("matrixInterpretation"));
    /// The memory layout of `matrixInterpretation`.
    public static final MemoryLayout LAYOUT_matrixInterpretation = LAYOUT.select(PathElement.groupElement("matrixInterpretation"));
    /// The [VarHandle] of `matrixInterpretation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_matrixInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matrixInterpretation"));
    /// The byte offset of `biasInterpretation`.
    public static final long OFFSET_biasInterpretation = LAYOUT.byteOffset(PathElement.groupElement("biasInterpretation"));
    /// The memory layout of `biasInterpretation`.
    public static final MemoryLayout LAYOUT_biasInterpretation = LAYOUT.select(PathElement.groupElement("biasInterpretation"));
    /// The [VarHandle] of `biasInterpretation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_biasInterpretation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("biasInterpretation"));
    /// The byte offset of `resultType`.
    public static final long OFFSET_resultType = LAYOUT.byteOffset(PathElement.groupElement("resultType"));
    /// The memory layout of `resultType`.
    public static final MemoryLayout LAYOUT_resultType = LAYOUT.select(PathElement.groupElement("resultType"));
    /// The [VarHandle] of `resultType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resultType"));
    /// The byte offset of `transpose`.
    public static final long OFFSET_transpose = LAYOUT.byteOffset(PathElement.groupElement("transpose"));
    /// The memory layout of `transpose`.
    public static final MemoryLayout LAYOUT_transpose = LAYOUT.select(PathElement.groupElement("transpose"));
    /// The [VarHandle] of `transpose` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transpose = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transpose"));

    /// Creates `VkCooperativeVectorPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCooperativeVectorPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCooperativeVectorPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeVectorPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCooperativeVectorPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeVectorPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCooperativeVectorPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCooperativeVectorPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCooperativeVectorPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCooperativeVectorPropertiesNV`
    public static VkCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator) { return new VkCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCooperativeVectorPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCooperativeVectorPropertiesNV`
    public static VkCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCooperativeVectorPropertiesNV copyFrom(VkCooperativeVectorPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCooperativeVectorPropertiesNV reinterpret(long count) { return new VkCooperativeVectorPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCooperativeVectorPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCooperativeVectorPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `inputType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputType(MemorySegment segment, long index) { return (int) VH_inputType.get(segment, 0L, index); }
    /// {@return `inputType`}
    public int inputType() { return inputType(this.segment(), 0L); }
    /// Sets `inputType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputType(MemorySegment segment, long index, int value) { VH_inputType.set(segment, 0L, index, value); }
    /// Sets `inputType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV inputType(int value) { inputType(this.segment(), 0L, value); return this; }

    /// {@return `inputInterpretation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int inputInterpretation(MemorySegment segment, long index) { return (int) VH_inputInterpretation.get(segment, 0L, index); }
    /// {@return `inputInterpretation`}
    public int inputInterpretation() { return inputInterpretation(this.segment(), 0L); }
    /// Sets `inputInterpretation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void inputInterpretation(MemorySegment segment, long index, int value) { VH_inputInterpretation.set(segment, 0L, index, value); }
    /// Sets `inputInterpretation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV inputInterpretation(int value) { inputInterpretation(this.segment(), 0L, value); return this; }

    /// {@return `matrixInterpretation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int matrixInterpretation(MemorySegment segment, long index) { return (int) VH_matrixInterpretation.get(segment, 0L, index); }
    /// {@return `matrixInterpretation`}
    public int matrixInterpretation() { return matrixInterpretation(this.segment(), 0L); }
    /// Sets `matrixInterpretation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void matrixInterpretation(MemorySegment segment, long index, int value) { VH_matrixInterpretation.set(segment, 0L, index, value); }
    /// Sets `matrixInterpretation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV matrixInterpretation(int value) { matrixInterpretation(this.segment(), 0L, value); return this; }

    /// {@return `biasInterpretation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int biasInterpretation(MemorySegment segment, long index) { return (int) VH_biasInterpretation.get(segment, 0L, index); }
    /// {@return `biasInterpretation`}
    public int biasInterpretation() { return biasInterpretation(this.segment(), 0L); }
    /// Sets `biasInterpretation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void biasInterpretation(MemorySegment segment, long index, int value) { VH_biasInterpretation.set(segment, 0L, index, value); }
    /// Sets `biasInterpretation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV biasInterpretation(int value) { biasInterpretation(this.segment(), 0L, value); return this; }

    /// {@return `resultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resultType(MemorySegment segment, long index) { return (int) VH_resultType.get(segment, 0L, index); }
    /// {@return `resultType`}
    public int resultType() { return resultType(this.segment(), 0L); }
    /// Sets `resultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resultType(MemorySegment segment, long index, int value) { VH_resultType.set(segment, 0L, index, value); }
    /// Sets `resultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV resultType(int value) { resultType(this.segment(), 0L, value); return this; }

    /// {@return `transpose` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transpose(MemorySegment segment, long index) { return (int) VH_transpose.get(segment, 0L, index); }
    /// {@return `transpose`}
    public int transpose() { return transpose(this.segment(), 0L); }
    /// Sets `transpose` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transpose(MemorySegment segment, long index, int value) { VH_transpose.set(segment, 0L, index, value); }
    /// Sets `transpose` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV transpose(int value) { transpose(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCooperativeVectorPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCooperativeVectorPropertiesNV`
    public VkCooperativeVectorPropertiesNV asSlice(long index) { return new VkCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCooperativeVectorPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCooperativeVectorPropertiesNV`
    public VkCooperativeVectorPropertiesNV asSlice(long index, long count) { return new VkCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCooperativeVectorPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCooperativeVectorPropertiesNV at(long index, Consumer<VkCooperativeVectorPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `inputType` at the given index}
    /// @param index the index of the struct buffer
    public int inputTypeAt(long index) { return inputType(this.segment(), index); }
    /// Sets `inputType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV inputTypeAt(long index, int value) { inputType(this.segment(), index, value); return this; }

    /// {@return `inputInterpretation` at the given index}
    /// @param index the index of the struct buffer
    public int inputInterpretationAt(long index) { return inputInterpretation(this.segment(), index); }
    /// Sets `inputInterpretation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV inputInterpretationAt(long index, int value) { inputInterpretation(this.segment(), index, value); return this; }

    /// {@return `matrixInterpretation` at the given index}
    /// @param index the index of the struct buffer
    public int matrixInterpretationAt(long index) { return matrixInterpretation(this.segment(), index); }
    /// Sets `matrixInterpretation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV matrixInterpretationAt(long index, int value) { matrixInterpretation(this.segment(), index, value); return this; }

    /// {@return `biasInterpretation` at the given index}
    /// @param index the index of the struct buffer
    public int biasInterpretationAt(long index) { return biasInterpretation(this.segment(), index); }
    /// Sets `biasInterpretation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV biasInterpretationAt(long index, int value) { biasInterpretation(this.segment(), index, value); return this; }

    /// {@return `resultType` at the given index}
    /// @param index the index of the struct buffer
    public int resultTypeAt(long index) { return resultType(this.segment(), index); }
    /// Sets `resultType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV resultTypeAt(long index, int value) { resultType(this.segment(), index, value); return this; }

    /// {@return `transpose` at the given index}
    /// @param index the index of the struct buffer
    public int transposeAt(long index) { return transpose(this.segment(), index); }
    /// Sets `transpose` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCooperativeVectorPropertiesNV transposeAt(long index, int value) { transpose(this.segment(), index, value); return this; }

}
