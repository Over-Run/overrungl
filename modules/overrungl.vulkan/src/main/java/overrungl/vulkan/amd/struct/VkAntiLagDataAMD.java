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
package overrungl.vulkan.amd.struct;

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
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ### maxFPS
/// [VarHandle][#VH_maxFPS] - [Getter][#maxFPS()] - [Setter][#maxFPS(int)]
/// ### pPresentationInfo
/// [VarHandle][#VH_pPresentationInfo] - [Getter][#pPresentationInfo()] - [Setter][#pPresentationInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAntiLagDataAMD {
///     VkStructureType sType;
///     const void * pNext;
///     VkAntiLagModeAMD mode;
///     uint32_t maxFPS;
///     const VkAntiLagPresentationInfoAMD * pPresentationInfo;
/// } VkAntiLagDataAMD;
/// ```
public sealed class VkAntiLagDataAMD extends Struct {
    /// The struct layout of `VkAntiLagDataAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("maxFPS"),
        ValueLayout.ADDRESS.withName("pPresentationInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The [VarHandle] of `maxFPS` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFPS = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFPS"));
    /// The [VarHandle] of `pPresentationInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPresentationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentationInfo"));

    /// Creates `VkAntiLagDataAMD` with the given segment.
    /// @param segment the memory segment
    public VkAntiLagDataAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagDataAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagDataAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAntiLagDataAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAntiLagDataAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAntiLagDataAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAntiLagDataAMD`
    public static VkAntiLagDataAMD alloc(SegmentAllocator allocator) { return new VkAntiLagDataAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAntiLagDataAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAntiLagDataAMD`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAntiLagDataAMD` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAntiLagDataAMD`
    public static VkAntiLagDataAMD allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkAntiLagModeAMD") int mode, @CType("uint32_t") int maxFPS, @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment pPresentationInfo) { return alloc(allocator).sType(sType).pNext(pNext).mode(mode).maxFPS(maxFPS).pPresentationInfo(pPresentationInfo); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAntiLagDataAMD copyFrom(VkAntiLagDataAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAntiLagDataAMD.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAntiLagDataAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAntiLagDataAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD sType(@CType("VkStructureType") int value) { VkAntiLagDataAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAntiLagDataAMD.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAntiLagDataAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAntiLagModeAMD") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkAntiLagModeAMD") int get_mode(MemorySegment segment) { return VkAntiLagDataAMD.get_mode(segment, 0L); }
    /// {@return `mode`}
    public @CType("VkAntiLagModeAMD") int mode() { return VkAntiLagDataAMD.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkAntiLagModeAMD") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkAntiLagModeAMD") int value) { VkAntiLagDataAMD.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD mode(@CType("VkAntiLagModeAMD") int value) { VkAntiLagDataAMD.set_mode(this.segment(), value); return this; }

    /// {@return `maxFPS` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFPS(MemorySegment segment, long index) { return (int) VH_maxFPS.get(segment, 0L, index); }
    /// {@return `maxFPS`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFPS(MemorySegment segment) { return VkAntiLagDataAMD.get_maxFPS(segment, 0L); }
    /// {@return `maxFPS`}
    public @CType("uint32_t") int maxFPS() { return VkAntiLagDataAMD.get_maxFPS(this.segment()); }
    /// Sets `maxFPS` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFPS(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFPS.set(segment, 0L, index, value); }
    /// Sets `maxFPS` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFPS(MemorySegment segment, @CType("uint32_t") int value) { VkAntiLagDataAMD.set_maxFPS(segment, 0L, value); }
    /// Sets `maxFPS` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD maxFPS(@CType("uint32_t") int value) { VkAntiLagDataAMD.set_maxFPS(this.segment(), value); return this; }

    /// {@return `pPresentationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment get_pPresentationInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPresentationInfo.get(segment, 0L, index); }
    /// {@return `pPresentationInfo`}
    /// @param segment the segment of the struct
    public static @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment get_pPresentationInfo(MemorySegment segment) { return VkAntiLagDataAMD.get_pPresentationInfo(segment, 0L); }
    /// {@return `pPresentationInfo`}
    public @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment pPresentationInfo() { return VkAntiLagDataAMD.get_pPresentationInfo(this.segment()); }
    /// Sets `pPresentationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPresentationInfo(MemorySegment segment, long index, @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment value) { VH_pPresentationInfo.set(segment, 0L, index, value); }
    /// Sets `pPresentationInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPresentationInfo(MemorySegment segment, @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pPresentationInfo(segment, 0L, value); }
    /// Sets `pPresentationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagDataAMD pPresentationInfo(@CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pPresentationInfo(this.segment(), value); return this; }

    /// A buffer of [VkAntiLagDataAMD].
    public static final class Buffer extends VkAntiLagDataAMD {
        private final long elementCount;

        /// Creates `VkAntiLagDataAMD.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAntiLagDataAMD`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAntiLagDataAMD`
        public VkAntiLagDataAMD asSlice(long index) { return new VkAntiLagDataAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAntiLagDataAMD`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAntiLagDataAMD`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAntiLagDataAMD.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAntiLagDataAMD.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAntiLagDataAMD.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pNext(this.segment(), index, value); return this; }

        /// {@return `mode` at the given index}
        /// @param index the index
        public @CType("VkAntiLagModeAMD") int modeAt(long index) { return VkAntiLagDataAMD.get_mode(this.segment(), index); }
        /// Sets `mode` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer modeAt(long index, @CType("VkAntiLagModeAMD") int value) { VkAntiLagDataAMD.set_mode(this.segment(), index, value); return this; }

        /// {@return `maxFPS` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFPSAt(long index) { return VkAntiLagDataAMD.get_maxFPS(this.segment(), index); }
        /// Sets `maxFPS` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFPSAt(long index, @CType("uint32_t") int value) { VkAntiLagDataAMD.set_maxFPS(this.segment(), index, value); return this; }

        /// {@return `pPresentationInfo` at the given index}
        /// @param index the index
        public @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment pPresentationInfoAt(long index) { return VkAntiLagDataAMD.get_pPresentationInfo(this.segment(), index); }
        /// Sets `pPresentationInfo` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPresentationInfoAt(long index, @CType("const VkAntiLagPresentationInfoAMD *") java.lang.foreign.MemorySegment value) { VkAntiLagDataAMD.set_pPresentationInfo(this.segment(), index, value); return this; }

    }
}
