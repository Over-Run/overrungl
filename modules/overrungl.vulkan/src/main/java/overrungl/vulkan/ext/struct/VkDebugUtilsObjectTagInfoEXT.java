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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### objectType
/// [VarHandle][#VH_objectType] - [Getter][#objectType()] - [Setter][#objectType(int)]
/// ### objectHandle
/// [VarHandle][#VH_objectHandle] - [Getter][#objectHandle()] - [Setter][#objectHandle(long)]
/// ### tagName
/// [VarHandle][#VH_tagName] - [Getter][#tagName()] - [Setter][#tagName(long)]
/// ### tagSize
/// [VarHandle][#VH_tagSize] - [Getter][#tagSize()] - [Setter][#tagSize(long)]
/// ### pTag
/// [VarHandle][#VH_pTag] - [Getter][#pTag()] - [Setter][#pTag(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugUtilsObjectTagInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkObjectType objectType;
///     uint64_t objectHandle;
///     uint64_t tagName;
///     size_t tagSize;
///     const void * pTag;
/// } VkDebugUtilsObjectTagInfoEXT;
/// ```
public sealed class VkDebugUtilsObjectTagInfoEXT extends Struct {
    /// The struct layout of `VkDebugUtilsObjectTagInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        ValueLayout.JAVA_LONG.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_objectHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `tagName` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    /// The [VarHandle] of `tagSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    /// The [VarHandle] of `pTag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsObjectTagInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectTagInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsObjectTagInfoEXT(segment); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectTagInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsObjectTagInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDebugUtilsObjectTagInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsObjectTagInfoEXT`
    public static VkDebugUtilsObjectTagInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsObjectTagInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsObjectTagInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsObjectTagInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugUtilsObjectTagInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsObjectTagInfoEXT`
    public static VkDebugUtilsObjectTagInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkObjectType") int objectType, @CType("uint64_t") long objectHandle, @CType("uint64_t") long tagName, @CType("size_t") long tagSize, @CType("const void *") MemorySegment pTag) { return alloc(allocator).sType(sType).pNext(pNext).objectType(objectType).objectHandle(objectHandle).tagName(tagName).tagSize(tagSize).pTag(pTag); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT copyFrom(VkDebugUtilsObjectTagInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugUtilsObjectTagInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugUtilsObjectTagInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT sType(@CType("VkStructureType") int value) { VkDebugUtilsObjectTagInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDebugUtilsObjectTagInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment, long index) { return (int) VH_objectType.get(segment, 0L, index); }
    /// {@return `objectType`}
    /// @param segment the segment of the struct
    public static @CType("VkObjectType") int get_objectType(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_objectType(segment, 0L); }
    /// {@return `objectType`}
    public @CType("VkObjectType") int objectType() { return VkDebugUtilsObjectTagInfoEXT.get_objectType(this.segment()); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, long index, @CType("VkObjectType") int value) { VH_objectType.set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectType(MemorySegment segment, @CType("VkObjectType") int value) { VkDebugUtilsObjectTagInfoEXT.set_objectType(segment, 0L, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectType(@CType("VkObjectType") int value) { VkDebugUtilsObjectTagInfoEXT.set_objectType(this.segment(), value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get(segment, 0L, index); }
    /// {@return `objectHandle`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_objectHandle(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_objectHandle(segment, 0L); }
    /// {@return `objectHandle`}
    public @CType("uint64_t") long objectHandle() { return VkDebugUtilsObjectTagInfoEXT.get_objectHandle(this.segment()); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_objectHandle.set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectHandle(MemorySegment segment, @CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_objectHandle(segment, 0L, value); }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectHandle(@CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_objectHandle(this.segment(), value); return this; }

    /// {@return `tagName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_tagName(MemorySegment segment, long index) { return (long) VH_tagName.get(segment, 0L, index); }
    /// {@return `tagName`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_tagName(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_tagName(segment, 0L); }
    /// {@return `tagName`}
    public @CType("uint64_t") long tagName() { return VkDebugUtilsObjectTagInfoEXT.get_tagName(this.segment()); }
    /// Sets `tagName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_tagName.set(segment, 0L, index, value); }
    /// Sets `tagName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagName(MemorySegment segment, @CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagName(segment, 0L, value); }
    /// Sets `tagName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagName(@CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagName(this.segment(), value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_tagSize(MemorySegment segment, long index) { return (long) VH_tagSize.get(segment, 0L, index); }
    /// {@return `tagSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_tagSize(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_tagSize(segment, 0L); }
    /// {@return `tagSize`}
    public @CType("size_t") long tagSize() { return VkDebugUtilsObjectTagInfoEXT.get_tagSize(this.segment()); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_tagSize.set(segment, 0L, index, value); }
    /// Sets `tagSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tagSize(MemorySegment segment, @CType("size_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagSize(segment, 0L, value); }
    /// Sets `tagSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagSize(@CType("size_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagSize(this.segment(), value); return this; }

    /// {@return `pTag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pTag(MemorySegment segment, long index) { return (MemorySegment) VH_pTag.get(segment, 0L, index); }
    /// {@return `pTag`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pTag(MemorySegment segment) { return VkDebugUtilsObjectTagInfoEXT.get_pTag(segment, 0L); }
    /// {@return `pTag`}
    public @CType("const void *") MemorySegment pTag() { return VkDebugUtilsObjectTagInfoEXT.get_pTag(this.segment()); }
    /// Sets `pTag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pTag.set(segment, 0L, index, value); }
    /// Sets `pTag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTag(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pTag(segment, 0L, value); }
    /// Sets `pTag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT pTag(@CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pTag(this.segment(), value); return this; }

    /// A buffer of [VkDebugUtilsObjectTagInfoEXT].
    public static final class Buffer extends VkDebugUtilsObjectTagInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugUtilsObjectTagInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugUtilsObjectTagInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugUtilsObjectTagInfoEXT`
        public VkDebugUtilsObjectTagInfoEXT asSlice(long index) { return new VkDebugUtilsObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugUtilsObjectTagInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugUtilsObjectTagInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugUtilsObjectTagInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `objectType` at the given index}
        /// @param index the index
        public @CType("VkObjectType") int objectTypeAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_objectType(this.segment(), index); }
        /// Sets `objectType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer objectTypeAt(long index, @CType("VkObjectType") int value) { VkDebugUtilsObjectTagInfoEXT.set_objectType(this.segment(), index, value); return this; }

        /// {@return `objectHandle` at the given index}
        /// @param index the index
        public @CType("uint64_t") long objectHandleAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_objectHandle(this.segment(), index); }
        /// Sets `objectHandle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer objectHandleAt(long index, @CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_objectHandle(this.segment(), index, value); return this; }

        /// {@return `tagName` at the given index}
        /// @param index the index
        public @CType("uint64_t") long tagNameAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_tagName(this.segment(), index); }
        /// Sets `tagName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tagNameAt(long index, @CType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagName(this.segment(), index, value); return this; }

        /// {@return `tagSize` at the given index}
        /// @param index the index
        public @CType("size_t") long tagSizeAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_tagSize(this.segment(), index); }
        /// Sets `tagSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer tagSizeAt(long index, @CType("size_t") long value) { VkDebugUtilsObjectTagInfoEXT.set_tagSize(this.segment(), index, value); return this; }

        /// {@return `pTag` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pTagAt(long index) { return VkDebugUtilsObjectTagInfoEXT.get_pTag(this.segment(), index); }
        /// Sets `pTag` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pTagAt(long index, @CType("const void *") MemorySegment value) { VkDebugUtilsObjectTagInfoEXT.set_pTag(this.segment(), index, value); return this; }

    }
}
