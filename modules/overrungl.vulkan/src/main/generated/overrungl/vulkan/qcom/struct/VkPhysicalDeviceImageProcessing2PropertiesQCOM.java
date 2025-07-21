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
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkExtent2D) VkExtent2D maxBlockMatchWindow;
/// };
/// ```
public final class VkPhysicalDeviceImageProcessing2PropertiesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
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
    /// The byte offset of `maxBlockMatchWindow`.
    public static final long OFFSET_maxBlockMatchWindow = LAYOUT.byteOffset(PathElement.groupElement("maxBlockMatchWindow"));
    /// The memory layout of `maxBlockMatchWindow`.
    public static final MemoryLayout LAYOUT_maxBlockMatchWindow = LAYOUT.select(PathElement.groupElement("maxBlockMatchWindow"));

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param maxBlockMatchWindow `maxBlockMatchWindow`
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment maxBlockMatchWindow) {
        return alloc(allocator).sType(sType).pNext(pNext).maxBlockMatchWindow(maxBlockMatchWindow);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceImageProcessing2PropertiesQCOM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM copyFrom(VkPhysicalDeviceImageProcessing2PropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxBlockMatchWindow` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxBlockMatchWindow(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxBlockMatchWindow, index), LAYOUT_maxBlockMatchWindow); }
    /// {@return `maxBlockMatchWindow`}
    public MemorySegment maxBlockMatchWindow() { return maxBlockMatchWindow(this.segment(), 0L); }
    /// Sets `maxBlockMatchWindow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBlockMatchWindow(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxBlockMatchWindow, index), LAYOUT_maxBlockMatchWindow.byteSize()); }
    /// Sets `maxBlockMatchWindow` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow(MemorySegment value) { maxBlockMatchWindow(this.segment(), 0L, value); return this; }
    /// Accepts `maxBlockMatchWindow` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindow(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBlockMatchWindow())); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageProcessing2PropertiesQCOM`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageProcessing2PropertiesQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessing2PropertiesQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxBlockMatchWindow` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxBlockMatchWindowAt(long index) { return maxBlockMatchWindow(this.segment(), index); }
    /// Sets `maxBlockMatchWindow` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindowAt(long index, MemorySegment value) { maxBlockMatchWindow(this.segment(), index, value); return this; }
    /// Accepts `maxBlockMatchWindow` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM maxBlockMatchWindowAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxBlockMatchWindowAt(index))); return this; }

}
