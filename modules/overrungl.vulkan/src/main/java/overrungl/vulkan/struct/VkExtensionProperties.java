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

/// ## Members
/// ### extensionName
/// [Byte offset handle][#MH_extensionName] - [Memory layout][#ML_extensionName] - [Getter][#extensionName(long)] - [Setter][#extensionName(long, java.lang.foreign.MemorySegment)]
/// ### specVersion
/// [VarHandle][#VH_specVersion] - [Getter][#specVersion()] - [Setter][#specVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExtensionProperties {
///     char[VK_MAX_EXTENSION_NAME_SIZE] extensionName;
///     uint32_t specVersion;
/// } VkExtensionProperties;
/// ```
public final class VkExtensionProperties extends Struct {
    /// The struct layout of `VkExtensionProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("extensionName"),
        ValueLayout.JAVA_INT.withName("specVersion")
    );
    /// The byte offset handle of `extensionName` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_extensionName = LAYOUT.byteOffsetHandle(PathElement.groupElement("extensionName"), PathElement.sequenceElement());
    /// The memory layout of `extensionName`.
    public static final MemoryLayout ML_extensionName = LAYOUT.select(PathElement.groupElement("extensionName"));
    /// The [VarHandle] of `specVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("specVersion"));

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    public VkExtensionProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExtensionProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtensionProperties(segment); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExtensionProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExtensionProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExtensionProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExtensionProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator) { return new VkExtensionProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExtensionProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExtensionProperties`
    public static VkExtensionProperties alloc(SegmentAllocator allocator, long count) { return new VkExtensionProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `extensionName` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_extensionName(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_extensionName.invokeExact(0L, elementIndex), index), ML_extensionName); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `extensionName`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment get_extensionName(MemorySegment segment, long elementIndex) { return VkExtensionProperties.get_extensionName(segment, 0L, elementIndex); }
    /// {@return `extensionName` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment extensionNameAt(long index, long elementIndex) { return VkExtensionProperties.get_extensionName(this.segment(), index, elementIndex); }
    /// {@return `extensionName`}
    /// @param elementIndex the index of the element
    public @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment extensionName(long elementIndex) { return VkExtensionProperties.get_extensionName(this.segment(), elementIndex); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_extensionName(MemorySegment segment, long index, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_extensionName.invokeExact(0L, elementIndex), index), ML_extensionName.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `extensionName` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_extensionName(MemorySegment segment, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkExtensionProperties.set_extensionName(segment, 0L, elementIndex, value); }
    /// Sets `extensionName` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkExtensionProperties extensionNameAt(long index, long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkExtensionProperties.set_extensionName(this.segment(), index, elementIndex, value); return this; }
    /// Sets `extensionName` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkExtensionProperties extensionName(long elementIndex, @CType("char[VK_MAX_EXTENSION_NAME_SIZE]") java.lang.foreign.MemorySegment value) { VkExtensionProperties.set_extensionName(this.segment(), elementIndex, value); return this; }

    /// {@return `specVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment, long index) { return (int) VH_specVersion.get(segment, 0L, index); }
    /// {@return `specVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_specVersion(MemorySegment segment) { return VkExtensionProperties.get_specVersion(segment, 0L); }
    /// {@return `specVersion` at the given index}
    /// @param index the index
    public @CType("uint32_t") int specVersionAt(long index) { return VkExtensionProperties.get_specVersion(this.segment(), index); }
    /// {@return `specVersion`}
    public @CType("uint32_t") int specVersion() { return VkExtensionProperties.get_specVersion(this.segment()); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_specVersion.set(segment, 0L, index, value); }
    /// Sets `specVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_specVersion(MemorySegment segment, @CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(segment, 0L, value); }
    /// Sets `specVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersionAt(long index, @CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(this.segment(), index, value); return this; }
    /// Sets `specVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExtensionProperties specVersion(@CType("uint32_t") int value) { VkExtensionProperties.set_specVersion(this.segment(), value); return this; }

}
