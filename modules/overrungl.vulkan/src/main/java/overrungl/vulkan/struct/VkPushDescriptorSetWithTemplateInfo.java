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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### descriptorUpdateTemplate
/// [VarHandle][#VH_descriptorUpdateTemplate] - [Getter][#descriptorUpdateTemplate()] - [Setter][#descriptorUpdateTemplate(java.lang.foreign.MemorySegment)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(java.lang.foreign.MemorySegment)]
/// ### set
/// [VarHandle][#VH_set] - [Getter][#set()] - [Setter][#set(int)]
/// ### pData
/// [VarHandle][#VH_pData] - [Getter][#pData()] - [Setter][#pData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPushDescriptorSetWithTemplateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorUpdateTemplate descriptorUpdateTemplate;
///     VkPipelineLayout layout;
///     uint32_t set;
///     const void * pData;
/// } VkPushDescriptorSetWithTemplateInfo;
/// ```
public final class VkPushDescriptorSetWithTemplateInfo extends Struct {
    /// The struct layout of `VkPushDescriptorSetWithTemplateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorUpdateTemplate"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `descriptorUpdateTemplate` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_descriptorUpdateTemplate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorUpdateTemplate"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPushDescriptorSetWithTemplateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfo(segment); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPushDescriptorSetWithTemplateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushDescriptorSetWithTemplateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPushDescriptorSetWithTemplateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo alloc(SegmentAllocator allocator) { return new VkPushDescriptorSetWithTemplateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPushDescriptorSetWithTemplateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushDescriptorSetWithTemplateInfo`
    public static VkPushDescriptorSetWithTemplateInfo alloc(SegmentAllocator allocator, long count) { return new VkPushDescriptorSetWithTemplateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPushDescriptorSetWithTemplateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPushDescriptorSetWithTemplateInfo`
    public VkPushDescriptorSetWithTemplateInfo asSlice(long index) { return new VkPushDescriptorSetWithTemplateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPushDescriptorSetWithTemplateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPushDescriptorSetWithTemplateInfo`
    public VkPushDescriptorSetWithTemplateInfo asSlice(long index, long count) { return new VkPushDescriptorSetWithTemplateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPushDescriptorSetWithTemplateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPushDescriptorSetWithTemplateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPushDescriptorSetWithTemplateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo sType(@CType("VkStructureType") int value) { VkPushDescriptorSetWithTemplateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPushDescriptorSetWithTemplateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `descriptorUpdateTemplate` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment get_descriptorUpdateTemplate(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_descriptorUpdateTemplate.get(segment, 0L, index); }
    /// {@return `descriptorUpdateTemplate`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment get_descriptorUpdateTemplate(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_descriptorUpdateTemplate(segment, 0L); }
    /// {@return `descriptorUpdateTemplate` at the given index}
    /// @param index the index
    public @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment descriptorUpdateTemplateAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_descriptorUpdateTemplate(this.segment(), index); }
    /// {@return `descriptorUpdateTemplate`}
    public @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment descriptorUpdateTemplate() { return VkPushDescriptorSetWithTemplateInfo.get_descriptorUpdateTemplate(this.segment()); }
    /// Sets `descriptorUpdateTemplate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorUpdateTemplate(MemorySegment segment, long index, @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment value) { VH_descriptorUpdateTemplate.set(segment, 0L, index, value); }
    /// Sets `descriptorUpdateTemplate` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorUpdateTemplate(MemorySegment segment, @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_descriptorUpdateTemplate(segment, 0L, value); }
    /// Sets `descriptorUpdateTemplate` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplateAt(long index, @CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_descriptorUpdateTemplate(this.segment(), index, value); return this; }
    /// Sets `descriptorUpdateTemplate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(@CType("VkDescriptorUpdateTemplate") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_descriptorUpdateTemplate(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineLayout") java.lang.foreign.MemorySegment get_layout(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_layout(segment, 0L); }
    /// {@return `layout` at the given index}
    /// @param index the index
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layoutAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_layout(this.segment(), index); }
    /// {@return `layout`}
    public @CType("VkPipelineLayout") java.lang.foreign.MemorySegment layout() { return VkPushDescriptorSetWithTemplateInfo.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo layoutAt(long index, @CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_layout(this.segment(), index, value); return this; }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo layout(@CType("VkPipelineLayout") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_layout(this.segment(), value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_set(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_set(segment, 0L); }
    /// {@return `set` at the given index}
    /// @param index the index
    public @CType("uint32_t") int setAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_set(this.segment(), index); }
    /// {@return `set`}
    public @CType("uint32_t") int set() { return VkPushDescriptorSetWithTemplateInfo.get_set(this.segment()); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_set(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_set(MemorySegment segment, @CType("uint32_t") int value) { VkPushDescriptorSetWithTemplateInfo.set_set(segment, 0L, value); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo setAt(long index, @CType("uint32_t") int value) { VkPushDescriptorSetWithTemplateInfo.set_set(this.segment(), index, value); return this; }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo set(@CType("uint32_t") int value) { VkPushDescriptorSetWithTemplateInfo.set_set(this.segment(), value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pData(MemorySegment segment) { return VkPushDescriptorSetWithTemplateInfo.get_pData(segment, 0L); }
    /// {@return `pData` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pDataAt(long index) { return VkPushDescriptorSetWithTemplateInfo.get_pData(this.segment(), index); }
    /// {@return `pData`}
    public @CType("const void *") java.lang.foreign.MemorySegment pData() { return VkPushDescriptorSetWithTemplateInfo.get_pData(this.segment()); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pData(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pData(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pData(segment, 0L, value); }
    /// Sets `pData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo pDataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pData(this.segment(), index, value); return this; }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushDescriptorSetWithTemplateInfo pData(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPushDescriptorSetWithTemplateInfo.set_pData(this.segment(), value); return this; }

}
