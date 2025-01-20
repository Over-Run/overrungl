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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### workgroupMemoryExplicitLayout
/// [VarHandle][#VH_workgroupMemoryExplicitLayout] - [Getter][#workgroupMemoryExplicitLayout()] - [Setter][#workgroupMemoryExplicitLayout(int)]
/// ### workgroupMemoryExplicitLayoutScalarBlockLayout
/// [VarHandle][#VH_workgroupMemoryExplicitLayoutScalarBlockLayout] - [Getter][#workgroupMemoryExplicitLayoutScalarBlockLayout()] - [Setter][#workgroupMemoryExplicitLayoutScalarBlockLayout(int)]
/// ### workgroupMemoryExplicitLayout8BitAccess
/// [VarHandle][#VH_workgroupMemoryExplicitLayout8BitAccess] - [Getter][#workgroupMemoryExplicitLayout8BitAccess()] - [Setter][#workgroupMemoryExplicitLayout8BitAccess(int)]
/// ### workgroupMemoryExplicitLayout16BitAccess
/// [VarHandle][#VH_workgroupMemoryExplicitLayout16BitAccess] - [Getter][#workgroupMemoryExplicitLayout16BitAccess()] - [Setter][#workgroupMemoryExplicitLayout16BitAccess(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 workgroupMemoryExplicitLayout;
///     VkBool32 workgroupMemoryExplicitLayoutScalarBlockLayout;
///     VkBool32 workgroupMemoryExplicitLayout8BitAccess;
///     VkBool32 workgroupMemoryExplicitLayout16BitAccess;
/// } VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR;
/// ```
public sealed class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayoutScalarBlockLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout8BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout16BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int workgroupMemoryExplicitLayout, @CType("VkBool32") int workgroupMemoryExplicitLayoutScalarBlockLayout, @CType("VkBool32") int workgroupMemoryExplicitLayout8BitAccess, @CType("VkBool32") int workgroupMemoryExplicitLayout16BitAccess) { return alloc(allocator).sType(sType).pNext(pNext).workgroupMemoryExplicitLayout(workgroupMemoryExplicitLayout).workgroupMemoryExplicitLayoutScalarBlockLayout(workgroupMemoryExplicitLayoutScalarBlockLayout).workgroupMemoryExplicitLayout8BitAccess(workgroupMemoryExplicitLayout8BitAccess).workgroupMemoryExplicitLayout16BitAccess(workgroupMemoryExplicitLayout16BitAccess); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR copyFrom(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(@CType("void *") MemorySegment value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `workgroupMemoryExplicitLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout(segment, 0L); }
    /// {@return `workgroupMemoryExplicitLayout`}
    public @CType("VkBool32") int workgroupMemoryExplicitLayout() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout(this.segment()); }
    /// Sets `workgroupMemoryExplicitLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_workgroupMemoryExplicitLayout.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout(segment, 0L, value); }
    /// Sets `workgroupMemoryExplicitLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(@CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout(this.segment(), value); return this; }

    /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayoutScalarBlockLayout.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayoutScalarBlockLayout(segment, 0L); }
    /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout`}
    public @CType("VkBool32") int workgroupMemoryExplicitLayoutScalarBlockLayout() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment()); }
    /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_workgroupMemoryExplicitLayoutScalarBlockLayout.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayoutScalarBlockLayout(segment, 0L, value); }
    /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(@CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), value); return this; }

    /// {@return `workgroupMemoryExplicitLayout8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout8BitAccess.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout8BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout8BitAccess(segment, 0L); }
    /// {@return `workgroupMemoryExplicitLayout8BitAccess`}
    public @CType("VkBool32") int workgroupMemoryExplicitLayout8BitAccess() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout8BitAccess(this.segment()); }
    /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_workgroupMemoryExplicitLayout8BitAccess.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout8BitAccess(segment, 0L, value); }
    /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout8BitAccess(this.segment(), value); return this; }

    /// {@return `workgroupMemoryExplicitLayout16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout16BitAccess.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout16BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout16BitAccess(segment, 0L); }
    /// {@return `workgroupMemoryExplicitLayout16BitAccess`}
    public @CType("VkBool32") int workgroupMemoryExplicitLayout16BitAccess() { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout16BitAccess(this.segment()); }
    /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_workgroupMemoryExplicitLayout16BitAccess.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout16BitAccess(segment, 0L, value); }
    /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(@CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout16BitAccess(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
        public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayout` at the given index}
        /// @param index the index
        public @CType("VkBool32") int workgroupMemoryExplicitLayoutAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout` at the given index}
        /// @param index the index
        public @CType("VkBool32") int workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayout8BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int workgroupMemoryExplicitLayout8BitAccessAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout8BitAccess(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayout8BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout8BitAccess(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayout16BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int workgroupMemoryExplicitLayout16BitAccessAt(long index) { return VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.get_workgroupMemoryExplicitLayout16BitAccess(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayout16BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR.set_workgroupMemoryExplicitLayout16BitAccess(this.segment(), index, value); return this; }

    }
}
