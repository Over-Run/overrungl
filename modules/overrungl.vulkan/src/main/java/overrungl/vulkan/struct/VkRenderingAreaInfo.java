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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### viewMask
/// [VarHandle][#VH_viewMask] - [Getter][#viewMask()] - [Setter][#viewMask(int)]
/// ### colorAttachmentCount
/// [VarHandle][#VH_colorAttachmentCount] - [Getter][#colorAttachmentCount()] - [Setter][#colorAttachmentCount(int)]
/// ### pColorAttachmentFormats
/// [VarHandle][#VH_pColorAttachmentFormats] - [Getter][#pColorAttachmentFormats()] - [Setter][#pColorAttachmentFormats(java.lang.foreign.MemorySegment)]
/// ### depthAttachmentFormat
/// [VarHandle][#VH_depthAttachmentFormat] - [Getter][#depthAttachmentFormat()] - [Setter][#depthAttachmentFormat(int)]
/// ### stencilAttachmentFormat
/// [VarHandle][#VH_stencilAttachmentFormat] - [Getter][#stencilAttachmentFormat()] - [Setter][#stencilAttachmentFormat(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingAreaInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkFormat * pColorAttachmentFormats;
///     VkFormat depthAttachmentFormat;
///     VkFormat stencilAttachmentFormat;
/// } VkRenderingAreaInfo;
/// ```
public final class VkRenderingAreaInfo extends Struct {
    /// The struct layout of `VkRenderingAreaInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `pColorAttachmentFormats` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pColorAttachmentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentFormats"));
    /// The [VarHandle] of `depthAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthAttachmentFormat"));
    /// The [VarHandle] of `stencilAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilAttachmentFormat"));

    /// Creates `VkRenderingAreaInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingAreaInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderingAreaInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingAreaInfo`
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingAreaInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingAreaInfo`
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingAreaInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingAreaInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingAreaInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingAreaInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingAreaInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo sType(@CType("VkStructureType") int value) { VkRenderingAreaInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingAreaInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingAreaInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingAreaInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewMask(MemorySegment segment) { return VkRenderingAreaInfo.get_viewMask(segment, 0L); }
    /// {@return `viewMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewMaskAt(long index) { return VkRenderingAreaInfo.get_viewMask(this.segment(), index); }
    /// {@return `viewMask`}
    public @CType("uint32_t") int viewMask() { return VkRenderingAreaInfo.get_viewMask(this.segment()); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewMask(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingAreaInfo.set_viewMask(segment, 0L, value); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo viewMaskAt(long index, @CType("uint32_t") int value) { VkRenderingAreaInfo.set_viewMask(this.segment(), index, value); return this; }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo viewMask(@CType("uint32_t") int value) { VkRenderingAreaInfo.set_viewMask(this.segment(), value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachmentCount(MemorySegment segment) { return VkRenderingAreaInfo.get_colorAttachmentCount(segment, 0L); }
    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int colorAttachmentCountAt(long index) { return VkRenderingAreaInfo.get_colorAttachmentCount(this.segment(), index); }
    /// {@return `colorAttachmentCount`}
    public @CType("uint32_t") int colorAttachmentCount() { return VkRenderingAreaInfo.get_colorAttachmentCount(this.segment()); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkRenderingAreaInfo.set_colorAttachmentCount(segment, 0L, value); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo colorAttachmentCountAt(long index, @CType("uint32_t") int value) { VkRenderingAreaInfo.set_colorAttachmentCount(this.segment(), index, value); return this; }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo colorAttachmentCount(@CType("uint32_t") int value) { VkRenderingAreaInfo.set_colorAttachmentCount(this.segment(), value); return this; }

    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pColorAttachmentFormats(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pColorAttachmentFormats.get(segment, 0L, index); }
    /// {@return `pColorAttachmentFormats`}
    /// @param segment the segment of the struct
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pColorAttachmentFormats(MemorySegment segment) { return VkRenderingAreaInfo.get_pColorAttachmentFormats(segment, 0L); }
    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param index the index
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pColorAttachmentFormatsAt(long index) { return VkRenderingAreaInfo.get_pColorAttachmentFormats(this.segment(), index); }
    /// {@return `pColorAttachmentFormats`}
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pColorAttachmentFormats() { return VkRenderingAreaInfo.get_pColorAttachmentFormats(this.segment()); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pColorAttachmentFormats(MemorySegment segment, long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VH_pColorAttachmentFormats.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pColorAttachmentFormats(MemorySegment segment, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pColorAttachmentFormats(segment, 0L, value); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pColorAttachmentFormatsAt(long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pColorAttachmentFormats(this.segment(), index, value); return this; }
    /// Sets `pColorAttachmentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pColorAttachmentFormats(@CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkRenderingAreaInfo.set_pColorAttachmentFormats(this.segment(), value); return this; }

    /// {@return `depthAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_depthAttachmentFormat(MemorySegment segment, long index) { return (int) VH_depthAttachmentFormat.get(segment, 0L, index); }
    /// {@return `depthAttachmentFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_depthAttachmentFormat(MemorySegment segment) { return VkRenderingAreaInfo.get_depthAttachmentFormat(segment, 0L); }
    /// {@return `depthAttachmentFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int depthAttachmentFormatAt(long index) { return VkRenderingAreaInfo.get_depthAttachmentFormat(this.segment(), index); }
    /// {@return `depthAttachmentFormat`}
    public @CType("VkFormat") int depthAttachmentFormat() { return VkRenderingAreaInfo.get_depthAttachmentFormat(this.segment()); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthAttachmentFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_depthAttachmentFormat.set(segment, 0L, index, value); }
    /// Sets `depthAttachmentFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthAttachmentFormat(MemorySegment segment, @CType("VkFormat") int value) { VkRenderingAreaInfo.set_depthAttachmentFormat(segment, 0L, value); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo depthAttachmentFormatAt(long index, @CType("VkFormat") int value) { VkRenderingAreaInfo.set_depthAttachmentFormat(this.segment(), index, value); return this; }
    /// Sets `depthAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo depthAttachmentFormat(@CType("VkFormat") int value) { VkRenderingAreaInfo.set_depthAttachmentFormat(this.segment(), value); return this; }

    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_stencilAttachmentFormat(MemorySegment segment, long index) { return (int) VH_stencilAttachmentFormat.get(segment, 0L, index); }
    /// {@return `stencilAttachmentFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_stencilAttachmentFormat(MemorySegment segment) { return VkRenderingAreaInfo.get_stencilAttachmentFormat(segment, 0L); }
    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int stencilAttachmentFormatAt(long index) { return VkRenderingAreaInfo.get_stencilAttachmentFormat(this.segment(), index); }
    /// {@return `stencilAttachmentFormat`}
    public @CType("VkFormat") int stencilAttachmentFormat() { return VkRenderingAreaInfo.get_stencilAttachmentFormat(this.segment()); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilAttachmentFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_stencilAttachmentFormat.set(segment, 0L, index, value); }
    /// Sets `stencilAttachmentFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilAttachmentFormat(MemorySegment segment, @CType("VkFormat") int value) { VkRenderingAreaInfo.set_stencilAttachmentFormat(segment, 0L, value); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo stencilAttachmentFormatAt(long index, @CType("VkFormat") int value) { VkRenderingAreaInfo.set_stencilAttachmentFormat(this.segment(), index, value); return this; }
    /// Sets `stencilAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo stencilAttachmentFormat(@CType("VkFormat") int value) { VkRenderingAreaInfo.set_stencilAttachmentFormat(this.segment(), value); return this; }

}