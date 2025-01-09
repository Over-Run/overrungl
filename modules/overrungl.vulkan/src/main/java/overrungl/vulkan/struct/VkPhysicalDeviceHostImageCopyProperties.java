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
/// ### copySrcLayoutCount
/// [VarHandle][#VH_copySrcLayoutCount] - [Getter][#copySrcLayoutCount()] - [Setter][#copySrcLayoutCount(int)]
/// ### pCopySrcLayouts
/// [VarHandle][#VH_pCopySrcLayouts] - [Getter][#pCopySrcLayouts()] - [Setter][#pCopySrcLayouts(java.lang.foreign.MemorySegment)]
/// ### copyDstLayoutCount
/// [VarHandle][#VH_copyDstLayoutCount] - [Getter][#copyDstLayoutCount()] - [Setter][#copyDstLayoutCount(int)]
/// ### pCopyDstLayouts
/// [VarHandle][#VH_pCopyDstLayouts] - [Getter][#pCopyDstLayouts()] - [Setter][#pCopyDstLayouts(java.lang.foreign.MemorySegment)]
/// ### optimalTilingLayoutUUID
/// [Byte offset handle][#MH_optimalTilingLayoutUUID] - [Memory layout][#ML_optimalTilingLayoutUUID] - [Getter][#optimalTilingLayoutUUID(long)] - [Setter][#optimalTilingLayoutUUID(long, java.lang.foreign.MemorySegment)]
/// ### identicalMemoryTypeRequirements
/// [VarHandle][#VH_identicalMemoryTypeRequirements] - [Getter][#identicalMemoryTypeRequirements()] - [Setter][#identicalMemoryTypeRequirements(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceHostImageCopyProperties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t copySrcLayoutCount;
///     VkImageLayout * pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout * pCopyDstLayouts;
///     uint8_t[VK_UUID_SIZE] optimalTilingLayoutUUID;
///     VkBool32 identicalMemoryTypeRequirements;
/// } VkPhysicalDeviceHostImageCopyProperties;
/// ```
public final class VkPhysicalDeviceHostImageCopyProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceHostImageCopyProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `copySrcLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    /// The [VarHandle] of `pCopySrcLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    /// The [VarHandle] of `copyDstLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    /// The [VarHandle] of `pCopyDstLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    /// The byte offset handle of `optimalTilingLayoutUUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_optimalTilingLayoutUUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    /// The memory layout of `optimalTilingLayoutUUID`.
    public static final MemoryLayout ML_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The [VarHandle] of `identicalMemoryTypeRequirements` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceHostImageCopyProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceHostImageCopyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceHostImageCopyProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceHostImageCopyProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceHostImageCopyProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceHostImageCopyProperties`
    public static VkPhysicalDeviceHostImageCopyProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceHostImageCopyProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceHostImageCopyProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceHostImageCopyProperties`
    public static VkPhysicalDeviceHostImageCopyProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceHostImageCopyProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceHostImageCopyProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceHostImageCopyProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `copySrcLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_copySrcLayoutCount(MemorySegment segment, long index) { return (int) VH_copySrcLayoutCount.get(segment, 0L, index); }
    /// {@return `copySrcLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_copySrcLayoutCount(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_copySrcLayoutCount(segment, 0L); }
    /// {@return `copySrcLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int copySrcLayoutCountAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_copySrcLayoutCount(this.segment(), index); }
    /// {@return `copySrcLayoutCount`}
    public @CType("uint32_t") int copySrcLayoutCount() { return VkPhysicalDeviceHostImageCopyProperties.get_copySrcLayoutCount(this.segment()); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_copySrcLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_copySrcLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_copySrcLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copySrcLayoutCount(segment, 0L, value); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copySrcLayoutCount(this.segment(), index, value); return this; }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(@CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copySrcLayoutCount(this.segment(), value); return this; }

    /// {@return `pCopySrcLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopySrcLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCopySrcLayouts.get(segment, 0L, index); }
    /// {@return `pCopySrcLayouts`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopySrcLayouts(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_pCopySrcLayouts(segment, 0L); }
    /// {@return `pCopySrcLayouts` at the given index}
    /// @param index the index
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopySrcLayoutsAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_pCopySrcLayouts(this.segment(), index); }
    /// {@return `pCopySrcLayouts`}
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopySrcLayouts() { return VkPhysicalDeviceHostImageCopyProperties.get_pCopySrcLayouts(this.segment()); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCopySrcLayouts(MemorySegment segment, long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VH_pCopySrcLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCopySrcLayouts(MemorySegment segment, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopySrcLayouts(segment, 0L, value); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayoutsAt(long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopySrcLayouts(this.segment(), index, value); return this; }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(@CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopySrcLayouts(this.segment(), value); return this; }

    /// {@return `copyDstLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_copyDstLayoutCount(MemorySegment segment, long index) { return (int) VH_copyDstLayoutCount.get(segment, 0L, index); }
    /// {@return `copyDstLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_copyDstLayoutCount(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_copyDstLayoutCount(segment, 0L); }
    /// {@return `copyDstLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int copyDstLayoutCountAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_copyDstLayoutCount(this.segment(), index); }
    /// {@return `copyDstLayoutCount`}
    public @CType("uint32_t") int copyDstLayoutCount() { return VkPhysicalDeviceHostImageCopyProperties.get_copyDstLayoutCount(this.segment()); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_copyDstLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_copyDstLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_copyDstLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copyDstLayoutCount(segment, 0L, value); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copyDstLayoutCount(this.segment(), index, value); return this; }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(@CType("uint32_t") int value) { VkPhysicalDeviceHostImageCopyProperties.set_copyDstLayoutCount(this.segment(), value); return this; }

    /// {@return `pCopyDstLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopyDstLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCopyDstLayouts.get(segment, 0L, index); }
    /// {@return `pCopyDstLayouts`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopyDstLayouts(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_pCopyDstLayouts(segment, 0L); }
    /// {@return `pCopyDstLayouts` at the given index}
    /// @param index the index
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopyDstLayoutsAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_pCopyDstLayouts(this.segment(), index); }
    /// {@return `pCopyDstLayouts`}
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopyDstLayouts() { return VkPhysicalDeviceHostImageCopyProperties.get_pCopyDstLayouts(this.segment()); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCopyDstLayouts(MemorySegment segment, long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VH_pCopyDstLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCopyDstLayouts(MemorySegment segment, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopyDstLayouts(segment, 0L, value); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayoutsAt(long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopyDstLayouts(this.segment(), index, value); return this; }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(@CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_pCopyDstLayouts(this.segment(), value); return this; }

    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_optimalTilingLayoutUUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_optimalTilingLayoutUUID.invokeExact(0L, elementIndex), index), ML_optimalTilingLayoutUUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_optimalTilingLayoutUUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceHostImageCopyProperties.get_optimalTilingLayoutUUID(segment, 0L, elementIndex); }
    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment optimalTilingLayoutUUIDAt(long index, long elementIndex) { return VkPhysicalDeviceHostImageCopyProperties.get_optimalTilingLayoutUUID(this.segment(), index, elementIndex); }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment optimalTilingLayoutUUID(long elementIndex) { return VkPhysicalDeviceHostImageCopyProperties.get_optimalTilingLayoutUUID(this.segment(), elementIndex); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_optimalTilingLayoutUUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_optimalTilingLayoutUUID.invokeExact(0L, elementIndex), index), ML_optimalTilingLayoutUUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_optimalTilingLayoutUUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_optimalTilingLayoutUUID(segment, 0L, elementIndex, value); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUIDAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_optimalTilingLayoutUUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceHostImageCopyProperties.set_optimalTilingLayoutUUID(this.segment(), elementIndex, value); return this; }

    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_identicalMemoryTypeRequirements(MemorySegment segment, long index) { return (int) VH_identicalMemoryTypeRequirements.get(segment, 0L, index); }
    /// {@return `identicalMemoryTypeRequirements`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_identicalMemoryTypeRequirements(MemorySegment segment) { return VkPhysicalDeviceHostImageCopyProperties.get_identicalMemoryTypeRequirements(segment, 0L); }
    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param index the index
    public @CType("VkBool32") int identicalMemoryTypeRequirementsAt(long index) { return VkPhysicalDeviceHostImageCopyProperties.get_identicalMemoryTypeRequirements(this.segment(), index); }
    /// {@return `identicalMemoryTypeRequirements`}
    public @CType("VkBool32") int identicalMemoryTypeRequirements() { return VkPhysicalDeviceHostImageCopyProperties.get_identicalMemoryTypeRequirements(this.segment()); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identicalMemoryTypeRequirements(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_identicalMemoryTypeRequirements.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identicalMemoryTypeRequirements(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceHostImageCopyProperties.set_identicalMemoryTypeRequirements(segment, 0L, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirementsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceHostImageCopyProperties.set_identicalMemoryTypeRequirements(this.segment(), index, value); return this; }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(@CType("VkBool32") int value) { VkPhysicalDeviceHostImageCopyProperties.set_identicalMemoryTypeRequirements(this.segment(), value); return this; }

}