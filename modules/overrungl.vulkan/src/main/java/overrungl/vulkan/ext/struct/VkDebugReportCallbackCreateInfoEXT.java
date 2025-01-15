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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pfnCallback
/// [VarHandle][#VH_pfnCallback] - [Getter][#pfnCallback()] - [Setter][#pfnCallback(java.lang.foreign.MemorySegment)]
/// ### pUserData
/// [VarHandle][#VH_pUserData] - [Getter][#pUserData()] - [Setter][#pUserData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugReportCallbackCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDebugReportFlagsEXT flags;
///     PFN_vkDebugReportCallbackEXT pfnCallback;
///     void * pUserData;
/// } VkDebugReportCallbackCreateInfoEXT;
/// ```
public sealed class VkDebugReportCallbackCreateInfoEXT extends Struct {
    /// The struct layout of `VkDebugReportCallbackCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pfnCallback` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnCallback"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VkDebugReportCallbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugReportCallbackCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugReportCallbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugReportCallbackCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugReportCallbackCreateInfoEXT(segment); }

    /// Creates `VkDebugReportCallbackCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugReportCallbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugReportCallbackCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugReportCallbackCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugReportCallbackCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDebugReportCallbackCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugReportCallbackCreateInfoEXT`
    public static VkDebugReportCallbackCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugReportCallbackCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugReportCallbackCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugReportCallbackCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugReportCallbackCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugReportCallbackCreateInfoEXT`
    public static VkDebugReportCallbackCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDebugReportFlagsEXT") int flags, @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment pfnCallback, @CType("void *") java.lang.foreign.MemorySegment pUserData) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).pfnCallback(pfnCallback).pUserData(pUserData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT copyFrom(VkDebugReportCallbackCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugReportCallbackCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugReportCallbackCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugReportCallbackCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT sType(@CType("VkStructureType") int value) { VkDebugReportCallbackCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugReportCallbackCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugReportCallbackCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugReportFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugReportFlagsEXT") int get_flags(MemorySegment segment) { return VkDebugReportCallbackCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDebugReportFlagsEXT") int flags() { return VkDebugReportCallbackCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDebugReportFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDebugReportFlagsEXT") int value) { VkDebugReportCallbackCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT flags(@CType("VkDebugReportFlagsEXT") int value) { VkDebugReportCallbackCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `pfnCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment get_pfnCallback(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnCallback.get(segment, 0L, index); }
    /// {@return `pfnCallback`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment get_pfnCallback(MemorySegment segment) { return VkDebugReportCallbackCreateInfoEXT.get_pfnCallback(segment, 0L); }
    /// {@return `pfnCallback`}
    public @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment pfnCallback() { return VkDebugReportCallbackCreateInfoEXT.get_pfnCallback(this.segment()); }
    /// Sets `pfnCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnCallback(MemorySegment segment, long index, @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment value) { VH_pfnCallback.set(segment, 0L, index, value); }
    /// Sets `pfnCallback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnCallback(MemorySegment segment, @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pfnCallback(segment, 0L, value); }
    /// Sets `pfnCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT pfnCallback(@CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pfnCallback(this.segment(), value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment) { return VkDebugReportCallbackCreateInfoEXT.get_pUserData(segment, 0L); }
    /// {@return `pUserData`}
    public @CType("void *") java.lang.foreign.MemorySegment pUserData() { return VkDebugReportCallbackCreateInfoEXT.get_pUserData(this.segment()); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pUserData(segment, 0L, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugReportCallbackCreateInfoEXT pUserData(@CType("void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pUserData(this.segment(), value); return this; }

    /// A buffer of [VkDebugReportCallbackCreateInfoEXT].
    public static final class Buffer extends VkDebugReportCallbackCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugReportCallbackCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugReportCallbackCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugReportCallbackCreateInfoEXT`
        public VkDebugReportCallbackCreateInfoEXT asSlice(long index) { return new VkDebugReportCallbackCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugReportCallbackCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugReportCallbackCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugReportCallbackCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugReportCallbackCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugReportCallbackCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDebugReportFlagsEXT") int flagsAt(long index) { return VkDebugReportCallbackCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDebugReportFlagsEXT") int value) { VkDebugReportCallbackCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `pfnCallback` at the given index}
        /// @param index the index
        public @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment pfnCallbackAt(long index) { return VkDebugReportCallbackCreateInfoEXT.get_pfnCallback(this.segment(), index); }
        /// Sets `pfnCallback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pfnCallbackAt(long index, @CType("PFN_vkDebugReportCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pfnCallback(this.segment(), index, value); return this; }

        /// {@return `pUserData` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pUserDataAt(long index) { return VkDebugReportCallbackCreateInfoEXT.get_pUserData(this.segment(), index); }
        /// Sets `pUserData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUserDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDebugReportCallbackCreateInfoEXT.set_pUserData(this.segment(), index, value); return this; }

    }
}
