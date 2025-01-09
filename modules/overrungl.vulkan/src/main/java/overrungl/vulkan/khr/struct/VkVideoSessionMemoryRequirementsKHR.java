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
package overrungl.vulkan.khr.struct;

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
/// ### memoryBindIndex
/// [VarHandle][#VH_memoryBindIndex] - [Getter][#memoryBindIndex()] - [Setter][#memoryBindIndex(int)]
/// ### memoryRequirements
/// [Byte offset][#OFFSET_memoryRequirements] - [Memory layout][#ML_memoryRequirements] - [Getter][#memoryRequirements()] - [Setter][#memoryRequirements(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoSessionMemoryRequirementsKHR {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t memoryBindIndex;
///     VkMemoryRequirements memoryRequirements;
/// } VkVideoSessionMemoryRequirementsKHR;
/// ```
public final class VkVideoSessionMemoryRequirementsKHR extends Struct {
    /// The struct layout of `VkVideoSessionMemoryRequirementsKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryBindIndex"),
        overrungl.vulkan.struct.VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memoryBindIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryBindIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryBindIndex"));
    /// The byte offset of `memoryRequirements`.
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    /// The memory layout of `memoryRequirements`.
    public static final MemoryLayout ML_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoSessionMemoryRequirementsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionMemoryRequirementsKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionMemoryRequirementsKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoSessionMemoryRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionMemoryRequirementsKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionMemoryRequirementsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoSessionMemoryRequirementsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionMemoryRequirementsKHR`
    public static VkVideoSessionMemoryRequirementsKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionMemoryRequirementsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoSessionMemoryRequirementsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionMemoryRequirementsKHR`
    public static VkVideoSessionMemoryRequirementsKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionMemoryRequirementsKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoSessionMemoryRequirementsKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoSessionMemoryRequirementsKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoSessionMemoryRequirementsKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoSessionMemoryRequirementsKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoSessionMemoryRequirementsKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR sType(@CType("VkStructureType") int value) { VkVideoSessionMemoryRequirementsKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoSessionMemoryRequirementsKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoSessionMemoryRequirementsKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoSessionMemoryRequirementsKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryBindIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryBindIndex(MemorySegment segment, long index) { return (int) VH_memoryBindIndex.get(segment, 0L, index); }
    /// {@return `memoryBindIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryBindIndex(MemorySegment segment) { return VkVideoSessionMemoryRequirementsKHR.get_memoryBindIndex(segment, 0L); }
    /// {@return `memoryBindIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryBindIndexAt(long index) { return VkVideoSessionMemoryRequirementsKHR.get_memoryBindIndex(this.segment(), index); }
    /// {@return `memoryBindIndex`}
    public @CType("uint32_t") int memoryBindIndex() { return VkVideoSessionMemoryRequirementsKHR.get_memoryBindIndex(this.segment()); }
    /// Sets `memoryBindIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryBindIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryBindIndex.set(segment, 0L, index, value); }
    /// Sets `memoryBindIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryBindIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoSessionMemoryRequirementsKHR.set_memoryBindIndex(segment, 0L, value); }
    /// Sets `memoryBindIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndexAt(long index, @CType("uint32_t") int value) { VkVideoSessionMemoryRequirementsKHR.set_memoryBindIndex(this.segment(), index, value); return this; }
    /// Sets `memoryBindIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryBindIndex(@CType("uint32_t") int value) { VkVideoSessionMemoryRequirementsKHR.set_memoryBindIndex(this.segment(), value); return this; }

    /// {@return `memoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment get_memoryRequirements(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), ML_memoryRequirements); }
    /// {@return `memoryRequirements`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment get_memoryRequirements(MemorySegment segment) { return VkVideoSessionMemoryRequirementsKHR.get_memoryRequirements(segment, 0L); }
    /// {@return `memoryRequirements` at the given index}
    /// @param index the index
    public @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment memoryRequirementsAt(long index) { return VkVideoSessionMemoryRequirementsKHR.get_memoryRequirements(this.segment(), index); }
    /// {@return `memoryRequirements`}
    public @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment memoryRequirements() { return VkVideoSessionMemoryRequirementsKHR.get_memoryRequirements(this.segment()); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryRequirements(MemorySegment segment, long index, @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryRequirements, index), ML_memoryRequirements.byteSize()); }
    /// Sets `memoryRequirements` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryRequirements(MemorySegment segment, @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_memoryRequirements(segment, 0L, value); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryRequirementsAt(long index, @CType("VkMemoryRequirements") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_memoryRequirements(this.segment(), index, value); return this; }
    /// Sets `memoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionMemoryRequirementsKHR memoryRequirements(@CType("VkMemoryRequirements") java.lang.foreign.MemorySegment value) { VkVideoSessionMemoryRequirementsKHR.set_memoryRequirements(this.segment(), value); return this; }

}
