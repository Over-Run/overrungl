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
package overrungl.vulkan.ext.struct;

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
/// ### indirectExecutionSet
/// [VarHandle][#VH_indirectExecutionSet] - [Getter][#indirectExecutionSet()] - [Setter][#indirectExecutionSet(java.lang.foreign.MemorySegment)]
/// ### indirectCommandsLayout
/// [VarHandle][#VH_indirectCommandsLayout] - [Getter][#indirectCommandsLayout()] - [Setter][#indirectCommandsLayout(java.lang.foreign.MemorySegment)]
/// ### maxSequenceCount
/// [VarHandle][#VH_maxSequenceCount] - [Getter][#maxSequenceCount()] - [Setter][#maxSequenceCount(int)]
/// ### maxDrawCount
/// [VarHandle][#VH_maxDrawCount] - [Getter][#maxDrawCount()] - [Setter][#maxDrawCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeneratedCommandsMemoryRequirementsInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectExecutionSetEXT indirectExecutionSet;
///     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     uint32_t maxSequenceCount;
///     uint32_t maxDrawCount;
/// } VkGeneratedCommandsMemoryRequirementsInfoEXT;
/// ```
public sealed class VkGeneratedCommandsMemoryRequirementsInfoEXT extends Struct {
    /// The struct layout of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("indirectExecutionSet"),
        ValueLayout.ADDRESS.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `indirectExecutionSet` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `maxSequenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    /// The [VarHandle] of `maxDrawCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkGeneratedCommandsMemoryRequirementsInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment indirectExecutionSet, @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment indirectCommandsLayout, @CType("uint32_t") int maxSequenceCount, @CType("uint32_t") int maxDrawCount) { return alloc(allocator).sType(sType).pNext(pNext).indirectExecutionSet(indirectExecutionSet).indirectCommandsLayout(indirectCommandsLayout).maxSequenceCount(maxSequenceCount).maxDrawCount(maxDrawCount); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT copyFrom(VkGeneratedCommandsMemoryRequirementsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(@CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment get_indirectExecutionSet(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_indirectExecutionSet.get(segment, 0L, index); }
    /// {@return `indirectExecutionSet`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment get_indirectExecutionSet(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectExecutionSet(segment, 0L); }
    /// {@return `indirectExecutionSet`}
    public @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment indirectExecutionSet() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectExecutionSet(this.segment()); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectExecutionSet(MemorySegment segment, long index, @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment value) { VH_indirectExecutionSet.set(segment, 0L, index, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectExecutionSet(MemorySegment segment, @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectExecutionSet(segment, 0L, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(@CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectExecutionSet(this.segment(), value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment get_indirectCommandsLayout(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment get_indirectCommandsLayout(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectCommandsLayout(segment, 0L); }
    /// {@return `indirectCommandsLayout`}
    public @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment indirectCommandsLayout() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectCommandsLayout(this.segment()); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, long index, @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_indirectCommandsLayout(MemorySegment segment, @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectCommandsLayout(segment, 0L, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(@CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectCommandsLayout(this.segment(), value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSequenceCount(MemorySegment segment, long index) { return (int) VH_maxSequenceCount.get(segment, 0L, index); }
    /// {@return `maxSequenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSequenceCount(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxSequenceCount(segment, 0L); }
    /// {@return `maxSequenceCount`}
    public @CType("uint32_t") int maxSequenceCount() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxSequenceCount(this.segment()); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSequenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSequenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxSequenceCount(segment, 0L, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(@CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxSequenceCount(this.segment(), value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDrawCount(MemorySegment segment, long index) { return (int) VH_maxDrawCount.get(segment, 0L, index); }
    /// {@return `maxDrawCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDrawCount(MemorySegment segment) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxDrawCount(segment, 0L); }
    /// {@return `maxDrawCount`}
    public @CType("uint32_t") int maxDrawCount() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxDrawCount(this.segment()); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDrawCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDrawCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDrawCount(MemorySegment segment, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxDrawCount(segment, 0L, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(@CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxDrawCount(this.segment(), value); return this; }

    /// A buffer of [VkGeneratedCommandsMemoryRequirementsInfoEXT].
    public static final class Buffer extends VkGeneratedCommandsMemoryRequirementsInfoEXT {
        private final long elementCount;

        /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`
        public VkGeneratedCommandsMemoryRequirementsInfoEXT asSlice(long index) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `indirectExecutionSet` at the given index}
        /// @param index the index
        public @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment indirectExecutionSetAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectExecutionSet(this.segment(), index); }
        /// Sets `indirectExecutionSet` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectExecutionSetAt(long index, @CType("VkIndirectExecutionSetEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectExecutionSet(this.segment(), index, value); return this; }

        /// {@return `indirectCommandsLayout` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment indirectCommandsLayoutAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_indirectCommandsLayout(this.segment(), index); }
        /// Sets `indirectCommandsLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer indirectCommandsLayoutAt(long index, @CType("VkIndirectCommandsLayoutEXT") java.lang.foreign.MemorySegment value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_indirectCommandsLayout(this.segment(), index, value); return this; }

        /// {@return `maxSequenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSequenceCountAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxSequenceCount(this.segment(), index); }
        /// Sets `maxSequenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSequenceCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxSequenceCount(this.segment(), index, value); return this; }

        /// {@return `maxDrawCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDrawCountAt(long index) { return VkGeneratedCommandsMemoryRequirementsInfoEXT.get_maxDrawCount(this.segment(), index); }
        /// Sets `maxDrawCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDrawCountAt(long index, @CType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.set_maxDrawCount(this.segment(), index, value); return this; }

    }
}
