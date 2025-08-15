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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlaneCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneCapabilitiesKHR {
///     ((uint32_t) VkFlags) VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
///     (struct VkOffset2D) VkOffset2D minSrcPosition;
///     (struct VkOffset2D) VkOffset2D maxSrcPosition;
///     (struct VkExtent2D) VkExtent2D minSrcExtent;
///     (struct VkExtent2D) VkExtent2D maxSrcExtent;
///     (struct VkOffset2D) VkOffset2D minDstPosition;
///     (struct VkOffset2D) VkOffset2D maxDstPosition;
///     (struct VkExtent2D) VkExtent2D minDstExtent;
///     (struct VkExtent2D) VkExtent2D maxDstExtent;
/// };
/// ```
public final class VkDisplayPlaneCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkDisplayPlaneCapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("supportedAlpha"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minSrcPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxSrcPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minSrcExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxSrcExtent"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("minDstPosition"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("maxDstPosition"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minDstExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxDstExtent")
    );
    /// The byte offset of `supportedAlpha`.
    public static final long OFFSET_supportedAlpha = LAYOUT.byteOffset(PathElement.groupElement("supportedAlpha"));
    /// The memory layout of `supportedAlpha`.
    public static final MemoryLayout LAYOUT_supportedAlpha = LAYOUT.select(PathElement.groupElement("supportedAlpha"));
    /// The [VarHandle] of `supportedAlpha` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedAlpha"));
    /// The byte offset of `minSrcPosition`.
    public static final long OFFSET_minSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("minSrcPosition"));
    /// The memory layout of `minSrcPosition`.
    public static final MemoryLayout LAYOUT_minSrcPosition = LAYOUT.select(PathElement.groupElement("minSrcPosition"));
    /// The byte offset of `maxSrcPosition`.
    public static final long OFFSET_maxSrcPosition = LAYOUT.byteOffset(PathElement.groupElement("maxSrcPosition"));
    /// The memory layout of `maxSrcPosition`.
    public static final MemoryLayout LAYOUT_maxSrcPosition = LAYOUT.select(PathElement.groupElement("maxSrcPosition"));
    /// The byte offset of `minSrcExtent`.
    public static final long OFFSET_minSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("minSrcExtent"));
    /// The memory layout of `minSrcExtent`.
    public static final MemoryLayout LAYOUT_minSrcExtent = LAYOUT.select(PathElement.groupElement("minSrcExtent"));
    /// The byte offset of `maxSrcExtent`.
    public static final long OFFSET_maxSrcExtent = LAYOUT.byteOffset(PathElement.groupElement("maxSrcExtent"));
    /// The memory layout of `maxSrcExtent`.
    public static final MemoryLayout LAYOUT_maxSrcExtent = LAYOUT.select(PathElement.groupElement("maxSrcExtent"));
    /// The byte offset of `minDstPosition`.
    public static final long OFFSET_minDstPosition = LAYOUT.byteOffset(PathElement.groupElement("minDstPosition"));
    /// The memory layout of `minDstPosition`.
    public static final MemoryLayout LAYOUT_minDstPosition = LAYOUT.select(PathElement.groupElement("minDstPosition"));
    /// The byte offset of `maxDstPosition`.
    public static final long OFFSET_maxDstPosition = LAYOUT.byteOffset(PathElement.groupElement("maxDstPosition"));
    /// The memory layout of `maxDstPosition`.
    public static final MemoryLayout LAYOUT_maxDstPosition = LAYOUT.select(PathElement.groupElement("maxDstPosition"));
    /// The byte offset of `minDstExtent`.
    public static final long OFFSET_minDstExtent = LAYOUT.byteOffset(PathElement.groupElement("minDstExtent"));
    /// The memory layout of `minDstExtent`.
    public static final MemoryLayout LAYOUT_minDstExtent = LAYOUT.select(PathElement.groupElement("minDstExtent"));
    /// The byte offset of `maxDstExtent`.
    public static final long OFFSET_maxDstExtent = LAYOUT.byteOffset(PathElement.groupElement("maxDstExtent"));
    /// The memory layout of `maxDstExtent`.
    public static final MemoryLayout LAYOUT_maxDstExtent = LAYOUT.select(PathElement.groupElement("maxDstExtent"));

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayPlaneCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayPlaneCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPlaneCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneCapabilitiesKHR`
    public static VkDisplayPlaneCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayPlaneCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneCapabilitiesKHR`
    public static VkDisplayPlaneCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR copyFrom(VkDisplayPlaneCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayPlaneCapabilitiesKHR reinterpret(long count) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `supportedAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedAlpha(MemorySegment segment, long index) { return (int) VH_supportedAlpha.get(segment, 0L, index); }
    /// {@return `supportedAlpha`}
    public int supportedAlpha() { return supportedAlpha(this.segment(), 0L); }
    /// Sets `supportedAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedAlpha(MemorySegment segment, long index, int value) { VH_supportedAlpha.set(segment, 0L, index, value); }
    /// Sets `supportedAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR supportedAlpha(int value) { supportedAlpha(this.segment(), 0L, value); return this; }

    /// {@return `minSrcPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minSrcPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minSrcPosition, index), LAYOUT_minSrcPosition); }
    /// {@return `minSrcPosition`}
    public MemorySegment minSrcPosition() { return minSrcPosition(this.segment(), 0L); }
    /// Sets `minSrcPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSrcPosition(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minSrcPosition, index), LAYOUT_minSrcPosition.byteSize()); }
    /// Sets `minSrcPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition(MemorySegment value) { minSrcPosition(this.segment(), 0L, value); return this; }
    /// Accepts `minSrcPosition` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcPosition(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(minSrcPosition())); return this; }

    /// {@return `maxSrcPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxSrcPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSrcPosition, index), LAYOUT_maxSrcPosition); }
    /// {@return `maxSrcPosition`}
    public MemorySegment maxSrcPosition() { return maxSrcPosition(this.segment(), 0L); }
    /// Sets `maxSrcPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSrcPosition(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSrcPosition, index), LAYOUT_maxSrcPosition.byteSize()); }
    /// Sets `maxSrcPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(MemorySegment value) { maxSrcPosition(this.segment(), 0L, value); return this; }
    /// Accepts `maxSrcPosition` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcPosition(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(maxSrcPosition())); return this; }

    /// {@return `minSrcExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minSrcExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minSrcExtent, index), LAYOUT_minSrcExtent); }
    /// {@return `minSrcExtent`}
    public MemorySegment minSrcExtent() { return minSrcExtent(this.segment(), 0L); }
    /// Sets `minSrcExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSrcExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minSrcExtent, index), LAYOUT_minSrcExtent.byteSize()); }
    /// Sets `minSrcExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent(MemorySegment value) { minSrcExtent(this.segment(), 0L, value); return this; }
    /// Accepts `minSrcExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minSrcExtent())); return this; }

    /// {@return `maxSrcExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxSrcExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxSrcExtent, index), LAYOUT_maxSrcExtent); }
    /// {@return `maxSrcExtent`}
    public MemorySegment maxSrcExtent() { return maxSrcExtent(this.segment(), 0L); }
    /// Sets `maxSrcExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSrcExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxSrcExtent, index), LAYOUT_maxSrcExtent.byteSize()); }
    /// Sets `maxSrcExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(MemorySegment value) { maxSrcExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxSrcExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxSrcExtent())); return this; }

    /// {@return `minDstPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minDstPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minDstPosition, index), LAYOUT_minDstPosition); }
    /// {@return `minDstPosition`}
    public MemorySegment minDstPosition() { return minDstPosition(this.segment(), 0L); }
    /// Sets `minDstPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minDstPosition(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minDstPosition, index), LAYOUT_minDstPosition.byteSize()); }
    /// Sets `minDstPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstPosition(MemorySegment value) { minDstPosition(this.segment(), 0L, value); return this; }
    /// Accepts `minDstPosition` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstPosition(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(minDstPosition())); return this; }

    /// {@return `maxDstPosition` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxDstPosition(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxDstPosition, index), LAYOUT_maxDstPosition); }
    /// {@return `maxDstPosition`}
    public MemorySegment maxDstPosition() { return maxDstPosition(this.segment(), 0L); }
    /// Sets `maxDstPosition` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDstPosition(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxDstPosition, index), LAYOUT_maxDstPosition.byteSize()); }
    /// Sets `maxDstPosition` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition(MemorySegment value) { maxDstPosition(this.segment(), 0L, value); return this; }
    /// Accepts `maxDstPosition` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstPosition(Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(maxDstPosition())); return this; }

    /// {@return `minDstExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minDstExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minDstExtent, index), LAYOUT_minDstExtent); }
    /// {@return `minDstExtent`}
    public MemorySegment minDstExtent() { return minDstExtent(this.segment(), 0L); }
    /// Sets `minDstExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minDstExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minDstExtent, index), LAYOUT_minDstExtent.byteSize()); }
    /// Sets `minDstExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstExtent(MemorySegment value) { minDstExtent(this.segment(), 0L, value); return this; }
    /// Accepts `minDstExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minDstExtent())); return this; }

    /// {@return `maxDstExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxDstExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxDstExtent, index), LAYOUT_maxDstExtent); }
    /// {@return `maxDstExtent`}
    public MemorySegment maxDstExtent() { return maxDstExtent(this.segment(), 0L); }
    /// Sets `maxDstExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDstExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxDstExtent, index), LAYOUT_maxDstExtent.byteSize()); }
    /// Sets `maxDstExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent(MemorySegment value) { maxDstExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxDstExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxDstExtent())); return this; }

    /// Creates a slice of `VkDisplayPlaneCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPlaneCapabilitiesKHR`
    public VkDisplayPlaneCapabilitiesKHR asSlice(long index) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayPlaneCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPlaneCapabilitiesKHR`
    public VkDisplayPlaneCapabilitiesKHR asSlice(long index, long count) { return new VkDisplayPlaneCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayPlaneCapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR at(long index, Consumer<VkDisplayPlaneCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `supportedAlpha` at the given index}
    /// @param index the index of the struct buffer
    public int supportedAlphaAt(long index) { return supportedAlpha(this.segment(), index); }
    /// Sets `supportedAlpha` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR supportedAlphaAt(long index, int value) { supportedAlpha(this.segment(), index, value); return this; }

    /// {@return `minSrcPosition` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minSrcPositionAt(long index) { return minSrcPosition(this.segment(), index); }
    /// Sets `minSrcPosition` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcPositionAt(long index, MemorySegment value) { minSrcPosition(this.segment(), index, value); return this; }
    /// Accepts `minSrcPosition` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcPositionAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(minSrcPositionAt(index))); return this; }

    /// {@return `maxSrcPosition` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxSrcPositionAt(long index) { return maxSrcPosition(this.segment(), index); }
    /// Sets `maxSrcPosition` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcPositionAt(long index, MemorySegment value) { maxSrcPosition(this.segment(), index, value); return this; }
    /// Accepts `maxSrcPosition` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcPositionAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(maxSrcPositionAt(index))); return this; }

    /// {@return `minSrcExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minSrcExtentAt(long index) { return minSrcExtent(this.segment(), index); }
    /// Sets `minSrcExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcExtentAt(long index, MemorySegment value) { minSrcExtent(this.segment(), index, value); return this; }
    /// Accepts `minSrcExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minSrcExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minSrcExtentAt(index))); return this; }

    /// {@return `maxSrcExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxSrcExtentAt(long index) { return maxSrcExtent(this.segment(), index); }
    /// Sets `maxSrcExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtentAt(long index, MemorySegment value) { maxSrcExtent(this.segment(), index, value); return this; }
    /// Accepts `maxSrcExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxSrcExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxSrcExtentAt(index))); return this; }

    /// {@return `minDstPosition` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minDstPositionAt(long index) { return minDstPosition(this.segment(), index); }
    /// Sets `minDstPosition` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstPositionAt(long index, MemorySegment value) { minDstPosition(this.segment(), index, value); return this; }
    /// Accepts `minDstPosition` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstPositionAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(minDstPositionAt(index))); return this; }

    /// {@return `maxDstPosition` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxDstPositionAt(long index) { return maxDstPosition(this.segment(), index); }
    /// Sets `maxDstPosition` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstPositionAt(long index, MemorySegment value) { maxDstPosition(this.segment(), index, value); return this; }
    /// Accepts `maxDstPosition` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstPositionAt(long index, Consumer<overrungl.vulkan.struct.VkOffset2D> func) { func.accept(overrungl.vulkan.struct.VkOffset2D.of(maxDstPositionAt(index))); return this; }

    /// {@return `minDstExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minDstExtentAt(long index) { return minDstExtent(this.segment(), index); }
    /// Sets `minDstExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstExtentAt(long index, MemorySegment value) { minDstExtent(this.segment(), index, value); return this; }
    /// Accepts `minDstExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR minDstExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minDstExtentAt(index))); return this; }

    /// {@return `maxDstExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxDstExtentAt(long index) { return maxDstExtent(this.segment(), index); }
    /// Sets `maxDstExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstExtentAt(long index, MemorySegment value) { maxDstExtent(this.segment(), index, value); return this; }
    /// Accepts `maxDstExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilitiesKHR maxDstExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxDstExtentAt(index))); return this; }

}
