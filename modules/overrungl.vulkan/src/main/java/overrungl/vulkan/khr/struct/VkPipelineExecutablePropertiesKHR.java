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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### stages
/// [VarHandle][#VH_stages] - [Getter][#stages()] - [Setter][#stages(int)]
/// ### name
/// [Byte offset handle][#MH_name] - [Memory layout][#ML_name] - [Getter][#name(long)] - [Setter][#name(long, java.lang.foreign.MemorySegment)]
/// ### description
/// [Byte offset handle][#MH_description] - [Memory layout][#ML_description] - [Getter][#description(long)] - [Setter][#description(long, java.lang.foreign.MemorySegment)]
/// ### subgroupSize
/// [VarHandle][#VH_subgroupSize] - [Getter][#subgroupSize()] - [Setter][#subgroupSize(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineExecutablePropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkShaderStageFlags stages;
///     char[VK_MAX_DESCRIPTION_SIZE] name;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     uint32_t subgroupSize;
/// } VkPipelineExecutablePropertiesKHR;
/// ```
public final class VkPipelineExecutablePropertiesKHR extends Struct {
    /// The struct layout of `VkPipelineExecutablePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stages"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("subgroupSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stages"));
    /// The byte offset handle of `name` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_name = LAYOUT.byteOffsetHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    /// The memory layout of `name`.
    public static final MemoryLayout ML_name = LAYOUT.select(PathElement.groupElement("name"));
    /// The byte offset handle of `description` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_description = LAYOUT.byteOffsetHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `subgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize"));

    /// Creates `VkPipelineExecutablePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineExecutablePropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineExecutablePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutablePropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment); }

    /// Creates `VkPipelineExecutablePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutablePropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineExecutablePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineExecutablePropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineExecutablePropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineExecutablePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineExecutablePropertiesKHR`
    public static VkPipelineExecutablePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutablePropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineExecutablePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineExecutablePropertiesKHR`
    public static VkPipelineExecutablePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutablePropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineExecutablePropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineExecutablePropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineExecutablePropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineExecutablePropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineExecutablePropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR sType(@CType("VkStructureType") int value) { VkPipelineExecutablePropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineExecutablePropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineExecutablePropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineExecutablePropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `stages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stages(MemorySegment segment, long index) { return (int) VH_stages.get(segment, 0L, index); }
    /// {@return `stages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stages(MemorySegment segment) { return VkPipelineExecutablePropertiesKHR.get_stages(segment, 0L); }
    /// {@return `stages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int stagesAt(long index) { return VkPipelineExecutablePropertiesKHR.get_stages(this.segment(), index); }
    /// {@return `stages`}
    public @CType("VkShaderStageFlags") int stages() { return VkPipelineExecutablePropertiesKHR.get_stages(this.segment()); }
    /// Sets `stages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stages.set(segment, 0L, index, value); }
    /// Sets `stages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPipelineExecutablePropertiesKHR.set_stages(segment, 0L, value); }
    /// Sets `stages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR stagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPipelineExecutablePropertiesKHR.set_stages(this.segment(), index, value); return this; }
    /// Sets `stages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR stages(@CType("VkShaderStageFlags") int value) { VkPipelineExecutablePropertiesKHR.set_stages(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_name.invokeExact(0L, elementIndex), index), ML_name); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `name`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_name(segment, 0L, elementIndex); }
    /// {@return `name` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment nameAt(long index, long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_name(this.segment(), index, elementIndex); }
    /// {@return `name`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment name(long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_name(this.segment(), elementIndex); }
    /// Sets `name` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_name(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_name.invokeExact(0L, elementIndex), index), ML_name.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `name` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_name(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_name(segment, 0L, elementIndex, value); }
    /// Sets `name` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR nameAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_name(this.segment(), index, elementIndex, value); return this; }
    /// Sets `name` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR name(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_name(this.segment(), elementIndex, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `description`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_description(segment, 0L, elementIndex); }
    /// {@return `description` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index, long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_description(this.segment(), index, elementIndex); }
    /// {@return `description`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description(long elementIndex) { return VkPipelineExecutablePropertiesKHR.get_description(this.segment(), elementIndex); }
    /// Sets `description` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `description` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_description(segment, 0L, elementIndex, value); }
    /// Sets `description` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR descriptionAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_description(this.segment(), index, elementIndex, value); return this; }
    /// Sets `description` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR description(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineExecutablePropertiesKHR.set_description(this.segment(), elementIndex, value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment, long index) { return (int) VH_subgroupSize.get(segment, 0L, index); }
    /// {@return `subgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subgroupSize(MemorySegment segment) { return VkPipelineExecutablePropertiesKHR.get_subgroupSize(segment, 0L); }
    /// {@return `subgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subgroupSizeAt(long index) { return VkPipelineExecutablePropertiesKHR.get_subgroupSize(this.segment(), index); }
    /// {@return `subgroupSize`}
    public @CType("uint32_t") int subgroupSize() { return VkPipelineExecutablePropertiesKHR.get_subgroupSize(this.segment()); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subgroupSize.set(segment, 0L, index, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineExecutablePropertiesKHR.set_subgroupSize(segment, 0L, value); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR subgroupSizeAt(long index, @CType("uint32_t") int value) { VkPipelineExecutablePropertiesKHR.set_subgroupSize(this.segment(), index, value); return this; }
    /// Sets `subgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineExecutablePropertiesKHR subgroupSize(@CType("uint32_t") int value) { VkPipelineExecutablePropertiesKHR.set_subgroupSize(this.segment(), value); return this; }

}
