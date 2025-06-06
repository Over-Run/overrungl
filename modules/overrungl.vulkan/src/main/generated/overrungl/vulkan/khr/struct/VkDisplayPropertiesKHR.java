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
/// struct VkDisplayPropertiesKHR {
///     (uint64_t) VkDisplayKHR display;
///     const char* displayName;
///     (struct VkExtent2D) VkExtent2D physicalDimensions;
///     (struct VkExtent2D) VkExtent2D physicalResolution;
///     ((uint32_t) VkFlags) VkSurfaceTransformFlagsKHR supportedTransforms;
///     (uint32_t) VkBool32 planeReorderPossible;
///     (uint32_t) VkBool32 persistentContent;
/// };
/// ```
public sealed class VkDisplayPropertiesKHR extends GroupType {
    /// The struct layout of `VkDisplayPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("display"),
        ValueLayout.ADDRESS.withName("displayName"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalDimensions"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalResolution"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("planeReorderPossible"),
        ValueLayout.JAVA_INT.withName("persistentContent")
    );
    /// The byte offset of `display`.
    public static final long OFFSET_display = LAYOUT.byteOffset(PathElement.groupElement("display"));
    /// The memory layout of `display`.
    public static final MemoryLayout LAYOUT_display = LAYOUT.select(PathElement.groupElement("display"));
    /// The [VarHandle] of `display` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    /// The byte offset of `displayName`.
    public static final long OFFSET_displayName = LAYOUT.byteOffset(PathElement.groupElement("displayName"));
    /// The memory layout of `displayName`.
    public static final MemoryLayout LAYOUT_displayName = LAYOUT.select(PathElement.groupElement("displayName"));
    /// The [VarHandle] of `displayName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayName"));
    /// The byte offset of `physicalDimensions`.
    public static final long OFFSET_physicalDimensions = LAYOUT.byteOffset(PathElement.groupElement("physicalDimensions"));
    /// The memory layout of `physicalDimensions`.
    public static final MemoryLayout LAYOUT_physicalDimensions = LAYOUT.select(PathElement.groupElement("physicalDimensions"));
    /// The byte offset of `physicalResolution`.
    public static final long OFFSET_physicalResolution = LAYOUT.byteOffset(PathElement.groupElement("physicalResolution"));
    /// The memory layout of `physicalResolution`.
    public static final MemoryLayout LAYOUT_physicalResolution = LAYOUT.select(PathElement.groupElement("physicalResolution"));
    /// The byte offset of `supportedTransforms`.
    public static final long OFFSET_supportedTransforms = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
    /// The memory layout of `supportedTransforms`.
    public static final MemoryLayout LAYOUT_supportedTransforms = LAYOUT.select(PathElement.groupElement("supportedTransforms"));
    /// The [VarHandle] of `supportedTransforms` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    /// The byte offset of `planeReorderPossible`.
    public static final long OFFSET_planeReorderPossible = LAYOUT.byteOffset(PathElement.groupElement("planeReorderPossible"));
    /// The memory layout of `planeReorderPossible`.
    public static final MemoryLayout LAYOUT_planeReorderPossible = LAYOUT.select(PathElement.groupElement("planeReorderPossible"));
    /// The [VarHandle] of `planeReorderPossible` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_planeReorderPossible = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeReorderPossible"));
    /// The byte offset of `persistentContent`.
    public static final long OFFSET_persistentContent = LAYOUT.byteOffset(PathElement.groupElement("persistentContent"));
    /// The memory layout of `persistentContent`.
    public static final MemoryLayout LAYOUT_persistentContent = LAYOUT.select(PathElement.groupElement("persistentContent"));
    /// The [VarHandle] of `persistentContent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_persistentContent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistentContent"));

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @param physicalDimensions `physicalDimensions`
    /// @param physicalResolution `physicalResolution`
    /// @param supportedTransforms `supportedTransforms`
    /// @param planeReorderPossible `planeReorderPossible`
    /// @param persistentContent `persistentContent`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName, MemorySegment physicalDimensions, MemorySegment physicalResolution, int supportedTransforms, int planeReorderPossible, int persistentContent) {
        return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions).physicalResolution(physicalResolution).supportedTransforms(supportedTransforms).planeReorderPossible(planeReorderPossible).persistentContent(persistentContent);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @param physicalDimensions `physicalDimensions`
    /// @param physicalResolution `physicalResolution`
    /// @param supportedTransforms `supportedTransforms`
    /// @param planeReorderPossible `planeReorderPossible`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName, MemorySegment physicalDimensions, MemorySegment physicalResolution, int supportedTransforms, int planeReorderPossible) {
        return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions).physicalResolution(physicalResolution).supportedTransforms(supportedTransforms).planeReorderPossible(planeReorderPossible);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @param physicalDimensions `physicalDimensions`
    /// @param physicalResolution `physicalResolution`
    /// @param supportedTransforms `supportedTransforms`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName, MemorySegment physicalDimensions, MemorySegment physicalResolution, int supportedTransforms) {
        return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions).physicalResolution(physicalResolution).supportedTransforms(supportedTransforms);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @param physicalDimensions `physicalDimensions`
    /// @param physicalResolution `physicalResolution`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName, MemorySegment physicalDimensions, MemorySegment physicalResolution) {
        return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions).physicalResolution(physicalResolution);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @param physicalDimensions `physicalDimensions`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName, MemorySegment physicalDimensions) {
        return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @param displayName `displayName`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display, MemorySegment displayName) {
        return alloc(allocator).display(display).displayName(displayName);
    }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param display `display`
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, long display) {
        return alloc(allocator).display(display);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPropertiesKHR copyFrom(VkDisplayPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `display` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long display(MemorySegment segment, long index) { return (long) VH_display.get(segment, 0L, index); }
    /// {@return `display`}
    public long display() { return display(this.segment(), 0L); }
    /// Sets `display` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void display(MemorySegment segment, long index, long value) { VH_display.set(segment, 0L, index, value); }
    /// Sets `display` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR display(long value) { display(this.segment(), 0L, value); return this; }

    /// {@return `displayName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displayName(MemorySegment segment, long index) { return (MemorySegment) VH_displayName.get(segment, 0L, index); }
    /// {@return `displayName`}
    public MemorySegment displayName() { return displayName(this.segment(), 0L); }
    /// Sets `displayName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayName(MemorySegment segment, long index, MemorySegment value) { VH_displayName.set(segment, 0L, index, value); }
    /// Sets `displayName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR displayName(MemorySegment value) { displayName(this.segment(), 0L, value); return this; }

    /// {@return `physicalDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment physicalDimensions(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalDimensions, index), LAYOUT_physicalDimensions); }
    /// {@return `physicalDimensions`}
    public MemorySegment physicalDimensions() { return physicalDimensions(this.segment(), 0L); }
    /// Sets `physicalDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalDimensions(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalDimensions, index), LAYOUT_physicalDimensions.byteSize()); }
    /// Sets `physicalDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalDimensions(MemorySegment value) { physicalDimensions(this.segment(), 0L, value); return this; }

    /// {@return `physicalResolution` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment physicalResolution(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalResolution, index), LAYOUT_physicalResolution); }
    /// {@return `physicalResolution`}
    public MemorySegment physicalResolution() { return physicalResolution(this.segment(), 0L); }
    /// Sets `physicalResolution` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void physicalResolution(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalResolution, index), LAYOUT_physicalResolution.byteSize()); }
    /// Sets `physicalResolution` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalResolution(MemorySegment value) { physicalResolution(this.segment(), 0L, value); return this; }

    /// {@return `supportedTransforms` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedTransforms(MemorySegment segment, long index) { return (int) VH_supportedTransforms.get(segment, 0L, index); }
    /// {@return `supportedTransforms`}
    public int supportedTransforms() { return supportedTransforms(this.segment(), 0L); }
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedTransforms(MemorySegment segment, long index, int value) { VH_supportedTransforms.set(segment, 0L, index, value); }
    /// Sets `supportedTransforms` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR supportedTransforms(int value) { supportedTransforms(this.segment(), 0L, value); return this; }

    /// {@return `planeReorderPossible` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int planeReorderPossible(MemorySegment segment, long index) { return (int) VH_planeReorderPossible.get(segment, 0L, index); }
    /// {@return `planeReorderPossible`}
    public int planeReorderPossible() { return planeReorderPossible(this.segment(), 0L); }
    /// Sets `planeReorderPossible` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void planeReorderPossible(MemorySegment segment, long index, int value) { VH_planeReorderPossible.set(segment, 0L, index, value); }
    /// Sets `planeReorderPossible` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR planeReorderPossible(int value) { planeReorderPossible(this.segment(), 0L, value); return this; }

    /// {@return `persistentContent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int persistentContent(MemorySegment segment, long index) { return (int) VH_persistentContent.get(segment, 0L, index); }
    /// {@return `persistentContent`}
    public int persistentContent() { return persistentContent(this.segment(), 0L); }
    /// Sets `persistentContent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void persistentContent(MemorySegment segment, long index, int value) { VH_persistentContent.set(segment, 0L, index, value); }
    /// Sets `persistentContent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR persistentContent(int value) { persistentContent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkDisplayPropertiesKHR].
    public static final class Buffer extends VkDisplayPropertiesKHR {
        private final long elementCount;

        /// Creates `VkDisplayPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDisplayPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDisplayPropertiesKHR`
        public VkDisplayPropertiesKHR asSlice(long index) { return new VkDisplayPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDisplayPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDisplayPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `display` at the given index}
        /// @param index the index of the struct buffer
        public long displayAt(long index) { return display(this.segment(), index); }
        /// Sets `display` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displayAt(long index, long value) { display(this.segment(), index, value); return this; }

        /// {@return `displayName` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment displayNameAt(long index) { return displayName(this.segment(), index); }
        /// Sets `displayName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer displayNameAt(long index, MemorySegment value) { displayName(this.segment(), index, value); return this; }

        /// {@return `physicalDimensions` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment physicalDimensionsAt(long index) { return physicalDimensions(this.segment(), index); }
        /// Sets `physicalDimensions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer physicalDimensionsAt(long index, MemorySegment value) { physicalDimensions(this.segment(), index, value); return this; }

        /// {@return `physicalResolution` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment physicalResolutionAt(long index) { return physicalResolution(this.segment(), index); }
        /// Sets `physicalResolution` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer physicalResolutionAt(long index, MemorySegment value) { physicalResolution(this.segment(), index, value); return this; }

        /// {@return `supportedTransforms` at the given index}
        /// @param index the index of the struct buffer
        public int supportedTransformsAt(long index) { return supportedTransforms(this.segment(), index); }
        /// Sets `supportedTransforms` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedTransformsAt(long index, int value) { supportedTransforms(this.segment(), index, value); return this; }

        /// {@return `planeReorderPossible` at the given index}
        /// @param index the index of the struct buffer
        public int planeReorderPossibleAt(long index) { return planeReorderPossible(this.segment(), index); }
        /// Sets `planeReorderPossible` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer planeReorderPossibleAt(long index, int value) { planeReorderPossible(this.segment(), index, value); return this; }

        /// {@return `persistentContent` at the given index}
        /// @param index the index of the struct buffer
        public int persistentContentAt(long index) { return persistentContent(this.segment(), index); }
        /// Sets `persistentContent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer persistentContentAt(long index, int value) { persistentContent(this.segment(), index, value); return this; }

    }
}
