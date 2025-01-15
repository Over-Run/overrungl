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
package overrungl.vulkan.qnx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### externalFormat
/// [VarHandle][#VH_externalFormat] - [Getter][#externalFormat()] - [Setter][#externalFormat(long)]
/// ### screenUsage
/// [VarHandle][#VH_screenUsage] - [Getter][#screenUsage()] - [Setter][#screenUsage(long)]
/// ### formatFeatures
/// [VarHandle][#VH_formatFeatures] - [Getter][#formatFeatures()] - [Setter][#formatFeatures(int)]
/// ### samplerYcbcrConversionComponents
/// [Byte offset][#OFFSET_samplerYcbcrConversionComponents] - [Memory layout][#ML_samplerYcbcrConversionComponents] - [Getter][#samplerYcbcrConversionComponents()] - [Setter][#samplerYcbcrConversionComponents(java.lang.foreign.MemorySegment)]
/// ### suggestedYcbcrModel
/// [VarHandle][#VH_suggestedYcbcrModel] - [Getter][#suggestedYcbcrModel()] - [Setter][#suggestedYcbcrModel(int)]
/// ### suggestedYcbcrRange
/// [VarHandle][#VH_suggestedYcbcrRange] - [Getter][#suggestedYcbcrRange()] - [Setter][#suggestedYcbcrRange(int)]
/// ### suggestedXChromaOffset
/// [VarHandle][#VH_suggestedXChromaOffset] - [Getter][#suggestedXChromaOffset()] - [Setter][#suggestedXChromaOffset(int)]
/// ### suggestedYChromaOffset
/// [VarHandle][#VH_suggestedYChromaOffset] - [Getter][#suggestedYChromaOffset()] - [Setter][#suggestedYChromaOffset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkScreenBufferFormatPropertiesQNX {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat format;
///     uint64_t externalFormat;
///     uint64_t screenUsage;
///     VkFormatFeatureFlags formatFeatures;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// } VkScreenBufferFormatPropertiesQNX;
/// ```
public sealed class VkScreenBufferFormatPropertiesQNX extends Struct {
    /// The struct layout of `VkScreenBufferFormatPropertiesQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_LONG.withName("screenUsage"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));
    /// The [VarHandle] of `screenUsage` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_screenUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("screenUsage"));
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    /// The byte offset of `samplerYcbcrConversionComponents`.
    public static final long OFFSET_samplerYcbcrConversionComponents = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The memory layout of `samplerYcbcrConversionComponents`.
    public static final MemoryLayout ML_samplerYcbcrConversionComponents = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The [VarHandle] of `suggestedYcbcrModel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_suggestedYcbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel"));
    /// The [VarHandle] of `suggestedYcbcrRange` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_suggestedYcbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange"));
    /// The [VarHandle] of `suggestedXChromaOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_suggestedXChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset"));
    /// The [VarHandle] of `suggestedYChromaOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_suggestedYChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset"));

    /// Creates `VkScreenBufferFormatPropertiesQNX` with the given segment.
    /// @param segment the memory segment
    public VkScreenBufferFormatPropertiesQNX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkScreenBufferFormatPropertiesQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenBufferFormatPropertiesQNX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkScreenBufferFormatPropertiesQNX(segment); }

    /// Creates `VkScreenBufferFormatPropertiesQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkScreenBufferFormatPropertiesQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenBufferFormatPropertiesQNX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkScreenBufferFormatPropertiesQNX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkScreenBufferFormatPropertiesQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkScreenBufferFormatPropertiesQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkScreenBufferFormatPropertiesQNX`
    public static VkScreenBufferFormatPropertiesQNX alloc(SegmentAllocator allocator) { return new VkScreenBufferFormatPropertiesQNX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkScreenBufferFormatPropertiesQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkScreenBufferFormatPropertiesQNX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkScreenBufferFormatPropertiesQNX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkScreenBufferFormatPropertiesQNX`
    public static VkScreenBufferFormatPropertiesQNX allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkFormat") int format, @CType("uint64_t") long externalFormat, @CType("uint64_t") long screenUsage, @CType("VkFormatFeatureFlags") int formatFeatures, @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponents, @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel, @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange, @CType("VkChromaLocation") int suggestedXChromaOffset, @CType("VkChromaLocation") int suggestedYChromaOffset) { return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).screenUsage(screenUsage).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel).suggestedYcbcrRange(suggestedYcbcrRange).suggestedXChromaOffset(suggestedXChromaOffset).suggestedYChromaOffset(suggestedYChromaOffset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX copyFrom(VkScreenBufferFormatPropertiesQNX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkScreenBufferFormatPropertiesQNX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkScreenBufferFormatPropertiesQNX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX sType(@CType("VkStructureType") int value) { VkScreenBufferFormatPropertiesQNX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkScreenBufferFormatPropertiesQNX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkScreenBufferFormatPropertiesQNX.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkScreenBufferFormatPropertiesQNX.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX format(@CType("VkFormat") int value) { VkScreenBufferFormatPropertiesQNX.set_format(this.segment(), value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_externalFormat(segment, 0L); }
    /// {@return `externalFormat`}
    public @CType("uint64_t") long externalFormat() { return VkScreenBufferFormatPropertiesQNX.get_externalFormat(this.segment()); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, @CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_externalFormat(segment, 0L, value); }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX externalFormat(@CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_externalFormat(this.segment(), value); return this; }

    /// {@return `screenUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_screenUsage(MemorySegment segment, long index) { return (long) VH_screenUsage.get(segment, 0L, index); }
    /// {@return `screenUsage`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_screenUsage(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_screenUsage(segment, 0L); }
    /// {@return `screenUsage`}
    public @CType("uint64_t") long screenUsage() { return VkScreenBufferFormatPropertiesQNX.get_screenUsage(this.segment()); }
    /// Sets `screenUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_screenUsage(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_screenUsage.set(segment, 0L, index, value); }
    /// Sets `screenUsage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_screenUsage(MemorySegment segment, @CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_screenUsage(segment, 0L, value); }
    /// Sets `screenUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX screenUsage(@CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_screenUsage(this.segment(), value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment, long index) { return (int) VH_formatFeatures.get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_formatFeatures(segment, 0L); }
    /// {@return `formatFeatures`}
    public @CType("VkFormatFeatureFlags") int formatFeatures() { return VkScreenBufferFormatPropertiesQNX.get_formatFeatures(this.segment()); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_formatFeatures.set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkScreenBufferFormatPropertiesQNX.set_formatFeatures(segment, 0L, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX formatFeatures(@CType("VkFormatFeatureFlags") int value) { VkScreenBufferFormatPropertiesQNX.set_formatFeatures(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_samplerYcbcrConversionComponents(segment, 0L); }
    /// {@return `samplerYcbcrConversionComponents`}
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponents() { return VkScreenBufferFormatPropertiesQNX.get_samplerYcbcrConversionComponents(this.segment()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_samplerYcbcrConversionComponents(segment, 0L, value); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX samplerYcbcrConversionComponents(@CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_samplerYcbcrConversionComponents(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrModel(segment, 0L); }
    /// {@return `suggestedYcbcrModel`}
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel() { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrModel(this.segment()); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, long index, @CType("VkSamplerYcbcrModelConversion") int value) { VH_suggestedYcbcrModel.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, @CType("VkSamplerYcbcrModelConversion") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrModel(segment, 0L, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrModel(@CType("VkSamplerYcbcrModelConversion") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrModel(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrRange(segment, 0L); }
    /// {@return `suggestedYcbcrRange`}
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange() { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrRange(this.segment()); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, long index, @CType("VkSamplerYcbcrRange") int value) { VH_suggestedYcbcrRange.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, @CType("VkSamplerYcbcrRange") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrRange(segment, 0L, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX suggestedYcbcrRange(@CType("VkSamplerYcbcrRange") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrRange(this.segment(), value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_suggestedXChromaOffset(segment, 0L); }
    /// {@return `suggestedXChromaOffset`}
    public @CType("VkChromaLocation") int suggestedXChromaOffset() { return VkScreenBufferFormatPropertiesQNX.get_suggestedXChromaOffset(this.segment()); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedXChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedXChromaOffset(segment, 0L, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX suggestedXChromaOffset(@CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedXChromaOffset(this.segment(), value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYChromaOffset(segment, 0L); }
    /// {@return `suggestedYChromaOffset`}
    public @CType("VkChromaLocation") int suggestedYChromaOffset() { return VkScreenBufferFormatPropertiesQNX.get_suggestedYChromaOffset(this.segment()); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedYChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYChromaOffset(segment, 0L, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenBufferFormatPropertiesQNX suggestedYChromaOffset(@CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYChromaOffset(this.segment(), value); return this; }

    /// A buffer of [VkScreenBufferFormatPropertiesQNX].
    public static final class Buffer extends VkScreenBufferFormatPropertiesQNX {
        private final long elementCount;

        /// Creates `VkScreenBufferFormatPropertiesQNX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkScreenBufferFormatPropertiesQNX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkScreenBufferFormatPropertiesQNX`
        public VkScreenBufferFormatPropertiesQNX asSlice(long index) { return new VkScreenBufferFormatPropertiesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkScreenBufferFormatPropertiesQNX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkScreenBufferFormatPropertiesQNX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkScreenBufferFormatPropertiesQNX.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_pNext(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkScreenBufferFormatPropertiesQNX.set_format(this.segment(), index, value); return this; }

        /// {@return `externalFormat` at the given index}
        /// @param index the index
        public @CType("uint64_t") long externalFormatAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_externalFormat(this.segment(), index); }
        /// Sets `externalFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalFormatAt(long index, @CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_externalFormat(this.segment(), index, value); return this; }

        /// {@return `screenUsage` at the given index}
        /// @param index the index
        public @CType("uint64_t") long screenUsageAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_screenUsage(this.segment(), index); }
        /// Sets `screenUsage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer screenUsageAt(long index, @CType("uint64_t") long value) { VkScreenBufferFormatPropertiesQNX.set_screenUsage(this.segment(), index, value); return this; }

        /// {@return `formatFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int formatFeaturesAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_formatFeatures(this.segment(), index); }
        /// Sets `formatFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkScreenBufferFormatPropertiesQNX.set_formatFeatures(this.segment(), index, value); return this; }

        /// {@return `samplerYcbcrConversionComponents` at the given index}
        /// @param index the index
        public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponentsAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_samplerYcbcrConversionComponents(this.segment(), index); }
        /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer samplerYcbcrConversionComponentsAt(long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkScreenBufferFormatPropertiesQNX.set_samplerYcbcrConversionComponents(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrModel` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModelAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrModel(this.segment(), index); }
        /// Sets `suggestedYcbcrModel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrModelAt(long index, @CType("VkSamplerYcbcrModelConversion") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrModel(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrRange` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRangeAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYcbcrRange(this.segment(), index); }
        /// Sets `suggestedYcbcrRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrRangeAt(long index, @CType("VkSamplerYcbcrRange") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYcbcrRange(this.segment(), index, value); return this; }

        /// {@return `suggestedXChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int suggestedXChromaOffsetAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_suggestedXChromaOffset(this.segment(), index); }
        /// Sets `suggestedXChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedXChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedXChromaOffset(this.segment(), index, value); return this; }

        /// {@return `suggestedYChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int suggestedYChromaOffsetAt(long index) { return VkScreenBufferFormatPropertiesQNX.get_suggestedYChromaOffset(this.segment(), index); }
        /// Sets `suggestedYChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkScreenBufferFormatPropertiesQNX.set_suggestedYChromaOffset(this.segment(), index, value); return this; }

    }
}
