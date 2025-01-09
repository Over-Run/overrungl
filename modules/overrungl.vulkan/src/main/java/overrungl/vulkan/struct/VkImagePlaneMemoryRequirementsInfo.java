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
/// ### planeAspect
/// [VarHandle][#VH_planeAspect] - [Getter][#planeAspect()] - [Setter][#planeAspect(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImagePlaneMemoryRequirementsInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageAspectFlagBits planeAspect;
/// } VkImagePlaneMemoryRequirementsInfo;
/// ```
public final class VkImagePlaneMemoryRequirementsInfo extends Struct {
    /// The struct layout of `VkImagePlaneMemoryRequirementsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("planeAspect")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `planeAspect` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeAspect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect"));

    /// Creates `VkImagePlaneMemoryRequirementsInfo` with the given segment.
    /// @param segment the memory segment
    public VkImagePlaneMemoryRequirementsInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImagePlaneMemoryRequirementsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePlaneMemoryRequirementsInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment); }

    /// Creates `VkImagePlaneMemoryRequirementsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePlaneMemoryRequirementsInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImagePlaneMemoryRequirementsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImagePlaneMemoryRequirementsInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImagePlaneMemoryRequirementsInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImagePlaneMemoryRequirementsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImagePlaneMemoryRequirementsInfo`
    public static VkImagePlaneMemoryRequirementsInfo alloc(SegmentAllocator allocator) { return new VkImagePlaneMemoryRequirementsInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImagePlaneMemoryRequirementsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImagePlaneMemoryRequirementsInfo`
    public static VkImagePlaneMemoryRequirementsInfo alloc(SegmentAllocator allocator, long count) { return new VkImagePlaneMemoryRequirementsInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImagePlaneMemoryRequirementsInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImagePlaneMemoryRequirementsInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImagePlaneMemoryRequirementsInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImagePlaneMemoryRequirementsInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkImagePlaneMemoryRequirementsInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo sType(@CType("VkStructureType") int value) { VkImagePlaneMemoryRequirementsInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImagePlaneMemoryRequirementsInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImagePlaneMemoryRequirementsInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImagePlaneMemoryRequirementsInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePlaneMemoryRequirementsInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePlaneMemoryRequirementsInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImagePlaneMemoryRequirementsInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment, long index) { return (int) VH_planeAspect.get(segment, 0L, index); }
    /// {@return `planeAspect`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlagBits") int get_planeAspect(MemorySegment segment) { return VkImagePlaneMemoryRequirementsInfo.get_planeAspect(segment, 0L); }
    /// {@return `planeAspect` at the given index}
    /// @param index the index
    public @CType("VkImageAspectFlagBits") int planeAspectAt(long index) { return VkImagePlaneMemoryRequirementsInfo.get_planeAspect(this.segment(), index); }
    /// {@return `planeAspect`}
    public @CType("VkImageAspectFlagBits") int planeAspect() { return VkImagePlaneMemoryRequirementsInfo.get_planeAspect(this.segment()); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, long index, @CType("VkImageAspectFlagBits") int value) { VH_planeAspect.set(segment, 0L, index, value); }
    /// Sets `planeAspect` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeAspect(MemorySegment segment, @CType("VkImageAspectFlagBits") int value) { VkImagePlaneMemoryRequirementsInfo.set_planeAspect(segment, 0L, value); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo planeAspectAt(long index, @CType("VkImageAspectFlagBits") int value) { VkImagePlaneMemoryRequirementsInfo.set_planeAspect(this.segment(), index, value); return this; }
    /// Sets `planeAspect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImagePlaneMemoryRequirementsInfo planeAspect(@CType("VkImageAspectFlagBits") int value) { VkImagePlaneMemoryRequirementsInfo.set_planeAspect(this.segment(), value); return this; }

}