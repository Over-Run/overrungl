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
/// struct VkPhysicalDeviceDescriptorBufferFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 descriptorBuffer;
///     (uint32_t) VkBool32 descriptorBufferCaptureReplay;
///     (uint32_t) VkBool32 descriptorBufferImageLayoutIgnored;
///     (uint32_t) VkBool32 descriptorBufferPushDescriptors;
/// };
/// ```
public sealed class VkPhysicalDeviceDescriptorBufferFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBuffer"),
        ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay"),
        ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
        ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors")
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
    /// The byte offset of `descriptorBuffer`.
    public static final long OFFSET_descriptorBuffer = LAYOUT.byteOffset(PathElement.groupElement("descriptorBuffer"));
    /// The memory layout of `descriptorBuffer`.
    public static final MemoryLayout LAYOUT_descriptorBuffer = LAYOUT.select(PathElement.groupElement("descriptorBuffer"));
    /// The [VarHandle] of `descriptorBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBuffer"));
    /// The byte offset of `descriptorBufferCaptureReplay`.
    public static final long OFFSET_descriptorBufferCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferCaptureReplay"));
    /// The memory layout of `descriptorBufferCaptureReplay`.
    public static final MemoryLayout LAYOUT_descriptorBufferCaptureReplay = LAYOUT.select(PathElement.groupElement("descriptorBufferCaptureReplay"));
    /// The [VarHandle] of `descriptorBufferCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBufferCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferCaptureReplay"));
    /// The byte offset of `descriptorBufferImageLayoutIgnored`.
    public static final long OFFSET_descriptorBufferImageLayoutIgnored = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    /// The memory layout of `descriptorBufferImageLayoutIgnored`.
    public static final MemoryLayout LAYOUT_descriptorBufferImageLayoutIgnored = LAYOUT.select(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    /// The [VarHandle] of `descriptorBufferImageLayoutIgnored` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBufferImageLayoutIgnored = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferImageLayoutIgnored"));
    /// The byte offset of `descriptorBufferPushDescriptors`.
    public static final long OFFSET_descriptorBufferPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferPushDescriptors"));
    /// The memory layout of `descriptorBufferPushDescriptors`.
    public static final MemoryLayout LAYOUT_descriptorBufferPushDescriptors = LAYOUT.select(PathElement.groupElement("descriptorBufferPushDescriptors"));
    /// The [VarHandle] of `descriptorBufferPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBufferPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBufferPushDescriptors"));

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT copyFrom(VkPhysicalDeviceDescriptorBufferFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBuffer(MemorySegment segment, long index) { return (int) VH_descriptorBuffer.get(segment, 0L, index); }
    /// {@return `descriptorBuffer`}
    public int descriptorBuffer() { return descriptorBuffer(this.segment(), 0L); }
    /// Sets `descriptorBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBuffer(MemorySegment segment, long index, int value) { VH_descriptorBuffer.set(segment, 0L, index, value); }
    /// Sets `descriptorBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBuffer(int value) { descriptorBuffer(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBufferCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBufferCaptureReplay(MemorySegment segment, long index) { return (int) VH_descriptorBufferCaptureReplay.get(segment, 0L, index); }
    /// {@return `descriptorBufferCaptureReplay`}
    public int descriptorBufferCaptureReplay() { return descriptorBufferCaptureReplay(this.segment(), 0L); }
    /// Sets `descriptorBufferCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBufferCaptureReplay(MemorySegment segment, long index, int value) { VH_descriptorBufferCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferCaptureReplay(int value) { descriptorBufferCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBufferImageLayoutIgnored` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBufferImageLayoutIgnored(MemorySegment segment, long index) { return (int) VH_descriptorBufferImageLayoutIgnored.get(segment, 0L, index); }
    /// {@return `descriptorBufferImageLayoutIgnored`}
    public int descriptorBufferImageLayoutIgnored() { return descriptorBufferImageLayoutIgnored(this.segment(), 0L); }
    /// Sets `descriptorBufferImageLayoutIgnored` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBufferImageLayoutIgnored(MemorySegment segment, long index, int value) { VH_descriptorBufferImageLayoutIgnored.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferImageLayoutIgnored` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferImageLayoutIgnored(int value) { descriptorBufferImageLayoutIgnored(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBufferPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBufferPushDescriptors(MemorySegment segment, long index) { return (int) VH_descriptorBufferPushDescriptors.get(segment, 0L, index); }
    /// {@return `descriptorBufferPushDescriptors`}
    public int descriptorBufferPushDescriptors() { return descriptorBufferPushDescriptors(this.segment(), 0L); }
    /// Sets `descriptorBufferPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBufferPushDescriptors(MemorySegment segment, long index, int value) { VH_descriptorBufferPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `descriptorBufferPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferFeaturesEXT descriptorBufferPushDescriptors(int value) { descriptorBufferPushDescriptors(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDescriptorBufferFeaturesEXT].
    public static final class Buffer extends VkPhysicalDeviceDescriptorBufferFeaturesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDescriptorBufferFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
        public VkPhysicalDeviceDescriptorBufferFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDescriptorBufferFeaturesEXT`
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

        /// {@return `descriptorBuffer` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBufferAt(long index) { return descriptorBuffer(this.segment(), index); }
        /// Sets `descriptorBuffer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferAt(long index, int value) { descriptorBuffer(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferCaptureReplay` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBufferCaptureReplayAt(long index) { return descriptorBufferCaptureReplay(this.segment(), index); }
        /// Sets `descriptorBufferCaptureReplay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferCaptureReplayAt(long index, int value) { descriptorBufferCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferImageLayoutIgnored` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBufferImageLayoutIgnoredAt(long index) { return descriptorBufferImageLayoutIgnored(this.segment(), index); }
        /// Sets `descriptorBufferImageLayoutIgnored` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferImageLayoutIgnoredAt(long index, int value) { descriptorBufferImageLayoutIgnored(this.segment(), index, value); return this; }

        /// {@return `descriptorBufferPushDescriptors` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBufferPushDescriptorsAt(long index) { return descriptorBufferPushDescriptors(this.segment(), index); }
        /// Sets `descriptorBufferPushDescriptors` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBufferPushDescriptorsAt(long index, int value) { descriptorBufferPushDescriptors(this.segment(), index, value); return this; }

    }
}
