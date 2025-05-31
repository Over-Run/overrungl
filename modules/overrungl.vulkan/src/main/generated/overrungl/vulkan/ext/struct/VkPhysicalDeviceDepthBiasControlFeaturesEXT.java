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
/// struct VkPhysicalDeviceDepthBiasControlFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 depthBiasControl;
///     (uint32_t) VkBool32 leastRepresentableValueForceUnormRepresentation;
///     (uint32_t) VkBool32 floatRepresentation;
///     (uint32_t) VkBool32 depthBiasExact;
/// };
/// ```
public sealed class VkPhysicalDeviceDepthBiasControlFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasControl"),
        ValueLayout.JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation"),
        ValueLayout.JAVA_INT.withName("floatRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
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
    /// The byte offset of `depthBiasControl`.
    public static final long OFFSET_depthBiasControl = LAYOUT.byteOffset(PathElement.groupElement("depthBiasControl"));
    /// The memory layout of `depthBiasControl`.
    public static final MemoryLayout LAYOUT_depthBiasControl = LAYOUT.select(PathElement.groupElement("depthBiasControl"));
    /// The [VarHandle] of `depthBiasControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasControl"));
    /// The byte offset of `leastRepresentableValueForceUnormRepresentation`.
    public static final long OFFSET_leastRepresentableValueForceUnormRepresentation = LAYOUT.byteOffset(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    /// The memory layout of `leastRepresentableValueForceUnormRepresentation`.
    public static final MemoryLayout LAYOUT_leastRepresentableValueForceUnormRepresentation = LAYOUT.select(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    /// The [VarHandle] of `leastRepresentableValueForceUnormRepresentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_leastRepresentableValueForceUnormRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    /// The byte offset of `floatRepresentation`.
    public static final long OFFSET_floatRepresentation = LAYOUT.byteOffset(PathElement.groupElement("floatRepresentation"));
    /// The memory layout of `floatRepresentation`.
    public static final MemoryLayout LAYOUT_floatRepresentation = LAYOUT.select(PathElement.groupElement("floatRepresentation"));
    /// The [VarHandle] of `floatRepresentation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_floatRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("floatRepresentation"));
    /// The byte offset of `depthBiasExact`.
    public static final long OFFSET_depthBiasExact = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
    /// The memory layout of `depthBiasExact`.
    public static final MemoryLayout LAYOUT_depthBiasExact = LAYOUT.select(PathElement.groupElement("depthBiasExact"));
    /// The [VarHandle] of `depthBiasExact` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDepthBiasControlFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT copyFrom(VkPhysicalDeviceDepthBiasControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasControl(MemorySegment segment, long index) { return (int) VH_depthBiasControl.get(segment, 0L, index); }
    /// {@return `depthBiasControl`}
    public int depthBiasControl() { return depthBiasControl(this.segment(), 0L); }
    /// Sets `depthBiasControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasControl(MemorySegment segment, long index, int value) { VH_depthBiasControl.set(segment, 0L, index, value); }
    /// Sets `depthBiasControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(int value) { depthBiasControl(this.segment(), 0L, value); return this; }

    /// {@return `leastRepresentableValueForceUnormRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int leastRepresentableValueForceUnormRepresentation(MemorySegment segment, long index) { return (int) VH_leastRepresentableValueForceUnormRepresentation.get(segment, 0L, index); }
    /// {@return `leastRepresentableValueForceUnormRepresentation`}
    public int leastRepresentableValueForceUnormRepresentation() { return leastRepresentableValueForceUnormRepresentation(this.segment(), 0L); }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void leastRepresentableValueForceUnormRepresentation(MemorySegment segment, long index, int value) { VH_leastRepresentableValueForceUnormRepresentation.set(segment, 0L, index, value); }
    /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(int value) { leastRepresentableValueForceUnormRepresentation(this.segment(), 0L, value); return this; }

    /// {@return `floatRepresentation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int floatRepresentation(MemorySegment segment, long index) { return (int) VH_floatRepresentation.get(segment, 0L, index); }
    /// {@return `floatRepresentation`}
    public int floatRepresentation() { return floatRepresentation(this.segment(), 0L); }
    /// Sets `floatRepresentation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void floatRepresentation(MemorySegment segment, long index, int value) { VH_floatRepresentation.set(segment, 0L, index, value); }
    /// Sets `floatRepresentation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(int value) { floatRepresentation(this.segment(), 0L, value); return this; }

    /// {@return `depthBiasExact` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthBiasExact(MemorySegment segment, long index) { return (int) VH_depthBiasExact.get(segment, 0L, index); }
    /// {@return `depthBiasExact`}
    public int depthBiasExact() { return depthBiasExact(this.segment(), 0L); }
    /// Sets `depthBiasExact` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthBiasExact(MemorySegment segment, long index, int value) { VH_depthBiasExact.set(segment, 0L, index, value); }
    /// Sets `depthBiasExact` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(int value) { depthBiasExact(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDepthBiasControlFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceDepthBiasControlFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDepthBiasControlFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDepthBiasControlFeaturesEXT`
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

        /// {@return `depthBiasControl` at the given index}
        /// @param index the index of the struct buffer
        public int depthBiasControlAt(long index) { return depthBiasControl(this.segment(), index); }
        /// Sets `depthBiasControl` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasControlAt(long index, int value) { depthBiasControl(this.segment(), index, value); return this; }

        /// {@return `leastRepresentableValueForceUnormRepresentation` at the given index}
        /// @param index the index of the struct buffer
        public int leastRepresentableValueForceUnormRepresentationAt(long index) { return leastRepresentableValueForceUnormRepresentation(this.segment(), index); }
        /// Sets `leastRepresentableValueForceUnormRepresentation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer leastRepresentableValueForceUnormRepresentationAt(long index, int value) { leastRepresentableValueForceUnormRepresentation(this.segment(), index, value); return this; }

        /// {@return `floatRepresentation` at the given index}
        /// @param index the index of the struct buffer
        public int floatRepresentationAt(long index) { return floatRepresentation(this.segment(), index); }
        /// Sets `floatRepresentation` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer floatRepresentationAt(long index, int value) { floatRepresentation(this.segment(), index, value); return this; }

        /// {@return `depthBiasExact` at the given index}
        /// @param index the index of the struct buffer
        public int depthBiasExactAt(long index) { return depthBiasExact(this.segment(), index); }
        /// Sets `depthBiasExact` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthBiasExactAt(long index, int value) { depthBiasExact(this.segment(), index, value); return this; }

    }
}
