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
package overrungl.vulkan.nv.struct;

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
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### imageFormat
/// [VarHandle][#VH_imageFormat] - [Getter][#imageFormat()] - [Setter][#imageFormat(int)]
/// ### flowVectorFormat
/// [VarHandle][#VH_flowVectorFormat] - [Getter][#flowVectorFormat()] - [Setter][#flowVectorFormat(int)]
/// ### costFormat
/// [VarHandle][#VH_costFormat] - [Getter][#costFormat()] - [Setter][#costFormat(int)]
/// ### outputGridSize
/// [VarHandle][#VH_outputGridSize] - [Getter][#outputGridSize()] - [Setter][#outputGridSize(int)]
/// ### hintGridSize
/// [VarHandle][#VH_hintGridSize] - [Getter][#hintGridSize()] - [Setter][#hintGridSize(int)]
/// ### performanceLevel
/// [VarHandle][#VH_performanceLevel] - [Getter][#performanceLevel()] - [Setter][#performanceLevel(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOpticalFlowSessionCreateInfoNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t width;
///     uint32_t height;
///     VkFormat imageFormat;
///     VkFormat flowVectorFormat;
///     VkFormat costFormat;
///     VkOpticalFlowGridSizeFlagsNV outputGridSize;
///     VkOpticalFlowGridSizeFlagsNV hintGridSize;
///     VkOpticalFlowPerformanceLevelNV performanceLevel;
///     VkOpticalFlowSessionCreateFlagsNV flags;
/// } VkOpticalFlowSessionCreateInfoNV;
/// ```
public sealed class VkOpticalFlowSessionCreateInfoNV extends Struct {
    /// The struct layout of `VkOpticalFlowSessionCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("flowVectorFormat"),
        ValueLayout.JAVA_INT.withName("costFormat"),
        ValueLayout.JAVA_INT.withName("outputGridSize"),
        ValueLayout.JAVA_INT.withName("hintGridSize"),
        ValueLayout.JAVA_INT.withName("performanceLevel"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `imageFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    /// The [VarHandle] of `flowVectorFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flowVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flowVectorFormat"));
    /// The [VarHandle] of `costFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_costFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costFormat"));
    /// The [VarHandle] of `outputGridSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_outputGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("outputGridSize"));
    /// The [VarHandle] of `hintGridSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_hintGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintGridSize"));
    /// The [VarHandle] of `performanceLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_performanceLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceLevel"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkOpticalFlowSessionCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkOpticalFlowSessionCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreateInfoNV`
    public static VkOpticalFlowSessionCreateInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOpticalFlowSessionCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowSessionCreateInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkOpticalFlowSessionCreateInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreateInfoNV`
    public static VkOpticalFlowSessionCreateInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int width, @CType("uint32_t") int height, @CType("VkFormat") int imageFormat, @CType("VkFormat") int flowVectorFormat, @CType("VkFormat") int costFormat, @CType("VkOpticalFlowGridSizeFlagsNV") int outputGridSize, @CType("VkOpticalFlowGridSizeFlagsNV") int hintGridSize, @CType("VkOpticalFlowPerformanceLevelNV") int performanceLevel, @CType("VkOpticalFlowSessionCreateFlagsNV") int flags) { return alloc(allocator).sType(sType).pNext(pNext).width(width).height(height).imageFormat(imageFormat).flowVectorFormat(flowVectorFormat).costFormat(costFormat).outputGridSize(outputGridSize).hintGridSize(hintGridSize).performanceLevel(performanceLevel).flags(flags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV copyFrom(VkOpticalFlowSessionCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkOpticalFlowSessionCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkOpticalFlowSessionCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV sType(@CType("VkStructureType") int value) { VkOpticalFlowSessionCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkOpticalFlowSessionCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_width(segment, 0L); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkOpticalFlowSessionCreateInfoNV.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_width(segment, 0L, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV width(@CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_height(segment, 0L); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkOpticalFlowSessionCreateInfoNV.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_height(segment, 0L, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV height(@CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_height(this.segment(), value); return this; }

    /// {@return `imageFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_imageFormat(MemorySegment segment, long index) { return (int) VH_imageFormat.get(segment, 0L, index); }
    /// {@return `imageFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_imageFormat(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_imageFormat(segment, 0L); }
    /// {@return `imageFormat`}
    public @CType("VkFormat") int imageFormat() { return VkOpticalFlowSessionCreateInfoNV.get_imageFormat(this.segment()); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_imageFormat.set(segment, 0L, index, value); }
    /// Sets `imageFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageFormat(MemorySegment segment, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_imageFormat(segment, 0L, value); }
    /// Sets `imageFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV imageFormat(@CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_imageFormat(this.segment(), value); return this; }

    /// {@return `flowVectorFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_flowVectorFormat(MemorySegment segment, long index) { return (int) VH_flowVectorFormat.get(segment, 0L, index); }
    /// {@return `flowVectorFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_flowVectorFormat(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_flowVectorFormat(segment, 0L); }
    /// {@return `flowVectorFormat`}
    public @CType("VkFormat") int flowVectorFormat() { return VkOpticalFlowSessionCreateInfoNV.get_flowVectorFormat(this.segment()); }
    /// Sets `flowVectorFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flowVectorFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_flowVectorFormat.set(segment, 0L, index, value); }
    /// Sets `flowVectorFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flowVectorFormat(MemorySegment segment, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_flowVectorFormat(segment, 0L, value); }
    /// Sets `flowVectorFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(@CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_flowVectorFormat(this.segment(), value); return this; }

    /// {@return `costFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_costFormat(MemorySegment segment, long index) { return (int) VH_costFormat.get(segment, 0L, index); }
    /// {@return `costFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_costFormat(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_costFormat(segment, 0L); }
    /// {@return `costFormat`}
    public @CType("VkFormat") int costFormat() { return VkOpticalFlowSessionCreateInfoNV.get_costFormat(this.segment()); }
    /// Sets `costFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_costFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_costFormat.set(segment, 0L, index, value); }
    /// Sets `costFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_costFormat(MemorySegment segment, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_costFormat(segment, 0L, value); }
    /// Sets `costFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV costFormat(@CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_costFormat(this.segment(), value); return this; }

    /// {@return `outputGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_outputGridSize(MemorySegment segment, long index) { return (int) VH_outputGridSize.get(segment, 0L, index); }
    /// {@return `outputGridSize`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_outputGridSize(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_outputGridSize(segment, 0L); }
    /// {@return `outputGridSize`}
    public @CType("VkOpticalFlowGridSizeFlagsNV") int outputGridSize() { return VkOpticalFlowSessionCreateInfoNV.get_outputGridSize(this.segment()); }
    /// Sets `outputGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_outputGridSize(MemorySegment segment, long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VH_outputGridSize.set(segment, 0L, index, value); }
    /// Sets `outputGridSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_outputGridSize(MemorySegment segment, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_outputGridSize(segment, 0L, value); }
    /// Sets `outputGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV outputGridSize(@CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_outputGridSize(this.segment(), value); return this; }

    /// {@return `hintGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_hintGridSize(MemorySegment segment, long index) { return (int) VH_hintGridSize.get(segment, 0L, index); }
    /// {@return `hintGridSize`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowGridSizeFlagsNV") int get_hintGridSize(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_hintGridSize(segment, 0L); }
    /// {@return `hintGridSize`}
    public @CType("VkOpticalFlowGridSizeFlagsNV") int hintGridSize() { return VkOpticalFlowSessionCreateInfoNV.get_hintGridSize(this.segment()); }
    /// Sets `hintGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_hintGridSize(MemorySegment segment, long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VH_hintGridSize.set(segment, 0L, index, value); }
    /// Sets `hintGridSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_hintGridSize(MemorySegment segment, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_hintGridSize(segment, 0L, value); }
    /// Sets `hintGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV hintGridSize(@CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_hintGridSize(this.segment(), value); return this; }

    /// {@return `performanceLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowPerformanceLevelNV") int get_performanceLevel(MemorySegment segment, long index) { return (int) VH_performanceLevel.get(segment, 0L, index); }
    /// {@return `performanceLevel`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowPerformanceLevelNV") int get_performanceLevel(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_performanceLevel(segment, 0L); }
    /// {@return `performanceLevel`}
    public @CType("VkOpticalFlowPerformanceLevelNV") int performanceLevel() { return VkOpticalFlowSessionCreateInfoNV.get_performanceLevel(this.segment()); }
    /// Sets `performanceLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_performanceLevel(MemorySegment segment, long index, @CType("VkOpticalFlowPerformanceLevelNV") int value) { VH_performanceLevel.set(segment, 0L, index, value); }
    /// Sets `performanceLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_performanceLevel(MemorySegment segment, @CType("VkOpticalFlowPerformanceLevelNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_performanceLevel(segment, 0L, value); }
    /// Sets `performanceLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV performanceLevel(@CType("VkOpticalFlowPerformanceLevelNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_performanceLevel(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOpticalFlowSessionCreateFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkOpticalFlowSessionCreateFlagsNV") int get_flags(MemorySegment segment) { return VkOpticalFlowSessionCreateInfoNV.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkOpticalFlowSessionCreateFlagsNV") int flags() { return VkOpticalFlowSessionCreateInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkOpticalFlowSessionCreateFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkOpticalFlowSessionCreateFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flags(@CType("VkOpticalFlowSessionCreateFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_flags(this.segment(), value); return this; }

    /// A buffer of [VkOpticalFlowSessionCreateInfoNV].
    public static final class Buffer extends VkOpticalFlowSessionCreateInfoNV {
        private final long elementCount;

        /// Creates `VkOpticalFlowSessionCreateInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkOpticalFlowSessionCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkOpticalFlowSessionCreateInfoNV`
        public VkOpticalFlowSessionCreateInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkOpticalFlowSessionCreateInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkOpticalFlowSessionCreateInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkOpticalFlowSessionCreateInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreateInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `width` at the given index}
        /// @param index the index
        public @CType("uint32_t") int widthAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_width(this.segment(), index); }
        /// Sets `width` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer widthAt(long index, @CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_width(this.segment(), index, value); return this; }

        /// {@return `height` at the given index}
        /// @param index the index
        public @CType("uint32_t") int heightAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_height(this.segment(), index); }
        /// Sets `height` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer heightAt(long index, @CType("uint32_t") int value) { VkOpticalFlowSessionCreateInfoNV.set_height(this.segment(), index, value); return this; }

        /// {@return `imageFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int imageFormatAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_imageFormat(this.segment(), index); }
        /// Sets `imageFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageFormatAt(long index, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_imageFormat(this.segment(), index, value); return this; }

        /// {@return `flowVectorFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int flowVectorFormatAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_flowVectorFormat(this.segment(), index); }
        /// Sets `flowVectorFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flowVectorFormatAt(long index, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_flowVectorFormat(this.segment(), index, value); return this; }

        /// {@return `costFormat` at the given index}
        /// @param index the index
        public @CType("VkFormat") int costFormatAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_costFormat(this.segment(), index); }
        /// Sets `costFormat` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer costFormatAt(long index, @CType("VkFormat") int value) { VkOpticalFlowSessionCreateInfoNV.set_costFormat(this.segment(), index, value); return this; }

        /// {@return `outputGridSize` at the given index}
        /// @param index the index
        public @CType("VkOpticalFlowGridSizeFlagsNV") int outputGridSizeAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_outputGridSize(this.segment(), index); }
        /// Sets `outputGridSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer outputGridSizeAt(long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_outputGridSize(this.segment(), index, value); return this; }

        /// {@return `hintGridSize` at the given index}
        /// @param index the index
        public @CType("VkOpticalFlowGridSizeFlagsNV") int hintGridSizeAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_hintGridSize(this.segment(), index); }
        /// Sets `hintGridSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer hintGridSizeAt(long index, @CType("VkOpticalFlowGridSizeFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_hintGridSize(this.segment(), index, value); return this; }

        /// {@return `performanceLevel` at the given index}
        /// @param index the index
        public @CType("VkOpticalFlowPerformanceLevelNV") int performanceLevelAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_performanceLevel(this.segment(), index); }
        /// Sets `performanceLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer performanceLevelAt(long index, @CType("VkOpticalFlowPerformanceLevelNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_performanceLevel(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkOpticalFlowSessionCreateFlagsNV") int flagsAt(long index) { return VkOpticalFlowSessionCreateInfoNV.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkOpticalFlowSessionCreateFlagsNV") int value) { VkOpticalFlowSessionCreateInfoNV.set_flags(this.segment(), index, value); return this; }

    }
}
