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
package overrungl.vulkan.fuchsia.struct;

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
/// ### memoryTypeBits
/// [VarHandle][#VH_memoryTypeBits] - [Getter][#memoryTypeBits()] - [Setter][#memoryTypeBits(int)]
/// ### bufferCount
/// [VarHandle][#VH_bufferCount] - [Getter][#bufferCount()] - [Setter][#bufferCount(int)]
/// ### createInfoIndex
/// [VarHandle][#VH_createInfoIndex] - [Getter][#createInfoIndex()] - [Setter][#createInfoIndex(int)]
/// ### sysmemPixelFormat
/// [VarHandle][#VH_sysmemPixelFormat] - [Getter][#sysmemPixelFormat()] - [Setter][#sysmemPixelFormat(long)]
/// ### formatFeatures
/// [VarHandle][#VH_formatFeatures] - [Getter][#formatFeatures()] - [Setter][#formatFeatures(int)]
/// ### sysmemColorSpaceIndex
/// [Byte offset][#OFFSET_sysmemColorSpaceIndex] - [Memory layout][#ML_sysmemColorSpaceIndex] - [Getter][#sysmemColorSpaceIndex()] - [Setter][#sysmemColorSpaceIndex(java.lang.foreign.MemorySegment)]
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
/// typedef struct VkBufferCollectionPropertiesFUCHSIA {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t memoryTypeBits;
///     uint32_t bufferCount;
///     uint32_t createInfoIndex;
///     uint64_t sysmemPixelFormat;
///     VkFormatFeatureFlags formatFeatures;
///     VkSysmemColorSpaceFUCHSIA sysmemColorSpaceIndex;
///     VkComponentMapping samplerYcbcrConversionComponents;
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     VkSamplerYcbcrRange suggestedYcbcrRange;
///     VkChromaLocation suggestedXChromaOffset;
///     VkChromaLocation suggestedYChromaOffset;
/// } VkBufferCollectionPropertiesFUCHSIA;
/// ```
public final class VkBufferCollectionPropertiesFUCHSIA extends Struct {
    /// The struct layout of `VkBufferCollectionPropertiesFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.JAVA_INT.withName("createInfoIndex"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        overrungl.vulkan.fuchsia.struct.VkSysmemColorSpaceFUCHSIA.LAYOUT.withName("sysmemColorSpaceIndex"),
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
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));
    /// The [VarHandle] of `bufferCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    /// The [VarHandle] of `createInfoIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_createInfoIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfoIndex"));
    /// The [VarHandle] of `sysmemPixelFormat` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    /// The byte offset of `sysmemColorSpaceIndex`.
    public static final long OFFSET_sysmemColorSpaceIndex = LAYOUT.byteOffset(PathElement.groupElement("sysmemColorSpaceIndex"));
    /// The memory layout of `sysmemColorSpaceIndex`.
    public static final MemoryLayout ML_sysmemColorSpaceIndex = LAYOUT.select(PathElement.groupElement("sysmemColorSpaceIndex"));
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

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferCollectionPropertiesFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionPropertiesFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionPropertiesFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionPropertiesFUCHSIA ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkBufferCollectionPropertiesFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionPropertiesFUCHSIA`
    public static VkBufferCollectionPropertiesFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionPropertiesFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCollectionPropertiesFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionPropertiesFUCHSIA`
    public static VkBufferCollectionPropertiesFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkBufferCollectionPropertiesFUCHSIA(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkBufferCollectionPropertiesFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkBufferCollectionPropertiesFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sTypeAt(long index, @CType("VkStructureType") int value) { VkBufferCollectionPropertiesFUCHSIA.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sType(@CType("VkStructureType") int value) { VkBufferCollectionPropertiesFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkBufferCollectionPropertiesFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_memoryTypeBits(segment, 0L); }
    /// {@return `memoryTypeBits` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryTypeBitsAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_memoryTypeBits(this.segment(), index); }
    /// {@return `memoryTypeBits`}
    public @CType("uint32_t") int memoryTypeBits() { return VkBufferCollectionPropertiesFUCHSIA.get_memoryTypeBits(this.segment()); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeBits.set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_memoryTypeBits(segment, 0L, value); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA memoryTypeBitsAt(long index, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_memoryTypeBits(this.segment(), index, value); return this; }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA memoryTypeBits(@CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_memoryTypeBits(this.segment(), value); return this; }

    /// {@return `bufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferCount(MemorySegment segment, long index) { return (int) VH_bufferCount.get(segment, 0L, index); }
    /// {@return `bufferCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferCount(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_bufferCount(segment, 0L); }
    /// {@return `bufferCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bufferCountAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_bufferCount(this.segment(), index); }
    /// {@return `bufferCount`}
    public @CType("uint32_t") int bufferCount() { return VkBufferCollectionPropertiesFUCHSIA.get_bufferCount(this.segment()); }
    /// Sets `bufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferCount.set(segment, 0L, index, value); }
    /// Sets `bufferCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferCount(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_bufferCount(segment, 0L, value); }
    /// Sets `bufferCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA bufferCountAt(long index, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_bufferCount(this.segment(), index, value); return this; }
    /// Sets `bufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA bufferCount(@CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_bufferCount(this.segment(), value); return this; }

    /// {@return `createInfoIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_createInfoIndex(MemorySegment segment, long index) { return (int) VH_createInfoIndex.get(segment, 0L, index); }
    /// {@return `createInfoIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_createInfoIndex(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_createInfoIndex(segment, 0L); }
    /// {@return `createInfoIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int createInfoIndexAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_createInfoIndex(this.segment(), index); }
    /// {@return `createInfoIndex`}
    public @CType("uint32_t") int createInfoIndex() { return VkBufferCollectionPropertiesFUCHSIA.get_createInfoIndex(this.segment()); }
    /// Sets `createInfoIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_createInfoIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_createInfoIndex.set(segment, 0L, index, value); }
    /// Sets `createInfoIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_createInfoIndex(MemorySegment segment, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_createInfoIndex(segment, 0L, value); }
    /// Sets `createInfoIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA createInfoIndexAt(long index, @CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_createInfoIndex(this.segment(), index, value); return this; }
    /// Sets `createInfoIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA createInfoIndex(@CType("uint32_t") int value) { VkBufferCollectionPropertiesFUCHSIA.set_createInfoIndex(this.segment(), value); return this; }

    /// {@return `sysmemPixelFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_sysmemPixelFormat(MemorySegment segment, long index) { return (long) VH_sysmemPixelFormat.get(segment, 0L, index); }
    /// {@return `sysmemPixelFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_sysmemPixelFormat(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemPixelFormat(segment, 0L); }
    /// {@return `sysmemPixelFormat` at the given index}
    /// @param index the index
    public @CType("uint64_t") long sysmemPixelFormatAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemPixelFormat(this.segment(), index); }
    /// {@return `sysmemPixelFormat`}
    public @CType("uint64_t") long sysmemPixelFormat() { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemPixelFormat(this.segment()); }
    /// Sets `sysmemPixelFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sysmemPixelFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_sysmemPixelFormat.set(segment, 0L, index, value); }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sysmemPixelFormat(MemorySegment segment, @CType("uint64_t") long value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemPixelFormat(segment, 0L, value); }
    /// Sets `sysmemPixelFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemPixelFormatAt(long index, @CType("uint64_t") long value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemPixelFormat(this.segment(), index, value); return this; }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemPixelFormat(@CType("uint64_t") long value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemPixelFormat(this.segment(), value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment, long index) { return (int) VH_formatFeatures.get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    /// @param segment the segment of the struct
    public static @CType("VkFormatFeatureFlags") int get_formatFeatures(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_formatFeatures(segment, 0L); }
    /// {@return `formatFeatures` at the given index}
    /// @param index the index
    public @CType("VkFormatFeatureFlags") int formatFeaturesAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_formatFeatures(this.segment(), index); }
    /// {@return `formatFeatures`}
    public @CType("VkFormatFeatureFlags") int formatFeatures() { return VkBufferCollectionPropertiesFUCHSIA.get_formatFeatures(this.segment()); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, long index, @CType("VkFormatFeatureFlags") int value) { VH_formatFeatures.set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_formatFeatures(MemorySegment segment, @CType("VkFormatFeatureFlags") int value) { VkBufferCollectionPropertiesFUCHSIA.set_formatFeatures(segment, 0L, value); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA formatFeaturesAt(long index, @CType("VkFormatFeatureFlags") int value) { VkBufferCollectionPropertiesFUCHSIA.set_formatFeatures(this.segment(), index, value); return this; }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA formatFeatures(@CType("VkFormatFeatureFlags") int value) { VkBufferCollectionPropertiesFUCHSIA.set_formatFeatures(this.segment(), value); return this; }

    /// {@return `sysmemColorSpaceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment get_sysmemColorSpaceIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sysmemColorSpaceIndex, index), ML_sysmemColorSpaceIndex); }
    /// {@return `sysmemColorSpaceIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment get_sysmemColorSpaceIndex(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemColorSpaceIndex(segment, 0L); }
    /// {@return `sysmemColorSpaceIndex` at the given index}
    /// @param index the index
    public @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment sysmemColorSpaceIndexAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemColorSpaceIndex(this.segment(), index); }
    /// {@return `sysmemColorSpaceIndex`}
    public @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment sysmemColorSpaceIndex() { return VkBufferCollectionPropertiesFUCHSIA.get_sysmemColorSpaceIndex(this.segment()); }
    /// Sets `sysmemColorSpaceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sysmemColorSpaceIndex(MemorySegment segment, long index, @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sysmemColorSpaceIndex, index), ML_sysmemColorSpaceIndex.byteSize()); }
    /// Sets `sysmemColorSpaceIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sysmemColorSpaceIndex(MemorySegment segment, @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemColorSpaceIndex(segment, 0L, value); }
    /// Sets `sysmemColorSpaceIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndexAt(long index, @CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemColorSpaceIndex(this.segment(), index, value); return this; }
    /// Sets `sysmemColorSpaceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex(@CType("VkSysmemColorSpaceFUCHSIA") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_sysmemColorSpaceIndex(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_samplerYcbcrConversionComponents(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_samplerYcbcrConversionComponents(segment, 0L); }
    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param index the index
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponentsAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_samplerYcbcrConversionComponents(this.segment(), index); }
    /// {@return `samplerYcbcrConversionComponents`}
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment samplerYcbcrConversionComponents() { return VkBufferCollectionPropertiesFUCHSIA.get_samplerYcbcrConversionComponents(this.segment()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), ML_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversionComponents(MemorySegment segment, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_samplerYcbcrConversionComponents(segment, 0L, value); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponentsAt(long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_samplerYcbcrConversionComponents(this.segment(), index, value); return this; }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents(@CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkBufferCollectionPropertiesFUCHSIA.set_samplerYcbcrConversionComponents(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrModelConversion") int get_suggestedYcbcrModel(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrModel(segment, 0L); }
    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param index the index
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModelAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrModel(this.segment(), index); }
    /// {@return `suggestedYcbcrModel`}
    public @CType("VkSamplerYcbcrModelConversion") int suggestedYcbcrModel() { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrModel(this.segment()); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, long index, @CType("VkSamplerYcbcrModelConversion") int value) { VH_suggestedYcbcrModel.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrModel(MemorySegment segment, @CType("VkSamplerYcbcrModelConversion") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrModel(segment, 0L, value); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrModelAt(long index, @CType("VkSamplerYcbcrModelConversion") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrModel(this.segment(), index, value); return this; }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrModel(@CType("VkSamplerYcbcrModelConversion") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrModel(this.segment(), value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrRange") int get_suggestedYcbcrRange(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrRange(segment, 0L); }
    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param index the index
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRangeAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrRange(this.segment(), index); }
    /// {@return `suggestedYcbcrRange`}
    public @CType("VkSamplerYcbcrRange") int suggestedYcbcrRange() { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYcbcrRange(this.segment()); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, long index, @CType("VkSamplerYcbcrRange") int value) { VH_suggestedYcbcrRange.set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYcbcrRange(MemorySegment segment, @CType("VkSamplerYcbcrRange") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrRange(segment, 0L, value); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrRangeAt(long index, @CType("VkSamplerYcbcrRange") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrRange(this.segment(), index, value); return this; }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrRange(@CType("VkSamplerYcbcrRange") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYcbcrRange(this.segment(), value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedXChromaOffset(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedXChromaOffset(segment, 0L); }
    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param index the index
    public @CType("VkChromaLocation") int suggestedXChromaOffsetAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedXChromaOffset(this.segment(), index); }
    /// {@return `suggestedXChromaOffset`}
    public @CType("VkChromaLocation") int suggestedXChromaOffset() { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedXChromaOffset(this.segment()); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedXChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedXChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedXChromaOffset(segment, 0L, value); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedXChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedXChromaOffset(this.segment(), index, value); return this; }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedXChromaOffset(@CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedXChromaOffset(this.segment(), value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_suggestedYChromaOffset(MemorySegment segment) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYChromaOffset(segment, 0L); }
    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param index the index
    public @CType("VkChromaLocation") int suggestedYChromaOffsetAt(long index) { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYChromaOffset(this.segment(), index); }
    /// {@return `suggestedYChromaOffset`}
    public @CType("VkChromaLocation") int suggestedYChromaOffset() { return VkBufferCollectionPropertiesFUCHSIA.get_suggestedYChromaOffset(this.segment()); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_suggestedYChromaOffset.set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_suggestedYChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYChromaOffset(segment, 0L, value); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYChromaOffset(this.segment(), index, value); return this; }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA suggestedYChromaOffset(@CType("VkChromaLocation") int value) { VkBufferCollectionPropertiesFUCHSIA.set_suggestedYChromaOffset(this.segment(), value); return this; }

}
