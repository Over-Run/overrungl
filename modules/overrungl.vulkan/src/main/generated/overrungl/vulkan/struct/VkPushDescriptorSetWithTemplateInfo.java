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
/// struct VkPushDescriptorSetWithTemplateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t set;
///     const void* pData;
/// };
/// ```
public sealed class VkPushDescriptorSetWithTemplateInfo extends GroupType {
    /// The struct layout of `VkPushDescriptorSetWithTemplateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("descriptorUpdateTemplate"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
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
    /// The byte offset of `descriptorUpdateTemplate`.
    public static final long OFFSET_descriptorUpdateTemplate = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The memory layout of `descriptorUpdateTemplate`.
    public static final MemoryLayout LAYOUT_descriptorUpdateTemplate = LAYOUT.select(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The [VarHandle] of `descriptorUpdateTemplate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorUpdateTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `set`.
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    /// The memory layout of `set`.
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPushDescriptorSetWithTemplateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetWithTemplateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorUpdateTemplate `descriptorUpdateTemplate`
    /// @param layout `layout`
    /// @param set `set`
    /// @param pData `pData`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long descriptorUpdateTemplate, long layout, int set, MemorySegment pData) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorUpdateTemplate(descriptorUpdateTemplate).layout(layout).set(set).pData(pData);
    }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorUpdateTemplate `descriptorUpdateTemplate`
    /// @param layout `layout`
    /// @param set `set`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long descriptorUpdateTemplate, long layout, int set) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorUpdateTemplate(descriptorUpdateTemplate).layout(layout).set(set);
    }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorUpdateTemplate `descriptorUpdateTemplate`
    /// @param layout `layout`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long descriptorUpdateTemplate, long layout) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorUpdateTemplate(descriptorUpdateTemplate).layout(layout);
    }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param descriptorUpdateTemplate `descriptorUpdateTemplate`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long descriptorUpdateTemplate) {
        return alloc(allocator).sType(sType).pNext(pNext).descriptorUpdateTemplate(descriptorUpdateTemplate);
    }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo copyFrom(VkPushDescriptorSetWithTemplateInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPushDescriptorSetWithTemplateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPushDescriptorSetWithTemplateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorUpdateTemplate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorUpdateTemplate(MemorySegment segment, long index) { return (long) VH_descriptorUpdateTemplate.get(segment, 0L, index); }
    /// {@return `descriptorUpdateTemplate`}
    public long descriptorUpdateTemplate() { return descriptorUpdateTemplate(this.segment(), 0L); }
    /// Sets `descriptorUpdateTemplate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorUpdateTemplate(MemorySegment segment, long index, long value) { VH_descriptorUpdateTemplate.set(segment, 0L, index, value); }
    /// Sets `descriptorUpdateTemplate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(long value) { descriptorUpdateTemplate(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    public int set() { return set(this.segment(), 0L); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void set(MemorySegment segment, long index, int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo set(int value) { set(this.segment(), 0L, value); return this; }

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
    public VkPushDescriptorSetWithTemplateInfo pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPushDescriptorSetWithTemplateInfo].
    public static final class Buffer extends VkPushDescriptorSetWithTemplateInfo {
        private final long elementCount;

        /// Creates `VkPushDescriptorSetWithTemplateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPushDescriptorSetWithTemplateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPushDescriptorSetWithTemplateInfo`
        public VkPushDescriptorSetWithTemplateInfo asSlice(long index) { return new VkPushDescriptorSetWithTemplateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPushDescriptorSetWithTemplateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPushDescriptorSetWithTemplateInfo`
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

        /// {@return `descriptorUpdateTemplate` at the given index}
        /// @param index the index of the struct buffer
        public long descriptorUpdateTemplateAt(long index) { return descriptorUpdateTemplate(this.segment(), index); }
        /// Sets `descriptorUpdateTemplate` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorUpdateTemplateAt(long index, long value) { descriptorUpdateTemplate(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index of the struct buffer
        public long layoutAt(long index) { return layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

        /// {@return `set` at the given index}
        /// @param index the index of the struct buffer
        public int setAt(long index) { return set(this.segment(), index); }
        /// Sets `set` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer setAt(long index, int value) { set(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

    }
}
