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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxIndirectPipelineCount;
///     uint32_t maxIndirectShaderObjectCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsIndirectStride;
///     ((uint32_t) VkFlags) VkIndirectCommandsInputModeFlagsEXT supportedIndirectCommandsInputModes;
///     ((uint32_t) VkFlags) VkShaderStageFlags supportedIndirectCommandsShaderStages;
///     ((uint32_t) VkFlags) VkShaderStageFlags supportedIndirectCommandsShaderStagesPipelineBinding;
///     ((uint32_t) VkFlags) VkShaderStageFlags supportedIndirectCommandsShaderStagesShaderBinding;
///     (uint32_t) VkBool32 deviceGeneratedCommandsTransformFeedback;
///     (uint32_t) VkBool32 deviceGeneratedCommandsMultiDrawIndirectCount;
/// };
/// ```
public sealed class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `maxIndirectPipelineCount`.
    public static final long OFFSET_maxIndirectPipelineCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectPipelineCount"));
    /// The memory layout of `maxIndirectPipelineCount`.
    public static final MemoryLayout LAYOUT_maxIndirectPipelineCount = LAYOUT.select(PathElement.groupElement("maxIndirectPipelineCount"));
    /// The [VarHandle] of `maxIndirectPipelineCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectPipelineCount"));
    /// The byte offset of `maxIndirectShaderObjectCount`.
    public static final long OFFSET_maxIndirectShaderObjectCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectShaderObjectCount"));
    /// The memory layout of `maxIndirectShaderObjectCount`.
    public static final MemoryLayout LAYOUT_maxIndirectShaderObjectCount = LAYOUT.select(PathElement.groupElement("maxIndirectShaderObjectCount"));
    /// The [VarHandle] of `maxIndirectShaderObjectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectShaderObjectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectShaderObjectCount"));
    /// The byte offset of `maxIndirectSequenceCount`.
    public static final long OFFSET_maxIndirectSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The memory layout of `maxIndirectSequenceCount`.
    public static final MemoryLayout LAYOUT_maxIndirectSequenceCount = LAYOUT.select(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The [VarHandle] of `maxIndirectSequenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    /// The byte offset of `maxIndirectCommandsTokenCount`.
    public static final long OFFSET_maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The memory layout of `maxIndirectCommandsTokenCount`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The [VarHandle] of `maxIndirectCommandsTokenCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    /// The byte offset of `maxIndirectCommandsTokenOffset`.
    public static final long OFFSET_maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The memory layout of `maxIndirectCommandsTokenOffset`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenOffset = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The [VarHandle] of `maxIndirectCommandsTokenOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    /// The byte offset of `maxIndirectCommandsIndirectStride`.
    public static final long OFFSET_maxIndirectCommandsIndirectStride = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    /// The memory layout of `maxIndirectCommandsIndirectStride`.
    public static final MemoryLayout LAYOUT_maxIndirectCommandsIndirectStride = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    /// The [VarHandle] of `maxIndirectCommandsIndirectStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIndirectCommandsIndirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsIndirectStride"));
    /// The byte offset of `supportedIndirectCommandsInputModes`.
    public static final long OFFSET_supportedIndirectCommandsInputModes = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    /// The memory layout of `supportedIndirectCommandsInputModes`.
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsInputModes = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    /// The [VarHandle] of `supportedIndirectCommandsInputModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedIndirectCommandsInputModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsInputModes"));
    /// The byte offset of `supportedIndirectCommandsShaderStages`.
    public static final long OFFSET_supportedIndirectCommandsShaderStages = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    /// The memory layout of `supportedIndirectCommandsShaderStages`.
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStages = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStages"));
    /// The byte offset of `supportedIndirectCommandsShaderStagesPipelineBinding`.
    public static final long OFFSET_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    /// The memory layout of `supportedIndirectCommandsShaderStagesPipelineBinding`.
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStagesPipelineBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesPipelineBinding"));
    /// The byte offset of `supportedIndirectCommandsShaderStagesShaderBinding`.
    public static final long OFFSET_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.byteOffset(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    /// The memory layout of `supportedIndirectCommandsShaderStagesShaderBinding`.
    public static final MemoryLayout LAYOUT_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.select(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    /// The [VarHandle] of `supportedIndirectCommandsShaderStagesShaderBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedIndirectCommandsShaderStagesShaderBinding"));
    /// The byte offset of `deviceGeneratedCommandsTransformFeedback`.
    public static final long OFFSET_deviceGeneratedCommandsTransformFeedback = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    /// The memory layout of `deviceGeneratedCommandsTransformFeedback`.
    public static final MemoryLayout LAYOUT_deviceGeneratedCommandsTransformFeedback = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    /// The [VarHandle] of `deviceGeneratedCommandsTransformFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedCommandsTransformFeedback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsTransformFeedback"));
    /// The byte offset of `deviceGeneratedCommandsMultiDrawIndirectCount`.
    public static final long OFFSET_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
    /// The memory layout of `deviceGeneratedCommandsMultiDrawIndirectCount`.
    public static final MemoryLayout LAYOUT_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));
    /// The [VarHandle] of `deviceGeneratedCommandsMultiDrawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommandsMultiDrawIndirectCount"));

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectPipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectPipelineCount(MemorySegment segment, long index) { return (int) VH_maxIndirectPipelineCount.get(segment, 0L, index); }
    /// {@return `maxIndirectPipelineCount`}
    public int maxIndirectPipelineCount() { return maxIndirectPipelineCount(this.segment(), 0L); }
    /// Sets `maxIndirectPipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectPipelineCount(MemorySegment segment, long index, int value) { VH_maxIndirectPipelineCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectPipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectPipelineCount(int value) { maxIndirectPipelineCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectShaderObjectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectShaderObjectCount(MemorySegment segment, long index) { return (int) VH_maxIndirectShaderObjectCount.get(segment, 0L, index); }
    /// {@return `maxIndirectShaderObjectCount`}
    public int maxIndirectShaderObjectCount() { return maxIndirectShaderObjectCount(this.segment(), 0L); }
    /// Sets `maxIndirectShaderObjectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectShaderObjectCount(MemorySegment segment, long index, int value) { VH_maxIndirectShaderObjectCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectShaderObjectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectShaderObjectCount(int value) { maxIndirectShaderObjectCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectSequenceCount(MemorySegment segment, long index) { return (int) VH_maxIndirectSequenceCount.get(segment, 0L, index); }
    /// {@return `maxIndirectSequenceCount`}
    public int maxIndirectSequenceCount() { return maxIndirectSequenceCount(this.segment(), 0L); }
    /// Sets `maxIndirectSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectSequenceCount(MemorySegment segment, long index, int value) { VH_maxIndirectSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectSequenceCount(int value) { maxIndirectSequenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsTokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsTokenCount(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenCount.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenCount`}
    public int maxIndirectCommandsTokenCount() { return maxIndirectCommandsTokenCount(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsTokenCount(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsTokenCount.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenCount(int value) { maxIndirectCommandsTokenCount(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsTokenOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsTokenOffset(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsTokenOffset`}
    public int maxIndirectCommandsTokenOffset() { return maxIndirectCommandsTokenOffset(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsTokenOffset(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsTokenOffset.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsTokenOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsTokenOffset(int value) { maxIndirectCommandsTokenOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxIndirectCommandsIndirectStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIndirectCommandsIndirectStride(MemorySegment segment, long index) { return (int) VH_maxIndirectCommandsIndirectStride.get(segment, 0L, index); }
    /// {@return `maxIndirectCommandsIndirectStride`}
    public int maxIndirectCommandsIndirectStride() { return maxIndirectCommandsIndirectStride(this.segment(), 0L); }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIndirectCommandsIndirectStride(MemorySegment segment, long index, int value) { VH_maxIndirectCommandsIndirectStride.set(segment, 0L, index, value); }
    /// Sets `maxIndirectCommandsIndirectStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT maxIndirectCommandsIndirectStride(int value) { maxIndirectCommandsIndirectStride(this.segment(), 0L, value); return this; }

    /// {@return `supportedIndirectCommandsInputModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedIndirectCommandsInputModes(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsInputModes.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsInputModes`}
    public int supportedIndirectCommandsInputModes() { return supportedIndirectCommandsInputModes(this.segment(), 0L); }
    /// Sets `supportedIndirectCommandsInputModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedIndirectCommandsInputModes(MemorySegment segment, long index, int value) { VH_supportedIndirectCommandsInputModes.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsInputModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsInputModes(int value) { supportedIndirectCommandsInputModes(this.segment(), 0L, value); return this; }

    /// {@return `supportedIndirectCommandsShaderStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedIndirectCommandsShaderStages(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStages.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStages`}
    public int supportedIndirectCommandsShaderStages() { return supportedIndirectCommandsShaderStages(this.segment(), 0L); }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedIndirectCommandsShaderStages(MemorySegment segment, long index, int value) { VH_supportedIndirectCommandsShaderStages.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStages(int value) { supportedIndirectCommandsShaderStages(this.segment(), 0L, value); return this; }

    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStagesPipelineBinding.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding`}
    public int supportedIndirectCommandsShaderStagesPipelineBinding() { return supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), 0L); }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedIndirectCommandsShaderStagesPipelineBinding(MemorySegment segment, long index, int value) { VH_supportedIndirectCommandsShaderStagesPipelineBinding.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesPipelineBinding(int value) { supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), 0L, value); return this; }

    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment, long index) { return (int) VH_supportedIndirectCommandsShaderStagesShaderBinding.get(segment, 0L, index); }
    /// {@return `supportedIndirectCommandsShaderStagesShaderBinding`}
    public int supportedIndirectCommandsShaderStagesShaderBinding() { return supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), 0L); }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedIndirectCommandsShaderStagesShaderBinding(MemorySegment segment, long index, int value) { VH_supportedIndirectCommandsShaderStagesShaderBinding.set(segment, 0L, index, value); }
    /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT supportedIndirectCommandsShaderStagesShaderBinding(int value) { supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedCommandsTransformFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedCommandsTransformFeedback(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommandsTransformFeedback.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommandsTransformFeedback`}
    public int deviceGeneratedCommandsTransformFeedback() { return deviceGeneratedCommandsTransformFeedback(this.segment(), 0L); }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedCommandsTransformFeedback(MemorySegment segment, long index, int value) { VH_deviceGeneratedCommandsTransformFeedback.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsTransformFeedback(int value) { deviceGeneratedCommandsTransformFeedback(this.segment(), 0L, value); return this; }

    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment, long index) { return (int) VH_deviceGeneratedCommandsMultiDrawIndirectCount.get(segment, 0L, index); }
    /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount`}
    public int deviceGeneratedCommandsMultiDrawIndirectCount() { return deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), 0L); }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceGeneratedCommandsMultiDrawIndirectCount(MemorySegment segment, long index, int value) { VH_deviceGeneratedCommandsMultiDrawIndirectCount.set(segment, 0L, index, value); }
    /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT deviceGeneratedCommandsMultiDrawIndirectCount(int value) { deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT`
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

        /// {@return `maxIndirectPipelineCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectPipelineCountAt(long index) { return maxIndirectPipelineCount(this.segment(), index); }
        /// Sets `maxIndirectPipelineCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectPipelineCountAt(long index, int value) { maxIndirectPipelineCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectShaderObjectCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectShaderObjectCountAt(long index) { return maxIndirectShaderObjectCount(this.segment(), index); }
        /// Sets `maxIndirectShaderObjectCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectShaderObjectCountAt(long index, int value) { maxIndirectShaderObjectCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectSequenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectSequenceCountAt(long index) { return maxIndirectSequenceCount(this.segment(), index); }
        /// Sets `maxIndirectSequenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectSequenceCountAt(long index, int value) { maxIndirectSequenceCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsTokenCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectCommandsTokenCountAt(long index) { return maxIndirectCommandsTokenCount(this.segment(), index); }
        /// Sets `maxIndirectCommandsTokenCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsTokenCountAt(long index, int value) { maxIndirectCommandsTokenCount(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsTokenOffset` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectCommandsTokenOffsetAt(long index) { return maxIndirectCommandsTokenOffset(this.segment(), index); }
        /// Sets `maxIndirectCommandsTokenOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsTokenOffsetAt(long index, int value) { maxIndirectCommandsTokenOffset(this.segment(), index, value); return this; }

        /// {@return `maxIndirectCommandsIndirectStride` at the given index}
        /// @param index the index of the struct buffer
        public int maxIndirectCommandsIndirectStrideAt(long index) { return maxIndirectCommandsIndirectStride(this.segment(), index); }
        /// Sets `maxIndirectCommandsIndirectStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxIndirectCommandsIndirectStrideAt(long index, int value) { maxIndirectCommandsIndirectStride(this.segment(), index, value); return this; }

        /// {@return `supportedIndirectCommandsInputModes` at the given index}
        /// @param index the index of the struct buffer
        public int supportedIndirectCommandsInputModesAt(long index) { return supportedIndirectCommandsInputModes(this.segment(), index); }
        /// Sets `supportedIndirectCommandsInputModes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedIndirectCommandsInputModesAt(long index, int value) { supportedIndirectCommandsInputModes(this.segment(), index, value); return this; }

        /// {@return `supportedIndirectCommandsShaderStages` at the given index}
        /// @param index the index of the struct buffer
        public int supportedIndirectCommandsShaderStagesAt(long index) { return supportedIndirectCommandsShaderStages(this.segment(), index); }
        /// Sets `supportedIndirectCommandsShaderStages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedIndirectCommandsShaderStagesAt(long index, int value) { supportedIndirectCommandsShaderStages(this.segment(), index, value); return this; }

        /// {@return `supportedIndirectCommandsShaderStagesPipelineBinding` at the given index}
        /// @param index the index of the struct buffer
        public int supportedIndirectCommandsShaderStagesPipelineBindingAt(long index) { return supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), index); }
        /// Sets `supportedIndirectCommandsShaderStagesPipelineBinding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedIndirectCommandsShaderStagesPipelineBindingAt(long index, int value) { supportedIndirectCommandsShaderStagesPipelineBinding(this.segment(), index, value); return this; }

        /// {@return `supportedIndirectCommandsShaderStagesShaderBinding` at the given index}
        /// @param index the index of the struct buffer
        public int supportedIndirectCommandsShaderStagesShaderBindingAt(long index) { return supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), index); }
        /// Sets `supportedIndirectCommandsShaderStagesShaderBinding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedIndirectCommandsShaderStagesShaderBindingAt(long index, int value) { supportedIndirectCommandsShaderStagesShaderBinding(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedCommandsTransformFeedback` at the given index}
        /// @param index the index of the struct buffer
        public int deviceGeneratedCommandsTransformFeedbackAt(long index) { return deviceGeneratedCommandsTransformFeedback(this.segment(), index); }
        /// Sets `deviceGeneratedCommandsTransformFeedback` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedCommandsTransformFeedbackAt(long index, int value) { deviceGeneratedCommandsTransformFeedback(this.segment(), index, value); return this; }

        /// {@return `deviceGeneratedCommandsMultiDrawIndirectCount` at the given index}
        /// @param index the index of the struct buffer
        public int deviceGeneratedCommandsMultiDrawIndirectCountAt(long index) { return deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), index); }
        /// Sets `deviceGeneratedCommandsMultiDrawIndirectCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer deviceGeneratedCommandsMultiDrawIndirectCountAt(long index, int value) { deviceGeneratedCommandsMultiDrawIndirectCount(this.segment(), index, value); return this; }

    }
}
