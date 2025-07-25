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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileShadingFeaturesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 tileShading;
///     (uint32_t) VkBool32 tileShadingFragmentStage;
///     (uint32_t) VkBool32 tileShadingColorAttachments;
///     (uint32_t) VkBool32 tileShadingDepthAttachments;
///     (uint32_t) VkBool32 tileShadingStencilAttachments;
///     (uint32_t) VkBool32 tileShadingInputAttachments;
///     (uint32_t) VkBool32 tileShadingSampledAttachments;
///     (uint32_t) VkBool32 tileShadingPerTileDraw;
///     (uint32_t) VkBool32 tileShadingPerTileDispatch;
///     (uint32_t) VkBool32 tileShadingDispatchTile;
///     (uint32_t) VkBool32 tileShadingApron;
///     (uint32_t) VkBool32 tileShadingAnisotropicApron;
///     (uint32_t) VkBool32 tileShadingAtomicOps;
///     (uint32_t) VkBool32 tileShadingImageProcessing;
/// };
/// ```
public final class VkPhysicalDeviceTileShadingFeaturesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTileShadingFeaturesQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileShading"),
        ValueLayout.JAVA_INT.withName("tileShadingFragmentStage"),
        ValueLayout.JAVA_INT.withName("tileShadingColorAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingDepthAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingStencilAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingInputAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingSampledAttachments"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDraw"),
        ValueLayout.JAVA_INT.withName("tileShadingPerTileDispatch"),
        ValueLayout.JAVA_INT.withName("tileShadingDispatchTile"),
        ValueLayout.JAVA_INT.withName("tileShadingApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAnisotropicApron"),
        ValueLayout.JAVA_INT.withName("tileShadingAtomicOps"),
        ValueLayout.JAVA_INT.withName("tileShadingImageProcessing")
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
    /// The byte offset of `tileShading`.
    public static final long OFFSET_tileShading = LAYOUT.byteOffset(PathElement.groupElement("tileShading"));
    /// The memory layout of `tileShading`.
    public static final MemoryLayout LAYOUT_tileShading = LAYOUT.select(PathElement.groupElement("tileShading"));
    /// The [VarHandle] of `tileShading` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShading = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShading"));
    /// The byte offset of `tileShadingFragmentStage`.
    public static final long OFFSET_tileShadingFragmentStage = LAYOUT.byteOffset(PathElement.groupElement("tileShadingFragmentStage"));
    /// The memory layout of `tileShadingFragmentStage`.
    public static final MemoryLayout LAYOUT_tileShadingFragmentStage = LAYOUT.select(PathElement.groupElement("tileShadingFragmentStage"));
    /// The [VarHandle] of `tileShadingFragmentStage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingFragmentStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingFragmentStage"));
    /// The byte offset of `tileShadingColorAttachments`.
    public static final long OFFSET_tileShadingColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingColorAttachments"));
    /// The memory layout of `tileShadingColorAttachments`.
    public static final MemoryLayout LAYOUT_tileShadingColorAttachments = LAYOUT.select(PathElement.groupElement("tileShadingColorAttachments"));
    /// The [VarHandle] of `tileShadingColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingColorAttachments"));
    /// The byte offset of `tileShadingDepthAttachments`.
    public static final long OFFSET_tileShadingDepthAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDepthAttachments"));
    /// The memory layout of `tileShadingDepthAttachments`.
    public static final MemoryLayout LAYOUT_tileShadingDepthAttachments = LAYOUT.select(PathElement.groupElement("tileShadingDepthAttachments"));
    /// The [VarHandle] of `tileShadingDepthAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingDepthAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingDepthAttachments"));
    /// The byte offset of `tileShadingStencilAttachments`.
    public static final long OFFSET_tileShadingStencilAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingStencilAttachments"));
    /// The memory layout of `tileShadingStencilAttachments`.
    public static final MemoryLayout LAYOUT_tileShadingStencilAttachments = LAYOUT.select(PathElement.groupElement("tileShadingStencilAttachments"));
    /// The [VarHandle] of `tileShadingStencilAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingStencilAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingStencilAttachments"));
    /// The byte offset of `tileShadingInputAttachments`.
    public static final long OFFSET_tileShadingInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingInputAttachments"));
    /// The memory layout of `tileShadingInputAttachments`.
    public static final MemoryLayout LAYOUT_tileShadingInputAttachments = LAYOUT.select(PathElement.groupElement("tileShadingInputAttachments"));
    /// The [VarHandle] of `tileShadingInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingInputAttachments"));
    /// The byte offset of `tileShadingSampledAttachments`.
    public static final long OFFSET_tileShadingSampledAttachments = LAYOUT.byteOffset(PathElement.groupElement("tileShadingSampledAttachments"));
    /// The memory layout of `tileShadingSampledAttachments`.
    public static final MemoryLayout LAYOUT_tileShadingSampledAttachments = LAYOUT.select(PathElement.groupElement("tileShadingSampledAttachments"));
    /// The [VarHandle] of `tileShadingSampledAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingSampledAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingSampledAttachments"));
    /// The byte offset of `tileShadingPerTileDraw`.
    public static final long OFFSET_tileShadingPerTileDraw = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDraw"));
    /// The memory layout of `tileShadingPerTileDraw`.
    public static final MemoryLayout LAYOUT_tileShadingPerTileDraw = LAYOUT.select(PathElement.groupElement("tileShadingPerTileDraw"));
    /// The [VarHandle] of `tileShadingPerTileDraw` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingPerTileDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingPerTileDraw"));
    /// The byte offset of `tileShadingPerTileDispatch`.
    public static final long OFFSET_tileShadingPerTileDispatch = LAYOUT.byteOffset(PathElement.groupElement("tileShadingPerTileDispatch"));
    /// The memory layout of `tileShadingPerTileDispatch`.
    public static final MemoryLayout LAYOUT_tileShadingPerTileDispatch = LAYOUT.select(PathElement.groupElement("tileShadingPerTileDispatch"));
    /// The [VarHandle] of `tileShadingPerTileDispatch` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingPerTileDispatch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingPerTileDispatch"));
    /// The byte offset of `tileShadingDispatchTile`.
    public static final long OFFSET_tileShadingDispatchTile = LAYOUT.byteOffset(PathElement.groupElement("tileShadingDispatchTile"));
    /// The memory layout of `tileShadingDispatchTile`.
    public static final MemoryLayout LAYOUT_tileShadingDispatchTile = LAYOUT.select(PathElement.groupElement("tileShadingDispatchTile"));
    /// The [VarHandle] of `tileShadingDispatchTile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingDispatchTile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingDispatchTile"));
    /// The byte offset of `tileShadingApron`.
    public static final long OFFSET_tileShadingApron = LAYOUT.byteOffset(PathElement.groupElement("tileShadingApron"));
    /// The memory layout of `tileShadingApron`.
    public static final MemoryLayout LAYOUT_tileShadingApron = LAYOUT.select(PathElement.groupElement("tileShadingApron"));
    /// The [VarHandle] of `tileShadingApron` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingApron = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingApron"));
    /// The byte offset of `tileShadingAnisotropicApron`.
    public static final long OFFSET_tileShadingAnisotropicApron = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAnisotropicApron"));
    /// The memory layout of `tileShadingAnisotropicApron`.
    public static final MemoryLayout LAYOUT_tileShadingAnisotropicApron = LAYOUT.select(PathElement.groupElement("tileShadingAnisotropicApron"));
    /// The [VarHandle] of `tileShadingAnisotropicApron` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingAnisotropicApron = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingAnisotropicApron"));
    /// The byte offset of `tileShadingAtomicOps`.
    public static final long OFFSET_tileShadingAtomicOps = LAYOUT.byteOffset(PathElement.groupElement("tileShadingAtomicOps"));
    /// The memory layout of `tileShadingAtomicOps`.
    public static final MemoryLayout LAYOUT_tileShadingAtomicOps = LAYOUT.select(PathElement.groupElement("tileShadingAtomicOps"));
    /// The [VarHandle] of `tileShadingAtomicOps` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingAtomicOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingAtomicOps"));
    /// The byte offset of `tileShadingImageProcessing`.
    public static final long OFFSET_tileShadingImageProcessing = LAYOUT.byteOffset(PathElement.groupElement("tileShadingImageProcessing"));
    /// The memory layout of `tileShadingImageProcessing`.
    public static final MemoryLayout LAYOUT_tileShadingImageProcessing = LAYOUT.select(PathElement.groupElement("tileShadingImageProcessing"));
    /// The [VarHandle] of `tileShadingImageProcessing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileShadingImageProcessing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileShadingImageProcessing"));

    /// Creates `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTileShadingFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @param tileShadingDispatchTile `tileShadingDispatchTile`
    /// @param tileShadingApron `tileShadingApron`
    /// @param tileShadingAnisotropicApron `tileShadingAnisotropicApron`
    /// @param tileShadingAtomicOps `tileShadingAtomicOps`
    /// @param tileShadingImageProcessing `tileShadingImageProcessing`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch, int tileShadingDispatchTile, int tileShadingApron, int tileShadingAnisotropicApron, int tileShadingAtomicOps, int tileShadingImageProcessing) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch).tileShadingDispatchTile(tileShadingDispatchTile).tileShadingApron(tileShadingApron).tileShadingAnisotropicApron(tileShadingAnisotropicApron).tileShadingAtomicOps(tileShadingAtomicOps).tileShadingImageProcessing(tileShadingImageProcessing);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @param tileShadingDispatchTile `tileShadingDispatchTile`
    /// @param tileShadingApron `tileShadingApron`
    /// @param tileShadingAnisotropicApron `tileShadingAnisotropicApron`
    /// @param tileShadingAtomicOps `tileShadingAtomicOps`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch, int tileShadingDispatchTile, int tileShadingApron, int tileShadingAnisotropicApron, int tileShadingAtomicOps) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch).tileShadingDispatchTile(tileShadingDispatchTile).tileShadingApron(tileShadingApron).tileShadingAnisotropicApron(tileShadingAnisotropicApron).tileShadingAtomicOps(tileShadingAtomicOps);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @param tileShadingDispatchTile `tileShadingDispatchTile`
    /// @param tileShadingApron `tileShadingApron`
    /// @param tileShadingAnisotropicApron `tileShadingAnisotropicApron`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch, int tileShadingDispatchTile, int tileShadingApron, int tileShadingAnisotropicApron) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch).tileShadingDispatchTile(tileShadingDispatchTile).tileShadingApron(tileShadingApron).tileShadingAnisotropicApron(tileShadingAnisotropicApron);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @param tileShadingDispatchTile `tileShadingDispatchTile`
    /// @param tileShadingApron `tileShadingApron`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch, int tileShadingDispatchTile, int tileShadingApron) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch).tileShadingDispatchTile(tileShadingDispatchTile).tileShadingApron(tileShadingApron);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @param tileShadingDispatchTile `tileShadingDispatchTile`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch, int tileShadingDispatchTile) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch).tileShadingDispatchTile(tileShadingDispatchTile);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @param tileShadingPerTileDispatch `tileShadingPerTileDispatch`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw, int tileShadingPerTileDispatch) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw).tileShadingPerTileDispatch(tileShadingPerTileDispatch);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @param tileShadingPerTileDraw `tileShadingPerTileDraw`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments, int tileShadingPerTileDraw) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments).tileShadingPerTileDraw(tileShadingPerTileDraw);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @param tileShadingSampledAttachments `tileShadingSampledAttachments`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments, int tileShadingSampledAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments).tileShadingSampledAttachments(tileShadingSampledAttachments);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @param tileShadingInputAttachments `tileShadingInputAttachments`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments, int tileShadingInputAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments).tileShadingInputAttachments(tileShadingInputAttachments);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @param tileShadingStencilAttachments `tileShadingStencilAttachments`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments, int tileShadingStencilAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments).tileShadingStencilAttachments(tileShadingStencilAttachments);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @param tileShadingDepthAttachments `tileShadingDepthAttachments`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments, int tileShadingDepthAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments).tileShadingDepthAttachments(tileShadingDepthAttachments);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @param tileShadingColorAttachments `tileShadingColorAttachments`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage, int tileShadingColorAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage).tileShadingColorAttachments(tileShadingColorAttachments);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @param tileShadingFragmentStage `tileShadingFragmentStage`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading, int tileShadingFragmentStage) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading).tileShadingFragmentStage(tileShadingFragmentStage);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param tileShading `tileShading`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int tileShading) {
        return alloc(allocator).sType(sType).pNext(pNext).tileShading(tileShading);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceTileShadingFeaturesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public static VkPhysicalDeviceTileShadingFeaturesQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM copyFrom(VkPhysicalDeviceTileShadingFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTileShadingFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTileShadingFeaturesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tileShading` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShading(MemorySegment segment, long index) { return (int) VH_tileShading.get(segment, 0L, index); }
    /// {@return `tileShading`}
    public int tileShading() { return tileShading(this.segment(), 0L); }
    /// Sets `tileShading` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShading(MemorySegment segment, long index, int value) { VH_tileShading.set(segment, 0L, index, value); }
    /// Sets `tileShading` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShading(int value) { tileShading(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingFragmentStage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingFragmentStage(MemorySegment segment, long index) { return (int) VH_tileShadingFragmentStage.get(segment, 0L, index); }
    /// {@return `tileShadingFragmentStage`}
    public int tileShadingFragmentStage() { return tileShadingFragmentStage(this.segment(), 0L); }
    /// Sets `tileShadingFragmentStage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingFragmentStage(MemorySegment segment, long index, int value) { VH_tileShadingFragmentStage.set(segment, 0L, index, value); }
    /// Sets `tileShadingFragmentStage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStage(int value) { tileShadingFragmentStage(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingColorAttachments(MemorySegment segment, long index) { return (int) VH_tileShadingColorAttachments.get(segment, 0L, index); }
    /// {@return `tileShadingColorAttachments`}
    public int tileShadingColorAttachments() { return tileShadingColorAttachments(this.segment(), 0L); }
    /// Sets `tileShadingColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingColorAttachments(MemorySegment segment, long index, int value) { VH_tileShadingColorAttachments.set(segment, 0L, index, value); }
    /// Sets `tileShadingColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachments(int value) { tileShadingColorAttachments(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingDepthAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingDepthAttachments(MemorySegment segment, long index) { return (int) VH_tileShadingDepthAttachments.get(segment, 0L, index); }
    /// {@return `tileShadingDepthAttachments`}
    public int tileShadingDepthAttachments() { return tileShadingDepthAttachments(this.segment(), 0L); }
    /// Sets `tileShadingDepthAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingDepthAttachments(MemorySegment segment, long index, int value) { VH_tileShadingDepthAttachments.set(segment, 0L, index, value); }
    /// Sets `tileShadingDepthAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachments(int value) { tileShadingDepthAttachments(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingStencilAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingStencilAttachments(MemorySegment segment, long index) { return (int) VH_tileShadingStencilAttachments.get(segment, 0L, index); }
    /// {@return `tileShadingStencilAttachments`}
    public int tileShadingStencilAttachments() { return tileShadingStencilAttachments(this.segment(), 0L); }
    /// Sets `tileShadingStencilAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingStencilAttachments(MemorySegment segment, long index, int value) { VH_tileShadingStencilAttachments.set(segment, 0L, index, value); }
    /// Sets `tileShadingStencilAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachments(int value) { tileShadingStencilAttachments(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingInputAttachments(MemorySegment segment, long index) { return (int) VH_tileShadingInputAttachments.get(segment, 0L, index); }
    /// {@return `tileShadingInputAttachments`}
    public int tileShadingInputAttachments() { return tileShadingInputAttachments(this.segment(), 0L); }
    /// Sets `tileShadingInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingInputAttachments(MemorySegment segment, long index, int value) { VH_tileShadingInputAttachments.set(segment, 0L, index, value); }
    /// Sets `tileShadingInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachments(int value) { tileShadingInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingSampledAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingSampledAttachments(MemorySegment segment, long index) { return (int) VH_tileShadingSampledAttachments.get(segment, 0L, index); }
    /// {@return `tileShadingSampledAttachments`}
    public int tileShadingSampledAttachments() { return tileShadingSampledAttachments(this.segment(), 0L); }
    /// Sets `tileShadingSampledAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingSampledAttachments(MemorySegment segment, long index, int value) { VH_tileShadingSampledAttachments.set(segment, 0L, index, value); }
    /// Sets `tileShadingSampledAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachments(int value) { tileShadingSampledAttachments(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingPerTileDraw` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingPerTileDraw(MemorySegment segment, long index) { return (int) VH_tileShadingPerTileDraw.get(segment, 0L, index); }
    /// {@return `tileShadingPerTileDraw`}
    public int tileShadingPerTileDraw() { return tileShadingPerTileDraw(this.segment(), 0L); }
    /// Sets `tileShadingPerTileDraw` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingPerTileDraw(MemorySegment segment, long index, int value) { VH_tileShadingPerTileDraw.set(segment, 0L, index, value); }
    /// Sets `tileShadingPerTileDraw` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDraw(int value) { tileShadingPerTileDraw(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingPerTileDispatch` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingPerTileDispatch(MemorySegment segment, long index) { return (int) VH_tileShadingPerTileDispatch.get(segment, 0L, index); }
    /// {@return `tileShadingPerTileDispatch`}
    public int tileShadingPerTileDispatch() { return tileShadingPerTileDispatch(this.segment(), 0L); }
    /// Sets `tileShadingPerTileDispatch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingPerTileDispatch(MemorySegment segment, long index, int value) { VH_tileShadingPerTileDispatch.set(segment, 0L, index, value); }
    /// Sets `tileShadingPerTileDispatch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatch(int value) { tileShadingPerTileDispatch(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingDispatchTile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingDispatchTile(MemorySegment segment, long index) { return (int) VH_tileShadingDispatchTile.get(segment, 0L, index); }
    /// {@return `tileShadingDispatchTile`}
    public int tileShadingDispatchTile() { return tileShadingDispatchTile(this.segment(), 0L); }
    /// Sets `tileShadingDispatchTile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingDispatchTile(MemorySegment segment, long index, int value) { VH_tileShadingDispatchTile.set(segment, 0L, index, value); }
    /// Sets `tileShadingDispatchTile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTile(int value) { tileShadingDispatchTile(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingApron` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingApron(MemorySegment segment, long index) { return (int) VH_tileShadingApron.get(segment, 0L, index); }
    /// {@return `tileShadingApron`}
    public int tileShadingApron() { return tileShadingApron(this.segment(), 0L); }
    /// Sets `tileShadingApron` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingApron(MemorySegment segment, long index, int value) { VH_tileShadingApron.set(segment, 0L, index, value); }
    /// Sets `tileShadingApron` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApron(int value) { tileShadingApron(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingAnisotropicApron` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingAnisotropicApron(MemorySegment segment, long index) { return (int) VH_tileShadingAnisotropicApron.get(segment, 0L, index); }
    /// {@return `tileShadingAnisotropicApron`}
    public int tileShadingAnisotropicApron() { return tileShadingAnisotropicApron(this.segment(), 0L); }
    /// Sets `tileShadingAnisotropicApron` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingAnisotropicApron(MemorySegment segment, long index, int value) { VH_tileShadingAnisotropicApron.set(segment, 0L, index, value); }
    /// Sets `tileShadingAnisotropicApron` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApron(int value) { tileShadingAnisotropicApron(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingAtomicOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingAtomicOps(MemorySegment segment, long index) { return (int) VH_tileShadingAtomicOps.get(segment, 0L, index); }
    /// {@return `tileShadingAtomicOps`}
    public int tileShadingAtomicOps() { return tileShadingAtomicOps(this.segment(), 0L); }
    /// Sets `tileShadingAtomicOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingAtomicOps(MemorySegment segment, long index, int value) { VH_tileShadingAtomicOps.set(segment, 0L, index, value); }
    /// Sets `tileShadingAtomicOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOps(int value) { tileShadingAtomicOps(this.segment(), 0L, value); return this; }

    /// {@return `tileShadingImageProcessing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileShadingImageProcessing(MemorySegment segment, long index) { return (int) VH_tileShadingImageProcessing.get(segment, 0L, index); }
    /// {@return `tileShadingImageProcessing`}
    public int tileShadingImageProcessing() { return tileShadingImageProcessing(this.segment(), 0L); }
    /// Sets `tileShadingImageProcessing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileShadingImageProcessing(MemorySegment segment, long index, int value) { VH_tileShadingImageProcessing.set(segment, 0L, index, value); }
    /// Sets `tileShadingImageProcessing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessing(int value) { tileShadingImageProcessing(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTileShadingFeaturesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public VkPhysicalDeviceTileShadingFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTileShadingFeaturesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTileShadingFeaturesQCOM`
    public VkPhysicalDeviceTileShadingFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileShadingFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTileShadingFeaturesQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceTileShadingFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tileShading` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingAt(long index) { return tileShading(this.segment(), index); }
    /// Sets `tileShading` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAt(long index, int value) { tileShading(this.segment(), index, value); return this; }

    /// {@return `tileShadingFragmentStage` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingFragmentStageAt(long index) { return tileShadingFragmentStage(this.segment(), index); }
    /// Sets `tileShadingFragmentStage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStageAt(long index, int value) { tileShadingFragmentStage(this.segment(), index, value); return this; }

    /// {@return `tileShadingColorAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingColorAttachmentsAt(long index) { return tileShadingColorAttachments(this.segment(), index); }
    /// Sets `tileShadingColorAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachmentsAt(long index, int value) { tileShadingColorAttachments(this.segment(), index, value); return this; }

    /// {@return `tileShadingDepthAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingDepthAttachmentsAt(long index) { return tileShadingDepthAttachments(this.segment(), index); }
    /// Sets `tileShadingDepthAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachmentsAt(long index, int value) { tileShadingDepthAttachments(this.segment(), index, value); return this; }

    /// {@return `tileShadingStencilAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingStencilAttachmentsAt(long index) { return tileShadingStencilAttachments(this.segment(), index); }
    /// Sets `tileShadingStencilAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachmentsAt(long index, int value) { tileShadingStencilAttachments(this.segment(), index, value); return this; }

    /// {@return `tileShadingInputAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingInputAttachmentsAt(long index) { return tileShadingInputAttachments(this.segment(), index); }
    /// Sets `tileShadingInputAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachmentsAt(long index, int value) { tileShadingInputAttachments(this.segment(), index, value); return this; }

    /// {@return `tileShadingSampledAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingSampledAttachmentsAt(long index) { return tileShadingSampledAttachments(this.segment(), index); }
    /// Sets `tileShadingSampledAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachmentsAt(long index, int value) { tileShadingSampledAttachments(this.segment(), index, value); return this; }

    /// {@return `tileShadingPerTileDraw` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingPerTileDrawAt(long index) { return tileShadingPerTileDraw(this.segment(), index); }
    /// Sets `tileShadingPerTileDraw` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDrawAt(long index, int value) { tileShadingPerTileDraw(this.segment(), index, value); return this; }

    /// {@return `tileShadingPerTileDispatch` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingPerTileDispatchAt(long index) { return tileShadingPerTileDispatch(this.segment(), index); }
    /// Sets `tileShadingPerTileDispatch` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatchAt(long index, int value) { tileShadingPerTileDispatch(this.segment(), index, value); return this; }

    /// {@return `tileShadingDispatchTile` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingDispatchTileAt(long index) { return tileShadingDispatchTile(this.segment(), index); }
    /// Sets `tileShadingDispatchTile` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTileAt(long index, int value) { tileShadingDispatchTile(this.segment(), index, value); return this; }

    /// {@return `tileShadingApron` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingApronAt(long index) { return tileShadingApron(this.segment(), index); }
    /// Sets `tileShadingApron` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApronAt(long index, int value) { tileShadingApron(this.segment(), index, value); return this; }

    /// {@return `tileShadingAnisotropicApron` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingAnisotropicApronAt(long index) { return tileShadingAnisotropicApron(this.segment(), index); }
    /// Sets `tileShadingAnisotropicApron` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApronAt(long index, int value) { tileShadingAnisotropicApron(this.segment(), index, value); return this; }

    /// {@return `tileShadingAtomicOps` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingAtomicOpsAt(long index) { return tileShadingAtomicOps(this.segment(), index); }
    /// Sets `tileShadingAtomicOps` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOpsAt(long index, int value) { tileShadingAtomicOps(this.segment(), index, value); return this; }

    /// {@return `tileShadingImageProcessing` at the given index}
    /// @param index the index of the struct buffer
    public int tileShadingImageProcessingAt(long index) { return tileShadingImageProcessing(this.segment(), index); }
    /// Sets `tileShadingImageProcessing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessingAt(long index, int value) { tileShadingImageProcessing(this.segment(), index, value); return this; }

}
