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
package overrungl.vulkan.android.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### externalFormat
/// [VarHandle][#VH_externalFormat] - [Getter][#externalFormat()] - [Setter][#externalFormat(long)]
/// ### formatFeatures
/// [VarHandle][#VH_formatFeatures] - [Getter][#formatFeatures()] - [Setter][#formatFeatures(int)]
/// ### samplerYcbcrConversionComponents
/// [Byte offset][#OFFSET_samplerYcbcrConversionComponents] - [Memory layout][#ML_samplerYcbcrConversionComponents] - [Getter][#samplerYcbcrConversionComponents()] - [Setter][#samplerYcbcrConversionComponents(MemorySegment)]
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
/// typedef struct VkAndroidHardwareBufferFormatPropertiesANDROID {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat format;
///     uint64_t externalFormat;
///     VkFormatFeatureFlags formatFeatures;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// } VkAndroidHardwareBufferFormatPropertiesANDROID;
/// ```
public sealed class VkAndroidHardwareBufferFormatPropertiesANDROID extends Struct {
    /// The struct layout of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));
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

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    public VkAndroidHardwareBufferFormatPropertiesANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(segment); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkFormat") int format, @CType("uint64_t") long externalFormat, @CType("VkFormatFeatureFlags") int formatFeatures, @CType("VkComponentMapping") MemorySegment samplerYcbcrConversionComponents, @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel, @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange, @CType("VkChromaLocation") int suggestedXChromaOffset, @CType("VkChromaLocation") int suggestedYChromaOffset) { return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel).suggestedYcbcrRange(suggestedYcbcrRange).suggestedXChromaOffset(suggestedXChromaOffset).suggestedYChromaOffset(suggestedYChromaOffset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID copyFrom(VkAndroidHardwareBufferFormatPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType(@CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID pNext(@CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID format(@CType("VkFormat") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_format(this.segment(), value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_externalFormat(segment, 0L); }
    /// {@return `externalFormat`}
    public @CType("uint64_t") long externalFormat() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_externalFormat(this.segment()); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, @CType("uint64_t") long value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_externalFormat(segment, 0L, value); }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID externalFormat(@CType("uint64_t") long value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_externalFormat(this.segment(), value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment, long index) { return (int) VH_formatFeatures.get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_formatFeatures(segment, 0L); }
    /// {@return `formatFeatures`}
    public @CType("VkFormatFeatureFlags") int formatFeatures() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_formatFeatures(this.segment()); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_formatFeatures.set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_formatFeatures(segment, 0L, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID formatFeatures(@CType("VkFormatFeatureFlags") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_formatFeatures(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_samplerYcbcrConversionComponents(segment, 0L); }
    /// {@return `samplerYcbcrConversionComponents`}
    public @CType("VkComponentMapping") MemorySegment samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_samplerYcbcrConversionComponents(this.segment()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, long index, @CType("VkComponentMapping") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, @CType("VkComponentMapping") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_samplerYcbcrConversionComponents(segment, 0L, value); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID samplerYcbcrConversionComponents(@CType("VkComponentMapping") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_samplerYcbcrConversionComponents(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrModel(segment, 0L); }
    /// {@return `suggestedYcbcrModel`}
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrModel(this.segment()); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, long index, @CType("VkSamplerYcbcrModelConversion") int value) { VH_suggestedYcbcrModel.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, @CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrModel(segment, 0L, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrModel(@CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrModel(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrRange(segment, 0L); }
    /// {@return `suggestedYcbcrRange`}
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrRange(this.segment()); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, long index, @CType("VkSamplerYcbcrRange") int value) { VH_suggestedYcbcrRange.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, @CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrRange(segment, 0L, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrRange(@CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrRange(this.segment(), value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedXChromaOffset(segment, 0L); }
    /// {@return `suggestedXChromaOffset`}
    public @CType("VkChromaLocation") int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedXChromaOffset(this.segment()); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedXChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedXChromaOffset(segment, 0L, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedXChromaOffset(@CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedXChromaOffset(this.segment(), value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYChromaOffset(segment, 0L); }
    /// {@return `suggestedYChromaOffset`}
    public @CType("VkChromaLocation") int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYChromaOffset(this.segment()); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedYChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYChromaOffset(segment, 0L, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYChromaOffset(@CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYChromaOffset(this.segment(), value); return this; }

    /// A buffer of [VkAndroidHardwareBufferFormatPropertiesANDROID].
    public static final class Buffer extends VkAndroidHardwareBufferFormatPropertiesANDROID {
        private final long elementCount;

        /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`
        public VkAndroidHardwareBufferFormatPropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_pNext(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_format(this.segment(), index, value); return this; }

        /// {@return `externalFormat` at the given index}
        /// @param index the index
        public @CType("uint64_t") long externalFormatAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_externalFormat(this.segment(), index); }
        /// Sets `externalFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer externalFormatAt(long index, @CType("uint64_t") long value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_externalFormat(this.segment(), index, value); return this; }

        /// {@return `formatFeatures` at the given index}
        /// @param index the index
        public @CType("VkFormatFeatureFlags") int formatFeaturesAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_formatFeatures(this.segment(), index); }
        /// Sets `formatFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_formatFeatures(this.segment(), index, value); return this; }

        /// {@return `samplerYcbcrConversionComponents` at the given index}
        /// @param index the index
        public @CType("VkComponentMapping") MemorySegment samplerYcbcrConversionComponentsAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_samplerYcbcrConversionComponents(this.segment(), index); }
        /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer samplerYcbcrConversionComponentsAt(long index, @CType("VkComponentMapping") MemorySegment value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_samplerYcbcrConversionComponents(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrModel` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModelAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrModel(this.segment(), index); }
        /// Sets `suggestedYcbcrModel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrModelAt(long index, @CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrModel(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrRange` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRangeAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYcbcrRange(this.segment(), index); }
        /// Sets `suggestedYcbcrRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrRangeAt(long index, @CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYcbcrRange(this.segment(), index, value); return this; }

        /// {@return `suggestedXChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int suggestedXChromaOffsetAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedXChromaOffset(this.segment(), index); }
        /// Sets `suggestedXChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedXChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedXChromaOffset(this.segment(), index, value); return this; }

        /// {@return `suggestedYChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int suggestedYChromaOffsetAt(long index) { return VkAndroidHardwareBufferFormatPropertiesANDROID.get_suggestedYChromaOffset(this.segment(), index); }
        /// Sets `suggestedYChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatPropertiesANDROID.set_suggestedYChromaOffset(this.segment(), index, value); return this; }

    }
}
