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
/// ### srcSet
/// [VarHandle][#VH_srcSet] - [Getter][#srcSet()] - [Setter][#srcSet(java.lang.foreign.MemorySegment)]
/// ### srcBinding
/// [VarHandle][#VH_srcBinding] - [Getter][#srcBinding()] - [Setter][#srcBinding(int)]
/// ### srcArrayElement
/// [VarHandle][#VH_srcArrayElement] - [Getter][#srcArrayElement()] - [Setter][#srcArrayElement(int)]
/// ### dstSet
/// [VarHandle][#VH_dstSet] - [Getter][#dstSet()] - [Setter][#dstSet(java.lang.foreign.MemorySegment)]
/// ### dstBinding
/// [VarHandle][#VH_dstBinding] - [Getter][#dstBinding()] - [Setter][#dstBinding(int)]
/// ### dstArrayElement
/// [VarHandle][#VH_dstArrayElement] - [Getter][#dstArrayElement()] - [Setter][#dstArrayElement(int)]
/// ### descriptorCount
/// [VarHandle][#VH_descriptorCount] - [Getter][#descriptorCount()] - [Setter][#descriptorCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCopyDescriptorSet {
///     VkStructureType sType;
///     const void * pNext;
///     VkDescriptorSet srcSet;
///     uint32_t srcBinding;
///     uint32_t srcArrayElement;
///     VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
/// } VkCopyDescriptorSet;
/// ```
public sealed class VkCopyDescriptorSet extends Struct {
    /// The struct layout of `VkCopyDescriptorSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcSet"),
        ValueLayout.JAVA_INT.withName("srcBinding"),
        ValueLayout.JAVA_INT.withName("srcArrayElement"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_srcSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSet"));
    /// The [VarHandle] of `srcBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBinding"));
    /// The [VarHandle] of `srcArrayElement` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcArrayElement"));
    /// The [VarHandle] of `dstSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSet"));
    /// The [VarHandle] of `dstBinding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    /// The [VarHandle] of `dstArrayElement` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));

    /// Creates `VkCopyDescriptorSet` with the given segment.
    /// @param segment the memory segment
    public VkCopyDescriptorSet(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyDescriptorSet of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyDescriptorSet ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCopyDescriptorSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyDescriptorSet`
    public static VkCopyDescriptorSet alloc(SegmentAllocator allocator) { return new VkCopyDescriptorSet(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCopyDescriptorSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyDescriptorSet`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCopyDescriptorSet` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyDescriptorSet`
    public static VkCopyDescriptorSet allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment srcSet, @CType("uint32_t") int srcBinding, @CType("uint32_t") int srcArrayElement, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSet, @CType("uint32_t") int dstBinding, @CType("uint32_t") int dstArrayElement, @CType("uint32_t") int descriptorCount) { return alloc(allocator).sType(sType).pNext(pNext).srcSet(srcSet).srcBinding(srcBinding).srcArrayElement(srcArrayElement).dstSet(dstSet).dstBinding(dstBinding).dstArrayElement(dstArrayElement).descriptorCount(descriptorCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyDescriptorSet copyFrom(VkCopyDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCopyDescriptorSet.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCopyDescriptorSet.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCopyDescriptorSet.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet sType(@CType("VkStructureType") int value) { VkCopyDescriptorSet.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCopyDescriptorSet.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCopyDescriptorSet.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_pNext(this.segment(), value); return this; }

    /// {@return `srcSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_srcSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_srcSet.get(segment, 0L, index); }
    /// {@return `srcSet`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_srcSet(MemorySegment segment) { return VkCopyDescriptorSet.get_srcSet(segment, 0L); }
    /// {@return `srcSet`}
    public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment srcSet() { return VkCopyDescriptorSet.get_srcSet(this.segment()); }
    /// Sets `srcSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcSet(MemorySegment segment, long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VH_srcSet.set(segment, 0L, index, value); }
    /// Sets `srcSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcSet(MemorySegment segment, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_srcSet(segment, 0L, value); }
    /// Sets `srcSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcSet(@CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_srcSet(this.segment(), value); return this; }

    /// {@return `srcBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcBinding(MemorySegment segment, long index) { return (int) VH_srcBinding.get(segment, 0L, index); }
    /// {@return `srcBinding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcBinding(MemorySegment segment) { return VkCopyDescriptorSet.get_srcBinding(segment, 0L); }
    /// {@return `srcBinding`}
    public @CType("uint32_t") int srcBinding() { return VkCopyDescriptorSet.get_srcBinding(this.segment()); }
    /// Sets `srcBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcBinding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcBinding.set(segment, 0L, index, value); }
    /// Sets `srcBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcBinding(MemorySegment segment, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcBinding(segment, 0L, value); }
    /// Sets `srcBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcBinding(@CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcBinding(this.segment(), value); return this; }

    /// {@return `srcArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_srcArrayElement(MemorySegment segment, long index) { return (int) VH_srcArrayElement.get(segment, 0L, index); }
    /// {@return `srcArrayElement`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_srcArrayElement(MemorySegment segment) { return VkCopyDescriptorSet.get_srcArrayElement(segment, 0L); }
    /// {@return `srcArrayElement`}
    public @CType("uint32_t") int srcArrayElement() { return VkCopyDescriptorSet.get_srcArrayElement(this.segment()); }
    /// Sets `srcArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcArrayElement(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_srcArrayElement.set(segment, 0L, index, value); }
    /// Sets `srcArrayElement` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcArrayElement(MemorySegment segment, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcArrayElement(segment, 0L, value); }
    /// Sets `srcArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcArrayElement(@CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcArrayElement(this.segment(), value); return this; }

    /// {@return `dstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_dstSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstSet.get(segment, 0L, index); }
    /// {@return `dstSet`}
    /// @param segment the segment of the struct
    public static @CType("VkDescriptorSet") java.lang.foreign.MemorySegment get_dstSet(MemorySegment segment) { return VkCopyDescriptorSet.get_dstSet(segment, 0L); }
    /// {@return `dstSet`}
    public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSet() { return VkCopyDescriptorSet.get_dstSet(this.segment()); }
    /// Sets `dstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstSet(MemorySegment segment, long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VH_dstSet.set(segment, 0L, index, value); }
    /// Sets `dstSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstSet(MemorySegment segment, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_dstSet(segment, 0L, value); }
    /// Sets `dstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstSet(@CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_dstSet(this.segment(), value); return this; }

    /// {@return `dstBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment, long index) { return (int) VH_dstBinding.get(segment, 0L, index); }
    /// {@return `dstBinding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstBinding(MemorySegment segment) { return VkCopyDescriptorSet.get_dstBinding(segment, 0L); }
    /// {@return `dstBinding`}
    public @CType("uint32_t") int dstBinding() { return VkCopyDescriptorSet.get_dstBinding(this.segment()); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstBinding.set(segment, 0L, index, value); }
    /// Sets `dstBinding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstBinding(MemorySegment segment, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstBinding(segment, 0L, value); }
    /// Sets `dstBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstBinding(@CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstBinding(this.segment(), value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment, long index) { return (int) VH_dstArrayElement.get(segment, 0L, index); }
    /// {@return `dstArrayElement`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_dstArrayElement(MemorySegment segment) { return VkCopyDescriptorSet.get_dstArrayElement(segment, 0L); }
    /// {@return `dstArrayElement`}
    public @CType("uint32_t") int dstArrayElement() { return VkCopyDescriptorSet.get_dstArrayElement(this.segment()); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_dstArrayElement.set(segment, 0L, index, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstArrayElement(MemorySegment segment, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstArrayElement(segment, 0L, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstArrayElement(@CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstArrayElement(this.segment(), value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorCount(MemorySegment segment) { return VkCopyDescriptorSet.get_descriptorCount(segment, 0L); }
    /// {@return `descriptorCount`}
    public @CType("uint32_t") int descriptorCount() { return VkCopyDescriptorSet.get_descriptorCount(this.segment()); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_descriptorCount(segment, 0L, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet descriptorCount(@CType("uint32_t") int value) { VkCopyDescriptorSet.set_descriptorCount(this.segment(), value); return this; }

    /// A buffer of [VkCopyDescriptorSet].
    public static final class Buffer extends VkCopyDescriptorSet {
        private final long elementCount;

        /// Creates `VkCopyDescriptorSet.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCopyDescriptorSet`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCopyDescriptorSet`
        public VkCopyDescriptorSet asSlice(long index) { return new VkCopyDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCopyDescriptorSet`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCopyDescriptorSet`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCopyDescriptorSet.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCopyDescriptorSet.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCopyDescriptorSet.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_pNext(this.segment(), index, value); return this; }

        /// {@return `srcSet` at the given index}
        /// @param index the index
        public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment srcSetAt(long index) { return VkCopyDescriptorSet.get_srcSet(this.segment(), index); }
        /// Sets `srcSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcSetAt(long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_srcSet(this.segment(), index, value); return this; }

        /// {@return `srcBinding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int srcBindingAt(long index) { return VkCopyDescriptorSet.get_srcBinding(this.segment(), index); }
        /// Sets `srcBinding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcBindingAt(long index, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcBinding(this.segment(), index, value); return this; }

        /// {@return `srcArrayElement` at the given index}
        /// @param index the index
        public @CType("uint32_t") int srcArrayElementAt(long index) { return VkCopyDescriptorSet.get_srcArrayElement(this.segment(), index); }
        /// Sets `srcArrayElement` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer srcArrayElementAt(long index, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_srcArrayElement(this.segment(), index, value); return this; }

        /// {@return `dstSet` at the given index}
        /// @param index the index
        public @CType("VkDescriptorSet") java.lang.foreign.MemorySegment dstSetAt(long index) { return VkCopyDescriptorSet.get_dstSet(this.segment(), index); }
        /// Sets `dstSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstSetAt(long index, @CType("VkDescriptorSet") java.lang.foreign.MemorySegment value) { VkCopyDescriptorSet.set_dstSet(this.segment(), index, value); return this; }

        /// {@return `dstBinding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstBindingAt(long index) { return VkCopyDescriptorSet.get_dstBinding(this.segment(), index); }
        /// Sets `dstBinding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstBindingAt(long index, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstBinding(this.segment(), index, value); return this; }

        /// {@return `dstArrayElement` at the given index}
        /// @param index the index
        public @CType("uint32_t") int dstArrayElementAt(long index) { return VkCopyDescriptorSet.get_dstArrayElement(this.segment(), index); }
        /// Sets `dstArrayElement` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dstArrayElementAt(long index, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_dstArrayElement(this.segment(), index, value); return this; }

        /// {@return `descriptorCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int descriptorCountAt(long index) { return VkCopyDescriptorSet.get_descriptorCount(this.segment(), index); }
        /// Sets `descriptorCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer descriptorCountAt(long index, @CType("uint32_t") int value) { VkCopyDescriptorSet.set_descriptorCount(this.segment(), index, value); return this; }

    }
}
