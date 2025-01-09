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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### stage
/// [VarHandle][#VH_stage] - [Getter][#stage()] - [Setter][#stage(int)]
/// ### module
/// [VarHandle][#VH_module] - [Getter][#module()] - [Setter][#module(java.lang.foreign.MemorySegment)]
/// ### pName
/// [VarHandle][#VH_pName] - [Getter][#pName()] - [Setter][#pName(java.lang.foreign.MemorySegment)]
/// ### pSpecializationInfo
/// [VarHandle][#VH_pSpecializationInfo] - [Getter][#pSpecializationInfo()] - [Setter][#pSpecializationInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineShaderStageCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineShaderStageCreateFlags flags;
///     VkShaderStageFlagBits stage;
///     VkShaderModule module;
///     const char * pName;
///     const VkSpecializationInfo * pSpecializationInfo;
/// } VkPipelineShaderStageCreateInfo;
/// ```
public final class VkPipelineShaderStageCreateInfo extends Struct {
    /// The struct layout of `VkPipelineShaderStageCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.ADDRESS.withName("module"),
        ValueLayout.ADDRESS.withName("pName"),
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
    /// The [VarHandle] of `module` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pSpecializationInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineShaderStageCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineShaderStageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageCreateInfo`
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineShaderStageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageCreateInfo`
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineShaderStageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineShaderStageCreateInfo`
    public VkPipelineShaderStageCreateInfo asSlice(long index) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineShaderStageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineShaderStageCreateInfo`
    public VkPipelineShaderStageCreateInfo asSlice(long index, long count) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineShaderStageCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineShaderStageCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineShaderStageCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineShaderStageCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineShaderStageCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineShaderStageCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineShaderStageCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineShaderStageCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineShaderStageCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineShaderStageCreateFlags") int flagsAt(long index) { return VkPipelineShaderStageCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineShaderStageCreateFlags") int flags() { return VkPipelineShaderStageCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineShaderStageCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineShaderStageCreateFlags") int value) { VkPipelineShaderStageCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo flagsAt(long index, @CType("VkPipelineShaderStageCreateFlags") int value) { VkPipelineShaderStageCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo flags(@CType("VkPipelineShaderStageCreateFlags") int value) { VkPipelineShaderStageCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlagBits") int get_stage(MemorySegment segment, long index) { return (int) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlagBits") int get_stage(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_stage(segment, 0L); }
    /// {@return `stage` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlagBits") int stageAt(long index) { return VkPipelineShaderStageCreateInfo.get_stage(this.segment(), index); }
    /// {@return `stage`}
    public @CType("VkShaderStageFlagBits") int stage() { return VkPipelineShaderStageCreateInfo.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkShaderStageFlagBits") int value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkShaderStageFlagBits") int value) { VkPipelineShaderStageCreateInfo.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo stageAt(long index, @CType("VkShaderStageFlagBits") int value) { VkPipelineShaderStageCreateInfo.set_stage(this.segment(), index, value); return this; }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo stage(@CType("VkShaderStageFlagBits") int value) { VkPipelineShaderStageCreateInfo.set_stage(this.segment(), value); return this; }

    /// {@return `module` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderModule") java.lang.foreign.MemorySegment get_module(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_module.get(segment, 0L, index); }
    /// {@return `module`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderModule") java.lang.foreign.MemorySegment get_module(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_module(segment, 0L); }
    /// {@return `module` at the given index}
    /// @param index the index
    public @CType("VkShaderModule") java.lang.foreign.MemorySegment moduleAt(long index) { return VkPipelineShaderStageCreateInfo.get_module(this.segment(), index); }
    /// {@return `module`}
    public @CType("VkShaderModule") java.lang.foreign.MemorySegment module() { return VkPipelineShaderStageCreateInfo.get_module(this.segment()); }
    /// Sets `module` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_module(MemorySegment segment, long index, @CType("VkShaderModule") java.lang.foreign.MemorySegment value) { VH_module.set(segment, 0L, index, value); }
    /// Sets `module` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_module(MemorySegment segment, @CType("VkShaderModule") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_module(segment, 0L, value); }
    /// Sets `module` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo moduleAt(long index, @CType("VkShaderModule") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_module(this.segment(), index, value); return this; }
    /// Sets `module` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo module(@CType("VkShaderModule") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_module(this.segment(), value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pName(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_pName(segment, 0L); }
    /// {@return `pName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pNameAt(long index) { return VkPipelineShaderStageCreateInfo.get_pName(this.segment(), index); }
    /// {@return `pName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pName() { return VkPipelineShaderStageCreateInfo.get_pName(this.segment()); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pName(segment, 0L, value); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pName(this.segment(), index, value); return this; }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pName(this.segment(), value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment get_pSpecializationInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSpecializationInfo.get(segment, 0L, index); }
    /// {@return `pSpecializationInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment get_pSpecializationInfo(MemorySegment segment) { return VkPipelineShaderStageCreateInfo.get_pSpecializationInfo(segment, 0L); }
    /// {@return `pSpecializationInfo` at the given index}
    /// @param index the index
    public @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment pSpecializationInfoAt(long index) { return VkPipelineShaderStageCreateInfo.get_pSpecializationInfo(this.segment(), index); }
    /// {@return `pSpecializationInfo`}
    public @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment pSpecializationInfo() { return VkPipelineShaderStageCreateInfo.get_pSpecializationInfo(this.segment()); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSpecializationInfo(MemorySegment segment, long index, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VH_pSpecializationInfo.set(segment, 0L, index, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSpecializationInfo(MemorySegment segment, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pSpecializationInfo(segment, 0L, value); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pSpecializationInfoAt(long index, @CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pSpecializationInfo(this.segment(), index, value); return this; }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(@CType("const VkSpecializationInfo *") java.lang.foreign.MemorySegment value) { VkPipelineShaderStageCreateInfo.set_pSpecializationInfo(this.segment(), value); return this; }

}
