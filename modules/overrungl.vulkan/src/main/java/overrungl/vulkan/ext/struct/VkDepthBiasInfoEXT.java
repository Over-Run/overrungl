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
/// ### depthBiasConstantFactor
/// [VarHandle][#VH_depthBiasConstantFactor] - [Getter][#depthBiasConstantFactor()] - [Setter][#depthBiasConstantFactor(float)]
/// ### depthBiasClamp
/// [VarHandle][#VH_depthBiasClamp] - [Getter][#depthBiasClamp()] - [Setter][#depthBiasClamp(float)]
/// ### depthBiasSlopeFactor
/// [VarHandle][#VH_depthBiasSlopeFactor] - [Getter][#depthBiasSlopeFactor()] - [Setter][#depthBiasSlopeFactor(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDepthBiasInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
/// } VkDepthBiasInfoEXT;
/// ```
public sealed class VkDepthBiasInfoEXT extends Struct {
    /// The struct layout of `VkDepthBiasInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `depthBiasConstantFactor` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasConstantFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasConstantFactor"));
    /// The [VarHandle] of `depthBiasClamp` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasClamp"));
    /// The [VarHandle] of `depthBiasSlopeFactor` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_depthBiasSlopeFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasSlopeFactor"));

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDepthBiasInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthBiasInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthBiasInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDepthBiasInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT alloc(SegmentAllocator allocator) { return new VkDepthBiasInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDepthBiasInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthBiasInfoEXT`
    public static VkDepthBiasInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("float") float depthBiasConstantFactor, @CType("float") float depthBiasClamp, @CType("float") float depthBiasSlopeFactor) { return alloc(allocator).sType(sType).pNext(pNext).depthBiasConstantFactor(depthBiasConstantFactor).depthBiasClamp(depthBiasClamp).depthBiasSlopeFactor(depthBiasSlopeFactor); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDepthBiasInfoEXT copyFrom(VkDepthBiasInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDepthBiasInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDepthBiasInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDepthBiasInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT sType(@CType("VkStructureType") int value) { VkDepthBiasInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkDepthBiasInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkDepthBiasInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkDepthBiasInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT pNext(@CType("const void *") MemorySegment value) { VkDepthBiasInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `depthBiasConstantFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasConstantFactor(MemorySegment segment, long index) { return (float) VH_depthBiasConstantFactor.get(segment, 0L, index); }
    /// {@return `depthBiasConstantFactor`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasConstantFactor(MemorySegment segment) { return VkDepthBiasInfoEXT.get_depthBiasConstantFactor(segment, 0L); }
    /// {@return `depthBiasConstantFactor`}
    public @CType("float") float depthBiasConstantFactor() { return VkDepthBiasInfoEXT.get_depthBiasConstantFactor(this.segment()); }
    /// Sets `depthBiasConstantFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasConstantFactor(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasConstantFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasConstantFactor(MemorySegment segment, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasConstantFactor(segment, 0L, value); }
    /// Sets `depthBiasConstantFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasConstantFactor(@CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasConstantFactor(this.segment(), value); return this; }

    /// {@return `depthBiasClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasClamp(MemorySegment segment, long index) { return (float) VH_depthBiasClamp.get(segment, 0L, index); }
    /// {@return `depthBiasClamp`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasClamp(MemorySegment segment) { return VkDepthBiasInfoEXT.get_depthBiasClamp(segment, 0L); }
    /// {@return `depthBiasClamp`}
    public @CType("float") float depthBiasClamp() { return VkDepthBiasInfoEXT.get_depthBiasClamp(this.segment()); }
    /// Sets `depthBiasClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasClamp.set(segment, 0L, index, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasClamp(MemorySegment segment, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasClamp(segment, 0L, value); }
    /// Sets `depthBiasClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasClamp(@CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasClamp(this.segment(), value); return this; }

    /// {@return `depthBiasSlopeFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_depthBiasSlopeFactor(MemorySegment segment, long index) { return (float) VH_depthBiasSlopeFactor.get(segment, 0L, index); }
    /// {@return `depthBiasSlopeFactor`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_depthBiasSlopeFactor(MemorySegment segment) { return VkDepthBiasInfoEXT.get_depthBiasSlopeFactor(segment, 0L); }
    /// {@return `depthBiasSlopeFactor`}
    public @CType("float") float depthBiasSlopeFactor() { return VkDepthBiasInfoEXT.get_depthBiasSlopeFactor(this.segment()); }
    /// Sets `depthBiasSlopeFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBiasSlopeFactor(MemorySegment segment, long index, @CType("float") float value) { VH_depthBiasSlopeFactor.set(segment, 0L, index, value); }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBiasSlopeFactor(MemorySegment segment, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasSlopeFactor(segment, 0L, value); }
    /// Sets `depthBiasSlopeFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthBiasInfoEXT depthBiasSlopeFactor(@CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasSlopeFactor(this.segment(), value); return this; }

    /// A buffer of [VkDepthBiasInfoEXT].
    public static final class Buffer extends VkDepthBiasInfoEXT {
        private final long elementCount;

        /// Creates `VkDepthBiasInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDepthBiasInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDepthBiasInfoEXT`
        public VkDepthBiasInfoEXT asSlice(long index) { return new VkDepthBiasInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDepthBiasInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDepthBiasInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDepthBiasInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDepthBiasInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkDepthBiasInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkDepthBiasInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `depthBiasConstantFactor` at the given index}
        /// @param index the index
        public @CType("float") float depthBiasConstantFactorAt(long index) { return VkDepthBiasInfoEXT.get_depthBiasConstantFactor(this.segment(), index); }
        /// Sets `depthBiasConstantFactor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasConstantFactorAt(long index, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasConstantFactor(this.segment(), index, value); return this; }

        /// {@return `depthBiasClamp` at the given index}
        /// @param index the index
        public @CType("float") float depthBiasClampAt(long index) { return VkDepthBiasInfoEXT.get_depthBiasClamp(this.segment(), index); }
        /// Sets `depthBiasClamp` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasClampAt(long index, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasClamp(this.segment(), index, value); return this; }

        /// {@return `depthBiasSlopeFactor` at the given index}
        /// @param index the index
        public @CType("float") float depthBiasSlopeFactorAt(long index) { return VkDepthBiasInfoEXT.get_depthBiasSlopeFactor(this.segment(), index); }
        /// Sets `depthBiasSlopeFactor` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasSlopeFactorAt(long index, @CType("float") float value) { VkDepthBiasInfoEXT.set_depthBiasSlopeFactor(this.segment(), index, value); return this; }

    }
}
