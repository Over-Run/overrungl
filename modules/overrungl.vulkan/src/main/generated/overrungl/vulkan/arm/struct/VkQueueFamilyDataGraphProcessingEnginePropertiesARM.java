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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkQueueFamilyDataGraphProcessingEnginePropertiesARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkExternalSemaphoreHandleTypeFlags foreignSemaphoreHandleTypes;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags foreignMemoryHandleTypes;
/// };
/// ```
public final class VkQueueFamilyDataGraphProcessingEnginePropertiesARM extends GroupType {
    /// The struct layout of `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("foreignSemaphoreHandleTypes"),
        ValueLayout.JAVA_INT.withName("foreignMemoryHandleTypes")
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
    /// The byte offset of `foreignSemaphoreHandleTypes`.
    public static final long OFFSET_foreignSemaphoreHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    /// The memory layout of `foreignSemaphoreHandleTypes`.
    public static final MemoryLayout LAYOUT_foreignSemaphoreHandleTypes = LAYOUT.select(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    /// The [VarHandle] of `foreignSemaphoreHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_foreignSemaphoreHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("foreignSemaphoreHandleTypes"));
    /// The byte offset of `foreignMemoryHandleTypes`.
    public static final long OFFSET_foreignMemoryHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("foreignMemoryHandleTypes"));
    /// The memory layout of `foreignMemoryHandleTypes`.
    public static final MemoryLayout LAYOUT_foreignMemoryHandleTypes = LAYOUT.select(PathElement.groupElement("foreignMemoryHandleTypes"));
    /// The [VarHandle] of `foreignMemoryHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_foreignMemoryHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("foreignMemoryHandleTypes"));

    /// Creates `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM alloc(SegmentAllocator allocator) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param foreignSemaphoreHandleTypes `foreignSemaphoreHandleTypes`
    /// @param foreignMemoryHandleTypes `foreignMemoryHandleTypes`
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int foreignSemaphoreHandleTypes, int foreignMemoryHandleTypes) {
        return alloc(allocator).sType(sType).pNext(pNext).foreignSemaphoreHandleTypes(foreignSemaphoreHandleTypes).foreignMemoryHandleTypes(foreignMemoryHandleTypes);
    }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param foreignSemaphoreHandleTypes `foreignSemaphoreHandleTypes`
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int foreignSemaphoreHandleTypes) {
        return alloc(allocator).sType(sType).pNext(pNext).foreignSemaphoreHandleTypes(foreignSemaphoreHandleTypes);
    }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM copyFrom(VkQueueFamilyDataGraphProcessingEnginePropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM reinterpret(long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `foreignSemaphoreHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int foreignSemaphoreHandleTypes(MemorySegment segment, long index) { return (int) VH_foreignSemaphoreHandleTypes.get(segment, 0L, index); }
    /// {@return `foreignSemaphoreHandleTypes`}
    public int foreignSemaphoreHandleTypes() { return foreignSemaphoreHandleTypes(this.segment(), 0L); }
    /// Sets `foreignSemaphoreHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void foreignSemaphoreHandleTypes(MemorySegment segment, long index, int value) { VH_foreignSemaphoreHandleTypes.set(segment, 0L, index, value); }
    /// Sets `foreignSemaphoreHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignSemaphoreHandleTypes(int value) { foreignSemaphoreHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `foreignMemoryHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int foreignMemoryHandleTypes(MemorySegment segment, long index) { return (int) VH_foreignMemoryHandleTypes.get(segment, 0L, index); }
    /// {@return `foreignMemoryHandleTypes`}
    public int foreignMemoryHandleTypes() { return foreignMemoryHandleTypes(this.segment(), 0L); }
    /// Sets `foreignMemoryHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void foreignMemoryHandleTypes(MemorySegment segment, long index, int value) { VH_foreignMemoryHandleTypes.set(segment, 0L, index, value); }
    /// Sets `foreignMemoryHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignMemoryHandleTypes(int value) { foreignMemoryHandleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM asSlice(long index) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyDataGraphProcessingEnginePropertiesARM`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM asSlice(long index, long count) { return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyDataGraphProcessingEnginePropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM at(long index, Consumer<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `foreignSemaphoreHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int foreignSemaphoreHandleTypesAt(long index) { return foreignSemaphoreHandleTypes(this.segment(), index); }
    /// Sets `foreignSemaphoreHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignSemaphoreHandleTypesAt(long index, int value) { foreignSemaphoreHandleTypes(this.segment(), index, value); return this; }

    /// {@return `foreignMemoryHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int foreignMemoryHandleTypesAt(long index) { return foreignMemoryHandleTypes(this.segment(), index); }
    /// Sets `foreignMemoryHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM foreignMemoryHandleTypesAt(long index, int value) { foreignMemoryHandleTypes(this.segment(), index, value); return this; }

}
