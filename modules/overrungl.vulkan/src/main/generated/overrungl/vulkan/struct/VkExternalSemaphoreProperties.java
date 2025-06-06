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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkExternalSemaphoreProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     ((uint32_t) VkFlags) VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     ((uint32_t) VkFlags) VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
/// };
/// ```
public sealed class VkExternalSemaphoreProperties extends GroupType {
    /// The struct layout of `VkExternalSemaphoreProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
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
    /// The byte offset of `exportFromImportedHandleTypes`.
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The memory layout of `exportFromImportedHandleTypes`.
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The byte offset of `compatibleHandleTypes`.
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    /// The memory layout of `compatibleHandleTypes`.
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    /// The byte offset of `externalSemaphoreFeatures`.
    public static final long OFFSET_externalSemaphoreFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalSemaphoreFeatures"));
    /// The memory layout of `externalSemaphoreFeatures`.
    public static final MemoryLayout LAYOUT_externalSemaphoreFeatures = LAYOUT.select(PathElement.groupElement("externalSemaphoreFeatures"));
    /// The [VarHandle] of `externalSemaphoreFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalSemaphoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalSemaphoreFeatures"));

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    /// @param segment the memory segment
    public VkExternalSemaphoreProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphoreProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphoreProperties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkExternalSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties alloc(SegmentAllocator allocator) { return new VkExternalSemaphoreProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param exportFromImportedHandleTypes `exportFromImportedHandleTypes`
    /// @param compatibleHandleTypes `compatibleHandleTypes`
    /// @param externalSemaphoreFeatures `externalSemaphoreFeatures`
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int exportFromImportedHandleTypes, int compatibleHandleTypes, int externalSemaphoreFeatures) {
        return alloc(allocator).sType(sType).pNext(pNext).exportFromImportedHandleTypes(exportFromImportedHandleTypes).compatibleHandleTypes(compatibleHandleTypes).externalSemaphoreFeatures(externalSemaphoreFeatures);
    }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param exportFromImportedHandleTypes `exportFromImportedHandleTypes`
    /// @param compatibleHandleTypes `compatibleHandleTypes`
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int exportFromImportedHandleTypes, int compatibleHandleTypes) {
        return alloc(allocator).sType(sType).pNext(pNext).exportFromImportedHandleTypes(exportFromImportedHandleTypes).compatibleHandleTypes(compatibleHandleTypes);
    }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param exportFromImportedHandleTypes `exportFromImportedHandleTypes`
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int exportFromImportedHandleTypes) {
        return alloc(allocator).sType(sType).pNext(pNext).exportFromImportedHandleTypes(exportFromImportedHandleTypes);
    }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkExternalSemaphoreProperties` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkExternalSemaphoreProperties`
    public static VkExternalSemaphoreProperties allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalSemaphoreProperties copyFrom(VkExternalSemaphoreProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkExternalSemaphoreProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalSemaphoreProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    public int exportFromImportedHandleTypes() { return exportFromImportedHandleTypes(this.segment(), 0L); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void exportFromImportedHandleTypes(MemorySegment segment, long index, int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties exportFromImportedHandleTypes(int value) { exportFromImportedHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    public int compatibleHandleTypes() { return compatibleHandleTypes(this.segment(), 0L); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleHandleTypes(MemorySegment segment, long index, int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties compatibleHandleTypes(int value) { compatibleHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `externalSemaphoreFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalSemaphoreFeatures(MemorySegment segment, long index) { return (int) VH_externalSemaphoreFeatures.get(segment, 0L, index); }
    /// {@return `externalSemaphoreFeatures`}
    public int externalSemaphoreFeatures() { return externalSemaphoreFeatures(this.segment(), 0L); }
    /// Sets `externalSemaphoreFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalSemaphoreFeatures(MemorySegment segment, long index, int value) { VH_externalSemaphoreFeatures.set(segment, 0L, index, value); }
    /// Sets `externalSemaphoreFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphoreProperties externalSemaphoreFeatures(int value) { externalSemaphoreFeatures(this.segment(), 0L, value); return this; }

    /// A buffer of [VkExternalSemaphoreProperties].
    public static final class Buffer extends VkExternalSemaphoreProperties {
        private final long elementCount;

        /// Creates `VkExternalSemaphoreProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkExternalSemaphoreProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkExternalSemaphoreProperties`
        public VkExternalSemaphoreProperties asSlice(long index) { return new VkExternalSemaphoreProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkExternalSemaphoreProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkExternalSemaphoreProperties`
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

        /// {@return `exportFromImportedHandleTypes` at the given index}
        /// @param index the index of the struct buffer
        public int exportFromImportedHandleTypesAt(long index) { return exportFromImportedHandleTypes(this.segment(), index); }
        /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer exportFromImportedHandleTypesAt(long index, int value) { exportFromImportedHandleTypes(this.segment(), index, value); return this; }

        /// {@return `compatibleHandleTypes` at the given index}
        /// @param index the index of the struct buffer
        public int compatibleHandleTypesAt(long index) { return compatibleHandleTypes(this.segment(), index); }
        /// Sets `compatibleHandleTypes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer compatibleHandleTypesAt(long index, int value) { compatibleHandleTypes(this.segment(), index, value); return this; }

        /// {@return `externalSemaphoreFeatures` at the given index}
        /// @param index the index of the struct buffer
        public int externalSemaphoreFeaturesAt(long index) { return externalSemaphoreFeatures(this.segment(), index); }
        /// Sets `externalSemaphoreFeatures` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer externalSemaphoreFeaturesAt(long index, int value) { externalSemaphoreFeatures(this.segment(), index, value); return this; }

    }
}
