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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthStencilResolveProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkResolveModeFlags supportedDepthResolveModes;
///     ((uint32_t) VkFlags) VkResolveModeFlags supportedStencilResolveModes;
///     (uint32_t) VkBool32 independentResolveNone;
///     (uint32_t) VkBool32 independentResolve;
/// };
/// ```
public sealed class VkPhysicalDeviceDepthStencilResolveProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDepthStencilResolveProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedDepthResolveModes"),
        ValueLayout.JAVA_INT.withName("supportedStencilResolveModes"),
        ValueLayout.JAVA_INT.withName("independentResolveNone"),
        ValueLayout.JAVA_INT.withName("independentResolve")
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
    /// The byte offset of `supportedDepthResolveModes`.
    public static final long OFFSET_supportedDepthResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
    /// The memory layout of `supportedDepthResolveModes`.
    public static final MemoryLayout LAYOUT_supportedDepthResolveModes = LAYOUT.select(PathElement.groupElement("supportedDepthResolveModes"));
    /// The [VarHandle] of `supportedDepthResolveModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    /// The byte offset of `supportedStencilResolveModes`.
    public static final long OFFSET_supportedStencilResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
    /// The memory layout of `supportedStencilResolveModes`.
    public static final MemoryLayout LAYOUT_supportedStencilResolveModes = LAYOUT.select(PathElement.groupElement("supportedStencilResolveModes"));
    /// The [VarHandle] of `supportedStencilResolveModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    /// The byte offset of `independentResolveNone`.
    public static final long OFFSET_independentResolveNone = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
    /// The memory layout of `independentResolveNone`.
    public static final MemoryLayout LAYOUT_independentResolveNone = LAYOUT.select(PathElement.groupElement("independentResolveNone"));
    /// The [VarHandle] of `independentResolveNone` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    /// The byte offset of `independentResolve`.
    public static final long OFFSET_independentResolve = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
    /// The memory layout of `independentResolve`.
    public static final MemoryLayout LAYOUT_independentResolve = LAYOUT.select(PathElement.groupElement("independentResolve"));
    /// The [VarHandle] of `independentResolve` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDepthStencilResolveProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDepthStencilResolveProperties`
    public static VkPhysicalDeviceDepthStencilResolveProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthStencilResolveProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDepthStencilResolveProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDepthStencilResolveProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties copyFrom(VkPhysicalDeviceDepthStencilResolveProperties src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceDepthStencilResolveProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDepthStencilResolveProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `supportedDepthResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedDepthResolveModes(MemorySegment segment, long index) { return (int) VH_supportedDepthResolveModes.get(segment, 0L, index); }
    /// {@return `supportedDepthResolveModes`}
    public int supportedDepthResolveModes() { return supportedDepthResolveModes(this.segment(), 0L); }
    /// Sets `supportedDepthResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedDepthResolveModes(MemorySegment segment, long index, int value) { VH_supportedDepthResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedDepthResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModes(int value) { supportedDepthResolveModes(this.segment(), 0L, value); return this; }

    /// {@return `supportedStencilResolveModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedStencilResolveModes(MemorySegment segment, long index) { return (int) VH_supportedStencilResolveModes.get(segment, 0L, index); }
    /// {@return `supportedStencilResolveModes`}
    public int supportedStencilResolveModes() { return supportedStencilResolveModes(this.segment(), 0L); }
    /// Sets `supportedStencilResolveModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedStencilResolveModes(MemorySegment segment, long index, int value) { VH_supportedStencilResolveModes.set(segment, 0L, index, value); }
    /// Sets `supportedStencilResolveModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModes(int value) { supportedStencilResolveModes(this.segment(), 0L, value); return this; }

    /// {@return `independentResolveNone` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int independentResolveNone(MemorySegment segment, long index) { return (int) VH_independentResolveNone.get(segment, 0L, index); }
    /// {@return `independentResolveNone`}
    public int independentResolveNone() { return independentResolveNone(this.segment(), 0L); }
    /// Sets `independentResolveNone` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void independentResolveNone(MemorySegment segment, long index, int value) { VH_independentResolveNone.set(segment, 0L, index, value); }
    /// Sets `independentResolveNone` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNone(int value) { independentResolveNone(this.segment(), 0L, value); return this; }

    /// {@return `independentResolve` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int independentResolve(MemorySegment segment, long index) { return (int) VH_independentResolve.get(segment, 0L, index); }
    /// {@return `independentResolve`}
    public int independentResolve() { return independentResolve(this.segment(), 0L); }
    /// Sets `independentResolve` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void independentResolve(MemorySegment segment, long index, int value) { VH_independentResolve.set(segment, 0L, index, value); }
    /// Sets `independentResolve` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolve(int value) { independentResolve(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceDepthStencilResolveProperties].
    public static final class Buffer extends VkPhysicalDeviceDepthStencilResolveProperties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceDepthStencilResolveProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceDepthStencilResolveProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceDepthStencilResolveProperties`
        public VkPhysicalDeviceDepthStencilResolveProperties asSlice(long index) { return new VkPhysicalDeviceDepthStencilResolveProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceDepthStencilResolveProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceDepthStencilResolveProperties`
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

        /// {@return `supportedDepthResolveModes` at the given index}
        /// @param index the index of the struct buffer
        public int supportedDepthResolveModesAt(long index) { return supportedDepthResolveModes(this.segment(), index); }
        /// Sets `supportedDepthResolveModes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedDepthResolveModesAt(long index, int value) { supportedDepthResolveModes(this.segment(), index, value); return this; }

        /// {@return `supportedStencilResolveModes` at the given index}
        /// @param index the index of the struct buffer
        public int supportedStencilResolveModesAt(long index) { return supportedStencilResolveModes(this.segment(), index); }
        /// Sets `supportedStencilResolveModes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedStencilResolveModesAt(long index, int value) { supportedStencilResolveModes(this.segment(), index, value); return this; }

        /// {@return `independentResolveNone` at the given index}
        /// @param index the index of the struct buffer
        public int independentResolveNoneAt(long index) { return independentResolveNone(this.segment(), index); }
        /// Sets `independentResolveNone` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveNoneAt(long index, int value) { independentResolveNone(this.segment(), index, value); return this; }

        /// {@return `independentResolve` at the given index}
        /// @param index the index of the struct buffer
        public int independentResolveAt(long index) { return independentResolve(this.segment(), index); }
        /// Sets `independentResolve` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer independentResolveAt(long index, int value) { independentResolve(this.segment(), index, value); return this; }

    }
}
