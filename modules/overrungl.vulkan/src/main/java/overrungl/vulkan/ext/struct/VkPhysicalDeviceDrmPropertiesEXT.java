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
/// ### hasPrimary
/// [VarHandle][#VH_hasPrimary] - [Getter][#hasPrimary()] - [Setter][#hasPrimary(int)]
/// ### hasRender
/// [VarHandle][#VH_hasRender] - [Getter][#hasRender()] - [Setter][#hasRender(int)]
/// ### primaryMajor
/// [VarHandle][#VH_primaryMajor] - [Getter][#primaryMajor()] - [Setter][#primaryMajor(long)]
/// ### primaryMinor
/// [VarHandle][#VH_primaryMinor] - [Getter][#primaryMinor()] - [Setter][#primaryMinor(long)]
/// ### renderMajor
/// [VarHandle][#VH_renderMajor] - [Getter][#renderMajor()] - [Setter][#renderMajor(long)]
/// ### renderMinor
/// [VarHandle][#VH_renderMinor] - [Getter][#renderMinor()] - [Setter][#renderMinor(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDrmPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 hasPrimary;
///     VkBool32 hasRender;
///     int64_t primaryMajor;
///     int64_t primaryMinor;
///     int64_t renderMajor;
///     int64_t renderMinor;
/// } VkPhysicalDeviceDrmPropertiesEXT;
/// ```
public sealed class VkPhysicalDeviceDrmPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDrmPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `hasPrimary` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasPrimary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasPrimary"));
    /// The [VarHandle] of `hasRender` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasRender = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasRender"));
    /// The [VarHandle] of `primaryMajor` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_primaryMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMajor"));
    /// The [VarHandle] of `primaryMinor` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_primaryMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMinor"));
    /// The [VarHandle] of `renderMajor` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_renderMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMajor"));
    /// The [VarHandle] of `renderMinor` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_renderMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMinor"));

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDrmPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDrmPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDrmPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDrmPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDrmPropertiesEXT`
    public static VkPhysicalDeviceDrmPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDrmPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDrmPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDrmPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceDrmPropertiesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDrmPropertiesEXT`
    public static VkPhysicalDeviceDrmPropertiesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int hasPrimary, @CType("VkBool32") int hasRender, @CType("int64_t") long primaryMajor, @CType("int64_t") long primaryMinor, @CType("int64_t") long renderMajor, @CType("int64_t") long renderMinor) { return alloc(allocator).sType(sType).pNext(pNext).hasPrimary(hasPrimary).hasRender(hasRender).primaryMajor(primaryMajor).primaryMinor(primaryMinor).renderMajor(renderMajor).renderMinor(renderMinor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT copyFrom(VkPhysicalDeviceDrmPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDrmPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceDrmPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceDrmPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceDrmPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `hasPrimary` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasPrimary(MemorySegment segment, long index) { return (int) VH_hasPrimary.get(segment, 0L, index); }
    /// {@return `hasPrimary`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasPrimary(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_hasPrimary(segment, 0L); }
    /// {@return `hasPrimary`}
    public @CType("VkBool32") int hasPrimary() { return VkPhysicalDeviceDrmPropertiesEXT.get_hasPrimary(this.segment()); }
    /// Sets `hasPrimary` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasPrimary(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasPrimary.set(segment, 0L, index, value); }
    /// Sets `hasPrimary` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasPrimary(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasPrimary(segment, 0L, value); }
    /// Sets `hasPrimary` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT hasPrimary(@CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasPrimary(this.segment(), value); return this; }

    /// {@return `hasRender` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasRender(MemorySegment segment, long index) { return (int) VH_hasRender.get(segment, 0L, index); }
    /// {@return `hasRender`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasRender(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_hasRender(segment, 0L); }
    /// {@return `hasRender`}
    public @CType("VkBool32") int hasRender() { return VkPhysicalDeviceDrmPropertiesEXT.get_hasRender(this.segment()); }
    /// Sets `hasRender` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasRender(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasRender.set(segment, 0L, index, value); }
    /// Sets `hasRender` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasRender(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasRender(segment, 0L, value); }
    /// Sets `hasRender` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT hasRender(@CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasRender(this.segment(), value); return this; }

    /// {@return `primaryMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_primaryMajor(MemorySegment segment, long index) { return (long) VH_primaryMajor.get(segment, 0L, index); }
    /// {@return `primaryMajor`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_primaryMajor(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMajor(segment, 0L); }
    /// {@return `primaryMajor`}
    public @CType("int64_t") long primaryMajor() { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMajor(this.segment()); }
    /// Sets `primaryMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primaryMajor(MemorySegment segment, long index, @CType("int64_t") long value) { VH_primaryMajor.set(segment, 0L, index, value); }
    /// Sets `primaryMajor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primaryMajor(MemorySegment segment, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMajor(segment, 0L, value); }
    /// Sets `primaryMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT primaryMajor(@CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMajor(this.segment(), value); return this; }

    /// {@return `primaryMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_primaryMinor(MemorySegment segment, long index) { return (long) VH_primaryMinor.get(segment, 0L, index); }
    /// {@return `primaryMinor`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_primaryMinor(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMinor(segment, 0L); }
    /// {@return `primaryMinor`}
    public @CType("int64_t") long primaryMinor() { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMinor(this.segment()); }
    /// Sets `primaryMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primaryMinor(MemorySegment segment, long index, @CType("int64_t") long value) { VH_primaryMinor.set(segment, 0L, index, value); }
    /// Sets `primaryMinor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primaryMinor(MemorySegment segment, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMinor(segment, 0L, value); }
    /// Sets `primaryMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT primaryMinor(@CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMinor(this.segment(), value); return this; }

    /// {@return `renderMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_renderMajor(MemorySegment segment, long index) { return (long) VH_renderMajor.get(segment, 0L, index); }
    /// {@return `renderMajor`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_renderMajor(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMajor(segment, 0L); }
    /// {@return `renderMajor`}
    public @CType("int64_t") long renderMajor() { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMajor(this.segment()); }
    /// Sets `renderMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderMajor(MemorySegment segment, long index, @CType("int64_t") long value) { VH_renderMajor.set(segment, 0L, index, value); }
    /// Sets `renderMajor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderMajor(MemorySegment segment, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMajor(segment, 0L, value); }
    /// Sets `renderMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT renderMajor(@CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMajor(this.segment(), value); return this; }

    /// {@return `renderMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int64_t") long get_renderMinor(MemorySegment segment, long index) { return (long) VH_renderMinor.get(segment, 0L, index); }
    /// {@return `renderMinor`}
    /// @param segment the segment of the struct
    public static @CType("int64_t") long get_renderMinor(MemorySegment segment) { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMinor(segment, 0L); }
    /// {@return `renderMinor`}
    public @CType("int64_t") long renderMinor() { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMinor(this.segment()); }
    /// Sets `renderMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderMinor(MemorySegment segment, long index, @CType("int64_t") long value) { VH_renderMinor.set(segment, 0L, index, value); }
    /// Sets `renderMinor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderMinor(MemorySegment segment, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMinor(segment, 0L, value); }
    /// Sets `renderMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDrmPropertiesEXT renderMinor(@CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMinor(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceDrmPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceDrmPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDrmPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDrmPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDrmPropertiesEXT`
        public VkPhysicalDeviceDrmPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDrmPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDrmPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDrmPropertiesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceDrmPropertiesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `hasPrimary` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hasPrimaryAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_hasPrimary(this.segment(), index); }
        /// Sets `hasPrimary` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hasPrimaryAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasPrimary(this.segment(), index, value); return this; }

        /// {@return `hasRender` at the given index}
        /// @param index the index
        public @CType("VkBool32") int hasRenderAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_hasRender(this.segment(), index); }
        /// Sets `hasRender` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hasRenderAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDrmPropertiesEXT.set_hasRender(this.segment(), index, value); return this; }

        /// {@return `primaryMajor` at the given index}
        /// @param index the index
        public @CType("int64_t") long primaryMajorAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMajor(this.segment(), index); }
        /// Sets `primaryMajor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primaryMajorAt(long index, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMajor(this.segment(), index, value); return this; }

        /// {@return `primaryMinor` at the given index}
        /// @param index the index
        public @CType("int64_t") long primaryMinorAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_primaryMinor(this.segment(), index); }
        /// Sets `primaryMinor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer primaryMinorAt(long index, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_primaryMinor(this.segment(), index, value); return this; }

        /// {@return `renderMajor` at the given index}
        /// @param index the index
        public @CType("int64_t") long renderMajorAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMajor(this.segment(), index); }
        /// Sets `renderMajor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderMajorAt(long index, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMajor(this.segment(), index, value); return this; }

        /// {@return `renderMinor` at the given index}
        /// @param index the index
        public @CType("int64_t") long renderMinorAt(long index) { return VkPhysicalDeviceDrmPropertiesEXT.get_renderMinor(this.segment(), index); }
        /// Sets `renderMinor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer renderMinorAt(long index, @CType("int64_t") long value) { VkPhysicalDeviceDrmPropertiesEXT.set_renderMinor(this.segment(), index, value); return this; }

    }
}
