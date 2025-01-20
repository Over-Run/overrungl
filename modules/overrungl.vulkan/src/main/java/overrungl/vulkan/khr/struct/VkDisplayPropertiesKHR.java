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
/// ### display
/// [VarHandle][#VH_display] - [Getter][#display()] - [Setter][#display(MemorySegment)]
/// ### displayName
/// [VarHandle][#VH_displayName] - [Getter][#displayName()] - [Setter][#displayName(MemorySegment)]
/// ### physicalDimensions
/// [Byte offset][#OFFSET_physicalDimensions] - [Memory layout][#ML_physicalDimensions] - [Getter][#physicalDimensions()] - [Setter][#physicalDimensions(MemorySegment)]
/// ### physicalResolution
/// [Byte offset][#OFFSET_physicalResolution] - [Memory layout][#ML_physicalResolution] - [Getter][#physicalResolution()] - [Setter][#physicalResolution(MemorySegment)]
/// ### supportedTransforms
/// [VarHandle][#VH_supportedTransforms] - [Getter][#supportedTransforms()] - [Setter][#supportedTransforms(int)]
/// ### planeReorderPossible
/// [VarHandle][#VH_planeReorderPossible] - [Getter][#planeReorderPossible()] - [Setter][#planeReorderPossible(int)]
/// ### persistentContent
/// [VarHandle][#VH_persistentContent] - [Getter][#persistentContent()] - [Setter][#persistentContent(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPropertiesKHR {
///     VkDisplayKHR display;
///     const char * displayName;
///     VkExtent2D physicalDimensions;
///     VkExtent2D physicalResolution;
///     VkSurfaceTransformFlagsKHR supportedTransforms;
///     VkBool32 planeReorderPossible;
///     VkBool32 persistentContent;
/// } VkDisplayPropertiesKHR;
/// ```
public sealed class VkDisplayPropertiesKHR extends Struct {
    /// The struct layout of `VkDisplayPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("display"),
        ValueLayout.ADDRESS.withName("displayName"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalDimensions"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("physicalResolution"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("planeReorderPossible"),
        ValueLayout.JAVA_INT.withName("persistentContent")
    );
    /// The [VarHandle] of `display` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    /// The [VarHandle] of `displayName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayName"));
    /// The byte offset of `physicalDimensions`.
    public static final long OFFSET_physicalDimensions = LAYOUT.byteOffset(PathElement.groupElement("physicalDimensions"));
    /// The memory layout of `physicalDimensions`.
    public static final MemoryLayout ML_physicalDimensions = LAYOUT.select(PathElement.groupElement("physicalDimensions"));
    /// The byte offset of `physicalResolution`.
    public static final long OFFSET_physicalResolution = LAYOUT.byteOffset(PathElement.groupElement("physicalResolution"));
    /// The memory layout of `physicalResolution`.
    public static final MemoryLayout ML_physicalResolution = LAYOUT.select(PathElement.groupElement("physicalResolution"));
    /// The [VarHandle] of `supportedTransforms` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    /// The [VarHandle] of `planeReorderPossible` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeReorderPossible = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeReorderPossible"));
    /// The [VarHandle] of `persistentContent` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_persistentContent = LAYOUT.arrayElementVarHandle(PathElement.groupElement("persistentContent"));

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkDisplayKHR") MemorySegment display, @CType("const char *") MemorySegment displayName, @CType("VkExtent2D") MemorySegment physicalDimensions, @CType("VkExtent2D") MemorySegment physicalResolution, @CType("VkSurfaceTransformFlagsKHR") int supportedTransforms, @CType("VkBool32") int planeReorderPossible, @CType("VkBool32") int persistentContent) { return alloc(allocator).display(display).displayName(displayName).physicalDimensions(physicalDimensions).physicalResolution(physicalResolution).supportedTransforms(supportedTransforms).planeReorderPossible(planeReorderPossible).persistentContent(persistentContent); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPropertiesKHR copyFrom(VkDisplayPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `display` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayKHR") MemorySegment get_display(MemorySegment segment, long index) { return (MemorySegment) VH_display.get(segment, 0L, index); }
    /// {@return `display`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayKHR") MemorySegment get_display(MemorySegment segment) { return VkDisplayPropertiesKHR.get_display(segment, 0L); }
    /// {@return `display`}
    public @CType("VkDisplayKHR") MemorySegment display() { return VkDisplayPropertiesKHR.get_display(this.segment()); }
    /// Sets `display` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_display(MemorySegment segment, long index, @CType("VkDisplayKHR") MemorySegment value) { VH_display.set(segment, 0L, index, value); }
    /// Sets `display` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_display(MemorySegment segment, @CType("VkDisplayKHR") MemorySegment value) { VkDisplayPropertiesKHR.set_display(segment, 0L, value); }
    /// Sets `display` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR display(@CType("VkDisplayKHR") MemorySegment value) { VkDisplayPropertiesKHR.set_display(this.segment(), value); return this; }

    /// {@return `displayName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") MemorySegment get_displayName(MemorySegment segment, long index) { return (MemorySegment) VH_displayName.get(segment, 0L, index); }
    /// {@return `displayName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") MemorySegment get_displayName(MemorySegment segment) { return VkDisplayPropertiesKHR.get_displayName(segment, 0L); }
    /// {@return `displayName`}
    public @CType("const char *") MemorySegment displayName() { return VkDisplayPropertiesKHR.get_displayName(this.segment()); }
    /// Sets `displayName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayName(MemorySegment segment, long index, @CType("const char *") MemorySegment value) { VH_displayName.set(segment, 0L, index, value); }
    /// Sets `displayName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayName(MemorySegment segment, @CType("const char *") MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(segment, 0L, value); }
    /// Sets `displayName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR displayName(@CType("const char *") MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(this.segment(), value); return this; }

    /// {@return `physicalDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_physicalDimensions(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalDimensions, index), ML_physicalDimensions); }
    /// {@return `physicalDimensions`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_physicalDimensions(MemorySegment segment) { return VkDisplayPropertiesKHR.get_physicalDimensions(segment, 0L); }
    /// {@return `physicalDimensions`}
    public @CType("VkExtent2D") MemorySegment physicalDimensions() { return VkDisplayPropertiesKHR.get_physicalDimensions(this.segment()); }
    /// Sets `physicalDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalDimensions(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalDimensions, index), ML_physicalDimensions.byteSize()); }
    /// Sets `physicalDimensions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalDimensions(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(segment, 0L, value); }
    /// Sets `physicalDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalDimensions(@CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(this.segment(), value); return this; }

    /// {@return `physicalResolution` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_physicalResolution(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalResolution, index), ML_physicalResolution); }
    /// {@return `physicalResolution`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_physicalResolution(MemorySegment segment) { return VkDisplayPropertiesKHR.get_physicalResolution(segment, 0L); }
    /// {@return `physicalResolution`}
    public @CType("VkExtent2D") MemorySegment physicalResolution() { return VkDisplayPropertiesKHR.get_physicalResolution(this.segment()); }
    /// Sets `physicalResolution` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalResolution(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalResolution, index), ML_physicalResolution.byteSize()); }
    /// Sets `physicalResolution` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalResolution(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(segment, 0L, value); }
    /// Sets `physicalResolution` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalResolution(@CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(this.segment(), value); return this; }

    /// {@return `supportedTransforms` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment, long index) { return (int) VH_supportedTransforms.get(segment, 0L, index); }
    /// {@return `supportedTransforms`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment) { return VkDisplayPropertiesKHR.get_supportedTransforms(segment, 0L); }
    /// {@return `supportedTransforms`}
    public @CType("VkSurfaceTransformFlagsKHR") int supportedTransforms() { return VkDisplayPropertiesKHR.get_supportedTransforms(this.segment()); }
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportedTransforms(MemorySegment segment, long index, @CType("VkSurfaceTransformFlagsKHR") int value) { VH_supportedTransforms.set(segment, 0L, index, value); }
    /// Sets `supportedTransforms` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportedTransforms(MemorySegment segment, @CType("VkSurfaceTransformFlagsKHR") int value) { VkDisplayPropertiesKHR.set_supportedTransforms(segment, 0L, value); }
    /// Sets `supportedTransforms` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR supportedTransforms(@CType("VkSurfaceTransformFlagsKHR") int value) { VkDisplayPropertiesKHR.set_supportedTransforms(this.segment(), value); return this; }

    /// {@return `planeReorderPossible` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_planeReorderPossible(MemorySegment segment, long index) { return (int) VH_planeReorderPossible.get(segment, 0L, index); }
    /// {@return `planeReorderPossible`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_planeReorderPossible(MemorySegment segment) { return VkDisplayPropertiesKHR.get_planeReorderPossible(segment, 0L); }
    /// {@return `planeReorderPossible`}
    public @CType("VkBool32") int planeReorderPossible() { return VkDisplayPropertiesKHR.get_planeReorderPossible(this.segment()); }
    /// Sets `planeReorderPossible` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeReorderPossible(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_planeReorderPossible.set(segment, 0L, index, value); }
    /// Sets `planeReorderPossible` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeReorderPossible(MemorySegment segment, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_planeReorderPossible(segment, 0L, value); }
    /// Sets `planeReorderPossible` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR planeReorderPossible(@CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_planeReorderPossible(this.segment(), value); return this; }

    /// {@return `persistentContent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_persistentContent(MemorySegment segment, long index) { return (int) VH_persistentContent.get(segment, 0L, index); }
    /// {@return `persistentContent`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_persistentContent(MemorySegment segment) { return VkDisplayPropertiesKHR.get_persistentContent(segment, 0L); }
    /// {@return `persistentContent`}
    public @CType("VkBool32") int persistentContent() { return VkDisplayPropertiesKHR.get_persistentContent(this.segment()); }
    /// Sets `persistentContent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_persistentContent(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_persistentContent.set(segment, 0L, index, value); }
    /// Sets `persistentContent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_persistentContent(MemorySegment segment, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_persistentContent(segment, 0L, value); }
    /// Sets `persistentContent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR persistentContent(@CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_persistentContent(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkDisplayKHR") MemorySegment displayAt(long index) { return VkDisplayPropertiesKHR.get_display(this.segment(), index); }
        /// Sets `display` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayAt(long index, @CType("VkDisplayKHR") MemorySegment value) { VkDisplayPropertiesKHR.set_display(this.segment(), index, value); return this; }

        /// {@return `displayName` at the given index}
        /// @param index the index
        public @CType("const char *") MemorySegment displayNameAt(long index) { return VkDisplayPropertiesKHR.get_displayName(this.segment(), index); }
        /// Sets `displayName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer displayNameAt(long index, @CType("const char *") MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(this.segment(), index, value); return this; }

        /// {@return `physicalDimensions` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment physicalDimensionsAt(long index) { return VkDisplayPropertiesKHR.get_physicalDimensions(this.segment(), index); }
        /// Sets `physicalDimensions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer physicalDimensionsAt(long index, @CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(this.segment(), index, value); return this; }

        /// {@return `physicalResolution` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment physicalResolutionAt(long index) { return VkDisplayPropertiesKHR.get_physicalResolution(this.segment(), index); }
        /// Sets `physicalResolution` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer physicalResolutionAt(long index, @CType("VkExtent2D") MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(this.segment(), index, value); return this; }

        /// {@return `supportedTransforms` at the given index}
        /// @param index the index
        public @CType("VkSurfaceTransformFlagsKHR") int supportedTransformsAt(long index) { return VkDisplayPropertiesKHR.get_supportedTransforms(this.segment(), index); }
        /// Sets `supportedTransforms` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer supportedTransformsAt(long index, @CType("VkSurfaceTransformFlagsKHR") int value) { VkDisplayPropertiesKHR.set_supportedTransforms(this.segment(), index, value); return this; }

        /// {@return `planeReorderPossible` at the given index}
        /// @param index the index
        public @CType("VkBool32") int planeReorderPossibleAt(long index) { return VkDisplayPropertiesKHR.get_planeReorderPossible(this.segment(), index); }
        /// Sets `planeReorderPossible` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer planeReorderPossibleAt(long index, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_planeReorderPossible(this.segment(), index, value); return this; }

        /// {@return `persistentContent` at the given index}
        /// @param index the index
        public @CType("VkBool32") int persistentContentAt(long index) { return VkDisplayPropertiesKHR.get_persistentContent(this.segment(), index); }
        /// Sets `persistentContent` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer persistentContentAt(long index, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_persistentContent(this.segment(), index, value); return this; }

    }
}
