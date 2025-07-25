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
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferFormatPropertiesANDROID {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFormat format;
///     uint64_t externalFormat;
///     ((uint32_t) VkFlags) VkFormatFeatureFlags formatFeatures;
///     (struct VkComponentMapping) VkComponentMapping samplerYcbcrConversionComponents;
///     (int) VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     (int) VkSamplerYcbcrRange suggestedYcbcrRange;
///     (int) VkChromaLocation suggestedXChromaOffset;
///     (int) VkChromaLocation suggestedYChromaOffset;
/// };
/// ```
public final class VkAndroidHardwareBufferFormatPropertiesANDROID extends GroupType {
    /// The struct layout of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `externalFormat`.
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    /// The memory layout of `externalFormat`.
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));
    /// The byte offset of `formatFeatures`.
    public static final long OFFSET_formatFeatures = LAYOUT.byteOffset(PathElement.groupElement("formatFeatures"));
    /// The memory layout of `formatFeatures`.
    public static final MemoryLayout LAYOUT_formatFeatures = LAYOUT.select(PathElement.groupElement("formatFeatures"));
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    /// The byte offset of `samplerYcbcrConversionComponents`.
    public static final long OFFSET_samplerYcbcrConversionComponents = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The memory layout of `samplerYcbcrConversionComponents`.
    public static final MemoryLayout LAYOUT_samplerYcbcrConversionComponents = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The byte offset of `suggestedYcbcrModel`.
    public static final long OFFSET_suggestedYcbcrModel = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrModel"));
    /// The memory layout of `suggestedYcbcrModel`.
    public static final MemoryLayout LAYOUT_suggestedYcbcrModel = LAYOUT.select(PathElement.groupElement("suggestedYcbcrModel"));
    /// The [VarHandle] of `suggestedYcbcrModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_suggestedYcbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel"));
    /// The byte offset of `suggestedYcbcrRange`.
    public static final long OFFSET_suggestedYcbcrRange = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrRange"));
    /// The memory layout of `suggestedYcbcrRange`.
    public static final MemoryLayout LAYOUT_suggestedYcbcrRange = LAYOUT.select(PathElement.groupElement("suggestedYcbcrRange"));
    /// The [VarHandle] of `suggestedYcbcrRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_suggestedYcbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange"));
    /// The byte offset of `suggestedXChromaOffset`.
    public static final long OFFSET_suggestedXChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedXChromaOffset"));
    /// The memory layout of `suggestedXChromaOffset`.
    public static final MemoryLayout LAYOUT_suggestedXChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedXChromaOffset"));
    /// The [VarHandle] of `suggestedXChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_suggestedXChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset"));
    /// The byte offset of `suggestedYChromaOffset`.
    public static final long OFFSET_suggestedYChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedYChromaOffset"));
    /// The memory layout of `suggestedYChromaOffset`.
    public static final MemoryLayout LAYOUT_suggestedYChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedYChromaOffset"));
    /// The [VarHandle] of `suggestedYChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_suggestedYChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset"));

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAndroidHardwareBufferFormatPropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatPropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @param samplerYcbcrConversionComponents `samplerYcbcrConversionComponents`
    /// @param suggestedYcbcrModel `suggestedYcbcrModel`
    /// @param suggestedYcbcrRange `suggestedYcbcrRange`
    /// @param suggestedXChromaOffset `suggestedXChromaOffset`
    /// @param suggestedYChromaOffset `suggestedYChromaOffset`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures, MemorySegment samplerYcbcrConversionComponents, int suggestedYcbcrModel, int suggestedYcbcrRange, int suggestedXChromaOffset, int suggestedYChromaOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel).suggestedYcbcrRange(suggestedYcbcrRange).suggestedXChromaOffset(suggestedXChromaOffset).suggestedYChromaOffset(suggestedYChromaOffset);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @param samplerYcbcrConversionComponents `samplerYcbcrConversionComponents`
    /// @param suggestedYcbcrModel `suggestedYcbcrModel`
    /// @param suggestedYcbcrRange `suggestedYcbcrRange`
    /// @param suggestedXChromaOffset `suggestedXChromaOffset`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures, MemorySegment samplerYcbcrConversionComponents, int suggestedYcbcrModel, int suggestedYcbcrRange, int suggestedXChromaOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel).suggestedYcbcrRange(suggestedYcbcrRange).suggestedXChromaOffset(suggestedXChromaOffset);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @param samplerYcbcrConversionComponents `samplerYcbcrConversionComponents`
    /// @param suggestedYcbcrModel `suggestedYcbcrModel`
    /// @param suggestedYcbcrRange `suggestedYcbcrRange`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures, MemorySegment samplerYcbcrConversionComponents, int suggestedYcbcrModel, int suggestedYcbcrRange) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel).suggestedYcbcrRange(suggestedYcbcrRange);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @param samplerYcbcrConversionComponents `samplerYcbcrConversionComponents`
    /// @param suggestedYcbcrModel `suggestedYcbcrModel`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures, MemorySegment samplerYcbcrConversionComponents, int suggestedYcbcrModel) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents).suggestedYcbcrModel(suggestedYcbcrModel);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @param samplerYcbcrConversionComponents `samplerYcbcrConversionComponents`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures, MemorySegment samplerYcbcrConversionComponents) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures).samplerYcbcrConversionComponents(samplerYcbcrConversionComponents);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @param formatFeatures `formatFeatures`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat, int formatFeatures) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat).formatFeatures(formatFeatures);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @param externalFormat `externalFormat`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format, long externalFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format).externalFormat(externalFormat);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param format `format`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).format(format);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAndroidHardwareBufferFormatPropertiesANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID copyFrom(VkAndroidHardwareBufferFormatPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAndroidHardwareBufferFormatPropertiesANDROID reinterpret(long count) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAndroidHardwareBufferFormatPropertiesANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAndroidHardwareBufferFormatPropertiesANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    public long externalFormat() { return externalFormat(this.segment(), 0L); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalFormat(MemorySegment segment, long index, long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID externalFormat(long value) { externalFormat(this.segment(), 0L, value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int formatFeatures(MemorySegment segment, long index) { return (int) VH_formatFeatures.get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    public int formatFeatures() { return formatFeatures(this.segment(), 0L); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatFeatures(MemorySegment segment, long index, int value) { VH_formatFeatures.set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID formatFeatures(int value) { formatFeatures(this.segment(), 0L, value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    public MemorySegment samplerYcbcrConversionComponents() { return samplerYcbcrConversionComponents(this.segment(), 0L); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerYcbcrConversionComponents(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID samplerYcbcrConversionComponents(MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), 0L, value); return this; }
    /// Accepts `samplerYcbcrConversionComponents` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID samplerYcbcrConversionComponents(Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(samplerYcbcrConversionComponents())); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    public int suggestedYcbcrModel() { return suggestedYcbcrModel(this.segment(), 0L); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYcbcrModel(MemorySegment segment, long index, int value) { VH_suggestedYcbcrModel.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrModel(int value) { suggestedYcbcrModel(this.segment(), 0L, value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    public int suggestedYcbcrRange() { return suggestedYcbcrRange(this.segment(), 0L); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYcbcrRange(MemorySegment segment, long index, int value) { VH_suggestedYcbcrRange.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrRange(int value) { suggestedYcbcrRange(this.segment(), 0L, value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    public int suggestedXChromaOffset() { return suggestedXChromaOffset(this.segment(), 0L); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedXChromaOffset(MemorySegment segment, long index, int value) { VH_suggestedXChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedXChromaOffset(int value) { suggestedXChromaOffset(this.segment(), 0L, value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    public int suggestedYChromaOffset() { return suggestedYChromaOffset(this.segment(), 0L); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYChromaOffset(MemorySegment segment, long index, int value) { VH_suggestedYChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYChromaOffset(int value) { suggestedYChromaOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public VkAndroidHardwareBufferFormatPropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAndroidHardwareBufferFormatPropertiesANDROID`
    public VkAndroidHardwareBufferFormatPropertiesANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferFormatPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAndroidHardwareBufferFormatPropertiesANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID at(long index, Consumer<VkAndroidHardwareBufferFormatPropertiesANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param index the index of the struct buffer
    public long externalFormatAt(long index) { return externalFormat(this.segment(), index); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID externalFormatAt(long index, long value) { externalFormat(this.segment(), index, value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int formatFeaturesAt(long index) { return formatFeatures(this.segment(), index); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID formatFeaturesAt(long index, int value) { formatFeatures(this.segment(), index, value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment samplerYcbcrConversionComponentsAt(long index) { return samplerYcbcrConversionComponents(this.segment(), index); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID samplerYcbcrConversionComponentsAt(long index, MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), index, value); return this; }
    /// Accepts `samplerYcbcrConversionComponents` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID samplerYcbcrConversionComponentsAt(long index, Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(samplerYcbcrConversionComponentsAt(index))); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYcbcrModelAt(long index) { return suggestedYcbcrModel(this.segment(), index); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrModelAt(long index, int value) { suggestedYcbcrModel(this.segment(), index, value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYcbcrRangeAt(long index) { return suggestedYcbcrRange(this.segment(), index); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYcbcrRangeAt(long index, int value) { suggestedYcbcrRange(this.segment(), index, value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedXChromaOffsetAt(long index) { return suggestedXChromaOffset(this.segment(), index); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedXChromaOffsetAt(long index, int value) { suggestedXChromaOffset(this.segment(), index, value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYChromaOffsetAt(long index) { return suggestedYChromaOffset(this.segment(), index); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatPropertiesANDROID suggestedYChromaOffsetAt(long index, int value) { suggestedYChromaOffset(this.segment(), index, value); return this; }

}
