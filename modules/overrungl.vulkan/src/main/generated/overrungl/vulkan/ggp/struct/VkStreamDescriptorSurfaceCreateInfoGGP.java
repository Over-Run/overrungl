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
package overrungl.vulkan.ggp.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkStreamDescriptorSurfaceCreateInfoGGP {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkStreamDescriptorSurfaceCreateFlagsGGP flags;
///     (uint32_t) GgpStreamDescriptor streamDescriptor;
/// };
/// ```
public final class VkStreamDescriptorSurfaceCreateInfoGGP extends GroupType {
    /// The struct layout of `VkStreamDescriptorSurfaceCreateInfoGGP`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("streamDescriptor")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `streamDescriptor`.
    public static final long OFFSET_streamDescriptor = LAYOUT.byteOffset(PathElement.groupElement("streamDescriptor"));
    /// The memory layout of `streamDescriptor`.
    public static final MemoryLayout LAYOUT_streamDescriptor = LAYOUT.select(PathElement.groupElement("streamDescriptor"));
    /// The [VarHandle] of `streamDescriptor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_streamDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamDescriptor"));

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkStreamDescriptorSurfaceCreateInfoGGP(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkStreamDescriptorSurfaceCreateInfoGGP ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkStreamDescriptorSurfaceCreateInfoGGP(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP alloc(SegmentAllocator allocator) { return new VkStreamDescriptorSurfaceCreateInfoGGP(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP alloc(SegmentAllocator allocator, long count) { return new VkStreamDescriptorSurfaceCreateInfoGGP(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param streamDescriptor `streamDescriptor`
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int streamDescriptor) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).streamDescriptor(streamDescriptor);
    }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkStreamDescriptorSurfaceCreateInfoGGP` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkStreamDescriptorSurfaceCreateInfoGGP`
    public static VkStreamDescriptorSurfaceCreateInfoGGP allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP copyFrom(VkStreamDescriptorSurfaceCreateInfoGGP src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkStreamDescriptorSurfaceCreateInfoGGP reinterpret(long count) { return new VkStreamDescriptorSurfaceCreateInfoGGP(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkStreamDescriptorSurfaceCreateInfoGGP sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkStreamDescriptorSurfaceCreateInfoGGP pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `streamDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int streamDescriptor(MemorySegment segment, long index) { return (int) VH_streamDescriptor.get(segment, 0L, index); }
    /// {@return `streamDescriptor`}
    public int streamDescriptor() { return streamDescriptor(this.segment(), 0L); }
    /// Sets `streamDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void streamDescriptor(MemorySegment segment, long index, int value) { VH_streamDescriptor.set(segment, 0L, index, value); }
    /// Sets `streamDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP streamDescriptor(int value) { streamDescriptor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkStreamDescriptorSurfaceCreateInfoGGP`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkStreamDescriptorSurfaceCreateInfoGGP`
    public VkStreamDescriptorSurfaceCreateInfoGGP asSlice(long index) { return new VkStreamDescriptorSurfaceCreateInfoGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkStreamDescriptorSurfaceCreateInfoGGP`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkStreamDescriptorSurfaceCreateInfoGGP`
    public VkStreamDescriptorSurfaceCreateInfoGGP asSlice(long index, long count) { return new VkStreamDescriptorSurfaceCreateInfoGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkStreamDescriptorSurfaceCreateInfoGGP` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP at(long index, Consumer<VkStreamDescriptorSurfaceCreateInfoGGP> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `streamDescriptor` at the given index}
    /// @param index the index of the struct buffer
    public int streamDescriptorAt(long index) { return streamDescriptor(this.segment(), index); }
    /// Sets `streamDescriptor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkStreamDescriptorSurfaceCreateInfoGGP streamDescriptorAt(long index, int value) { streamDescriptor(this.segment(), index, value); return this; }

}
