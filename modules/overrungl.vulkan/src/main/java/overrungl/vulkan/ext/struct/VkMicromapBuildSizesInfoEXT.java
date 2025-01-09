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
/// ### micromapSize
/// [VarHandle][#VH_micromapSize] - [Getter][#micromapSize()] - [Setter][#micromapSize(long)]
/// ### buildScratchSize
/// [VarHandle][#VH_buildScratchSize] - [Getter][#buildScratchSize()] - [Setter][#buildScratchSize(long)]
/// ### discardable
/// [VarHandle][#VH_discardable] - [Getter][#discardable()] - [Setter][#discardable(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMicromapBuildSizesInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize micromapSize;
///     VkDeviceSize buildScratchSize;
///     VkBool32 discardable;
/// } VkMicromapBuildSizesInfoEXT;
/// ```
public final class VkMicromapBuildSizesInfoEXT extends Struct {
    /// The struct layout of `VkMicromapBuildSizesInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("micromapSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize"),
        ValueLayout.JAVA_INT.withName("discardable")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `micromapSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_micromapSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapSize"));
    /// The [VarHandle] of `buildScratchSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_buildScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize"));
    /// The [VarHandle] of `discardable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_discardable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardable"));

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkMicromapBuildSizesInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildSizesInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildSizesInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMicromapBuildSizesInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapBuildSizesInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMicromapBuildSizesInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMicromapBuildSizesInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapBuildSizesInfoEXT`
    public static VkMicromapBuildSizesInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapBuildSizesInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMicromapBuildSizesInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapBuildSizesInfoEXT`
    public static VkMicromapBuildSizesInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapBuildSizesInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMicromapBuildSizesInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapBuildSizesInfoEXT`
    public VkMicromapBuildSizesInfoEXT asSlice(long index) { return new VkMicromapBuildSizesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMicromapBuildSizesInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapBuildSizesInfoEXT`
    public VkMicromapBuildSizesInfoEXT asSlice(long index, long count) { return new VkMicromapBuildSizesInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMicromapBuildSizesInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMicromapBuildSizesInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMicromapBuildSizesInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMicromapBuildSizesInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMicromapBuildSizesInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT sType(@CType("VkStructureType") int value) { VkMicromapBuildSizesInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMicromapBuildSizesInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMicromapBuildSizesInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMicromapBuildSizesInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildSizesInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildSizesInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMicromapBuildSizesInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `micromapSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_micromapSize(MemorySegment segment, long index) { return (long) VH_micromapSize.get(segment, 0L, index); }
    /// {@return `micromapSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_micromapSize(MemorySegment segment) { return VkMicromapBuildSizesInfoEXT.get_micromapSize(segment, 0L); }
    /// {@return `micromapSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long micromapSizeAt(long index) { return VkMicromapBuildSizesInfoEXT.get_micromapSize(this.segment(), index); }
    /// {@return `micromapSize`}
    public @CType("VkDeviceSize") long micromapSize() { return VkMicromapBuildSizesInfoEXT.get_micromapSize(this.segment()); }
    /// Sets `micromapSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_micromapSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_micromapSize.set(segment, 0L, index, value); }
    /// Sets `micromapSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_micromapSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_micromapSize(segment, 0L, value); }
    /// Sets `micromapSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT micromapSizeAt(long index, @CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_micromapSize(this.segment(), index, value); return this; }
    /// Sets `micromapSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT micromapSize(@CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_micromapSize(this.segment(), value); return this; }

    /// {@return `buildScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_buildScratchSize(MemorySegment segment, long index) { return (long) VH_buildScratchSize.get(segment, 0L, index); }
    /// {@return `buildScratchSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_buildScratchSize(MemorySegment segment) { return VkMicromapBuildSizesInfoEXT.get_buildScratchSize(segment, 0L); }
    /// {@return `buildScratchSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long buildScratchSizeAt(long index) { return VkMicromapBuildSizesInfoEXT.get_buildScratchSize(this.segment(), index); }
    /// {@return `buildScratchSize`}
    public @CType("VkDeviceSize") long buildScratchSize() { return VkMicromapBuildSizesInfoEXT.get_buildScratchSize(this.segment()); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buildScratchSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_buildScratchSize.set(segment, 0L, index, value); }
    /// Sets `buildScratchSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buildScratchSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_buildScratchSize(segment, 0L, value); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT buildScratchSizeAt(long index, @CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_buildScratchSize(this.segment(), index, value); return this; }
    /// Sets `buildScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT buildScratchSize(@CType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.set_buildScratchSize(this.segment(), value); return this; }

    /// {@return `discardable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_discardable(MemorySegment segment, long index) { return (int) VH_discardable.get(segment, 0L, index); }
    /// {@return `discardable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_discardable(MemorySegment segment) { return VkMicromapBuildSizesInfoEXT.get_discardable(segment, 0L); }
    /// {@return `discardable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int discardableAt(long index) { return VkMicromapBuildSizesInfoEXT.get_discardable(this.segment(), index); }
    /// {@return `discardable`}
    public @CType("VkBool32") int discardable() { return VkMicromapBuildSizesInfoEXT.get_discardable(this.segment()); }
    /// Sets `discardable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_discardable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_discardable.set(segment, 0L, index, value); }
    /// Sets `discardable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_discardable(MemorySegment segment, @CType("VkBool32") int value) { VkMicromapBuildSizesInfoEXT.set_discardable(segment, 0L, value); }
    /// Sets `discardable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT discardableAt(long index, @CType("VkBool32") int value) { VkMicromapBuildSizesInfoEXT.set_discardable(this.segment(), index, value); return this; }
    /// Sets `discardable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapBuildSizesInfoEXT discardable(@CType("VkBool32") int value) { VkMicromapBuildSizesInfoEXT.set_discardable(this.segment(), value); return this; }

}
