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
/// ### fragmentShadingRateEnums
/// [VarHandle][#VH_fragmentShadingRateEnums] - [Getter][#fragmentShadingRateEnums()] - [Setter][#fragmentShadingRateEnums(int)]
/// ### supersampleFragmentShadingRates
/// [VarHandle][#VH_supersampleFragmentShadingRates] - [Getter][#supersampleFragmentShadingRates()] - [Setter][#supersampleFragmentShadingRates(int)]
/// ### noInvocationFragmentShadingRates
/// [VarHandle][#VH_noInvocationFragmentShadingRates] - [Getter][#noInvocationFragmentShadingRates()] - [Setter][#noInvocationFragmentShadingRates(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 fragmentShadingRateEnums;
///     VkBool32 supersampleFragmentShadingRates;
///     VkBool32 noInvocationFragmentShadingRates;
/// } VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV;
/// ```
public sealed class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fragmentShadingRateEnums` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateEnums = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateEnums"));
    /// The [VarHandle] of `supersampleFragmentShadingRates` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supersampleFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supersampleFragmentShadingRates"));
    /// The [VarHandle] of `noInvocationFragmentShadingRates` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_noInvocationFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("noInvocationFragmentShadingRates"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int fragmentShadingRateEnums, @CType("VkBool32") int supersampleFragmentShadingRates, @CType("VkBool32") int noInvocationFragmentShadingRates) { return alloc(allocator).sType(sType).pNext(pNext).fragmentShadingRateEnums(fragmentShadingRateEnums).supersampleFragmentShadingRates(supersampleFragmentShadingRates).noInvocationFragmentShadingRates(noInvocationFragmentShadingRates); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV copyFrom(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateEnums` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateEnums(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateEnums.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateEnums`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateEnums(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_fragmentShadingRateEnums(segment, 0L); }
    /// {@return `fragmentShadingRateEnums`}
    public @CType("VkBool32") int fragmentShadingRateEnums() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_fragmentShadingRateEnums(this.segment()); }
    /// Sets `fragmentShadingRateEnums` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateEnums(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateEnums.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateEnums` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateEnums(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_fragmentShadingRateEnums(segment, 0L, value); }
    /// Sets `fragmentShadingRateEnums` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_fragmentShadingRateEnums(this.segment(), value); return this; }

    /// {@return `supersampleFragmentShadingRates` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_supersampleFragmentShadingRates(MemorySegment segment, long index) { return (int) VH_supersampleFragmentShadingRates.get(segment, 0L, index); }
    /// {@return `supersampleFragmentShadingRates`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_supersampleFragmentShadingRates(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_supersampleFragmentShadingRates(segment, 0L); }
    /// {@return `supersampleFragmentShadingRates`}
    public @CType("VkBool32") int supersampleFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_supersampleFragmentShadingRates(this.segment()); }
    /// Sets `supersampleFragmentShadingRates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supersampleFragmentShadingRates(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_supersampleFragmentShadingRates.set(segment, 0L, index, value); }
    /// Sets `supersampleFragmentShadingRates` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supersampleFragmentShadingRates(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_supersampleFragmentShadingRates(segment, 0L, value); }
    /// Sets `supersampleFragmentShadingRates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_supersampleFragmentShadingRates(this.segment(), value); return this; }

    /// {@return `noInvocationFragmentShadingRates` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_noInvocationFragmentShadingRates(MemorySegment segment, long index) { return (int) VH_noInvocationFragmentShadingRates.get(segment, 0L, index); }
    /// {@return `noInvocationFragmentShadingRates`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_noInvocationFragmentShadingRates(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_noInvocationFragmentShadingRates(segment, 0L); }
    /// {@return `noInvocationFragmentShadingRates`}
    public @CType("VkBool32") int noInvocationFragmentShadingRates() { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_noInvocationFragmentShadingRates(this.segment()); }
    /// Sets `noInvocationFragmentShadingRates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_noInvocationFragmentShadingRates(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_noInvocationFragmentShadingRates.set(segment, 0L, index, value); }
    /// Sets `noInvocationFragmentShadingRates` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_noInvocationFragmentShadingRates(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_noInvocationFragmentShadingRates(segment, 0L, value); }
    /// Sets `noInvocationFragmentShadingRates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(@CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_noInvocationFragmentShadingRates(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
        public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateEnums` at the given index}
        /// @param index the index
        public @CType("VkBool32") int fragmentShadingRateEnumsAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_fragmentShadingRateEnums(this.segment(), index); }
        /// Sets `fragmentShadingRateEnums` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateEnumsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_fragmentShadingRateEnums(this.segment(), index, value); return this; }

        /// {@return `supersampleFragmentShadingRates` at the given index}
        /// @param index the index
        public @CType("VkBool32") int supersampleFragmentShadingRatesAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_supersampleFragmentShadingRates(this.segment(), index); }
        /// Sets `supersampleFragmentShadingRates` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supersampleFragmentShadingRatesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_supersampleFragmentShadingRates(this.segment(), index, value); return this; }

        /// {@return `noInvocationFragmentShadingRates` at the given index}
        /// @param index the index
        public @CType("VkBool32") int noInvocationFragmentShadingRatesAt(long index) { return VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.get_noInvocationFragmentShadingRates(this.segment(), index); }
        /// Sets `noInvocationFragmentShadingRates` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer noInvocationFragmentShadingRatesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV.set_noInvocationFragmentShadingRates(this.segment(), index, value); return this; }

    }
}
