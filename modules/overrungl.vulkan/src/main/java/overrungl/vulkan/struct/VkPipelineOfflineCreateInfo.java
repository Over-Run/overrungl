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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pipelineIdentifier
/// [Byte offset handle][#MH_pipelineIdentifier] - [Memory layout][#ML_pipelineIdentifier] - [Getter][#pipelineIdentifier(long)] - [Setter][#pipelineIdentifier(long, java.lang.foreign.MemorySegment)]
/// ### matchControl
/// [VarHandle][#VH_matchControl] - [Getter][#matchControl()] - [Setter][#matchControl(int)]
/// ### poolEntrySize
/// [VarHandle][#VH_poolEntrySize] - [Getter][#poolEntrySize()] - [Setter][#poolEntrySize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineOfflineCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint8_t[VK_UUID_SIZE] pipelineIdentifier;
///     VkPipelineMatchControl matchControl;
///     VkDeviceSize poolEntrySize;
/// } VkPipelineOfflineCreateInfo;
/// ```
public final class VkPipelineOfflineCreateInfo extends Struct {
    /// The struct layout of `VkPipelineOfflineCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier"),
        ValueLayout.JAVA_INT.withName("matchControl"),
        ValueLayout.JAVA_LONG.withName("poolEntrySize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset handle of `pipelineIdentifier` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_pipelineIdentifier = LAYOUT.byteOffsetHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement());
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout ML_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    /// The [VarHandle] of `matchControl` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_matchControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("matchControl"));
    /// The [VarHandle] of `poolEntrySize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_poolEntrySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("poolEntrySize"));

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineOfflineCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineOfflineCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineOfflineCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineOfflineCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineOfflineCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineOfflineCreateInfo`
    public static VkPipelineOfflineCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineOfflineCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineOfflineCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineOfflineCreateInfo`
    public static VkPipelineOfflineCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineOfflineCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineOfflineCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineOfflineCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineOfflineCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineOfflineCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineOfflineCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineOfflineCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineOfflineCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineOfflineCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineOfflineCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_pipelineIdentifier.invokeExact(0L, elementIndex), index), ML_pipelineIdentifier); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `pipelineIdentifier`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_pipelineIdentifier(MemorySegment segment, long elementIndex) { return VkPipelineOfflineCreateInfo.get_pipelineIdentifier(segment, 0L, elementIndex); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifierAt(long index, long elementIndex) { return VkPipelineOfflineCreateInfo.get_pipelineIdentifier(this.segment(), index, elementIndex); }
    /// {@return `pipelineIdentifier`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment pipelineIdentifier(long elementIndex) { return VkPipelineOfflineCreateInfo.get_pipelineIdentifier(this.segment(), elementIndex); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_pipelineIdentifier(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_pipelineIdentifier.invokeExact(0L, elementIndex), index), ML_pipelineIdentifier.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_pipelineIdentifier(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pipelineIdentifier(segment, 0L, elementIndex, value); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifierAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pipelineIdentifier(this.segment(), index, elementIndex, value); return this; }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo pipelineIdentifier(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPipelineOfflineCreateInfo.set_pipelineIdentifier(this.segment(), elementIndex, value); return this; }

    /// {@return `matchControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineMatchControl") int get_matchControl(MemorySegment segment, long index) { return (int) VH_matchControl.get(segment, 0L, index); }
    /// {@return `matchControl`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineMatchControl") int get_matchControl(MemorySegment segment) { return VkPipelineOfflineCreateInfo.get_matchControl(segment, 0L); }
    /// {@return `matchControl` at the given index}
    /// @param index the index
    public @CType("VkPipelineMatchControl") int matchControlAt(long index) { return VkPipelineOfflineCreateInfo.get_matchControl(this.segment(), index); }
    /// {@return `matchControl`}
    public @CType("VkPipelineMatchControl") int matchControl() { return VkPipelineOfflineCreateInfo.get_matchControl(this.segment()); }
    /// Sets `matchControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_matchControl(MemorySegment segment, long index, @CType("VkPipelineMatchControl") int value) { VH_matchControl.set(segment, 0L, index, value); }
    /// Sets `matchControl` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_matchControl(MemorySegment segment, @CType("VkPipelineMatchControl") int value) { VkPipelineOfflineCreateInfo.set_matchControl(segment, 0L, value); }
    /// Sets `matchControl` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo matchControlAt(long index, @CType("VkPipelineMatchControl") int value) { VkPipelineOfflineCreateInfo.set_matchControl(this.segment(), index, value); return this; }
    /// Sets `matchControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo matchControl(@CType("VkPipelineMatchControl") int value) { VkPipelineOfflineCreateInfo.set_matchControl(this.segment(), value); return this; }

    /// {@return `poolEntrySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_poolEntrySize(MemorySegment segment, long index) { return (long) VH_poolEntrySize.get(segment, 0L, index); }
    /// {@return `poolEntrySize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_poolEntrySize(MemorySegment segment) { return VkPipelineOfflineCreateInfo.get_poolEntrySize(segment, 0L); }
    /// {@return `poolEntrySize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long poolEntrySizeAt(long index) { return VkPipelineOfflineCreateInfo.get_poolEntrySize(this.segment(), index); }
    /// {@return `poolEntrySize`}
    public @CType("VkDeviceSize") long poolEntrySize() { return VkPipelineOfflineCreateInfo.get_poolEntrySize(this.segment()); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_poolEntrySize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_poolEntrySize.set(segment, 0L, index, value); }
    /// Sets `poolEntrySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_poolEntrySize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPipelineOfflineCreateInfo.set_poolEntrySize(segment, 0L, value); }
    /// Sets `poolEntrySize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo poolEntrySizeAt(long index, @CType("VkDeviceSize") long value) { VkPipelineOfflineCreateInfo.set_poolEntrySize(this.segment(), index, value); return this; }
    /// Sets `poolEntrySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineOfflineCreateInfo poolEntrySize(@CType("VkDeviceSize") long value) { VkPipelineOfflineCreateInfo.set_poolEntrySize(this.segment(), value); return this; }

}
