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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### pCreateInfo
/// [VarHandle][#VH_pCreateInfo] - [Getter][#pCreateInfo()] - [Setter][#pCreateInfo(MemorySegment)]
/// ### planeAspect
/// [VarHandle][#VH_planeAspect] - [Getter][#planeAspect()] - [Setter][#planeAspect(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceImageMemoryRequirements {
///     VkStructureType sType;
///     const void * pNext;
///     const VkImageCreateInfo * pCreateInfo;
///     VkImageAspectFlagBits planeAspect;
/// } VkDeviceImageMemoryRequirements;
/// ```
public sealed class VkDeviceImageMemoryRequirements extends Struct {
    /// The struct layout of `VkDeviceImageMemoryRequirements`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pCreateInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));
    /// The [VarHandle] of `planeAspect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeAspect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect"));

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    public VkDeviceImageMemoryRequirements(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageMemoryRequirements of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceImageMemoryRequirements(segment); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceImageMemoryRequirements ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceImageMemoryRequirements(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceImageMemoryRequirements` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceImageMemoryRequirements` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceImageMemoryRequirements`
    public static VkDeviceImageMemoryRequirements alloc(SegmentAllocator allocator) { return new VkDeviceImageMemoryRequirements(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceImageMemoryRequirements` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceImageMemoryRequirements`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceImageMemoryRequirements` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceImageMemoryRequirements`
    public static VkDeviceImageMemoryRequirements allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("const VkImageCreateInfo *") MemorySegment pCreateInfo, @CType("VkImageAspectFlagBits") int planeAspect) { return alloc(allocator).sType(sType).pNext(pNext).pCreateInfo(pCreateInfo).planeAspect(planeAspect); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceImageMemoryRequirements copyFrom(VkDeviceImageMemoryRequirements src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceImageMemoryRequirements.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceImageMemoryRequirements.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceImageMemoryRequirements.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements sType(@CType("VkStructureType") int value) { VkDeviceImageMemoryRequirements.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceImageMemoryRequirements.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceImageMemoryRequirements.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements pNext(@CType("const void *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pNext(this.segment(), value); return this; }

    /// {@return `pCreateInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageCreateInfo *") MemorySegment get_pCreateInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pCreateInfo.get(segment, 0L, index); }
    /// {@return `pCreateInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageCreateInfo *") MemorySegment get_pCreateInfo(MemorySegment segment) { return VkDeviceImageMemoryRequirements.get_pCreateInfo(segment, 0L); }
    /// {@return `pCreateInfo`}
    public @CType("const VkImageCreateInfo *") MemorySegment pCreateInfo() { return VkDeviceImageMemoryRequirements.get_pCreateInfo(this.segment()); }
    /// Sets `pCreateInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCreateInfo(MemorySegment segment, long index, @CType("const VkImageCreateInfo *") MemorySegment value) { VH_pCreateInfo.set(segment, 0L, index, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCreateInfo(MemorySegment segment, @CType("const VkImageCreateInfo *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pCreateInfo(segment, 0L, value); }
    /// Sets `pCreateInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements pCreateInfo(@CType("const VkImageCreateInfo *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pCreateInfo(this.segment(), value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment, long index) { return (int) VH_planeAspect.get(segment, 0L, index); }
    /// {@return `planeAspect`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment) { return VkDeviceImageMemoryRequirements.get_planeAspect(segment, 0L); }
    /// {@return `planeAspect`}
    public @CType("VkImageAspectFlagBits") int planeAspect() { return VkDeviceImageMemoryRequirements.get_planeAspect(this.segment()); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, long index, @CType("VkImageAspectFlagBits") int value) { VH_planeAspect.set(segment, 0L, index, value); }
    /// Sets `planeAspect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, @CType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirements.set_planeAspect(segment, 0L, value); }
    /// Sets `planeAspect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceImageMemoryRequirements planeAspect(@CType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirements.set_planeAspect(this.segment(), value); return this; }

    /// A buffer of [VkDeviceImageMemoryRequirements].
    public static final class Buffer extends VkDeviceImageMemoryRequirements {
        private final long elementCount;

        /// Creates `VkDeviceImageMemoryRequirements.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceImageMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceImageMemoryRequirements`
        public VkDeviceImageMemoryRequirements asSlice(long index) { return new VkDeviceImageMemoryRequirements(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceImageMemoryRequirements`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceImageMemoryRequirements`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceImageMemoryRequirements.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceImageMemoryRequirements.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceImageMemoryRequirements.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pCreateInfo` at the given index}
        /// @param index the index
        public @CType("const VkImageCreateInfo *") MemorySegment pCreateInfoAt(long index) { return VkDeviceImageMemoryRequirements.get_pCreateInfo(this.segment(), index); }
        /// Sets `pCreateInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCreateInfoAt(long index, @CType("const VkImageCreateInfo *") MemorySegment value) { VkDeviceImageMemoryRequirements.set_pCreateInfo(this.segment(), index, value); return this; }

        /// {@return `planeAspect` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlagBits") int planeAspectAt(long index) { return VkDeviceImageMemoryRequirements.get_planeAspect(this.segment(), index); }
        /// Sets `planeAspect` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeAspectAt(long index, @CType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirements.set_planeAspect(this.segment(), index, value); return this; }

    }
}
