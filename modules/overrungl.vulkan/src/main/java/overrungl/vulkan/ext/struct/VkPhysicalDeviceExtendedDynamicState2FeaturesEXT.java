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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 extendedDynamicState2;
///     (uint32_t) VkBool32 extendedDynamicState2LogicOp;
///     (uint32_t) VkBool32 extendedDynamicState2PatchControlPoints;
/// };
/// ```
public sealed class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
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
    /// The byte offset of `extendedDynamicState2`.
    public static final long OFFSET_extendedDynamicState2 = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2"));
    /// The memory layout of `extendedDynamicState2`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2 = LAYOUT.select(PathElement.groupElement("extendedDynamicState2"));
    /// The [VarHandle] of `extendedDynamicState2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2"));
    /// The byte offset of `extendedDynamicState2LogicOp`.
    public static final long OFFSET_extendedDynamicState2LogicOp = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The memory layout of `extendedDynamicState2LogicOp`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2LogicOp = LAYOUT.select(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The [VarHandle] of `extendedDynamicState2LogicOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2LogicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The byte offset of `extendedDynamicState2PatchControlPoints`.
    public static final long OFFSET_extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    /// The memory layout of `extendedDynamicState2PatchControlPoints`.
    public static final MemoryLayout LAYOUT_extendedDynamicState2PatchControlPoints = LAYOUT.select(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    /// The [VarHandle] of `extendedDynamicState2PatchControlPoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_extendedDynamicState2PatchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2`}
    public int extendedDynamicState2() { return extendedDynamicState2(this.segment(), 0L); }
    /// Sets `extendedDynamicState2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2(MemorySegment segment, long index, int value) { VH_extendedDynamicState2.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(int value) { extendedDynamicState2(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2LogicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2LogicOp(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2LogicOp.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2LogicOp`}
    public int extendedDynamicState2LogicOp() { return extendedDynamicState2LogicOp(this.segment(), 0L); }
    /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2LogicOp(MemorySegment segment, long index, int value) { VH_extendedDynamicState2LogicOp.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2LogicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(int value) { extendedDynamicState2LogicOp(this.segment(), 0L, value); return this; }

    /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int extendedDynamicState2PatchControlPoints(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2PatchControlPoints.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2PatchControlPoints`}
    public int extendedDynamicState2PatchControlPoints() { return extendedDynamicState2PatchControlPoints(this.segment(), 0L); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extendedDynamicState2PatchControlPoints(MemorySegment segment, long index, int value) { VH_extendedDynamicState2PatchControlPoints.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(int value) { extendedDynamicState2PatchControlPoints(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceExtendedDynamicState2FeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2` at the given index}
        /// @param index the index of the struct buffer
        public int extendedDynamicState2At(long index) { return extendedDynamicState2(this.segment(), index); }
        /// Sets `extendedDynamicState2` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2At(long index, int value) { extendedDynamicState2(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2LogicOp` at the given index}
        /// @param index the index of the struct buffer
        public int extendedDynamicState2LogicOpAt(long index) { return extendedDynamicState2LogicOp(this.segment(), index); }
        /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2LogicOpAt(long index, int value) { extendedDynamicState2LogicOp(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
        /// @param index the index of the struct buffer
        public int extendedDynamicState2PatchControlPointsAt(long index) { return extendedDynamicState2PatchControlPoints(this.segment(), index); }
        /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2PatchControlPointsAt(long index, int value) { extendedDynamicState2PatchControlPoints(this.segment(), index, value); return this; }

    }
}
