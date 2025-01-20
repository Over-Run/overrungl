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
package overrungl.vulkan.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### descriptorUpdateEntryCount
/// [VarHandle][#VH_descriptorUpdateEntryCount] - [Getter][#descriptorUpdateEntryCount()] - [Setter][#descriptorUpdateEntryCount(int)]
/// ### pDescriptorUpdateEntries
/// [VarHandle][#VH_pDescriptorUpdateEntries] - [Getter][#pDescriptorUpdateEntries()] - [Setter][#pDescriptorUpdateEntries(MemorySegment)]
/// ### templateType
/// [VarHandle][#VH_templateType] - [Getter][#templateType()] - [Setter][#templateType(int)]
/// ### descriptorSetLayout
/// [VarHandle][#VH_descriptorSetLayout] - [Getter][#descriptorSetLayout()] - [Setter][#descriptorSetLayout(MemorySegment)]
/// ### pipelineBindPoint
/// [VarHandle][#VH_pipelineBindPoint] - [Getter][#pipelineBindPoint()] - [Setter][#pipelineBindPoint(int)]
/// ### pipelineLayout
/// [VarHandle][#VH_pipelineLayout] - [Getter][#pipelineLayout()] - [Setter][#pipelineLayout(MemorySegment)]
/// ### set
/// [VarHandle][#VH_set] - [Getter][#set()] - [Setter][#set(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDescriptorUpdateTemplateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorUpdateTemplateCreateFlags flags;
///     uint32_t descriptorUpdateEntryCount;
///     const VkDescriptorUpdateTemplateEntry * pDescriptorUpdateEntries;
///     VkDescriptorUpdateTemplateType templateType;
///     VkDescriptorSetLayout descriptorSetLayout;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipelineLayout pipelineLayout;
///     uint32_t set;
/// } VkDescriptorUpdateTemplateCreateInfo;
/// ```
public sealed class VkDescriptorUpdateTemplateCreateInfo extends Struct {
    /// The struct layout of `VkDescriptorUpdateTemplateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount"),
        ValueLayout.ADDRESS.withName("pDescriptorUpdateEntries"),
        ValueLayout.JAVA_INT.withName("templateType"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("set")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `descriptorUpdateEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorUpdateEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateEntryCount"));
    /// The [VarHandle] of `pDescriptorUpdateEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDescriptorUpdateEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorUpdateEntries"));
    /// The [VarHandle] of `templateType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_templateType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("templateType"));
    /// The [VarHandle] of `descriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayout"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfo(segment); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorUpdateTemplateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorUpdateTemplateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorUpdateTemplateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorUpdateTemplateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorUpdateTemplateCreateInfo`
    public static VkDescriptorUpdateTemplateCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorUpdateTemplateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorUpdateTemplateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorUpdateTemplateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDescriptorUpdateTemplateCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorUpdateTemplateCreateInfo`
    public static VkDescriptorUpdateTemplateCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDescriptorUpdateTemplateCreateFlags") int flags, @CType("uint32_t") int descriptorUpdateEntryCount, @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment pDescriptorUpdateEntries, @CType("VkDescriptorUpdateTemplateType") int templateType, @CType("VkDescriptorSetLayout") MemorySegment descriptorSetLayout, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment pipelineLayout, @CType("uint32_t") int set) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).descriptorUpdateEntryCount(descriptorUpdateEntryCount).pDescriptorUpdateEntries(pDescriptorUpdateEntries).templateType(templateType).descriptorSetLayout(descriptorSetLayout).pipelineBindPoint(pipelineBindPoint).pipelineLayout(pipelineLayout).set(set); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo copyFrom(VkDescriptorUpdateTemplateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDescriptorUpdateTemplateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo sType(@CType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDescriptorUpdateTemplateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pNext(@CType("const void *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorUpdateTemplateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorUpdateTemplateCreateFlags") int get_flags(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDescriptorUpdateTemplateCreateFlags") int flags() { return VkDescriptorUpdateTemplateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDescriptorUpdateTemplateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDescriptorUpdateTemplateCreateFlags") int value) { VkDescriptorUpdateTemplateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo flags(@CType("VkDescriptorUpdateTemplateCreateFlags") int value) { VkDescriptorUpdateTemplateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `descriptorUpdateEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorUpdateEntryCount(MemorySegment segment, long index) { return (int) VH_descriptorUpdateEntryCount.get(segment, 0L, index); }
    /// {@return `descriptorUpdateEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorUpdateEntryCount(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorUpdateEntryCount(segment, 0L); }
    /// {@return `descriptorUpdateEntryCount`}
    public @CType("uint32_t") int descriptorUpdateEntryCount() { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorUpdateEntryCount(this.segment()); }
    /// Sets `descriptorUpdateEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorUpdateEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorUpdateEntryCount.set(segment, 0L, index, value); }
    /// Sets `descriptorUpdateEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorUpdateEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorUpdateEntryCount(segment, 0L, value); }
    /// Sets `descriptorUpdateEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorUpdateEntryCount(@CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorUpdateEntryCount(this.segment(), value); return this; }

    /// {@return `pDescriptorUpdateEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment get_pDescriptorUpdateEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorUpdateEntries.get(segment, 0L, index); }
    /// {@return `pDescriptorUpdateEntries`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment get_pDescriptorUpdateEntries(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_pDescriptorUpdateEntries(segment, 0L); }
    /// {@return `pDescriptorUpdateEntries`}
    public @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment pDescriptorUpdateEntries() { return VkDescriptorUpdateTemplateCreateInfo.get_pDescriptorUpdateEntries(this.segment()); }
    /// Sets `pDescriptorUpdateEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDescriptorUpdateEntries(MemorySegment segment, long index, @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment value) { VH_pDescriptorUpdateEntries.set(segment, 0L, index, value); }
    /// Sets `pDescriptorUpdateEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDescriptorUpdateEntries(MemorySegment segment, @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pDescriptorUpdateEntries(segment, 0L, value); }
    /// Sets `pDescriptorUpdateEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(@CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pDescriptorUpdateEntries(this.segment(), value); return this; }

    /// {@return `templateType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorUpdateTemplateType") int get_templateType(MemorySegment segment, long index) { return (int) VH_templateType.get(segment, 0L, index); }
    /// {@return `templateType`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorUpdateTemplateType") int get_templateType(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_templateType(segment, 0L); }
    /// {@return `templateType`}
    public @CType("VkDescriptorUpdateTemplateType") int templateType() { return VkDescriptorUpdateTemplateCreateInfo.get_templateType(this.segment()); }
    /// Sets `templateType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_templateType(MemorySegment segment, long index, @CType("VkDescriptorUpdateTemplateType") int value) { VH_templateType.set(segment, 0L, index, value); }
    /// Sets `templateType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_templateType(MemorySegment segment, @CType("VkDescriptorUpdateTemplateType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_templateType(segment, 0L, value); }
    /// Sets `templateType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo templateType(@CType("VkDescriptorUpdateTemplateType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_templateType(this.segment(), value); return this; }

    /// {@return `descriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSetLayout") MemorySegment get_descriptorSetLayout(MemorySegment segment, long index) { return (MemorySegment) VH_descriptorSetLayout.get(segment, 0L, index); }
    /// {@return `descriptorSetLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSetLayout") MemorySegment get_descriptorSetLayout(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorSetLayout(segment, 0L); }
    /// {@return `descriptorSetLayout`}
    public @CType("VkDescriptorSetLayout") MemorySegment descriptorSetLayout() { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorSetLayout(this.segment()); }
    /// Sets `descriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetLayout(MemorySegment segment, long index, @CType("VkDescriptorSetLayout") MemorySegment value) { VH_descriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetLayout(MemorySegment segment, @CType("VkDescriptorSetLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorSetLayout(segment, 0L, value); }
    /// Sets `descriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(@CType("VkDescriptorSetLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorSetLayout(this.segment(), value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineBindPoint") int get_pipelineBindPoint(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineBindPoint(segment, 0L); }
    /// {@return `pipelineBindPoint`}
    public @CType("VkPipelineBindPoint") int pipelineBindPoint() { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineBindPoint(this.segment()); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, long index, @CType("VkPipelineBindPoint") int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineBindPoint(MemorySegment segment, @CType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineBindPoint(segment, 0L, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(@CType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineBindPoint(this.segment(), value); return this; }

    /// {@return `pipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") MemorySegment get_pipelineLayout(MemorySegment segment, long index) { return (MemorySegment) VH_pipelineLayout.get(segment, 0L, index); }
    /// {@return `pipelineLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") MemorySegment get_pipelineLayout(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineLayout(segment, 0L); }
    /// {@return `pipelineLayout`}
    public @CType("VkPipelineLayout") MemorySegment pipelineLayout() { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineLayout(this.segment()); }
    /// Sets `pipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineLayout(MemorySegment segment, long index, @CType("VkPipelineLayout") MemorySegment value) { VH_pipelineLayout.set(segment, 0L, index, value); }
    /// Sets `pipelineLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineLayout(MemorySegment segment, @CType("VkPipelineLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineLayout(segment, 0L, value); }
    /// Sets `pipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo pipelineLayout(@CType("VkPipelineLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineLayout(this.segment(), value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_set(MemorySegment segment) { return VkDescriptorUpdateTemplateCreateInfo.get_set(segment, 0L); }
    /// {@return `set`}
    public @CType("uint32_t") int set() { return VkDescriptorUpdateTemplateCreateInfo.get_set(this.segment()); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_set(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_set(MemorySegment segment, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_set(segment, 0L, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorUpdateTemplateCreateInfo set(@CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_set(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorUpdateTemplateCreateInfo].
    public static final class Buffer extends VkDescriptorUpdateTemplateCreateInfo {
        private final long elementCount;

        /// Creates `VkDescriptorUpdateTemplateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorUpdateTemplateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDescriptorUpdateTemplateCreateInfo`
        public VkDescriptorUpdateTemplateCreateInfo asSlice(long index) { return new VkDescriptorUpdateTemplateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorUpdateTemplateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorUpdateTemplateCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDescriptorUpdateTemplateCreateFlags") int flagsAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDescriptorUpdateTemplateCreateFlags") int value) { VkDescriptorUpdateTemplateCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `descriptorUpdateEntryCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorUpdateEntryCountAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorUpdateEntryCount(this.segment(), index); }
        /// Sets `descriptorUpdateEntryCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorUpdateEntryCountAt(long index, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorUpdateEntryCount(this.segment(), index, value); return this; }

        /// {@return `pDescriptorUpdateEntries` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment pDescriptorUpdateEntriesAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_pDescriptorUpdateEntries(this.segment(), index); }
        /// Sets `pDescriptorUpdateEntries` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDescriptorUpdateEntriesAt(long index, @CType("const VkDescriptorUpdateTemplateEntry *") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pDescriptorUpdateEntries(this.segment(), index, value); return this; }

        /// {@return `templateType` at the given index}
        /// @param index the index
        public @CType("VkDescriptorUpdateTemplateType") int templateTypeAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_templateType(this.segment(), index); }
        /// Sets `templateType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer templateTypeAt(long index, @CType("VkDescriptorUpdateTemplateType") int value) { VkDescriptorUpdateTemplateCreateInfo.set_templateType(this.segment(), index, value); return this; }

        /// {@return `descriptorSetLayout` at the given index}
        /// @param index the index
        public @CType("VkDescriptorSetLayout") MemorySegment descriptorSetLayoutAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_descriptorSetLayout(this.segment(), index); }
        /// Sets `descriptorSetLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorSetLayoutAt(long index, @CType("VkDescriptorSetLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_descriptorSetLayout(this.segment(), index, value); return this; }

        /// {@return `pipelineBindPoint` at the given index}
        /// @param index the index
        public @CType("VkPipelineBindPoint") int pipelineBindPointAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineBindPoint(this.segment(), index); }
        /// Sets `pipelineBindPoint` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineBindPointAt(long index, @CType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineBindPoint(this.segment(), index, value); return this; }

        /// {@return `pipelineLayout` at the given index}
        /// @param index the index
        public @CType("VkPipelineLayout") MemorySegment pipelineLayoutAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_pipelineLayout(this.segment(), index); }
        /// Sets `pipelineLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pipelineLayoutAt(long index, @CType("VkPipelineLayout") MemorySegment value) { VkDescriptorUpdateTemplateCreateInfo.set_pipelineLayout(this.segment(), index, value); return this; }

        /// {@return `set` at the given index}
        /// @param index the index
        public @CType("uint32_t") int setAt(long index) { return VkDescriptorUpdateTemplateCreateInfo.get_set(this.segment(), index); }
        /// Sets `set` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer setAt(long index, @CType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.set_set(this.segment(), index, value); return this; }

    }
}
