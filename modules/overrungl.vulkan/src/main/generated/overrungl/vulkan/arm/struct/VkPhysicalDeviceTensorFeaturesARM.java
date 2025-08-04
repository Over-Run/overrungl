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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceTensorFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 tensorNonPacked;
///     (uint32_t) VkBool32 shaderTensorAccess;
///     (uint32_t) VkBool32 shaderStorageTensorArrayDynamicIndexing;
///     (uint32_t) VkBool32 shaderStorageTensorArrayNonUniformIndexing;
///     (uint32_t) VkBool32 descriptorBindingStorageTensorUpdateAfterBind;
///     (uint32_t) VkBool32 tensors;
/// };
/// ```
public final class VkPhysicalDeviceTensorFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTensorFeaturesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorNonPacked"),
        ValueLayout.JAVA_INT.withName("shaderTensorAccess"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayDynamicIndexing"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexing"),
        ValueLayout.JAVA_INT.withName("descriptorBindingStorageTensorUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("tensors")
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
    /// The byte offset of `tensorNonPacked`.
    public static final long OFFSET_tensorNonPacked = LAYOUT.byteOffset(PathElement.groupElement("tensorNonPacked"));
    /// The memory layout of `tensorNonPacked`.
    public static final MemoryLayout LAYOUT_tensorNonPacked = LAYOUT.select(PathElement.groupElement("tensorNonPacked"));
    /// The [VarHandle] of `tensorNonPacked` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensorNonPacked = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorNonPacked"));
    /// The byte offset of `shaderTensorAccess`.
    public static final long OFFSET_shaderTensorAccess = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorAccess"));
    /// The memory layout of `shaderTensorAccess`.
    public static final MemoryLayout LAYOUT_shaderTensorAccess = LAYOUT.select(PathElement.groupElement("shaderTensorAccess"));
    /// The [VarHandle] of `shaderTensorAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTensorAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTensorAccess"));
    /// The byte offset of `shaderStorageTensorArrayDynamicIndexing`.
    public static final long OFFSET_shaderStorageTensorArrayDynamicIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    /// The memory layout of `shaderStorageTensorArrayDynamicIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayDynamicIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    /// The [VarHandle] of `shaderStorageTensorArrayDynamicIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageTensorArrayDynamicIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayDynamicIndexing"));
    /// The byte offset of `shaderStorageTensorArrayNonUniformIndexing`.
    public static final long OFFSET_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    /// The memory layout of `shaderStorageTensorArrayNonUniformIndexing`.
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    /// The [VarHandle] of `shaderStorageTensorArrayNonUniformIndexing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageTensorArrayNonUniformIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexing"));
    /// The byte offset of `descriptorBindingStorageTensorUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    /// The memory layout of `descriptorBindingStorageTensorUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingStorageTensorUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingStorageTensorUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingStorageTensorUpdateAfterBind"));
    /// The byte offset of `tensors`.
    public static final long OFFSET_tensors = LAYOUT.byteOffset(PathElement.groupElement("tensors"));
    /// The memory layout of `tensors`.
    public static final MemoryLayout LAYOUT_tensors = LAYOUT.select(PathElement.groupElement("tensors"));
    /// The [VarHandle] of `tensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensors"));

    /// Creates `VkPhysicalDeviceTensorFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTensorFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTensorFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTensorFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTensorFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTensorFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTensorFeaturesARM`
    public static VkPhysicalDeviceTensorFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTensorFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTensorFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTensorFeaturesARM`
    public static VkPhysicalDeviceTensorFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTensorFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM copyFrom(VkPhysicalDeviceTensorFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTensorFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTensorFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTensorFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tensorNonPacked` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tensorNonPacked(MemorySegment segment, long index) { return (int) VH_tensorNonPacked.get(segment, 0L, index); }
    /// {@return `tensorNonPacked`}
    public int tensorNonPacked() { return tensorNonPacked(this.segment(), 0L); }
    /// Sets `tensorNonPacked` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorNonPacked(MemorySegment segment, long index, int value) { VH_tensorNonPacked.set(segment, 0L, index, value); }
    /// Sets `tensorNonPacked` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPacked(int value) { tensorNonPacked(this.segment(), 0L, value); return this; }

    /// {@return `shaderTensorAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTensorAccess(MemorySegment segment, long index) { return (int) VH_shaderTensorAccess.get(segment, 0L, index); }
    /// {@return `shaderTensorAccess`}
    public int shaderTensorAccess() { return shaderTensorAccess(this.segment(), 0L); }
    /// Sets `shaderTensorAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTensorAccess(MemorySegment segment, long index, int value) { VH_shaderTensorAccess.set(segment, 0L, index, value); }
    /// Sets `shaderTensorAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccess(int value) { shaderTensorAccess(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageTensorArrayDynamicIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageTensorArrayDynamicIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTensorArrayDynamicIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTensorArrayDynamicIndexing`}
    public int shaderStorageTensorArrayDynamicIndexing() { return shaderStorageTensorArrayDynamicIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageTensorArrayDynamicIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageTensorArrayDynamicIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageTensorArrayDynamicIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTensorArrayDynamicIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexing(int value) { shaderStorageTensorArrayDynamicIndexing(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageTensorArrayNonUniformIndexing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageTensorArrayNonUniformIndexing(MemorySegment segment, long index) { return (int) VH_shaderStorageTensorArrayNonUniformIndexing.get(segment, 0L, index); }
    /// {@return `shaderStorageTensorArrayNonUniformIndexing`}
    public int shaderStorageTensorArrayNonUniformIndexing() { return shaderStorageTensorArrayNonUniformIndexing(this.segment(), 0L); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageTensorArrayNonUniformIndexing(MemorySegment segment, long index, int value) { VH_shaderStorageTensorArrayNonUniformIndexing.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexing(int value) { shaderStorageTensorArrayNonUniformIndexing(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingStorageTensorUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingStorageTensorUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingStorageTensorUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingStorageTensorUpdateAfterBind`}
    public int descriptorBindingStorageTensorUpdateAfterBind() { return descriptorBindingStorageTensorUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingStorageTensorUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingStorageTensorUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingStorageTensorUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingStorageTensorUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBind(int value) { descriptorBindingStorageTensorUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// {@return `tensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tensors(MemorySegment segment, long index) { return (int) VH_tensors.get(segment, 0L, index); }
    /// {@return `tensors`}
    public int tensors() { return tensors(this.segment(), 0L); }
    /// Sets `tensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensors(MemorySegment segment, long index, int value) { VH_tensors.set(segment, 0L, index, value); }
    /// Sets `tensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM tensors(int value) { tensors(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTensorFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTensorFeaturesARM`
    public VkPhysicalDeviceTensorFeaturesARM asSlice(long index) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTensorFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTensorFeaturesARM`
    public VkPhysicalDeviceTensorFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceTensorFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTensorFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM at(long index, Consumer<VkPhysicalDeviceTensorFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tensorNonPacked` at the given index}
    /// @param index the index of the struct buffer
    public int tensorNonPackedAt(long index) { return tensorNonPacked(this.segment(), index); }
    /// Sets `tensorNonPacked` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPackedAt(long index, int value) { tensorNonPacked(this.segment(), index, value); return this; }

    /// {@return `shaderTensorAccess` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTensorAccessAt(long index) { return shaderTensorAccess(this.segment(), index); }
    /// Sets `shaderTensorAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccessAt(long index, int value) { shaderTensorAccess(this.segment(), index, value); return this; }

    /// {@return `shaderStorageTensorArrayDynamicIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageTensorArrayDynamicIndexingAt(long index) { return shaderStorageTensorArrayDynamicIndexing(this.segment(), index); }
    /// Sets `shaderStorageTensorArrayDynamicIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexingAt(long index, int value) { shaderStorageTensorArrayDynamicIndexing(this.segment(), index, value); return this; }

    /// {@return `shaderStorageTensorArrayNonUniformIndexing` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageTensorArrayNonUniformIndexingAt(long index) { return shaderStorageTensorArrayNonUniformIndexing(this.segment(), index); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexingAt(long index, int value) { shaderStorageTensorArrayNonUniformIndexing(this.segment(), index, value); return this; }

    /// {@return `descriptorBindingStorageTensorUpdateAfterBind` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorBindingStorageTensorUpdateAfterBindAt(long index) { return descriptorBindingStorageTensorUpdateAfterBind(this.segment(), index); }
    /// Sets `descriptorBindingStorageTensorUpdateAfterBind` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBindAt(long index, int value) { descriptorBindingStorageTensorUpdateAfterBind(this.segment(), index, value); return this; }

    /// {@return `tensors` at the given index}
    /// @param index the index of the struct buffer
    public int tensorsAt(long index) { return tensors(this.segment(), index); }
    /// Sets `tensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorFeaturesARM tensorsAt(long index, int value) { tensors(this.segment(), index, value); return this; }

}
