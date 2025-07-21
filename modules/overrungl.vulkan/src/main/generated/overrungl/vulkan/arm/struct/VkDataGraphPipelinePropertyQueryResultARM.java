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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDataGraphPipelinePropertyQueryResultARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDataGraphPipelinePropertyARM property;
///     (uint32_t) VkBool32 isText;
///     size_t dataSize;
///     void* pData;
/// };
/// ```
public final class VkDataGraphPipelinePropertyQueryResultARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelinePropertyQueryResultARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("property"),
        ValueLayout.JAVA_INT.withName("isText"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
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
    /// The byte offset of `property`.
    public static final long OFFSET_property = LAYOUT.byteOffset(PathElement.groupElement("property"));
    /// The memory layout of `property`.
    public static final MemoryLayout LAYOUT_property = LAYOUT.select(PathElement.groupElement("property"));
    /// The [VarHandle] of `property` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_property = LAYOUT.arrayElementVarHandle(PathElement.groupElement("property"));
    /// The byte offset of `isText`.
    public static final long OFFSET_isText = LAYOUT.byteOffset(PathElement.groupElement("isText"));
    /// The memory layout of `isText`.
    public static final MemoryLayout LAYOUT_isText = LAYOUT.select(PathElement.groupElement("isText"));
    /// The [VarHandle] of `isText` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_isText = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isText"));
    /// The byte offset of `dataSize`.
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    /// The memory layout of `dataSize`.
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkDataGraphPipelinePropertyQueryResultARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelinePropertyQueryResultARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelinePropertyQueryResultARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelinePropertyQueryResultARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelinePropertyQueryResultARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelinePropertyQueryResultARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelinePropertyQueryResultARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelinePropertyQueryResultARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelinePropertyQueryResultARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelinePropertyQueryResultARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param property `property`
    /// @param isText `isText`
    /// @param dataSize `dataSize`
    /// @param pData `pData`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int property, int isText, long dataSize, MemorySegment pData) {
        return alloc(allocator).sType(sType).pNext(pNext).property(property).isText(isText).dataSize(dataSize).pData(pData);
    }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param property `property`
    /// @param isText `isText`
    /// @param dataSize `dataSize`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int property, int isText, long dataSize) {
        return alloc(allocator).sType(sType).pNext(pNext).property(property).isText(isText).dataSize(dataSize);
    }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param property `property`
    /// @param isText `isText`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int property, int isText) {
        return alloc(allocator).sType(sType).pNext(pNext).property(property).isText(isText);
    }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param property `property`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int property) {
        return alloc(allocator).sType(sType).pNext(pNext).property(property);
    }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelinePropertyQueryResultARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelinePropertyQueryResultARM`
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM copyFrom(VkDataGraphPipelinePropertyQueryResultARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelinePropertyQueryResultARM reinterpret(long count) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelinePropertyQueryResultARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelinePropertyQueryResultARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `property` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int property(MemorySegment segment, long index) { return (int) VH_property.get(segment, 0L, index); }
    /// {@return `property`}
    public int property() { return property(this.segment(), 0L); }
    /// Sets `property` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void property(MemorySegment segment, long index, int value) { VH_property.set(segment, 0L, index, value); }
    /// Sets `property` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM property(int value) { property(this.segment(), 0L, value); return this; }

    /// {@return `isText` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int isText(MemorySegment segment, long index) { return (int) VH_isText.get(segment, 0L, index); }
    /// {@return `isText`}
    public int isText() { return isText(this.segment(), 0L); }
    /// Sets `isText` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void isText(MemorySegment segment, long index, int value) { VH_isText.set(segment, 0L, index, value); }
    /// Sets `isText` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM isText(int value) { isText(this.segment(), 0L, value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dataSize.get(segment, 0L, index)); }
    /// {@return `dataSize`}
    public long dataSize() { return dataSize(this.segment(), 0L); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataSize(MemorySegment segment, long index, long value) { VH_dataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM dataSize(long value) { dataSize(this.segment(), 0L, value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    public MemorySegment pData() { return pData(this.segment(), 0L); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pData(MemorySegment segment, long index, MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelinePropertyQueryResultARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelinePropertyQueryResultARM`
    public VkDataGraphPipelinePropertyQueryResultARM asSlice(long index) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelinePropertyQueryResultARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelinePropertyQueryResultARM`
    public VkDataGraphPipelinePropertyQueryResultARM asSlice(long index, long count) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelinePropertyQueryResultARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM at(long index, Consumer<VkDataGraphPipelinePropertyQueryResultARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `property` at the given index}
    /// @param index the index of the struct buffer
    public int propertyAt(long index) { return property(this.segment(), index); }
    /// Sets `property` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM propertyAt(long index, int value) { property(this.segment(), index, value); return this; }

    /// {@return `isText` at the given index}
    /// @param index the index of the struct buffer
    public int isTextAt(long index) { return isText(this.segment(), index); }
    /// Sets `isText` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM isTextAt(long index, int value) { isText(this.segment(), index, value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param index the index of the struct buffer
    public long dataSizeAt(long index) { return dataSize(this.segment(), index); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM dataSizeAt(long index, long value) { dataSize(this.segment(), index, value); return this; }

    /// {@return `pData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelinePropertyQueryResultARM pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

}
