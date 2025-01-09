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
/// ### disabledValidationCheckCount
/// [VarHandle][#VH_disabledValidationCheckCount] - [Getter][#disabledValidationCheckCount()] - [Setter][#disabledValidationCheckCount(int)]
/// ### pDisabledValidationChecks
/// [VarHandle][#VH_pDisabledValidationChecks] - [Getter][#pDisabledValidationChecks()] - [Setter][#pDisabledValidationChecks(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkValidationFlagsEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t disabledValidationCheckCount;
///     const VkValidationCheckEXT * pDisabledValidationChecks;
/// } VkValidationFlagsEXT;
/// ```
public final class VkValidationFlagsEXT extends Struct {
    /// The struct layout of `VkValidationFlagsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationChecks")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `disabledValidationCheckCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disabledValidationCheckCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationCheckCount"));
    /// The [VarHandle] of `pDisabledValidationChecks` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDisabledValidationChecks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationChecks"));

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment the memory segment
    public VkValidationFlagsEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFlagsEXT`
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationFlagsEXT`
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkValidationFlagsEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkValidationFlagsEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkValidationFlagsEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkValidationFlagsEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkValidationFlagsEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT sType(@CType("VkStructureType") int value) { VkValidationFlagsEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkValidationFlagsEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkValidationFlagsEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkValidationFlagsEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `disabledValidationCheckCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_disabledValidationCheckCount(MemorySegment segment, long index) { return (int) VH_disabledValidationCheckCount.get(segment, 0L, index); }
    /// {@return `disabledValidationCheckCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_disabledValidationCheckCount(MemorySegment segment) { return VkValidationFlagsEXT.get_disabledValidationCheckCount(segment, 0L); }
    /// {@return `disabledValidationCheckCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int disabledValidationCheckCountAt(long index) { return VkValidationFlagsEXT.get_disabledValidationCheckCount(this.segment(), index); }
    /// {@return `disabledValidationCheckCount`}
    public @CType("uint32_t") int disabledValidationCheckCount() { return VkValidationFlagsEXT.get_disabledValidationCheckCount(this.segment()); }
    /// Sets `disabledValidationCheckCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disabledValidationCheckCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_disabledValidationCheckCount.set(segment, 0L, index, value); }
    /// Sets `disabledValidationCheckCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disabledValidationCheckCount(MemorySegment segment, @CType("uint32_t") int value) { VkValidationFlagsEXT.set_disabledValidationCheckCount(segment, 0L, value); }
    /// Sets `disabledValidationCheckCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT disabledValidationCheckCountAt(long index, @CType("uint32_t") int value) { VkValidationFlagsEXT.set_disabledValidationCheckCount(this.segment(), index, value); return this; }
    /// Sets `disabledValidationCheckCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT disabledValidationCheckCount(@CType("uint32_t") int value) { VkValidationFlagsEXT.set_disabledValidationCheckCount(this.segment(), value); return this; }

    /// {@return `pDisabledValidationChecks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment get_pDisabledValidationChecks(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDisabledValidationChecks.get(segment, 0L, index); }
    /// {@return `pDisabledValidationChecks`}
    /// @param segment the segment of the struct
    public static @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment get_pDisabledValidationChecks(MemorySegment segment) { return VkValidationFlagsEXT.get_pDisabledValidationChecks(segment, 0L); }
    /// {@return `pDisabledValidationChecks` at the given index}
    /// @param index the index
    public @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment pDisabledValidationChecksAt(long index) { return VkValidationFlagsEXT.get_pDisabledValidationChecks(this.segment(), index); }
    /// {@return `pDisabledValidationChecks`}
    public @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment pDisabledValidationChecks() { return VkValidationFlagsEXT.get_pDisabledValidationChecks(this.segment()); }
    /// Sets `pDisabledValidationChecks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDisabledValidationChecks(MemorySegment segment, long index, @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment value) { VH_pDisabledValidationChecks.set(segment, 0L, index, value); }
    /// Sets `pDisabledValidationChecks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDisabledValidationChecks(MemorySegment segment, @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pDisabledValidationChecks(segment, 0L, value); }
    /// Sets `pDisabledValidationChecks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pDisabledValidationChecksAt(long index, @CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pDisabledValidationChecks(this.segment(), index, value); return this; }
    /// Sets `pDisabledValidationChecks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pDisabledValidationChecks(@CType("const VkValidationCheckEXT *") java.lang.foreign.MemorySegment value) { VkValidationFlagsEXT.set_pDisabledValidationChecks(this.segment(), value); return this; }

}
