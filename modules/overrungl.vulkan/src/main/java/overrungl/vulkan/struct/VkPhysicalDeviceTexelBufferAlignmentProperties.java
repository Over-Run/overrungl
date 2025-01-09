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
/// ### storageTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_storageTexelBufferOffsetAlignmentBytes] - [Getter][#storageTexelBufferOffsetAlignmentBytes()] - [Setter][#storageTexelBufferOffsetAlignmentBytes(long)]
/// ### storageTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_storageTexelBufferOffsetSingleTexelAlignment] - [Getter][#storageTexelBufferOffsetSingleTexelAlignment()] - [Setter][#storageTexelBufferOffsetSingleTexelAlignment(int)]
/// ### uniformTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_uniformTexelBufferOffsetAlignmentBytes] - [Getter][#uniformTexelBufferOffsetAlignmentBytes()] - [Setter][#uniformTexelBufferOffsetAlignmentBytes(long)]
/// ### uniformTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_uniformTexelBufferOffsetSingleTexelAlignment] - [Getter][#uniformTexelBufferOffsetSingleTexelAlignment()] - [Setter][#uniformTexelBufferOffsetSingleTexelAlignment(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceTexelBufferAlignmentProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// } VkPhysicalDeviceTexelBufferAlignmentProperties;
/// ```
public final class VkPhysicalDeviceTexelBufferAlignmentProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceTexelBufferAlignmentProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceTexelBufferAlignmentProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentProperties`
    public static VkPhysicalDeviceTexelBufferAlignmentProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTexelBufferAlignmentProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index
    public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties storageTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index
    public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceTexelBufferAlignmentProperties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentProperties uniformTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceTexelBufferAlignmentProperties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

}
