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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoPictureResourceInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkOffset2D) VkOffset2D codedOffset;
///     (struct VkExtent2D) VkExtent2D codedExtent;
///     uint32_t baseArrayLayer;
///     (uint64_t) VkImageView imageViewBinding;
/// };
/// ```
public final class VkVideoPictureResourceInfoKHR extends GroupType {
    /// The struct layout of `VkVideoPictureResourceInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("codedOffset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedExtent"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_LONG.withName("imageViewBinding")
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
    /// The byte offset of `codedOffset`.
    public static final long OFFSET_codedOffset = LAYOUT.byteOffset(PathElement.groupElement("codedOffset"));
    /// The memory layout of `codedOffset`.
    public static final MemoryLayout LAYOUT_codedOffset = LAYOUT.select(PathElement.groupElement("codedOffset"));
    /// The byte offset of `codedExtent`.
    public static final long OFFSET_codedExtent = LAYOUT.byteOffset(PathElement.groupElement("codedExtent"));
    /// The memory layout of `codedExtent`.
    public static final MemoryLayout LAYOUT_codedExtent = LAYOUT.select(PathElement.groupElement("codedExtent"));
    /// The byte offset of `baseArrayLayer`.
    public static final long OFFSET_baseArrayLayer = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
    /// The memory layout of `baseArrayLayer`.
    public static final MemoryLayout LAYOUT_baseArrayLayer = LAYOUT.select(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The byte offset of `imageViewBinding`.
    public static final long OFFSET_imageViewBinding = LAYOUT.byteOffset(PathElement.groupElement("imageViewBinding"));
    /// The memory layout of `imageViewBinding`.
    public static final MemoryLayout LAYOUT_imageViewBinding = LAYOUT.select(PathElement.groupElement("imageViewBinding"));
    /// The [VarHandle] of `imageViewBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageViewBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewBinding"));

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoPictureResourceInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param codedOffset `codedOffset`
    /// @param codedExtent `codedExtent`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @param imageViewBinding `imageViewBinding`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment codedOffset, MemorySegment codedExtent, int baseArrayLayer, long imageViewBinding) {
        return alloc(allocator).sType(sType).pNext(pNext).codedOffset(codedOffset).codedExtent(codedExtent).baseArrayLayer(baseArrayLayer).imageViewBinding(imageViewBinding);
    }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param codedOffset `codedOffset`
    /// @param codedExtent `codedExtent`
    /// @param baseArrayLayer `baseArrayLayer`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment codedOffset, MemorySegment codedExtent, int baseArrayLayer) {
        return alloc(allocator).sType(sType).pNext(pNext).codedOffset(codedOffset).codedExtent(codedExtent).baseArrayLayer(baseArrayLayer);
    }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param codedOffset `codedOffset`
    /// @param codedExtent `codedExtent`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment codedOffset, MemorySegment codedExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).codedOffset(codedOffset).codedExtent(codedExtent);
    }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param codedOffset `codedOffset`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment codedOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).codedOffset(codedOffset);
    }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoPictureResourceInfoKHR copyFrom(VkVideoPictureResourceInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoPictureResourceInfoKHR reinterpret(long count) { return new VkVideoPictureResourceInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoPictureResourceInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoPictureResourceInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `codedOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment codedOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedOffset, index), LAYOUT_codedOffset); }
    /// {@return `codedOffset`}
    public MemorySegment codedOffset() { return codedOffset(this.segment(), 0L); }
    /// Sets `codedOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codedOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedOffset, index), LAYOUT_codedOffset.byteSize()); }
    /// Sets `codedOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffset(MemorySegment value) { codedOffset(this.segment(), 0L, value); return this; }
    /// Accepts `codedOffset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffset(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(codedOffset())); return this; }

    /// {@return `codedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment codedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedExtent, index), LAYOUT_codedExtent); }
    /// {@return `codedExtent`}
    public MemorySegment codedExtent() { return codedExtent(this.segment(), 0L); }
    /// Sets `codedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codedExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedExtent, index), LAYOUT_codedExtent.byteSize()); }
    /// Sets `codedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtent(MemorySegment value) { codedExtent(this.segment(), 0L, value); return this; }
    /// Accepts `codedExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(codedExtent())); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    public int baseArrayLayer() { return baseArrayLayer(this.segment(), 0L); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void baseArrayLayer(MemorySegment segment, long index, int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR baseArrayLayer(int value) { baseArrayLayer(this.segment(), 0L, value); return this; }

    /// {@return `imageViewBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageViewBinding(MemorySegment segment, long index) { return (long) VH_imageViewBinding.get(segment, 0L, index); }
    /// {@return `imageViewBinding`}
    public long imageViewBinding() { return imageViewBinding(this.segment(), 0L); }
    /// Sets `imageViewBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageViewBinding(MemorySegment segment, long index, long value) { VH_imageViewBinding.set(segment, 0L, index, value); }
    /// Sets `imageViewBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR imageViewBinding(long value) { imageViewBinding(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoPictureResourceInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoPictureResourceInfoKHR`
    public VkVideoPictureResourceInfoKHR asSlice(long index) { return new VkVideoPictureResourceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoPictureResourceInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoPictureResourceInfoKHR`
    public VkVideoPictureResourceInfoKHR asSlice(long index, long count) { return new VkVideoPictureResourceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoPictureResourceInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoPictureResourceInfoKHR at(long index, Consumer<VkVideoPictureResourceInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `codedOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment codedOffsetAt(long index) { return codedOffset(this.segment(), index); }
    /// Sets `codedOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffsetAt(long index, MemorySegment value) { codedOffset(this.segment(), index, value); return this; }
    /// Accepts `codedOffset` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(codedOffsetAt(index))); return this; }

    /// {@return `codedExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment codedExtentAt(long index) { return codedExtent(this.segment(), index); }
    /// Sets `codedExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtentAt(long index, MemorySegment value) { codedExtent(this.segment(), index, value); return this; }
    /// Accepts `codedExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(codedExtentAt(index))); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index of the struct buffer
    public int baseArrayLayerAt(long index) { return baseArrayLayer(this.segment(), index); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR baseArrayLayerAt(long index, int value) { baseArrayLayer(this.segment(), index, value); return this; }

    /// {@return `imageViewBinding` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewBindingAt(long index) { return imageViewBinding(this.segment(), index); }
    /// Sets `imageViewBinding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR imageViewBindingAt(long index, long value) { imageViewBinding(this.segment(), index, value); return this; }

}
