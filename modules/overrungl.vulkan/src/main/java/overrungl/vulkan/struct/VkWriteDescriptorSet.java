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
/// ### dstSet
/// [VarHandle][#VH_dstSet] - [Getter][#dstSet()] - [Setter][#dstSet(java.lang.foreign.MemorySegment)]
/// ### dstBinding
/// [VarHandle][#VH_dstBinding] - [Getter][#dstBinding()] - [Setter][#dstBinding(int)]
/// ### dstArrayElement
/// [VarHandle][#VH_dstArrayElement] - [Getter][#dstArrayElement()] - [Setter][#dstArrayElement(int)]
/// ### descriptorCount
/// [VarHandle][#VH_descriptorCount] - [Getter][#descriptorCount()] - [Setter][#descriptorCount(int)]
/// ### descriptorType
/// [VarHandle][#VH_descriptorType] - [Getter][#descriptorType()] - [Setter][#descriptorType(int)]
/// ### pImageInfo
/// [VarHandle][#VH_pImageInfo] - [Getter][#pImageInfo()] - [Setter][#pImageInfo(java.lang.foreign.MemorySegment)]
/// ### pBufferInfo
/// [VarHandle][#VH_pBufferInfo] - [Getter][#pBufferInfo()] - [Setter][#pBufferInfo(java.lang.foreign.MemorySegment)]
/// ### pTexelBufferView
/// [VarHandle][#VH_pTexelBufferView] - [Getter][#pTexelBufferView()] - [Setter][#pTexelBufferView(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkWriteDescriptorSet {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     VkDescriptorType descriptorType;
///     const VkDescriptorImageInfo * pImageInfo;
///     const VkDescriptorBufferInfo * pBufferInfo;
///     const VkBufferView * pTexelBufferView;
/// } VkWriteDescriptorSet;
/// ```
public sealed class VkWriteDescriptorSet extends Struct {
    /// The struct layout of `VkWriteDescriptorSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("pImageInfo"),
        ValueLayout.ADDRESS.withName("pBufferInfo"),
        ValueLayout.ADDRESS.withName("pTexelBufferView")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `dstSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSet"));
    /// The [VarHandle] of `dstBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    /// The [VarHandle] of `dstArrayElement` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `pImageInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pImageInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageInfo"));
    /// The [VarHandle] of `pBufferInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBufferInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferInfo"));
    /// The [VarHandle] of `pTexelBufferView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTexelBufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTexelBufferView"));

    /// Creates `VkWriteDescriptorSet` with the given segment.
    /// @param segment the memory segment
    public VkWriteDescriptorSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkWriteDescriptorSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSet`
    public static VkWriteDescriptorSet alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkWriteDescriptorSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkWriteDescriptorSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSet`
    public static VkWriteDescriptorSet allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSet, @CType("uint32_t") int dstBinding, @CType("uint32_t") int dstArrayElement, @CType("uint32_t") int descriptorCount, @CType("VkDescriptorType") int descriptorType, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pImageInfo, @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment pBufferInfo, @CType("const VkBufferView *") java.lang.foreign.MemorySegment pTexelBufferView) { return alloc(allocator).sType(sType).pNext(pNext).dstSet(dstSet).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount).descriptorType(descriptorType).pImageInfo(pImageInfo).pBufferInfo(pBufferInfo).pTexelBufferView(pTexelBufferView); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSet copyFrom(VkWriteDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkWriteDescriptorSet.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkWriteDescriptorSet.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkWriteDescriptorSet.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet sType(@CType("VkStructureType") int value) { VkWriteDescriptorSet.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkWriteDescriptorSet.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkWriteDescriptorSet.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pNext(this.segment(), value); return this; }

    /// {@return `dstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_dstSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstSet.get(segment, 0L, index); }
    /// {@return `dstSet`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_dstSet(MemorySegment segment) { return VkWriteDescriptorSet.get_dstSet(segment, 0L); }
    /// {@return `dstSet`}
    public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSet() { return VkWriteDescriptorSet.get_dstSet(this.segment()); }
    /// Sets `dstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSet(MemorySegment segment, long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VH_dstSet.set(segment, 0L, index, value); }
    /// Sets `dstSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSet(MemorySegment segment, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_dstSet(segment, 0L, value); }
    /// Sets `dstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstSet(@CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_dstSet(this.segment(), value); return this; }

    /// {@return `dstBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment, long index) { return (int) VH_dstBinding.get(segment, 0L, index); }
    /// {@return `dstBinding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment) { return VkWriteDescriptorSet.get_dstBinding(segment, 0L); }
    /// {@return `dstBinding`}
    public @CType("uint32_t") int dstBinding() { return VkWriteDescriptorSet.get_dstBinding(this.segment()); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstBinding.set(segment, 0L, index, value); }
    /// Sets `dstBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstBinding(segment, 0L, value); }
    /// Sets `dstBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstBinding(@CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstBinding(this.segment(), value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment, long index) { return (int) VH_dstArrayElement.get(segment, 0L, index); }
    /// {@return `dstArrayElement`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment) { return VkWriteDescriptorSet.get_dstArrayElement(segment, 0L); }
    /// {@return `dstArrayElement`}
    public @CType("uint32_t") int dstArrayElement() { return VkWriteDescriptorSet.get_dstArrayElement(this.segment()); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstArrayElement.set(segment, 0L, index, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstArrayElement(segment, 0L, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstArrayElement(@CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstArrayElement(this.segment(), value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment) { return VkWriteDescriptorSet.get_descriptorCount(segment, 0L); }
    /// {@return `descriptorCount`}
    public @CType("uint32_t") int descriptorCount() { return VkWriteDescriptorSet.get_descriptorCount(this.segment()); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_descriptorCount(segment, 0L, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet descriptorCount(@CType("uint32_t") int value) { VkWriteDescriptorSet.set_descriptorCount(this.segment(), value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorType") int get_descriptorType(MemorySegment segment) { return VkWriteDescriptorSet.get_descriptorType(segment, 0L); }
    /// {@return `descriptorType`}
    public @CType("VkDescriptorType") int descriptorType() { return VkWriteDescriptorSet.get_descriptorType(this.segment()); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, long index, @CType("VkDescriptorType") int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorType(MemorySegment segment, @CType("VkDescriptorType") int value) { VkWriteDescriptorSet.set_descriptorType(segment, 0L, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet descriptorType(@CType("VkDescriptorType") int value) { VkWriteDescriptorSet.set_descriptorType(this.segment(), value); return this; }

    /// {@return `pImageInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pImageInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pImageInfo.get(segment, 0L, index); }
    /// {@return `pImageInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment get_pImageInfo(MemorySegment segment) { return VkWriteDescriptorSet.get_pImageInfo(segment, 0L); }
    /// {@return `pImageInfo`}
    public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pImageInfo() { return VkWriteDescriptorSet.get_pImageInfo(this.segment()); }
    /// Sets `pImageInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pImageInfo(MemorySegment segment, long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VH_pImageInfo.set(segment, 0L, index, value); }
    /// Sets `pImageInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pImageInfo(MemorySegment segment, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pImageInfo(segment, 0L, value); }
    /// Sets `pImageInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pImageInfo(@CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pImageInfo(this.segment(), value); return this; }

    /// {@return `pBufferInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment get_pBufferInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBufferInfo.get(segment, 0L, index); }
    /// {@return `pBufferInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment get_pBufferInfo(MemorySegment segment) { return VkWriteDescriptorSet.get_pBufferInfo(segment, 0L); }
    /// {@return `pBufferInfo`}
    public @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment pBufferInfo() { return VkWriteDescriptorSet.get_pBufferInfo(this.segment()); }
    /// Sets `pBufferInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBufferInfo(MemorySegment segment, long index, @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment value) { VH_pBufferInfo.set(segment, 0L, index, value); }
    /// Sets `pBufferInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBufferInfo(MemorySegment segment, @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pBufferInfo(segment, 0L, value); }
    /// Sets `pBufferInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pBufferInfo(@CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pBufferInfo(this.segment(), value); return this; }

    /// {@return `pTexelBufferView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkBufferView *") java.lang.foreign.MemorySegment get_pTexelBufferView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTexelBufferView.get(segment, 0L, index); }
    /// {@return `pTexelBufferView`}
    /// @param segment the segment of the struct
    public static @CType("const VkBufferView *") java.lang.foreign.MemorySegment get_pTexelBufferView(MemorySegment segment) { return VkWriteDescriptorSet.get_pTexelBufferView(segment, 0L); }
    /// {@return `pTexelBufferView`}
    public @CType("const VkBufferView *") java.lang.foreign.MemorySegment pTexelBufferView() { return VkWriteDescriptorSet.get_pTexelBufferView(this.segment()); }
    /// Sets `pTexelBufferView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTexelBufferView(MemorySegment segment, long index, @CType("const VkBufferView *") java.lang.foreign.MemorySegment value) { VH_pTexelBufferView.set(segment, 0L, index, value); }
    /// Sets `pTexelBufferView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTexelBufferView(MemorySegment segment, @CType("const VkBufferView *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pTexelBufferView(segment, 0L, value); }
    /// Sets `pTexelBufferView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pTexelBufferView(@CType("const VkBufferView *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pTexelBufferView(this.segment(), value); return this; }

    /// A buffer of [VkWriteDescriptorSet].
    public static final class Buffer extends VkWriteDescriptorSet {
        private final long elementCount;

        /// Creates `VkWriteDescriptorSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkWriteDescriptorSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkWriteDescriptorSet`
        public VkWriteDescriptorSet asSlice(long index) { return new VkWriteDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkWriteDescriptorSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkWriteDescriptorSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkWriteDescriptorSet.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkWriteDescriptorSet.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkWriteDescriptorSet.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pNext(this.segment(), index, value); return this; }

        /// {@return `dstSet` at the given index}
        /// @param index the index
        public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSetAt(long index) { return VkWriteDescriptorSet.get_dstSet(this.segment(), index); }
        /// Sets `dstSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstSetAt(long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_dstSet(this.segment(), index, value); return this; }

        /// {@return `dstBinding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstBindingAt(long index) { return VkWriteDescriptorSet.get_dstBinding(this.segment(), index); }
        /// Sets `dstBinding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstBindingAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstBinding(this.segment(), index, value); return this; }

        /// {@return `dstArrayElement` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstArrayElementAt(long index) { return VkWriteDescriptorSet.get_dstArrayElement(this.segment(), index); }
        /// Sets `dstArrayElement` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstArrayElementAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_dstArrayElement(this.segment(), index, value); return this; }

        /// {@return `descriptorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorCountAt(long index) { return VkWriteDescriptorSet.get_descriptorCount(this.segment(), index); }
        /// Sets `descriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorCountAt(long index, @CType("uint32_t") int value) { VkWriteDescriptorSet.set_descriptorCount(this.segment(), index, value); return this; }

        /// {@return `descriptorType` at the given index}
        /// @param index the index
        public @CType("VkDescriptorType") int descriptorTypeAt(long index) { return VkWriteDescriptorSet.get_descriptorType(this.segment(), index); }
        /// Sets `descriptorType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorTypeAt(long index, @CType("VkDescriptorType") int value) { VkWriteDescriptorSet.set_descriptorType(this.segment(), index, value); return this; }

        /// {@return `pImageInfo` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment pImageInfoAt(long index) { return VkWriteDescriptorSet.get_pImageInfo(this.segment(), index); }
        /// Sets `pImageInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pImageInfoAt(long index, @CType("const VkDescriptorImageInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pImageInfo(this.segment(), index, value); return this; }

        /// {@return `pBufferInfo` at the given index}
        /// @param index the index
        public @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment pBufferInfoAt(long index) { return VkWriteDescriptorSet.get_pBufferInfo(this.segment(), index); }
        /// Sets `pBufferInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pBufferInfoAt(long index, @CType("const VkDescriptorBufferInfo *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pBufferInfo(this.segment(), index, value); return this; }

        /// {@return `pTexelBufferView` at the given index}
        /// @param index the index
        public @CType("const VkBufferView *") java.lang.foreign.MemorySegment pTexelBufferViewAt(long index) { return VkWriteDescriptorSet.get_pTexelBufferView(this.segment(), index); }
        /// Sets `pTexelBufferView` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTexelBufferViewAt(long index, @CType("const VkBufferView *") java.lang.foreign.MemorySegment value) { VkWriteDescriptorSet.set_pTexelBufferView(this.segment(), index, value); return this; }

    }
}
