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
/// ### subgroupSizeControl
/// [VarHandle][#VH_subgroupSizeControl] - [Getter][#subgroupSizeControl()] - [Setter][#subgroupSizeControl(int)]
/// ### computeFullSubgroups
/// [VarHandle][#VH_computeFullSubgroups] - [Getter][#computeFullSubgroups()] - [Setter][#computeFullSubgroups(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceSubgroupSizeControlFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 subgroupSizeControl;
///     VkBool32 computeFullSubgroups;
/// } VkPhysicalDeviceSubgroupSizeControlFeatures;
/// ```
public sealed class VkPhysicalDeviceSubgroupSizeControlFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceSubgroupSizeControlFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `subgroupSizeControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subgroupSizeControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSizeControl"));
    /// The [VarHandle] of `computeFullSubgroups` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computeFullSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeFullSubgroups"));

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceSubgroupSizeControlFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(segment); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlFeatures`
    public static VkPhysicalDeviceSubgroupSizeControlFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlFeatures`
    public static VkPhysicalDeviceSubgroupSizeControlFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int subgroupSizeControl, @CType("VkBool32") int computeFullSubgroups) { return alloc(allocator).sType(sType).pNext(pNext).subgroupSizeControl(subgroupSizeControl).computeFullSubgroups(computeFullSubgroups); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeatures copyFrom(VkPhysicalDeviceSubgroupSizeControlFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `subgroupSizeControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_subgroupSizeControl(MemorySegment segment, long index) { return (int) VH_subgroupSizeControl.get(segment, 0L, index); }
    /// {@return `subgroupSizeControl`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_subgroupSizeControl(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_subgroupSizeControl(segment, 0L); }
    /// {@return `subgroupSizeControl`}
    public @CType("VkBool32") int subgroupSizeControl() { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_subgroupSizeControl(this.segment()); }
    /// Sets `subgroupSizeControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subgroupSizeControl(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_subgroupSizeControl.set(segment, 0L, index, value); }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subgroupSizeControl(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_subgroupSizeControl(segment, 0L, value); }
    /// Sets `subgroupSizeControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(@CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_subgroupSizeControl(this.segment(), value); return this; }

    /// {@return `computeFullSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_computeFullSubgroups(MemorySegment segment, long index) { return (int) VH_computeFullSubgroups.get(segment, 0L, index); }
    /// {@return `computeFullSubgroups`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_computeFullSubgroups(MemorySegment segment) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_computeFullSubgroups(segment, 0L); }
    /// {@return `computeFullSubgroups`}
    public @CType("VkBool32") int computeFullSubgroups() { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_computeFullSubgroups(this.segment()); }
    /// Sets `computeFullSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computeFullSubgroups(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_computeFullSubgroups.set(segment, 0L, index, value); }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computeFullSubgroups(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_computeFullSubgroups(segment, 0L, value); }
    /// Sets `computeFullSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(@CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_computeFullSubgroups(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceSubgroupSizeControlFeatures].
    public static final class Buffer extends VkPhysicalDeviceSubgroupSizeControlFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlFeatures`
        public VkPhysicalDeviceSubgroupSizeControlFeatures asSlice(long index) { return new VkPhysicalDeviceSubgroupSizeControlFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `subgroupSizeControl` at the given index}
        /// @param index the index
        public @CType("VkBool32") int subgroupSizeControlAt(long index) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_subgroupSizeControl(this.segment(), index); }
        /// Sets `subgroupSizeControl` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subgroupSizeControlAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_subgroupSizeControl(this.segment(), index, value); return this; }

        /// {@return `computeFullSubgroups` at the given index}
        /// @param index the index
        public @CType("VkBool32") int computeFullSubgroupsAt(long index) { return VkPhysicalDeviceSubgroupSizeControlFeatures.get_computeFullSubgroups(this.segment(), index); }
        /// Sets `computeFullSubgroups` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer computeFullSubgroupsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.set_computeFullSubgroups(this.segment(), index, value); return this; }

    }
}
