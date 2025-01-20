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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pfnUserCallback
/// [VarHandle][#VH_pfnUserCallback] - [Getter][#pfnUserCallback()] - [Setter][#pfnUserCallback(MemorySegment)]
/// ### pUserData
/// [VarHandle][#VH_pUserData] - [Getter][#pUserData()] - [Setter][#pUserData(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceDeviceMemoryReportCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceMemoryReportFlagsEXT flags;
///     PFN_vkDeviceMemoryReportCallbackEXT pfnUserCallback;
///     void * pUserData;
/// } VkDeviceDeviceMemoryReportCreateInfoEXT;
/// ```
public sealed class VkDeviceDeviceMemoryReportCreateInfoEXT extends Struct {
    /// The struct layout of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pfnUserCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnUserCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceDeviceMemoryReportCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDeviceDeviceMemoryReportCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceDeviceMemoryReportCreateInfoEXT`
    public static VkDeviceDeviceMemoryReportCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceMemoryReportFlagsEXT") int flags, @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment pfnUserCallback, @CType("void *") MemorySegment pUserData) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pfnUserCallback(pfnUserCallback).pUserData(pUserData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT copyFrom(VkDeviceDeviceMemoryReportCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(@CType("VkStructureType") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemoryReportFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemoryReportFlagsEXT") int get_flags(MemorySegment segment) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDeviceMemoryReportFlagsEXT") int flags() { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(@CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment get_pfnUserCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnUserCallback.get(segment, 0L, index); }
    /// {@return `pfnUserCallback`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment get_pfnUserCallback(MemorySegment segment) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pfnUserCallback(segment, 0L); }
    /// {@return `pfnUserCallback`}
    public @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment pfnUserCallback() { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pfnUserCallback(this.segment()); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnUserCallback(MemorySegment segment, long index, @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment value) { VH_pfnUserCallback.set(segment, 0L, index, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnUserCallback(MemorySegment segment, @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pfnUserCallback(segment, 0L, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(@CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pfnUserCallback(this.segment(), value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pUserData(MemorySegment segment) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pUserData(segment, 0L); }
    /// {@return `pUserData`}
    public @CType("void *") MemorySegment pUserData() { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pUserData(this.segment()); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, @CType("void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pUserData(segment, 0L, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(@CType("void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pUserData(this.segment(), value); return this; }

    /// A buffer of [VkDeviceDeviceMemoryReportCreateInfoEXT].
    public static final class Buffer extends VkDeviceDeviceMemoryReportCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`
        public VkDeviceDeviceMemoryReportCreateInfoEXT asSlice(long index) { return new VkDeviceDeviceMemoryReportCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDeviceDeviceMemoryReportCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDeviceMemoryReportFlagsEXT") int flagsAt(long index) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `pfnUserCallback` at the given index}
        /// @param index the index
        public @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment pfnUserCallbackAt(long index) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pfnUserCallback(this.segment(), index); }
        /// Sets `pfnUserCallback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pfnUserCallbackAt(long index, @CType("PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pfnUserCallback(this.segment(), index, value); return this; }

        /// {@return `pUserData` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pUserDataAt(long index) { return VkDeviceDeviceMemoryReportCreateInfoEXT.get_pUserData(this.segment(), index); }
        /// Sets `pUserData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUserDataAt(long index, @CType("void *") MemorySegment value) { VkDeviceDeviceMemoryReportCreateInfoEXT.set_pUserData(this.segment(), index, value); return this; }

    }
}
