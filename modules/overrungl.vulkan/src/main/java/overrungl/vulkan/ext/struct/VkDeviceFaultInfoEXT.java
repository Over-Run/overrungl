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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### description
/// [Byte offset][#OFFSET_description] - [Memory layout][#ML_description] - [Getter][#description()] - [Setter][#description(java.lang.foreign.MemorySegment)]
/// ### pAddressInfos
/// [VarHandle][#VH_pAddressInfos] - [Getter][#pAddressInfos()] - [Setter][#pAddressInfos(java.lang.foreign.MemorySegment)]
/// ### pVendorInfos
/// [VarHandle][#VH_pVendorInfos] - [Getter][#pVendorInfos()] - [Setter][#pVendorInfos(java.lang.foreign.MemorySegment)]
/// ### pVendorBinaryData
/// [VarHandle][#VH_pVendorBinaryData] - [Getter][#pVendorBinaryData()] - [Setter][#pVendorBinaryData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceFaultInfoEXT {
///     VkStructureType sType;
///     void * pNext;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
///     VkDeviceFaultAddressInfoEXT * pAddressInfos;
///     VkDeviceFaultVendorInfoEXT * pVendorInfos;
///     void * pVendorBinaryData;
/// } VkDeviceFaultInfoEXT;
/// ```
public final class VkDeviceFaultInfoEXT extends Struct {
    /// The struct layout of `VkDeviceFaultInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.ADDRESS.withName("pAddressInfos"),
        ValueLayout.ADDRESS.withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `pAddressInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAddressInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAddressInfos"));
    /// The [VarHandle] of `pVendorInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVendorInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorInfos"));
    /// The [VarHandle] of `pVendorBinaryData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVendorBinaryData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorBinaryData"));

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceFaultInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceFaultInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceFaultInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceFaultInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultInfoEXT`
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceFaultInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultInfoEXT`
    public static VkDeviceFaultInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDeviceFaultInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceFaultInfoEXT`
    public VkDeviceFaultInfoEXT asSlice(long index) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDeviceFaultInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceFaultInfoEXT`
    public VkDeviceFaultInfoEXT asSlice(long index, long count) { return new VkDeviceFaultInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceFaultInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceFaultInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceFaultInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceFaultInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT sType(@CType("VkStructureType") int value) { VkDeviceFaultInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceFaultInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceFaultInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), ML_description); }
    /// {@return `description`}
    /// @param segment the segment of the struct
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_description(segment, 0L); }
    /// {@return `description` at the given index}
    /// @param index the index
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index) { return VkDeviceFaultInfoEXT.get_description(this.segment(), index); }
    /// {@return `description`}
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description() { return VkDeviceFaultInfoEXT.get_description(this.segment()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_description(MemorySegment segment, long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), ML_description.byteSize()); }
    /// Sets `description` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_description(MemorySegment segment, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_description(segment, 0L, value); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT descriptionAt(long index, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT description(@CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_description(this.segment(), value); return this; }

    /// {@return `pAddressInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment get_pAddressInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAddressInfos.get(segment, 0L, index); }
    /// {@return `pAddressInfos`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment get_pAddressInfos(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_pAddressInfos(segment, 0L); }
    /// {@return `pAddressInfos` at the given index}
    /// @param index the index
    public @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment pAddressInfosAt(long index) { return VkDeviceFaultInfoEXT.get_pAddressInfos(this.segment(), index); }
    /// {@return `pAddressInfos`}
    public @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment pAddressInfos() { return VkDeviceFaultInfoEXT.get_pAddressInfos(this.segment()); }
    /// Sets `pAddressInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAddressInfos(MemorySegment segment, long index, @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pAddressInfos.set(segment, 0L, index, value); }
    /// Sets `pAddressInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAddressInfos(MemorySegment segment, @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pAddressInfos(segment, 0L, value); }
    /// Sets `pAddressInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pAddressInfosAt(long index, @CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pAddressInfos(this.segment(), index, value); return this; }
    /// Sets `pAddressInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pAddressInfos(@CType("VkDeviceFaultAddressInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pAddressInfos(this.segment(), value); return this; }

    /// {@return `pVendorInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment get_pVendorInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVendorInfos.get(segment, 0L, index); }
    /// {@return `pVendorInfos`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment get_pVendorInfos(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_pVendorInfos(segment, 0L); }
    /// {@return `pVendorInfos` at the given index}
    /// @param index the index
    public @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment pVendorInfosAt(long index) { return VkDeviceFaultInfoEXT.get_pVendorInfos(this.segment(), index); }
    /// {@return `pVendorInfos`}
    public @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment pVendorInfos() { return VkDeviceFaultInfoEXT.get_pVendorInfos(this.segment()); }
    /// Sets `pVendorInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVendorInfos(MemorySegment segment, long index, @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pVendorInfos.set(segment, 0L, index, value); }
    /// Sets `pVendorInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVendorInfos(MemorySegment segment, @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorInfos(segment, 0L, value); }
    /// Sets `pVendorInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorInfosAt(long index, @CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorInfos(this.segment(), index, value); return this; }
    /// Sets `pVendorInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorInfos(@CType("VkDeviceFaultVendorInfoEXT *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorInfos(this.segment(), value); return this; }

    /// {@return `pVendorBinaryData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pVendorBinaryData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVendorBinaryData.get(segment, 0L, index); }
    /// {@return `pVendorBinaryData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pVendorBinaryData(MemorySegment segment) { return VkDeviceFaultInfoEXT.get_pVendorBinaryData(segment, 0L); }
    /// {@return `pVendorBinaryData` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pVendorBinaryDataAt(long index) { return VkDeviceFaultInfoEXT.get_pVendorBinaryData(this.segment(), index); }
    /// {@return `pVendorBinaryData`}
    public @CType("void *") java.lang.foreign.MemorySegment pVendorBinaryData() { return VkDeviceFaultInfoEXT.get_pVendorBinaryData(this.segment()); }
    /// Sets `pVendorBinaryData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVendorBinaryData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pVendorBinaryData.set(segment, 0L, index, value); }
    /// Sets `pVendorBinaryData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVendorBinaryData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorBinaryData(segment, 0L, value); }
    /// Sets `pVendorBinaryData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorBinaryDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorBinaryData(this.segment(), index, value); return this; }
    /// Sets `pVendorBinaryData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultInfoEXT pVendorBinaryData(@CType("void *") java.lang.foreign.MemorySegment value) { VkDeviceFaultInfoEXT.set_pVendorBinaryData(this.segment(), value); return this; }

}
