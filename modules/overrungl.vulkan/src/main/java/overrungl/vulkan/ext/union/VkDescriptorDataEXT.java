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
package overrungl.vulkan.ext.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pSampler
/// [VarHandle][#VH_pSampler] - [Getter][#pSampler()] - [Setter][#pSampler(java.lang.foreign.MemorySegment)]
/// ### pCombinedImageSampler
/// [VarHandle][#VH_pCombinedImageSampler] - [Getter][#pCombinedImageSampler()] - [Setter][#pCombinedImageSampler(java.lang.foreign.MemorySegment)]
/// ### pInputAttachmentImage
/// [VarHandle][#VH_pInputAttachmentImage] - [Getter][#pInputAttachmentImage()] - [Setter][#pInputAttachmentImage(java.lang.foreign.MemorySegment)]
/// ### pSampledImage
/// [VarHandle][#VH_pSampledImage] - [Getter][#pSampledImage()] - [Setter][#pSampledImage(java.lang.foreign.MemorySegment)]
/// ### pStorageImage
/// [VarHandle][#VH_pStorageImage] - [Getter][#pStorageImage()] - [Setter][#pStorageImage(java.lang.foreign.MemorySegment)]
/// ### pUniformTexelBuffer
/// [VarHandle][#VH_pUniformTexelBuffer] - [Getter][#pUniformTexelBuffer()] - [Setter][#pUniformTexelBuffer(java.lang.foreign.MemorySegment)]
/// ### pStorageTexelBuffer
/// [VarHandle][#VH_pStorageTexelBuffer] - [Getter][#pStorageTexelBuffer()] - [Setter][#pStorageTexelBuffer(java.lang.foreign.MemorySegment)]
/// ### pUniformBuffer
/// [VarHandle][#VH_pUniformBuffer] - [Getter][#pUniformBuffer()] - [Setter][#pUniformBuffer(java.lang.foreign.MemorySegment)]
/// ### pStorageBuffer
/// [VarHandle][#VH_pStorageBuffer] - [Getter][#pStorageBuffer()] - [Setter][#pStorageBuffer(java.lang.foreign.MemorySegment)]
/// ### accelerationStructure
/// [VarHandle][#VH_accelerationStructure] - [Getter][#accelerationStructure()] - [Setter][#accelerationStructure(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkDescriptorDataEXT {
///     const VkSampler * pSampler;
///     const VkDescriptorImageInfo * pCombinedImageSampler;
///     const VkDescriptorImageInfo * pInputAttachmentImage;
///     const VkDescriptorImageInfo * pSampledImage;
///     const VkDescriptorImageInfo * pStorageImage;
///     const VkDescriptorAddressInfoEXT * pUniformTexelBuffer;
///     const VkDescriptorAddressInfoEXT * pStorageTexelBuffer;
///     const VkDescriptorAddressInfoEXT * pUniformBuffer;
///     const VkDescriptorAddressInfoEXT * pStorageBuffer;
///     VkDeviceAddress accelerationStructure;
/// } VkDescriptorDataEXT;
/// ```
public sealed class VkDescriptorDataEXT extends Union {
    /// The union layout of `VkDescriptorDataEXT`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pSampler"),
        ValueLayout.ADDRESS.withName("pCombinedImageSampler"),
        ValueLayout.ADDRESS.withName("pInputAttachmentImage"),
        ValueLayout.ADDRESS.withName("pSampledImage"),
        ValueLayout.ADDRESS.withName("pStorageImage"),
        ValueLayout.ADDRESS.withName("pUniformTexelBuffer"),
        ValueLayout.ADDRESS.withName("pStorageTexelBuffer"),
        ValueLayout.ADDRESS.withName("pUniformBuffer"),
        ValueLayout.ADDRESS.withName("pStorageBuffer"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    /// The [VarHandle] of `pSampler` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampler"));
    /// The [VarHandle] of `pCombinedImageSampler` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCombinedImageSampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCombinedImageSampler"));
    /// The [VarHandle] of `pInputAttachmentImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pInputAttachmentImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInputAttachmentImage"));
    /// The [VarHandle] of `pSampledImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSampledImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampledImage"));
    /// The [VarHandle] of `pStorageImage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStorageImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageImage"));
    /// The [VarHandle] of `pUniformTexelBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUniformTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformTexelBuffer"));
    /// The [VarHandle] of `pStorageTexelBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStorageTexelBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageTexelBuffer"));
    /// The [VarHandle] of `pUniformBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUniformBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUniformBuffer"));
    /// The [VarHandle] of `pStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStorageBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStorageBuffer"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));

    /// Creates `VkDescriptorDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkDescriptorDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorDataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDescriptorDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDescriptorDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDescriptorDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorDataEXT`
    public static VkDescriptorDataEXT alloc(SegmentAllocator allocator) { return new VkDescriptorDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDescriptorDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorDataEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorDataEXT copyFrom(VkDescriptorDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `pSampler` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkSampler *") java.lang.foreign.MemorySegment get_pSampler(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSampler.get(segment, 0L, index); }
    /// {@return `pSampler`}
    /// @param segment the segment of the union
    public static @CType("const VkSampler *") java.lang.foreign.MemorySegment get_pSampler(MemorySegment segment) { return VkDescriptorDataEXT.get_pSampler(segment, 0L); }
    /// {@return `pSampler`}
    public @CType("const VkSampler *") java.lang.foreign.MemorySegment pSampler() { return VkDescriptorDataEXT.get_pSampler(this.segment()); }
    /// Sets `pSampler` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pSampler(MemorySegment segment, long index, @CType("const VkSampler *") java.lang.foreign.MemorySegment value) { VH_pSampler.set(segment, 0L, index, value); }
    /// Sets `pSampler` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pSampler(MemorySegment segment, @CType("const VkSampler *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampler(segment, 0L, value); }
    /// Sets `pSampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSampler(@CType("const VkSampler *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampler(this.segment(), value); return this; }

    /// {@return `pCombinedImageSampler` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pCombinedImageSampler(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCombinedImageSampler.get(segment, 0L, index); }
    /// {@return `pCombinedImageSampler`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pCombinedImageSampler(MemorySegment segment) { return VkDescriptorDataEXT.get_pCombinedImageSampler(segment, 0L); }
    /// {@return `pCombinedImageSampler`}
    public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pCombinedImageSampler() { return VkDescriptorDataEXT.get_pCombinedImageSampler(this.segment()); }
    /// Sets `pCombinedImageSampler` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pCombinedImageSampler(MemorySegment segment, long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VH_pCombinedImageSampler.set(segment, 0L, index, value); }
    /// Sets `pCombinedImageSampler` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pCombinedImageSampler(MemorySegment segment, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pCombinedImageSampler(segment, 0L, value); }
    /// Sets `pCombinedImageSampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pCombinedImageSampler(@CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pCombinedImageSampler(this.segment(), value); return this; }

    /// {@return `pInputAttachmentImage` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pInputAttachmentImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pInputAttachmentImage.get(segment, 0L, index); }
    /// {@return `pInputAttachmentImage`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pInputAttachmentImage(MemorySegment segment) { return VkDescriptorDataEXT.get_pInputAttachmentImage(segment, 0L); }
    /// {@return `pInputAttachmentImage`}
    public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pInputAttachmentImage() { return VkDescriptorDataEXT.get_pInputAttachmentImage(this.segment()); }
    /// Sets `pInputAttachmentImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pInputAttachmentImage(MemorySegment segment, long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VH_pInputAttachmentImage.set(segment, 0L, index, value); }
    /// Sets `pInputAttachmentImage` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pInputAttachmentImage(MemorySegment segment, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pInputAttachmentImage(segment, 0L, value); }
    /// Sets `pInputAttachmentImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pInputAttachmentImage(@CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pInputAttachmentImage(this.segment(), value); return this; }

    /// {@return `pSampledImage` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pSampledImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSampledImage.get(segment, 0L, index); }
    /// {@return `pSampledImage`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pSampledImage(MemorySegment segment) { return VkDescriptorDataEXT.get_pSampledImage(segment, 0L); }
    /// {@return `pSampledImage`}
    public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pSampledImage() { return VkDescriptorDataEXT.get_pSampledImage(this.segment()); }
    /// Sets `pSampledImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pSampledImage(MemorySegment segment, long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VH_pSampledImage.set(segment, 0L, index, value); }
    /// Sets `pSampledImage` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pSampledImage(MemorySegment segment, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampledImage(segment, 0L, value); }
    /// Sets `pSampledImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pSampledImage(@CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampledImage(this.segment(), value); return this; }

    /// {@return `pStorageImage` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pStorageImage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStorageImage.get(segment, 0L, index); }
    /// {@return `pStorageImage`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pStorageImage(MemorySegment segment) { return VkDescriptorDataEXT.get_pStorageImage(segment, 0L); }
    /// {@return `pStorageImage`}
    public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pStorageImage() { return VkDescriptorDataEXT.get_pStorageImage(this.segment()); }
    /// Sets `pStorageImage` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pStorageImage(MemorySegment segment, long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VH_pStorageImage.set(segment, 0L, index, value); }
    /// Sets `pStorageImage` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pStorageImage(MemorySegment segment, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageImage(segment, 0L, value); }
    /// Sets `pStorageImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageImage(@CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageImage(this.segment(), value); return this; }

    /// {@return `pUniformTexelBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pUniformTexelBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUniformTexelBuffer.get(segment, 0L, index); }
    /// {@return `pUniformTexelBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pUniformTexelBuffer(MemorySegment segment) { return VkDescriptorDataEXT.get_pUniformTexelBuffer(segment, 0L); }
    /// {@return `pUniformTexelBuffer`}
    public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pUniformTexelBuffer() { return VkDescriptorDataEXT.get_pUniformTexelBuffer(this.segment()); }
    /// Sets `pUniformTexelBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pUniformTexelBuffer(MemorySegment segment, long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pUniformTexelBuffer.set(segment, 0L, index, value); }
    /// Sets `pUniformTexelBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pUniformTexelBuffer(MemorySegment segment, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformTexelBuffer(segment, 0L, value); }
    /// Sets `pUniformTexelBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformTexelBuffer(@CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformTexelBuffer(this.segment(), value); return this; }

    /// {@return `pStorageTexelBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pStorageTexelBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStorageTexelBuffer.get(segment, 0L, index); }
    /// {@return `pStorageTexelBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pStorageTexelBuffer(MemorySegment segment) { return VkDescriptorDataEXT.get_pStorageTexelBuffer(segment, 0L); }
    /// {@return `pStorageTexelBuffer`}
    public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pStorageTexelBuffer() { return VkDescriptorDataEXT.get_pStorageTexelBuffer(this.segment()); }
    /// Sets `pStorageTexelBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pStorageTexelBuffer(MemorySegment segment, long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pStorageTexelBuffer.set(segment, 0L, index, value); }
    /// Sets `pStorageTexelBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pStorageTexelBuffer(MemorySegment segment, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageTexelBuffer(segment, 0L, value); }
    /// Sets `pStorageTexelBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageTexelBuffer(@CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageTexelBuffer(this.segment(), value); return this; }

    /// {@return `pUniformBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pUniformBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUniformBuffer.get(segment, 0L, index); }
    /// {@return `pUniformBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pUniformBuffer(MemorySegment segment) { return VkDescriptorDataEXT.get_pUniformBuffer(segment, 0L); }
    /// {@return `pUniformBuffer`}
    public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pUniformBuffer() { return VkDescriptorDataEXT.get_pUniformBuffer(this.segment()); }
    /// Sets `pUniformBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pUniformBuffer(MemorySegment segment, long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pUniformBuffer.set(segment, 0L, index, value); }
    /// Sets `pUniformBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pUniformBuffer(MemorySegment segment, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformBuffer(segment, 0L, value); }
    /// Sets `pUniformBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pUniformBuffer(@CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformBuffer(this.segment(), value); return this; }

    /// {@return `pStorageBuffer` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pStorageBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStorageBuffer.get(segment, 0L, index); }
    /// {@return `pStorageBuffer`}
    /// @param segment the segment of the union
    public static @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment get_pStorageBuffer(MemorySegment segment) { return VkDescriptorDataEXT.get_pStorageBuffer(segment, 0L); }
    /// {@return `pStorageBuffer`}
    public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pStorageBuffer() { return VkDescriptorDataEXT.get_pStorageBuffer(this.segment()); }
    /// Sets `pStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_pStorageBuffer(MemorySegment segment, long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pStorageBuffer.set(segment, 0L, index, value); }
    /// Sets `pStorageBuffer` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_pStorageBuffer(MemorySegment segment, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageBuffer(segment, 0L, value); }
    /// Sets `pStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT pStorageBuffer(@CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageBuffer(this.segment(), value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkDeviceAddress") long get_accelerationStructure(MemorySegment segment, long index) { return (long) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    /// @param segment the segment of the union
    public static @CType("VkDeviceAddress") long get_accelerationStructure(MemorySegment segment) { return VkDescriptorDataEXT.get_accelerationStructure(segment, 0L); }
    /// {@return `accelerationStructure`}
    public @CType("VkDeviceAddress") long accelerationStructure() { return VkDescriptorDataEXT.get_accelerationStructure(this.segment()); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, long index, @CType("VkDeviceAddress") long value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, @CType("VkDeviceAddress") long value) { VkDescriptorDataEXT.set_accelerationStructure(segment, 0L, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorDataEXT accelerationStructure(@CType("VkDeviceAddress") long value) { VkDescriptorDataEXT.set_accelerationStructure(this.segment(), value); return this; }

    /// A buffer of [VkDescriptorDataEXT].
    public static final class Buffer extends VkDescriptorDataEXT {
        private final long elementCount;

        /// Creates `VkDescriptorDataEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDescriptorDataEXT`.
        /// @param index the index of the union buffer
        /// @return the slice of `VkDescriptorDataEXT`
        public VkDescriptorDataEXT asSlice(long index) { return new VkDescriptorDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDescriptorDataEXT`.
        /// @param index the index of the union buffer
        /// @param count the count
        /// @return the slice of `VkDescriptorDataEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `pSampler` at the given index}
        /// @param index the index
        public @CType("const VkSampler *") java.lang.foreign.MemorySegment pSamplerAt(long index) { return VkDescriptorDataEXT.get_pSampler(this.segment(), index); }
        /// Sets `pSampler` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSamplerAt(long index, @CType("const VkSampler *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampler(this.segment(), index, value); return this; }

        /// {@return `pCombinedImageSampler` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pCombinedImageSamplerAt(long index) { return VkDescriptorDataEXT.get_pCombinedImageSampler(this.segment(), index); }
        /// Sets `pCombinedImageSampler` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCombinedImageSamplerAt(long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pCombinedImageSampler(this.segment(), index, value); return this; }

        /// {@return `pInputAttachmentImage` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pInputAttachmentImageAt(long index) { return VkDescriptorDataEXT.get_pInputAttachmentImage(this.segment(), index); }
        /// Sets `pInputAttachmentImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pInputAttachmentImageAt(long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pInputAttachmentImage(this.segment(), index, value); return this; }

        /// {@return `pSampledImage` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pSampledImageAt(long index) { return VkDescriptorDataEXT.get_pSampledImage(this.segment(), index); }
        /// Sets `pSampledImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSampledImageAt(long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pSampledImage(this.segment(), index, value); return this; }

        /// {@return `pStorageImage` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pStorageImageAt(long index) { return VkDescriptorDataEXT.get_pStorageImage(this.segment(), index); }
        /// Sets `pStorageImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStorageImageAt(long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageImage(this.segment(), index, value); return this; }

        /// {@return `pUniformTexelBuffer` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pUniformTexelBufferAt(long index) { return VkDescriptorDataEXT.get_pUniformTexelBuffer(this.segment(), index); }
        /// Sets `pUniformTexelBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUniformTexelBufferAt(long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformTexelBuffer(this.segment(), index, value); return this; }

        /// {@return `pStorageTexelBuffer` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pStorageTexelBufferAt(long index) { return VkDescriptorDataEXT.get_pStorageTexelBuffer(this.segment(), index); }
        /// Sets `pStorageTexelBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStorageTexelBufferAt(long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageTexelBuffer(this.segment(), index, value); return this; }

        /// {@return `pUniformBuffer` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pUniformBufferAt(long index) { return VkDescriptorDataEXT.get_pUniformBuffer(this.segment(), index); }
        /// Sets `pUniformBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUniformBufferAt(long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pUniformBuffer(this.segment(), index, value); return this; }

        /// {@return `pStorageBuffer` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment pStorageBufferAt(long index) { return VkDescriptorDataEXT.get_pStorageBuffer(this.segment(), index); }
        /// Sets `pStorageBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pStorageBufferAt(long index, @CType("const VkDescriptorAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDescriptorDataEXT.set_pStorageBuffer(this.segment(), index, value); return this; }

        /// {@return `accelerationStructure` at the given index}
        /// @param index the index
        public @CType("VkDeviceAddress") long accelerationStructureAt(long index) { return VkDescriptorDataEXT.get_accelerationStructure(this.segment(), index); }
        /// Sets `accelerationStructure` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureAt(long index, @CType("VkDeviceAddress") long value) { VkDescriptorDataEXT.set_accelerationStructure(this.segment(), index, value); return this; }

    }
}
