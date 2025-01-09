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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### externalFormat
/// [VarHandle][#VH_externalFormat] - [Getter][#externalFormat()] - [Setter][#externalFormat(long)]
/// ### formatFeatures
/// [VarHandle][#VH_formatFeatures] - [Getter][#formatFeatures()] - [Setter][#formatFeatures(long)]
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
/// typedef struct VkAndroidHardwareBufferFormatProperties2ANDROID {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat format;
///     uint64_t externalFormat;
///     VkFormatFeatureFlags2 formatFeatures;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// } VkAndroidHardwareBufferFormatProperties2ANDROID;
/// ```
public final class VkAndroidHardwareBufferFormatProperties2ANDROID extends Struct {
    /// The struct layout of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_LONG.withName("formatFeatures"),
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
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)long`.
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

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    /// @param segment the memory segment
    public VkAndroidHardwareBufferFormatProperties2ANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public VkAndroidHardwareBufferFormatProperties2ANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public VkAndroidHardwareBufferFormatProperties2ANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID sTypeAt(long index, @CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType(@CType("VkStructureType") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatAt(long index, @CType("VkFormat") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID format(@CType("VkFormat") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_format(this.segment(), value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_externalFormat(segment, 0L); }
    /// {@return `externalFormat` at the given index}
    /// @param index the index
    public @CType("uint64_t") long externalFormatAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_externalFormat(this.segment(), index); }
    /// {@return `externalFormat`}
    public @CType("uint64_t") long externalFormat() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_externalFormat(this.segment()); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, @CType("uint64_t") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_externalFormat(segment, 0L, value); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID externalFormatAt(long index, @CType("uint64_t") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_externalFormat(this.segment(), index, value); return this; }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID externalFormat(@CType("uint64_t") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_externalFormat(this.segment(), value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags2") long get_formatFeatures(MemorySegment segment, long index) { return (long) VH_formatFeatures.get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags2") long get_formatFeatures(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_formatFeatures(segment, 0L); }
    /// {@return `formatFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags2") long formatFeaturesAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_formatFeatures(this.segment(), index); }
    /// {@return `formatFeatures`}
    public @CType("VkFormatFeatureFlags2") long formatFeatures() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_formatFeatures(this.segment()); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags2") long value) { VH_formatFeatures.set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags2") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_formatFeatures(segment, 0L, value); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatFeaturesAt(long index, @CType("VkFormatFeatureFlags2") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_formatFeatures(this.segment(), index, value); return this; }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatFeatures(@CType("VkFormatFeatureFlags2") long value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_formatFeatures(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_samplerYcbcrConversionComponents(segment, 0L); }
    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param index the index
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponentsAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_samplerYcbcrConversionComponents(this.segment(), index); }
    /// {@return `samplerYcbcrConversionComponents`}
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponents() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_samplerYcbcrConversionComponents(this.segment()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_samplerYcbcrConversionComponents(segment, 0L, value); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponentsAt(long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_samplerYcbcrConversionComponents(this.segment(), index, value); return this; }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponents(@CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_samplerYcbcrConversionComponents(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrModel(segment, 0L); }
    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param index the index
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModelAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrModel(this.segment(), index); }
    /// {@return `suggestedYcbcrModel`}
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrModel(this.segment()); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, long index, @CType("VkSamplerYcbcrModelConversion") int value) { VH_suggestedYcbcrModel.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, @CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrModel(segment, 0L, value); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrModelAt(long index, @CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrModel(this.segment(), index, value); return this; }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrModel(@CType("VkSamplerYcbcrModelConversion") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrModel(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrRange(segment, 0L); }
    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param index the index
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRangeAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrRange(this.segment(), index); }
    /// {@return `suggestedYcbcrRange`}
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYcbcrRange(this.segment()); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, long index, @CType("VkSamplerYcbcrRange") int value) { VH_suggestedYcbcrRange.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, @CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrRange(segment, 0L, value); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrRangeAt(long index, @CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrRange(this.segment(), index, value); return this; }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrRange(@CType("VkSamplerYcbcrRange") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYcbcrRange(this.segment(), value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedXChromaOffset(segment, 0L); }
    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param index the index
    public @CType("VkChromaLocation") int suggestedXChromaOffsetAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedXChromaOffset(this.segment(), index); }
    /// {@return `suggestedXChromaOffset`}
    public @CType("VkChromaLocation") int suggestedXChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedXChromaOffset(this.segment()); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedXChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedXChromaOffset(segment, 0L, value); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedXChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedXChromaOffset(this.segment(), index, value); return this; }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedXChromaOffset(@CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedXChromaOffset(this.segment(), value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYChromaOffset(segment, 0L); }
    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param index the index
    public @CType("VkChromaLocation") int suggestedYChromaOffsetAt(long index) { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYChromaOffset(this.segment(), index); }
    /// {@return `suggestedYChromaOffset`}
    public @CType("VkChromaLocation") int suggestedYChromaOffset() { return VkAndroidHardwareBufferFormatProperties2ANDROID.get_suggestedYChromaOffset(this.segment()); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedYChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYChromaOffset(segment, 0L, value); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYChromaOffset(this.segment(), index, value); return this; }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYChromaOffset(@CType("VkChromaLocation") int value) { VkAndroidHardwareBufferFormatProperties2ANDROID.set_suggestedYChromaOffset(this.segment(), value); return this; }

}
