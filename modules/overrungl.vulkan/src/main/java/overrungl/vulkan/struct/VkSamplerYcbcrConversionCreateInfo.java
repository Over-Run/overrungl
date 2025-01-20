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
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### ycbcrModel
/// [VarHandle][#VH_ycbcrModel] - [Getter][#ycbcrModel()] - [Setter][#ycbcrModel(int)]
/// ### ycbcrRange
/// [VarHandle][#VH_ycbcrRange] - [Getter][#ycbcrRange()] - [Setter][#ycbcrRange(int)]
/// ### components
/// [Byte offset][#OFFSET_components] - [Memory layout][#ML_components] - [Getter][#components()] - [Setter][#components(MemorySegment)]
/// ### xChromaOffset
/// [VarHandle][#VH_xChromaOffset] - [Getter][#xChromaOffset()] - [Setter][#xChromaOffset(int)]
/// ### yChromaOffset
/// [VarHandle][#VH_yChromaOffset] - [Getter][#yChromaOffset()] - [Setter][#yChromaOffset(int)]
/// ### chromaFilter
/// [VarHandle][#VH_chromaFilter] - [Getter][#chromaFilter()] - [Setter][#chromaFilter(int)]
/// ### forceExplicitReconstruction
/// [VarHandle][#VH_forceExplicitReconstruction] - [Getter][#forceExplicitReconstruction()] - [Setter][#forceExplicitReconstruction(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSamplerYcbcrConversionCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkFormat format;
///     VkSamplerYcbcrModelConversion ycbcrModel;
///     VkSamplerYcbcrRange ycbcrRange;
///     VkComponentMapping components;
///     VkChromaLocation xChromaOffset;
///     VkChromaLocation yChromaOffset;
///     VkFilter chromaFilter;
///     VkBool32 forceExplicitReconstruction;
/// } VkSamplerYcbcrConversionCreateInfo;
/// ```
public sealed class VkSamplerYcbcrConversionCreateInfo extends Struct {
    /// The struct layout of `VkSamplerYcbcrConversionCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("ycbcrModel"),
        ValueLayout.JAVA_INT.withName("ycbcrRange"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset"),
        ValueLayout.JAVA_INT.withName("chromaFilter"),
        ValueLayout.JAVA_INT.withName("forceExplicitReconstruction")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `ycbcrModel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ycbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrModel"));
    /// The [VarHandle] of `ycbcrRange` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ycbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrRange"));
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout ML_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The [VarHandle] of `xChromaOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_xChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffset"));
    /// The [VarHandle] of `yChromaOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_yChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffset"));
    /// The [VarHandle] of `chromaFilter` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_chromaFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaFilter"));
    /// The [VarHandle] of `forceExplicitReconstruction` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_forceExplicitReconstruction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("forceExplicitReconstruction"));

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSamplerYcbcrConversionCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionCreateInfo`
    public static VkSamplerYcbcrConversionCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSamplerYcbcrConversionCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSamplerYcbcrConversionCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionCreateInfo`
    public static VkSamplerYcbcrConversionCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkFormat") int format, @CType("VkSamplerYcbcrModelConversion") int ycbcrModel, @CType("VkSamplerYcbcrRange") int ycbcrRange, @CType("VkComponentMapping") MemorySegment components, @CType("VkChromaLocation") int xChromaOffset, @CType("VkChromaLocation") int yChromaOffset, @CType("VkFilter") int chromaFilter, @CType("VkBool32") int forceExplicitReconstruction) { return alloc(allocator).sType(sType).pNext(pNext).format(format).ycbcrModel(ycbcrModel).ycbcrRange(ycbcrRange).components(components).xChromaOffset(xChromaOffset).yChromaOffset(yChromaOffset).chromaFilter(chromaFilter).forceExplicitReconstruction(forceExplicitReconstruction); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo copyFrom(VkSamplerYcbcrConversionCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSamplerYcbcrConversionCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo sType(@CType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSamplerYcbcrConversionCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo pNext(@CType("const void *") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkSamplerYcbcrConversionCreateInfo.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo format(@CType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.set_format(this.segment(), value); return this; }

    /// {@return `ycbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrModelConversion") int get_ycbcrModel(MemorySegment segment, long index) { return (int) VH_ycbcrModel.get(segment, 0L, index); }
    /// {@return `ycbcrModel`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrModelConversion") int get_ycbcrModel(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrModel(segment, 0L); }
    /// {@return `ycbcrModel`}
    public @CType("VkSamplerYcbcrModelConversion") int ycbcrModel() { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrModel(this.segment()); }
    /// Sets `ycbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ycbcrModel(MemorySegment segment, long index, @CType("VkSamplerYcbcrModelConversion") int value) { VH_ycbcrModel.set(segment, 0L, index, value); }
    /// Sets `ycbcrModel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ycbcrModel(MemorySegment segment, @CType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrModel(segment, 0L, value); }
    /// Sets `ycbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(@CType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrModel(this.segment(), value); return this; }

    /// {@return `ycbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSamplerYcbcrRange") int get_ycbcrRange(MemorySegment segment, long index) { return (int) VH_ycbcrRange.get(segment, 0L, index); }
    /// {@return `ycbcrRange`}
    /// @param segment the segment of the struct
    public static @CType("VkSamplerYcbcrRange") int get_ycbcrRange(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrRange(segment, 0L); }
    /// {@return `ycbcrRange`}
    public @CType("VkSamplerYcbcrRange") int ycbcrRange() { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrRange(this.segment()); }
    /// Sets `ycbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ycbcrRange(MemorySegment segment, long index, @CType("VkSamplerYcbcrRange") int value) { VH_ycbcrRange.set(segment, 0L, index, value); }
    /// Sets `ycbcrRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ycbcrRange(MemorySegment segment, @CType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrRange(segment, 0L, value); }
    /// Sets `ycbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(@CType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrRange(this.segment(), value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") MemorySegment get_components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), ML_components); }
    /// {@return `components`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") MemorySegment get_components(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_components(segment, 0L); }
    /// {@return `components`}
    public @CType("VkComponentMapping") MemorySegment components() { return VkSamplerYcbcrConversionCreateInfo.get_components(this.segment()); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_components(MemorySegment segment, long index, @CType("VkComponentMapping") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), ML_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_components(MemorySegment segment, @CType("VkComponentMapping") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_components(segment, 0L, value); }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo components(@CType("VkComponentMapping") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_components(this.segment(), value); return this; }

    /// {@return `xChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_xChromaOffset(MemorySegment segment, long index) { return (int) VH_xChromaOffset.get(segment, 0L, index); }
    /// {@return `xChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_xChromaOffset(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_xChromaOffset(segment, 0L); }
    /// {@return `xChromaOffset`}
    public @CType("VkChromaLocation") int xChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.get_xChromaOffset(this.segment()); }
    /// Sets `xChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_xChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_xChromaOffset.set(segment, 0L, index, value); }
    /// Sets `xChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_xChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_xChromaOffset(segment, 0L, value); }
    /// Sets `xChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(@CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_xChromaOffset(this.segment(), value); return this; }

    /// {@return `yChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkChromaLocation") int get_yChromaOffset(MemorySegment segment, long index) { return (int) VH_yChromaOffset.get(segment, 0L, index); }
    /// {@return `yChromaOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkChromaLocation") int get_yChromaOffset(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_yChromaOffset(segment, 0L); }
    /// {@return `yChromaOffset`}
    public @CType("VkChromaLocation") int yChromaOffset() { return VkSamplerYcbcrConversionCreateInfo.get_yChromaOffset(this.segment()); }
    /// Sets `yChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_yChromaOffset(MemorySegment segment, long index, @CType("VkChromaLocation") int value) { VH_yChromaOffset.set(segment, 0L, index, value); }
    /// Sets `yChromaOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_yChromaOffset(MemorySegment segment, @CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_yChromaOffset(segment, 0L, value); }
    /// Sets `yChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(@CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_yChromaOffset(this.segment(), value); return this; }

    /// {@return `chromaFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFilter") int get_chromaFilter(MemorySegment segment, long index) { return (int) VH_chromaFilter.get(segment, 0L, index); }
    /// {@return `chromaFilter`}
    /// @param segment the segment of the struct
    public static @CType("VkFilter") int get_chromaFilter(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_chromaFilter(segment, 0L); }
    /// {@return `chromaFilter`}
    public @CType("VkFilter") int chromaFilter() { return VkSamplerYcbcrConversionCreateInfo.get_chromaFilter(this.segment()); }
    /// Sets `chromaFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_chromaFilter(MemorySegment segment, long index, @CType("VkFilter") int value) { VH_chromaFilter.set(segment, 0L, index, value); }
    /// Sets `chromaFilter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_chromaFilter(MemorySegment segment, @CType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.set_chromaFilter(segment, 0L, value); }
    /// Sets `chromaFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(@CType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.set_chromaFilter(this.segment(), value); return this; }

    /// {@return `forceExplicitReconstruction` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_forceExplicitReconstruction(MemorySegment segment, long index) { return (int) VH_forceExplicitReconstruction.get(segment, 0L, index); }
    /// {@return `forceExplicitReconstruction`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_forceExplicitReconstruction(MemorySegment segment) { return VkSamplerYcbcrConversionCreateInfo.get_forceExplicitReconstruction(segment, 0L); }
    /// {@return `forceExplicitReconstruction`}
    public @CType("VkBool32") int forceExplicitReconstruction() { return VkSamplerYcbcrConversionCreateInfo.get_forceExplicitReconstruction(this.segment()); }
    /// Sets `forceExplicitReconstruction` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_forceExplicitReconstruction(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_forceExplicitReconstruction.set(segment, 0L, index, value); }
    /// Sets `forceExplicitReconstruction` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_forceExplicitReconstruction(MemorySegment segment, @CType("VkBool32") int value) { VkSamplerYcbcrConversionCreateInfo.set_forceExplicitReconstruction(segment, 0L, value); }
    /// Sets `forceExplicitReconstruction` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(@CType("VkBool32") int value) { VkSamplerYcbcrConversionCreateInfo.set_forceExplicitReconstruction(this.segment(), value); return this; }

    /// A buffer of [VkSamplerYcbcrConversionCreateInfo].
    public static final class Buffer extends VkSamplerYcbcrConversionCreateInfo {
        private final long elementCount;

        /// Creates `VkSamplerYcbcrConversionCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSamplerYcbcrConversionCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSamplerYcbcrConversionCreateInfo`
        public VkSamplerYcbcrConversionCreateInfo asSlice(long index) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSamplerYcbcrConversionCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSamplerYcbcrConversionCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfo.set_format(this.segment(), index, value); return this; }

        /// {@return `ycbcrModel` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrModelConversion") int ycbcrModelAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrModel(this.segment(), index); }
        /// Sets `ycbcrModel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ycbcrModelAt(long index, @CType("VkSamplerYcbcrModelConversion") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrModel(this.segment(), index, value); return this; }

        /// {@return `ycbcrRange` at the given index}
        /// @param index the index
        public @CType("VkSamplerYcbcrRange") int ycbcrRangeAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_ycbcrRange(this.segment(), index); }
        /// Sets `ycbcrRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ycbcrRangeAt(long index, @CType("VkSamplerYcbcrRange") int value) { VkSamplerYcbcrConversionCreateInfo.set_ycbcrRange(this.segment(), index, value); return this; }

        /// {@return `components` at the given index}
        /// @param index the index
        public @CType("VkComponentMapping") MemorySegment componentsAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_components(this.segment(), index); }
        /// Sets `components` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer componentsAt(long index, @CType("VkComponentMapping") MemorySegment value) { VkSamplerYcbcrConversionCreateInfo.set_components(this.segment(), index, value); return this; }

        /// {@return `xChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int xChromaOffsetAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_xChromaOffset(this.segment(), index); }
        /// Sets `xChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer xChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_xChromaOffset(this.segment(), index, value); return this; }

        /// {@return `yChromaOffset` at the given index}
        /// @param index the index
        public @CType("VkChromaLocation") int yChromaOffsetAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_yChromaOffset(this.segment(), index); }
        /// Sets `yChromaOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer yChromaOffsetAt(long index, @CType("VkChromaLocation") int value) { VkSamplerYcbcrConversionCreateInfo.set_yChromaOffset(this.segment(), index, value); return this; }

        /// {@return `chromaFilter` at the given index}
        /// @param index the index
        public @CType("VkFilter") int chromaFilterAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_chromaFilter(this.segment(), index); }
        /// Sets `chromaFilter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer chromaFilterAt(long index, @CType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfo.set_chromaFilter(this.segment(), index, value); return this; }

        /// {@return `forceExplicitReconstruction` at the given index}
        /// @param index the index
        public @CType("VkBool32") int forceExplicitReconstructionAt(long index) { return VkSamplerYcbcrConversionCreateInfo.get_forceExplicitReconstruction(this.segment(), index); }
        /// Sets `forceExplicitReconstruction` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer forceExplicitReconstructionAt(long index, @CType("VkBool32") int value) { VkSamplerYcbcrConversionCreateInfo.set_forceExplicitReconstruction(this.segment(), index, value); return this; }

    }
}
