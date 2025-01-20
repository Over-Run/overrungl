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
/// ### extendedDynamicState2
/// [VarHandle][#VH_extendedDynamicState2] - [Getter][#extendedDynamicState2()] - [Setter][#extendedDynamicState2(int)]
/// ### extendedDynamicState2LogicOp
/// [VarHandle][#VH_extendedDynamicState2LogicOp] - [Getter][#extendedDynamicState2LogicOp()] - [Setter][#extendedDynamicState2LogicOp(int)]
/// ### extendedDynamicState2PatchControlPoints
/// [VarHandle][#VH_extendedDynamicState2PatchControlPoints] - [Getter][#extendedDynamicState2PatchControlPoints()] - [Setter][#extendedDynamicState2PatchControlPoints(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 extendedDynamicState2;
///     VkBool32 extendedDynamicState2LogicOp;
///     VkBool32 extendedDynamicState2PatchControlPoints;
/// } VkPhysicalDeviceExtendedDynamicState2FeaturesEXT;
/// ```
public sealed class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `extendedDynamicState2` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extendedDynamicState2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2"));
    /// The [VarHandle] of `extendedDynamicState2LogicOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extendedDynamicState2LogicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2LogicOp"));
    /// The [VarHandle] of `extendedDynamicState2PatchControlPoints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_extendedDynamicState2PatchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int extendedDynamicState2, @CType("VkBool32") int extendedDynamicState2LogicOp, @CType("VkBool32") int extendedDynamicState2PatchControlPoints) { return alloc(allocator).sType(sType).pNext(pNext).extendedDynamicState2(extendedDynamicState2).extendedDynamicState2LogicOp(extendedDynamicState2LogicOp).extendedDynamicState2PatchControlPoints(extendedDynamicState2PatchControlPoints); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `extendedDynamicState2` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_extendedDynamicState2(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_extendedDynamicState2(MemorySegment segment) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2(segment, 0L); }
    /// {@return `extendedDynamicState2`}
    public @CType("VkBool32") int extendedDynamicState2() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2(this.segment()); }
    /// Sets `extendedDynamicState2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedDynamicState2(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_extendedDynamicState2.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedDynamicState2(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2(segment, 0L, value); }
    /// Sets `extendedDynamicState2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(@CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2(this.segment(), value); return this; }

    /// {@return `extendedDynamicState2LogicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_extendedDynamicState2LogicOp(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2LogicOp.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2LogicOp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_extendedDynamicState2LogicOp(MemorySegment segment) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2LogicOp(segment, 0L); }
    /// {@return `extendedDynamicState2LogicOp`}
    public @CType("VkBool32") int extendedDynamicState2LogicOp() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2LogicOp(this.segment()); }
    /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedDynamicState2LogicOp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_extendedDynamicState2LogicOp.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2LogicOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedDynamicState2LogicOp(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2LogicOp(segment, 0L, value); }
    /// Sets `extendedDynamicState2LogicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(@CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2LogicOp(this.segment(), value); return this; }

    /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_extendedDynamicState2PatchControlPoints(MemorySegment segment, long index) { return (int) VH_extendedDynamicState2PatchControlPoints.get(segment, 0L, index); }
    /// {@return `extendedDynamicState2PatchControlPoints`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_extendedDynamicState2PatchControlPoints(MemorySegment segment) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2PatchControlPoints(segment, 0L); }
    /// {@return `extendedDynamicState2PatchControlPoints`}
    public @CType("VkBool32") int extendedDynamicState2PatchControlPoints() { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2PatchControlPoints(this.segment()); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extendedDynamicState2PatchControlPoints(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_extendedDynamicState2PatchControlPoints.set(segment, 0L, index, value); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extendedDynamicState2PatchControlPoints(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2PatchControlPoints(segment, 0L, value); }
    /// Sets `extendedDynamicState2PatchControlPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(@CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2PatchControlPoints(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2` at the given index}
        /// @param index the index
        public @CType("VkBool32") int extendedDynamicState2At(long index) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2(this.segment(), index); }
        /// Sets `extendedDynamicState2` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2At(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2LogicOp` at the given index}
        /// @param index the index
        public @CType("VkBool32") int extendedDynamicState2LogicOpAt(long index) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2LogicOp(this.segment(), index); }
        /// Sets `extendedDynamicState2LogicOp` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2LogicOpAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2LogicOp(this.segment(), index, value); return this; }

        /// {@return `extendedDynamicState2PatchControlPoints` at the given index}
        /// @param index the index
        public @CType("VkBool32") int extendedDynamicState2PatchControlPointsAt(long index) { return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.get_extendedDynamicState2PatchControlPoints(this.segment(), index); }
        /// Sets `extendedDynamicState2PatchControlPoints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extendedDynamicState2PatchControlPointsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.set_extendedDynamicState2PatchControlPoints(this.segment(), index, value); return this; }

    }
}
