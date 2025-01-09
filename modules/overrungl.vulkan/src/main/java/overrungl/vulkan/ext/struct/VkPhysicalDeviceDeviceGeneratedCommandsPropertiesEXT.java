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
package overrungl.vulkan.ext.struct;

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
/// ### maxIndirectPipelineCount
/// [VarHandle][#VH_maxIndirectPipelineCount] - [Getter][#maxIndirectPipelineCount()] - [Setter][#maxIndirectPipelineCount(int)]
/// ### maxIndirectShaderObjectCount
/// [VarHandle][#VH_maxIndirectShaderObjectCount] - [Getter][#maxIndirectShaderObjectCount()] - [Setter][#maxIndirectShaderObjectCount(int)]
/// ### maxIndirectSequenceCount
/// [VarHandle][#VH_maxIndirectSequenceCount] - [Getter][#maxIndirectSequenceCount()] - [Setter][#maxIndirectSequenceCount(int)]
/// ### maxIndirectCommandsTokenCount
/// [VarHandle][#VH_maxIndirectCommandsTokenCount] - [Getter][#maxIndirectCommandsTokenCount()] - [Setter][#maxIndirectCommandsTokenCount(int)]
/// ### maxIndirectCommandsTokenOffset
/// [VarHandle][#VH_maxIndirectCommandsTokenOffset] - [Getter][#maxIndirectCommandsTokenOffset()] - [Setter][#maxIndirectCommandsTokenOffset(int)]
/// ### maxIndirectCommandsIndirectStride
/// [VarHandle][#VH_maxIndirectCommandsIndirectStride] - [Getter][#maxIndirectCommandsIndirectStride()] - [Setter][#maxIndirectCommandsIndirectStride(int)]
/// ### supportedIndirectCommandsInputModes
/// [VarHandle][#VH_supportedIndirectCommandsInputModes] - [Getter][#supportedIndirectCommandsInputModes()] - [Setter][#supportedIndirectCommandsInputModes(int)]
/// ### supportedIndirectCommandsShaderStages
/// [VarHandle][#VH_supportedIndirectCommandsShaderStages] - [Getter][#supportedIndirectCommandsShaderStages()] - [Setter][#supportedIndirectCommandsShaderStages(int)]
/// ### supportedIndirectCommandsShaderStagesPipelineBinding
/// [VarHandle][#VH_supportedIndirectCommandsShaderStagesPipelineBinding] - [Getter][#supportedIndirectCommandsShaderStagesPipelineBinding()] - [Setter][#supportedIndirectCommandsShaderStagesPipelineBinding(int)]
/// ### supportedIndirectCommandsShaderStagesShaderBinding
/// [VarHandle][#VH_supportedIndirectCommandsShaderStagesShaderBinding] - [Getter][#supportedIndirectCommandsShaderStagesShaderBinding()] - [Setter][#supportedIndirectCommandsShaderStagesShaderBinding(int)]
/// ### deviceGeneratedCommandsTransformFeedback
/// [VarHandle][#VH_deviceGeneratedCommandsTransformFeedback] - [Getter][#deviceGeneratedCommandsTransformFeedback()] - [Setter][#deviceGeneratedCommandsTransformFeedback(int)]
/// ### deviceGeneratedCommandsMultiDrawIndirectCount
/// [VarHandle][#VH_deviceGeneratedCommandsMultiDrawIndirectCount] - [Getter][#deviceGeneratedCommandsMultiDrawIndirectCount()] - [Setter][#deviceGeneratedCommandsMultiDrawIndirectCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxIndirectPipelineCount;
///     uint32_t maxIndirectShaderObjectCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsIndirectStride;
///     VkIndirectCommandsInputModeFlagsEXT supportedIndirectCommandsInputModes;
///     VkShaderStageFlags supportedIndirectCommandsShaderStages;
///     VkShaderStageFlags supportedIndirectCommandsShaderStagesPipelineBinding;
///     VkShaderStageFlags supportedIndirectCommandsShaderStagesShaderBinding;
///     VkBool32 deviceGeneratedCommandsTransformFeedback;
///     VkBool32 deviceGeneratedCommandsMultiDrawIndirectCount;
/// } VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT;
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxIndirectPipelineCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectShaderObjectCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsIndirectStride"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsInputModes"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStages"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesPipelineBinding"),
        ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesShaderBinding"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsTransformFeedback"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsMultiDrawIndirectCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxIndirectPipelineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectPipelineCount"));
    /// The [VarHandle] of `maxIndirectShaderObjectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectShaderObjectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectShaderObjectCount"));
    /// The [VarHandle] of `maxIndirectSequenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The [VarHandle] of `maxIndirectCommandsIndirectStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxIndirectCommandsIndirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    /// The [VarHandle] of `supportedIndirectCommandsInputModes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedIndirectCommandsInputModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStagesPipelineBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStagesShaderBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    /// The [VarHandle] of `deviceGeneratedCommandsTransformFeedback` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedCommandsTransformFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    /// The [VarHandle] of `deviceGeneratedCommandsMultiDrawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `maxIndirectPipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectPipelineCount(MemorySegment segment, long index) { return (int) VH_maxIndirectPipelineCount.get(segment, 0L, index); }
    /// {@return `maxIndirectPipelineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectPipelineCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectPipelineCount(segment, 0L); }
    /// {@return `maxIndirectPipelineCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectPipelineCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectPipelineCount(this.segment(), index); }
    /// {@return `maxIndirectPipelineCount`}
    public @CType("uint32_t") int maxIndirectPipelineCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectPipelineCount(this.segment()); }
    /// Sets `maxIndirectPipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectPipelineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectPipelineCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectPipelineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectPipelineCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectPipelineCount(segment, 0L, value); }
    /// Sets `maxIndirectPipelineCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectPipelineCount(this.segment(), index, value); return this; }
    /// Sets `maxIndirectPipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectPipelineCount(this.segment(), value); return this; }

    /// {@return `maxIndirectShaderObjectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectShaderObjectCount(MemorySegment segment, long index) { return (int) VH_maxIndirectShaderObjectCount.get(segment, 0L, index); }
    /// {@return `maxIndirectShaderObjectCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectShaderObjectCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectShaderObjectCount(segment, 0L); }
    /// {@return `maxIndirectShaderObjectCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectShaderObjectCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectShaderObjectCount(this.segment(), index); }
    /// {@return `maxIndirectShaderObjectCount`}
    public @CType("uint32_t") int maxIndirectShaderObjectCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectShaderObjectCount(this.segment()); }
    /// Sets `maxIndirectShaderObjectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectShaderObjectCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectShaderObjectCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectShaderObjectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectShaderObjectCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectShaderObjectCount(segment, 0L, value); }
    /// Sets `maxIndirectShaderObjectCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectShaderObjectCount(this.segment(), index, value); return this; }
    /// Sets `maxIndirectShaderObjectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectShaderObjectCount(this.segment(), value); return this; }

    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectSequenceCount(MemorySegment segment, long index) { return (int) VH_maxIndirectSequenceCount.get(segment, 0L, index); }
    /// {@return `maxIndirectSequenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectSequenceCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectSequenceCount(segment, 0L); }
    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectSequenceCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectSequenceCount(this.segment(), index); }
    /// {@return `maxIndirectSequenceCount`}
    public @CType("uint32_t") int maxIndirectSequenceCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectSequenceCount(this.segment()); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectSequenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectSequenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectSequenceCount(segment, 0L, value); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectSequenceCount(this.segment(), index, value); return this; }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectSequenceCount(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenCount(segment, 0L); }
    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectCommandsTokenCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenCount(this.segment(), index); }
    /// {@return `maxIndirectCommandsTokenCount`}
    public @CType("uint32_t") int maxIndirectCommandsTokenCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenCount(this.segment()); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsTokenCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenCount(segment, 0L, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenCount(this.segment(), index, value); return this; }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCount(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenCount(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenOffset(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsTokenOffset(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenOffset(segment, 0L); }
    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectCommandsTokenOffsetAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenOffset(this.segment(), index); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    public @CType("uint32_t") int maxIndirectCommandsTokenOffset() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsTokenOffset(this.segment()); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsTokenOffset.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsTokenOffset(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenOffset(segment, 0L, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffsetAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenOffset(this.segment(), index, value); return this; }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffset(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsTokenOffset(this.segment(), value); return this; }

    /// {@return `maxIndirectCommandsIndirectStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxIndirectCommandsIndirectStride(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsIndirectStride.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsIndirectStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxIndirectCommandsIndirectStride(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsIndirectStride(segment, 0L); }
    /// {@return `maxIndirectCommandsIndirectStride` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxIndirectCommandsIndirectStrideAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsIndirectStride(this.segment(), index); }
    /// {@return `maxIndirectCommandsIndirectStride`}
    public @CType("uint32_t") int maxIndirectCommandsIndirectStride() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_maxIndirectCommandsIndirectStride(this.segment()); }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxIndirectCommandsIndirectStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxIndirectCommandsIndirectStride.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxIndirectCommandsIndirectStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsIndirectStride(segment, 0L, value); }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsIndirectStride(this.segment(), index, value); return this; }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStride(@CType("uint32_t") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_maxIndirectCommandsIndirectStride(this.segment(), value); return this; }

    /// {@return `supportedIndirectCommandsInputModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsInputModeFlagsEXT") int get_supportedIndirectCommandsInputModes(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsInputModes.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsInputModes`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsInputModeFlagsEXT") int get_supportedIndirectCommandsInputModes(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsInputModes(segment, 0L); }
    /// {@return `supportedIndirectCommandsInputModes` at the given index}
    /// @param index the index
    public @CType("VkIndirectCommandsInputModeFlagsEXT") int supportedIndirectCommandsInputModesAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsInputModes(this.segment(), index); }
    /// {@return `supportedIndirectCommandsInputModes`}
    public @CType("VkIndirectCommandsInputModeFlagsEXT") int supportedIndirectCommandsInputModes() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsInputModes(this.segment()); }
    /// Sets `supportedIndirectCommandsInputModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedIndirectCommandsInputModes(MemorySegment segment, long index, @CType("VkIndirectCommandsInputModeFlagsEXT") int value) { VH_supportedIndirectCommandsInputModes.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsInputModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedIndirectCommandsInputModes(MemorySegment segment, @CType("VkIndirectCommandsInputModeFlagsEXT") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsInputModes(segment, 0L, value); }
    /// Sets `supportedIndirectCommandsInputModes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModesAt(long index, @CType("VkIndirectCommandsInputModeFlagsEXT") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsInputModes(this.segment(), index, value); return this; }
    /// Sets `supportedIndirectCommandsInputModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModes(@CType("VkIndirectCommandsInputModeFlagsEXT") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsInputModes(this.segment(), value); return this; }

    /// {@return `supportedIndirectCommandsShaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStages(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStages.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStages(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStages(segment, 0L); }
    /// {@return `supportedIndirectCommandsShaderStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStagesAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStages(this.segment(), index); }
    /// {@return `supportedIndirectCommandsShaderStages`}
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStages() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStages(this.segment()); }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_supportedIndirectCommandsShaderStages.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStages(segment, 0L, value); }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStages(this.segment(), index, value); return this; }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStages(this.segment(), value); return this; }

    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStagesPipelineBinding.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesPipelineBinding(segment, 0L); }
    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStagesPipelineBindingAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), index); }
    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding`}
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStagesPipelineBinding() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesPipelineBinding(this.segment()); }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_supportedIndirectCommandsShaderStagesPipelineBinding.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesPipelineBinding(segment, 0L, value); }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBindingAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), index, value); return this; }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBinding(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), value); return this; }

    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStagesShaderBinding.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesShaderBinding(segment, 0L); }
    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStagesShaderBindingAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), index); }
    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding`}
    public @CType("VkShaderStageFlags") int supportedIndirectCommandsShaderStagesShaderBinding() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_supportedIndirectCommandsShaderStagesShaderBinding(this.segment()); }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_supportedIndirectCommandsShaderStagesShaderBinding.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesShaderBinding(segment, 0L, value); }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBindingAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), index, value); return this; }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBinding(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), value); return this; }

    /// {@return `deviceGeneratedCommandsTransformFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedCommandsTransformFeedback(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommandsTransformFeedback.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommandsTransformFeedback`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedCommandsTransformFeedback(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsTransformFeedback(segment, 0L); }
    /// {@return `deviceGeneratedCommandsTransformFeedback` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceGeneratedCommandsTransformFeedbackAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsTransformFeedback(this.segment(), index); }
    /// {@return `deviceGeneratedCommandsTransformFeedback`}
    public @CType("VkBool32") int deviceGeneratedCommandsTransformFeedback() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsTransformFeedback(this.segment()); }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedCommandsTransformFeedback(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedCommandsTransformFeedback.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedCommandsTransformFeedback(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsTransformFeedback(segment, 0L, value); }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedbackAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsTransformFeedback(this.segment(), index, value); return this; }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedback(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsTransformFeedback(this.segment(), value); return this; }

    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommandsMultiDrawIndirectCount.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsMultiDrawIndirectCount(segment, 0L); }
    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount` at the given index}
    /// @param index the index
    public @CType("VkBool32") int deviceGeneratedCommandsMultiDrawIndirectCountAt(long index) { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), index); }
    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount`}
    public @CType("VkBool32") int deviceGeneratedCommandsMultiDrawIndirectCount() { return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.get_deviceGeneratedCommandsMultiDrawIndirectCount(this.segment()); }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_deviceGeneratedCommandsMultiDrawIndirectCount.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsMultiDrawIndirectCount(segment, 0L, value); }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCountAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), index, value); return this; }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCount(@CType("VkBool32") int value) { VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.set_deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), value); return this; }

}
