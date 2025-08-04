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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSamplerYcbcrConversionCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkFormat format;
///     (int) VkSamplerYcbcrModelConversion ycbcrModel;
///     (int) VkSamplerYcbcrRange ycbcrRange;
///     (struct VkComponentMapping) VkComponentMapping components;
///     (int) VkChromaLocation xChromaOffset;
///     (int) VkChromaLocation yChromaOffset;
///     (int) VkFilter chromaFilter;
///     (uint32_t) VkBool32 forceExplicitReconstruction;
/// };
/// ```
public final class VkSamplerYcbcrConversionCreateInfo extends GroupType {
    /// The struct layout of `VkSamplerYcbcrConversionCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `ycbcrModel`.
    public static final long OFFSET_ycbcrModel = LAYOUT.byteOffset(PathElement.groupElement("ycbcrModel"));
    /// The memory layout of `ycbcrModel`.
    public static final MemoryLayout LAYOUT_ycbcrModel = LAYOUT.select(PathElement.groupElement("ycbcrModel"));
    /// The [VarHandle] of `ycbcrModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ycbcrModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrModel"));
    /// The byte offset of `ycbcrRange`.
    public static final long OFFSET_ycbcrRange = LAYOUT.byteOffset(PathElement.groupElement("ycbcrRange"));
    /// The memory layout of `ycbcrRange`.
    public static final MemoryLayout LAYOUT_ycbcrRange = LAYOUT.select(PathElement.groupElement("ycbcrRange"));
    /// The [VarHandle] of `ycbcrRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ycbcrRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrRange"));
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout LAYOUT_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The byte offset of `xChromaOffset`.
    public static final long OFFSET_xChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
    /// The memory layout of `xChromaOffset`.
    public static final MemoryLayout LAYOUT_xChromaOffset = LAYOUT.select(PathElement.groupElement("xChromaOffset"));
    /// The [VarHandle] of `xChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_xChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffset"));
    /// The byte offset of `yChromaOffset`.
    public static final long OFFSET_yChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
    /// The memory layout of `yChromaOffset`.
    public static final MemoryLayout LAYOUT_yChromaOffset = LAYOUT.select(PathElement.groupElement("yChromaOffset"));
    /// The [VarHandle] of `yChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_yChromaOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffset"));
    /// The byte offset of `chromaFilter`.
    public static final long OFFSET_chromaFilter = LAYOUT.byteOffset(PathElement.groupElement("chromaFilter"));
    /// The memory layout of `chromaFilter`.
    public static final MemoryLayout LAYOUT_chromaFilter = LAYOUT.select(PathElement.groupElement("chromaFilter"));
    /// The [VarHandle] of `chromaFilter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_chromaFilter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaFilter"));
    /// The byte offset of `forceExplicitReconstruction`.
    public static final long OFFSET_forceExplicitReconstruction = LAYOUT.byteOffset(PathElement.groupElement("forceExplicitReconstruction"));
    /// The memory layout of `forceExplicitReconstruction`.
    public static final MemoryLayout LAYOUT_forceExplicitReconstruction = LAYOUT.select(PathElement.groupElement("forceExplicitReconstruction"));
    /// The [VarHandle] of `forceExplicitReconstruction` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_forceExplicitReconstruction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("forceExplicitReconstruction"));

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerYcbcrConversionCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerYcbcrConversionCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerYcbcrConversionCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerYcbcrConversionCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerYcbcrConversionCreateInfo`
    public static VkSamplerYcbcrConversionCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerYcbcrConversionCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerYcbcrConversionCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerYcbcrConversionCreateInfo`
    public static VkSamplerYcbcrConversionCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerYcbcrConversionCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo copyFrom(VkSamplerYcbcrConversionCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerYcbcrConversionCreateInfo reinterpret(long count) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerYcbcrConversionCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerYcbcrConversionCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `ycbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ycbcrModel(MemorySegment segment, long index) { return (int) VH_ycbcrModel.get(segment, 0L, index); }
    /// {@return `ycbcrModel`}
    public int ycbcrModel() { return ycbcrModel(this.segment(), 0L); }
    /// Sets `ycbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ycbcrModel(MemorySegment segment, long index, int value) { VH_ycbcrModel.set(segment, 0L, index, value); }
    /// Sets `ycbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrModel(int value) { ycbcrModel(this.segment(), 0L, value); return this; }

    /// {@return `ycbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ycbcrRange(MemorySegment segment, long index) { return (int) VH_ycbcrRange.get(segment, 0L, index); }
    /// {@return `ycbcrRange`}
    public int ycbcrRange() { return ycbcrRange(this.segment(), 0L); }
    /// Sets `ycbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ycbcrRange(MemorySegment segment, long index, int value) { VH_ycbcrRange.set(segment, 0L, index, value); }
    /// Sets `ycbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrRange(int value) { ycbcrRange(this.segment(), 0L, value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), LAYOUT_components); }
    /// {@return `components`}
    public MemorySegment components() { return components(this.segment(), 0L); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void components(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), LAYOUT_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo components(MemorySegment value) { components(this.segment(), 0L, value); return this; }
    /// Accepts `components` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo components(Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(components())); return this; }

    /// {@return `xChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int xChromaOffset(MemorySegment segment, long index) { return (int) VH_xChromaOffset.get(segment, 0L, index); }
    /// {@return `xChromaOffset`}
    public int xChromaOffset() { return xChromaOffset(this.segment(), 0L); }
    /// Sets `xChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xChromaOffset(MemorySegment segment, long index, int value) { VH_xChromaOffset.set(segment, 0L, index, value); }
    /// Sets `xChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo xChromaOffset(int value) { xChromaOffset(this.segment(), 0L, value); return this; }

    /// {@return `yChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int yChromaOffset(MemorySegment segment, long index) { return (int) VH_yChromaOffset.get(segment, 0L, index); }
    /// {@return `yChromaOffset`}
    public int yChromaOffset() { return yChromaOffset(this.segment(), 0L); }
    /// Sets `yChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void yChromaOffset(MemorySegment segment, long index, int value) { VH_yChromaOffset.set(segment, 0L, index, value); }
    /// Sets `yChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo yChromaOffset(int value) { yChromaOffset(this.segment(), 0L, value); return this; }

    /// {@return `chromaFilter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chromaFilter(MemorySegment segment, long index) { return (int) VH_chromaFilter.get(segment, 0L, index); }
    /// {@return `chromaFilter`}
    public int chromaFilter() { return chromaFilter(this.segment(), 0L); }
    /// Sets `chromaFilter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chromaFilter(MemorySegment segment, long index, int value) { VH_chromaFilter.set(segment, 0L, index, value); }
    /// Sets `chromaFilter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo chromaFilter(int value) { chromaFilter(this.segment(), 0L, value); return this; }

    /// {@return `forceExplicitReconstruction` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int forceExplicitReconstruction(MemorySegment segment, long index) { return (int) VH_forceExplicitReconstruction.get(segment, 0L, index); }
    /// {@return `forceExplicitReconstruction`}
    public int forceExplicitReconstruction() { return forceExplicitReconstruction(this.segment(), 0L); }
    /// Sets `forceExplicitReconstruction` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void forceExplicitReconstruction(MemorySegment segment, long index, int value) { VH_forceExplicitReconstruction.set(segment, 0L, index, value); }
    /// Sets `forceExplicitReconstruction` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstruction(int value) { forceExplicitReconstruction(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerYcbcrConversionCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerYcbcrConversionCreateInfo`
    public VkSamplerYcbcrConversionCreateInfo asSlice(long index) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerYcbcrConversionCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerYcbcrConversionCreateInfo`
    public VkSamplerYcbcrConversionCreateInfo asSlice(long index, long count) { return new VkSamplerYcbcrConversionCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerYcbcrConversionCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo at(long index, Consumer<VkSamplerYcbcrConversionCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `ycbcrModel` at the given index}
    /// @param index the index of the struct buffer
    public int ycbcrModelAt(long index) { return ycbcrModel(this.segment(), index); }
    /// Sets `ycbcrModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrModelAt(long index, int value) { ycbcrModel(this.segment(), index, value); return this; }

    /// {@return `ycbcrRange` at the given index}
    /// @param index the index of the struct buffer
    public int ycbcrRangeAt(long index) { return ycbcrRange(this.segment(), index); }
    /// Sets `ycbcrRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo ycbcrRangeAt(long index, int value) { ycbcrRange(this.segment(), index, value); return this; }

    /// {@return `components` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment componentsAt(long index) { return components(this.segment(), index); }
    /// Sets `components` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo componentsAt(long index, MemorySegment value) { components(this.segment(), index, value); return this; }
    /// Accepts `components` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo componentsAt(long index, Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(componentsAt(index))); return this; }

    /// {@return `xChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int xChromaOffsetAt(long index) { return xChromaOffset(this.segment(), index); }
    /// Sets `xChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo xChromaOffsetAt(long index, int value) { xChromaOffset(this.segment(), index, value); return this; }

    /// {@return `yChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int yChromaOffsetAt(long index) { return yChromaOffset(this.segment(), index); }
    /// Sets `yChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo yChromaOffsetAt(long index, int value) { yChromaOffset(this.segment(), index, value); return this; }

    /// {@return `chromaFilter` at the given index}
    /// @param index the index of the struct buffer
    public int chromaFilterAt(long index) { return chromaFilter(this.segment(), index); }
    /// Sets `chromaFilter` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo chromaFilterAt(long index, int value) { chromaFilter(this.segment(), index, value); return this; }

    /// {@return `forceExplicitReconstruction` at the given index}
    /// @param index the index of the struct buffer
    public int forceExplicitReconstructionAt(long index) { return forceExplicitReconstruction(this.segment(), index); }
    /// Sets `forceExplicitReconstruction` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerYcbcrConversionCreateInfo forceExplicitReconstructionAt(long index, int value) { forceExplicitReconstruction(this.segment(), index, value); return this; }

}
