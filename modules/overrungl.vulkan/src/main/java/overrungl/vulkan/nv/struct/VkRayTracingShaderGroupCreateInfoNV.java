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
package overrungl.vulkan.nv.struct;

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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### generalShader
/// [VarHandle][#VH_generalShader] - [Getter][#generalShader()] - [Setter][#generalShader(int)]
/// ### closestHitShader
/// [VarHandle][#VH_closestHitShader] - [Getter][#closestHitShader()] - [Setter][#closestHitShader(int)]
/// ### anyHitShader
/// [VarHandle][#VH_anyHitShader] - [Getter][#anyHitShader()] - [Setter][#anyHitShader(int)]
/// ### intersectionShader
/// [VarHandle][#VH_intersectionShader] - [Getter][#intersectionShader()] - [Setter][#intersectionShader(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRayTracingShaderGroupCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkRayTracingShaderGroupTypeKHR type;
///     uint32_t generalShader;
///     uint32_t closestHitShader;
///     uint32_t anyHitShader;
///     uint32_t intersectionShader;
/// } VkRayTracingShaderGroupCreateInfoNV;
/// ```
public sealed class VkRayTracingShaderGroupCreateInfoNV extends Struct {
    /// The struct layout of `VkRayTracingShaderGroupCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `generalShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_generalShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generalShader"));
    /// The [VarHandle] of `closestHitShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_closestHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("closestHitShader"));
    /// The [VarHandle] of `anyHitShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_anyHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anyHitShader"));
    /// The [VarHandle] of `intersectionShader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_intersectionShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intersectionShader"));

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkRayTracingShaderGroupCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoNV(segment); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV alloc(SegmentAllocator allocator) { return new VkRayTracingShaderGroupCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkRayTracingShaderGroupTypeKHR") int type, @CType("uint32_t") int generalShader, @CType("uint32_t") int closestHitShader, @CType("uint32_t") int anyHitShader, @CType("uint32_t") int intersectionShader) { return alloc(allocator).sType(sType).pNext(pNext).type(type).generalShader(generalShader).closestHitShader(closestHitShader).anyHitShader(anyHitShader).intersectionShader(intersectionShader); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV copyFrom(VkRayTracingShaderGroupCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRayTracingShaderGroupCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV sType(@CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkRayTracingShaderGroupCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkRayTracingShaderGroupCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV pNext(@CType("const void *") MemorySegment value) { VkRayTracingShaderGroupCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRayTracingShaderGroupTypeKHR") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkRayTracingShaderGroupTypeKHR") int get_type(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkRayTracingShaderGroupTypeKHR") int type() { return VkRayTracingShaderGroupCreateInfoNV.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoNV.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV type(@CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoNV.set_type(this.segment(), value); return this; }

    /// {@return `generalShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_generalShader(MemorySegment segment, long index) { return (int) VH_generalShader.get(segment, 0L, index); }
    /// {@return `generalShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_generalShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_generalShader(segment, 0L); }
    /// {@return `generalShader`}
    public @CType("uint32_t") int generalShader() { return VkRayTracingShaderGroupCreateInfoNV.get_generalShader(this.segment()); }
    /// Sets `generalShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_generalShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_generalShader.set(segment, 0L, index, value); }
    /// Sets `generalShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_generalShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_generalShader(segment, 0L, value); }
    /// Sets `generalShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV generalShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_generalShader(this.segment(), value); return this; }

    /// {@return `closestHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_closestHitShader(MemorySegment segment, long index) { return (int) VH_closestHitShader.get(segment, 0L, index); }
    /// {@return `closestHitShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_closestHitShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_closestHitShader(segment, 0L); }
    /// {@return `closestHitShader`}
    public @CType("uint32_t") int closestHitShader() { return VkRayTracingShaderGroupCreateInfoNV.get_closestHitShader(this.segment()); }
    /// Sets `closestHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_closestHitShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_closestHitShader.set(segment, 0L, index, value); }
    /// Sets `closestHitShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_closestHitShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_closestHitShader(segment, 0L, value); }
    /// Sets `closestHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV closestHitShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_closestHitShader(this.segment(), value); return this; }

    /// {@return `anyHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_anyHitShader(MemorySegment segment, long index) { return (int) VH_anyHitShader.get(segment, 0L, index); }
    /// {@return `anyHitShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_anyHitShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_anyHitShader(segment, 0L); }
    /// {@return `anyHitShader`}
    public @CType("uint32_t") int anyHitShader() { return VkRayTracingShaderGroupCreateInfoNV.get_anyHitShader(this.segment()); }
    /// Sets `anyHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_anyHitShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_anyHitShader.set(segment, 0L, index, value); }
    /// Sets `anyHitShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_anyHitShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_anyHitShader(segment, 0L, value); }
    /// Sets `anyHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV anyHitShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_anyHitShader(this.segment(), value); return this; }

    /// {@return `intersectionShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_intersectionShader(MemorySegment segment, long index) { return (int) VH_intersectionShader.get(segment, 0L, index); }
    /// {@return `intersectionShader`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_intersectionShader(MemorySegment segment) { return VkRayTracingShaderGroupCreateInfoNV.get_intersectionShader(segment, 0L); }
    /// {@return `intersectionShader`}
    public @CType("uint32_t") int intersectionShader() { return VkRayTracingShaderGroupCreateInfoNV.get_intersectionShader(this.segment()); }
    /// Sets `intersectionShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_intersectionShader(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_intersectionShader.set(segment, 0L, index, value); }
    /// Sets `intersectionShader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_intersectionShader(MemorySegment segment, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_intersectionShader(segment, 0L, value); }
    /// Sets `intersectionShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV intersectionShader(@CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_intersectionShader(this.segment(), value); return this; }

    /// A buffer of [VkRayTracingShaderGroupCreateInfoNV].
    public static final class Buffer extends VkRayTracingShaderGroupCreateInfoNV {
        private final long elementCount;

        /// Creates `VkRayTracingShaderGroupCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkRayTracingShaderGroupCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkRayTracingShaderGroupCreateInfoNV`
        public VkRayTracingShaderGroupCreateInfoNV asSlice(long index) { return new VkRayTracingShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkRayTracingShaderGroupCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkRayTracingShaderGroupCreateInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkRayTracingShaderGroupCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkRayTracingShaderGroupCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkRayTracingShaderGroupTypeKHR") int typeAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkRayTracingShaderGroupTypeKHR") int value) { VkRayTracingShaderGroupCreateInfoNV.set_type(this.segment(), index, value); return this; }

        /// {@return `generalShader` at the given index}
        /// @param index the index
        public @CType("uint32_t") int generalShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_generalShader(this.segment(), index); }
        /// Sets `generalShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer generalShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_generalShader(this.segment(), index, value); return this; }

        /// {@return `closestHitShader` at the given index}
        /// @param index the index
        public @CType("uint32_t") int closestHitShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_closestHitShader(this.segment(), index); }
        /// Sets `closestHitShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer closestHitShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_closestHitShader(this.segment(), index, value); return this; }

        /// {@return `anyHitShader` at the given index}
        /// @param index the index
        public @CType("uint32_t") int anyHitShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_anyHitShader(this.segment(), index); }
        /// Sets `anyHitShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer anyHitShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_anyHitShader(this.segment(), index, value); return this; }

        /// {@return `intersectionShader` at the given index}
        /// @param index the index
        public @CType("uint32_t") int intersectionShaderAt(long index) { return VkRayTracingShaderGroupCreateInfoNV.get_intersectionShader(this.segment(), index); }
        /// Sets `intersectionShader` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer intersectionShaderAt(long index, @CType("uint32_t") int value) { VkRayTracingShaderGroupCreateInfoNV.set_intersectionShader(this.segment(), index, value); return this; }

    }
}
