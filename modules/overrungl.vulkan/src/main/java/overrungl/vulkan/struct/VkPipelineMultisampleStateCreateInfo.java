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
/// ### rasterizationSamples
/// [VarHandle][#VH_rasterizationSamples] - [Getter][#rasterizationSamples()] - [Setter][#rasterizationSamples(int)]
/// ### sampleShadingEnable
/// [VarHandle][#VH_sampleShadingEnable] - [Getter][#sampleShadingEnable()] - [Setter][#sampleShadingEnable(int)]
/// ### minSampleShading
/// [VarHandle][#VH_minSampleShading] - [Getter][#minSampleShading()] - [Setter][#minSampleShading(float)]
/// ### pSampleMask
/// [VarHandle][#VH_pSampleMask] - [Getter][#pSampleMask()] - [Setter][#pSampleMask(java.lang.foreign.MemorySegment)]
/// ### alphaToCoverageEnable
/// [VarHandle][#VH_alphaToCoverageEnable] - [Getter][#alphaToCoverageEnable()] - [Setter][#alphaToCoverageEnable(int)]
/// ### alphaToOneEnable
/// [VarHandle][#VH_alphaToOneEnable] - [Getter][#alphaToOneEnable()] - [Setter][#alphaToOneEnable(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineMultisampleStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineMultisampleStateCreateFlags flags;
///     VkSampleCountFlagBits rasterizationSamples;
///     VkBool32 sampleShadingEnable;
///     float minSampleShading;
///     const VkSampleMask * pSampleMask;
///     VkBool32 alphaToCoverageEnable;
///     VkBool32 alphaToOneEnable;
/// } VkPipelineMultisampleStateCreateInfo;
/// ```
public final class VkPipelineMultisampleStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineMultisampleStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `rasterizationSamples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));
    /// The [VarHandle] of `sampleShadingEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleShadingEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleShadingEnable"));
    /// The [VarHandle] of `minSampleShading` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minSampleShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSampleShading"));
    /// The [VarHandle] of `pSampleMask` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSampleMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleMask"));
    /// The [VarHandle] of `alphaToCoverageEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaToCoverageEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToCoverageEnable"));
    /// The [VarHandle] of `alphaToOneEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_alphaToOneEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaToOneEnable"));

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineMultisampleStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineMultisampleStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineMultisampleStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineMultisampleStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineMultisampleStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineMultisampleStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineMultisampleStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineMultisampleStateCreateInfo`
    public static VkPipelineMultisampleStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineMultisampleStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineMultisampleStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineMultisampleStateCreateInfo`
    public static VkPipelineMultisampleStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineMultisampleStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineMultisampleStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineMultisampleStateCreateInfo`
    public VkPipelineMultisampleStateCreateInfo asSlice(long index) { return new VkPipelineMultisampleStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineMultisampleStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineMultisampleStateCreateInfo`
    public VkPipelineMultisampleStateCreateInfo asSlice(long index, long count) { return new VkPipelineMultisampleStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineMultisampleStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineMultisampleStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineMultisampleStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineMultisampleStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineMultisampleStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineMultisampleStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineMultisampleStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineMultisampleStateCreateFlags") int flagsAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineMultisampleStateCreateFlags") int flags() { return VkPipelineMultisampleStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineMultisampleStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineMultisampleStateCreateFlags") int value) { VkPipelineMultisampleStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo flagsAt(long index, @CType("VkPipelineMultisampleStateCreateFlags") int value) { VkPipelineMultisampleStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo flags(@CType("VkPipelineMultisampleStateCreateFlags") int value) { VkPipelineMultisampleStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `rasterizationSamples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment, long index) { return (int) VH_rasterizationSamples.get(segment, 0L, index); }
    /// {@return `rasterizationSamples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_rasterizationSamples(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_rasterizationSamples(segment, 0L); }
    /// {@return `rasterizationSamples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int rasterizationSamplesAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_rasterizationSamples(this.segment(), index); }
    /// {@return `rasterizationSamples`}
    public @CType("VkSampleCountFlagBits") int rasterizationSamples() { return VkPipelineMultisampleStateCreateInfo.get_rasterizationSamples(this.segment()); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_rasterizationSamples.set(segment, 0L, index, value); }
    /// Sets `rasterizationSamples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationSamples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkPipelineMultisampleStateCreateInfo.set_rasterizationSamples(segment, 0L, value); }
    /// Sets `rasterizationSamples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo rasterizationSamplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkPipelineMultisampleStateCreateInfo.set_rasterizationSamples(this.segment(), index, value); return this; }
    /// Sets `rasterizationSamples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(@CType("VkSampleCountFlagBits") int value) { VkPipelineMultisampleStateCreateInfo.set_rasterizationSamples(this.segment(), value); return this; }

    /// {@return `sampleShadingEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_sampleShadingEnable(MemorySegment segment, long index) { return (int) VH_sampleShadingEnable.get(segment, 0L, index); }
    /// {@return `sampleShadingEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_sampleShadingEnable(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_sampleShadingEnable(segment, 0L); }
    /// {@return `sampleShadingEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int sampleShadingEnableAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_sampleShadingEnable(this.segment(), index); }
    /// {@return `sampleShadingEnable`}
    public @CType("VkBool32") int sampleShadingEnable() { return VkPipelineMultisampleStateCreateInfo.get_sampleShadingEnable(this.segment()); }
    /// Sets `sampleShadingEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleShadingEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_sampleShadingEnable.set(segment, 0L, index, value); }
    /// Sets `sampleShadingEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleShadingEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_sampleShadingEnable(segment, 0L, value); }
    /// Sets `sampleShadingEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnableAt(long index, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_sampleShadingEnable(this.segment(), index, value); return this; }
    /// Sets `sampleShadingEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(@CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_sampleShadingEnable(this.segment(), value); return this; }

    /// {@return `minSampleShading` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minSampleShading(MemorySegment segment, long index) { return (float) VH_minSampleShading.get(segment, 0L, index); }
    /// {@return `minSampleShading`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minSampleShading(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_minSampleShading(segment, 0L); }
    /// {@return `minSampleShading` at the given index}
    /// @param index the index
    public @CType("float") float minSampleShadingAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_minSampleShading(this.segment(), index); }
    /// {@return `minSampleShading`}
    public @CType("float") float minSampleShading() { return VkPipelineMultisampleStateCreateInfo.get_minSampleShading(this.segment()); }
    /// Sets `minSampleShading` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSampleShading(MemorySegment segment, long index, @CType("float") float value) { VH_minSampleShading.set(segment, 0L, index, value); }
    /// Sets `minSampleShading` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSampleShading(MemorySegment segment, @CType("float") float value) { VkPipelineMultisampleStateCreateInfo.set_minSampleShading(segment, 0L, value); }
    /// Sets `minSampleShading` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo minSampleShadingAt(long index, @CType("float") float value) { VkPipelineMultisampleStateCreateInfo.set_minSampleShading(this.segment(), index, value); return this; }
    /// Sets `minSampleShading` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo minSampleShading(@CType("float") float value) { VkPipelineMultisampleStateCreateInfo.set_minSampleShading(this.segment(), value); return this; }

    /// {@return `pSampleMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSampleMask *") java.lang.foreign.MemorySegment get_pSampleMask(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSampleMask.get(segment, 0L, index); }
    /// {@return `pSampleMask`}
    /// @param segment the segment of the struct
    public static @CType("const VkSampleMask *") java.lang.foreign.MemorySegment get_pSampleMask(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_pSampleMask(segment, 0L); }
    /// {@return `pSampleMask` at the given index}
    /// @param index the index
    public @CType("const VkSampleMask *") java.lang.foreign.MemorySegment pSampleMaskAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_pSampleMask(this.segment(), index); }
    /// {@return `pSampleMask`}
    public @CType("const VkSampleMask *") java.lang.foreign.MemorySegment pSampleMask() { return VkPipelineMultisampleStateCreateInfo.get_pSampleMask(this.segment()); }
    /// Sets `pSampleMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSampleMask(MemorySegment segment, long index, @CType("const VkSampleMask *") java.lang.foreign.MemorySegment value) { VH_pSampleMask.set(segment, 0L, index, value); }
    /// Sets `pSampleMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSampleMask(MemorySegment segment, @CType("const VkSampleMask *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pSampleMask(segment, 0L, value); }
    /// Sets `pSampleMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo pSampleMaskAt(long index, @CType("const VkSampleMask *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pSampleMask(this.segment(), index, value); return this; }
    /// Sets `pSampleMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo pSampleMask(@CType("const VkSampleMask *") java.lang.foreign.MemorySegment value) { VkPipelineMultisampleStateCreateInfo.set_pSampleMask(this.segment(), value); return this; }

    /// {@return `alphaToCoverageEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_alphaToCoverageEnable(MemorySegment segment, long index) { return (int) VH_alphaToCoverageEnable.get(segment, 0L, index); }
    /// {@return `alphaToCoverageEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_alphaToCoverageEnable(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_alphaToCoverageEnable(segment, 0L); }
    /// {@return `alphaToCoverageEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int alphaToCoverageEnableAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_alphaToCoverageEnable(this.segment(), index); }
    /// {@return `alphaToCoverageEnable`}
    public @CType("VkBool32") int alphaToCoverageEnable() { return VkPipelineMultisampleStateCreateInfo.get_alphaToCoverageEnable(this.segment()); }
    /// Sets `alphaToCoverageEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaToCoverageEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_alphaToCoverageEnable.set(segment, 0L, index, value); }
    /// Sets `alphaToCoverageEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaToCoverageEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToCoverageEnable(segment, 0L, value); }
    /// Sets `alphaToCoverageEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnableAt(long index, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToCoverageEnable(this.segment(), index, value); return this; }
    /// Sets `alphaToCoverageEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(@CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToCoverageEnable(this.segment(), value); return this; }

    /// {@return `alphaToOneEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_alphaToOneEnable(MemorySegment segment, long index) { return (int) VH_alphaToOneEnable.get(segment, 0L, index); }
    /// {@return `alphaToOneEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_alphaToOneEnable(MemorySegment segment) { return VkPipelineMultisampleStateCreateInfo.get_alphaToOneEnable(segment, 0L); }
    /// {@return `alphaToOneEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int alphaToOneEnableAt(long index) { return VkPipelineMultisampleStateCreateInfo.get_alphaToOneEnable(this.segment(), index); }
    /// {@return `alphaToOneEnable`}
    public @CType("VkBool32") int alphaToOneEnable() { return VkPipelineMultisampleStateCreateInfo.get_alphaToOneEnable(this.segment()); }
    /// Sets `alphaToOneEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_alphaToOneEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_alphaToOneEnable.set(segment, 0L, index, value); }
    /// Sets `alphaToOneEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_alphaToOneEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToOneEnable(segment, 0L, value); }
    /// Sets `alphaToOneEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnableAt(long index, @CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToOneEnable(this.segment(), index, value); return this; }
    /// Sets `alphaToOneEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(@CType("VkBool32") int value) { VkPipelineMultisampleStateCreateInfo.set_alphaToOneEnable(this.segment(), value); return this; }

}
