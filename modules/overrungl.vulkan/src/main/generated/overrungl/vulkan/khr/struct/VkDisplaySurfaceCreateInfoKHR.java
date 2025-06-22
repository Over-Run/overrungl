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
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkDisplaySurfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDisplaySurfaceCreateFlagsKHR flags;
///     (uint64_t) VkDisplayModeKHR displayMode;
///     uint32_t planeIndex;
///     uint32_t planeStackIndex;
///     (int) VkSurfaceTransformFlagBitsKHR transform;
///     float globalAlpha;
///     (int) VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
///     (struct VkExtent2D) VkExtent2D imageExtent;
/// };
/// ```
public sealed class VkDisplaySurfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkDisplaySurfaceCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("displayMode"),
        ValueLayout.JAVA_INT.withName("planeIndex"),
        ValueLayout.JAVA_INT.withName("planeStackIndex"),
        ValueLayout.JAVA_INT.withName("transform"),
        ValueLayout.JAVA_FLOAT.withName("globalAlpha"),
        ValueLayout.JAVA_INT.withName("alphaMode"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("imageExtent")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `displayMode`.
    public static final long OFFSET_displayMode = LAYOUT.byteOffset(PathElement.groupElement("displayMode"));
    /// The memory layout of `displayMode`.
    public static final MemoryLayout LAYOUT_displayMode = LAYOUT.select(PathElement.groupElement("displayMode"));
    /// The [VarHandle] of `displayMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayMode"));
    /// The byte offset of `planeIndex`.
    public static final long OFFSET_planeIndex = LAYOUT.byteOffset(PathElement.groupElement("planeIndex"));
    /// The memory layout of `planeIndex`.
    public static final MemoryLayout LAYOUT_planeIndex = LAYOUT.select(PathElement.groupElement("planeIndex"));
    /// The [VarHandle] of `planeIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_planeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeIndex"));
    /// The byte offset of `planeStackIndex`.
    public static final long OFFSET_planeStackIndex = LAYOUT.byteOffset(PathElement.groupElement("planeStackIndex"));
    /// The memory layout of `planeStackIndex`.
    public static final MemoryLayout LAYOUT_planeStackIndex = LAYOUT.select(PathElement.groupElement("planeStackIndex"));
    /// The [VarHandle] of `planeStackIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_planeStackIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeStackIndex"));
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout LAYOUT_transform = LAYOUT.select(PathElement.groupElement("transform"));
    /// The [VarHandle] of `transform` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transform"));
    /// The byte offset of `globalAlpha`.
    public static final long OFFSET_globalAlpha = LAYOUT.byteOffset(PathElement.groupElement("globalAlpha"));
    /// The memory layout of `globalAlpha`.
    public static final MemoryLayout LAYOUT_globalAlpha = LAYOUT.select(PathElement.groupElement("globalAlpha"));
    /// The [VarHandle] of `globalAlpha` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_globalAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalAlpha"));
    /// The byte offset of `alphaMode`.
    public static final long OFFSET_alphaMode = LAYOUT.byteOffset(PathElement.groupElement("alphaMode"));
    /// The memory layout of `alphaMode`.
    public static final MemoryLayout LAYOUT_alphaMode = LAYOUT.select(PathElement.groupElement("alphaMode"));
    /// The [VarHandle] of `alphaMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_alphaMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("alphaMode"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplaySurfaceCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplaySurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDisplaySurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkDisplaySurfaceCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @param planeStackIndex `planeStackIndex`
    /// @param transform `transform`
    /// @param globalAlpha `globalAlpha`
    /// @param alphaMode `alphaMode`
    /// @param imageExtent `imageExtent`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex, int planeStackIndex, int transform, float globalAlpha, int alphaMode, MemorySegment imageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex).transform(transform).globalAlpha(globalAlpha).alphaMode(alphaMode).imageExtent(imageExtent);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @param planeStackIndex `planeStackIndex`
    /// @param transform `transform`
    /// @param globalAlpha `globalAlpha`
    /// @param alphaMode `alphaMode`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex, int planeStackIndex, int transform, float globalAlpha, int alphaMode) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex).transform(transform).globalAlpha(globalAlpha).alphaMode(alphaMode);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @param planeStackIndex `planeStackIndex`
    /// @param transform `transform`
    /// @param globalAlpha `globalAlpha`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex, int planeStackIndex, int transform, float globalAlpha) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex).transform(transform).globalAlpha(globalAlpha);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @param planeStackIndex `planeStackIndex`
    /// @param transform `transform`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex, int planeStackIndex, int transform) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex).transform(transform);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @param planeStackIndex `planeStackIndex`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex, int planeStackIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex).planeStackIndex(planeStackIndex);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @param planeIndex `planeIndex`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode, int planeIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode).planeIndex(planeIndex);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param displayMode `displayMode`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, long displayMode) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).displayMode(displayMode);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDisplaySurfaceCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDisplaySurfaceCreateInfoKHR`
    public static VkDisplaySurfaceCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR copyFrom(VkDisplaySurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkDisplaySurfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDisplaySurfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `displayMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long displayMode(MemorySegment segment, long index) { return (long) VH_displayMode.get(segment, 0L, index); }
    /// {@return `displayMode`}
    public long displayMode() { return displayMode(this.segment(), 0L); }
    /// Sets `displayMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayMode(MemorySegment segment, long index, long value) { VH_displayMode.set(segment, 0L, index, value); }
    /// Sets `displayMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR displayMode(long value) { displayMode(this.segment(), 0L, value); return this; }

    /// {@return `planeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int planeIndex(MemorySegment segment, long index) { return (int) VH_planeIndex.get(segment, 0L, index); }
    /// {@return `planeIndex`}
    public int planeIndex() { return planeIndex(this.segment(), 0L); }
    /// Sets `planeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void planeIndex(MemorySegment segment, long index, int value) { VH_planeIndex.set(segment, 0L, index, value); }
    /// Sets `planeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR planeIndex(int value) { planeIndex(this.segment(), 0L, value); return this; }

    /// {@return `planeStackIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int planeStackIndex(MemorySegment segment, long index) { return (int) VH_planeStackIndex.get(segment, 0L, index); }
    /// {@return `planeStackIndex`}
    public int planeStackIndex() { return planeStackIndex(this.segment(), 0L); }
    /// Sets `planeStackIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void planeStackIndex(MemorySegment segment, long index, int value) { VH_planeStackIndex.set(segment, 0L, index, value); }
    /// Sets `planeStackIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR planeStackIndex(int value) { planeStackIndex(this.segment(), 0L, value); return this; }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transform(MemorySegment segment, long index) { return (int) VH_transform.get(segment, 0L, index); }
    /// {@return `transform`}
    public int transform() { return transform(this.segment(), 0L); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transform(MemorySegment segment, long index, int value) { VH_transform.set(segment, 0L, index, value); }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR transform(int value) { transform(this.segment(), 0L, value); return this; }

    /// {@return `globalAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float globalAlpha(MemorySegment segment, long index) { return (float) VH_globalAlpha.get(segment, 0L, index); }
    /// {@return `globalAlpha`}
    public float globalAlpha() { return globalAlpha(this.segment(), 0L); }
    /// Sets `globalAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void globalAlpha(MemorySegment segment, long index, float value) { VH_globalAlpha.set(segment, 0L, index, value); }
    /// Sets `globalAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) { globalAlpha(this.segment(), 0L, value); return this; }

    /// {@return `alphaMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int alphaMode(MemorySegment segment, long index) { return (int) VH_alphaMode.get(segment, 0L, index); }
    /// {@return `alphaMode`}
    public int alphaMode() { return alphaMode(this.segment(), 0L); }
    /// Sets `alphaMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void alphaMode(MemorySegment segment, long index, int value) { VH_alphaMode.set(segment, 0L, index, value); }
    /// Sets `alphaMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR alphaMode(int value) { alphaMode(this.segment(), 0L, value); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplaySurfaceCreateInfoKHR imageExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(imageExtent())); return this; }

    /// A buffer of [VkDisplaySurfaceCreateInfoKHR].
    public static final class Buffer extends VkDisplaySurfaceCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkDisplaySurfaceCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplaySurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplaySurfaceCreateInfoKHR`
        public VkDisplaySurfaceCreateInfoKHR asSlice(long index) { return new VkDisplaySurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplaySurfaceCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplaySurfaceCreateInfoKHR`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `displayMode` at the given index}
        /// @param index the index of the struct buffer
        public long displayModeAt(long index) { return displayMode(this.segment(), index); }
        /// Sets `displayMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displayModeAt(long index, long value) { displayMode(this.segment(), index, value); return this; }

        /// {@return `planeIndex` at the given index}
        /// @param index the index of the struct buffer
        public int planeIndexAt(long index) { return planeIndex(this.segment(), index); }
        /// Sets `planeIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer planeIndexAt(long index, int value) { planeIndex(this.segment(), index, value); return this; }

        /// {@return `planeStackIndex` at the given index}
        /// @param index the index of the struct buffer
        public int planeStackIndexAt(long index) { return planeStackIndex(this.segment(), index); }
        /// Sets `planeStackIndex` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer planeStackIndexAt(long index, int value) { planeStackIndex(this.segment(), index, value); return this; }

        /// {@return `transform` at the given index}
        /// @param index the index of the struct buffer
        public int transformAt(long index) { return transform(this.segment(), index); }
        /// Sets `transform` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer transformAt(long index, int value) { transform(this.segment(), index, value); return this; }

        /// {@return `globalAlpha` at the given index}
        /// @param index the index of the struct buffer
        public float globalAlphaAt(long index) { return globalAlpha(this.segment(), index); }
        /// Sets `globalAlpha` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer globalAlphaAt(long index, float value) { globalAlpha(this.segment(), index, value); return this; }

        /// {@return `alphaMode` at the given index}
        /// @param index the index of the struct buffer
        public int alphaModeAt(long index) { return alphaMode(this.segment(), index); }
        /// Sets `alphaMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer alphaModeAt(long index, int value) { alphaMode(this.segment(), index, value); return this; }

        /// {@return `imageExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
        /// Sets `imageExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }
        /// Accepts `imageExtent` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer imageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(imageExtentAt(index))); return this; }

    }
}
