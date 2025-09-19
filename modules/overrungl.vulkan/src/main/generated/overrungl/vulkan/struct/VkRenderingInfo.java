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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingInfo`.
/// ## Layout
/// ```
/// struct VkRenderingInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkRenderingFlags flags;
///     (struct VkRect2D) VkRect2D renderArea;
///     uint32_t layerCount;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkRenderingAttachmentInfo* pColorAttachments;
///     const VkRenderingAttachmentInfo* pDepthAttachment;
///     const VkRenderingAttachmentInfo* pStencilAttachment;
/// };
/// ```
public final class VkRenderingInfo extends GroupType {
    /// The struct layout of `VkRenderingInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachments"),
        ValueLayout.ADDRESS.withName("pDepthAttachment"),
        ValueLayout.ADDRESS.withName("pStencilAttachment")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `renderArea`.
    public static final long OFFSET_renderArea = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
    /// The memory layout of `renderArea`.
    public static final MemoryLayout LAYOUT_renderArea = LAYOUT.select(PathElement.groupElement("renderArea"));
    /// The byte offset of `layerCount`.
    public static final long OFFSET_layerCount = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
    /// The memory layout of `layerCount`.
    public static final MemoryLayout LAYOUT_layerCount = LAYOUT.select(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    /// The byte offset of `viewMask`.
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    /// The memory layout of `viewMask`.
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The byte offset of `pColorAttachments`.
    public static final long OFFSET_pColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
    /// The memory layout of `pColorAttachments`.
    public static final MemoryLayout LAYOUT_pColorAttachments = LAYOUT.select(PathElement.groupElement("pColorAttachments"));
    /// The [VarHandle] of `pColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachments"));
    /// The byte offset of `pDepthAttachment`.
    public static final long OFFSET_pDepthAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthAttachment"));
    /// The memory layout of `pDepthAttachment`.
    public static final MemoryLayout LAYOUT_pDepthAttachment = LAYOUT.select(PathElement.groupElement("pDepthAttachment"));
    /// The [VarHandle] of `pDepthAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthAttachment"));
    /// The byte offset of `pStencilAttachment`.
    public static final long OFFSET_pStencilAttachment = LAYOUT.byteOffset(PathElement.groupElement("pStencilAttachment"));
    /// The memory layout of `pStencilAttachment`.
    public static final MemoryLayout LAYOUT_pStencilAttachment = LAYOUT.select(PathElement.groupElement("pStencilAttachment"));
    /// The [VarHandle] of `pStencilAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStencilAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStencilAttachment"));

    /// Creates `VkRenderingInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderingInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderingInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderingInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderingInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingInfo`
    public static VkRenderingInfo alloc(SegmentAllocator allocator) { return new VkRenderingInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderingInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingInfo`
    public static VkRenderingInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingInfo copyFrom(VkRenderingInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderingInfo reinterpret(long count) { return new VkRenderingInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderingInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderingInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment renderArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea); }
    /// {@return `renderArea`}
    public MemorySegment renderArea() { return renderArea(this.segment(), 0L); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderArea(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_renderArea, index), LAYOUT_renderArea.byteSize()); }
    /// Sets `renderArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo renderArea(MemorySegment value) { renderArea(this.segment(), 0L, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderingInfo renderArea(Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderArea())); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    public int layerCount() { return layerCount(this.segment(), 0L); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layerCount(MemorySegment segment, long index, int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo layerCount(int value) { layerCount(this.segment(), 0L, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    public int viewMask() { return viewMask(this.segment(), 0L); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewMask(MemorySegment segment, long index, int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo viewMask(int value) { viewMask(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachments.get(segment, 0L, index); }
    /// {@return `pColorAttachments`}
    public MemorySegment pColorAttachments() { return pColorAttachments(this.segment(), 0L); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachments(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachments.set(segment, 0L, index, value); }
    /// Sets `pColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pColorAttachments(MemorySegment value) { pColorAttachments(this.segment(), 0L, value); return this; }

    /// {@return `pDepthAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDepthAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthAttachment.get(segment, 0L, index); }
    /// {@return `pDepthAttachment`}
    public MemorySegment pDepthAttachment() { return pDepthAttachment(this.segment(), 0L); }
    /// Sets `pDepthAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDepthAttachment(MemorySegment segment, long index, MemorySegment value) { VH_pDepthAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pDepthAttachment(MemorySegment value) { pDepthAttachment(this.segment(), 0L, value); return this; }

    /// {@return `pStencilAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStencilAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pStencilAttachment.get(segment, 0L, index); }
    /// {@return `pStencilAttachment`}
    public MemorySegment pStencilAttachment() { return pStencilAttachment(this.segment(), 0L); }
    /// Sets `pStencilAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStencilAttachment(MemorySegment segment, long index, MemorySegment value) { VH_pStencilAttachment.set(segment, 0L, index, value); }
    /// Sets `pStencilAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pStencilAttachment(MemorySegment value) { pStencilAttachment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderingInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingInfo`
    public VkRenderingInfo asSlice(long index) { return new VkRenderingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderingInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingInfo`
    public VkRenderingInfo asSlice(long index, long count) { return new VkRenderingInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderingInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderingInfo at(long index, Consumer<VkRenderingInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `renderArea` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment renderAreaAt(long index) { return renderArea(this.segment(), index); }
    /// Sets `renderArea` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo renderAreaAt(long index, MemorySegment value) { renderArea(this.segment(), index, value); return this; }
    /// Accepts `renderArea` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderingInfo renderAreaAt(long index, Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(renderAreaAt(index))); return this; }

    /// {@return `layerCount` at the given index}
    /// @param index the index of the struct buffer
    public int layerCountAt(long index) { return layerCount(this.segment(), index); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo layerCountAt(long index, int value) { layerCount(this.segment(), index, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param index the index of the struct buffer
    public int viewMaskAt(long index) { return viewMask(this.segment(), index); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo viewMaskAt(long index, int value) { viewMask(this.segment(), index, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

    /// {@return `pColorAttachments` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorAttachmentsAt(long index) { return pColorAttachments(this.segment(), index); }
    /// Sets `pColorAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pColorAttachmentsAt(long index, MemorySegment value) { pColorAttachments(this.segment(), index, value); return this; }

    /// {@return `pDepthAttachment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDepthAttachmentAt(long index) { return pDepthAttachment(this.segment(), index); }
    /// Sets `pDepthAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pDepthAttachmentAt(long index, MemorySegment value) { pDepthAttachment(this.segment(), index, value); return this; }

    /// {@return `pStencilAttachment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStencilAttachmentAt(long index) { return pStencilAttachment(this.segment(), index); }
    /// Sets `pStencilAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingInfo pStencilAttachmentAt(long index, MemorySegment value) { pStencilAttachment(this.segment(), index, value); return this; }

}
