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
/// ### writeStdSPS
/// [VarHandle][#VH_writeStdSPS] - [Getter][#writeStdSPS()] - [Setter][#writeStdSPS(int)]
/// ### writeStdPPS
/// [VarHandle][#VH_writeStdPPS] - [Getter][#writeStdPPS()] - [Setter][#writeStdPPS(int)]
/// ### stdSPSId
/// [VarHandle][#VH_stdSPSId] - [Getter][#stdSPSId()] - [Setter][#stdSPSId(int)]
/// ### stdPPSId
/// [VarHandle][#VH_stdPPSId] - [Getter][#stdPPSId()] - [Setter][#stdPPSId(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264SessionParametersGetInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 writeStdSPS;
///     VkBool32 writeStdPPS;
///     uint32_t stdSPSId;
///     uint32_t stdPPSId;
/// } VkVideoEncodeH264SessionParametersGetInfoKHR;
/// ```
public final class VkVideoEncodeH264SessionParametersGetInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264SessionParametersGetInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("writeStdSPS"),
        ValueLayout.JAVA_INT.withName("writeStdPPS"),
        ValueLayout.JAVA_INT.withName("stdSPSId"),
        ValueLayout.JAVA_INT.withName("stdPPSId")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `writeStdSPS` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_writeStdSPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdSPS"));
    /// The [VarHandle] of `writeStdPPS` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_writeStdPPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("writeStdPPS"));
    /// The [VarHandle] of `stdSPSId` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdSPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSId"));
    /// The [VarHandle] of `stdPPSId` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdPPSId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSId"));

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionParametersGetInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersGetInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersGetInfoKHR`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionParametersGetInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersGetInfoKHR`
    public static VkVideoEncodeH264SessionParametersGetInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264SessionParametersGetInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `writeStdSPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_writeStdSPS(MemorySegment segment, long index) { return (int) VH_writeStdSPS.get(segment, 0L, index); }
    /// {@return `writeStdSPS`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_writeStdSPS(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdSPS(segment, 0L); }
    /// {@return `writeStdSPS` at the given index}
    /// @param index the index
    public @CType("VkBool32") int writeStdSPSAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdSPS(this.segment(), index); }
    /// {@return `writeStdSPS`}
    public @CType("VkBool32") int writeStdSPS() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdSPS(this.segment()); }
    /// Sets `writeStdSPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_writeStdSPS(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_writeStdSPS.set(segment, 0L, index, value); }
    /// Sets `writeStdSPS` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_writeStdSPS(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdSPS(segment, 0L, value); }
    /// Sets `writeStdSPS` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPSAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdSPS(this.segment(), index, value); return this; }
    /// Sets `writeStdSPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdSPS(@CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdSPS(this.segment(), value); return this; }

    /// {@return `writeStdPPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_writeStdPPS(MemorySegment segment, long index) { return (int) VH_writeStdPPS.get(segment, 0L, index); }
    /// {@return `writeStdPPS`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_writeStdPPS(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdPPS(segment, 0L); }
    /// {@return `writeStdPPS` at the given index}
    /// @param index the index
    public @CType("VkBool32") int writeStdPPSAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdPPS(this.segment(), index); }
    /// {@return `writeStdPPS`}
    public @CType("VkBool32") int writeStdPPS() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_writeStdPPS(this.segment()); }
    /// Sets `writeStdPPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_writeStdPPS(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_writeStdPPS.set(segment, 0L, index, value); }
    /// Sets `writeStdPPS` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_writeStdPPS(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdPPS(segment, 0L, value); }
    /// Sets `writeStdPPS` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPSAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdPPS(this.segment(), index, value); return this; }
    /// Sets `writeStdPPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR writeStdPPS(@CType("VkBool32") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_writeStdPPS(this.segment(), value); return this; }

    /// {@return `stdSPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdSPSId(MemorySegment segment, long index) { return (int) VH_stdSPSId.get(segment, 0L, index); }
    /// {@return `stdSPSId`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdSPSId(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdSPSId(segment, 0L); }
    /// {@return `stdSPSId` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdSPSIdAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdSPSId(this.segment(), index); }
    /// {@return `stdSPSId`}
    public @CType("uint32_t") int stdSPSId() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdSPSId(this.segment()); }
    /// Sets `stdSPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSPSId(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdSPSId.set(segment, 0L, index, value); }
    /// Sets `stdSPSId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSPSId(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdSPSId(segment, 0L, value); }
    /// Sets `stdSPSId` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSIdAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdSPSId(this.segment(), index, value); return this; }
    /// Sets `stdSPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdSPSId(@CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdSPSId(this.segment(), value); return this; }

    /// {@return `stdPPSId` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdPPSId(MemorySegment segment, long index) { return (int) VH_stdPPSId.get(segment, 0L, index); }
    /// {@return `stdPPSId`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdPPSId(MemorySegment segment) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdPPSId(segment, 0L); }
    /// {@return `stdPPSId` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdPPSIdAt(long index) { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdPPSId(this.segment(), index); }
    /// {@return `stdPPSId`}
    public @CType("uint32_t") int stdPPSId() { return VkVideoEncodeH264SessionParametersGetInfoKHR.get_stdPPSId(this.segment()); }
    /// Sets `stdPPSId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdPPSId(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdPPSId.set(segment, 0L, index, value); }
    /// Sets `stdPPSId` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdPPSId(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdPPSId(segment, 0L, value); }
    /// Sets `stdPPSId` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSIdAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdPPSId(this.segment(), index, value); return this; }
    /// Sets `stdPPSId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersGetInfoKHR stdPPSId(@CType("uint32_t") int value) { VkVideoEncodeH264SessionParametersGetInfoKHR.set_stdPPSId(this.segment(), value); return this; }

}
