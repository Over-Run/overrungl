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
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBufferCollectionPropertiesFUCHSIA {
///     VkStructureType sType;
///     void* pNext;
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
/// };
/// ```
public sealed class VkBufferCollectionPropertiesFUCHSIA extends GroupType {
    /// The struct layout of `VkBufferCollectionPropertiesFUCHSIA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `memoryTypeBits`.
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    /// The memory layout of `memoryTypeBits`.
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));
    /// The byte offset of `bufferCount`.
    public static final long OFFSET_bufferCount = LAYOUT.byteOffset(PathElement.groupElement("bufferCount"));
    /// The memory layout of `bufferCount`.
    public static final MemoryLayout LAYOUT_bufferCount = LAYOUT.select(PathElement.groupElement("bufferCount"));
    /// The [VarHandle] of `bufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    /// The byte offset of `createInfoIndex`.
    public static final long OFFSET_createInfoIndex = LAYOUT.byteOffset(PathElement.groupElement("createInfoIndex"));
    /// The memory layout of `createInfoIndex`.
    public static final MemoryLayout LAYOUT_createInfoIndex = LAYOUT.select(PathElement.groupElement("createInfoIndex"));
    /// The [VarHandle] of `createInfoIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_createInfoIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createInfoIndex"));
    /// The byte offset of `sysmemPixelFormat`.
    public static final long OFFSET_sysmemPixelFormat = LAYOUT.byteOffset(PathElement.groupElement("sysmemPixelFormat"));
    /// The memory layout of `sysmemPixelFormat`.
    public static final MemoryLayout LAYOUT_sysmemPixelFormat = LAYOUT.select(PathElement.groupElement("sysmemPixelFormat"));
    /// The [VarHandle] of `sysmemPixelFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sysmemPixelFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sysmemPixelFormat"));
    /// The byte offset of `formatFeatures`.
    public static final long OFFSET_formatFeatures = LAYOUT.byteOffset(PathElement.groupElement("formatFeatures"));
    /// The memory layout of `formatFeatures`.
    public static final MemoryLayout LAYOUT_formatFeatures = LAYOUT.select(PathElement.groupElement("formatFeatures"));
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_formatFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures"));
    /// The byte offset of `sysmemColorSpaceIndex`.
    public static final long OFFSET_sysmemColorSpaceIndex = LAYOUT.byteOffset(PathElement.groupElement("sysmemColorSpaceIndex"));
    /// The memory layout of `sysmemColorSpaceIndex`.
    public static final MemoryLayout LAYOUT_sysmemColorSpaceIndex = LAYOUT.select(PathElement.groupElement("sysmemColorSpaceIndex"));
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

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkBufferCollectionPropertiesFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferCollectionPropertiesFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCollectionPropertiesFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBufferCollectionPropertiesFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBufferCollectionPropertiesFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferCollectionPropertiesFUCHSIA`
    public static VkBufferCollectionPropertiesFUCHSIA alloc(SegmentAllocator allocator) { return new VkBufferCollectionPropertiesFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBufferCollectionPropertiesFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferCollectionPropertiesFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA copyFrom(VkBufferCollectionPropertiesFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkBufferCollectionPropertiesFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    public int memoryTypeBits() { return memoryTypeBits(this.segment(), 0L); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeBits(MemorySegment segment, long index, int value) { VH_memoryTypeBits.set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA memoryTypeBits(int value) { memoryTypeBits(this.segment(), 0L, value); return this; }

    /// {@return `bufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferCount(MemorySegment segment, long index) { return (int) VH_bufferCount.get(segment, 0L, index); }
    /// {@return `bufferCount`}
    public int bufferCount() { return bufferCount(this.segment(), 0L); }
    /// Sets `bufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferCount(MemorySegment segment, long index, int value) { VH_bufferCount.set(segment, 0L, index, value); }
    /// Sets `bufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA bufferCount(int value) { bufferCount(this.segment(), 0L, value); return this; }

    /// {@return `createInfoIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int createInfoIndex(MemorySegment segment, long index) { return (int) VH_createInfoIndex.get(segment, 0L, index); }
    /// {@return `createInfoIndex`}
    public int createInfoIndex() { return createInfoIndex(this.segment(), 0L); }
    /// Sets `createInfoIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void createInfoIndex(MemorySegment segment, long index, int value) { VH_createInfoIndex.set(segment, 0L, index, value); }
    /// Sets `createInfoIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA createInfoIndex(int value) { createInfoIndex(this.segment(), 0L, value); return this; }

    /// {@return `sysmemPixelFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sysmemPixelFormat(MemorySegment segment, long index) { return (long) VH_sysmemPixelFormat.get(segment, 0L, index); }
    /// {@return `sysmemPixelFormat`}
    public long sysmemPixelFormat() { return sysmemPixelFormat(this.segment(), 0L); }
    /// Sets `sysmemPixelFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sysmemPixelFormat(MemorySegment segment, long index, long value) { VH_sysmemPixelFormat.set(segment, 0L, index, value); }
    /// Sets `sysmemPixelFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemPixelFormat(long value) { sysmemPixelFormat(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA formatFeatures(int value) { formatFeatures(this.segment(), 0L, value); return this; }

    /// {@return `sysmemColorSpaceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment sysmemColorSpaceIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sysmemColorSpaceIndex, index), LAYOUT_sysmemColorSpaceIndex); }
    /// {@return `sysmemColorSpaceIndex`}
    public MemorySegment sysmemColorSpaceIndex() { return sysmemColorSpaceIndex(this.segment(), 0L); }
    /// Sets `sysmemColorSpaceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sysmemColorSpaceIndex(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sysmemColorSpaceIndex, index), LAYOUT_sysmemColorSpaceIndex.byteSize()); }
    /// Sets `sysmemColorSpaceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferCollectionPropertiesFUCHSIA sysmemColorSpaceIndex(MemorySegment value) { sysmemColorSpaceIndex(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA samplerYcbcrConversionComponents(MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrModel(int value) { suggestedYcbcrModel(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA suggestedYcbcrRange(int value) { suggestedYcbcrRange(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA suggestedXChromaOffset(int value) { suggestedXChromaOffset(this.segment(), 0L, value); return this; }

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
    public VkBufferCollectionPropertiesFUCHSIA suggestedYChromaOffset(int value) { suggestedYChromaOffset(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBufferCollectionPropertiesFUCHSIA].
    public static final class Buffer extends VkBufferCollectionPropertiesFUCHSIA {
        private final long elementCount;

        /// Creates `VkBufferCollectionPropertiesFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBufferCollectionPropertiesFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBufferCollectionPropertiesFUCHSIA`
        public VkBufferCollectionPropertiesFUCHSIA asSlice(long index) { return new VkBufferCollectionPropertiesFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBufferCollectionPropertiesFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBufferCollectionPropertiesFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `memoryTypeBits` at the given index}
        /// @param index the index of the struct buffer
        public int memoryTypeBitsAt(long index) { return memoryTypeBits(this.segment(), index); }
        /// Sets `memoryTypeBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer memoryTypeBitsAt(long index, int value) { memoryTypeBits(this.segment(), index, value); return this; }

        /// {@return `bufferCount` at the given index}
        /// @param index the index of the struct buffer
        public int bufferCountAt(long index) { return bufferCount(this.segment(), index); }
        /// Sets `bufferCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferCountAt(long index, int value) { bufferCount(this.segment(), index, value); return this; }

        /// {@return `createInfoIndex` at the given index}
        /// @param index the index of the struct buffer
        public int createInfoIndexAt(long index) { return createInfoIndex(this.segment(), index); }
        /// Sets `createInfoIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer createInfoIndexAt(long index, int value) { createInfoIndex(this.segment(), index, value); return this; }

        /// {@return `sysmemPixelFormat` at the given index}
        /// @param index the index of the struct buffer
        public long sysmemPixelFormatAt(long index) { return sysmemPixelFormat(this.segment(), index); }
        /// Sets `sysmemPixelFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sysmemPixelFormatAt(long index, long value) { sysmemPixelFormat(this.segment(), index, value); return this; }

        /// {@return `formatFeatures` at the given index}
        /// @param index the index of the struct buffer
        public int formatFeaturesAt(long index) { return formatFeatures(this.segment(), index); }
        /// Sets `formatFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatFeaturesAt(long index, int value) { formatFeatures(this.segment(), index, value); return this; }

        /// {@return `sysmemColorSpaceIndex` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment sysmemColorSpaceIndexAt(long index) { return sysmemColorSpaceIndex(this.segment(), index); }
        /// Sets `sysmemColorSpaceIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sysmemColorSpaceIndexAt(long index, MemorySegment value) { sysmemColorSpaceIndex(this.segment(), index, value); return this; }

        /// {@return `samplerYcbcrConversionComponents` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment samplerYcbcrConversionComponentsAt(long index) { return samplerYcbcrConversionComponents(this.segment(), index); }
        /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer samplerYcbcrConversionComponentsAt(long index, MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrModel` at the given index}
        /// @param index the index of the struct buffer
        public int suggestedYcbcrModelAt(long index) { return suggestedYcbcrModel(this.segment(), index); }
        /// Sets `suggestedYcbcrModel` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrModelAt(long index, int value) { suggestedYcbcrModel(this.segment(), index, value); return this; }

        /// {@return `suggestedYcbcrRange` at the given index}
        /// @param index the index of the struct buffer
        public int suggestedYcbcrRangeAt(long index) { return suggestedYcbcrRange(this.segment(), index); }
        /// Sets `suggestedYcbcrRange` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYcbcrRangeAt(long index, int value) { suggestedYcbcrRange(this.segment(), index, value); return this; }

        /// {@return `suggestedXChromaOffset` at the given index}
        /// @param index the index of the struct buffer
        public int suggestedXChromaOffsetAt(long index) { return suggestedXChromaOffset(this.segment(), index); }
        /// Sets `suggestedXChromaOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer suggestedXChromaOffsetAt(long index, int value) { suggestedXChromaOffset(this.segment(), index, value); return this; }

        /// {@return `suggestedYChromaOffset` at the given index}
        /// @param index the index of the struct buffer
        public int suggestedYChromaOffsetAt(long index) { return suggestedYChromaOffset(this.segment(), index); }
        /// Sets `suggestedYChromaOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer suggestedYChromaOffsetAt(long index, int value) { suggestedYChromaOffset(this.segment(), index, value); return this; }

    }
}
