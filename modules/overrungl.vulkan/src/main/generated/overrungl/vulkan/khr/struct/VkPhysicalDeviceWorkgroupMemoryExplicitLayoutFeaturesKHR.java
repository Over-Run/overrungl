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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 workgroupMemoryExplicitLayout;
///     (uint32_t) VkBool32 workgroupMemoryExplicitLayoutScalarBlockLayout;
///     (uint32_t) VkBool32 workgroupMemoryExplicitLayout8BitAccess;
///     (uint32_t) VkBool32 workgroupMemoryExplicitLayout16BitAccess;
/// };
/// ```
public sealed class VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayoutScalarBlockLayout"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout8BitAccess"),
        ValueLayout.JAVA_INT.withName("workgroupMemoryExplicitLayout16BitAccess")
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
    /// The byte offset of `workgroupMemoryExplicitLayout`.
    public static final long OFFSET_workgroupMemoryExplicitLayout = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    /// The memory layout of `workgroupMemoryExplicitLayout`.
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout"));
    /// The byte offset of `workgroupMemoryExplicitLayoutScalarBlockLayout`.
    public static final long OFFSET_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    /// The memory layout of `workgroupMemoryExplicitLayoutScalarBlockLayout`.
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayoutScalarBlockLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_workgroupMemoryExplicitLayoutScalarBlockLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayoutScalarBlockLayout"));
    /// The byte offset of `workgroupMemoryExplicitLayout8BitAccess`.
    public static final long OFFSET_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    /// The memory layout of `workgroupMemoryExplicitLayout8BitAccess`.
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout8BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout8BitAccess"));
    /// The byte offset of `workgroupMemoryExplicitLayout16BitAccess`.
    public static final long OFFSET_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.byteOffset(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
    /// The memory layout of `workgroupMemoryExplicitLayout16BitAccess`.
    public static final MemoryLayout LAYOUT_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.select(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));
    /// The [VarHandle] of `workgroupMemoryExplicitLayout16BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_workgroupMemoryExplicitLayout16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("workgroupMemoryExplicitLayout16BitAccess"));

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
    public static VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR copyFrom(VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `workgroupMemoryExplicitLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int workgroupMemoryExplicitLayout(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout`}
    public int workgroupMemoryExplicitLayout() { return workgroupMemoryExplicitLayout(this.segment(), 0L); }
    /// Sets `workgroupMemoryExplicitLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void workgroupMemoryExplicitLayout(MemorySegment segment, long index, int value) { VH_workgroupMemoryExplicitLayout.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout(int value) { workgroupMemoryExplicitLayout(this.segment(), 0L, value); return this; }

    /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayoutScalarBlockLayout.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout`}
    public int workgroupMemoryExplicitLayoutScalarBlockLayout() { return workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), 0L); }
    /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void workgroupMemoryExplicitLayoutScalarBlockLayout(MemorySegment segment, long index, int value) { VH_workgroupMemoryExplicitLayoutScalarBlockLayout.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayoutScalarBlockLayout(int value) { workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), 0L, value); return this; }

    /// {@return `workgroupMemoryExplicitLayout8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout8BitAccess.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout8BitAccess`}
    public int workgroupMemoryExplicitLayout8BitAccess() { return workgroupMemoryExplicitLayout8BitAccess(this.segment(), 0L); }
    /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void workgroupMemoryExplicitLayout8BitAccess(MemorySegment segment, long index, int value) { VH_workgroupMemoryExplicitLayout8BitAccess.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout8BitAccess(int value) { workgroupMemoryExplicitLayout8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `workgroupMemoryExplicitLayout16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment, long index) { return (int) VH_workgroupMemoryExplicitLayout16BitAccess.get(segment, 0L, index); }
    /// {@return `workgroupMemoryExplicitLayout16BitAccess`}
    public int workgroupMemoryExplicitLayout16BitAccess() { return workgroupMemoryExplicitLayout16BitAccess(this.segment(), 0L); }
    /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void workgroupMemoryExplicitLayout16BitAccess(MemorySegment segment, long index, int value) { VH_workgroupMemoryExplicitLayout16BitAccess.set(segment, 0L, index, value); }
    /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR workgroupMemoryExplicitLayout16BitAccess(int value) { workgroupMemoryExplicitLayout16BitAccess(this.segment(), 0L, value); return this; }

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

        /// {@return `workgroupMemoryExplicitLayout` at the given index}
        /// @param index the index of the struct buffer
        public int workgroupMemoryExplicitLayoutAt(long index) { return workgroupMemoryExplicitLayout(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayoutAt(long index, int value) { workgroupMemoryExplicitLayout(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayoutScalarBlockLayout` at the given index}
        /// @param index the index of the struct buffer
        public int workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index) { return workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayoutScalarBlockLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayoutScalarBlockLayoutAt(long index, int value) { workgroupMemoryExplicitLayoutScalarBlockLayout(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayout8BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int workgroupMemoryExplicitLayout8BitAccessAt(long index) { return workgroupMemoryExplicitLayout8BitAccess(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout8BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayout8BitAccessAt(long index, int value) { workgroupMemoryExplicitLayout8BitAccess(this.segment(), index, value); return this; }

        /// {@return `workgroupMemoryExplicitLayout16BitAccess` at the given index}
        /// @param index the index of the struct buffer
        public int workgroupMemoryExplicitLayout16BitAccessAt(long index) { return workgroupMemoryExplicitLayout16BitAccess(this.segment(), index); }
        /// Sets `workgroupMemoryExplicitLayout16BitAccess` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer workgroupMemoryExplicitLayout16BitAccessAt(long index, int value) { workgroupMemoryExplicitLayout16BitAccess(this.segment(), index, value); return this; }

    }
}
