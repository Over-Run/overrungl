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
/// ### depthClampEnable
/// [VarHandle][#VH_depthClampEnable] - [Getter][#depthClampEnable()] - [Setter][#depthClampEnable(int)]
/// ### rasterizerDiscardEnable
/// [VarHandle][#VH_rasterizerDiscardEnable] - [Getter][#rasterizerDiscardEnable()] - [Setter][#rasterizerDiscardEnable(int)]
/// ### polygonMode
/// [VarHandle][#VH_polygonMode] - [Getter][#polygonMode()] - [Setter][#polygonMode(int)]
/// ### cullMode
/// [VarHandle][#VH_cullMode] - [Getter][#cullMode()] - [Setter][#cullMode(int)]
/// ### frontFace
/// [VarHandle][#VH_frontFace] - [Getter][#frontFace()] - [Setter][#frontFace(int)]
/// ### depthBiasEnable
/// [VarHandle][#VH_depthBiasEnable] - [Getter][#depthBiasEnable()] - [Setter][#depthBiasEnable(int)]
/// ### depthBiasConstantFactor
/// [VarHandle][#VH_depthBiasConstantFactor] - [Getter][#depthBiasConstantFactor()] - [Setter][#depthBiasConstantFactor(float)]
/// ### depthBiasClamp
/// [VarHandle][#VH_depthBiasClamp] - [Getter][#depthBiasClamp()] - [Setter][#depthBiasClamp(float)]
/// ### depthBiasSlopeFactor
/// [VarHandle][#VH_depthBiasSlopeFactor] - [Getter][#depthBiasSlopeFactor()] - [Setter][#depthBiasSlopeFactor(float)]
/// ### lineWidth
/// [VarHandle][#VH_lineWidth] - [Getter][#lineWidth()] - [Setter][#lineWidth(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineRasterizationStateCreateFlags flags;
///     VkBool32 depthClampEnable;
///     VkBool32 rasterizerDiscardEnable;
///     VkPolygonMode polygonMode;
///     VkCullModeFlags cullMode;
///     VkFrontFace frontFace;
///     VkBool32 depthBiasEnable;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
///     float lineWidth;
/// } VkPipelineRasterizationStateCreateInfo;
/// ```
public final class VkPipelineRasterizationStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineRasterizationStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClampEnable"),
        ValueLayout.JAVA_INT.withName("rasterizerDiscardEnable"),
        ValueLayout.JAVA_INT.withName("polygonMode"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("depthBiasEnable"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor"),
        ValueLayout.JAVA_FLOAT.withName("lineWidth")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `depthClampEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthClampEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampEnable"));
    /// The [VarHandle] of `rasterizerDiscardEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizerDiscardEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizerDiscardEnable"));
    /// The [VarHandle] of `polygonMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_polygonMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonMode"));
    /// The [VarHandle] of `cullMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cullMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cullMode"));
    /// The [VarHandle] of `frontFace` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frontFace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frontFace"));
    /// The [VarHandle] of `depthBiasEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBiasEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasEnable"));
    /// The [VarHandle] of `depthBiasConstantFactor` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `depthBiasSlopeFactor` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));
    /// The [VarHandle] of `lineWidth` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_lineWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidth"));

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationStateCreateInfo`
    public static VkPipelineRasterizationStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationStateCreateInfo`
    public static VkPipelineRasterizationStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineRasterizationStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRasterizationStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRasterizationStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineRasterizationStateCreateFlags") int flagsAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineRasterizationStateCreateFlags") int flags() { return VkPipelineRasterizationStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineRasterizationStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineRasterizationStateCreateFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo flagsAt(long index, @CType("VkPipelineRasterizationStateCreateFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo flags(@CType("VkPipelineRasterizationStateCreateFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `depthClampEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthClampEnable(MemorySegment segment, long index) { return (int) VH_depthClampEnable.get(segment, 0L, index); }
    /// {@return `depthClampEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthClampEnable(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_depthClampEnable(segment, 0L); }
    /// {@return `depthClampEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthClampEnableAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_depthClampEnable(this.segment(), index); }
    /// {@return `depthClampEnable`}
    public @CType("VkBool32") int depthClampEnable() { return VkPipelineRasterizationStateCreateInfo.get_depthClampEnable(this.segment()); }
    /// Sets `depthClampEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthClampEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthClampEnable.set(segment, 0L, index, value); }
    /// Sets `depthClampEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthClampEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthClampEnable(segment, 0L, value); }
    /// Sets `depthClampEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthClampEnableAt(long index, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthClampEnable(this.segment(), index, value); return this; }
    /// Sets `depthClampEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthClampEnable(@CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthClampEnable(this.segment(), value); return this; }

    /// {@return `rasterizerDiscardEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_rasterizerDiscardEnable(MemorySegment segment, long index) { return (int) VH_rasterizerDiscardEnable.get(segment, 0L, index); }
    /// {@return `rasterizerDiscardEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_rasterizerDiscardEnable(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_rasterizerDiscardEnable(segment, 0L); }
    /// {@return `rasterizerDiscardEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int rasterizerDiscardEnableAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_rasterizerDiscardEnable(this.segment(), index); }
    /// {@return `rasterizerDiscardEnable`}
    public @CType("VkBool32") int rasterizerDiscardEnable() { return VkPipelineRasterizationStateCreateInfo.get_rasterizerDiscardEnable(this.segment()); }
    /// Sets `rasterizerDiscardEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizerDiscardEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_rasterizerDiscardEnable.set(segment, 0L, index, value); }
    /// Sets `rasterizerDiscardEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizerDiscardEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_rasterizerDiscardEnable(segment, 0L, value); }
    /// Sets `rasterizerDiscardEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnableAt(long index, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_rasterizerDiscardEnable(this.segment(), index, value); return this; }
    /// Sets `rasterizerDiscardEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(@CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_rasterizerDiscardEnable(this.segment(), value); return this; }

    /// {@return `polygonMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPolygonMode") int get_polygonMode(MemorySegment segment, long index) { return (int) VH_polygonMode.get(segment, 0L, index); }
    /// {@return `polygonMode`}
    /// @param segment the segment of the struct
    public static @CType("VkPolygonMode") int get_polygonMode(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_polygonMode(segment, 0L); }
    /// {@return `polygonMode` at the given index}
    /// @param index the index
    public @CType("VkPolygonMode") int polygonModeAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_polygonMode(this.segment(), index); }
    /// {@return `polygonMode`}
    public @CType("VkPolygonMode") int polygonMode() { return VkPipelineRasterizationStateCreateInfo.get_polygonMode(this.segment()); }
    /// Sets `polygonMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_polygonMode(MemorySegment segment, long index, @CType("VkPolygonMode") int value) { VH_polygonMode.set(segment, 0L, index, value); }
    /// Sets `polygonMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_polygonMode(MemorySegment segment, @CType("VkPolygonMode") int value) { VkPipelineRasterizationStateCreateInfo.set_polygonMode(segment, 0L, value); }
    /// Sets `polygonMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo polygonModeAt(long index, @CType("VkPolygonMode") int value) { VkPipelineRasterizationStateCreateInfo.set_polygonMode(this.segment(), index, value); return this; }
    /// Sets `polygonMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo polygonMode(@CType("VkPolygonMode") int value) { VkPipelineRasterizationStateCreateInfo.set_polygonMode(this.segment(), value); return this; }

    /// {@return `cullMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCullModeFlags") int get_cullMode(MemorySegment segment, long index) { return (int) VH_cullMode.get(segment, 0L, index); }
    /// {@return `cullMode`}
    /// @param segment the segment of the struct
    public static @CType("VkCullModeFlags") int get_cullMode(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_cullMode(segment, 0L); }
    /// {@return `cullMode` at the given index}
    /// @param index the index
    public @CType("VkCullModeFlags") int cullModeAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_cullMode(this.segment(), index); }
    /// {@return `cullMode`}
    public @CType("VkCullModeFlags") int cullMode() { return VkPipelineRasterizationStateCreateInfo.get_cullMode(this.segment()); }
    /// Sets `cullMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cullMode(MemorySegment segment, long index, @CType("VkCullModeFlags") int value) { VH_cullMode.set(segment, 0L, index, value); }
    /// Sets `cullMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cullMode(MemorySegment segment, @CType("VkCullModeFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_cullMode(segment, 0L, value); }
    /// Sets `cullMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo cullModeAt(long index, @CType("VkCullModeFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_cullMode(this.segment(), index, value); return this; }
    /// Sets `cullMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo cullMode(@CType("VkCullModeFlags") int value) { VkPipelineRasterizationStateCreateInfo.set_cullMode(this.segment(), value); return this; }

    /// {@return `frontFace` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFrontFace") int get_frontFace(MemorySegment segment, long index) { return (int) VH_frontFace.get(segment, 0L, index); }
    /// {@return `frontFace`}
    /// @param segment the segment of the struct
    public static @CType("VkFrontFace") int get_frontFace(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_frontFace(segment, 0L); }
    /// {@return `frontFace` at the given index}
    /// @param index the index
    public @CType("VkFrontFace") int frontFaceAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_frontFace(this.segment(), index); }
    /// {@return `frontFace`}
    public @CType("VkFrontFace") int frontFace() { return VkPipelineRasterizationStateCreateInfo.get_frontFace(this.segment()); }
    /// Sets `frontFace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frontFace(MemorySegment segment, long index, @CType("VkFrontFace") int value) { VH_frontFace.set(segment, 0L, index, value); }
    /// Sets `frontFace` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frontFace(MemorySegment segment, @CType("VkFrontFace") int value) { VkPipelineRasterizationStateCreateInfo.set_frontFace(segment, 0L, value); }
    /// Sets `frontFace` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo frontFaceAt(long index, @CType("VkFrontFace") int value) { VkPipelineRasterizationStateCreateInfo.set_frontFace(this.segment(), index, value); return this; }
    /// Sets `frontFace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo frontFace(@CType("VkFrontFace") int value) { VkPipelineRasterizationStateCreateInfo.set_frontFace(this.segment(), value); return this; }

    /// {@return `depthBiasEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBiasEnable(MemorySegment segment, long index) { return (int) VH_depthBiasEnable.get(segment, 0L, index); }
    /// {@return `depthBiasEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBiasEnable(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasEnable(segment, 0L); }
    /// {@return `depthBiasEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBiasEnableAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasEnable(this.segment(), index); }
    /// {@return `depthBiasEnable`}
    public @CType("VkBool32") int depthBiasEnable() { return VkPipelineRasterizationStateCreateInfo.get_depthBiasEnable(this.segment()); }
    /// Sets `depthBiasEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBiasEnable.set(segment, 0L, index, value); }
    /// Sets `depthBiasEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasEnable(segment, 0L, value); }
    /// Sets `depthBiasEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasEnableAt(long index, @CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasEnable(this.segment(), index, value); return this; }
    /// Sets `depthBiasEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasEnable(@CType("VkBool32") int value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasEnable(this.segment(), value); return this; }

    /// {@return `depthBiasConstantFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasConstantFactor(MemorySegment segment, long index) { return (float) VH_depthBiasConstantFactor.get(segment, 0L, index); }
    /// {@return `depthBiasConstantFactor`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasConstantFactor(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasConstantFactor(segment, 0L); }
    /// {@return `depthBiasConstantFactor` at the given index}
    /// @param index the index
    public @CType("float") float depthBiasConstantFactorAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasConstantFactor(this.segment(), index); }
    /// {@return `depthBiasConstantFactor`}
    public @CType("float") float depthBiasConstantFactor() { return VkPipelineRasterizationStateCreateInfo.get_depthBiasConstantFactor(this.segment()); }
    /// Sets `depthBiasConstantFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasConstantFactor(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasConstantFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasConstantFactor(MemorySegment segment, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasConstantFactor(segment, 0L, value); }
    /// Sets `depthBiasConstantFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactorAt(long index, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasConstantFactor(this.segment(), index, value); return this; }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(@CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasConstantFactor(this.segment(), value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasClamp(MemorySegment segment, long index) { return (float) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasClamp(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasClamp(segment, 0L); }
    /// {@return `depthBiasClamp` at the given index}
    /// @param index the index
    public @CType("float") float depthBiasClampAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasClamp(this.segment(), index); }
    /// {@return `depthBiasClamp`}
    public @CType("float") float depthBiasClamp() { return VkPipelineRasterizationStateCreateInfo.get_depthBiasClamp(this.segment()); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasClamp(segment, 0L, value); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasClampAt(long index, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasClamp(this.segment(), index, value); return this; }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasClamp(@CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasClamp(this.segment(), value); return this; }

    /// {@return `depthBiasSlopeFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasSlopeFactor(MemorySegment segment, long index) { return (float) VH_depthBiasSlopeFactor.get(segment, 0L, index); }
    /// {@return `depthBiasSlopeFactor`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasSlopeFactor(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasSlopeFactor(segment, 0L); }
    /// {@return `depthBiasSlopeFactor` at the given index}
    /// @param index the index
    public @CType("float") float depthBiasSlopeFactorAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_depthBiasSlopeFactor(this.segment(), index); }
    /// {@return `depthBiasSlopeFactor`}
    public @CType("float") float depthBiasSlopeFactor() { return VkPipelineRasterizationStateCreateInfo.get_depthBiasSlopeFactor(this.segment()); }
    /// Sets `depthBiasSlopeFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasSlopeFactor(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasSlopeFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasSlopeFactor(MemorySegment segment, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasSlopeFactor(segment, 0L, value); }
    /// Sets `depthBiasSlopeFactor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactorAt(long index, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasSlopeFactor(this.segment(), index, value); return this; }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(@CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_depthBiasSlopeFactor(this.segment(), value); return this; }

    /// {@return `lineWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_lineWidth(MemorySegment segment, long index) { return (float) VH_lineWidth.get(segment, 0L, index); }
    /// {@return `lineWidth`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_lineWidth(MemorySegment segment) { return VkPipelineRasterizationStateCreateInfo.get_lineWidth(segment, 0L); }
    /// {@return `lineWidth` at the given index}
    /// @param index the index
    public @CType("float") float lineWidthAt(long index) { return VkPipelineRasterizationStateCreateInfo.get_lineWidth(this.segment(), index); }
    /// {@return `lineWidth`}
    public @CType("float") float lineWidth() { return VkPipelineRasterizationStateCreateInfo.get_lineWidth(this.segment()); }
    /// Sets `lineWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineWidth(MemorySegment segment, long index, @CType("float") float value) { VH_lineWidth.set(segment, 0L, index, value); }
    /// Sets `lineWidth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineWidth(MemorySegment segment, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_lineWidth(segment, 0L, value); }
    /// Sets `lineWidth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo lineWidthAt(long index, @CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_lineWidth(this.segment(), index, value); return this; }
    /// Sets `lineWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateCreateInfo lineWidth(@CType("float") float value) { VkPipelineRasterizationStateCreateInfo.set_lineWidth(this.segment(), value); return this; }

}
