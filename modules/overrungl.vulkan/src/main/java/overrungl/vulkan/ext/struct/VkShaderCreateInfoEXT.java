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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### stage
/// [VarHandle][#VH_stage] - [Getter][#stage()] - [Setter][#stage(int)]
/// ### nextStage
/// [VarHandle][#VH_nextStage] - [Getter][#nextStage()] - [Setter][#nextStage(int)]
/// ### codeType
/// [VarHandle][#VH_codeType] - [Getter][#codeType()] - [Setter][#codeType(int)]
/// ### codeSize
/// [VarHandle][#VH_codeSize] - [Getter][#codeSize()] - [Setter][#codeSize(long)]
/// ### pCode
/// [VarHandle][#VH_pCode] - [Getter][#pCode()] - [Setter][#pCode(java.lang.foreign.MemorySegment)]
/// ### pName
/// [VarHandle][#VH_pName] - [Getter][#pName()] - [Setter][#pName(java.lang.foreign.MemorySegment)]
/// ### setLayoutCount
/// [VarHandle][#VH_setLayoutCount] - [Getter][#setLayoutCount()] - [Setter][#setLayoutCount(int)]
/// ### pSetLayouts
/// [VarHandle][#VH_pSetLayouts] - [Getter][#pSetLayouts()] - [Setter][#pSetLayouts(java.lang.foreign.MemorySegment)]
/// ### pushConstantRangeCount
/// [VarHandle][#VH_pushConstantRangeCount] - [Getter][#pushConstantRangeCount()] - [Setter][#pushConstantRangeCount(int)]
/// ### pPushConstantRanges
/// [VarHandle][#VH_pPushConstantRanges] - [Getter][#pPushConstantRanges()] - [Setter][#pPushConstantRanges(java.lang.foreign.MemorySegment)]
/// ### pSpecializationInfo
/// [VarHandle][#VH_pSpecializationInfo] - [Getter][#pSpecializationInfo()] - [Setter][#pSpecializationInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkShaderCreateFlagsEXT flags;
///     VkShaderStageFlagBits stage;
///     VkShaderStageFlags nextStage;
///     VkShaderCodeTypeEXT codeType;
///     size_t codeSize;
///     const void * pCode;
///     const char * pName;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout * pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange * pPushConstantRanges;
///     const VkSpecializationInfo * pSpecializationInfo;
/// } VkShaderCreateInfoEXT;
/// ```
public sealed class VkShaderCreateInfoEXT extends Struct {
    /// The struct layout of `VkShaderCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_INT.withName("nextStage"),
        ValueLayout.JAVA_INT.withName("codeType"),
        ValueLayout.JAVA_LONG.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The [VarHandle] of `nextStage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nextStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nextStage"));
    /// The [VarHandle] of `codeType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_codeType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeType"));
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `pCode` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The [VarHandle] of `setLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));
    /// The [VarHandle] of `pushConstantRangeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    /// The [VarHandle] of `pPushConstantRanges` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));
    /// The [VarHandle] of `pSpecializationInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkShaderCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkShaderCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderCreateInfoEXT`
    public static VkShaderCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkShaderCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkShaderCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderCreateInfoEXT`
    public static VkShaderCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkShaderCreateFlagsEXT") int flags, @CType("VkShaderStageFlagBits") int stage, @CType("VkShaderStageFlags") int nextStage, @CType("VkShaderCodeTypeEXT") int codeType, @CType("size_t") long codeSize, @CType("const void *") java.lang.foreign.MemorySegment pCode, @CType("const char *") java.lang.foreign.MemorySegment pName, @CType("uint32_t") int setLayoutCount, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts, @CType("uint32_t") int pushConstantRangeCount, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRanges, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment pSpecializationInfo) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).stage(stage).nextStage(nextStage).codeType(codeType).codeSize(codeSize).pCode(pCode).pName(pName).setLayoutCount(setLayoutCount).pSetLayouts(pSetLayouts).pushConstantRangeCount(pushConstantRangeCount).pPushConstantRanges(pPushConstantRanges).pSpecializationInfo(pSpecializationInfo); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderCreateInfoEXT copyFrom(VkShaderCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkShaderCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkShaderCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkShaderCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT sType(@CType("VkStructureType") int value) { VkShaderCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkShaderCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkShaderCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkShaderCreateFlagsEXT") int flags() { return VkShaderCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkShaderCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkShaderCreateFlagsEXT") int value) { VkShaderCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT flags(@CType("VkShaderCreateFlagsEXT") int value) { VkShaderCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlagBits") int get_stage(MemorySegment segment, long index) { return (int) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlagBits") int get_stage(MemorySegment segment) { return VkShaderCreateInfoEXT.get_stage(segment, 0L); }
    /// {@return `stage`}
    public @CType("VkShaderStageFlagBits") int stage() { return VkShaderCreateInfoEXT.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkShaderStageFlagBits") int value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkShaderStageFlagBits") int value) { VkShaderCreateInfoEXT.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT stage(@CType("VkShaderStageFlagBits") int value) { VkShaderCreateInfoEXT.set_stage(this.segment(), value); return this; }

    /// {@return `nextStage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_nextStage(MemorySegment segment, long index) { return (int) VH_nextStage.get(segment, 0L, index); }
    /// {@return `nextStage`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_nextStage(MemorySegment segment) { return VkShaderCreateInfoEXT.get_nextStage(segment, 0L); }
    /// {@return `nextStage`}
    public @CType("VkShaderStageFlags") int nextStage() { return VkShaderCreateInfoEXT.get_nextStage(this.segment()); }
    /// Sets `nextStage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nextStage(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_nextStage.set(segment, 0L, index, value); }
    /// Sets `nextStage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nextStage(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkShaderCreateInfoEXT.set_nextStage(segment, 0L, value); }
    /// Sets `nextStage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT nextStage(@CType("VkShaderStageFlags") int value) { VkShaderCreateInfoEXT.set_nextStage(this.segment(), value); return this; }

    /// {@return `codeType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderCodeTypeEXT") int get_codeType(MemorySegment segment, long index) { return (int) VH_codeType.get(segment, 0L, index); }
    /// {@return `codeType`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderCodeTypeEXT") int get_codeType(MemorySegment segment) { return VkShaderCreateInfoEXT.get_codeType(segment, 0L); }
    /// {@return `codeType`}
    public @CType("VkShaderCodeTypeEXT") int codeType() { return VkShaderCreateInfoEXT.get_codeType(this.segment()); }
    /// Sets `codeType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codeType(MemorySegment segment, long index, @CType("VkShaderCodeTypeEXT") int value) { VH_codeType.set(segment, 0L, index, value); }
    /// Sets `codeType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codeType(MemorySegment segment, @CType("VkShaderCodeTypeEXT") int value) { VkShaderCreateInfoEXT.set_codeType(segment, 0L, value); }
    /// Sets `codeType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeType(@CType("VkShaderCodeTypeEXT") int value) { VkShaderCreateInfoEXT.set_codeType(this.segment(), value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_codeSize(MemorySegment segment, long index) { return (long) VH_codeSize.get(segment, 0L, index); }
    /// {@return `codeSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_codeSize(MemorySegment segment) { return VkShaderCreateInfoEXT.get_codeSize(segment, 0L); }
    /// {@return `codeSize`}
    public @CType("size_t") long codeSize() { return VkShaderCreateInfoEXT.get_codeSize(this.segment()); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_codeSize.set(segment, 0L, index, value); }
    /// Sets `codeSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codeSize(MemorySegment segment, @CType("size_t") long value) { VkShaderCreateInfoEXT.set_codeSize(segment, 0L, value); }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeSize(@CType("size_t") long value) { VkShaderCreateInfoEXT.set_codeSize(this.segment(), value); return this; }

    /// {@return `pCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pCode(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCode.get(segment, 0L, index); }
    /// {@return `pCode`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pCode(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pCode(segment, 0L); }
    /// {@return `pCode`}
    public @CType("const void *") java.lang.foreign.MemorySegment pCode() { return VkShaderCreateInfoEXT.get_pCode(this.segment()); }
    /// Sets `pCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCode(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pCode.set(segment, 0L, index, value); }
    /// Sets `pCode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCode(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pCode(segment, 0L, value); }
    /// Sets `pCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pCode(@CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pCode(this.segment(), value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pName(segment, 0L); }
    /// {@return `pName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pName() { return VkShaderCreateInfoEXT.get_pName(this.segment()); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pName(segment, 0L, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pName(this.segment(), value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment, long index) { return (int) VH_setLayoutCount.get(segment, 0L, index); }
    /// {@return `setLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_setLayoutCount(MemorySegment segment) { return VkShaderCreateInfoEXT.get_setLayoutCount(segment, 0L); }
    /// {@return `setLayoutCount`}
    public @CType("uint32_t") int setLayoutCount() { return VkShaderCreateInfoEXT.get_setLayoutCount(this.segment()); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_setLayoutCount.set(segment, 0L, index, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_setLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_setLayoutCount(segment, 0L, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT setLayoutCount(@CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_setLayoutCount(this.segment(), value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment get_pSetLayouts(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pSetLayouts(segment, 0L); }
    /// {@return `pSetLayouts`}
    public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayouts() { return VkShaderCreateInfoEXT.get_pSetLayouts(this.segment()); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSetLayouts(MemorySegment segment, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSetLayouts(segment, 0L, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSetLayouts(@CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSetLayouts(this.segment(), value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment, long index) { return (int) VH_pushConstantRangeCount.get(segment, 0L, index); }
    /// {@return `pushConstantRangeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pushConstantRangeCount(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pushConstantRangeCount(segment, 0L); }
    /// {@return `pushConstantRangeCount`}
    public @CType("uint32_t") int pushConstantRangeCount() { return VkShaderCreateInfoEXT.get_pushConstantRangeCount(this.segment()); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pushConstantRangeCount.set(segment, 0L, index, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pushConstantRangeCount(MemorySegment segment, @CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_pushConstantRangeCount(segment, 0L, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pushConstantRangeCount(@CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_pushConstantRangeCount(this.segment(), value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPushConstantRanges.get(segment, 0L, index); }
    /// {@return `pPushConstantRanges`}
    /// @param segment the segment of the struct
    public static @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment get_pPushConstantRanges(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pPushConstantRanges(segment, 0L); }
    /// {@return `pPushConstantRanges`}
    public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRanges() { return VkShaderCreateInfoEXT.get_pPushConstantRanges(this.segment()); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VH_pPushConstantRanges.set(segment, 0L, index, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPushConstantRanges(MemorySegment segment, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pPushConstantRanges(segment, 0L, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pPushConstantRanges(@CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pPushConstantRanges(this.segment(), value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment get_pSpecializationInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSpecializationInfo.get(segment, 0L, index); }
    /// {@return `pSpecializationInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment get_pSpecializationInfo(MemorySegment segment) { return VkShaderCreateInfoEXT.get_pSpecializationInfo(segment, 0L); }
    /// {@return `pSpecializationInfo`}
    public @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment pSpecializationInfo() { return VkShaderCreateInfoEXT.get_pSpecializationInfo(this.segment()); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSpecializationInfo(MemorySegment segment, long index, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VH_pSpecializationInfo.set(segment, 0L, index, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSpecializationInfo(MemorySegment segment, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSpecializationInfo(segment, 0L, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSpecializationInfo(@CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSpecializationInfo(this.segment(), value); return this; }

    /// A buffer of [VkShaderCreateInfoEXT].
    public static final class Buffer extends VkShaderCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkShaderCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkShaderCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkShaderCreateInfoEXT`
        public VkShaderCreateInfoEXT asSlice(long index) { return new VkShaderCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkShaderCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkShaderCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkShaderCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkShaderCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkShaderCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkShaderCreateFlagsEXT") int flagsAt(long index) { return VkShaderCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkShaderCreateFlagsEXT") int value) { VkShaderCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `stage` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlagBits") int stageAt(long index) { return VkShaderCreateInfoEXT.get_stage(this.segment(), index); }
        /// Sets `stage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageAt(long index, @CType("VkShaderStageFlagBits") int value) { VkShaderCreateInfoEXT.set_stage(this.segment(), index, value); return this; }

        /// {@return `nextStage` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int nextStageAt(long index) { return VkShaderCreateInfoEXT.get_nextStage(this.segment(), index); }
        /// Sets `nextStage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nextStageAt(long index, @CType("VkShaderStageFlags") int value) { VkShaderCreateInfoEXT.set_nextStage(this.segment(), index, value); return this; }

        /// {@return `codeType` at the given index}
        /// @param index the index
        public @CType("VkShaderCodeTypeEXT") int codeTypeAt(long index) { return VkShaderCreateInfoEXT.get_codeType(this.segment(), index); }
        /// Sets `codeType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer codeTypeAt(long index, @CType("VkShaderCodeTypeEXT") int value) { VkShaderCreateInfoEXT.set_codeType(this.segment(), index, value); return this; }

        /// {@return `codeSize` at the given index}
        /// @param index the index
        public @CType("size_t") long codeSizeAt(long index) { return VkShaderCreateInfoEXT.get_codeSize(this.segment(), index); }
        /// Sets `codeSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer codeSizeAt(long index, @CType("size_t") long value) { VkShaderCreateInfoEXT.set_codeSize(this.segment(), index, value); return this; }

        /// {@return `pCode` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pCodeAt(long index) { return VkShaderCreateInfoEXT.get_pCode(this.segment(), index); }
        /// Sets `pCode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCodeAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pCode(this.segment(), index, value); return this; }

        /// {@return `pName` at the given index}
        /// @param index the index
        public @CType("const char *") java.lang.foreign.MemorySegment pNameAt(long index) { return VkShaderCreateInfoEXT.get_pName(this.segment(), index); }
        /// Sets `pName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pName(this.segment(), index, value); return this; }

        /// {@return `setLayoutCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int setLayoutCountAt(long index) { return VkShaderCreateInfoEXT.get_setLayoutCount(this.segment(), index); }
        /// Sets `setLayoutCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer setLayoutCountAt(long index, @CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_setLayoutCount(this.segment(), index, value); return this; }

        /// {@return `pSetLayouts` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment pSetLayoutsAt(long index) { return VkShaderCreateInfoEXT.get_pSetLayouts(this.segment(), index); }
        /// Sets `pSetLayouts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSetLayoutsAt(long index, @CType("const VkDescriptorSetLayout *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSetLayouts(this.segment(), index, value); return this; }

        /// {@return `pushConstantRangeCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int pushConstantRangeCountAt(long index) { return VkShaderCreateInfoEXT.get_pushConstantRangeCount(this.segment(), index); }
        /// Sets `pushConstantRangeCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pushConstantRangeCountAt(long index, @CType("uint32_t") int value) { VkShaderCreateInfoEXT.set_pushConstantRangeCount(this.segment(), index, value); return this; }

        /// {@return `pPushConstantRanges` at the given index}
        /// @param index the index
        public @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment pPushConstantRangesAt(long index) { return VkShaderCreateInfoEXT.get_pPushConstantRanges(this.segment(), index); }
        /// Sets `pPushConstantRanges` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPushConstantRangesAt(long index, @CType("const VkPushConstantRange *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pPushConstantRanges(this.segment(), index, value); return this; }

        /// {@return `pSpecializationInfo` at the given index}
        /// @param index the index
        public @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment pSpecializationInfoAt(long index) { return VkShaderCreateInfoEXT.get_pSpecializationInfo(this.segment(), index); }
        /// Sets `pSpecializationInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSpecializationInfoAt(long index, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkShaderCreateInfoEXT.set_pSpecializationInfo(this.segment(), index, value); return this; }

    }
}
