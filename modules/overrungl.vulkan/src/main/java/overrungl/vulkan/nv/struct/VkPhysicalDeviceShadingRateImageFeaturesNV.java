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
package overrungl.vulkan.nv.struct;

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
/// ### shadingRateImage
/// [VarHandle][#VH_shadingRateImage] - [Getter][#shadingRateImage()] - [Setter][#shadingRateImage(int)]
/// ### shadingRateCoarseSampleOrder
/// [VarHandle][#VH_shadingRateCoarseSampleOrder] - [Getter][#shadingRateCoarseSampleOrder()] - [Setter][#shadingRateCoarseSampleOrder(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShadingRateImageFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shadingRateImage;
///     VkBool32 shadingRateCoarseSampleOrder;
/// } VkPhysicalDeviceShadingRateImageFeaturesNV;
/// ```
public sealed class VkPhysicalDeviceShadingRateImageFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shadingRateImage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImage"));
    /// The [VarHandle] of `shadingRateCoarseSampleOrder` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shadingRateCoarseSampleOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateCoarseSampleOrder"));

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int shadingRateImage, @CType("VkBool32") int shadingRateCoarseSampleOrder) { return alloc(allocator).sType(sType).pNext(pNext).shadingRateImage(shadingRateImage).shadingRateCoarseSampleOrder(shadingRateCoarseSampleOrder); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV copyFrom(VkPhysicalDeviceShadingRateImageFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `shadingRateImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shadingRateImage(MemorySegment segment, long index) { return (int) VH_shadingRateImage.get(segment, 0L, index); }
    /// {@return `shadingRateImage`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shadingRateImage(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(segment, 0L); }
    /// {@return `shadingRateImage`}
    public @CType("VkBool32") int shadingRateImage() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(this.segment()); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateImage(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shadingRateImage.set(segment, 0L, index, value); }
    /// Sets `shadingRateImage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateImage(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(segment, 0L, value); }
    /// Sets `shadingRateImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(@CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(this.segment(), value); return this; }

    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shadingRateCoarseSampleOrder(MemorySegment segment, long index) { return (int) VH_shadingRateCoarseSampleOrder.get(segment, 0L, index); }
    /// {@return `shadingRateCoarseSampleOrder`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shadingRateCoarseSampleOrder(MemorySegment segment) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(segment, 0L); }
    /// {@return `shadingRateCoarseSampleOrder`}
    public @CType("VkBool32") int shadingRateCoarseSampleOrder() { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(this.segment()); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shadingRateCoarseSampleOrder(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shadingRateCoarseSampleOrder.set(segment, 0L, index, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shadingRateCoarseSampleOrder(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(segment, 0L, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(@CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceShadingRateImageFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceShadingRateImageFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
        public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `shadingRateImage` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shadingRateImageAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateImage(this.segment(), index); }
        /// Sets `shadingRateImage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateImageAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateImage(this.segment(), index, value); return this; }

        /// {@return `shadingRateCoarseSampleOrder` at the given index}
        /// @param index the index
        public @CType("VkBool32") int shadingRateCoarseSampleOrderAt(long index) { return VkPhysicalDeviceShadingRateImageFeaturesNV.get_shadingRateCoarseSampleOrder(this.segment(), index); }
        /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer shadingRateCoarseSampleOrderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShadingRateImageFeaturesNV.set_shadingRateCoarseSampleOrder(this.segment(), index, value); return this; }

    }
}
