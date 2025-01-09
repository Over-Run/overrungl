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
/// ### hasStdVPSOverrides
/// [VarHandle][#VH_hasStdVPSOverrides] - [Getter][#hasStdVPSOverrides()] - [Setter][#hasStdVPSOverrides(int)]
/// ### hasStdSPSOverrides
/// [VarHandle][#VH_hasStdSPSOverrides] - [Getter][#hasStdSPSOverrides()] - [Setter][#hasStdSPSOverrides(int)]
/// ### hasStdPPSOverrides
/// [VarHandle][#VH_hasStdPPSOverrides] - [Getter][#hasStdPPSOverrides()] - [Setter][#hasStdPPSOverrides(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265SessionParametersFeedbackInfoKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 hasStdVPSOverrides;
///     VkBool32 hasStdSPSOverrides;
///     VkBool32 hasStdPPSOverrides;
/// } VkVideoEncodeH265SessionParametersFeedbackInfoKHR;
/// ```
public final class VkVideoEncodeH265SessionParametersFeedbackInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdVPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `hasStdVPSOverrides` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasStdVPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdVPSOverrides"));
    /// The [VarHandle] of `hasStdSPSOverrides` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasStdSPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdSPSOverrides"));
    /// The [VarHandle] of `hasStdPPSOverrides` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hasStdPPSOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdPPSOverrides"));

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `hasStdVPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasStdVPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdVPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdVPSOverrides`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasStdVPSOverrides(MemorySegment segment) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdVPSOverrides(segment, 0L); }
    /// {@return `hasStdVPSOverrides` at the given index}
    /// @param index the index
    public @CType("VkBool32") int hasStdVPSOverridesAt(long index) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdVPSOverrides(this.segment(), index); }
    /// {@return `hasStdVPSOverrides`}
    public @CType("VkBool32") int hasStdVPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdVPSOverrides(this.segment()); }
    /// Sets `hasStdVPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasStdVPSOverrides(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasStdVPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdVPSOverrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasStdVPSOverrides(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdVPSOverrides(segment, 0L, value); }
    /// Sets `hasStdVPSOverrides` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdVPSOverridesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdVPSOverrides(this.segment(), index, value); return this; }
    /// Sets `hasStdVPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdVPSOverrides(@CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdVPSOverrides(this.segment(), value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasStdSPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdSPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdSPSOverrides`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasStdSPSOverrides(MemorySegment segment) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(segment, 0L); }
    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param index the index
    public @CType("VkBool32") int hasStdSPSOverridesAt(long index) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(this.segment(), index); }
    /// {@return `hasStdSPSOverrides`}
    public @CType("VkBool32") int hasStdSPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdSPSOverrides(this.segment()); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasStdSPSOverrides(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasStdSPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasStdSPSOverrides(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(segment, 0L, value); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdSPSOverridesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(this.segment(), index, value); return this; }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdSPSOverrides(@CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdSPSOverrides(this.segment(), value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_hasStdPPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdPPSOverrides.get(segment, 0L, index); }
    /// {@return `hasStdPPSOverrides`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_hasStdPPSOverrides(MemorySegment segment) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(segment, 0L); }
    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param index the index
    public @CType("VkBool32") int hasStdPPSOverridesAt(long index) { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(this.segment(), index); }
    /// {@return `hasStdPPSOverrides`}
    public @CType("VkBool32") int hasStdPPSOverrides() { return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.get_hasStdPPSOverrides(this.segment()); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hasStdPPSOverrides(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_hasStdPPSOverrides.set(segment, 0L, index, value); }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hasStdPPSOverrides(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(segment, 0L, value); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdPPSOverridesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(this.segment(), index, value); return this; }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdPPSOverrides(@CType("VkBool32") int value) { VkVideoEncodeH265SessionParametersFeedbackInfoKHR.set_hasStdPPSOverrides(this.segment(), value); return this; }

}