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
/// struct VkDataGraphPipelineSessionMemoryRequirementsInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDataGraphPipelineSessionARM session;
///     (int) VkDataGraphPipelineSessionBindPointARM bindPoint;
///     uint32_t objectIndex;
/// };
/// ```
public final class VkDataGraphPipelineSessionMemoryRequirementsInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session"),
        ValueLayout.JAVA_INT.withName("bindPoint"),
        ValueLayout.JAVA_INT.withName("objectIndex")
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
    /// The byte offset of `session`.
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    /// The memory layout of `session`.
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    /// The [VarHandle] of `session` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));
    /// The byte offset of `bindPoint`.
    public static final long OFFSET_bindPoint = LAYOUT.byteOffset(PathElement.groupElement("bindPoint"));
    /// The memory layout of `bindPoint`.
    public static final MemoryLayout LAYOUT_bindPoint = LAYOUT.select(PathElement.groupElement("bindPoint"));
    /// The [VarHandle] of `bindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindPoint"));
    /// The byte offset of `objectIndex`.
    public static final long OFFSET_objectIndex = LAYOUT.byteOffset(PathElement.groupElement("objectIndex"));
    /// The memory layout of `objectIndex`.
    public static final MemoryLayout LAYOUT_objectIndex = LAYOUT.select(PathElement.groupElement("objectIndex"));
    /// The [VarHandle] of `objectIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectIndex"));

    /// Creates `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param session `session`
    /// @param bindPoint `bindPoint`
    /// @param objectIndex `objectIndex`
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long session, int bindPoint, int objectIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).session(session).bindPoint(bindPoint).objectIndex(objectIndex);
    }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param session `session`
    /// @param bindPoint `bindPoint`
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long session, int bindPoint) {
        return alloc(allocator).sType(sType).pNext(pNext).session(session).bindPoint(bindPoint);
    }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param session `session`
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long session) {
        return alloc(allocator).sType(sType).pNext(pNext).session(session);
    }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM copyFrom(VkDataGraphPipelineSessionMemoryRequirementsInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM reinterpret(long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `session` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long session(MemorySegment segment, long index) { return (long) VH_session.get(segment, 0L, index); }
    /// {@return `session`}
    public long session() { return session(this.segment(), 0L); }
    /// Sets `session` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void session(MemorySegment segment, long index, long value) { VH_session.set(segment, 0L, index, value); }
    /// Sets `session` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM session(long value) { session(this.segment(), 0L, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bindPoint(MemorySegment segment, long index) { return (int) VH_bindPoint.get(segment, 0L, index); }
    /// {@return `bindPoint`}
    public int bindPoint() { return bindPoint(this.segment(), 0L); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bindPoint(MemorySegment segment, long index, int value) { VH_bindPoint.set(segment, 0L, index, value); }
    /// Sets `bindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPoint(int value) { bindPoint(this.segment(), 0L, value); return this; }

    /// {@return `objectIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectIndex(MemorySegment segment, long index) { return (int) VH_objectIndex.get(segment, 0L, index); }
    /// {@return `objectIndex`}
    public int objectIndex() { return objectIndex(this.segment(), 0L); }
    /// Sets `objectIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectIndex(MemorySegment segment, long index, int value) { VH_objectIndex.set(segment, 0L, index, value); }
    /// Sets `objectIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndex(int value) { objectIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM asSlice(long index) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineSessionMemoryRequirementsInfoARM`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineSessionMemoryRequirementsInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM at(long index, Consumer<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `session` at the given index}
    /// @param index the index of the struct buffer
    public long sessionAt(long index) { return session(this.segment(), index); }
    /// Sets `session` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sessionAt(long index, long value) { session(this.segment(), index, value); return this; }

    /// {@return `bindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int bindPointAt(long index) { return bindPoint(this.segment(), index); }
    /// Sets `bindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPointAt(long index, int value) { bindPoint(this.segment(), index, value); return this; }

    /// {@return `objectIndex` at the given index}
    /// @param index the index of the struct buffer
    public int objectIndexAt(long index) { return objectIndex(this.segment(), index); }
    /// Sets `objectIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndexAt(long index, int value) { objectIndex(this.segment(), index, value); return this; }

}
