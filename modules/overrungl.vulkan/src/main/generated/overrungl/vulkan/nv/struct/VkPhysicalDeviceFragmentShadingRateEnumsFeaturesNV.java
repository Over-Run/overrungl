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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 fragmentShadingRateEnums;
///     (uint32_t) VkBool32 supersampleFragmentShadingRates;
///     (uint32_t) VkBool32 noInvocationFragmentShadingRates;
/// };
/// ```
public final class VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateEnums"),
        ValueLayout.JAVA_INT.withName("supersampleFragmentShadingRates"),
        ValueLayout.JAVA_INT.withName("noInvocationFragmentShadingRates")
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
    /// The byte offset of `fragmentShadingRateEnums`.
    public static final long OFFSET_fragmentShadingRateEnums = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateEnums"));
    /// The memory layout of `fragmentShadingRateEnums`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateEnums = LAYOUT.select(PathElement.groupElement("fragmentShadingRateEnums"));
    /// The [VarHandle] of `fragmentShadingRateEnums` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateEnums = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateEnums"));
    /// The byte offset of `supersampleFragmentShadingRates`.
    public static final long OFFSET_supersampleFragmentShadingRates = LAYOUT.byteOffset(PathElement.groupElement("supersampleFragmentShadingRates"));
    /// The memory layout of `supersampleFragmentShadingRates`.
    public static final MemoryLayout LAYOUT_supersampleFragmentShadingRates = LAYOUT.select(PathElement.groupElement("supersampleFragmentShadingRates"));
    /// The [VarHandle] of `supersampleFragmentShadingRates` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supersampleFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supersampleFragmentShadingRates"));
    /// The byte offset of `noInvocationFragmentShadingRates`.
    public static final long OFFSET_noInvocationFragmentShadingRates = LAYOUT.byteOffset(PathElement.groupElement("noInvocationFragmentShadingRates"));
    /// The memory layout of `noInvocationFragmentShadingRates`.
    public static final MemoryLayout LAYOUT_noInvocationFragmentShadingRates = LAYOUT.select(PathElement.groupElement("noInvocationFragmentShadingRates"));
    /// The [VarHandle] of `noInvocationFragmentShadingRates` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_noInvocationFragmentShadingRates = LAYOUT.arrayElementVarHandle(PathElement.groupElement("noInvocationFragmentShadingRates"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public static VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV copyFrom(VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateEnums` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateEnums(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateEnums.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateEnums`}
    public int fragmentShadingRateEnums() { return fragmentShadingRateEnums(this.segment(), 0L); }
    /// Sets `fragmentShadingRateEnums` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateEnums(MemorySegment segment, long index, int value) { VH_fragmentShadingRateEnums.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateEnums` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnums(int value) { fragmentShadingRateEnums(this.segment(), 0L, value); return this; }

    /// {@return `supersampleFragmentShadingRates` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supersampleFragmentShadingRates(MemorySegment segment, long index) { return (int) VH_supersampleFragmentShadingRates.get(segment, 0L, index); }
    /// {@return `supersampleFragmentShadingRates`}
    public int supersampleFragmentShadingRates() { return supersampleFragmentShadingRates(this.segment(), 0L); }
    /// Sets `supersampleFragmentShadingRates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supersampleFragmentShadingRates(MemorySegment segment, long index, int value) { VH_supersampleFragmentShadingRates.set(segment, 0L, index, value); }
    /// Sets `supersampleFragmentShadingRates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRates(int value) { supersampleFragmentShadingRates(this.segment(), 0L, value); return this; }

    /// {@return `noInvocationFragmentShadingRates` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int noInvocationFragmentShadingRates(MemorySegment segment, long index) { return (int) VH_noInvocationFragmentShadingRates.get(segment, 0L, index); }
    /// {@return `noInvocationFragmentShadingRates`}
    public int noInvocationFragmentShadingRates() { return noInvocationFragmentShadingRates(this.segment(), 0L); }
    /// Sets `noInvocationFragmentShadingRates` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void noInvocationFragmentShadingRates(MemorySegment segment, long index, int value) { VH_noInvocationFragmentShadingRates.set(segment, 0L, index, value); }
    /// Sets `noInvocationFragmentShadingRates` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRates(int value) { noInvocationFragmentShadingRates(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateEnums` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateEnumsAt(long index) { return fragmentShadingRateEnums(this.segment(), index); }
    /// Sets `fragmentShadingRateEnums` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV fragmentShadingRateEnumsAt(long index, int value) { fragmentShadingRateEnums(this.segment(), index, value); return this; }

    /// {@return `supersampleFragmentShadingRates` at the given index}
    /// @param index the index of the struct buffer
    public int supersampleFragmentShadingRatesAt(long index) { return supersampleFragmentShadingRates(this.segment(), index); }
    /// Sets `supersampleFragmentShadingRates` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV supersampleFragmentShadingRatesAt(long index, int value) { supersampleFragmentShadingRates(this.segment(), index, value); return this; }

    /// {@return `noInvocationFragmentShadingRates` at the given index}
    /// @param index the index of the struct buffer
    public int noInvocationFragmentShadingRatesAt(long index) { return noInvocationFragmentShadingRates(this.segment(), index); }
    /// Sets `noInvocationFragmentShadingRates` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV noInvocationFragmentShadingRatesAt(long index, int value) { noInvocationFragmentShadingRates(this.segment(), index, value); return this; }

}
