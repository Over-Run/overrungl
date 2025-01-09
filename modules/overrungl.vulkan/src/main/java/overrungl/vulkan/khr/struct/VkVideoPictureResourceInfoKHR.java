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
package overrungl.vulkan.khr.struct;

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
/// ### codedOffset
/// [Byte offset][#OFFSET_codedOffset] - [Memory layout][#ML_codedOffset] - [Getter][#codedOffset()] - [Setter][#codedOffset(java.lang.foreign.MemorySegment)]
/// ### codedExtent
/// [Byte offset][#OFFSET_codedExtent] - [Memory layout][#ML_codedExtent] - [Getter][#codedExtent()] - [Setter][#codedExtent(java.lang.foreign.MemorySegment)]
/// ### baseArrayLayer
/// [VarHandle][#VH_baseArrayLayer] - [Getter][#baseArrayLayer()] - [Setter][#baseArrayLayer(int)]
/// ### imageViewBinding
/// [VarHandle][#VH_imageViewBinding] - [Getter][#imageViewBinding()] - [Setter][#imageViewBinding(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoPictureResourceInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkOffset2D codedOffset;
///     VkExtent2D codedExtent;
///     uint32_t baseArrayLayer;
///     VkImageView imageViewBinding;
/// } VkVideoPictureResourceInfoKHR;
/// ```
public final class VkVideoPictureResourceInfoKHR extends Struct {
    /// The struct layout of `VkVideoPictureResourceInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("codedOffset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedExtent"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.ADDRESS.withName("imageViewBinding")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `codedOffset`.
    public static final long OFFSET_codedOffset = LAYOUT.byteOffset(PathElement.groupElement("codedOffset"));
    /// The memory layout of `codedOffset`.
    public static final MemoryLayout ML_codedOffset = LAYOUT.select(PathElement.groupElement("codedOffset"));
    /// The byte offset of `codedExtent`.
    public static final long OFFSET_codedExtent = LAYOUT.byteOffset(PathElement.groupElement("codedExtent"));
    /// The memory layout of `codedExtent`.
    public static final MemoryLayout ML_codedExtent = LAYOUT.select(PathElement.groupElement("codedExtent"));
    /// The [VarHandle] of `baseArrayLayer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_baseArrayLayer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("baseArrayLayer"));
    /// The [VarHandle] of `imageViewBinding` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageViewBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewBinding"));

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoPictureResourceInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoPictureResourceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoPictureResourceInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoPictureResourceInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoPictureResourceInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoPictureResourceInfoKHR`
    public static VkVideoPictureResourceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoPictureResourceInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoPictureResourceInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoPictureResourceInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoPictureResourceInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoPictureResourceInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR sType(@CType("VkStructureType") int value) { VkVideoPictureResourceInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoPictureResourceInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoPictureResourceInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `codedOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_codedOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedOffset, index), ML_codedOffset); }
    /// {@return `codedOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_codedOffset(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_codedOffset(segment, 0L); }
    /// {@return `codedOffset` at the given index}
    /// @param index the index
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment codedOffsetAt(long index) { return VkVideoPictureResourceInfoKHR.get_codedOffset(this.segment(), index); }
    /// {@return `codedOffset`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment codedOffset() { return VkVideoPictureResourceInfoKHR.get_codedOffset(this.segment()); }
    /// Sets `codedOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codedOffset(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedOffset, index), ML_codedOffset.byteSize()); }
    /// Sets `codedOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codedOffset(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedOffset(segment, 0L, value); }
    /// Sets `codedOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffsetAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedOffset(this.segment(), index, value); return this; }
    /// Sets `codedOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedOffset(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedOffset(this.segment(), value); return this; }

    /// {@return `codedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_codedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedExtent, index), ML_codedExtent); }
    /// {@return `codedExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_codedExtent(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_codedExtent(segment, 0L); }
    /// {@return `codedExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment codedExtentAt(long index) { return VkVideoPictureResourceInfoKHR.get_codedExtent(this.segment(), index); }
    /// {@return `codedExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment codedExtent() { return VkVideoPictureResourceInfoKHR.get_codedExtent(this.segment()); }
    /// Sets `codedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codedExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedExtent, index), ML_codedExtent.byteSize()); }
    /// Sets `codedExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codedExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedExtent(segment, 0L, value); }
    /// Sets `codedExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedExtent(this.segment(), index, value); return this; }
    /// Sets `codedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR codedExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_codedExtent(this.segment(), value); return this; }

    /// {@return `baseArrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment, long index) { return (int) VH_baseArrayLayer.get(segment, 0L, index); }
    /// {@return `baseArrayLayer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_baseArrayLayer(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_baseArrayLayer(segment, 0L); }
    /// {@return `baseArrayLayer` at the given index}
    /// @param index the index
    public @CType("uint32_t") int baseArrayLayerAt(long index) { return VkVideoPictureResourceInfoKHR.get_baseArrayLayer(this.segment(), index); }
    /// {@return `baseArrayLayer`}
    public @CType("uint32_t") int baseArrayLayer() { return VkVideoPictureResourceInfoKHR.get_baseArrayLayer(this.segment()); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_baseArrayLayer.set(segment, 0L, index, value); }
    /// Sets `baseArrayLayer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_baseArrayLayer(MemorySegment segment, @CType("uint32_t") int value) { VkVideoPictureResourceInfoKHR.set_baseArrayLayer(segment, 0L, value); }
    /// Sets `baseArrayLayer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR baseArrayLayerAt(long index, @CType("uint32_t") int value) { VkVideoPictureResourceInfoKHR.set_baseArrayLayer(this.segment(), index, value); return this; }
    /// Sets `baseArrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR baseArrayLayer(@CType("uint32_t") int value) { VkVideoPictureResourceInfoKHR.set_baseArrayLayer(this.segment(), value); return this; }

    /// {@return `imageViewBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageViewBinding(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageViewBinding.get(segment, 0L, index); }
    /// {@return `imageViewBinding`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageViewBinding(MemorySegment segment) { return VkVideoPictureResourceInfoKHR.get_imageViewBinding(segment, 0L); }
    /// {@return `imageViewBinding` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewBindingAt(long index) { return VkVideoPictureResourceInfoKHR.get_imageViewBinding(this.segment(), index); }
    /// {@return `imageViewBinding`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewBinding() { return VkVideoPictureResourceInfoKHR.get_imageViewBinding(this.segment()); }
    /// Sets `imageViewBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageViewBinding(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageViewBinding.set(segment, 0L, index, value); }
    /// Sets `imageViewBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageViewBinding(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_imageViewBinding(segment, 0L, value); }
    /// Sets `imageViewBinding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR imageViewBindingAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_imageViewBinding(this.segment(), index, value); return this; }
    /// Sets `imageViewBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoPictureResourceInfoKHR imageViewBinding(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkVideoPictureResourceInfoKHR.set_imageViewBinding(this.segment(), value); return this; }

}
