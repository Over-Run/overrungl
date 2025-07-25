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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkRayTracingShaderGroupCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkRayTracingShaderGroupTypeKHR type;
///     uint32_t generalShader;
///     uint32_t closestHitShader;
///     uint32_t anyHitShader;
///     uint32_t intersectionShader;
/// };
/// ```
public final class VkRayTracingShaderGroupCreateInfoNV extends GroupType {
    /// The struct layout of `VkRayTracingShaderGroupCreateInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader")
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
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `generalShader`.
    public static final long OFFSET_generalShader = LAYOUT.byteOffset(PathElement.groupElement("generalShader"));
    /// The memory layout of `generalShader`.
    public static final MemoryLayout LAYOUT_generalShader = LAYOUT.select(PathElement.groupElement("generalShader"));
    /// The [VarHandle] of `generalShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_generalShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generalShader"));
    /// The byte offset of `closestHitShader`.
    public static final long OFFSET_closestHitShader = LAYOUT.byteOffset(PathElement.groupElement("closestHitShader"));
    /// The memory layout of `closestHitShader`.
    public static final MemoryLayout LAYOUT_closestHitShader = LAYOUT.select(PathElement.groupElement("closestHitShader"));
    /// The [VarHandle] of `closestHitShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_closestHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("closestHitShader"));
    /// The byte offset of `anyHitShader`.
    public static final long OFFSET_anyHitShader = LAYOUT.byteOffset(PathElement.groupElement("anyHitShader"));
    /// The memory layout of `anyHitShader`.
    public static final MemoryLayout LAYOUT_anyHitShader = LAYOUT.select(PathElement.groupElement("anyHitShader"));
    /// The [VarHandle] of `anyHitShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_anyHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anyHitShader"));
    /// The byte offset of `intersectionShader`.
    public static final long OFFSET_intersectionShader = LAYOUT.byteOffset(PathElement.groupElement("intersectionShader"));
    /// The memory layout of `intersectionShader`.
    public static final MemoryLayout LAYOUT_intersectionShader = LAYOUT.select(PathElement.groupElement("intersectionShader"));
    /// The [VarHandle] of `intersectionShader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intersectionShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intersectionShader"));

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRayTracingShaderGroupCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRayTracingShaderGroupCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingShaderGroupCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV alloc(SegmentAllocator allocator) { return new VkRayTracingShaderGroupCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkRayTracingShaderGroupCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param generalShader `generalShader`
    /// @param closestHitShader `closestHitShader`
    /// @param anyHitShader `anyHitShader`
    /// @param intersectionShader `intersectionShader`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int generalShader, int closestHitShader, int anyHitShader, int intersectionShader) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).generalShader(generalShader).closestHitShader(closestHitShader).anyHitShader(anyHitShader).intersectionShader(intersectionShader);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param generalShader `generalShader`
    /// @param closestHitShader `closestHitShader`
    /// @param anyHitShader `anyHitShader`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int generalShader, int closestHitShader, int anyHitShader) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).generalShader(generalShader).closestHitShader(closestHitShader).anyHitShader(anyHitShader);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param generalShader `generalShader`
    /// @param closestHitShader `closestHitShader`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int generalShader, int closestHitShader) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).generalShader(generalShader).closestHitShader(closestHitShader);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @param generalShader `generalShader`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type, int generalShader) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type).generalShader(generalShader);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param type `type`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int type) {
        return alloc(allocator).sType(sType).pNext(pNext).type(type);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRayTracingShaderGroupCreateInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRayTracingShaderGroupCreateInfoNV`
    public static VkRayTracingShaderGroupCreateInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV copyFrom(VkRayTracingShaderGroupCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRayTracingShaderGroupCreateInfoNV reinterpret(long count) { return new VkRayTracingShaderGroupCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRayTracingShaderGroupCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRayTracingShaderGroupCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `generalShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int generalShader(MemorySegment segment, long index) { return (int) VH_generalShader.get(segment, 0L, index); }
    /// {@return `generalShader`}
    public int generalShader() { return generalShader(this.segment(), 0L); }
    /// Sets `generalShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void generalShader(MemorySegment segment, long index, int value) { VH_generalShader.set(segment, 0L, index, value); }
    /// Sets `generalShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV generalShader(int value) { generalShader(this.segment(), 0L, value); return this; }

    /// {@return `closestHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int closestHitShader(MemorySegment segment, long index) { return (int) VH_closestHitShader.get(segment, 0L, index); }
    /// {@return `closestHitShader`}
    public int closestHitShader() { return closestHitShader(this.segment(), 0L); }
    /// Sets `closestHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void closestHitShader(MemorySegment segment, long index, int value) { VH_closestHitShader.set(segment, 0L, index, value); }
    /// Sets `closestHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV closestHitShader(int value) { closestHitShader(this.segment(), 0L, value); return this; }

    /// {@return `anyHitShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int anyHitShader(MemorySegment segment, long index) { return (int) VH_anyHitShader.get(segment, 0L, index); }
    /// {@return `anyHitShader`}
    public int anyHitShader() { return anyHitShader(this.segment(), 0L); }
    /// Sets `anyHitShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void anyHitShader(MemorySegment segment, long index, int value) { VH_anyHitShader.set(segment, 0L, index, value); }
    /// Sets `anyHitShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV anyHitShader(int value) { anyHitShader(this.segment(), 0L, value); return this; }

    /// {@return `intersectionShader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intersectionShader(MemorySegment segment, long index) { return (int) VH_intersectionShader.get(segment, 0L, index); }
    /// {@return `intersectionShader`}
    public int intersectionShader() { return intersectionShader(this.segment(), 0L); }
    /// Sets `intersectionShader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intersectionShader(MemorySegment segment, long index, int value) { VH_intersectionShader.set(segment, 0L, index, value); }
    /// Sets `intersectionShader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV intersectionShader(int value) { intersectionShader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRayTracingShaderGroupCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRayTracingShaderGroupCreateInfoNV`
    public VkRayTracingShaderGroupCreateInfoNV asSlice(long index) { return new VkRayTracingShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRayTracingShaderGroupCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRayTracingShaderGroupCreateInfoNV`
    public VkRayTracingShaderGroupCreateInfoNV asSlice(long index, long count) { return new VkRayTracingShaderGroupCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRayTracingShaderGroupCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV at(long index, Consumer<VkRayTracingShaderGroupCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `generalShader` at the given index}
    /// @param index the index of the struct buffer
    public int generalShaderAt(long index) { return generalShader(this.segment(), index); }
    /// Sets `generalShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV generalShaderAt(long index, int value) { generalShader(this.segment(), index, value); return this; }

    /// {@return `closestHitShader` at the given index}
    /// @param index the index of the struct buffer
    public int closestHitShaderAt(long index) { return closestHitShader(this.segment(), index); }
    /// Sets `closestHitShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV closestHitShaderAt(long index, int value) { closestHitShader(this.segment(), index, value); return this; }

    /// {@return `anyHitShader` at the given index}
    /// @param index the index of the struct buffer
    public int anyHitShaderAt(long index) { return anyHitShader(this.segment(), index); }
    /// Sets `anyHitShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV anyHitShaderAt(long index, int value) { anyHitShader(this.segment(), index, value); return this; }

    /// {@return `intersectionShader` at the given index}
    /// @param index the index of the struct buffer
    public int intersectionShaderAt(long index) { return intersectionShader(this.segment(), index); }
    /// Sets `intersectionShader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingShaderGroupCreateInfoNV intersectionShaderAt(long index, int value) { intersectionShader(this.segment(), index, value); return this; }

}
