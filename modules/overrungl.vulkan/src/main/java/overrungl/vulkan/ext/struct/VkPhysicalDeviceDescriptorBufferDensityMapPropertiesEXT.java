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
/// ### combinedImageSamplerDensityMapDescriptorSize
/// [VarHandle][#VH_combinedImageSamplerDensityMapDescriptorSize] - [Getter][#combinedImageSamplerDensityMapDescriptorSize()] - [Setter][#combinedImageSamplerDensityMapDescriptorSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     size_t combinedImageSamplerDensityMapDescriptorSize;
/// } VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT;
/// ```
public final class VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("combinedImageSamplerDensityMapDescriptorSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `combinedImageSamplerDensityMapDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_combinedImageSamplerDensityMapDescriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));

    /// Creates `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`
    public static VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `combinedImageSamplerDensityMapDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_combinedImageSamplerDensityMapDescriptorSize(MemorySegment segment, long index) { return (long) VH_combinedImageSamplerDensityMapDescriptorSize.get(segment, 0L, index); }
    /// {@return `combinedImageSamplerDensityMapDescriptorSize`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_combinedImageSamplerDensityMapDescriptorSize(MemorySegment segment) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_combinedImageSamplerDensityMapDescriptorSize(segment, 0L); }
    /// {@return `combinedImageSamplerDensityMapDescriptorSize` at the given index}
    /// @param index the index
    public @CType("size_t") long combinedImageSamplerDensityMapDescriptorSizeAt(long index) { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_combinedImageSamplerDensityMapDescriptorSize(this.segment(), index); }
    /// {@return `combinedImageSamplerDensityMapDescriptorSize`}
    public @CType("size_t") long combinedImageSamplerDensityMapDescriptorSize() { return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.get_combinedImageSamplerDensityMapDescriptorSize(this.segment()); }
    /// Sets `combinedImageSamplerDensityMapDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_combinedImageSamplerDensityMapDescriptorSize(MemorySegment segment, long index, @CType("size_t") long value) { VH_combinedImageSamplerDensityMapDescriptorSize.set(segment, 0L, index, value); }
    /// Sets `combinedImageSamplerDensityMapDescriptorSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_combinedImageSamplerDensityMapDescriptorSize(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_combinedImageSamplerDensityMapDescriptorSize(segment, 0L, value); }
    /// Sets `combinedImageSamplerDensityMapDescriptorSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT combinedImageSamplerDensityMapDescriptorSizeAt(long index, @CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_combinedImageSamplerDensityMapDescriptorSize(this.segment(), index, value); return this; }
    /// Sets `combinedImageSamplerDensityMapDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT combinedImageSamplerDensityMapDescriptorSize(@CType("size_t") long value) { VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.set_combinedImageSamplerDensityMapDescriptorSize(this.segment(), value); return this; }

}
