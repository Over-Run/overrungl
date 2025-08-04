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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceHostImageCopyProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t copySrcLayoutCount;
///     VkImageLayout* pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout* pCopyDstLayouts;
///     uint8_t optimalTilingLayoutUUID[16];
///     (uint32_t) VkBool32 identicalMemoryTypeRequirements;
/// };
/// ```
public final class VkPhysicalDeviceHostImageCopyProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceHostImageCopyProperties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
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
    /// The byte offset of `copySrcLayoutCount`.
    public static final long OFFSET_copySrcLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
    /// The memory layout of `copySrcLayoutCount`.
    public static final MemoryLayout LAYOUT_copySrcLayoutCount = LAYOUT.select(PathElement.groupElement("copySrcLayoutCount"));
    /// The [VarHandle] of `copySrcLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    /// The byte offset of `pCopySrcLayouts`.
    public static final long OFFSET_pCopySrcLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
    /// The memory layout of `pCopySrcLayouts`.
    public static final MemoryLayout LAYOUT_pCopySrcLayouts = LAYOUT.select(PathElement.groupElement("pCopySrcLayouts"));
    /// The [VarHandle] of `pCopySrcLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    /// The byte offset of `copyDstLayoutCount`.
    public static final long OFFSET_copyDstLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
    /// The memory layout of `copyDstLayoutCount`.
    public static final MemoryLayout LAYOUT_copyDstLayoutCount = LAYOUT.select(PathElement.groupElement("copyDstLayoutCount"));
    /// The [VarHandle] of `copyDstLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    /// The byte offset of `pCopyDstLayouts`.
    public static final long OFFSET_pCopyDstLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
    /// The memory layout of `pCopyDstLayouts`.
    public static final MemoryLayout LAYOUT_pCopyDstLayouts = LAYOUT.select(PathElement.groupElement("pCopyDstLayouts"));
    /// The [VarHandle] of `pCopyDstLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    /// The byte offset of `optimalTilingLayoutUUID`.
    public static final long OFFSET_optimalTilingLayoutUUID = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The memory layout of `optimalTilingLayoutUUID`.
    public static final MemoryLayout LAYOUT_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The [VarHandle] of `optimalTilingLayoutUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_optimalTilingLayoutUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    /// The byte offset of `identicalMemoryTypeRequirements`.
    public static final long OFFSET_identicalMemoryTypeRequirements = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
    /// The memory layout of `identicalMemoryTypeRequirements`.
    public static final MemoryLayout LAYOUT_identicalMemoryTypeRequirements = LAYOUT.select(PathElement.groupElement("identicalMemoryTypeRequirements"));
    /// The [VarHandle] of `identicalMemoryTypeRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceHostImageCopyProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceHostImageCopyProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceHostImageCopyProperties`
    public static VkPhysicalDeviceHostImageCopyProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHostImageCopyProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceHostImageCopyProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceHostImageCopyProperties`
    public static VkPhysicalDeviceHostImageCopyProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHostImageCopyProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copyFrom(VkPhysicalDeviceHostImageCopyProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceHostImageCopyProperties reinterpret(long count) { return new VkPhysicalDeviceHostImageCopyProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceHostImageCopyProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceHostImageCopyProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `copySrcLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int copySrcLayoutCount(MemorySegment segment, long index) { return (int) VH_copySrcLayoutCount.get(segment, 0L, index); }
    /// {@return `copySrcLayoutCount`}
    public int copySrcLayoutCount() { return copySrcLayoutCount(this.segment(), 0L); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copySrcLayoutCount(MemorySegment segment, long index, int value) { VH_copySrcLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(int value) { copySrcLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pCopySrcLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCopySrcLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pCopySrcLayouts.get(segment, 0L, index); }
    /// {@return `pCopySrcLayouts`}
    public MemorySegment pCopySrcLayouts() { return pCopySrcLayouts(this.segment(), 0L); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCopySrcLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pCopySrcLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(MemorySegment value) { pCopySrcLayouts(this.segment(), 0L, value); return this; }

    /// {@return `copyDstLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int copyDstLayoutCount(MemorySegment segment, long index) { return (int) VH_copyDstLayoutCount.get(segment, 0L, index); }
    /// {@return `copyDstLayoutCount`}
    public int copyDstLayoutCount() { return copyDstLayoutCount(this.segment(), 0L); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copyDstLayoutCount(MemorySegment segment, long index, int value) { VH_copyDstLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(int value) { copyDstLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pCopyDstLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCopyDstLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pCopyDstLayouts.get(segment, 0L, index); }
    /// {@return `pCopyDstLayouts`}
    public MemorySegment pCopyDstLayouts() { return pCopyDstLayouts(this.segment(), 0L); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCopyDstLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pCopyDstLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(MemorySegment value) { pCopyDstLayouts(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment optimalTilingLayoutUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID); }
    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte optimalTilingLayoutUUID(MemorySegment segment, long index, long index0) { return (byte) VH_optimalTilingLayoutUUID.get(segment, 0L, index, index0); }
    /// {@return `optimalTilingLayoutUUID`}
    public MemorySegment optimalTilingLayoutUUID() { return optimalTilingLayoutUUID(this.segment(), 0L); }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param index0 the Index 0 of the array
    public byte optimalTilingLayoutUUID(long index0) { return optimalTilingLayoutUUID(this.segment(), 0L, index0); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingLayoutUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID.byteSize()); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void optimalTilingLayoutUUID(MemorySegment segment, long index, long index0, byte value) { VH_optimalTilingLayoutUUID.set(segment, 0L, index, index0, value); }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(MemorySegment value) { optimalTilingLayoutUUID(this.segment(), 0L, value); return this; }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(long index0, byte value) { optimalTilingLayoutUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identicalMemoryTypeRequirements(MemorySegment segment, long index) { return (int) VH_identicalMemoryTypeRequirements.get(segment, 0L, index); }
    /// {@return `identicalMemoryTypeRequirements`}
    public int identicalMemoryTypeRequirements() { return identicalMemoryTypeRequirements(this.segment(), 0L); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identicalMemoryTypeRequirements(MemorySegment segment, long index, int value) { VH_identicalMemoryTypeRequirements.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(int value) { identicalMemoryTypeRequirements(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceHostImageCopyProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceHostImageCopyProperties`
    public VkPhysicalDeviceHostImageCopyProperties asSlice(long index) { return new VkPhysicalDeviceHostImageCopyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceHostImageCopyProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceHostImageCopyProperties`
    public VkPhysicalDeviceHostImageCopyProperties asSlice(long index, long count) { return new VkPhysicalDeviceHostImageCopyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceHostImageCopyProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties at(long index, Consumer<VkPhysicalDeviceHostImageCopyProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `copySrcLayoutCount` at the given index}
    /// @param index the index of the struct buffer
    public int copySrcLayoutCountAt(long index) { return copySrcLayoutCount(this.segment(), index); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCountAt(long index, int value) { copySrcLayoutCount(this.segment(), index, value); return this; }

    /// {@return `pCopySrcLayouts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCopySrcLayoutsAt(long index) { return pCopySrcLayouts(this.segment(), index); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayoutsAt(long index, MemorySegment value) { pCopySrcLayouts(this.segment(), index, value); return this; }

    /// {@return `copyDstLayoutCount` at the given index}
    /// @param index the index of the struct buffer
    public int copyDstLayoutCountAt(long index) { return copyDstLayoutCount(this.segment(), index); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCountAt(long index, int value) { copyDstLayoutCount(this.segment(), index, value); return this; }

    /// {@return `pCopyDstLayouts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCopyDstLayoutsAt(long index) { return pCopyDstLayouts(this.segment(), index); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayoutsAt(long index, MemorySegment value) { pCopyDstLayouts(this.segment(), index, value); return this; }

    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment optimalTilingLayoutUUIDAt(long index) { return optimalTilingLayoutUUID(this.segment(), index); }
    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte optimalTilingLayoutUUIDAt(long index, long index0) { return optimalTilingLayoutUUID(this.segment(), index, index0); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUIDAt(long index, MemorySegment value) { optimalTilingLayoutUUID(this.segment(), index, value); return this; }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUIDAt(long index, long index0, byte value) { optimalTilingLayoutUUID(this.segment(), index, index0, value); return this; }

    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param index the index of the struct buffer
    public int identicalMemoryTypeRequirementsAt(long index) { return identicalMemoryTypeRequirements(this.segment(), index); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirementsAt(long index, int value) { identicalMemoryTypeRequirements(this.segment(), index, value); return this; }

}
