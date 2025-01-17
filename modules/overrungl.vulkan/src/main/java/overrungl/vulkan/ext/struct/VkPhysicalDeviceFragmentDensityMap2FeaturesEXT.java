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
/// ### fragmentDensityMapDeferred
/// [VarHandle][#VH_fragmentDensityMapDeferred] - [Getter][#fragmentDensityMapDeferred()] - [Setter][#fragmentDensityMapDeferred(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMap2FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 fragmentDensityMapDeferred;
/// } VkPhysicalDeviceFragmentDensityMap2FeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceFragmentDensityMap2FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDeferred")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentDensityMapDeferred` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentDensityMapDeferred = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDeferred"));

    /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMap2FeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int fragmentDensityMapDeferred) { return alloc(allocator).sType(sType).pNext(pNext).fragmentDensityMapDeferred(fragmentDensityMapDeferred); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMap2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityMapDeferred` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentDensityMapDeferred(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapDeferred.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapDeferred`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentDensityMapDeferred(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_fragmentDensityMapDeferred(segment, 0L); }
    /// {@return `fragmentDensityMapDeferred`}
    public @CType("VkBool32") int fragmentDensityMapDeferred() { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_fragmentDensityMapDeferred(this.segment()); }
    /// Sets `fragmentDensityMapDeferred` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityMapDeferred(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentDensityMapDeferred.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapDeferred` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityMapDeferred(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_fragmentDensityMapDeferred(segment, 0L, value); }
    /// Sets `fragmentDensityMapDeferred` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT fragmentDensityMapDeferred(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_fragmentDensityMapDeferred(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentDensityMap2FeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceFragmentDensityMap2FeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`
        public VkPhysicalDeviceFragmentDensityMap2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMap2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentDensityMap2FeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `fragmentDensityMapDeferred` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentDensityMapDeferredAt(long index) { return VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.get_fragmentDensityMapDeferred(this.segment(), index); }
        /// Sets `fragmentDensityMapDeferred` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentDensityMapDeferredAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentDensityMap2FeaturesEXT.set_fragmentDensityMapDeferred(this.segment(), index, value); return this; }

    }
}
