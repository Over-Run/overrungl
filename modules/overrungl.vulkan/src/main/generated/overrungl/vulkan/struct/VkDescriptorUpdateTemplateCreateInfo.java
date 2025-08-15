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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorUpdateTemplateCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorUpdateTemplateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDescriptorUpdateTemplateCreateFlags flags;
///     uint32_t descriptorUpdateEntryCount;
///     const VkDescriptorUpdateTemplateEntry* pDescriptorUpdateEntries;
///     (int) VkDescriptorUpdateTemplateType templateType;
///     (uint64_t) VkDescriptorSetLayout descriptorSetLayout;
///     (int) VkPipelineBindPoint pipelineBindPoint;
///     (uint64_t) VkPipelineLayout pipelineLayout;
///     uint32_t set;
/// };
/// ```
public final class VkDescriptorUpdateTemplateCreateInfo extends GroupType {
    /// The struct layout of `VkDescriptorUpdateTemplateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount"),
        ValueLayout.ADDRESS.withName("pDescriptorUpdateEntries"),
        ValueLayout.JAVA_INT.withName("templateType"),
        ValueLayout.JAVA_LONG.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_LONG.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("set")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `descriptorUpdateEntryCount`.
    public static final long OFFSET_descriptorUpdateEntryCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorUpdateEntryCount"));
    /// The memory layout of `descriptorUpdateEntryCount`.
    public static final MemoryLayout LAYOUT_descriptorUpdateEntryCount = LAYOUT.select(PathElement.groupElement("descriptorUpdateEntryCount"));
    /// The [VarHandle] of `descriptorUpdateEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorUpdateEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateEntryCount"));
    /// The byte offset of `pDescriptorUpdateEntries`.
    public static final long OFFSET_pDescriptorUpdateEntries = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorUpdateEntries"));
    /// The memory layout of `pDescriptorUpdateEntries`.
    public static final MemoryLayout LAYOUT_pDescriptorUpdateEntries = LAYOUT.select(PathElement.groupElement("pDescriptorUpdateEntries"));
    /// The [VarHandle] of `pDescriptorUpdateEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDescriptorUpdateEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorUpdateEntries"));
    /// The byte offset of `templateType`.
    public static final long OFFSET_templateType = LAYOUT.byteOffset(PathElement.groupElement("templateType"));
    /// The memory layout of `templateType`.
    public static final MemoryLayout LAYOUT_templateType = LAYOUT.select(PathElement.groupElement("templateType"));
    /// The [VarHandle] of `templateType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_templateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("templateType"));
    /// The byte offset of `descriptorSetLayout`.
    public static final long OFFSET_descriptorSetLayout = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
    /// The memory layout of `descriptorSetLayout`.
    public static final MemoryLayout LAYOUT_descriptorSetLayout = LAYOUT.select(PathElement.groupElement("descriptorSetLayout"));
    /// The [VarHandle] of `descriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    /// The byte offset of `pipelineBindPoint`.
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    /// The memory layout of `pipelineBindPoint`.
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The byte offset of `pipelineLayout`.
    public static final long OFFSET_pipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
    /// The memory layout of `pipelineLayout`.
    public static final MemoryLayout LAYOUT_pipelineLayout = LAYOUT.select(PathElement.groupElement("pipelineLayout"));
    /// The [VarHandle] of `pipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    /// The byte offset of `set`.
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    /// The memory layout of `set`.
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorUpdateTemplateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorUpdateTemplateCreateInfo`
    public static VkDescriptorUpdateTemplateCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorUpdateTemplateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorUpdateTemplateCreateInfo`
    public static VkDescriptorUpdateTemplateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorUpdateTemplateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo copyFrom(VkDescriptorUpdateTemplateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorUpdateTemplateCreateInfo reinterpret(long count) { return new VkDescriptorUpdateTemplateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorUpdateTemplateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorUpdateTemplateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `descriptorUpdateEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorUpdateEntryCount(MemorySegment segment, long index) { return (int) VH_descriptorUpdateEntryCount.get(segment, 0L, index); }
    /// {@return `descriptorUpdateEntryCount`}
    public int descriptorUpdateEntryCount() { return descriptorUpdateEntryCount(this.segment(), 0L); }
    /// Sets `descriptorUpdateEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorUpdateEntryCount(MemorySegment segment, long index, int value) { VH_descriptorUpdateEntryCount.set(segment, 0L, index, value); }
    /// Sets `descriptorUpdateEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorUpdateEntryCount(int value) { descriptorUpdateEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pDescriptorUpdateEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDescriptorUpdateEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorUpdateEntries.get(segment, 0L, index); }
    /// {@return `pDescriptorUpdateEntries`}
    public MemorySegment pDescriptorUpdateEntries() { return pDescriptorUpdateEntries(this.segment(), 0L); }
    /// Sets `pDescriptorUpdateEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDescriptorUpdateEntries(MemorySegment segment, long index, MemorySegment value) { VH_pDescriptorUpdateEntries.set(segment, 0L, index, value); }
    /// Sets `pDescriptorUpdateEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(MemorySegment value) { pDescriptorUpdateEntries(this.segment(), 0L, value); return this; }

    /// {@return `templateType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int templateType(MemorySegment segment, long index) { return (int) VH_templateType.get(segment, 0L, index); }
    /// {@return `templateType`}
    public int templateType() { return templateType(this.segment(), 0L); }
    /// Sets `templateType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void templateType(MemorySegment segment, long index, int value) { VH_templateType.set(segment, 0L, index, value); }
    /// Sets `templateType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo templateType(int value) { templateType(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorSetLayout(MemorySegment segment, long index) { return (long) VH_descriptorSetLayout.get(segment, 0L, index); }
    /// {@return `descriptorSetLayout`}
    public long descriptorSetLayout() { return descriptorSetLayout(this.segment(), 0L); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetLayout(MemorySegment segment, long index, long value) { VH_descriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(long value) { descriptorSetLayout(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    public int pipelineBindPoint() { return pipelineBindPoint(this.segment(), 0L); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBindPoint(MemorySegment segment, long index, int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(int value) { pipelineBindPoint(this.segment(), 0L, value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineLayout(MemorySegment segment, long index) { return (long) VH_pipelineLayout.get(segment, 0L, index); }
    /// {@return `pipelineLayout`}
    public long pipelineLayout() { return pipelineLayout(this.segment(), 0L); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineLayout(MemorySegment segment, long index, long value) { VH_pipelineLayout.set(segment, 0L, index, value); }
    /// Sets `pipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineLayout(long value) { pipelineLayout(this.segment(), 0L, value); return this; }

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
    public VkDescriptorUpdateTemplateCreateInfo set(int value) { set(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorUpdateTemplateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorUpdateTemplateCreateInfo`
    public VkDescriptorUpdateTemplateCreateInfo asSlice(long index) { return new VkDescriptorUpdateTemplateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorUpdateTemplateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorUpdateTemplateCreateInfo`
    public VkDescriptorUpdateTemplateCreateInfo asSlice(long index, long count) { return new VkDescriptorUpdateTemplateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorUpdateTemplateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo at(long index, Consumer<VkDescriptorUpdateTemplateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `descriptorUpdateEntryCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorUpdateEntryCountAt(long index) { return descriptorUpdateEntryCount(this.segment(), index); }
    /// Sets `descriptorUpdateEntryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorUpdateEntryCountAt(long index, int value) { descriptorUpdateEntryCount(this.segment(), index, value); return this; }

    /// {@return `pDescriptorUpdateEntries` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDescriptorUpdateEntriesAt(long index) { return pDescriptorUpdateEntries(this.segment(), index); }
    /// Sets `pDescriptorUpdateEntries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntriesAt(long index, MemorySegment value) { pDescriptorUpdateEntries(this.segment(), index, value); return this; }

    /// {@return `templateType` at the given index}
    /// @param index the index of the struct buffer
    public int templateTypeAt(long index) { return templateType(this.segment(), index); }
    /// Sets `templateType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo templateTypeAt(long index, int value) { templateType(this.segment(), index, value); return this; }

    /// {@return `descriptorSetLayout` at the given index}
    /// @param index the index of the struct buffer
    public long descriptorSetLayoutAt(long index) { return descriptorSetLayout(this.segment(), index); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayoutAt(long index, long value) { descriptorSetLayout(this.segment(), index, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineBindPointAt(long index) { return pipelineBindPoint(this.segment(), index); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPointAt(long index, int value) { pipelineBindPoint(this.segment(), index, value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param index the index of the struct buffer
    public long pipelineLayoutAt(long index) { return pipelineLayout(this.segment(), index); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineLayoutAt(long index, long value) { pipelineLayout(this.segment(), index, value); return this; }

    /// {@return `set` at the given index}
    /// @param index the index of the struct buffer
    public int setAt(long index) { return set(this.segment(), index); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo setAt(long index, int value) { set(this.segment(), index, value); return this; }

}
