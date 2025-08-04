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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDeviceFaultInfoEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     char description[256];
///     VkDeviceFaultAddressInfoEXT* pAddressInfos;
///     VkDeviceFaultVendorInfoEXT* pVendorInfos;
///     void* pVendorBinaryData;
/// };
/// ```
public final class VkDeviceFaultInfoEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.ADDRESS.withName("pAddressInfos"),
        ValueLayout.ADDRESS.withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
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
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `pAddressInfos`.
    public static final long OFFSET_pAddressInfos = LAYOUT.byteOffset(PathElement.groupElement("pAddressInfos"));
    /// The memory layout of `pAddressInfos`.
    public static final MemoryLayout LAYOUT_pAddressInfos = LAYOUT.select(PathElement.groupElement("pAddressInfos"));
    /// The [VarHandle] of `pAddressInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAddressInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAddressInfos"));
    /// The byte offset of `pVendorInfos`.
    public static final long OFFSET_pVendorInfos = LAYOUT.byteOffset(PathElement.groupElement("pVendorInfos"));
    /// The memory layout of `pVendorInfos`.
    public static final MemoryLayout LAYOUT_pVendorInfos = LAYOUT.select(PathElement.groupElement("pVendorInfos"));
    /// The [VarHandle] of `pVendorInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVendorInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorInfos"));
    /// The byte offset of `pVendorBinaryData`.
    public static final long OFFSET_pVendorBinaryData = LAYOUT.byteOffset(PathElement.groupElement("pVendorBinaryData"));
    /// The memory layout of `pVendorBinaryData`.
    public static final MemoryLayout LAYOUT_pVendorBinaryData = LAYOUT.select(PathElement.groupElement("pVendorBinaryData"));
    /// The [VarHandle] of `pVendorBinaryData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVendorBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorBinaryData"));

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceFaultInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceFaultInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultInfoEXT`
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceFaultInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultInfoEXT`
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultInfoEXT copyFrom(VkDeviceFaultInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceFaultInfoEXT reinterpret(long count) { return new VkDeviceFaultInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceFaultInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceFaultInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `pAddressInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAddressInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pAddressInfos.get(segment, 0L, index); }
    /// {@return `pAddressInfos`}
    public MemorySegment pAddressInfos() { return pAddressInfos(this.segment(), 0L); }
    /// Sets `pAddressInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAddressInfos(MemorySegment segment, long index, MemorySegment value) { VH_pAddressInfos.set(segment, 0L, index, value); }
    /// Sets `pAddressInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pAddressInfos(MemorySegment value) { pAddressInfos(this.segment(), 0L, value); return this; }

    /// {@return `pVendorInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVendorInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pVendorInfos.get(segment, 0L, index); }
    /// {@return `pVendorInfos`}
    public MemorySegment pVendorInfos() { return pVendorInfos(this.segment(), 0L); }
    /// Sets `pVendorInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVendorInfos(MemorySegment segment, long index, MemorySegment value) { VH_pVendorInfos.set(segment, 0L, index, value); }
    /// Sets `pVendorInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorInfos(MemorySegment value) { pVendorInfos(this.segment(), 0L, value); return this; }

    /// {@return `pVendorBinaryData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVendorBinaryData(MemorySegment segment, long index) { return (MemorySegment) VH_pVendorBinaryData.get(segment, 0L, index); }
    /// {@return `pVendorBinaryData`}
    public MemorySegment pVendorBinaryData() { return pVendorBinaryData(this.segment(), 0L); }
    /// Sets `pVendorBinaryData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVendorBinaryData(MemorySegment segment, long index, MemorySegment value) { VH_pVendorBinaryData.set(segment, 0L, index, value); }
    /// Sets `pVendorBinaryData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorBinaryData(MemorySegment value) { pVendorBinaryData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceFaultInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceFaultInfoEXT`
    public VkDeviceFaultInfoEXT asSlice(long index) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceFaultInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceFaultInfoEXT`
    public VkDeviceFaultInfoEXT asSlice(long index, long count) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceFaultInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceFaultInfoEXT at(long index, Consumer<VkDeviceFaultInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

    /// {@return `pAddressInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAddressInfosAt(long index) { return pAddressInfos(this.segment(), index); }
    /// Sets `pAddressInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pAddressInfosAt(long index, MemorySegment value) { pAddressInfos(this.segment(), index, value); return this; }

    /// {@return `pVendorInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVendorInfosAt(long index) { return pVendorInfos(this.segment(), index); }
    /// Sets `pVendorInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorInfosAt(long index, MemorySegment value) { pVendorInfos(this.segment(), index, value); return this; }

    /// {@return `pVendorBinaryData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVendorBinaryDataAt(long index) { return pVendorBinaryData(this.segment(), index); }
    /// Sets `pVendorBinaryData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorBinaryDataAt(long index, MemorySegment value) { pVendorBinaryData(this.segment(), index, value); return this; }

}
