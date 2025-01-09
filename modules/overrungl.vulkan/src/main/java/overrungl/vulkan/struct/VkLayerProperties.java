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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### layerName
/// [Byte offset handle][#MH_layerName] - [Memory layout][#ML_layerName] - [Getter][#layerName(long)] - [Setter][#layerName(long, java.lang.foreign.MemorySegment)]
/// ### specVersion
/// [VarHandle][#VH_specVersion] - [Getter][#specVersion()] - [Setter][#specVersion(int)]
/// ### implementationVersion
/// [VarHandle][#VH_implementationVersion] - [Getter][#implementationVersion()] - [Setter][#implementationVersion(int)]
/// ### description
/// [Byte offset handle][#MH_description] - [Memory layout][#ML_description] - [Getter][#description(long)] - [Setter][#description(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLayerProperties {
///     char[VK_MAX_EXTENSION_NAME_SIZE] layerName;
///     uint32_t specVersion;
///     uint32_t implementationVersion;
///     char[VK_MAX_DESCRIPTION_SIZE] description;
/// } VkLayerProperties;
/// ```
public final class VkLayerProperties extends Struct {
    /// The struct layout of `VkLayerProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    /// The byte offset handle of `layerName` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_layerName = LAYOUT.byteOffsetHandle(PathElement.groupElement("layerName"), PathElement.sequenceElement());
    /// The memory layout of `layerName`.
    public static final MemoryLayout ML_layerName = LAYOUT.select(PathElement.groupElement("layerName"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));
    /// The [VarHandle] of `implementationVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_implementationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationVersion"));
    /// The byte offset handle of `description` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_description = LAYOUT.byteOffsetHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The memory layout of `description`.
    public static final MemoryLayout ML_description = LAYOUT.select(PathElement.groupElement("description"));

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    public VkLayerProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLayerProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerProperties(segment); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLayerProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLayerProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkLayerProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkLayerProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties alloc(SegmentAllocator allocator) { return new VkLayerProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLayerProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLayerProperties`
    public static VkLayerProperties alloc(SegmentAllocator allocator, long count) { return new VkLayerProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `layerName` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layerName(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_layerName.invokeExact(0L, elementIndex), index), ML_layerName); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `layerName`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_layerName(MemorySegment segment, long elementIndex) { return VkLayerProperties.get_layerName(segment, 0L, elementIndex); }
    /// {@return `layerName` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerNameAt(long index, long elementIndex) { return VkLayerProperties.get_layerName(this.segment(), index, elementIndex); }
    /// {@return `layerName`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment layerName(long elementIndex) { return VkLayerProperties.get_layerName(this.segment(), elementIndex); }
    /// Sets `layerName` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_layerName(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_layerName.invokeExact(0L, elementIndex), index), ML_layerName.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `layerName` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_layerName(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(segment, 0L, elementIndex, value); }
    /// Sets `layerName` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkLayerProperties layerNameAt(long index, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(this.segment(), index, elementIndex, value); return this; }
    /// Sets `layerName` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkLayerProperties layerName(long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_layerName(this.segment(), elementIndex, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment) { return VkLayerProperties.get_specVersion(segment, 0L); }
    /// {@return `specVersion` at the given index}
    /// @param index the index
    public @CType("uint32_t") int specVersionAt(long index) { return VkLayerProperties.get_specVersion(this.segment(), index); }
    /// {@return `specVersion`}
    public @CType("uint32_t") int specVersion() { return VkLayerProperties.get_specVersion(this.segment()); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, @CType("uint32_t") int value) { VkLayerProperties.set_specVersion(segment, 0L, value); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerProperties specVersionAt(long index, @CType("uint32_t") int value) { VkLayerProperties.set_specVersion(this.segment(), index, value); return this; }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties specVersion(@CType("uint32_t") int value) { VkLayerProperties.set_specVersion(this.segment(), value); return this; }

    /// {@return `implementationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_implementationVersion(MemorySegment segment, long index) { return (int) VH_implementationVersion.get(segment, 0L, index); }
    /// {@return `implementationVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_implementationVersion(MemorySegment segment) { return VkLayerProperties.get_implementationVersion(segment, 0L); }
    /// {@return `implementationVersion` at the given index}
    /// @param index the index
    public @CType("uint32_t") int implementationVersionAt(long index) { return VkLayerProperties.get_implementationVersion(this.segment(), index); }
    /// {@return `implementationVersion`}
    public @CType("uint32_t") int implementationVersion() { return VkLayerProperties.get_implementationVersion(this.segment()); }
    /// Sets `implementationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_implementationVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_implementationVersion.set(segment, 0L, index, value); }
    /// Sets `implementationVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_implementationVersion(MemorySegment segment, @CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(segment, 0L, value); }
    /// Sets `implementationVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkLayerProperties implementationVersionAt(long index, @CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(this.segment(), index, value); return this; }
    /// Sets `implementationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLayerProperties implementationVersion(@CType("uint32_t") int value) { VkLayerProperties.set_implementationVersion(this.segment(), value); return this; }

    /// {@return `description` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `description`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment get_description(MemorySegment segment, long elementIndex) { return VkLayerProperties.get_description(segment, 0L, elementIndex); }
    /// {@return `description` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment descriptionAt(long index, long elementIndex) { return VkLayerProperties.get_description(this.segment(), index, elementIndex); }
    /// {@return `description`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment description(long elementIndex) { return VkLayerProperties.get_description(this.segment(), elementIndex); }
    /// Sets `description` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_description.invokeExact(0L, elementIndex), index), ML_description.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `description` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_description(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(segment, 0L, elementIndex, value); }
    /// Sets `description` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkLayerProperties descriptionAt(long index, long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(this.segment(), index, elementIndex, value); return this; }
    /// Sets `description` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkLayerProperties description(long elementIndex, @CType("char[VK_MAX_DESCRIPTION_SIZE]") java.lang.foreign.MemorySegment value) { VkLayerProperties.set_description(this.segment(), elementIndex, value); return this; }

}
