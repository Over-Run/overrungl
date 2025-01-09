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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### componentMapping
/// [Byte offset][#OFFSET_componentMapping] - [Memory layout][#ML_componentMapping] - [Getter][#componentMapping()] - [Setter][#componentMapping(java.lang.foreign.MemorySegment)]
/// ### imageCreateFlags
/// [VarHandle][#VH_imageCreateFlags] - [Getter][#imageCreateFlags()] - [Setter][#imageCreateFlags(int)]
/// ### imageType
/// [VarHandle][#VH_imageType] - [Getter][#imageType()] - [Setter][#imageType(int)]
/// ### imageTiling
/// [VarHandle][#VH_imageTiling] - [Getter][#imageTiling()] - [Setter][#imageTiling(int)]
/// ### imageUsageFlags
/// [VarHandle][#VH_imageUsageFlags] - [Getter][#imageUsageFlags()] - [Setter][#imageUsageFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoFormatPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkFormat format;
///     VkComponentMapping componentMapping;
///     VkImageCreateFlags imageCreateFlags;
///     VkImageType imageType;
///     VkImageTiling imageTiling;
///     VkImageUsageFlags imageUsageFlags;
/// } VkVideoFormatPropertiesKHR;
/// ```
public final class VkVideoFormatPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoFormatPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("componentMapping"),
        ValueLayout.JAVA_INT.withName("imageCreateFlags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("imageTiling"),
        ValueLayout.JAVA_INT.withName("imageUsageFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `componentMapping`.
    public static final long OFFSET_componentMapping = LAYOUT.byteOffset(PathElement.groupElement("componentMapping"));
    /// The memory layout of `componentMapping`.
    public static final MemoryLayout ML_componentMapping = LAYOUT.select(PathElement.groupElement("componentMapping"));
    /// The [VarHandle] of `imageCreateFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageCreateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateFlags"));
    /// The [VarHandle] of `imageType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    /// The [VarHandle] of `imageTiling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageTiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageTiling"));
    /// The [VarHandle] of `imageUsageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsageFlags"));

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoFormatPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoFormatPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatPropertiesKHR`
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoFormatPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatPropertiesKHR`
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoFormatPropertiesKHR`
    public VkVideoFormatPropertiesKHR asSlice(long index) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoFormatPropertiesKHR`
    public VkVideoFormatPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoFormatPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoFormatPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoFormatPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoFormatPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoFormatPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoFormatPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoFormatPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkVideoFormatPropertiesKHR.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkVideoFormatPropertiesKHR.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkVideoFormatPropertiesKHR.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR formatAt(long index, @CType("VkFormat") int value) { VkVideoFormatPropertiesKHR.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR format(@CType("VkFormat") int value) { VkVideoFormatPropertiesKHR.set_format(this.segment(), value); return this; }

    /// {@return `componentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_componentMapping(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_componentMapping, index), ML_componentMapping); }
    /// {@return `componentMapping`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_componentMapping(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_componentMapping(segment, 0L); }
    /// {@return `componentMapping` at the given index}
    /// @param index the index
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment componentMappingAt(long index) { return VkVideoFormatPropertiesKHR.get_componentMapping(this.segment(), index); }
    /// {@return `componentMapping`}
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment componentMapping() { return VkVideoFormatPropertiesKHR.get_componentMapping(this.segment()); }
    /// Sets `componentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_componentMapping(MemorySegment segment, long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_componentMapping, index), ML_componentMapping.byteSize()); }
    /// Sets `componentMapping` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_componentMapping(MemorySegment segment, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_componentMapping(segment, 0L, value); }
    /// Sets `componentMapping` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMappingAt(long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_componentMapping(this.segment(), index, value); return this; }
    /// Sets `componentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMapping(@CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkVideoFormatPropertiesKHR.set_componentMapping(this.segment(), value); return this; }

    /// {@return `imageCreateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCreateFlags") int get_imageCreateFlags(MemorySegment segment, long index) { return (int) VH_imageCreateFlags.get(segment, 0L, index); }
    /// {@return `imageCreateFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCreateFlags") int get_imageCreateFlags(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_imageCreateFlags(segment, 0L); }
    /// {@return `imageCreateFlags` at the given index}
    /// @param index the index
    public @CType("VkImageCreateFlags") int imageCreateFlagsAt(long index) { return VkVideoFormatPropertiesKHR.get_imageCreateFlags(this.segment(), index); }
    /// {@return `imageCreateFlags`}
    public @CType("VkImageCreateFlags") int imageCreateFlags() { return VkVideoFormatPropertiesKHR.get_imageCreateFlags(this.segment()); }
    /// Sets `imageCreateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageCreateFlags(MemorySegment segment, long index, @CType("VkImageCreateFlags") int value) { VH_imageCreateFlags.set(segment, 0L, index, value); }
    /// Sets `imageCreateFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageCreateFlags(MemorySegment segment, @CType("VkImageCreateFlags") int value) { VkVideoFormatPropertiesKHR.set_imageCreateFlags(segment, 0L, value); }
    /// Sets `imageCreateFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageCreateFlagsAt(long index, @CType("VkImageCreateFlags") int value) { VkVideoFormatPropertiesKHR.set_imageCreateFlags(this.segment(), index, value); return this; }
    /// Sets `imageCreateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageCreateFlags(@CType("VkImageCreateFlags") int value) { VkVideoFormatPropertiesKHR.set_imageCreateFlags(this.segment(), value); return this; }

    /// {@return `imageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageType") int get_imageType(MemorySegment segment, long index) { return (int) VH_imageType.get(segment, 0L, index); }
    /// {@return `imageType`}
    /// @param segment the segment of the struct
    public static @CType("VkImageType") int get_imageType(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_imageType(segment, 0L); }
    /// {@return `imageType` at the given index}
    /// @param index the index
    public @CType("VkImageType") int imageTypeAt(long index) { return VkVideoFormatPropertiesKHR.get_imageType(this.segment(), index); }
    /// {@return `imageType`}
    public @CType("VkImageType") int imageType() { return VkVideoFormatPropertiesKHR.get_imageType(this.segment()); }
    /// Sets `imageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageType(MemorySegment segment, long index, @CType("VkImageType") int value) { VH_imageType.set(segment, 0L, index, value); }
    /// Sets `imageType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageType(MemorySegment segment, @CType("VkImageType") int value) { VkVideoFormatPropertiesKHR.set_imageType(segment, 0L, value); }
    /// Sets `imageType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTypeAt(long index, @CType("VkImageType") int value) { VkVideoFormatPropertiesKHR.set_imageType(this.segment(), index, value); return this; }
    /// Sets `imageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageType(@CType("VkImageType") int value) { VkVideoFormatPropertiesKHR.set_imageType(this.segment(), value); return this; }

    /// {@return `imageTiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageTiling") int get_imageTiling(MemorySegment segment, long index) { return (int) VH_imageTiling.get(segment, 0L, index); }
    /// {@return `imageTiling`}
    /// @param segment the segment of the struct
    public static @CType("VkImageTiling") int get_imageTiling(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_imageTiling(segment, 0L); }
    /// {@return `imageTiling` at the given index}
    /// @param index the index
    public @CType("VkImageTiling") int imageTilingAt(long index) { return VkVideoFormatPropertiesKHR.get_imageTiling(this.segment(), index); }
    /// {@return `imageTiling`}
    public @CType("VkImageTiling") int imageTiling() { return VkVideoFormatPropertiesKHR.get_imageTiling(this.segment()); }
    /// Sets `imageTiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageTiling(MemorySegment segment, long index, @CType("VkImageTiling") int value) { VH_imageTiling.set(segment, 0L, index, value); }
    /// Sets `imageTiling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageTiling(MemorySegment segment, @CType("VkImageTiling") int value) { VkVideoFormatPropertiesKHR.set_imageTiling(segment, 0L, value); }
    /// Sets `imageTiling` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTilingAt(long index, @CType("VkImageTiling") int value) { VkVideoFormatPropertiesKHR.set_imageTiling(this.segment(), index, value); return this; }
    /// Sets `imageTiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTiling(@CType("VkImageTiling") int value) { VkVideoFormatPropertiesKHR.set_imageTiling(this.segment(), value); return this; }

    /// {@return `imageUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_imageUsageFlags(MemorySegment segment, long index) { return (int) VH_imageUsageFlags.get(segment, 0L, index); }
    /// {@return `imageUsageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_imageUsageFlags(MemorySegment segment) { return VkVideoFormatPropertiesKHR.get_imageUsageFlags(segment, 0L); }
    /// {@return `imageUsageFlags` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int imageUsageFlagsAt(long index) { return VkVideoFormatPropertiesKHR.get_imageUsageFlags(this.segment(), index); }
    /// {@return `imageUsageFlags`}
    public @CType("VkImageUsageFlags") int imageUsageFlags() { return VkVideoFormatPropertiesKHR.get_imageUsageFlags(this.segment()); }
    /// Sets `imageUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageUsageFlags(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_imageUsageFlags.set(segment, 0L, index, value); }
    /// Sets `imageUsageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageUsageFlags(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkVideoFormatPropertiesKHR.set_imageUsageFlags(segment, 0L, value); }
    /// Sets `imageUsageFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageUsageFlagsAt(long index, @CType("VkImageUsageFlags") int value) { VkVideoFormatPropertiesKHR.set_imageUsageFlags(this.segment(), index, value); return this; }
    /// Sets `imageUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageUsageFlags(@CType("VkImageUsageFlags") int value) { VkVideoFormatPropertiesKHR.set_imageUsageFlags(this.segment(), value); return this; }

}
