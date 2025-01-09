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
/// [VarHandle][#VH_display] - [Getter][#display()] - [Setter][#display(java.lang.foreign.MemorySegment)]
/// ### displayName
/// [VarHandle][#VH_displayName] - [Getter][#displayName()] - [Setter][#displayName(java.lang.foreign.MemorySegment)]
/// ### physicalDimensions
/// [Byte offset][#OFFSET_physicalDimensions] - [Memory layout][#ML_physicalDimensions] - [Getter][#physicalDimensions()] - [Setter][#physicalDimensions(java.lang.foreign.MemorySegment)]
/// ### physicalResolution
/// [Byte offset][#OFFSET_physicalResolution] - [Memory layout][#ML_physicalResolution] - [Getter][#physicalResolution()] - [Setter][#physicalResolution(java.lang.foreign.MemorySegment)]
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
public final class VkDisplayPropertiesKHR extends Struct {
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
    /// The [VarHandle] of `display` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_display = LAYOUT.arrayElementVarHandle(PathElement.groupElement("display"));
    /// The [VarHandle] of `displayName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
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
    public static VkDisplayPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPropertiesKHR`
    public static VkDisplayPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDisplayPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPropertiesKHR`
    public VkDisplayPropertiesKHR asSlice(long index) { return new VkDisplayPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDisplayPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPropertiesKHR`
    public VkDisplayPropertiesKHR asSlice(long index, long count) { return new VkDisplayPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `display` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayKHR") java.lang.foreign.MemorySegment get_display(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_display.get(segment, 0L, index); }
    /// {@return `display`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayKHR") java.lang.foreign.MemorySegment get_display(MemorySegment segment) { return VkDisplayPropertiesKHR.get_display(segment, 0L); }
    /// {@return `display` at the given index}
    /// @param index the index
    public @CType("VkDisplayKHR") java.lang.foreign.MemorySegment displayAt(long index) { return VkDisplayPropertiesKHR.get_display(this.segment(), index); }
    /// {@return `display`}
    public @CType("VkDisplayKHR") java.lang.foreign.MemorySegment display() { return VkDisplayPropertiesKHR.get_display(this.segment()); }
    /// Sets `display` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_display(MemorySegment segment, long index, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VH_display.set(segment, 0L, index, value); }
    /// Sets `display` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_display(MemorySegment segment, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_display(segment, 0L, value); }
    /// Sets `display` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR displayAt(long index, @CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_display(this.segment(), index, value); return this; }
    /// Sets `display` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR display(@CType("VkDisplayKHR") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_display(this.segment(), value); return this; }

    /// {@return `displayName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_displayName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_displayName.get(segment, 0L, index); }
    /// {@return `displayName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_displayName(MemorySegment segment) { return VkDisplayPropertiesKHR.get_displayName(segment, 0L); }
    /// {@return `displayName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment displayNameAt(long index) { return VkDisplayPropertiesKHR.get_displayName(this.segment(), index); }
    /// {@return `displayName`}
    public @CType("const char *") java.lang.foreign.MemorySegment displayName() { return VkDisplayPropertiesKHR.get_displayName(this.segment()); }
    /// Sets `displayName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_displayName.set(segment, 0L, index, value); }
    /// Sets `displayName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(segment, 0L, value); }
    /// Sets `displayName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR displayNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(this.segment(), index, value); return this; }
    /// Sets `displayName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR displayName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_displayName(this.segment(), value); return this; }

    /// {@return `physicalDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_physicalDimensions(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalDimensions, index), ML_physicalDimensions); }
    /// {@return `physicalDimensions`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_physicalDimensions(MemorySegment segment) { return VkDisplayPropertiesKHR.get_physicalDimensions(segment, 0L); }
    /// {@return `physicalDimensions` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment physicalDimensionsAt(long index) { return VkDisplayPropertiesKHR.get_physicalDimensions(this.segment(), index); }
    /// {@return `physicalDimensions`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment physicalDimensions() { return VkDisplayPropertiesKHR.get_physicalDimensions(this.segment()); }
    /// Sets `physicalDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalDimensions(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalDimensions, index), ML_physicalDimensions.byteSize()); }
    /// Sets `physicalDimensions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalDimensions(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(segment, 0L, value); }
    /// Sets `physicalDimensions` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalDimensionsAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(this.segment(), index, value); return this; }
    /// Sets `physicalDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalDimensions(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalDimensions(this.segment(), value); return this; }

    /// {@return `physicalResolution` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_physicalResolution(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_physicalResolution, index), ML_physicalResolution); }
    /// {@return `physicalResolution`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_physicalResolution(MemorySegment segment) { return VkDisplayPropertiesKHR.get_physicalResolution(segment, 0L); }
    /// {@return `physicalResolution` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment physicalResolutionAt(long index) { return VkDisplayPropertiesKHR.get_physicalResolution(this.segment(), index); }
    /// {@return `physicalResolution`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment physicalResolution() { return VkDisplayPropertiesKHR.get_physicalResolution(this.segment()); }
    /// Sets `physicalResolution` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_physicalResolution(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_physicalResolution, index), ML_physicalResolution.byteSize()); }
    /// Sets `physicalResolution` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_physicalResolution(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(segment, 0L, value); }
    /// Sets `physicalResolution` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalResolutionAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(this.segment(), index, value); return this; }
    /// Sets `physicalResolution` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR physicalResolution(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkDisplayPropertiesKHR.set_physicalResolution(this.segment(), value); return this; }

    /// {@return `supportedTransforms` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment, long index) { return (int) VH_supportedTransforms.get(segment, 0L, index); }
    /// {@return `supportedTransforms`}
    /// @param segment the segment of the struct
    public static @CType("VkSurfaceTransformFlagsKHR") int get_supportedTransforms(MemorySegment segment) { return VkDisplayPropertiesKHR.get_supportedTransforms(segment, 0L); }
    /// {@return `supportedTransforms` at the given index}
    /// @param index the index
    public @CType("VkSurfaceTransformFlagsKHR") int supportedTransformsAt(long index) { return VkDisplayPropertiesKHR.get_supportedTransforms(this.segment(), index); }
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
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR supportedTransformsAt(long index, @CType("VkSurfaceTransformFlagsKHR") int value) { VkDisplayPropertiesKHR.set_supportedTransforms(this.segment(), index, value); return this; }
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
    /// {@return `planeReorderPossible` at the given index}
    /// @param index the index
    public @CType("VkBool32") int planeReorderPossibleAt(long index) { return VkDisplayPropertiesKHR.get_planeReorderPossible(this.segment(), index); }
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
    /// Sets `planeReorderPossible` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR planeReorderPossibleAt(long index, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_planeReorderPossible(this.segment(), index, value); return this; }
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
    /// {@return `persistentContent` at the given index}
    /// @param index the index
    public @CType("VkBool32") int persistentContentAt(long index) { return VkDisplayPropertiesKHR.get_persistentContent(this.segment(), index); }
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
    /// Sets `persistentContent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR persistentContentAt(long index, @CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_persistentContent(this.segment(), index, value); return this; }
    /// Sets `persistentContent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPropertiesKHR persistentContent(@CType("VkBool32") int value) { VkDisplayPropertiesKHR.set_persistentContent(this.segment(), value); return this; }

}
